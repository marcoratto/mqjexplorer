// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcessView.java

package com.kolban.mqjexplorer;

import com.ibm.mq.MQException;
import com.kolban.mq.PCFUtils;
import com.kolban.mqjexplorer.beans.ProcessDlg;
import com.kolban.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer:
//            MQJExplorerView, MQJExplorer, QueueManagerModel, ProcessListModel, 
//            ProcessListTableModel, TextIconRenderer, Profile

public class ProcessView extends JPanel
    implements MouseListener, MQJExplorerView, ActionListener
{

    public ProcessView()
    {
        queueManagerModel = null;
        showSystemToggleButton = null;
        init();
    }

    public ProcessView(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        queueManagerModel = null;
        showSystemToggleButton = null;
    }

    public ProcessView(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        queueManagerModel = null;
        showSystemToggleButton = null;
    }

    public ProcessView(boolean flag)
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
            ProcessDlg processdlg = new ProcessDlg();
            processdlg.change(MQJExplorer.mainFrame, queueManagerModel, getSelectedProcessName());
            refreshSelectedProcess();
            return;
        }
        if(s.equals("createProcess"))
        {
            createProcess();
            return;
        }
        if(s.equals("showSystem"))
        {
            queueManagerModel.getProcessListModel().setShowSystem(showSystemToggleButton.isSelected());
            processListTableModel.fireTableDataChanged();
            return;
        }
        if(s.equals("deleteSelectedProcess"))
        {
            deleteSelectedProcess();
            return;
        } else
        {
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

    public void createProcess()
    {
        ProcessDlg processdlg = new ProcessDlg();
        processdlg.create(MQJExplorer.mainFrame, queueManagerModel);
        String s = processdlg.getProcessName();
        try
        {
            queueManagerModel.getProcessListModel().refreshProcess(queueManagerModel.getAgent(), s);
        }
        catch(Exception _ex) { }
        processListTableModel.fireTableDataChanged();
    }

    public void deleteProcess(String s)
        throws MQException
    {
        PCFUtils.deleteProcess(queueManagerModel.getAgent(), s);
        queueManagerModel.getProcessListModel().deleteProcess(s);
    }

    public void deleteSelectedProcess()
    {
        System.out.println("Deleting process");
        int i = table.getSelectedRow();
        if(i < 0)
            return;
        try
        {
            deleteProcess(getSelectedProcessName());
        }
        catch(MQException mqexception)
        {
            System.out.println("deleteSelectedProcess: " + mqexception.toString());
        }
        processListTableModel.fireTableDataChanged();
        if(i < table.getRowCount())
            table.setRowSelectionInterval(i, i);
    }

    public String getSelectedProcessName()
    {
        int i = table.getSelectedRow();
        if(i < 0)
        {
            return null;
        } else
        {
            String s = queueManagerModel.getProcessListModel().getProcessName(i);
            return s;
        }
    }

    private void init()
    {
        GridBagLayout gridbaglayout = new GridBagLayout();
        GridBagConstraints gridbagconstraints = new GridBagConstraints();
        setLayout(gridbaglayout);
        processListTableModel = new ProcessListTableModel();
        table = new JTable(processListTableModel);
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
        {
            return;
        } else
        {
            JPopupMenu jpopupmenu = new JPopupMenu();
            JMenuItem jmenuitem = new JMenuItem("Delete");
            jmenuitem.setActionCommand("deleteSelectedProcess");
            jmenuitem.addActionListener(this);
            jpopupmenu.add(jmenuitem);
            jmenuitem = new JMenuItem("Refresh");
            jmenuitem.setActionCommand("refresh");
            jmenuitem.addActionListener(this);
            jpopupmenu.add(jmenuitem);
            jpopupmenu.addSeparator();
            jmenuitem = new JMenuItem("Properties...");
            jmenuitem.setActionCommand("properties");
            jmenuitem.addActionListener(this);
            jpopupmenu.add(jmenuitem);
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

    public void refresh()
    {
        try
        {
            table.getSelectedRow();
            queueManagerModel.getProcessListModel().refreshAll(queueManagerModel.getAgent());
            processListTableModel.fireTableDataChanged();
        }
        catch(MQException _ex) { }
    }

    public void refreshSelectedProcess()
    {
        String s = getSelectedProcessName();
        if(s == null)
            return;
        try
        {
            int i = table.getSelectedRow();
            queueManagerModel.getProcessListModel().refreshProcess(queueManagerModel.getAgent(), s);
            processListTableModel.fireTableRowsUpdated(i, i);
            table.setRowSelectionInterval(i, i);
        }
        catch(MQException mqexception)
        {
            mqexception.printStackTrace();
        }
    }

    public void setModel(Object obj)
    {
        QueueManagerModel queuemanagermodel = (QueueManagerModel)obj;
        try
        {
            if(queueManagerModel == null || queuemanagermodel == null || !queueManagerModel.equals(queuemanagermodel))
            {
                queueManagerModel = queuemanagermodel;
                processListTableModel.setQueueManagerModel(queuemanagermodel);
                if(queueManagerModel != null)
                    queueManagerModel.getProcessListModel().refreshIfNeeded(queueManagerModel.getAgent());
                processListTableModel.fireTableDataChanged();
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
        columnselector2.setTitle("Show/hide columns for Processes");
        columnselector2.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, columnselector2);
        columnselector2.setVisible(true);
    }

    ProcessListTableModel processListTableModel;
    private JTable table;
    private TableMetaData tableMetaData;
    private QueueManagerModel queueManagerModel;
    private JToggleButton showSystemToggleButton;
}
