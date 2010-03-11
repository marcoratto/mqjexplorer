// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelView.java

package com.kolban.mqjexplorer;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFException;
import com.kolban.mq.PCFUtils;
import com.kolban.mqjexplorer.beans.ChannelDlg;
import com.kolban.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer:
//            MQJExplorerView, QueueManagerModel, ChannelListModel, MQJExplorer, 
//            ChannelListTableModel, TextIconRenderer, Profile

public class ChannelView extends JPanel
    implements MouseListener, MQJExplorerView, ActionListener
{

    public ChannelView()
    {
        queueManagerModel = null;
        showSystemToggleButton = null;
        init();
    }

    public ChannelView(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        queueManagerModel = null;
        showSystemToggleButton = null;
    }

    public ChannelView(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        queueManagerModel = null;
        showSystemToggleButton = null;
    }

    public ChannelView(boolean flag)
    {
        super(flag);
        queueManagerModel = null;
        showSystemToggleButton = null;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        String s = actionevent.getActionCommand();
        if(s.equals("properties"))
        {
            changeSelectedChannel();
            return;
        }
        if(s.equals("pingSelectedChannel"))
        {
            pingSelected();
            return;
        }
        if(s.equals("showSystem"))
        {
            queueManagerModel.getChannelListModel().setShowSystem(showSystemToggleButton.isSelected());
            channelListTableModel.fireTableDataChanged();
            return;
        }
        if(s.equals("deleteSelectedChannel"))
        {
            deleteSelectedChannel();
            return;
        }
        if(s.equals("startSelectedChannel"))
        {
            startSelectedChannel();
            return;
        }
        if(s.equals("stopSelectedChannel"))
        {
            stopSelectedChannel();
            return;
        }
        if(s.equals("refreshSelectedChannel"))
        {
            refreshSelectedChannel();
            return;
        }
        if(s.equals("createSenderChannel"))
        {
            createChannel(1);
            return;
        }
        if(s.equals("createServerChannel"))
        {
            createChannel(2);
            return;
        }
        if(s.equals("createReceiverChannel"))
        {
            createChannel(3);
            return;
        }
        if(s.equals("createRequesterChannel"))
        {
            createChannel(4);
            return;
        }
        if(s.equals("createServerConnectionChannel"))
        {
            createChannel(7);
            return;
        }
        if(s.equals("createClusterSenderChannel"))
        {
            createChannel(9);
            return;
        }
        if(s.equals("createClusterReceiverChannel"))
        {
            createChannel(8);
            return;
        } else
        {
            System.out.println("Unhandled command: " + s);
            return;
        }
    }

    public void addToolBarButtons(JToolBar jtoolbar, Dimension dimension)
    {
        showSystemToggleButton = new JToggleButton(new ImageIcon(getClass().getResource("/icons/systemObjects.gif")));
        showSystemToggleButton.setToolTipText("System Objects");
        showSystemToggleButton.setPreferredSize(dimension);
        showSystemToggleButton.setMaximumSize(dimension);
        showSystemToggleButton.setActionCommand("showSystem");
        showSystemToggleButton.addActionListener(this);
        jtoolbar.add(showSystemToggleButton);
    }

    public void changeSelectedChannel()
    {
        ChannelDlg channeldlg = new ChannelDlg();
        switch(getSelectedChannelType())
        {
        case 1: // '\001'
            channeldlg.changeSender(MQJExplorer.mainFrame, queueManagerModel, getSelectedChannelName());
            break;

        case 2: // '\002'
            channeldlg.changeServer(MQJExplorer.mainFrame, queueManagerModel, getSelectedChannelName());
            break;

        case 3: // '\003'
            channeldlg.changeReceiver(MQJExplorer.mainFrame, queueManagerModel, getSelectedChannelName());
            break;

        case 4: // '\004'
            channeldlg.changeRequester(MQJExplorer.mainFrame, queueManagerModel, getSelectedChannelName());
            break;

        case 7: // '\007'
            channeldlg.changeServerConnection(MQJExplorer.mainFrame, queueManagerModel, getSelectedChannelName());
            break;

        case 9: // '\t'
            channeldlg.changeClusterSender(MQJExplorer.mainFrame, queueManagerModel, getSelectedChannelName());
            break;

        case 8: // '\b'
            channeldlg.changeClusterReceiver(MQJExplorer.mainFrame, queueManagerModel, getSelectedChannelName());
            break;
        }
        refreshSelectedChannel();
    }

    public void createChannel(int i)
    {
        ChannelDlg channeldlg = new ChannelDlg();
        switch(i)
        {
        case 1: // '\001'
            channeldlg.createSenderChannel(MQJExplorer.mainFrame, queueManagerModel);
            break;

        case 2: // '\002'
            channeldlg.createServerChannel(MQJExplorer.mainFrame, queueManagerModel);
            break;

        case 3: // '\003'
            channeldlg.createReceiverChannel(MQJExplorer.mainFrame, queueManagerModel);
            break;

        case 4: // '\004'
            channeldlg.createRequesterChannel(MQJExplorer.mainFrame, queueManagerModel);
            break;

        case 7: // '\007'
            channeldlg.createServerConnectionChannel(MQJExplorer.mainFrame, queueManagerModel);
            break;

        case 9: // '\t'
            channeldlg.createClusterSenderChannel(MQJExplorer.mainFrame, queueManagerModel);
            break;

        case 8: // '\b'
            channeldlg.createClusterReceiverChannel(MQJExplorer.mainFrame, queueManagerModel);
            break;

        case 5: // '\005'
        case 6: // '\006'
        default:
            System.out.println("Channel type not handled!!");
            break;
        }
        String s = channeldlg.getChannelName();
        try
        {
            queueManagerModel.getChannelListModel().refreshChannel(queueManagerModel.getAgent(), s);
        }
        catch(Exception _ex) { }
        channelListTableModel.fireTableDataChanged();
    }

    public void deleteChannel(String s)
        throws MQException
    {
        PCFUtils.deleteChannel(queueManagerModel.getAgent(), s);
        queueManagerModel.getChannelListModel().deleteChannel(s);
    }

    public void deleteSelectedChannel()
    {
        System.out.println("Deleting channel");
        int i = table.getSelectedRow();
        if(i < 0)
            return;
        if(JOptionPane.showConfirmDialog(MQJExplorer.mainFrame, "Really delete this channel?", "Delete Channel", 2, 3) != 0)
            return;
        try
        {
            deleteChannel(getSelectedChannelName());
        }
        catch(MQException mqexception)
        {
            System.out.println("deleteSelectedChannel: " + mqexception.toString());
        }
        channelListTableModel.fireTableDataChanged();
        if(i < table.getRowCount())
            table.setRowSelectionInterval(i, i);
        MQJExplorer.setMessage("Channel Deleted");
    }

    public String getSelectedChannelName()
    {
        int i = table.getSelectedRow();
        if(i < 0)
        {
            return null;
        } else
        {
            String s = queueManagerModel.getChannelListModel().getChannelName(i);
            return s;
        }
    }

    public int getSelectedChannelType()
    {
        int i = table.getSelectedRow();
        if(i < 0)
        {
            return -1;
        } else
        {
            int j = queueManagerModel.getChannelListModel().getChannelType(i);
            return j;
        }
    }

    private void init()
    {
        GridBagLayout gridbaglayout = new GridBagLayout();
        GridBagConstraints gridbagconstraints = new GridBagConstraints();
        setLayout(gridbaglayout);
        channelListTableModel = new ChannelListTableModel();
        table = new JTable(channelListTableModel);
        table.setDefaultRenderer(com.kolban.mqjexplorer.TextIcon.class, new TextIconRenderer());
        tableMetaData = new TableMetaData();
        tableMetaData.setTable(table);
        tableMetaData.synchronizeTable();
        table.setAutoResizeMode(0);
        table.setSelectionMode(0);
        table.setShowGrid(false);
        table.setPreferredScrollableViewportSize(new Dimension(500, 300));
        table.setBackground(Color.white);
        table.addMouseListener(this);
        table.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent keyevent)
            {
                if(keyevent.getKeyCode() == 116)
                    refreshSelectedChannel();
            }

        }
);
        JScrollPane jscrollpane = new JScrollPane(table);
        jscrollpane.getViewport().setBackground(Color.white);
        gridbagconstraints.gridx = 0;
        gridbagconstraints.gridy = 0;
        gridbagconstraints.fill = 1;
        gridbagconstraints.weightx = 1.0D;
        gridbagconstraints.weighty = 1.0D;
        add(jscrollpane, gridbagconstraints);
    }

    public void maybePopup(MouseEvent mouseevent)
    {
        if(!mouseevent.isPopupTrigger())
            return;
        Point point = new Point(mouseevent.getX(), mouseevent.getY());
        int i = table.rowAtPoint(point);
        if(i < 0)
            return;
        JPopupMenu jpopupmenu = new JPopupMenu();
        int j = queueManagerModel.getChannelListModel().getChannelStatus(i);
        JMenuItem jmenuitem = new JMenuItem("Start");
        jmenuitem.setActionCommand("startSelectedChannel");
        jmenuitem.addActionListener(this);
        if(j == 6 || j == 0)
            jmenuitem.setEnabled(true);
        else
            jmenuitem.setEnabled(false);
        jpopupmenu.add(jmenuitem);
        jmenuitem = new JMenuItem("Stop");
        jmenuitem.setActionCommand("stopSelectedChannel");
        jmenuitem.addActionListener(this);
        if(j != 6)
            jmenuitem.setEnabled(true);
        else
            jmenuitem.setEnabled(false);
        jpopupmenu.add(jmenuitem);
        int k = queueManagerModel.getChannelListModel().getChannelType(i);
        switch(k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 9: // '\t'
            JMenuItem jmenuitem1 = new JMenuItem("Ping");
            jmenuitem1.setActionCommand("pingSelectedChannel");
            jmenuitem1.addActionListener(this);
            if(j == 3)
                jmenuitem1.setEnabled(false);
            jpopupmenu.add(jmenuitem1);
            break;
        }
        switch(k)
        {
        case 2: // '\002'
            JMenuItem jmenuitem2 = new JMenuItem("Reset");
            jmenuitem2.setActionCommand("resetSelectedChannel");
            jmenuitem2.addActionListener(this);
            jpopupmenu.add(jmenuitem2);
            jmenuitem2 = new JMenuItem("Resolve");
            jmenuitem2.setActionCommand("resolveSelectedChannel");
            jmenuitem2.addActionListener(this);
            jpopupmenu.add(jmenuitem2);
            // fall through

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        default:
            jpopupmenu.addSeparator();
            JMenuItem jmenuitem3 = new JMenuItem("Delete");
            jmenuitem3.setActionCommand("deleteSelectedChannel");
            jmenuitem3.addActionListener(this);
            jpopupmenu.add(jmenuitem3);
            jmenuitem3 = new JMenuItem("Refresh");
            jmenuitem3.setActionCommand("refreshSelectedChannel");
            jmenuitem3.addActionListener(this);
            jpopupmenu.add(jmenuitem3);
            jpopupmenu.addSeparator();
            jmenuitem3 = new JMenuItem("Properties...");
            jmenuitem3.setActionCommand("properties");
            jmenuitem3.addActionListener(this);
            jpopupmenu.add(jmenuitem3);
            jpopupmenu.show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    public void mouseClicked(MouseEvent mouseevent)
    {
    }

    public void mouseEntered(MouseEvent mouseevent)
    {
    }

    public void mouseExited(MouseEvent mouseevent)
    {
    }

    public void mousePressed(MouseEvent mouseevent)
    {
        Point point = new Point(mouseevent.getX(), mouseevent.getY());
        int i = table.rowAtPoint(point);
        if(i >= 0)
            table.setRowSelectionInterval(i, i);
        maybePopup(mouseevent);
    }

    public void mouseReleased(MouseEvent mouseevent)
    {
        maybePopup(mouseevent);
    }

    void newMethod()
    {
    }

    public void pingSelected()
    {
        String s = getSelectedChannelName();
        try
        {
            PCFUtils.pingChannel(queueManagerModel.getAgent(), s);
            JOptionPane.showMessageDialog(this, "Channel pinged succesfully", "Channel Ping", 1);
        }
        catch(MQException mqexception)
        {
            QueueManagerModel.displayError(mqexception);
        }
    }

    public void refresh()
    {
        try
        {
            table.getSelectedRow();
            queueManagerModel.getChannelListModel().refreshAll(queueManagerModel.getAgent());
            channelListTableModel.fireTableDataChanged();
            MQJExplorer.setMessage("All channels refreshed");
        }
        catch(MQException _ex) { }
    }

    public void refreshSelectedChannel()
    {
        String s = getSelectedChannelName();
        if(s == null)
            return;
        try
        {
            int i = table.getSelectedRow();
            queueManagerModel.getChannelListModel().refreshChannel(queueManagerModel.getAgent(), s);
            channelListTableModel.fireTableRowsUpdated(i, i);
            table.setRowSelectionInterval(i, i);
            MQJExplorer.setMessage("Channel " + s.trim() + " refreshed");
        }
        catch(MQException mqexception)
        {
            mqexception.printStackTrace();
        }
    }

    public void save()
    {
    }

    public void setModel(Object obj)
    {
        QueueManagerModel queuemanagermodel = (QueueManagerModel)obj;
        try
        {
            if(queueManagerModel == null || queuemanagermodel == null || !queueManagerModel.equals(queuemanagermodel))
            {
                queueManagerModel = queuemanagermodel;
                channelListTableModel.setQueueManagerModel(queuemanagermodel);
                if(queueManagerModel != null)
                    queueManagerModel.getChannelListModel().refreshIfNeeded(queueManagerModel.getAgent());
                channelListTableModel.fireTableDataChanged();
            }
        }
        catch(Exception exception)
        {
            System.out.println("setQueueManagerModel: " + exception.toString());
        }
    }

    public void setProfile(Profile profile)
    {
    }

    public void showHideColumns()
    {
        ColumnSelector2 columnselector2 = new ColumnSelector2(MQJExplorer.mainFrame);
        columnselector2.setTable(table, tableMetaData);
        columnselector2.setTitle("Show/hide columns for Channels");
        SwingUtils.setCenter(MQJExplorer.mainFrame, columnselector2);
        columnselector2.setVisible(true);
    }

    public void startSelectedChannel()
    {
        System.out.println("Start channel");
        int i = table.getSelectedRow();
        if(i < 0)
            return;
        try
        {
            PCFUtils.startChannel(queueManagerModel.getAgent(), getSelectedChannelName());
            refreshSelectedChannel();
            MQJExplorer.setMessage("Channel start requested");
        }
        catch(MQException mqexception)
        {
            System.out.println("startSelectedChannel: " + mqexception.toString());
        }
        channelListTableModel.fireTableDataChanged();
        if(i < table.getRowCount())
            table.setRowSelectionInterval(i, i);
    }

    public void stopSelectedChannel()
    {
        System.out.println("Stop channel");
        int i = table.getSelectedRow();
        if(i < 0)
            return;
        try
        {
            try
            {
                PCFUtils.stopChannel(queueManagerModel.getAgent(), getSelectedChannelName(), true);
            }
            catch(PCFException pcfexception)
            {
                switch(((MQException) (pcfexception)).reasonCode)
                {
                default:
                    throw pcfexception;

                case 4064: 
                    break;
                }
            }
            refreshSelectedChannel();
            MQJExplorer.setMessage("Channel Stop Requested");
        }
        catch(MQException mqexception)
        {
            System.out.println("stopSelectedChannel: " + mqexception.toString());
        }
        channelListTableModel.fireTableDataChanged();
        if(i < table.getRowCount())
            table.setRowSelectionInterval(i, i);
    }

    private ChannelListTableModel channelListTableModel;
    private JTable table;
    private TableMetaData tableMetaData;
    private QueueManagerModel queueManagerModel;
    private JToggleButton showSystemToggleButton;
}
