// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WASQueueConnectionFactoryDlg.java

package com.kolban.mqjexplorer.jms;

import com.ibm.ejs.jms.mq.JMSWrapXAQueueConnectionFactory;
import com.ibm.mq.jms.*;
import com.kolban.mqjexplorer.mqattributes.JMSMessageRetention;
import com.kolban.mqjexplorer.mqattributes.JMSTransport;
import com.kolban.swing.Footer;
import com.kolban.swing.FooterListener;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.util.EventObject;
import javax.swing.*;
import javax.swing.text.JTextComponent;

// Referenced classes of package com.kolban.mqjexplorer.jms:
//            XAQueueConnectionFactoryDlg

public class WASQueueConnectionFactoryDlg extends JDialog
{
    class IvjEventHandler
        implements FooterListener, WindowListener
    {

        public void cancel(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC1(eventobject);
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
            if(windowevent.getSource() == WASQueueConnectionFactoryDlg.this)
                connEtoC3(windowevent);
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


    public WASQueueConnectionFactoryDlg()
    {
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJPanel1 = null;
        ivjQueueManager = null;
        ivjRetention = null;
        ivjTempModel = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = "";
        initialize();
    }

    public WASQueueConnectionFactoryDlg(Dialog dialog)
    {
        super(dialog);
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJPanel1 = null;
        ivjQueueManager = null;
        ivjRetention = null;
        ivjTempModel = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = "";
    }

    public WASQueueConnectionFactoryDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJPanel1 = null;
        ivjQueueManager = null;
        ivjRetention = null;
        ivjTempModel = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = "";
    }

    public WASQueueConnectionFactoryDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJPanel1 = null;
        ivjQueueManager = null;
        ivjRetention = null;
        ivjTempModel = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = "";
    }

    public WASQueueConnectionFactoryDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJPanel1 = null;
        ivjQueueManager = null;
        ivjRetention = null;
        ivjTempModel = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = "";
    }

    public WASQueueConnectionFactoryDlg(Frame frame)
    {
        super(frame);
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJPanel1 = null;
        ivjQueueManager = null;
        ivjRetention = null;
        ivjTempModel = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = "";
    }

    public WASQueueConnectionFactoryDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJPanel1 = null;
        ivjQueueManager = null;
        ivjRetention = null;
        ivjTempModel = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = "";
    }

    public WASQueueConnectionFactoryDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJPanel1 = null;
        ivjQueueManager = null;
        ivjRetention = null;
        ivjTempModel = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = "";
    }

    public WASQueueConnectionFactoryDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJPanel1 = null;
        ivjQueueManager = null;
        ivjRetention = null;
        ivjTempModel = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = "";
    }

    public void cancel()
    {
        returnCode = 2;
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

    private void connEtoC3(WindowEvent windowevent)
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

    private JTextField getClientID()
    {
        if(ivjClientID == null)
            try
            {
                ivjClientID = new JTextField();
                ivjClientID.setName("ClientID");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClientID;
    }

    private JTextField getDescription()
    {
        if(ivjDescription == null)
            try
            {
                ivjDescription = new JTextField();
                ivjDescription.setName("Description");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDescription;
    }

    private JTextField getFactoryName()
    {
        if(ivjFactoryName == null)
            try
            {
                ivjFactoryName = new JTextField();
                ivjFactoryName.setName("FactoryName");
                ivjFactoryName.setColumns(40);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFactoryName;
    }

    private Footer getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new Footer();
                ivjFooter.setName("Footer");
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
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
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
                ivjJLabel1.setText("Factory Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("Description:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
    }

    private JLabel getJLabel3()
    {
        if(ivjJLabel3 == null)
            try
            {
                ivjJLabel3 = new JLabel();
                ivjJLabel3.setName("JLabel3");
                ivjJLabel3.setText("Transport:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel3;
    }

    private JLabel getJLabel4()
    {
        if(ivjJLabel4 == null)
            try
            {
                ivjJLabel4 = new JLabel();
                ivjJLabel4.setName("JLabel4");
                ivjJLabel4.setText("Client ID:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel4;
    }

    private JLabel getJLabel5()
    {
        if(ivjJLabel5 == null)
            try
            {
                ivjJLabel5 = new JLabel();
                ivjJLabel5.setName("JLabel5");
                ivjJLabel5.setText("Queue Manager:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel5;
    }

    private JLabel getJLabel6()
    {
        if(ivjJLabel6 == null)
            try
            {
                ivjJLabel6 = new JLabel();
                ivjJLabel6.setName("JLabel6");
                ivjJLabel6.setText("Temp Model:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel6;
    }

    private JLabel getJLabel7()
    {
        if(ivjJLabel7 == null)
            try
            {
                ivjJLabel7 = new JLabel();
                ivjJLabel7.setName("JLabel7");
                ivjJLabel7.setText("Retention:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel7;
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
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel3(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel4(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel5(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 5;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel6(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 6;
                gridbagconstraints6.anchor = 17;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel7(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 1;
                gridbagconstraints7.gridy = 0;
                gridbagconstraints7.fill = 2;
                gridbagconstraints7.weightx = 1.0D;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getFactoryName(), gridbagconstraints7);
                GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
                gridbagconstraints8.gridx = 1;
                gridbagconstraints8.gridy = 1;
                gridbagconstraints8.fill = 2;
                gridbagconstraints8.weightx = 1.0D;
                gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getDescription(), gridbagconstraints8);
                GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
                gridbagconstraints9.gridx = 1;
                gridbagconstraints9.gridy = 2;
                gridbagconstraints9.anchor = 17;
                gridbagconstraints9.weightx = 1.0D;
                gridbagconstraints9.insets = new Insets(0, 4, 0, 4);
                getJPanel1().add(getTransport(), gridbagconstraints9);
                GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
                gridbagconstraints10.gridx = 1;
                gridbagconstraints10.gridy = 3;
                gridbagconstraints10.fill = 2;
                gridbagconstraints10.weightx = 1.0D;
                gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getClientID(), gridbagconstraints10);
                GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
                gridbagconstraints11.gridx = 1;
                gridbagconstraints11.gridy = 4;
                gridbagconstraints11.fill = 2;
                gridbagconstraints11.weightx = 1.0D;
                gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getQueueManager(), gridbagconstraints11);
                GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
                gridbagconstraints12.gridx = 1;
                gridbagconstraints12.gridy = 5;
                gridbagconstraints12.fill = 2;
                gridbagconstraints12.weightx = 1.0D;
                gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getTempModel(), gridbagconstraints12);
                GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
                gridbagconstraints13.gridx = 1;
                gridbagconstraints13.gridy = 6;
                gridbagconstraints13.anchor = 17;
                gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getRetention(), gridbagconstraints13);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    public String getManagedObjectName()
    {
        return managedObjectName;
    }

    private JTextField getQueueManager()
    {
        if(ivjQueueManager == null)
            try
            {
                ivjQueueManager = new JTextField();
                ivjQueueManager.setName("QueueManager");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQueueManager;
    }

    private JMSMessageRetention getRetention()
    {
        if(ivjRetention == null)
            try
            {
                ivjRetention = new JMSMessageRetention();
                ivjRetention.setName("Retention");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRetention;
    }

    public int getReturnCode()
    {
        return returnCode;
    }

    private JTextField getTempModel()
    {
        if(ivjTempModel == null)
            try
            {
                ivjTempModel = new JTextField();
                ivjTempModel.setName("TempModel");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTempModel;
    }

    private JMSTransport getTransport()
    {
        if(ivjTransport == null)
            try
            {
                ivjTransport = new JMSTransport();
                ivjTransport.setName("Transport");
                ivjTransport.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTransport;
    }

    public JMSWrapXAQueueConnectionFactory getWASQueueConnectionFactory()
    {
        JMSWrapXAQueueConnectionFactory jmswrapxaqueueconnectionfactory = new JMSWrapXAQueueConnectionFactory(xaQueueConnectionFactory);
        return jmswrapxaqueueconnectionfactory;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getFooter().addFooterListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("XAQueueConnectionFactoryDlg");
            setDefaultCloseOperation(0);
            setSize(426, 489);
            setModal(true);
            setResizable(false);
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
            XAQueueConnectionFactoryDlg xaqueueconnectionfactorydlg = new XAQueueConnectionFactoryDlg();
            xaqueueconnectionfactorydlg.setModal(true);
            xaqueueconnectionfactorydlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            xaqueueconnectionfactorydlg.show();
            Insets insets = xaqueueconnectionfactorydlg.getInsets();
            xaqueueconnectionfactorydlg.setSize(xaqueueconnectionfactorydlg.getWidth() + insets.left + insets.right, xaqueueconnectionfactorydlg.getHeight() + insets.top + insets.bottom);
            xaqueueconnectionfactorydlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void ok()
    {
        managedObjectName = getFactoryName().getText();
        xaQueueConnectionFactory = new MQXAQueueConnectionFactory();
        xaQueueConnectionFactory.setDescription(getDescription().getText());
        try
        {
            xaQueueConnectionFactory.setTransportType(getTransport().getValue());
            xaQueueConnectionFactory.setClientId(getClientID().getText());
            xaQueueConnectionFactory.setQueueManager(getQueueManager().getText());
            xaQueueConnectionFactory.setTemporaryModel(getTempModel().getText());
            xaQueueConnectionFactory.setMessageRetention(getRetention().getValue());
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        returnCode = 1;
        dispose();
    }

    public void setFromWASQueueConnectionFactory(JMSWrapXAQueueConnectionFactory jmswrapxaqueueconnectionfactory)
    {
        MQXAQueueConnectionFactory mqxaqueueconnectionfactory = (MQXAQueueConnectionFactory)jmswrapxaqueueconnectionfactory.getProviderObject();
        getDescription().setText(mqxaqueueconnectionfactory.getDescription());
        getTransport().setValue(mqxaqueueconnectionfactory.getTransportType());
        getClientID().setText(mqxaqueueconnectionfactory.getClientId());
        getQueueManager().setText(mqxaqueueconnectionfactory.getQueueManager());
        getTempModel().setText(mqxaqueueconnectionfactory.getTemporaryModel());
        getRetention().setValue(mqxaqueueconnectionfactory.getMessageRetention());
    }

    public void setManagedObjectName(String s)
    {
        managedObjectName = s;
        getFactoryName().setText(managedObjectName);
        getFactoryName().setEditable(false);
    }

    private JTextField ivjClientID;
    private JTextField ivjDescription;
    private JTextField ivjFactoryName;
    private Footer ivjFooter;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private JPanel ivjJPanel1;
    private JTextField ivjQueueManager;
    private JMSMessageRetention ivjRetention;
    private JTextField ivjTempModel;
    private JMSTransport ivjTransport;
    public static final int OK = 1;
    public static final int CANCEL = 2;
    private int returnCode;
    IvjEventHandler ivjEventHandler;
    private String managedObjectName;
    private MQXAQueueConnectionFactory xaQueueConnectionFactory;




}
