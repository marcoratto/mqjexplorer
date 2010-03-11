// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TopicConnectionFactoryDlg.java

package com.kolban.mqjexplorer.jms;

import com.ibm.mq.jms.MQTopicConnectionFactory;
import com.kolban.mqjexplorer.mqattributes.*;
import com.kolban.swing.NumericTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TopicConnectionFactoryDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener, WindowListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJButton1())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getJButton2())
                connEtoC2(actionevent);
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
            if(windowevent.getSource() == TopicConnectionFactoryDlg.this)
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


    public TopicConnectionFactoryDlg()
    {
        ivjExits = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjGeneral = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
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
        ivjCCSID = null;
        ivjChannel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjHostName = null;
        ivjPort = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjReceiveExit = null;
        ivjReceiveExitData = null;
        ivjSecurityExit = null;
        ivjSecurityExitData = null;
        ivjSendExit = null;
        ivjSendExitData = null;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
        initialize();
    }

    public TopicConnectionFactoryDlg(Dialog dialog)
    {
        super(dialog);
        ivjExits = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjGeneral = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
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
        ivjCCSID = null;
        ivjChannel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjHostName = null;
        ivjPort = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjReceiveExit = null;
        ivjReceiveExitData = null;
        ivjSecurityExit = null;
        ivjSecurityExitData = null;
        ivjSendExit = null;
        ivjSendExitData = null;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public TopicConnectionFactoryDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjExits = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjGeneral = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
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
        ivjCCSID = null;
        ivjChannel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjHostName = null;
        ivjPort = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjReceiveExit = null;
        ivjReceiveExitData = null;
        ivjSecurityExit = null;
        ivjSecurityExitData = null;
        ivjSendExit = null;
        ivjSendExitData = null;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public TopicConnectionFactoryDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjExits = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjGeneral = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
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
        ivjCCSID = null;
        ivjChannel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjHostName = null;
        ivjPort = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjReceiveExit = null;
        ivjReceiveExitData = null;
        ivjSecurityExit = null;
        ivjSecurityExitData = null;
        ivjSendExit = null;
        ivjSendExitData = null;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public TopicConnectionFactoryDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjExits = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjGeneral = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
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
        ivjCCSID = null;
        ivjChannel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjHostName = null;
        ivjPort = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjReceiveExit = null;
        ivjReceiveExitData = null;
        ivjSecurityExit = null;
        ivjSecurityExitData = null;
        ivjSendExit = null;
        ivjSendExitData = null;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public TopicConnectionFactoryDlg(Frame frame)
    {
        super(frame);
        ivjExits = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjGeneral = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
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
        ivjCCSID = null;
        ivjChannel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjHostName = null;
        ivjPort = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjReceiveExit = null;
        ivjReceiveExitData = null;
        ivjSecurityExit = null;
        ivjSecurityExitData = null;
        ivjSendExit = null;
        ivjSendExitData = null;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public TopicConnectionFactoryDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjExits = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjGeneral = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
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
        ivjCCSID = null;
        ivjChannel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjHostName = null;
        ivjPort = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjReceiveExit = null;
        ivjReceiveExitData = null;
        ivjSecurityExit = null;
        ivjSecurityExitData = null;
        ivjSendExit = null;
        ivjSendExitData = null;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public TopicConnectionFactoryDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjExits = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjGeneral = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
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
        ivjCCSID = null;
        ivjChannel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjHostName = null;
        ivjPort = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjReceiveExit = null;
        ivjReceiveExitData = null;
        ivjSecurityExit = null;
        ivjSecurityExitData = null;
        ivjSendExit = null;
        ivjSendExitData = null;
        ivjBrokerQueueManager = null;
        ivjConsumerQueue = null;
        ivjControlQueue = null;
        ivjPublishQueue = null;
        ivjSubscriptionQueue = null;
        ivjVersion = null;
        ivjJPanel2 = null;
    }

    public TopicConnectionFactoryDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjExits = null;
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjGeneral = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjBroker = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
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
        ivjCCSID = null;
        ivjChannel = null;
        ivjClientID = null;
        ivjDescription = null;
        ivjFactoryName = null;
        ivjHostName = null;
        ivjPort = null;
        ivjQueueManager = null;
        ivjTransport = null;
        ivjEventHandler = new IvjEventHandler();
        managedObjectName = null;
        returnCode = 0;
        ivjReceiveExit = null;
        ivjReceiveExitData = null;
        ivjSecurityExit = null;
        ivjSecurityExitData = null;
        ivjSendExit = null;
        ivjSendExitData = null;
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

    private void connEtoC1(ActionEvent actionevent)
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

    private void connEtoC2(ActionEvent actionevent)
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

    private CodedCharSetId getCCSID()
    {
        if(ivjCCSID == null)
            try
            {
                ivjCCSID = new CodedCharSetId();
                ivjCCSID.setName("CCSID");
                ivjCCSID.setMinimumSize(new Dimension(55, 20));
                ivjCCSID.setColumns(5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCCSID;
    }

    private JTextField getChannel()
    {
        if(ivjChannel == null)
            try
            {
                ivjChannel = new JTextField();
                ivjChannel.setName("Channel");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjChannel;
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

    private JPanel getExits()
    {
        if(ivjExits == null)
            try
            {
                ivjExits = new JPanel();
                ivjExits.setName("Exits");
                ivjExits.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getExits().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getExits().add(getJLabel2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getExits().add(getJLabel3(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getExits().add(getJLabel4(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getExits().add(getJLabel5(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 5;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getExits().add(getJLabel6(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 1;
                gridbagconstraints6.gridy = 0;
                gridbagconstraints6.fill = 2;
                gridbagconstraints6.weightx = 1.0D;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getExits().add(getReceiveExit(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 1;
                gridbagconstraints7.gridy = 1;
                gridbagconstraints7.fill = 2;
                gridbagconstraints7.weightx = 1.0D;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getExits().add(getReceiveExitData(), gridbagconstraints7);
                GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
                gridbagconstraints8.gridx = 1;
                gridbagconstraints8.gridy = 2;
                gridbagconstraints8.fill = 2;
                gridbagconstraints8.weightx = 1.0D;
                gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
                getExits().add(getSendExit(), gridbagconstraints8);
                GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
                gridbagconstraints9.gridx = 1;
                gridbagconstraints9.gridy = 3;
                gridbagconstraints9.fill = 2;
                gridbagconstraints9.weightx = 1.0D;
                gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
                getExits().add(getSendExitData(), gridbagconstraints9);
                GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
                gridbagconstraints10.gridx = 1;
                gridbagconstraints10.gridy = 4;
                gridbagconstraints10.fill = 2;
                gridbagconstraints10.weightx = 1.0D;
                gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
                getExits().add(getSecurityExit(), gridbagconstraints10);
                GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
                gridbagconstraints11.gridx = 1;
                gridbagconstraints11.gridy = 5;
                gridbagconstraints11.fill = 2;
                gridbagconstraints11.weightx = 1.0D;
                gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
                getExits().add(getSecurityExitData(), gridbagconstraints11);
                GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
                gridbagconstraints12.gridx = 0;
                gridbagconstraints12.gridy = 6;
                gridbagconstraints12.gridwidth = 2;
                gridbagconstraints12.fill = 1;
                gridbagconstraints12.weightx = 1.0D;
                gridbagconstraints12.weighty = 1.0D;
                gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
                getExits().add(getJPanel1(), gridbagconstraints12);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExits;
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

    private JPanel getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new JPanel();
                ivjFooter.setName("Footer");
                ivjFooter.setLayout(getFooterFlowLayout());
                getFooter().add(getJButton2(), getJButton2().getName());
                getFooter().add(getJButton1(), getJButton1().getName());
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
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 5;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJLabel12(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 6;
                gridbagconstraints6.anchor = 17;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJLabel13(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 0;
                gridbagconstraints7.gridy = 7;
                gridbagconstraints7.anchor = 17;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJLabel14(), gridbagconstraints7);
                GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
                gridbagconstraints8.gridx = 0;
                gridbagconstraints8.gridy = 8;
                gridbagconstraints8.anchor = 17;
                gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getJLabel15(), gridbagconstraints8);
                GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
                gridbagconstraints9.gridx = 1;
                gridbagconstraints9.gridy = 0;
                gridbagconstraints9.fill = 2;
                gridbagconstraints9.weightx = 1.0D;
                gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getFactoryName(), gridbagconstraints9);
                GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
                gridbagconstraints10.gridx = 1;
                gridbagconstraints10.gridy = 1;
                gridbagconstraints10.fill = 2;
                gridbagconstraints10.weightx = 1.0D;
                gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getDescription(), gridbagconstraints10);
                GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
                gridbagconstraints11.gridx = 1;
                gridbagconstraints11.gridy = 2;
                gridbagconstraints11.anchor = 17;
                gridbagconstraints11.insets = new Insets(0, 4, 0, 4);
                getGeneral().add(getTransport(), gridbagconstraints11);
                GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
                gridbagconstraints12.gridx = 1;
                gridbagconstraints12.gridy = 3;
                gridbagconstraints12.fill = 2;
                gridbagconstraints12.weightx = 1.0D;
                gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getClientID(), gridbagconstraints12);
                GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
                gridbagconstraints13.gridx = 1;
                gridbagconstraints13.gridy = 4;
                gridbagconstraints13.fill = 2;
                gridbagconstraints13.weightx = 1.0D;
                gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getQueueManager(), gridbagconstraints13);
                GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
                gridbagconstraints14.gridx = 1;
                gridbagconstraints14.gridy = 5;
                gridbagconstraints14.anchor = 17;
                gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getPort(), gridbagconstraints14);
                GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
                gridbagconstraints15.gridx = 1;
                gridbagconstraints15.gridy = 6;
                gridbagconstraints15.fill = 2;
                gridbagconstraints15.weightx = 1.0D;
                gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getHostName(), gridbagconstraints15);
                GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
                gridbagconstraints16.gridx = 1;
                gridbagconstraints16.gridy = 7;
                gridbagconstraints16.fill = 2;
                gridbagconstraints16.weightx = 1.0D;
                gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getChannel(), gridbagconstraints16);
                GridBagConstraints gridbagconstraints17 = new GridBagConstraints();
                gridbagconstraints17.gridx = 1;
                gridbagconstraints17.gridy = 8;
                gridbagconstraints17.anchor = 17;
                gridbagconstraints17.weightx = 1.0D;
                gridbagconstraints17.insets = new Insets(4, 4, 4, 4);
                getGeneral().add(getCCSID(), gridbagconstraints17);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjGeneral;
    }

    private JTextField getHostName()
    {
        if(ivjHostName == null)
            try
            {
                ivjHostName = new JTextField();
                ivjHostName.setName("HostName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHostName;
    }

    private JButton getJButton1()
    {
        if(ivjJButton1 == null)
            try
            {
                ivjJButton1 = new JButton();
                ivjJButton1.setName("JButton1");
                ivjJButton1.setText("Cancel");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton1;
    }

    private JButton getJButton2()
    {
        if(ivjJButton2 == null)
            try
            {
                ivjJButton2 = new JButton();
                ivjJButton2.setName("JButton2");
                ivjJButton2.setText("OK");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton2;
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
                gridbagconstraints.gridy = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getTabPanel(), gridbagconstraints2);
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
                ivjJLabel1.setText("Receive Exit:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
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

    private JLabel getJLabel12()
    {
        if(ivjJLabel12 == null)
            try
            {
                ivjJLabel12 = new JLabel();
                ivjJLabel12.setName("JLabel12");
                ivjJLabel12.setText("Port:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel12;
    }

    private JLabel getJLabel13()
    {
        if(ivjJLabel13 == null)
            try
            {
                ivjJLabel13 = new JLabel();
                ivjJLabel13.setName("JLabel13");
                ivjJLabel13.setText("Host name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel13;
    }

    private JLabel getJLabel14()
    {
        if(ivjJLabel14 == null)
            try
            {
                ivjJLabel14 = new JLabel();
                ivjJLabel14.setName("JLabel14");
                ivjJLabel14.setText("Channel:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel14;
    }

    private JLabel getJLabel15()
    {
        if(ivjJLabel15 == null)
            try
            {
                ivjJLabel15 = new JLabel();
                ivjJLabel15.setName("JLabel15");
                ivjJLabel15.setText("CCSID:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel15;
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

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("Receive Exit Data:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
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

    private JLabel getJLabel3()
    {
        if(ivjJLabel3 == null)
            try
            {
                ivjJLabel3 = new JLabel();
                ivjJLabel3.setName("JLabel3");
                ivjJLabel3.setText("Send Exit:");
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
                ivjJLabel4.setText("Send Exit Data:");
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
                ivjJLabel5.setText("Security Exit:");
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
                ivjJLabel6.setText("Security Exit Data:");
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

    public String getManagedObjectName()
    {
        return managedObjectName;
    }

    private NumericTextField getPort()
    {
        if(ivjPort == null)
            try
            {
                ivjPort = new NumericTextField();
                ivjPort.setName("Port");
                ivjPort.setMinimumSize(new Dimension(55, 20));
                ivjPort.setColumns(5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPort;
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

    private JTextField getReceiveExit()
    {
        if(ivjReceiveExit == null)
            try
            {
                ivjReceiveExit = new JTextField();
                ivjReceiveExit.setName("ReceiveExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReceiveExit;
    }

    private JTextField getReceiveExitData()
    {
        if(ivjReceiveExitData == null)
            try
            {
                ivjReceiveExitData = new JTextField();
                ivjReceiveExitData.setName("ReceiveExitData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReceiveExitData;
    }

    public int getReturnCode()
    {
        return returnCode;
    }

    private JTextField getSecurityExit()
    {
        if(ivjSecurityExit == null)
            try
            {
                ivjSecurityExit = new JTextField();
                ivjSecurityExit.setName("SecurityExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSecurityExit;
    }

    private JTextField getSecurityExitData()
    {
        if(ivjSecurityExitData == null)
            try
            {
                ivjSecurityExitData = new JTextField();
                ivjSecurityExitData.setName("SecurityExitData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSecurityExitData;
    }

    private JTextField getSendExit()
    {
        if(ivjSendExit == null)
            try
            {
                ivjSendExit = new JTextField();
                ivjSendExit.setName("SendExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSendExit;
    }

    private JTextField getSendExitData()
    {
        if(ivjSendExitData == null)
            try
            {
                ivjSendExitData = new JTextField();
                ivjSendExitData.setName("SendExitData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSendExitData;
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
                ivjTabPanel.insertTab("Exits", null, getExits(), null, 2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTabPanel;
    }

    public MQTopicConnectionFactory getTopicConnectionFactory()
    {
        return topicConnectionFactory;
    }

    private JMSTransport getTransport()
    {
        if(ivjTransport == null)
            try
            {
                ivjTransport = new JMSTransport();
                ivjTransport.setName("Transport");
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

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getJButton1().addActionListener(ivjEventHandler);
        getJButton2().addActionListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
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
            TopicConnectionFactoryDlg topicconnectionfactorydlg = new TopicConnectionFactoryDlg();
            topicconnectionfactorydlg.setModal(true);
            topicconnectionfactorydlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            topicconnectionfactorydlg.show();
            Insets insets = topicconnectionfactorydlg.getInsets();
            topicconnectionfactorydlg.setSize(topicconnectionfactorydlg.getWidth() + insets.left + insets.right, topicconnectionfactorydlg.getHeight() + insets.top + insets.bottom);
            topicconnectionfactorydlg.setVisible(true);
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
        topicConnectionFactory = new MQTopicConnectionFactory();
        topicConnectionFactory.setDescription(getDescription().getText());
        try
        {
            topicConnectionFactory.setTransportType(getTransport().getValue());
            topicConnectionFactory.setClientId(getClientID().getText());
            topicConnectionFactory.setQueueManager(getQueueManager().getText());
            topicConnectionFactory.setPort(getPort().getIntValue());
            topicConnectionFactory.setHostName(getHostName().getText());
            topicConnectionFactory.setChannel(getChannel().getText());
            topicConnectionFactory.setCCSID(getCCSID().getValue());
            topicConnectionFactory.setBrokerControlQueue(getControlQueue().getText());
            topicConnectionFactory.setBrokerCCSubQueue(getConsumerQueue().getText());
            topicConnectionFactory.setBrokerPubQueue(getPublishQueue().getText());
            topicConnectionFactory.setBrokerQueueManager(getBrokerQueueManager().getText());
            topicConnectionFactory.setBrokerSubQueue(getSubscriptionQueue().getText());
            String s = getReceiveExit().getText().trim();
            topicConnectionFactory.setReceiveExit(s.length() != 0 ? s : null);
            topicConnectionFactory.setReceiveExitInit(getReceiveExitData().getText());
            s = getSendExit().getText().trim();
            topicConnectionFactory.setSendExit(s.length() != 0 ? s : null);
            topicConnectionFactory.setSendExitInit(getSendExitData().getText());
            s = getSecurityExit().getText().trim();
            topicConnectionFactory.setSecurityExit(s.length() != 0 ? s : null);
            topicConnectionFactory.setSecurityExitInit(getSecurityExitData().getText());
            returnCode = 1;
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        dispose();
    }

    public void setFromTopicConnectionFactory(MQTopicConnectionFactory mqtopicconnectionfactory)
    {
        getDescription().setText(mqtopicconnectionfactory.getDescription());
        getTransport().setValue(mqtopicconnectionfactory.getTransportType());
        getClientID().setText(mqtopicconnectionfactory.getClientId());
        getQueueManager().setText(mqtopicconnectionfactory.getQueueManager());
        getPort().setIntValue(mqtopicconnectionfactory.getPort());
        getHostName().setText(mqtopicconnectionfactory.getHostName());
        getChannel().setText(mqtopicconnectionfactory.getChannel());
        getCCSID().setValue(mqtopicconnectionfactory.getCCSID());
        getReceiveExit().setText(mqtopicconnectionfactory.getReceiveExit());
        getReceiveExitData().setText(mqtopicconnectionfactory.getReceiveExitInit());
        getSendExit().setText(mqtopicconnectionfactory.getSendExit());
        getSendExitData().setText(mqtopicconnectionfactory.getSendExitInit());
        getSecurityExit().setText(mqtopicconnectionfactory.getSecurityExit());
        getSecurityExitData().setText(mqtopicconnectionfactory.getSecurityExitInit());
        getConsumerQueue().setText(mqtopicconnectionfactory.getBrokerCCSubQueue());
        getControlQueue().setText(mqtopicconnectionfactory.getBrokerControlQueue());
        getPublishQueue().setText(mqtopicconnectionfactory.getBrokerPubQueue());
        getSubscriptionQueue().setText(mqtopicconnectionfactory.getBrokerSubQueue());
        getBrokerQueueManager().setText(mqtopicconnectionfactory.getBrokerQueueManager());
        getVersion().setText(Integer.toString(mqtopicconnectionfactory.getVersion()));
    }

    public void setManagedObjectName(String s)
    {
        managedObjectName = s;
        getFactoryName().setText(managedObjectName);
        getFactoryName().setEditable(false);
    }

    private JPanel ivjExits;
    private JPanel ivjFooter;
    private FlowLayout ivjFooterFlowLayout;
    private JPanel ivjGeneral;
    private JButton ivjJButton1;
    private JButton ivjJButton2;
    private JPanel ivjJDialogContentPane;
    private JSeparator ivjJSeparator1;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JPanel ivjJPanel1;
    private JPanel ivjBroker;
    private JLabel ivjJLabel10;
    private JLabel ivjJLabel11;
    private JLabel ivjJLabel12;
    private JLabel ivjJLabel13;
    private JLabel ivjJLabel14;
    private JLabel ivjJLabel15;
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
    private CodedCharSetId ivjCCSID;
    private JTextField ivjChannel;
    private JTextField ivjClientID;
    private JTextField ivjDescription;
    private JTextField ivjFactoryName;
    private JTextField ivjHostName;
    private NumericTextField ivjPort;
    private JTextField ivjQueueManager;
    private JMSTransport ivjTransport;
    IvjEventHandler ivjEventHandler;
    private String managedObjectName;
    private MQTopicConnectionFactory topicConnectionFactory;
    public static final int OK = 1;
    public static final int CANCEL = 2;
    private int returnCode;
    private JTextField ivjReceiveExit;
    private JTextField ivjReceiveExitData;
    private JTextField ivjSecurityExit;
    private JTextField ivjSecurityExitData;
    private JTextField ivjSendExit;
    private JTextField ivjSendExitData;
    private QMgrName ivjBrokerQueueManager;
    private QName ivjConsumerQueue;
    private QName ivjControlQueue;
    private QName ivjPublishQueue;
    private QName ivjSubscriptionQueue;
    private JTextField ivjVersion;
    private JPanel ivjJPanel2;





}
