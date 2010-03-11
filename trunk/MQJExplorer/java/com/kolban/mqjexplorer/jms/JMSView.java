// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JMSView.java

package com.kolban.mqjexplorer.jms;

import com.ibm.ejs.jms.mq.JMSWrapXAQueueConnectionFactory;
import com.ibm.ejs.jms.mq.JMSWrapXATopicConnectionFactory;
import com.ibm.mq.jms.*;
import com.kolban.mqjexplorer.*;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.util.EventObject;
import javax.naming.Binding;
import javax.naming.NameClassPair;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

// Referenced classes of package com.kolban.mqjexplorer.jms:
//            QueueDlg, JNDINameSpace, JMSTableModel, QueueConnectionFactoryDlg, 
//            TopicDlg, TopicConnectionFactoryDlg, XAQueueConnectionFactoryDlg, XATopicConnectionFactoryDlg, 
//            WASQueueConnectionFactoryDlg, WASTopicConnectionFactoryDlg

public class JMSView extends JPanel
    implements MQJExplorerView
{
    class IvjEventHandler
        implements ActionListener, MouseListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJMenuItem2())
                connEtoC4(actionevent);
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC5(actionevent);
            if(actionevent.getSource() == getJMenuItem3())
                connEtoC6(actionevent);
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
                connEtoC1(mouseevent);
            if(mouseevent.getSource() == getTable())
                connEtoC2(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getTable())
                connEtoC3(mouseevent);
        }

        IvjEventHandler()
        {
        }
    }


    public JMSView()
    {
        ivjJScrollPane1 = null;
        ivjTable = null;
        jndiNameSpace = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        ivjJMenuItem3 = null;
        initialize();
    }

    public JMSView(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJScrollPane1 = null;
        ivjTable = null;
        jndiNameSpace = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        ivjJMenuItem3 = null;
    }

    public JMSView(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJScrollPane1 = null;
        ivjTable = null;
        jndiNameSpace = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        ivjJMenuItem3 = null;
    }

    public JMSView(boolean flag)
    {
        super(flag);
        ivjJScrollPane1 = null;
        ivjTable = null;
        jndiNameSpace = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJMenuItem1 = null;
        ivjPopupMenu = null;
        ivjJMenuItem2 = null;
        ivjJSeparator1 = null;
        ivjJMenuItem3 = null;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        String s = actionevent.getActionCommand();
        if(s.equals("createJMSQueue"))
        {
            createJMSQueue();
            return;
        }
        if(s.equals("createJMSTopic"))
        {
            createJMSTopic();
            return;
        }
        if(s.equals("createJMSQueueConnectionFactory"))
        {
            createJMSQueueConnectionFactory();
            return;
        }
        if(s.equals("createJMSTopicConnectionFactory"))
        {
            createJMSTopicConnectionFactory();
            return;
        }
        if(s.equals("createJMSXAQueueConnectionFactory"))
        {
            createJMSXAQueueConnectionFactory();
            return;
        }
        if(s.equals("createJMSXATopicConnectionFactory"))
        {
            createJMSXATopicConnectionFactory();
            return;
        }
        if(s.equals("createWASQueueConnectionFactory"))
        {
            createWASQueueConnectionFactory();
            return;
        }
        if(s.equals("createWASTopicConnectionFactory"))
        {
            createWASTopicConnectionFactory();
            return;
        } else
        {
            return;
        }
    }

    public void addToolBarButtons(JToolBar jtoolbar, Dimension dimension)
    {
    }

    private void connEtoC1(MouseEvent mouseevent)
    {
        try
        {
            selectTableRowOnClick(mouseevent);
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

    private void connEtoC3(MouseEvent mouseevent)
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

    private void connEtoC4(ActionEvent actionevent)
    {
        try
        {
            deleteSelected();
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
            propertiesSelected();
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
            refresh();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void createJMSQueue()
    {
        QueueDlg queuedlg = new QueueDlg();
        queuedlg.setFromQueue(new MQQueue());
        queuedlg.setTitle("Create new JMS Queue");
        queuedlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, queuedlg);
        queuedlg.show();
        String s = queuedlg.getManagedObjectName();
        if(s == null)
            return;
        MQQueue mqqueue = queuedlg.getQueue();
        try
        {
            jndiNameSpace.bind(s, mqqueue);
            JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
            jmstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    private void createJMSQueueConnectionFactory()
    {
        QueueConnectionFactoryDlg queueconnectionfactorydlg = new QueueConnectionFactoryDlg();
        queueconnectionfactorydlg.setFromQueueConnectionFactory(new MQQueueConnectionFactory());
        queueconnectionfactorydlg.setTitle("Create new JMS Queue Connection Factory");
        queueconnectionfactorydlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, queueconnectionfactorydlg);
        queueconnectionfactorydlg.show();
        String s = queueconnectionfactorydlg.getManagedObjectName();
        if(s == null)
            return;
        MQQueueConnectionFactory mqqueueconnectionfactory = queueconnectionfactorydlg.getQueueConnectionFactory();
        try
        {
            jndiNameSpace.bind(s, mqqueueconnectionfactory);
            JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
            jmstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    private void createJMSTopic()
    {
        TopicDlg topicdlg = new TopicDlg();
        topicdlg.setFromTopic(new MQTopic());
        topicdlg.setTitle("Create new JMS Topic");
        topicdlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, topicdlg);
        topicdlg.show();
        String s = topicdlg.getManagedObjectName();
        if(s == null)
            return;
        MQTopic mqtopic = topicdlg.getTopic();
        try
        {
            jndiNameSpace.bind(s, mqtopic);
            JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
            jmstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    private void createJMSTopicConnectionFactory()
    {
        TopicConnectionFactoryDlg topicconnectionfactorydlg = new TopicConnectionFactoryDlg();
        topicconnectionfactorydlg.setFromTopicConnectionFactory(new MQTopicConnectionFactory());
        topicconnectionfactorydlg.setTitle("Create new JMS Topic Connection Factory");
        topicconnectionfactorydlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, topicconnectionfactorydlg);
        topicconnectionfactorydlg.show();
        String s = topicconnectionfactorydlg.getManagedObjectName();
        if(s == null)
            return;
        MQTopicConnectionFactory mqtopicconnectionfactory = topicconnectionfactorydlg.getTopicConnectionFactory();
        try
        {
            jndiNameSpace.bind(s, mqtopicconnectionfactory);
            JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
            jmstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    private void deleteSelected()
    {
        int i = getTable().getSelectedRow();
        if(i < 0)
            return;
        Binding binding = jndiNameSpace.getBinding(i);
        try
        {
            jndiNameSpace.unbind(binding.getName());
            jndiNameSpace.refresh();
            JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
            jmstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
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
                ivjJMenuItem2.setText("Delete");
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
                ivjJMenuItem3.setText("Refresh");
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

    private JPopupMenu getPopupMenu()
    {
        if(ivjPopupMenu == null)
            try
            {
                ivjPopupMenu = new JPopupMenu();
                ivjPopupMenu.setName("PopupMenu");
                ivjPopupMenu.add(getJMenuItem1());
                ivjPopupMenu.add(getJMenuItem3());
                ivjPopupMenu.add(getJSeparator1());
                ivjPopupMenu.add(getJMenuItem2());
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
                ivjTable.setBounds(0, 0, 200, 200);
                ivjTable.setModel(new JMSTableModel());
                ivjTable.setDefaultRenderer(com.kolban.mqjexplorer.TextIcon.class, new TextIconRenderer());
                ivjTable.setSelectionMode(0);
                ivjTable.addMouseListener(new MouseAdapter() {

                    public void mouseClicked(MouseEvent mouseevent)
                    {
                        if(mouseevent.getClickCount() == 2)
                            propertiesSelected();
                    }

                }
);
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
        getJMenuItem2().addActionListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        getJMenuItem3().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("JMSView");
            setLayout(new GridBagLayout());
            setSize(463, 234);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.fill = 1;
            gridbagconstraints.weightx = 1.0D;
            gridbagconstraints.weighty = 1.0D;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJScrollPane1(), gridbagconstraints);
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
            JMSView jmsview = new JMSView();
            jframe.setContentPane(jmsview);
            jframe.setSize(jmsview.getSize());
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
            getPopupMenu().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    private void propertiesSelected()
    {
        int i = getTable().getSelectedRow();
        if(i < 0)
            return;
        Binding binding = jndiNameSpace.getBinding(i);
        String s = binding.getName();
        String s1 = binding.getClassName();
        if(s1.equals("com.ibm.mq.jms.MQQueue"))
        {
            QueueDlg queuedlg = new QueueDlg();
            queuedlg.setManagedObjectName(s);
            queuedlg.setFromQueue((MQQueue)binding.getObject());
            queuedlg.setTitle("Queue Properties: " + s);
            queuedlg.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, queuedlg);
            queuedlg.show();
            if(queuedlg.getReturnCode() == 1)
            {
                MQQueue mqqueue = queuedlg.getQueue();
                try
                {
                    jndiNameSpace.rebind(s, mqqueue);
                    JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
                    jmstablemodel.fireTableDataChanged();
                }
                catch(Exception exception)
                {
                    System.out.println("Exception: " + exception.toString());
                }
            }
        }
        if(s1.equals("com.ibm.mq.jms.MQTopic"))
        {
            TopicDlg topicdlg = new TopicDlg();
            topicdlg.setManagedObjectName(s);
            topicdlg.setFromTopic((MQTopic)binding.getObject());
            topicdlg.setTitle("Topic Properties: " + s);
            topicdlg.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, topicdlg);
            topicdlg.show();
            if(topicdlg.getReturnCode() == 1)
            {
                MQTopic mqtopic = topicdlg.getTopic();
                try
                {
                    jndiNameSpace.rebind(s, mqtopic);
                    JMSTableModel jmstablemodel1 = (JMSTableModel)getTable().getModel();
                    jmstablemodel1.fireTableDataChanged();
                }
                catch(Exception exception1)
                {
                    System.out.println("Exception: " + exception1.toString());
                }
            }
        }
        if(s1.equals("com.ibm.mq.jms.MQQueueConnectionFactory"))
        {
            QueueConnectionFactoryDlg queueconnectionfactorydlg = new QueueConnectionFactoryDlg();
            queueconnectionfactorydlg.setManagedObjectName(s);
            queueconnectionfactorydlg.setFromQueueConnectionFactory((MQQueueConnectionFactory)binding.getObject());
            queueconnectionfactorydlg.setTitle("Queue Connection Factory Properties: " + s);
            queueconnectionfactorydlg.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, queueconnectionfactorydlg);
            queueconnectionfactorydlg.show();
            if(queueconnectionfactorydlg.getReturnCode() == 1)
            {
                MQQueueConnectionFactory mqqueueconnectionfactory = queueconnectionfactorydlg.getQueueConnectionFactory();
                try
                {
                    jndiNameSpace.rebind(s, mqqueueconnectionfactory);
                    JMSTableModel jmstablemodel2 = (JMSTableModel)getTable().getModel();
                    jmstablemodel2.fireTableDataChanged();
                }
                catch(Exception exception2)
                {
                    System.out.println("Exception: " + exception2.toString());
                }
            }
        }
        if(s1.equals("com.ibm.mq.jms.MQTopicConnectionFactory"))
        {
            TopicConnectionFactoryDlg topicconnectionfactorydlg = new TopicConnectionFactoryDlg();
            topicconnectionfactorydlg.setManagedObjectName(s);
            topicconnectionfactorydlg.setFromTopicConnectionFactory((MQTopicConnectionFactory)binding.getObject());
            topicconnectionfactorydlg.setTitle("Topic Connection Factory Properties: " + s);
            topicconnectionfactorydlg.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, topicconnectionfactorydlg);
            topicconnectionfactorydlg.show();
            if(topicconnectionfactorydlg.getReturnCode() == 1)
            {
                MQTopicConnectionFactory mqtopicconnectionfactory = topicconnectionfactorydlg.getTopicConnectionFactory();
                try
                {
                    jndiNameSpace.rebind(s, mqtopicconnectionfactory);
                    JMSTableModel jmstablemodel3 = (JMSTableModel)getTable().getModel();
                    jmstablemodel3.fireTableDataChanged();
                }
                catch(Exception exception3)
                {
                    System.out.println("Exception: " + exception3.toString());
                }
            }
        }
        if(s1.equals("com.ibm.mq.jms.MQXAQueueConnectionFactory"))
        {
            XAQueueConnectionFactoryDlg xaqueueconnectionfactorydlg = new XAQueueConnectionFactoryDlg();
            xaqueueconnectionfactorydlg.setManagedObjectName(s);
            xaqueueconnectionfactorydlg.setFromXAQueueConnectionFactory((MQXAQueueConnectionFactory)binding.getObject());
            xaqueueconnectionfactorydlg.setTitle("XA Queue Connection Factory Properties: " + s);
            xaqueueconnectionfactorydlg.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, xaqueueconnectionfactorydlg);
            xaqueueconnectionfactorydlg.show();
            if(xaqueueconnectionfactorydlg.getReturnCode() == 1)
            {
                MQXAQueueConnectionFactory mqxaqueueconnectionfactory = xaqueueconnectionfactorydlg.getXAQueueConnectionFactory();
                try
                {
                    jndiNameSpace.rebind(s, mqxaqueueconnectionfactory);
                    JMSTableModel jmstablemodel4 = (JMSTableModel)getTable().getModel();
                    jmstablemodel4.fireTableDataChanged();
                }
                catch(Exception exception4)
                {
                    System.out.println("Exception: " + exception4.toString());
                }
            }
        }
        if(s1.equals("com.ibm.mq.jms.MQXATopicConnectionFactory"))
        {
            XATopicConnectionFactoryDlg xatopicconnectionfactorydlg = new XATopicConnectionFactoryDlg();
            xatopicconnectionfactorydlg.setManagedObjectName(s);
            xatopicconnectionfactorydlg.setFromXATopicConnectionFactory((MQXATopicConnectionFactory)binding.getObject());
            xatopicconnectionfactorydlg.setTitle("XA Topic Connection Factory Properties: " + s);
            xatopicconnectionfactorydlg.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, xatopicconnectionfactorydlg);
            xatopicconnectionfactorydlg.show();
            if(xatopicconnectionfactorydlg.getReturnCode() == 1)
            {
                MQXATopicConnectionFactory mqxatopicconnectionfactory = xatopicconnectionfactorydlg.getXATopicConnectionFactory();
                try
                {
                    jndiNameSpace.rebind(s, mqxatopicconnectionfactory);
                    JMSTableModel jmstablemodel5 = (JMSTableModel)getTable().getModel();
                    jmstablemodel5.fireTableDataChanged();
                }
                catch(Exception exception5)
                {
                    System.out.println("Exception: " + exception5.toString());
                }
            }
        }
        if(s1.equals("com.ibm.ejs.jms.mq.JMSWrapXAQueueConnectionFactory"))
        {
            WASQueueConnectionFactoryDlg wasqueueconnectionfactorydlg = new WASQueueConnectionFactoryDlg();
            wasqueueconnectionfactorydlg.setManagedObjectName(s);
            wasqueueconnectionfactorydlg.setFromWASQueueConnectionFactory((JMSWrapXAQueueConnectionFactory)binding.getObject());
            wasqueueconnectionfactorydlg.setTitle("WAS Queue Connection Factory Properties: " + s);
            wasqueueconnectionfactorydlg.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, wasqueueconnectionfactorydlg);
            wasqueueconnectionfactorydlg.show();
            if(wasqueueconnectionfactorydlg.getReturnCode() == 1)
            {
                JMSWrapXAQueueConnectionFactory jmswrapxaqueueconnectionfactory = wasqueueconnectionfactorydlg.getWASQueueConnectionFactory();
                try
                {
                    jndiNameSpace.rebind(s, jmswrapxaqueueconnectionfactory);
                    JMSTableModel jmstablemodel6 = (JMSTableModel)getTable().getModel();
                    jmstablemodel6.fireTableDataChanged();
                }
                catch(Exception exception6)
                {
                    System.out.println("Exception: " + exception6.toString());
                }
            }
        }
        if(s1.equals("com.ibm.ejs.jms.mq.JMSWrapXATopicConnectionFactory"))
        {
            WASTopicConnectionFactoryDlg wastopicconnectionfactorydlg = new WASTopicConnectionFactoryDlg();
            wastopicconnectionfactorydlg.setManagedObjectName(s);
            wastopicconnectionfactorydlg.setFromWASTopicConnectionFactory((JMSWrapXATopicConnectionFactory)binding.getObject());
            wastopicconnectionfactorydlg.setTitle("WAS Topic Connection Factory Properties: " + s);
            wastopicconnectionfactorydlg.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, wastopicconnectionfactorydlg);
            wastopicconnectionfactorydlg.show();
            if(wastopicconnectionfactorydlg.getReturnCode() == 1)
            {
                JMSWrapXATopicConnectionFactory jmswrapxatopicconnectionfactory = wastopicconnectionfactorydlg.getWASTopicConnectionFactory();
                try
                {
                    jndiNameSpace.rebind(s, jmswrapxatopicconnectionfactory);
                    JMSTableModel jmstablemodel7 = (JMSTableModel)getTable().getModel();
                    jmstablemodel7.fireTableDataChanged();
                }
                catch(Exception exception7)
                {
                    System.out.println("Exception: " + exception7.toString());
                }
            }
        }
    }

    public void refresh()
    {
        jndiNameSpace.refresh();
        JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
        jmstablemodel.fireTableDataChanged();
    }

    private void selectTableRowOnClick(MouseEvent mouseevent)
    {
        Point point = new Point(mouseevent.getX(), mouseevent.getY());
        int i = getTable().rowAtPoint(point);
        if(i >= 0)
            getTable().setRowSelectionInterval(i, i);
    }

    public void setModel(Object obj)
    {
        JNDINameSpace jndinamespace = (JNDINameSpace)obj;
        jndiNameSpace = jndinamespace;
        JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
        jmstablemodel.setJndiNameSpace(jndinamespace);
    }

    public void setProfile(Profile profile)
    {
    }

    public void showHideColumns()
    {
    }

    private void createJMSXAQueueConnectionFactory()
    {
        XAQueueConnectionFactoryDlg xaqueueconnectionfactorydlg = new XAQueueConnectionFactoryDlg();
        xaqueueconnectionfactorydlg.setFromXAQueueConnectionFactory(new MQXAQueueConnectionFactory());
        xaqueueconnectionfactorydlg.setTitle("Create new JMS XA Queue Connection Factory");
        xaqueueconnectionfactorydlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, xaqueueconnectionfactorydlg);
        xaqueueconnectionfactorydlg.show();
        String s = xaqueueconnectionfactorydlg.getManagedObjectName();
        if(s == null)
            return;
        MQXAQueueConnectionFactory mqxaqueueconnectionfactory = xaqueueconnectionfactorydlg.getXAQueueConnectionFactory();
        try
        {
            jndiNameSpace.bind(s, mqxaqueueconnectionfactory);
            JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
            jmstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    private void createJMSXATopicConnectionFactory()
    {
        XATopicConnectionFactoryDlg xatopicconnectionfactorydlg = new XATopicConnectionFactoryDlg();
        xatopicconnectionfactorydlg.setFromXATopicConnectionFactory(new MQXATopicConnectionFactory());
        xatopicconnectionfactorydlg.setTitle("Create new JMS XA Topic Connection Factory");
        xatopicconnectionfactorydlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, xatopicconnectionfactorydlg);
        xatopicconnectionfactorydlg.show();
        String s = xatopicconnectionfactorydlg.getManagedObjectName();
        if(s == null)
            return;
        MQXATopicConnectionFactory mqxatopicconnectionfactory = xatopicconnectionfactorydlg.getXATopicConnectionFactory();
        try
        {
            jndiNameSpace.bind(s, mqxatopicconnectionfactory);
            JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
            jmstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    private void createWASQueueConnectionFactory()
    {
        WASQueueConnectionFactoryDlg wasqueueconnectionfactorydlg = new WASQueueConnectionFactoryDlg();
        wasqueueconnectionfactorydlg.setFromWASQueueConnectionFactory(new JMSWrapXAQueueConnectionFactory(new MQXAQueueConnectionFactory()));
        wasqueueconnectionfactorydlg.setTitle("Create new WAS Queue Connection Factory");
        wasqueueconnectionfactorydlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, wasqueueconnectionfactorydlg);
        wasqueueconnectionfactorydlg.show();
        String s = wasqueueconnectionfactorydlg.getManagedObjectName();
        if(s == null)
            return;
        JMSWrapXAQueueConnectionFactory jmswrapxaqueueconnectionfactory = wasqueueconnectionfactorydlg.getWASQueueConnectionFactory();
        try
        {
            jndiNameSpace.bind(s, jmswrapxaqueueconnectionfactory);
            JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
            jmstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    private void createWASTopicConnectionFactory()
    {
        WASTopicConnectionFactoryDlg wastopicconnectionfactorydlg = new WASTopicConnectionFactoryDlg();
        wastopicconnectionfactorydlg.setFromWASTopicConnectionFactory(new JMSWrapXATopicConnectionFactory(new MQXATopicConnectionFactory()));
        wastopicconnectionfactorydlg.setTitle("Create new WAS Topic Connection Factory");
        wastopicconnectionfactorydlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, wastopicconnectionfactorydlg);
        wastopicconnectionfactorydlg.show();
        String s = wastopicconnectionfactorydlg.getManagedObjectName();
        if(s == null)
            return;
        JMSWrapXATopicConnectionFactory jmswrapxatopicconnectionfactory = wastopicconnectionfactorydlg.getWASTopicConnectionFactory();
        try
        {
            jndiNameSpace.bind(s, jmswrapxatopicconnectionfactory);
            JMSTableModel jmstablemodel = (JMSTableModel)getTable().getModel();
            jmstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    private JScrollPane ivjJScrollPane1;
    private JTable ivjTable;
    private JNDINameSpace jndiNameSpace;
    IvjEventHandler ivjEventHandler;
    private JMenuItem ivjJMenuItem1;
    private JPopupMenu ivjPopupMenu;
    private JMenuItem ivjJMenuItem2;
    private JSeparator ivjJSeparator1;
    private JMenuItem ivjJMenuItem3;











}
