// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EventDlg.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.*;
import com.kolban.mq.PCFEventMessage;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

public class EventDlg extends JDialog
{
    class EventTableModel extends AbstractTableModel
    {

        public int getRowCount()
        {
            return eventVector.size();
        }

        public int getColumnCount()
        {
            return columns.length;
        }

        public Object getValueAt(int i, int j)
        {
            PCFEventMessage pcfeventmessage = (PCFEventMessage)eventVector.elementAt(i);
            switch(j)
            {
            case 0: // '\0'
                SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                return simpledateformat.format(pcfeventmessage.getEventTime().getTime());

            case 1: // '\001'
                return pcfeventmessage.getType();

            case 2: // '\002'
                return pcfeventmessage.getMajorObject();
            }
            return "(" + i + "," + j + ")";
        }

        public String getColumnName(int i)
        {
            return columns[i];
        }

        public void addEventMessage(PCFEventMessage pcfeventmessage)
        {
            eventVector.add(pcfeventmessage);
        }

        public PCFEventMessage getEventMessage(int i)
        {
            return (PCFEventMessage)eventVector.elementAt(i);
        }

        private final String columns[] = {
            "Time", "Type", "Name"
        };
        private Vector eventVector;

        public EventTableModel()
        {
            eventVector = new Vector();
        }
    }

    class WorkerThread extends Thread
    {

        public void run()
        {
            for(finished = false; !finished;)
            {
                processQueue(qmgrEventQueue);
                processQueue(channelEventQueue);
                processQueue(performanceEventQueue);
            }

            System.out.println("Worker thread ended!");
        }

        public void end()
        {
            finished = true;
        }

        public void processQueue(MQQueue mqqueue)
        {
            MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
            mqgetmessageoptions.matchOptions = 0;
            mqgetmessageoptions.waitInterval = 333;
            mqgetmessageoptions.options = 8225;
            boolean flag = false;
            try
            {
                do
                {
                    MQMessage mqmessage = new MQMessage();
                    mqqueue.get(mqmessage, mqgetmessageoptions);
                    System.out.println("Got an event message!");
                    PCFEventMessage pcfeventmessage = new PCFEventMessage(mqmessage);
                    System.out.println("Command: " + pcfeventmessage.getCommand() + ", Reason: " + pcfeventmessage.getType());
                    tableModel.addEventMessage(pcfeventmessage);
                    flag = true;
                } while(true);
            }
            catch(MQException mqexception)
            {
                switch(mqexception.reasonCode)
                {
                default:
                    System.out.println("Exception: " + mqexception.toString());
                    finished = true;
                    break;

                case 2033: 
                    break;
                }
            }
            catch(IOException ioexception)
            {
                System.out.println("Exception: " + ioexception.toString());
                finished = true;
            }
            if(flag)
                SwingUtilities.invokeLater(new Runnable() {

                    public void run()
                    {
                        tableModel.fireTableDataChanged();
                    }

                }
);
        }

        private boolean finished;


        WorkerThread()
        {
            finished = false;
        }
    }

    class IvjEventHandler
        implements ActionListener, PropertyChangeListener, ListSelectionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJButton1())
                connEtoC1();
        }

        public void propertyChange(PropertyChangeEvent propertychangeevent)
        {
            if(propertychangeevent.getSource() == getEventTable() && propertychangeevent.getPropertyName().equals("selectionModel"))
                connPtoP1SetTarget();
        }

        public void valueChanged(ListSelectionEvent listselectionevent)
        {
            if(listselectionevent.getSource() == getselectionModel1())
                connEtoC2(listselectionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public EventDlg()
    {
        workerThread = null;
        ivjDetailPanel = null;
        ivjEventDetails = null;
        ivjEventTable = null;
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjJSeparator1 = null;
        ivjListPanel = null;
        ivjEventHandler = new IvjEventHandler();
        qmgrEventQueue = null;
        performanceEventQueue = null;
        channelEventQueue = null;
        tableModel = null;
        ivjConnPtoP1Aligning = false;
        ivjselectionModel1 = null;
        ivjJSplitPane1 = null;
        initialize();
    }

    public EventDlg(Dialog dialog)
    {
        super(dialog);
        workerThread = null;
        ivjDetailPanel = null;
        ivjEventDetails = null;
        ivjEventTable = null;
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjJSeparator1 = null;
        ivjListPanel = null;
        ivjEventHandler = new IvjEventHandler();
        qmgrEventQueue = null;
        performanceEventQueue = null;
        channelEventQueue = null;
        tableModel = null;
        ivjConnPtoP1Aligning = false;
        ivjselectionModel1 = null;
        ivjJSplitPane1 = null;
    }

    public EventDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        workerThread = null;
        ivjDetailPanel = null;
        ivjEventDetails = null;
        ivjEventTable = null;
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjJSeparator1 = null;
        ivjListPanel = null;
        ivjEventHandler = new IvjEventHandler();
        qmgrEventQueue = null;
        performanceEventQueue = null;
        channelEventQueue = null;
        tableModel = null;
        ivjConnPtoP1Aligning = false;
        ivjselectionModel1 = null;
        ivjJSplitPane1 = null;
    }

    public EventDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        workerThread = null;
        ivjDetailPanel = null;
        ivjEventDetails = null;
        ivjEventTable = null;
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjJSeparator1 = null;
        ivjListPanel = null;
        ivjEventHandler = new IvjEventHandler();
        qmgrEventQueue = null;
        performanceEventQueue = null;
        channelEventQueue = null;
        tableModel = null;
        ivjConnPtoP1Aligning = false;
        ivjselectionModel1 = null;
        ivjJSplitPane1 = null;
    }

    public EventDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        workerThread = null;
        ivjDetailPanel = null;
        ivjEventDetails = null;
        ivjEventTable = null;
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjJSeparator1 = null;
        ivjListPanel = null;
        ivjEventHandler = new IvjEventHandler();
        qmgrEventQueue = null;
        performanceEventQueue = null;
        channelEventQueue = null;
        tableModel = null;
        ivjConnPtoP1Aligning = false;
        ivjselectionModel1 = null;
        ivjJSplitPane1 = null;
    }

    public EventDlg(Frame frame)
    {
        super(frame);
        workerThread = null;
        ivjDetailPanel = null;
        ivjEventDetails = null;
        ivjEventTable = null;
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjJSeparator1 = null;
        ivjListPanel = null;
        ivjEventHandler = new IvjEventHandler();
        qmgrEventQueue = null;
        performanceEventQueue = null;
        channelEventQueue = null;
        tableModel = null;
        ivjConnPtoP1Aligning = false;
        ivjselectionModel1 = null;
        ivjJSplitPane1 = null;
    }

    public EventDlg(Frame frame, String s)
    {
        super(frame, s);
        workerThread = null;
        ivjDetailPanel = null;
        ivjEventDetails = null;
        ivjEventTable = null;
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjJSeparator1 = null;
        ivjListPanel = null;
        ivjEventHandler = new IvjEventHandler();
        qmgrEventQueue = null;
        performanceEventQueue = null;
        channelEventQueue = null;
        tableModel = null;
        ivjConnPtoP1Aligning = false;
        ivjselectionModel1 = null;
        ivjJSplitPane1 = null;
    }

    public EventDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        workerThread = null;
        ivjDetailPanel = null;
        ivjEventDetails = null;
        ivjEventTable = null;
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjJSeparator1 = null;
        ivjListPanel = null;
        ivjEventHandler = new IvjEventHandler();
        qmgrEventQueue = null;
        performanceEventQueue = null;
        channelEventQueue = null;
        tableModel = null;
        ivjConnPtoP1Aligning = false;
        ivjselectionModel1 = null;
        ivjJSplitPane1 = null;
    }

    public EventDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        workerThread = null;
        ivjDetailPanel = null;
        ivjEventDetails = null;
        ivjEventTable = null;
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjJSeparator1 = null;
        ivjListPanel = null;
        ivjEventHandler = new IvjEventHandler();
        qmgrEventQueue = null;
        performanceEventQueue = null;
        channelEventQueue = null;
        tableModel = null;
        ivjConnPtoP1Aligning = false;
        ivjselectionModel1 = null;
        ivjJSplitPane1 = null;
    }

    public void closeDlg()
    {
        endWorkerThread();
        if(qmgrEventQueue != null)
            try
            {
                qmgrEventQueue.close();
            }
            catch(Exception _ex) { }
        if(channelEventQueue != null)
            try
            {
                channelEventQueue.close();
            }
            catch(Exception _ex) { }
        if(performanceEventQueue != null)
            try
            {
                performanceEventQueue.close();
            }
            catch(Exception _ex) { }
        dispose();
    }

    private void connEtoC1()
    {
        try
        {
            closeDlg();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(ListSelectionEvent listselectionevent)
    {
        try
        {
            selectionChanged(listselectionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connPtoP1SetSource()
    {
        try
        {
            if(!ivjConnPtoP1Aligning)
            {
                ivjConnPtoP1Aligning = true;
                if(getselectionModel1() != null)
                    getEventTable().setSelectionModel(getselectionModel1());
                ivjConnPtoP1Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP1Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP1SetTarget()
    {
        try
        {
            if(!ivjConnPtoP1Aligning)
            {
                ivjConnPtoP1Aligning = true;
                setselectionModel1(getEventTable().getSelectionModel());
                ivjConnPtoP1Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP1Aligning = false;
            handleException(throwable);
        }
    }

    private void endWorkerThread()
    {
        if(workerThread == null)
            return;
        try
        {
            workerThread.end();
            workerThread.join();
        }
        catch(Exception _ex) { }
        workerThread = null;
    }

    private JPanel getDetailPanel()
    {
        if(ivjDetailPanel == null)
            try
            {
                ivjDetailPanel = new JPanel();
                ivjDetailPanel.setName("DetailPanel");
                ivjDetailPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getDetailPanel().add(getJScrollPane1(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDetailPanel;
    }

    private JTextArea getEventDetails()
    {
        if(ivjEventDetails == null)
            try
            {
                ivjEventDetails = new JTextArea();
                ivjEventDetails.setName("EventDetails");
                ivjEventDetails.setRows(10);
                ivjEventDetails.setBounds(0, 0, 160, 120);
                ivjEventDetails.setMargin(new Insets(4, 4, 4, 4));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEventDetails;
    }

    private JTable getEventTable()
    {
        if(ivjEventTable == null)
            try
            {
                ivjEventTable = new JTable();
                ivjEventTable.setName("EventTable");
                getJScrollPane2().setColumnHeaderView(ivjEventTable.getTableHeader());
                getJScrollPane2().getViewport().setBackingStoreEnabled(true);
                ivjEventTable.setBounds(0, 0, 200, 200);
                ivjEventTable.setSelectionMode(0);
                tableModel = new EventTableModel();
                ivjEventTable.setModel(tableModel);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEventTable;
    }

    private JPanel getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new JPanel();
                ivjFooter.setName("Footer");
                ivjFooter.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getFooter().add(getJSeparator1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getFooter().add(getJPanel1(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
    }

    private JButton getJButton1()
    {
        if(ivjJButton1 == null)
            try
            {
                ivjJButton1 = new JButton();
                ivjJButton1.setName("JButton1");
                ivjJButton1.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton1;
    }

    private JPanel getJDialogContentPane()
    {
        if(ivjJDialogContentPane == null)
            try
            {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSplitPane1(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(getJPanel1FlowLayout());
                getJPanel1().add(getJButton1(), getJButton1().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private FlowLayout getJPanel1FlowLayout()
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

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                getJScrollPane1().setViewportView(getEventDetails());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
    }

    private JScrollPane getJScrollPane2()
    {
        if(ivjJScrollPane2 == null)
            try
            {
                ivjJScrollPane2 = new JScrollPane();
                ivjJScrollPane2.setName("JScrollPane2");
                ivjJScrollPane2.setVerticalScrollBarPolicy(22);
                ivjJScrollPane2.setHorizontalScrollBarPolicy(32);
                getJScrollPane2().setViewportView(getEventTable());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane2;
    }

    private JSeparator getJSeparator1()
    {
        if(ivjJSeparator1 == null)
            try
            {
                ivjJSeparator1 = new JSeparator();
                ivjJSeparator1.setName("JSeparator1");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSeparator1;
    }

    private JSplitPane getJSplitPane1()
    {
        if(ivjJSplitPane1 == null)
            try
            {
                ivjJSplitPane1 = new JSplitPane(0);
                ivjJSplitPane1.setName("JSplitPane1");
                ivjJSplitPane1.setDividerLocation(200);
                getJSplitPane1().add(getListPanel(), "top");
                getJSplitPane1().add(getDetailPanel(), "bottom");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSplitPane1;
    }

    private JPanel getListPanel()
    {
        if(ivjListPanel == null)
            try
            {
                ivjListPanel = new JPanel();
                ivjListPanel.setName("ListPanel");
                ivjListPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getListPanel().add(getJScrollPane2(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjListPanel;
    }

    private ListSelectionModel getselectionModel1()
    {
        return ivjselectionModel1;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getJButton1().addActionListener(ivjEventHandler);
        getEventTable().addPropertyChangeListener(ivjEventHandler);
        connPtoP1SetTarget();
    }

    private void initialize()
    {
        try
        {
            setName("EventDlg");
            setDefaultCloseOperation(2);
            setSize(537, 384);
            setTitle("Queue Manager Events");
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
            EventDlg eventdlg = new EventDlg();
            eventdlg.setModal(true);
            eventdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            eventdlg.show();
            Insets insets = eventdlg.getInsets();
            eventdlg.setSize(eventdlg.getWidth() + insets.left + insets.right, eventdlg.getHeight() + insets.top + insets.bottom);
            eventdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void selectionChanged(ListSelectionEvent listselectionevent)
    {
        if(listselectionevent.getValueIsAdjusting())
        {
            return;
        } else
        {
            int i = getEventTable().getSelectedRow();
            System.out.println("Selection changed ... " + i);
            getEventDetails().setText(tableModel.getEventMessage(i).toString());
            return;
        }
    }

    public void setQueueManager(MQQueueManager mqqueuemanager)
    {
        endWorkerThread();
        queueManager = mqqueuemanager;
        try
        {
            if(qmgrEventQueue != null)
                qmgrEventQueue.close();
            qmgrEventQueue = queueManager.accessQueue("SYSTEM.ADMIN.QMGR.EVENT", 8201);
            if(channelEventQueue != null)
                channelEventQueue.close();
            channelEventQueue = queueManager.accessQueue("SYSTEM.ADMIN.CHANNEL.EVENT", 8201);
            if(performanceEventQueue != null)
                performanceEventQueue.close();
            performanceEventQueue = queueManager.accessQueue("SYSTEM.ADMIN.PERFM.EVENT", 8201);
            workerThread = new WorkerThread();
            workerThread.start();
        }
        catch(MQException mqexception)
        {
            System.out.println("Exception: " + mqexception.toString());
        }
    }

    private void setselectionModel1(ListSelectionModel listselectionmodel)
    {
        if(ivjselectionModel1 != listselectionmodel)
            try
            {
                if(ivjselectionModel1 != null)
                    ivjselectionModel1.removeListSelectionListener(ivjEventHandler);
                ivjselectionModel1 = listselectionmodel;
                if(ivjselectionModel1 != null)
                    ivjselectionModel1.addListSelectionListener(ivjEventHandler);
                connPtoP1SetSource();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
    }

    private WorkerThread workerThread;
    private JPanel ivjDetailPanel;
    private JTextArea ivjEventDetails;
    private JTable ivjEventTable;
    private JPanel ivjFooter;
    private JButton ivjJButton1;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JScrollPane ivjJScrollPane1;
    private JScrollPane ivjJScrollPane2;
    private JSeparator ivjJSeparator1;
    private JPanel ivjListPanel;
    private MQQueueManager queueManager;
    IvjEventHandler ivjEventHandler;
    private MQQueue qmgrEventQueue;
    private MQQueue performanceEventQueue;
    private MQQueue channelEventQueue;
    private EventTableModel tableModel;
    private boolean ivjConnPtoP1Aligning;
    private ListSelectionModel ivjselectionModel1;
    private JSplitPane ivjJSplitPane1;










}
