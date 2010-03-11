// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MessageListDlg.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.*;
import com.kolban.mqjexplorer.*;
import com.kolban.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer.beans:
//            SaveIndividualMessage, BrowseDlg

public class MessageListDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener, ComponentListener, MouseListener, WindowListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getClose())
                connEtoC1();
            if(actionevent.getSource() == getColumns())
                connEtoC2();
            if(actionevent.getSource() == getRefresh())
                connEtoM1(actionevent);
            if(actionevent.getSource() == getProperties())
                connEtoC3();
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC4(actionevent);
            if(actionevent.getSource() == getSaveToFile())
                connEtoC5();
            if(actionevent.getSource() == getJMenuItem2())
                connEtoC10(actionevent);
        }

        public void componentHidden(ComponentEvent componentevent)
        {
        }

        public void componentMoved(ComponentEvent componentevent)
        {
        }

        public void componentResized(ComponentEvent componentevent)
        {
            if(componentevent.getSource() == MessageListDlg.this)
                connEtoC9(componentevent);
        }

        public void componentShown(ComponentEvent componentevent)
        {
        }

        public void mouseClicked(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getMessageListTable())
                connEtoC7(mouseevent);
        }

        public void mouseEntered(MouseEvent mouseevent)
        {
        }

        public void mouseExited(MouseEvent mouseevent)
        {
        }

        public void mousePressed(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getMessageListTable())
                connEtoC6(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getMessageListTable())
                connEtoC8(mouseevent);
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
        }

        public void windowDeactivated(WindowEvent windowevent)
        {
        }

        public void windowDeiconified(WindowEvent windowevent)
        {
        }

        public void windowIconified(WindowEvent windowevent)
        {
        }

        public void windowOpened(WindowEvent windowevent)
        {
            if(windowevent.getSource() == MessageListDlg.this)
                connEtoM2(windowevent);
        }

        IvjEventHandler()
        {
        }
    }


    public MessageListDlg()
    {
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
        initialize();
    }

    public MessageListDlg(Dialog dialog)
    {
        super(dialog);
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
    }

    public MessageListDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
    }

    public MessageListDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
    }

    public MessageListDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
    }

    public MessageListDlg(Frame frame)
    {
        super(frame);
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
        initialize();
    }

    public MessageListDlg(Frame frame, MQQueueManager mqqueuemanager, String s)
    {
        super(frame);
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
        qMgr = mqqueuemanager;
        qName = s;
        initialize();
    }

    public MessageListDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
    }

    public MessageListDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
    }

    public MessageListDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjClose = null;
        ivjColumns = null;
        ivjJDialogContentPane = null;
        ivjProperties = null;
        ivjRefresh = null;
        ivjEventHandler = new IvjEventHandler();
        ivjMessageListTable = null;
        ivjMessageListTableModel = null;
        qName = null;
        qMgr = null;
        ivjTitleLabel = null;
        ivjJMenuItem1 = null;
        ivjMessagePopup = null;
        ivjSaveToFile = null;
        profile = null;
        ivjScrollPane = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJMenuItem2 = null;
    }

    public void close_ActionEvents()
    {
        profile.getMessageListTableMetaData().setWidthsFromTable();
        profile.messageListSettings.windowSize = getSize();
        dispose();
    }

    public void columns_ActionEvents()
    {
        ColumnSelector2 columnselector2 = new ColumnSelector2(this);
        columnselector2.setTable(getMessageListTable(), profile.getMessageListTableMetaData());
        columnselector2.setTitle("Show/Hide columns for messages");
        SwingUtils.setCenter(this, columnselector2);
        columnselector2.setVisible(true);
    }

    private void connEtoC1()
    {
        try
        {
            close_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC10(ActionEvent actionevent)
    {
        try
        {
            removeSelectedMessage();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2()
    {
        try
        {
            columns_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3()
    {
        try
        {
            showProperties();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(ActionEvent actionevent)
    {
        try
        {
            showProperties();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5()
    {
        try
        {
            saveToFile_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(MouseEvent mouseevent)
    {
        try
        {
            messageListTable_MousePressed(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC7(MouseEvent mouseevent)
    {
        try
        {
            messageListTable_MousePressed(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC8(MouseEvent mouseevent)
    {
        try
        {
            messageListTable_MousePressed(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC9(ComponentEvent componentevent)
    {
        try
        {
            handleResized(componentevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM1(ActionEvent actionevent)
    {
        try
        {
            getMessageListTableModel().refreshAll(getQMgr(), getQName());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public MQQueueManager connEtoM1_Qmgr()
    {
        return qMgr;
    }

    public MQQueueManager connEtoM1_Qmgr1()
    {
        return getQMgr();
    }

    private void connEtoM2(WindowEvent windowevent)
    {
        try
        {
            getMessageListTableModel().refreshAll(getQMgr(), getQName());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connPtoP1SetTarget()
    {
        try
        {
            getMessageListTable().setModel(getMessageListTableModel());
            getMessageListTable().createDefaultColumnsFromModel();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JButton getClose()
    {
        if(ivjClose == null)
            try
            {
                ivjClose = new JButton();
                ivjClose.setName("Close");
                ivjClose.setToolTipText("Close this dialog");
                ivjClose.setMnemonic('C');
                ivjClose.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClose;
    }

    private JButton getColumns()
    {
        if(ivjColumns == null)
            try
            {
                ivjColumns = new JButton();
                ivjColumns.setName("Columns");
                ivjColumns.setSelected(false);
                ivjColumns.setToolTipText("Alter the visible columns in the dialog");
                ivjColumns.setMnemonic('o');
                ivjColumns.setText("Columns");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjColumns;
    }

    private JPanel getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new JPanel();
                ivjFooter.setName("Footer");
                ivjFooter.setLayout(getFooterFlowLayout());
                getFooter().add(getRefresh(), getRefresh().getName());
                getFooter().add(getProperties(), getProperties().getName());
                getFooter().add(getColumns(), getColumns().getName());
                getFooter().add(getClose(), getClose().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
    }

    private FlowLayout getFooterFlowLayout()
    {
        FlowLayout flowlayout = null;
        try
        {
            flowlayout = new FlowLayout();
            flowlayout.setAlignment(2);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return flowlayout;
    }

    private JPanel getJDialogContentPane()
    {
        if(ivjJDialogContentPane == null)
            try
            {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setLayout(new GridBagLayout());
                ivjJDialogContentPane.setMinimumSize(new Dimension(359, 300));
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getTitleLabel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getScrollPane(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JMenuItem getJMenuItem1()
    {
        if(ivjJMenuItem1 == null)
            try
            {
                ivjJMenuItem1 = new JMenuItem();
                ivjJMenuItem1.setName("JMenuItem1");
                ivjJMenuItem1.setIcon(new ImageIcon(this.getClass().getResource("/icons/Quetion16.gif")));
                ivjJMenuItem1.setMnemonic('P');
                ivjJMenuItem1.setText("Properties...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem1;
    }

    private JMenuItem getJMenuItem2()
    {
        if(ivjJMenuItem2 == null)
            try
            {
                ivjJMenuItem2 = new JMenuItem();
                ivjJMenuItem2.setName("JMenuItem2");
                ivjJMenuItem2.setIcon(new ImageIcon(getClass().getResource("/icons/Delete16.gif")));
                ivjJMenuItem2.setMnemonic('D');
                ivjJMenuItem2.setText("Delete");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem2;
    }

    private JTable getMessageListTable()
    {
        if(ivjMessageListTable == null)
            try
            {
                ivjMessageListTable = new JTable();
                ivjMessageListTable.setName("MessageListTable");
                getScrollPane().setColumnHeaderView(ivjMessageListTable.getTableHeader());
                getScrollPane().getViewport().setBackingStoreEnabled(true);
                ivjMessageListTable.setAutoResizeMode(0);
                ivjMessageListTable.setBounds(0, 0, 200, 200);
                ivjMessageListTable.setShowHorizontalLines(false);
                ivjMessageListTable.setPreferredScrollableViewportSize(new Dimension(500, 300));
                ivjMessageListTable.setDefaultRenderer(com.kolban.mqjexplorer.TextIcon.class, new TextIconRenderer());
                ivjMessageListTable.setSelectionMode(0);
                ivjMessageListTable.addMouseListener(new MouseAdapter() {

                    public void mouseClicked(MouseEvent mouseevent)
                    {
                        if(mouseevent.getClickCount() == 2)
                            showProperties();
                    }

                }
);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageListTable;
    }

    private MessageListTableModel getMessageListTableModel()
    {
        if(ivjMessageListTableModel == null)
            try
            {
                ivjMessageListTableModel = new MessageListTableModel();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageListTableModel;
    }

    private JPopupMenu getMessagePopup()
    {
        if(ivjMessagePopup == null)
            try
            {
                ivjMessagePopup = new JPopupMenu();
                ivjMessagePopup.setName("MessagePopup");
                ivjMessagePopup.add(getJMenuItem1());
                ivjMessagePopup.add(getSaveToFile());
                ivjMessagePopup.add(getJMenuItem2());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessagePopup;
    }

    private JButton getProperties()
    {
        if(ivjProperties == null)
            try
            {
                ivjProperties = new JButton();
                ivjProperties.setName("Properties");
                ivjProperties.setToolTipText("Display the properties of an individual message");
                ivjProperties.setMnemonic('P');
                ivjProperties.setText("Properties");
                ivjProperties.setEnabled(true);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjProperties;
    }

    public MQQueueManager getQMgr()
    {
        return qMgr;
    }

    public String getQName()
    {
        return qName;
    }

    private JButton getRefresh()
    {
        if(ivjRefresh == null)
            try
            {
                ivjRefresh = new JButton();
                ivjRefresh.setName("Refresh");
                ivjRefresh.setToolTipText("Refresh the messages from the queue");
                ivjRefresh.setMnemonic('R');
                ivjRefresh.setText("Refresh");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRefresh;
    }

    private JMenuItem getSaveToFile()
    {
        if(ivjSaveToFile == null)
            try
            {
                ivjSaveToFile = new JMenuItem();
                ivjSaveToFile.setName("SaveToFile");
                ivjSaveToFile.setIcon(new ImageIcon(getClass().getResource("/icons/Save16.gif")));
                ivjSaveToFile.setSelectedIcon(new ImageIcon(getClass().getResource("/icons/Save16.gif")));
                ivjSaveToFile.setMnemonic('S');
                ivjSaveToFile.setText("Save To File...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSaveToFile;
    }

    private JScrollPane getScrollPane()
    {
        if(ivjScrollPane == null)
            try
            {
                ivjScrollPane = new JScrollPane();
                ivjScrollPane.setName("ScrollPane");
                ivjScrollPane.setVerticalScrollBarPolicy(22);
                ivjScrollPane.setHorizontalScrollBarPolicy(32);
                ivjScrollPane.setBackground(SystemColor.window);
                getScrollPane().setViewportView(getMessageListTable());
                ivjScrollPane.getViewport().setBackground(Color.white);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjScrollPane;
    }

    private JLabel getTitleLabel()
    {
        if(ivjTitleLabel == null)
            try
            {
                ivjTitleLabel = new JLabel();
                ivjTitleLabel.setName("TitleLabel");
                ivjTitleLabel.setText("Queue:");
                ivjTitleLabel.setText("Queue: " + getQName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTitleLabel;
    }

    private void handleException(Throwable throwable)
    {
    }

    public void handleResized(ComponentEvent componentevent)
    {
        SwingUtils.constrainResize(componentevent);
    }

    private void initConnections()
        throws Exception
    {
        getClose().addActionListener(ivjEventHandler);
        getColumns().addActionListener(ivjEventHandler);
        getRefresh().addActionListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
        getProperties().addActionListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        getSaveToFile().addActionListener(ivjEventHandler);
        getMessageListTable().addMouseListener(ivjEventHandler);
        addComponentListener(ivjEventHandler);
        getJMenuItem2().addActionListener(ivjEventHandler);
        connPtoP1SetTarget();
    }

    private void initialize()
    {
        try
        {
            getRootPane().setDefaultButton(getProperties());
            setName("MessageListDlg");
            setDefaultCloseOperation(2);
            setTitle("Message Browser");
            setSize(577, 396);
            setResizable(true);
            setContentPane(getJDialogContentPane());
            initConnections();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public static void main(String args[])
    {
        try
        {
            MessageListDlg messagelistdlg = new MessageListDlg();
            messagelistdlg.setModal(true);
            messagelistdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            messagelistdlg.show();
            Insets insets = messagelistdlg.getInsets();
            messagelistdlg.setSize(messagelistdlg.getWidth() + insets.left + insets.right, messagelistdlg.getHeight() + insets.top + insets.bottom);
            messagelistdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void maybePopup(MouseEvent mouseevent)
    {
        if(!mouseevent.isPopupTrigger())
            return;
        Point point = new Point(mouseevent.getX(), mouseevent.getY());
        int i = getMessageListTable().rowAtPoint(point);
        if(i < 0)
        {
            return;
        } else
        {
            getMessageListTable().setRowSelectionInterval(i, i);
            getMessagePopup().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    public void messageListTable_MousePressed(MouseEvent mouseevent)
    {
        maybePopup(mouseevent);
    }

    public void properties_ActionEvents()
    {
    }

    private void removeSelectedMessage()
    {
        int i = getMessageListTable().getSelectedRow();
        if(i < 0)
            return;
        MQQueue mqqueue = null;
        MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
        try
        {
            mqqueue = qMgr.accessQueue(qName, 8201);
            mqgetmessageoptions.options = 32;
            for(int j = 0; j <= i; j++)
            {
                MQMessage mqmessage = new MQMessage();
                mqqueue.get(mqmessage, mqgetmessageoptions);
            }

            mqgetmessageoptions.options = 256;
            MQMessage mqmessage1 = new MQMessage();
            mqqueue.get(mqmessage1, mqgetmessageoptions);
            getMessageListTableModel().removeMessage(i);
        }
        catch(MQException mqexception)
        {
            System.out.println("Exception: " + mqexception.toString());
        }
        if(mqqueue != null)
            try
            {
                mqqueue.close();
            }
            catch(MQException _ex) { }
    }

    public void saveToFile_ActionEvents()
    {
        int i = getMessageListTable().getSelectedRow();
        if(i < 0)
            return;
        MQMessage mqmessage = getMessageListTableModel().getMessage(i);
        if(mqmessage == null)
        {
            return;
        } else
        {
            SaveIndividualMessage saveindividualmessage = new SaveIndividualMessage(this);
            saveindividualmessage.setMessage(mqmessage);
            saveindividualmessage.setQName(qName);
            saveindividualmessage.setQMgr(qMgr);
            saveindividualmessage.pack();
            SwingUtils.setCenter(this, saveindividualmessage);
            saveindividualmessage.setVisible(true);
            return;
        }
    }

    public void setProfile(Profile profile1)
    {
        profile = profile1;
        setSize(profile.messageListSettings.windowSize);
        profile.getMessageListTableMetaData().setTable(getMessageListTable());
        profile.getMessageListTableMetaData().synchronizeTable();
    }

    private void setQMgr(MQQueueManager mqqueuemanager)
    {
        qMgr = mqqueuemanager;
    }

    public void setQName(String s)
    {
        qName = s;
    }

    private void showProperties()
    {
        int i = getMessageListTable().getSelectedRow();
        if(i < 0)
        {
            return;
        } else
        {
            showProperties(i);
            return;
        }
    }

    private void showProperties(int i)
    {
        MQMessage mqmessage = getMessageListTableModel().getMessage(i);
        if(mqmessage == null)
        {
            return;
        } else
        {
            BrowseDlg browsedlg = new BrowseDlg(this);
            browsedlg.pack();
            browsedlg.setBrowseSettings(profile.browseSettings);
            browsedlg.setMessage(mqmessage, qMgr, qName, i);
            SwingUtils.setCenter(this, browsedlg);
            browsedlg.setVisible(true);
            return;
        }
    }

    private JButton ivjClose;
    private JButton ivjColumns;
    private JPanel ivjJDialogContentPane;
    private JButton ivjProperties;
    private JButton ivjRefresh;
    IvjEventHandler ivjEventHandler;
    private JTable ivjMessageListTable;
    private MessageListTableModel ivjMessageListTableModel;
    private String qName;
    private MQQueueManager qMgr;
    private JLabel ivjTitleLabel;
    private JMenuItem ivjJMenuItem1;
    private JPopupMenu ivjMessagePopup;
    private JMenuItem ivjSaveToFile;
    private Profile profile;
    private JScrollPane ivjScrollPane;
    private JPanel ivjFooter;
    private FlowLayout ivjFooterFlowLayout;
    private JMenuItem ivjJMenuItem2;





















}
