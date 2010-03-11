// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WASTopicConnectionFactoryDlg.java

package com.kolban.mqjexplorer.jms;

import com.ibm.ejs.jms.mq.JMSWrapXATopicConnectionFactory;
import com.ibm.mq.jms.*;
import com.kolban.mqjexplorer.mqattributes.*;
import com.kolban.swing.Footer;
import com.kolban.swing.FooterListener;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.util.EventObject;
import javax.swing.*;
import javax.swing.text.JTextComponent;

// Referenced classes of package com.kolban.mqjexplorer.jms:
//            XATopicConnectionFactoryDlg

public class WASTopicConnectionFactoryDlg extends JDialog
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
            if(windowevent.getSource() == WASTopicConnectionFactoryDlg.this)
                connEtoC3(windowevent);
            if(windowevent.getSource() == WASTopicConnectionFactoryDlg.this)
                connEtoC4(windowevent);
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


    public WASTopicConnectionFactoryDlg()
    {
        ivjFooter = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel19 = null;
        ivjJLabel20 = null;
        ivjJLabel21 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjTabPanel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
        initialize();
    }

    public WASTopicConnectionFactoryDlg(Dialog dialog)
    {
        super(dialog);
        ivjFooter = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel19 = null;
        ivjJLabel20 = null;
        ivjJLabel21 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjTabPanel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public WASTopicConnectionFactoryDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjFooter = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel19 = null;
        ivjJLabel20 = null;
        ivjJLabel21 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjTabPanel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public WASTopicConnectionFactoryDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjFooter = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel19 = null;
        ivjJLabel20 = null;
        ivjJLabel21 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjTabPanel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public WASTopicConnectionFactoryDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjFooter = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel19 = null;
        ivjJLabel20 = null;
        ivjJLabel21 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjTabPanel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public WASTopicConnectionFactoryDlg(Frame frame)
    {
        super(frame);
        ivjFooter = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel19 = null;
        ivjJLabel20 = null;
        ivjJLabel21 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjTabPanel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public WASTopicConnectionFactoryDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjFooter = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel19 = null;
        ivjJLabel20 = null;
        ivjJLabel21 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjTabPanel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public WASTopicConnectionFactoryDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjFooter = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel19 = null;
        ivjJLabel20 = null;
        ivjJLabel21 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjTabPanel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public WASTopicConnectionFactoryDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjFooter = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel19 = null;
        ivjJLabel20 = null;
        ivjJLabel21 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjTabPanel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    private void cancel()
    {
        dispose();
        returnCode = 2;
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

    private void connEtoC4(WindowEvent windowevent)
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

    private JPanel getBroker()
    {
        if(ivjBroker == null)
            try
            {
                ivjBroker = new JPanel();
                ivjBroker.setName("Broker");
                ivjBroker.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getJLabel16(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getJLabel17(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getJLabel18(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getJLabel19(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getJLabel20(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 5;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getJLabel21(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 1;
                gridbagconstraints6.gridy = 1;
                gridbagconstraints6.fill = 2;
                gridbagconstraints6.weightx = 1.0D;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getPublishQueue(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 1;
                gridbagconstraints7.gridy = 2;
                gridbagconstraints7.fill = 2;
                gridbagconstraints7.weightx = 1.0D;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getSubscriptionQueue(), gridbagconstraints7);
                GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
                gridbagconstraints8.gridx = 1;
                gridbagconstraints8.gridy = 3;
                gridbagconstraints8.fill = 2;
                gridbagconstraints8.weightx = 1.0D;
                gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getConsumerQueue(), gridbagconstraints8);
                GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
                gridbagconstraints9.gridx = 1;
                gridbagconstraints9.gridy = 5;
                gridbagconstraints9.fill = 2;
                gridbagconstraints9.weightx = 1.0D;
                gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getControlQueue(), gridbagconstraints9);
                GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
                gridbagconstraints10.gridx = 1;
                gridbagconstraints10.gridy = 4;
                gridbagconstraints10.fill = 2;
                gridbagconstraints10.weightx = 1.0D;
                gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getBrokerQueueManager(), gridbagconstraints10);
                GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
                gridbagconstraints11.gridx = 1;
                gridbagconstraints11.gridy = 0;
                gridbagconstraints11.fill = 2;
                gridbagconstraints11.weightx = 1.0D;
                gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getVersion(), gridbagconstraints11);
                GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
                gridbagconstraints12.gridx = 0;
                gridbagconstraints12.gridy = 6;
                gridbagconstraints12.gridwidth = 2;
                gridbagconstraints12.fill = 1;
                gridbagconstraints12.weightx = 1.0D;
                gridbagconstraints12.weighty = 1.0D;
                gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
                getBroker().add(getJPanel2(), gridbagconstraints12);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBroker;
    }

    private QMgrName getBrokerQueueManager()
    {
        if(ivjBrokerQueueManager == null)
            try
            {
                ivjBrokerQueueManager = new QMgrName();
                ivjBrokerQueueManager.setName("BrokerQueueManager");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrokerQueueManager;
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

    private QName getConsumerQueue()
    {
        if(ivjConsumerQueue == null)
            try
            {
                ivjConsumerQueue = new QName();
                ivjConsumerQueue.setName("ConsumerQueue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjConsumerQueue;
    }

    private QName getControlQueue()
    {
        if(ivjControlQueue == null)
            try
            {
                ivjControlQueue = new QName();
                ivjControlQueue.setName("ControlQueue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjControlQueue;
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
                ivjFactoryName.setColumns(30);
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

    private JPanel getGeneral()
    {
        if(ivjGeneral == null)
            try
            {
                ivjGeneral = new JPanel();
                ivjGeneral.setName("General");
                ivjGeneral.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJLabel7(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJLabel8(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJLabel9(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJLabel10(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJLabel11(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 0;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.weightx = 1.0D;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getFactoryName(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 1;
                gridbagconstraints6.gridy = 1;
                gridbagconstraints6.fill = 2;
                gridbagconstraints6.weightx = 1.0D;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getDescription(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 1;
                gridbagconstraints7.gridy = 2;
                gridbagconstraints7.anchor = 17;
                gridbagconstraints7.insets = new Insets(0, 4, 0, 4);
                getGeneral().add(getTransport(), gridbagconstraints7);
                GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
                gridbagconstraints8.gridx = 1;
                gridbagconstraints8.gridy = 3;
                gridbagconstraints8.fill = 2;
                gridbagconstraints8.weightx = 1.0D;
                gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getClientID(), gridbagconstraints8);
                GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
                gridbagconstraints9.gridx = 1;
                gridbagconstraints9.gridy = 4;
                gridbagconstraints9.fill = 2;
                gridbagconstraints9.weightx = 1.0D;
                gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getQueueManager(), gridbagconstraints9);
                GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
                gridbagconstraints10.gridx = 0;
                gridbagconstraints10.gridy = 5;
                gridbagconstraints10.gridwidth = 2;
                gridbagconstraints10.fill = 1;
                gridbagconstraints10.weightx = 1.0D;
                gridbagconstraints10.weighty = 1.0D;
                gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJPanel1(), gridbagconstraints10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjGeneral;
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
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getTabPanel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JLabel getJLabel10()
    {
        if(ivjJLabel10 == null)
            try
            {
                ivjJLabel10 = new JLabel();
                ivjJLabel10.setName("JLabel10");
                ivjJLabel10.setText("Client ID:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel10;
    }

    private JLabel getJLabel11()
    {
        if(ivjJLabel11 == null)
            try
            {
                ivjJLabel11 = new JLabel();
                ivjJLabel11.setName("JLabel11");
                ivjJLabel11.setText("Queue Manager:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel11;
    }

    private JLabel getJLabel16()
    {
        if(ivjJLabel16 == null)
            try
            {
                ivjJLabel16 = new JLabel();
                ivjJLabel16.setName("JLabel16");
                ivjJLabel16.setText("Version:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel16;
    }

    private JLabel getJLabel17()
    {
        if(ivjJLabel17 == null)
            try
            {
                ivjJLabel17 = new JLabel();
                ivjJLabel17.setName("JLabel17");
                ivjJLabel17.setText("Publish Queue:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel17;
    }

    private JLabel getJLabel18()
    {
        if(ivjJLabel18 == null)
            try
            {
                ivjJLabel18 = new JLabel();
                ivjJLabel18.setName("JLabel18");
                ivjJLabel18.setText("Subscription Queue:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel18;
    }

    private JLabel getJLabel19()
    {
        if(ivjJLabel19 == null)
            try
            {
                ivjJLabel19 = new JLabel();
                ivjJLabel19.setName("JLabel19");
                ivjJLabel19.setText("Consumer Queue:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel19;
    }

    private JLabel getJLabel20()
    {
        if(ivjJLabel20 == null)
            try
            {
                ivjJLabel20 = new JLabel();
                ivjJLabel20.setName("JLabel20");
                ivjJLabel20.setText("Queue Manager:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel20;
    }

    private JLabel getJLabel21()
    {
        if(ivjJLabel21 == null)
            try
            {
                ivjJLabel21 = new JLabel();
                ivjJLabel21.setName("JLabel21");
                ivjJLabel21.setText("Control Queue:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel21;
    }

    private JLabel getJLabel7()
    {
        if(ivjJLabel7 == null)
            try
            {
                ivjJLabel7 = new JLabel();
                ivjJLabel7.setName("JLabel7");
                ivjJLabel7.setText("Factory Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel7;
    }

    private JLabel getJLabel8()
    {
        if(ivjJLabel8 == null)
            try
            {
                ivjJLabel8 = new JLabel();
                ivjJLabel8.setName("JLabel8");
                ivjJLabel8.setText("Description:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel8;
    }

    private JLabel getJLabel9()
    {
        if(ivjJLabel9 == null)
            try
            {
                ivjJLabel9 = new JLabel();
                ivjJLabel9.setName("JLabel9");
                ivjJLabel9.setText("Transport:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel9;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JPanel getJPanel2()
    {
        if(ivjJPanel2 == null)
            try
            {
                ivjJPanel2 = new JPanel();
                ivjJPanel2.setName("JPanel2");
                ivjJPanel2.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
    }

    public String getManagedObjectName()
    {
        return managedObjectName;
    }

    private QName getPublishQueue()
    {
        if(ivjPublishQueue == null)
            try
            {
                ivjPublishQueue = new QName();
                ivjPublishQueue.setName("PublishQueue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPublishQueue;
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

    public int getReturnCode()
    {
        return returnCode;
    }

    private QName getSubscriptionQueue()
    {
        if(ivjSubscriptionQueue == null)
            try
            {
                ivjSubscriptionQueue = new QName();
                ivjSubscriptionQueue.setName("SubscriptionQueue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSubscriptionQueue;
    }

    private JTabbedPane getTabPanel()
    {
        if(ivjTabPanel == null)
            try
            {
                ivjTabPanel = new JTabbedPane();
                ivjTabPanel.setName("TabPanel");
                ivjTabPanel.insertTab("General", null, getGeneral(), null, 0);
                ivjTabPanel.insertTab("Broker", null, getBroker(), null, 1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTabPanel;
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

    private JTextField getVersion()
    {
        if(ivjVersion == null)
            try
            {
                ivjVersion = new JTextField();
                ivjVersion.setName("Version");
                ivjVersion.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjVersion;
    }

    public JMSWrapXATopicConnectionFactory getWASTopicConnectionFactory()
    {
        JMSWrapXATopicConnectionFactory jmswrapxatopicconnectionfactory = new JMSWrapXATopicConnectionFactory(xaTopicConnectionFactory);
        return jmswrapxatopicconnectionfactory;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        addWindowListener(ivjEventHandler);
        getFooter().addFooterListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("TopicConnectionFactory");
            setDefaultCloseOperation(0);
            setSize(426, 373);
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
            XATopicConnectionFactoryDlg xatopicconnectionfactorydlg = new XATopicConnectionFactoryDlg();
            xatopicconnectionfactorydlg.setModal(true);
            xatopicconnectionfactorydlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            xatopicconnectionfactorydlg.show();
            Insets insets = xatopicconnectionfactorydlg.getInsets();
            xatopicconnectionfactorydlg.setSize(xatopicconnectionfactorydlg.getWidth() + insets.left + insets.right, xatopicconnectionfactorydlg.getHeight() + insets.top + insets.bottom);
            xatopicconnectionfactorydlg.setVisible(true);
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
        xaTopicConnectionFactory = new MQXATopicConnectionFactory();
        xaTopicConnectionFactory.setDescription(getDescription().getText());
        try
        {
            xaTopicConnectionFactory.setTransportType(getTransport().getValue());
            xaTopicConnectionFactory.setClientId(getClientID().getText());
            xaTopicConnectionFactory.setQueueManager(getQueueManager().getText());
            xaTopicConnectionFactory.setBrokerControlQueue(getControlQueue().getText());
            xaTopicConnectionFactory.setBrokerCCSubQueue(getConsumerQueue().getText());
            xaTopicConnectionFactory.setBrokerPubQueue(getPublishQueue().getText());
            xaTopicConnectionFactory.setBrokerQueueManager(getBrokerQueueManager().getText());
            xaTopicConnectionFactory.setBrokerSubQueue(getSubscriptionQueue().getText());
            returnCode = 1;
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        dispose();
    }

    public void setFromWASTopicConnectionFactory(JMSWrapXATopicConnectionFactory jmswrapxatopicconnectionfactory)
    {
        MQXATopicConnectionFactory mqxatopicconnectionfactory = (MQXATopicConnectionFactory)jmswrapxatopicconnectionfactory.getProviderObject();
        getDescription().setText(mqxatopicconnectionfactory.getDescription());
        getTransport().setValue(mqxatopicconnectionfactory.getTransportType());
        getClientID().setText(mqxatopicconnectionfactory.getClientId());
        getQueueManager().setText(mqxatopicconnectionfactory.getQueueManager());
        getConsumerQueue().setText(mqxatopicconnectionfactory.getBrokerCCSubQueue());
        getControlQueue().setText(mqxatopicconnectionfactory.getBrokerControlQueue());
        getPublishQueue().setText(mqxatopicconnectionfactory.getBrokerPubQueue());
        getSubscriptionQueue().setText(mqxatopicconnectionfactory.getBrokerSubQueue());
        getBrokerQueueManager().setText(mqxatopicconnectionfactory.getBrokerQueueManager());
        getVersion().setText(Integer.toString(mqxatopicconnectionfactory.getVersion()));
    }

    public void setManagedObjectName(String s)
    {
        managedObjectName = s;
        getFactoryName().setText(managedObjectName);
        getFactoryName().setEditable(false);
    }

    private Footer ivjFooter;
    private JPanel ivjGeneral;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private JPanel ivjBroker;
    private JLabel ivjJLabel10;
    private JLabel ivjJLabel11;
    private JLabel ivjJLabel16;
    private JLabel ivjJLabel17;
    private JLabel ivjJLabel18;
    private JLabel ivjJLabel19;
    private JLabel ivjJLabel20;
    private JLabel ivjJLabel21;
    private JLabel ivjJLabel7;
    private JLabel ivjJLabel8;
    private JLabel ivjJLabel9;
    private JTabbedPane ivjTabPanel;
    private JTextField ivjClientID;
    private JTextField ivjDescription;
    private JTextField ivjFactoryName;
    private JTextField ivjQueueManager;
    private JMSTransport ivjTransport;
    IvjEventHandler ivjEventHandler;
    private String managedObjectName;
    private MQXATopicConnectionFactory xaTopicConnectionFactory;
    public static final int OK = 1;
    public static final int CANCEL = 2;
    private int returnCode;
    private QMgrName ivjBrokerQueueManager;
    private QName ivjConsumerQueue;
    private QName ivjControlQueue;
    private QName ivjPublishQueue;
    private QName ivjSubscriptionQueue;
    private JTextField ivjVersion;
    private JPanel ivjJPanel2;





}
