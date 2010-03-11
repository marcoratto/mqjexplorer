// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PubSubView.java

package com.kolban.mqjexplorer.pubsub;

import com.ibm.mq.MQException;
import com.kolban.mqjexplorer.*;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

// Referenced classes of package com.kolban.mqjexplorer.pubsub:
//            TopicDlg, PubSubQuery, PubSubTopicInfo, RegisterSubscriberDlg

public class PubSubView extends JPanel
    implements MQJExplorerView
{
    class PubSubTableModel extends AbstractTableModel
    {

        public int getRowCount()
        {
            if(pubSubQuery == null)
                return 0;
            else
                return pubSubQuery.getTopicCount();
        }

        public int getColumnCount()
        {
            return PubSubView.columnNames.length;
        }

        public Object getValueAt(int i, int j)
        {
            PubSubTopicInfo pubsubtopicinfo = pubSubQuery.getTopic(i);
            String s = getColumnName(j);
            if(s.equals("Topic"))
                return pubsubtopicinfo.topicName;
            if(s.equals("Broker Count"))
                return new Integer(pubsubtopicinfo.brokerCount);
            if(s.equals("Appl Count"))
                return new Integer(pubsubtopicinfo.applCount);
            if(s.equals("Anonymous Count"))
                return new Integer(pubsubtopicinfo.anonymousCount);
            else
                return null;
        }

        public String getColumnName(int i)
        {
            return PubSubView.columnNames[i];
        }

        public boolean isCellEditable(int i, int j)
        {
            return false;
        }

        PubSubTableModel()
        {
        }
    }

    class IvjEventHandler
        implements ActionListener, ItemListener, MouseListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC3(actionevent);
            if(actionevent.getSource() == getJMenuItem2())
                connEtoC5(actionevent);
            if(actionevent.getSource() == getJMenuItem3())
                connEtoC6(actionevent);
        }

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getStreamCombo())
                connEtoC7(itemevent);
            if(itemevent.getSource() == getAllIdentities())
                connEtoC8(itemevent);
        }

        public void mouseClicked(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getTable())
                connEtoC4(mouseevent);
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
                connEtoC1(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getTable())
                connEtoC2(mouseevent);
        }

        IvjEventHandler()
        {
        }
    }


    public PubSubView()
    {
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        pubSubQuery = null;
        ivjJMenuItem1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjPopup = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        ivjJMenuItem3 = null;
        ivjJLabel1 = null;
        ivjStreamCombo = null;
        ivjAllIdentities = null;
        initialize();
    }

    public PubSubView(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        pubSubQuery = null;
        ivjJMenuItem1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjPopup = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        ivjJMenuItem3 = null;
        ivjJLabel1 = null;
        ivjStreamCombo = null;
        ivjAllIdentities = null;
    }

    public PubSubView(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        pubSubQuery = null;
        ivjJMenuItem1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjPopup = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        ivjJMenuItem3 = null;
        ivjJLabel1 = null;
        ivjStreamCombo = null;
        ivjAllIdentities = null;
    }

    public PubSubView(boolean flag)
    {
        super(flag);
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        pubSubQuery = null;
        ivjJMenuItem1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjPopup = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        ivjJMenuItem3 = null;
        ivjJLabel1 = null;
        ivjStreamCombo = null;
        ivjAllIdentities = null;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        String s = actionevent.getActionCommand();
        System.out.println("PubSubView: Action: \"" + s + "\"");
        if(s.equals("pubSubRegSub"))
        {
            registerSubscriber("");
            return;
        } else
        {
            return;
        }
    }

    public void addToolBarButtons(JToolBar jtoolbar, Dimension dimension)
    {
    }

    public void allIdentities_ItemStateChanged()
    {
        if(!transitioning)
            refresh();
    }

    private void connEtoC1(MouseEvent mouseevent)
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

    private void connEtoC2(MouseEvent mouseevent)
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

    private void connEtoC3(ActionEvent actionevent)
    {
        try
        {
            propertiesSelected();
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
            maybeDoubleClick(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5(ActionEvent actionevent)
    {
        try
        {
            refreshSelected();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(ActionEvent actionevent)
    {
        try
        {
            registerSelectedSubscriber();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC7(ItemEvent itemevent)
    {
        try
        {
            streamCombo_ItemStateChanged(itemevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC8(ItemEvent itemevent)
    {
        try
        {
            allIdentities_ItemStateChanged();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JCheckBox getAllIdentities()
    {
        if(ivjAllIdentities == null)
            try
            {
                ivjAllIdentities = new JCheckBox();
                ivjAllIdentities.setName("AllIdentities");
                ivjAllIdentities.setText("Include anonymous");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAllIdentities;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Stream:");
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
                ivjJMenuItem2.setText("Refresh");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem2;
    }

    private JMenuItem getJMenuItem3()
    {
        if(ivjJMenuItem3 == null)
            try
            {
                ivjJMenuItem3 = new JMenuItem();
                ivjJMenuItem3.setName("JMenuItem3");
                ivjJMenuItem3.setText("Add Subscriber...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem3;
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

    private JPopupMenu getPopup()
    {
        if(ivjPopup == null)
            try
            {
                ivjPopup = new JPopupMenu();
                ivjPopup.setName("Popup");
                ivjPopup.add(getJMenuItem1());
                ivjPopup.add(getJMenuItem3());
                ivjPopup.add(getJSeparator1());
                ivjPopup.add(getJMenuItem2());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPopup;
    }

    private JComboBox getStreamCombo()
    {
        if(ivjStreamCombo == null)
            try
            {
                ivjStreamCombo = new JComboBox();
                ivjStreamCombo.setName("StreamCombo");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStreamCombo;
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
                ivjTable.setBounds(0, 0, 200, 200);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTable;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getTable().addMouseListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        getJMenuItem2().addActionListener(ivjEventHandler);
        getJMenuItem3().addActionListener(ivjEventHandler);
        getStreamCombo().addItemListener(ivjEventHandler);
        getAllIdentities().addItemListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            getTable().setModel(new PubSubTableModel());
            getTable().getSelectionModel().setSelectionMode(0);
            getTable().addKeyListener(new KeyAdapter() {

                public void keyPressed(KeyEvent keyevent)
                {
                    if(keyevent.getKeyCode() == 116)
                        refreshSelected();
                }

            }
);
            setName("PubSubView");
            setLayout(new GridBagLayout());
            setSize(480, 278);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 1;
            gridbagconstraints.gridwidth = 3;
            gridbagconstraints.fill = 1;
            gridbagconstraints.weightx = 1.0D;
            gridbagconstraints.weighty = 1.0D;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJScrollPane1(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 1;
            gridbagconstraints1.gridy = 0;
            gridbagconstraints1.anchor = 17;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getStreamCombo(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 0;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getJLabel1(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 2;
            gridbagconstraints3.gridy = 0;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getAllIdentities(), gridbagconstraints3);
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
            JFrame jframe = new JFrame();
            PubSubView pubsubview = new PubSubView();
            jframe.setContentPane(pubsubview);
            jframe.setSize(pubsubview.getSize());
            jframe.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            jframe.show();
            Insets insets = jframe.getInsets();
            jframe.setSize(jframe.getWidth() + insets.left + insets.right, jframe.getHeight() + insets.top + insets.bottom);
            jframe.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JPanel");
            throwable.printStackTrace(System.out);
        }
    }

    public void maybeDoubleClick(MouseEvent mouseevent)
    {
        if(mouseevent.getClickCount() != 2)
            return;
        Point point = new Point(mouseevent.getX(), mouseevent.getY());
        int i = getTable().rowAtPoint(point);
        if(i < 0)
        {
            return;
        } else
        {
            getTable().setRowSelectionInterval(i, i);
            propertiesSelected();
            return;
        }
    }

    public void maybePopup(MouseEvent mouseevent)
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
            getPopup().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    public void propertiesSelected()
    {
        int i = getTable().getSelectedRow();
        if(i < 0)
            return;
        TopicDlg topicdlg = new TopicDlg(MQJExplorer.mainFrame);
        PubSubTopicInfo pubsubtopicinfo = pubSubQuery.getTopic(i);
        try
        {
            topicdlg.setProfile(profile);
            topicdlg.setPubSubTopicInfo(pubsubtopicinfo, queueManagerModel.getQueueManager());
            SwingUtils.setCenter(MQJExplorer.mainFrame, topicdlg);
            topicdlg.show();
        }
        catch(Exception _ex) { }
    }

    public void refresh()
    {
        System.out.println("PubSubView refresh");
        try
        {
            pubSubQuery.setCurrentStream((String)getStreamCombo().getSelectedItem());
            profile.pubSubSettings.initialStreamName = pubSubQuery.getCurrentStream();
            pubSubQuery.setAllIdentities(getAllIdentities().isSelected());
            pubSubQuery.refreshAll();
            AbstractTableModel abstracttablemodel = (AbstractTableModel)getTable().getModel();
            abstracttablemodel.fireTableDataChanged();
            MQJExplorer.setMessage("All topics refreshed");
        }
        catch(Exception _ex) { }
    }

    public void refreshNamedTopic(String s)
    {
        try
        {
            pubSubQuery.refreshNamedTopic(s);
            AbstractTableModel abstracttablemodel = (AbstractTableModel)getTable().getModel();
            abstracttablemodel.fireTableDataChanged();
            MQJExplorer.setMessage("Topic " + s + " refreshed");
        }
        catch(Exception _ex) { }
    }

    public void refreshSelected()
    {
        int i = getTable().getSelectedRow();
        if(i < 0)
        {
            return;
        } else
        {
            PubSubTopicInfo pubsubtopicinfo = pubSubQuery.getTopic(i);
            refreshNamedTopic(pubsubtopicinfo.topicName);
            return;
        }
    }

    public void registerSelectedSubscriber()
    {
        int i = getTable().getSelectedRow();
        if(i < 0)
        {
            return;
        } else
        {
            PubSubTopicInfo pubsubtopicinfo = pubSubQuery.getTopic(i);
            registerSubscriber(pubsubtopicinfo.topicName);
            return;
        }
    }

    public void registerSubscriber(String s)
    {
        RegisterSubscriberDlg registersubscriberdlg = new RegisterSubscriberDlg();
        registersubscriberdlg.setTopicName(s);
        registersubscriberdlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, registersubscriberdlg);
        registersubscriberdlg.setQMgrModel(queueManagerModel);
        registersubscriberdlg.show();
        String s1 = registersubscriberdlg.getNewTopic();
        if(s1 != null)
            refreshNamedTopic(s1);
    }

    public void setModel(Object obj)
    {
        boolean flag = queueManagerModel == null;
        queueManagerModel = (QueueManagerModel)obj;
        if(flag)
        {
            pubSubQuery = new PubSubQuery();
            try
            {
                pubSubQuery.setQueueManager(queueManagerModel.getQueueManager());
            }
            catch(MQException _ex) { }
            pubSubQuery.refreshStreams();
            transitioning = true;
            getStreamCombo().removeAllItems();
            for(int i = 0; i < pubSubQuery.getStreamCount(); i++)
                getStreamCombo().addItem(pubSubQuery.getStreamName(i));

            if(profile.pubSubSettings.initialStreamName != null)
                getStreamCombo().setSelectedItem(profile.pubSubSettings.initialStreamName);
            transitioning = false;
            refresh();
        }
    }

    public void setProfile(Profile profile1)
    {
        profile = profile1;
    }

    public void showHideColumns()
    {
    }

    private void streamCombo_ItemStateChanged(ItemEvent itemevent)
    {
        if(!transitioning && itemevent.getStateChange() == 1)
            refresh();
    }

    private QueueManagerModel queueManagerModel;
    private JScrollPane ivjJScrollPane1;
    private JTable ivjTable;
    private static final String columnNames[] = {
        "Topic", "Appl Count", "Anonymous Count", "Broker Count"
    };
    private PubSubQuery pubSubQuery;
    private JMenuItem ivjJMenuItem1;
    IvjEventHandler ivjEventHandler;
    private JPopupMenu ivjPopup;
    private JMenuItem ivjJMenuItem2;
    private JSeparator ivjJSeparator1;
    private JMenuItem ivjJMenuItem3;
    private Profile profile;
    private JLabel ivjJLabel1;
    private JComboBox ivjStreamCombo;
    private boolean transitioning;
    private JCheckBox ivjAllIdentities;

















}
