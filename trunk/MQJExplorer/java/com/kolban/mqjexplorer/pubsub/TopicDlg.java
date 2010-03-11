// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TopicDlg.java

package com.kolban.mqjexplorer.pubsub;

import com.ibm.mq.MQQueueManager;
import com.kolban.mq.MQRFH;
import com.kolban.mqjexplorer.Profile;
import com.kolban.swing.*;
import com.kolban.swing.table.*;
import com.kolban.swing.table.TableSorter;
import com.kolban.utils.StringUtils;
import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;
import javax.swing.*;
import javax.swing.table.*;

// Referenced classes of package com.kolban.mqjexplorer.pubsub:
//            PubSubTopicInfo, MQPubSub, PubSubError

public class TopicDlg extends JDialog
{
    class RegOptionsCellRenderer extends DefaultTableCellRenderer
    {

        protected void setValue(Object obj)
        {
            super.setValue(obj);
            String s = "";
            if(obj instanceof Integer)
            {
                int i = ((Integer)obj).intValue();
                if((i & 2) == 2)
                    s = s + "Anon ";
                if((i & 1) == 1)
                    s = s + "CorrelAsId ";
                if((i & 4) == 4)
                    s = s + "Local ";
                if((i & 0x10) == 16)
                    s = s + "NewPubsOnly ";
                if((i & 0x20) == 32)
                    s = s + "PubOnReqOnly ";
                if((i & 0x80) == 128)
                    s = s + "InclStreamName ";
                if((i & 0x100) == 256)
                    s = s + "InformIfRet ";
                if(i == 0)
                    s = "None";
            }
            setToolTipText(s);
        }

        RegOptionsCellRenderer()
        {
        }
    }

    class RegCorrelIdCellRenderer extends DefaultTableCellRenderer
    {

        protected void setValue(Object obj)
        {
            super.setValue(obj);
            if(obj == null)
            {
                setToolTipText(null);
                return;
            }
            String s = (String)obj;
            if(s.equals("N/A"))
            {
                setToolTipText(null);
                return;
            }
            byte abyte0[] = StringUtils.stringToByteArray(s);
            String s1 = new String(abyte0);
            StringBuffer stringbuffer = new StringBuffer(s1);
            for(int i = 0; i < stringbuffer.length(); i++)
                if(Character.isISOControl(stringbuffer.charAt(i)))
                    stringbuffer.setCharAt(i, '.');

            setToolTipText("\"" + stringbuffer.toString() + "\"");
        }

        RegCorrelIdCellRenderer()
        {
        }
    }

    class TopicTableModel extends AbstractTableModel
    {

        public int getRowCount()
        {
            return pubSubTopicInfo.getSubscriberCount();
        }

        public int getColumnCount()
        {
            return columnNames.length;
        }

        public Class getColumnClass(int i)
        {
            return columnClasses[i];
        }

        public Object getValueAt(int i, int j)
        {
            String s = getColumnName(j);
            if(s.equals("Queue Name"))
                return pubSubTopicInfo.getRegistrationQName(i);
            if(s.equals("QMgr Name"))
                return pubSubTopicInfo.getRegistrationQMgrName(i);
            if(s.equals("Userid"))
                return pubSubTopicInfo.getRegistrationUserid(i);
            if(s.equals("Options"))
                return pubSubTopicInfo.getRegistrationOptions(i);
            if(s.equals("Time"))
                return pubSubTopicInfo.getRegistrationTime(i);
            if(s.equals("CorrelId"))
                return pubSubTopicInfo.getRegistrationCorrelId(i);
            else
                return null;
        }

        public boolean isCellEditable(int i, int j)
        {
            return false;
        }

        public String getColumnName(int i)
        {
            return columnNames[i];
        }

        private final String columnNames[] = {
            "Queue Name", "QMgr Name", "Userid", "Options", "Time", "CorrelId"
        };
        final Class columnClasses[];

        TopicTableModel()
        {
            columnClasses = (new Class[] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            });
        }
    }

    public class TopicDlgSortableTableModel extends TopicTableModel
        implements SortableTableModel
    {

        public int[] getIndexes()
        {
            int i = getRowCount();
            if(indexes != null && indexes.length == i)
                return indexes;
            indexes = new int[i];
            for(int j = 0; j < i; j++)
                indexes[j] = j;

            return indexes;
        }

        public Object getValueAt(int i, int j)
        {
            int k = i;
            if(indexes != null)
                k = indexes[i];
            return super.getValueAt(k, j);
        }

        public void setValueAt(Object obj, int i, int j)
        {
            int k = i;
            if(indexes != null)
                k = indexes[i];
            super.setValueAt(obj, k, j);
        }

        public void sortByColumn(int i, boolean flag)
        {
            if(sorter == null)
                sorter = new TableSorter(this);
            sorter.sort(i, flag);
            fireTableDataChanged();
        }

        private int indexes[];
        private TableSorter sorter;

        public TopicDlgSortableTableModel()
        {
        }
    }

    class IvjEventHandler
        implements FooterListener, ActionListener, MouseListener, WindowListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC3(actionevent);
            if(actionevent.getSource() == getJMenuItem2())
                connEtoC7(actionevent);
        }

        public void cancel(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC1(eventobject);
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
            if(mouseevent.getSource() == getTable())
                connEtoC4(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getTable())
                connEtoC5(mouseevent);
        }

        public void ok(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC2(eventobject);
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
            if(windowevent.getSource() == TopicDlg.this)
                connEtoC6(windowevent);
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
        }

        IvjEventHandler()
        {
        }
    }


    public TopicDlg()
    {
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel1 = null;
        ivjTopicNameLabel = null;
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        profile = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        sortButtonRenderer = new SortButtonRenderer();
        initialize();
    }

    public TopicDlg(Dialog dialog)
    {
        super(dialog);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel1 = null;
        ivjTopicNameLabel = null;
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        profile = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        sortButtonRenderer = new SortButtonRenderer();
    }

    public TopicDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel1 = null;
        ivjTopicNameLabel = null;
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        profile = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        sortButtonRenderer = new SortButtonRenderer();
    }

    public TopicDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel1 = null;
        ivjTopicNameLabel = null;
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        profile = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        sortButtonRenderer = new SortButtonRenderer();
    }

    public TopicDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel1 = null;
        ivjTopicNameLabel = null;
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        profile = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        sortButtonRenderer = new SortButtonRenderer();
    }

    public TopicDlg(Frame frame)
    {
        super(frame);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel1 = null;
        ivjTopicNameLabel = null;
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        profile = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        sortButtonRenderer = new SortButtonRenderer();
        initialize();
    }

    public TopicDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel1 = null;
        ivjTopicNameLabel = null;
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        profile = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        sortButtonRenderer = new SortButtonRenderer();
    }

    public TopicDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel1 = null;
        ivjTopicNameLabel = null;
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        profile = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        sortButtonRenderer = new SortButtonRenderer();
    }

    public TopicDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel1 = null;
        ivjTopicNameLabel = null;
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        profile = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        sortButtonRenderer = new SortButtonRenderer();
    }

    private void cancel()
    {
        if(profile != null)
        {
            profile.pubSubSettings.topicDlgTableMetaData.setWidthsFromTable();
            profile.pubSubSettings.topicDlgSize = getSize();
        }
        dispose();
    }

    private void connEtoC1(EventObject eventobject)
    {
        try
        {
            cancel();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(EventObject eventobject)
    {
        try
        {
            ok();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(ActionEvent actionevent)
    {
        try
        {
            unsubscribeSelected();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(MouseEvent mouseevent)
    {
        try
        {
            maybePopup(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5(MouseEvent mouseevent)
    {
        try
        {
            maybePopup(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(WindowEvent windowevent)
    {
        try
        {
            cancel();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC7(ActionEvent actionevent)
    {
        try
        {
            requestUpdateSelected();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private Footer getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new Footer();
                ivjFooter.setName("Footer");
                ivjFooter.setCancelEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
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
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Topic Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private JMenuItem getJMenuItem1()
    {
        if(ivjJMenuItem1 == null)
            try
            {
                ivjJMenuItem1 = new JMenuItem();
                ivjJMenuItem1.setName("JMenuItem1");
                ivjJMenuItem1.setText("Unsubscribe");
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
                ivjJMenuItem2.setText("Request Update");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem2;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJScrollPane1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getTopicNameLabel(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                ivjJScrollPane1.setVerticalScrollBarPolicy(20);
                ivjJScrollPane1.setHorizontalScrollBarPolicy(30);
                getJScrollPane1().setViewportView(getTable());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
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

    private JPopupMenu getPopupMenu()
    {
        if(ivjPopupMenu == null)
            try
            {
                ivjPopupMenu = new JPopupMenu();
                ivjPopupMenu.setName("PopupMenu");
                ivjPopupMenu.add(getJMenuItem2());
                ivjPopupMenu.add(getJSeparator1());
                ivjPopupMenu.add(getJMenuItem1());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPopupMenu;
    }

    private JTable getTable()
    {
        if(ivjTable == null)
            try
            {
                ivjTable = new JTable();
                ivjTable.setName("Table");
                getJScrollPane1().setColumnHeaderView(ivjTable.getTableHeader());
                getJScrollPane1().getViewport().setBackingStoreEnabled(true);
                ivjTable.setAutoResizeMode(1);
                ivjTable.setBounds(0, 0, 200, 200);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTable;
    }

    private JLabel getTopicNameLabel()
    {
        if(ivjTopicNameLabel == null)
            try
            {
                ivjTopicNameLabel = new JLabel();
                ivjTopicNameLabel.setName("TopicNameLabel");
                ivjTopicNameLabel.setText("JLabel2");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTopicNameLabel;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getFooter().addFooterListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        getTable().addMouseListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
        getJMenuItem2().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            TopicDlgSortableTableModel topicdlgsortabletablemodel = new TopicDlgSortableTableModel();
            getTable().setModel(topicdlgsortabletablemodel);
            TableColumnModel tablecolumnmodel = getTable().getColumnModel();
            for(int i = 0; i < getTable().getColumnCount(); i++)
                tablecolumnmodel.getColumn(i).setHeaderRenderer(sortButtonRenderer);

            javax.swing.table.JTableHeader jtableheader = getTable().getTableHeader();
            jtableheader.addMouseListener(new HeaderListener(jtableheader, sortButtonRenderer));
            getTable().getSelectionModel().setSelectionMode(0);
            setName("TopicDlg");
            setDefaultCloseOperation(0);
            setSize(598, 365);
            setModal(true);
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
            TopicDlg topicdlg = new TopicDlg();
            topicdlg.setModal(true);
            topicdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            topicdlg.show();
            Insets insets = topicdlg.getInsets();
            topicdlg.setSize(topicdlg.getWidth() + insets.left + insets.right, topicdlg.getHeight() + insets.top + insets.bottom);
            topicdlg.setVisible(true);
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
        int i = getTable().rowAtPoint(point);
        if(i < 0)
        {
            return;
        } else
        {
            getTable().setRowSelectionInterval(i, i);
            getPopupMenu().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    private void ok()
    {
        if(profile != null)
        {
            profile.pubSubSettings.topicDlgTableMetaData.setWidthsFromTable();
            profile.pubSubSettings.topicDlgSize = getSize();
        }
        dispose();
    }

    public void requestUpdateSelected()
    {
        int i = getTable().getSelectedRow();
        if(i < 0)
            return;
        byte abyte0[] = null;
        MQRFH mqrfh = new MQRFH();
        mqrfh.addNameValue("MQPSCommand", "ReqUpdate");
        mqrfh.addNameValue("MQPSTopic", "\"" + pubSubTopicInfo.topicName + "\"");
        mqrfh.addNameValue("MQPSStreamName", pubSubTopicInfo.getStream());
        mqrfh.addNameValue("MQPSQName", pubSubTopicInfo.getRegistrationQName(i));
        if((pubSubTopicInfo.getRegistrationOptions(i).intValue() & 1) != 0)
        {
            String s = pubSubTopicInfo.getRegistrationCorrelId(i);
            abyte0 = StringUtils.stringToByteArray(s);
            mqrfh.addNameValue("MQPSRegOpts", "CorrelAsId");
        }
        PubSubError pubsuberror = MQPubSub.execute(queueManager, mqrfh, abyte0);
        if(pubsuberror != null)
            JOptionPane.showMessageDialog(this, pubsuberror.toString(), "Error", 0);
    }

    public void setProfile(Profile profile1)
    {
        if(profile1 == null)
        {
            profile = null;
            return;
        }
        profile = profile1;
        setSize(profile.pubSubSettings.topicDlgSize);
        profile.pubSubSettings.topicDlgTableMetaData.setTable(getTable());
        profile.pubSubSettings.topicDlgTableMetaData.synchronizeTable();
        TableColumnModel tablecolumnmodel = getTable().getColumnModel();
        for(int i = 0; i < getTable().getColumnCount(); i++)
            tablecolumnmodel.getColumn(i).setHeaderRenderer(sortButtonRenderer);

        RegOptionsCellRenderer regoptionscellrenderer = new RegOptionsCellRenderer();
        getTable().getColumnModel().getColumn(3).setCellRenderer(regoptionscellrenderer);
        RegCorrelIdCellRenderer regcorrelidcellrenderer = new RegCorrelIdCellRenderer();
        getTable().getColumnModel().getColumn(5).setCellRenderer(regcorrelidcellrenderer);
    }

    public void setPubSubTopicInfo(PubSubTopicInfo pubsubtopicinfo, MQQueueManager mqqueuemanager)
    {
        pubSubTopicInfo = pubsubtopicinfo;
        setTitle("Subscriptions: " + pubSubTopicInfo.topicName);
        getTopicNameLabel().setText(pubSubTopicInfo.topicName);
        queueManager = mqqueuemanager;
    }

    private void unsubscribeSelected()
    {
        int i = getTable().getSelectedRow();
        if(i < 0)
            return;
        byte abyte0[] = null;
        MQRFH mqrfh = new MQRFH();
        mqrfh.addNameValue("MQPSCommand", "DeregSub");
        mqrfh.addNameValue("MQPSTopic", "\"" + pubSubTopicInfo.topicName + "\"");
        mqrfh.addNameValue("MQPSStreamName", pubSubTopicInfo.getStream());
        mqrfh.addNameValue("MQPSQName", pubSubTopicInfo.getRegistrationQName(i));
        if((pubSubTopicInfo.getRegistrationOptions(i).intValue() & 1) != 0)
        {
            String s = pubSubTopicInfo.getRegistrationCorrelId(i);
            abyte0 = StringUtils.stringToByteArray(s);
            mqrfh.addNameValue("MQPSRegOpts", "CorrelAsId");
        }
        PubSubError pubsuberror = MQPubSub.execute(queueManager, mqrfh, abyte0);
        if(pubsuberror != null)
        {
            JOptionPane.showMessageDialog(this, pubsuberror.toString(), "Error", 0);
        } else
        {
            pubSubTopicInfo.remove(i);
            AbstractTableModel abstracttablemodel = (AbstractTableModel)getTable().getModel();
            abstracttablemodel.fireTableDataChanged();
        }
    }

    private Footer ivjFooter;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private JScrollPane ivjJScrollPane1;
    private JTable ivjTable;
    IvjEventHandler ivjEventHandler;
    private PubSubTopicInfo pubSubTopicInfo;
    private JLabel ivjJLabel1;
    private JLabel ivjTopicNameLabel;
    private JMenuItem ivjJMenuItem1;
    private JPopupMenu ivjPopupMenu;
    private MQQueueManager queueManager;
    private Profile profile;
    private JMenuItem ivjJMenuItem2;
    private JSeparator ivjJSeparator1;
    private SortButtonRenderer sortButtonRenderer;












}
