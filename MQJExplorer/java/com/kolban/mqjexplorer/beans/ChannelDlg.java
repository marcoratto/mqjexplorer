// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelDlg.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFException;
import com.ibm.mq.pcf.PCFMessage;
import com.kolban.mqjexplorer.*;
import com.kolban.mqjexplorer.panels.*;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChannelDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getOK())
                connEtoC1();
            if(actionevent.getSource() == getCancel())
                connEtoC2();
        }

        IvjEventHandler()
        {
        }
    }


    public ChannelDlg()
    {
        ivjCancel = null;
        ivjExits = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjMCA = null;
        ivjOK = null;
        ivjRetry = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjTabbedPane = null;
        initialize();
    }

    public ChannelDlg(Dialog dialog)
    {
        super(dialog);
        ivjCancel = null;
        ivjExits = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjMCA = null;
        ivjOK = null;
        ivjRetry = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjTabbedPane = null;
    }

    public ChannelDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjCancel = null;
        ivjExits = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjMCA = null;
        ivjOK = null;
        ivjRetry = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjTabbedPane = null;
    }

    public ChannelDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjCancel = null;
        ivjExits = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjMCA = null;
        ivjOK = null;
        ivjRetry = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjTabbedPane = null;
    }

    public ChannelDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjCancel = null;
        ivjExits = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjMCA = null;
        ivjOK = null;
        ivjRetry = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjTabbedPane = null;
    }

    public ChannelDlg(Frame frame)
    {
        super(frame);
        ivjCancel = null;
        ivjExits = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjMCA = null;
        ivjOK = null;
        ivjRetry = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjTabbedPane = null;
    }

    public ChannelDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjCancel = null;
        ivjExits = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjMCA = null;
        ivjOK = null;
        ivjRetry = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjTabbedPane = null;
    }

    public ChannelDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjCancel = null;
        ivjExits = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjMCA = null;
        ivjOK = null;
        ivjRetry = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjTabbedPane = null;
    }

    public ChannelDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjCancel = null;
        ivjExits = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjMCA = null;
        ivjOK = null;
        ivjRetry = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjTabbedPane = null;
    }

    public void cancel_ActionEvents()
    {
        dispose();
    }

    public void changeClusterReceiver(Frame frame, QueueManagerModel queuemanagermodel, String s)
    {
        queueManagerModel = queuemanagermodel;
        type = 2;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName(s);
            getGeneral().channelNameSetValue(pcfmessage.getStringParameterValue(3501));
            getGeneral().channelNameSetEditable(false);
            getGeneral().channelTypeSetValue(pcfmessage.getIntParameterValue(1511));
            getGeneral().channelDescSetValue(pcfmessage.getStringParameterValue(3502));
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetValue(pcfmessage.getIntParameterValue(1564));
            getExtended().discIntervalSetValue(pcfmessage.getIntParameterValue(1503));
            getExtended().dataConversionSetValue(pcfmessage.getIntParameterValue(1515));
            getExtended().putAuthoritySetValue(pcfmessage.getIntParameterValue(1508));
            getMCA().MCAUseridentifierSetVisible(false);
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetVisible(false);
            getRetry().shortRetryIntervalSetVisible(false);
            getRetry().longRetryCountSetVisible(false);
            getRetry().longRetryIntervalSetVisible(false);
            getRetry().msgRetryCountSetValue(pcfmessage.getIntParameterValue(1544));
            getRetry().msgRetryIntervalSetValue(pcfmessage.getIntParameterValue(1545));
            getRetry().msgRetryExitSetValue(pcfmessage.getStringParameterValue(3534));
            getRetry().msgRetryUserDataSetValue(pcfmessage.getStringParameterValue(3535));
            setTitle("Cluster receiver channel " + s.trim() + " Properties");
        }
        catch(Exception exception)
        {
            System.out.println("changeClusterReceiver: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void changeClusterSender(Frame frame, QueueManagerModel queuemanagermodel, String s)
    {
        queueManagerModel = queuemanagermodel;
        type = 2;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName(s);
            getGeneral().channelNameSetValue(pcfmessage.getStringParameterValue(3501));
            getGeneral().channelNameSetEditable(false);
            getGeneral().channelTypeSetValue(pcfmessage.getIntParameterValue(1511));
            getGeneral().channelDescSetValue(pcfmessage.getStringParameterValue(3502));
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetValue(pcfmessage.getIntParameterValue(1564));
            getExtended().discIntervalSetValue(pcfmessage.getIntParameterValue(1503));
            getExtended().dataConversionSetValue(pcfmessage.getIntParameterValue(1515));
            getExtended().putAuthoritySetVisible(false);
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetValue(pcfmessage.getIntParameterValue(1505));
            getRetry().shortRetryIntervalSetValue(pcfmessage.getIntParameterValue(1504));
            getRetry().longRetryCountSetValue(pcfmessage.getIntParameterValue(1507));
            getRetry().longRetryIntervalSetValue(pcfmessage.getIntParameterValue(1506));
            getRetry().msgRetryCountSetVisible(false);
            getRetry().msgRetryIntervalSetVisible(false);
            getRetry().msgRetryExitSetVisible(false);
            getRetry().msgRetryUserDataSetVisible(false);
            setTitle("Cluster sender channel " + s.trim() + " Properties");
        }
        catch(Exception exception)
        {
            System.out.println("changeClusterSender: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void changeReceiver(Frame frame, QueueManagerModel queuemanagermodel, String s)
    {
        queueManagerModel = queuemanagermodel;
        type = 2;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName(s);
            getGeneral().channelNameSetValue(pcfmessage.getStringParameterValue(3501));
            getGeneral().channelNameSetEditable(false);
            getGeneral().channelTypeSetValue(pcfmessage.getIntParameterValue(1511));
            getGeneral().channelDescSetValue(pcfmessage.getStringParameterValue(3502));
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetVisible(false);
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetVisible(false);
            getExtended().discIntervalSetVisible(false);
            getExtended().dataConversionSetVisible(false);
            getExtended().putAuthoritySetValue(pcfmessage.getIntParameterValue(1508));
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetVisible(false);
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetVisible(false);
            getRetry().shortRetryIntervalSetVisible(false);
            getRetry().longRetryCountSetVisible(false);
            getRetry().longRetryIntervalSetVisible(false);
            getRetry().msgRetryCountSetValue(pcfmessage.getIntParameterValue(1544));
            getRetry().msgRetryIntervalSetValue(pcfmessage.getIntParameterValue(1545));
            getRetry().msgRetryExitSetValue(pcfmessage.getStringParameterValue(3534));
            getRetry().msgRetryUserDataSetValue(pcfmessage.getStringParameterValue(3535));
            setTitle("Receiver channel " + s.trim() + " Properties");
        }
        catch(Exception exception)
        {
            System.out.println("changeReceiver: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void changeRequester(Frame frame, QueueManagerModel queuemanagermodel, String s)
    {
        queueManagerModel = queuemanagermodel;
        type = 2;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName(s);
            getGeneral().channelNameSetValue(pcfmessage.getStringParameterValue(3501));
            getGeneral().channelNameSetEditable(false);
            getGeneral().channelTypeSetValue(pcfmessage.getIntParameterValue(1511));
            getGeneral().channelDescSetValue(pcfmessage.getStringParameterValue(3502));
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetVisible(false);
            getExtended().discIntervalSetVisible(false);
            getExtended().dataConversionSetVisible(false);
            getExtended().putAuthoritySetValue(pcfmessage.getIntParameterValue(1508));
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetVisible(false);
            getRetry().shortRetryIntervalSetVisible(false);
            getRetry().longRetryCountSetVisible(false);
            getRetry().longRetryIntervalSetVisible(false);
            getRetry().msgRetryCountSetValue(pcfmessage.getIntParameterValue(1544));
            getRetry().msgRetryIntervalSetValue(pcfmessage.getIntParameterValue(1545));
            getRetry().msgRetryExitSetValue(pcfmessage.getStringParameterValue(3534));
            getRetry().msgRetryUserDataSetValue(pcfmessage.getStringParameterValue(3535));
            setTitle("Requester channel " + s.trim() + " Properties");
        }
        catch(Exception exception)
        {
            System.out.println("changeRequester: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void changeSender(Frame frame, QueueManagerModel queuemanagermodel, String s)
    {
        queueManagerModel = queuemanagermodel;
        type = 2;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName(s);
            getGeneral().channelNameSetValue(pcfmessage.getStringParameterValue(3501));
            getGeneral().channelNameSetEditable(false);
            getGeneral().channelTypeSetValue(pcfmessage.getIntParameterValue(1511));
            getGeneral().channelDescSetValue(pcfmessage.getStringParameterValue(3502));
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetValue(pcfmessage.getStringParameterValue(3505));
            getGeneral().xmitQNameInit(queuemanagermodel.getQueueListModel().getLocalQueueNames(4));
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetValue(pcfmessage.getIntParameterValue(1564));
            getExtended().discIntervalSetValue(pcfmessage.getIntParameterValue(1503));
            getExtended().dataConversionSetValue(pcfmessage.getIntParameterValue(1515));
            getExtended().putAuthoritySetVisible(false);
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetValue(pcfmessage.getIntParameterValue(1505));
            getRetry().shortRetryIntervalSetValue(pcfmessage.getIntParameterValue(1504));
            getRetry().longRetryCountSetValue(pcfmessage.getIntParameterValue(1507));
            getRetry().longRetryIntervalSetValue(pcfmessage.getIntParameterValue(1506));
            getRetry().msgRetryCountSetVisible(false);
            getRetry().msgRetryIntervalSetVisible(false);
            getRetry().msgRetryExitSetVisible(false);
            getRetry().msgRetryUserDataSetVisible(false);
            setTitle("Sender channel " + s.trim() + " Properties");
        }
        catch(Exception exception)
        {
            System.out.println("changeSender: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void changeServer(Frame frame, QueueManagerModel queuemanagermodel, String s)
    {
        queueManagerModel = queuemanagermodel;
        type = 2;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName(s);
            getGeneral().channelNameSetValue(pcfmessage.getStringParameterValue(3501));
            getGeneral().channelNameSetEditable(false);
            getGeneral().channelTypeSetValue(pcfmessage.getIntParameterValue(1511));
            getGeneral().channelDescSetValue(pcfmessage.getStringParameterValue(3502));
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetValue(pcfmessage.getStringParameterValue(3505));
            getGeneral().xmitQNameInit(queuemanagermodel.getQueueListModel().getLocalQueueNames(4));
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetValue(pcfmessage.getIntParameterValue(1564));
            getExtended().discIntervalSetValue(pcfmessage.getIntParameterValue(1503));
            getExtended().dataConversionSetValue(pcfmessage.getIntParameterValue(1515));
            getExtended().putAuthoritySetVisible(false);
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetValue(pcfmessage.getIntParameterValue(1505));
            getRetry().shortRetryIntervalSetValue(pcfmessage.getIntParameterValue(1504));
            getRetry().longRetryCountSetValue(pcfmessage.getIntParameterValue(1507));
            getRetry().longRetryIntervalSetValue(pcfmessage.getIntParameterValue(1506));
            getRetry().msgRetryCountSetVisible(false);
            getRetry().msgRetryIntervalSetVisible(false);
            getRetry().msgRetryExitSetVisible(false);
            getRetry().msgRetryUserDataSetVisible(false);
            setTitle("Server channel " + s.trim() + " Properties");
        }
        catch(Exception exception)
        {
            System.out.println("changeServer: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void changeServerConnection(Frame frame, QueueManagerModel queuemanagermodel, String s)
    {
        queueManagerModel = queuemanagermodel;
        type = 2;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName(s);
            getGeneral().channelNameSetValue(pcfmessage.getStringParameterValue(3501));
            getGeneral().channelNameSetEditable(false);
            getGeneral().channelTypeSetValue(pcfmessage.getIntParameterValue(1511));
            getGeneral().channelDescSetValue(pcfmessage.getStringParameterValue(3502));
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetVisible(false);
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetVisible(false);
            getExtended().nonPersistentMsgSpeedSetVisible(false);
            getExtended().batchSizeSetVisible(false);
            getExtended().batchIntervalSetVisible(false);
            getExtended().discIntervalSetVisible(false);
            getExtended().dataConversionSetVisible(false);
            getExtended().putAuthoritySetVisible(false);
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetVisible(false);
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetVisible(false);
            getExits().msgUserDataSetVisible(false);
            getTabbedPane().remove(getRetry());
            setTitle("Server connection channel " + s.trim() + " Properties");
        }
        catch(Exception exception)
        {
            System.out.println("changeServerConnection: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    private void connEtoC1()
    {
        try
        {
            oK_ActionEvents();
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
            cancel_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public void create(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        try
        {
            setTitle("Create Sender Channel");
        }
        catch(Exception exception)
        {
            System.out.println("change: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void createClusterReceiverChannel(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        type = 1;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName("SYSTEM.DEF.CLUSRCVR");
            getGeneral().channelTypeSetValue(8);
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetVisible(false);
            getGeneral().alterationTimeSetVisible(false);
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetValue(pcfmessage.getIntParameterValue(1564));
            getExtended().discIntervalSetValue(pcfmessage.getIntParameterValue(1503));
            getExtended().dataConversionSetValue(pcfmessage.getIntParameterValue(1515));
            getExtended().putAuthoritySetValue(pcfmessage.getIntParameterValue(1508));
            getMCA().MCAUseridentifierSetVisible(false);
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetVisible(false);
            getRetry().shortRetryIntervalSetVisible(false);
            getRetry().longRetryCountSetVisible(false);
            getRetry().longRetryIntervalSetVisible(false);
            getRetry().msgRetryCountSetValue(pcfmessage.getIntParameterValue(1544));
            getRetry().msgRetryIntervalSetValue(pcfmessage.getIntParameterValue(1545));
            getRetry().msgRetryExitSetValue(pcfmessage.getStringParameterValue(3534));
            getRetry().msgRetryUserDataSetValue(pcfmessage.getStringParameterValue(3535));
            setTitle("Create Cluster Receiver Channel");
        }
        catch(Exception exception)
        {
            System.out.println("createClusterReceiverChannel: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void createClusterSenderChannel(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        type = 1;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName("SYSTEM.DEF.CLUSSDR");
            getGeneral().channelTypeSetValue(9);
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetVisible(false);
            getGeneral().alterationTimeSetVisible(false);
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetValue(pcfmessage.getIntParameterValue(1564));
            getExtended().discIntervalSetValue(pcfmessage.getIntParameterValue(1503));
            getExtended().dataConversionSetValue(pcfmessage.getIntParameterValue(1515));
            getExtended().putAuthoritySetVisible(false);
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetValue(pcfmessage.getIntParameterValue(1505));
            getRetry().shortRetryIntervalSetValue(pcfmessage.getIntParameterValue(1504));
            getRetry().longRetryCountSetValue(pcfmessage.getIntParameterValue(1507));
            getRetry().longRetryIntervalSetValue(pcfmessage.getIntParameterValue(1506));
            getRetry().msgRetryCountSetVisible(false);
            getRetry().msgRetryIntervalSetVisible(false);
            getRetry().msgRetryExitSetVisible(false);
            getRetry().msgRetryUserDataSetVisible(false);
            setTitle("Create Cluster Sender Channel");
        }
        catch(Exception exception)
        {
            System.out.println("createClusterSenderChannel: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void createReceiverChannel(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        type = 1;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName("SYSTEM.DEF.RECEIVER");
            getGeneral().channelTypeSetValue(3);
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetVisible(false);
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetVisible(false);
            getGeneral().alterationTimeSetVisible(false);
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetVisible(false);
            getExtended().discIntervalSetVisible(false);
            getExtended().dataConversionSetVisible(false);
            getExtended().putAuthoritySetValue(pcfmessage.getIntParameterValue(1508));
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetVisible(false);
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetVisible(false);
            getRetry().shortRetryIntervalSetVisible(false);
            getRetry().longRetryCountSetVisible(false);
            getRetry().longRetryIntervalSetVisible(false);
            getRetry().msgRetryCountSetValue(pcfmessage.getIntParameterValue(1544));
            getRetry().msgRetryIntervalSetValue(pcfmessage.getIntParameterValue(1545));
            getRetry().msgRetryExitSetValue(pcfmessage.getStringParameterValue(3534));
            getRetry().msgRetryUserDataSetValue(pcfmessage.getStringParameterValue(3535));
            setTitle("Create Receiver Channel");
        }
        catch(Exception exception)
        {
            System.out.println("createReceiverChannel: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void createRequesterChannel(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        type = 1;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName("SYSTEM.DEF.REQUESTER");
            getGeneral().channelTypeSetValue(4);
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetVisible(false);
            getGeneral().alterationTimeSetVisible(false);
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().putAuthoritySetValue(pcfmessage.getIntParameterValue(1508));
            getExtended().batchIntervalSetVisible(false);
            getExtended().discIntervalSetVisible(false);
            getExtended().dataConversionSetVisible(false);
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetVisible(false);
            getRetry().shortRetryIntervalSetVisible(false);
            getRetry().longRetryCountSetVisible(false);
            getRetry().longRetryIntervalSetVisible(false);
            getRetry().msgRetryCountSetValue(pcfmessage.getIntParameterValue(1544));
            getRetry().msgRetryIntervalSetValue(pcfmessage.getIntParameterValue(1545));
            getRetry().msgRetryExitSetValue(pcfmessage.getStringParameterValue(3534));
            getRetry().msgRetryUserDataSetValue(pcfmessage.getStringParameterValue(3535));
            setTitle("Create Requester Channel");
        }
        catch(Exception exception)
        {
            System.out.println("createRequesterChannel: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void createSenderChannel(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        type = 1;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName("SYSTEM.DEF.SENDER");
            getGeneral().channelTypeSetValue(1);
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetValue(pcfmessage.getStringParameterValue(3505));
            getGeneral().xmitQNameInit(queuemanagermodel.getQueueListModel().getLocalQueueNames(4));
            getGeneral().alterationDateSetVisible(false);
            getGeneral().alterationTimeSetVisible(false);
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetValue(pcfmessage.getIntParameterValue(1564));
            getExtended().discIntervalSetValue(pcfmessage.getIntParameterValue(1503));
            getExtended().dataConversionSetValue(pcfmessage.getIntParameterValue(1515));
            getExtended().putAuthoritySetVisible(false);
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetValue(pcfmessage.getIntParameterValue(1505));
            getRetry().shortRetryIntervalSetValue(pcfmessage.getIntParameterValue(1504));
            getRetry().longRetryCountSetValue(pcfmessage.getIntParameterValue(1507));
            getRetry().longRetryIntervalSetValue(pcfmessage.getIntParameterValue(1506));
            getRetry().msgRetryCountSetVisible(false);
            getRetry().msgRetryIntervalSetVisible(false);
            getRetry().msgRetryExitSetVisible(false);
            getRetry().msgRetryUserDataSetVisible(false);
            setTitle("Create Sender Channel");
        }
        catch(Exception exception)
        {
            System.out.println("createSenderChannel: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void createServerChannel(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        type = 1;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName("SYSTEM.DEF.SERVER");
            getGeneral().channelTypeSetValue(2);
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetValue(pcfmessage.getStringParameterValue(3506));
            getGeneral().xmitQNameSetValue(pcfmessage.getStringParameterValue(3505));
            getGeneral().xmitQNameInit(queuemanagermodel.getQueueListModel().getLocalQueueNames(4));
            getGeneral().alterationDateSetVisible(false);
            getGeneral().alterationTimeSetVisible(false);
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetValue(pcfmessage.getIntParameterValue(1509));
            getExtended().nonPersistentMsgSpeedSetValue(pcfmessage.getIntParameterValue(1562));
            getExtended().batchSizeSetValue(pcfmessage.getIntParameterValue(1502));
            getExtended().batchIntervalSetValue(pcfmessage.getIntParameterValue(1564));
            getExtended().discIntervalSetValue(pcfmessage.getIntParameterValue(1503));
            getExtended().dataConversionSetValue(pcfmessage.getIntParameterValue(1515));
            getExtended().putAuthoritySetVisible(false);
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetValue(pcfmessage.getIntParameterValue(1517));
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetValue(pcfmessage.getStringParameterValue(3509));
            getExits().msgUserDataSetValue(pcfmessage.getStringParameterValue(3514));
            getRetry().shortRetryCountSetValue(pcfmessage.getIntParameterValue(1505));
            getRetry().shortRetryIntervalSetValue(pcfmessage.getIntParameterValue(1504));
            getRetry().longRetryCountSetValue(pcfmessage.getIntParameterValue(1507));
            getRetry().longRetryIntervalSetValue(pcfmessage.getIntParameterValue(1506));
            getRetry().msgRetryCountSetVisible(false);
            getRetry().msgRetryIntervalSetVisible(false);
            getRetry().msgRetryExitSetVisible(false);
            getRetry().msgRetryUserDataSetVisible(false);
            setTitle("Create Server Channel");
        }
        catch(Exception exception)
        {
            System.out.println("createServerChannel: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void createServerConnectionChannel(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        type = 1;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getChannelListModel().findChannelByName("SYSTEM.DEF.SVRCONN");
            getGeneral().channelTypeSetValue(7);
            getGeneral().transportTypeSetValue(pcfmessage.getIntParameterValue(1501));
            getGeneral().connectionNameSetVisible(false);
            getGeneral().xmitQNameSetVisible(false);
            getGeneral().alterationDateSetVisible(false);
            getGeneral().alterationTimeSetVisible(false);
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(1510));
            getExtended().heartBeatIntervalSetValue(pcfmessage.getIntParameterValue(1563));
            getExtended().seqNumberWrapSetVisible(false);
            getExtended().nonPersistentMsgSpeedSetVisible(false);
            getExtended().batchSizeSetVisible(false);
            getExtended().batchIntervalSetVisible(false);
            getExtended().discIntervalSetVisible(false);
            getExtended().dataConversionSetVisible(false);
            getExtended().putAuthoritySetVisible(false);
            getMCA().MCAUserIdentifierSetValue(pcfmessage.getStringParameterValue(3527));
            getMCA().MCATypeSetVisible(false);
            getMCA().MCANameSetVisible(false);
            getExits().sendExitSetValue(pcfmessage.getStringParameterValue(3510));
            getExits().sendUserDataSetValue(pcfmessage.getStringParameterValue(3515));
            getExits().receiveExitSetValue(pcfmessage.getStringParameterValue(3511));
            getExits().receiveUserDataSetValue(pcfmessage.getStringParameterValue(3516));
            getExits().securityExitSetValue(pcfmessage.getStringParameterValue(3508));
            getExits().securityUserDataSetValue(pcfmessage.getStringParameterValue(3513));
            getExits().msgExitSetVisible(false);
            getExits().msgUserDataSetVisible(false);
            getTabbedPane().remove(getRetry());
            setTitle("Create Server Connection Channel");
        }
        catch(Exception exception)
        {
            System.out.println("createServerConnectionChannel: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    private void displayError(MQException mqexception)
    {
        String s;
        switch(mqexception.reasonCode)
        {
        case 4062: 
            s = "Connection name in error";
            break;

        case 4044: 
            s = "Channel name in error";
            break;

        case 4045: 
            s = "Transmission queue name in error";
            break;

        case 4042: 
            s = "A channel with this name already exists";
            break;

        default:
            s = "Queue manager returned reason code " + mqexception.reasonCode;
            break;
        }
        JOptionPane.showMessageDialog(this, s, "MQJExplorer", 2);
    }

    public void doChangeClusterReceiver()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(21);
        pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
        pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
        pcfmessage.addParameter(3502, getGeneral().channelDescGetValue());
        pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
        pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
        pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
        pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
        pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
        pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
        pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
        pcfmessage.addParameter(1564, getExtended().batchIntervalGetValue());
        pcfmessage.addParameter(1503, getExtended().discIntervalGetValue());
        pcfmessage.addParameter(1515, getExtended().dataConversionGetValue());
        pcfmessage.addParameter(1508, getExtended().putAuthorityGetValue());
        pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
        pcfmessage.addParameter(3510, getExits().sendExitGetValue());
        pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
        pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
        pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
        pcfmessage.addParameter(3508, getExits().securityExitGetValue());
        pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
        pcfmessage.addParameter(3509, getExits().msgExitGetValue());
        pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
        pcfmessage.addParameter(1544, getRetry().msgRetryCountGetValue());
        pcfmessage.addParameter(1545, getRetry().msgRetryIntervalGetValue());
        pcfmessage.addParameter(3534, getRetry().msgRetryExitGetValue());
        pcfmessage.addParameter(3535, getRetry().msgRetryUserDataGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doChangeClusterReceiver: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doChangeClusterSender()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(21);
        pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
        pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
        pcfmessage.addParameter(3502, getGeneral().channelDescGetValue());
        pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
        pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
        pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
        pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
        pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
        pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
        pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
        pcfmessage.addParameter(1564, getExtended().batchIntervalGetValue());
        pcfmessage.addParameter(1503, getExtended().discIntervalGetValue());
        pcfmessage.addParameter(1515, getExtended().dataConversionGetValue());
        pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
        pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
        pcfmessage.addParameter(3510, getExits().sendExitGetValue());
        pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
        pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
        pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
        pcfmessage.addParameter(3508, getExits().securityExitGetValue());
        pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
        pcfmessage.addParameter(3509, getExits().msgExitGetValue());
        pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
        pcfmessage.addParameter(1505, getRetry().shortRetryCountGetValue());
        pcfmessage.addParameter(1504, getRetry().shortRetryIntervalGetValue());
        pcfmessage.addParameter(1507, getRetry().longRetryCountGetValue());
        pcfmessage.addParameter(1506, getRetry().longRetryIntervalGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doChangeClusterSender: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doChangeReceiver()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(21);
        pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
        pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
        pcfmessage.addParameter(3502, getGeneral().channelDescGetValue());
        pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
        pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
        pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
        pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
        pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
        pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
        pcfmessage.addParameter(1508, getExtended().putAuthorityGetValue());
        pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
        pcfmessage.addParameter(3510, getExits().sendExitGetValue());
        pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
        pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
        pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
        pcfmessage.addParameter(3508, getExits().securityExitGetValue());
        pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
        pcfmessage.addParameter(3509, getExits().msgExitGetValue());
        pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
        pcfmessage.addParameter(1544, getRetry().msgRetryCountGetValue());
        pcfmessage.addParameter(1545, getRetry().msgRetryIntervalGetValue());
        pcfmessage.addParameter(3534, getRetry().msgRetryExitGetValue());
        pcfmessage.addParameter(3535, getRetry().msgRetryUserDataGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doChangeReceiver: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doChangeRequester()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(21);
        pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
        pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
        pcfmessage.addParameter(3502, getGeneral().channelDescGetValue());
        pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
        pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
        pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
        pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
        pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
        pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
        pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
        pcfmessage.addParameter(1508, getExtended().putAuthorityGetValue());
        pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
        pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
        pcfmessage.addParameter(3510, getExits().sendExitGetValue());
        pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
        pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
        pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
        pcfmessage.addParameter(3508, getExits().securityExitGetValue());
        pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
        pcfmessage.addParameter(3509, getExits().msgExitGetValue());
        pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
        pcfmessage.addParameter(1544, getRetry().msgRetryCountGetValue());
        pcfmessage.addParameter(1545, getRetry().msgRetryIntervalGetValue());
        pcfmessage.addParameter(3534, getRetry().msgRetryExitGetValue());
        pcfmessage.addParameter(3535, getRetry().msgRetryUserDataGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doChangeRequester: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doChangeSender()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(21);
        pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
        pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
        pcfmessage.addParameter(3502, getGeneral().channelDescGetValue());
        pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
        pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
        pcfmessage.addParameter(3505, getGeneral().xmitQNameGetValue());
        pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
        pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
        pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
        pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
        pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
        pcfmessage.addParameter(1564, getExtended().batchIntervalGetValue());
        pcfmessage.addParameter(1503, getExtended().discIntervalGetValue());
        pcfmessage.addParameter(1515, getExtended().dataConversionGetValue());
        pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
        pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
        pcfmessage.addParameter(3510, getExits().sendExitGetValue());
        pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
        pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
        pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
        pcfmessage.addParameter(3508, getExits().securityExitGetValue());
        pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
        pcfmessage.addParameter(3509, getExits().msgExitGetValue());
        pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
        pcfmessage.addParameter(1505, getRetry().shortRetryCountGetValue());
        pcfmessage.addParameter(1504, getRetry().shortRetryIntervalGetValue());
        pcfmessage.addParameter(1507, getRetry().longRetryCountGetValue());
        pcfmessage.addParameter(1506, getRetry().longRetryIntervalGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doChangeSender: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doChangeServer()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(21);
        pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
        pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
        pcfmessage.addParameter(3502, getGeneral().channelDescGetValue());
        pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
        pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
        pcfmessage.addParameter(3505, getGeneral().xmitQNameGetValue());
        pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
        pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
        pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
        pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
        pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
        pcfmessage.addParameter(1564, getExtended().batchIntervalGetValue());
        pcfmessage.addParameter(1503, getExtended().discIntervalGetValue());
        pcfmessage.addParameter(1515, getExtended().dataConversionGetValue());
        pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
        pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
        pcfmessage.addParameter(3510, getExits().sendExitGetValue());
        pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
        pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
        pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
        pcfmessage.addParameter(3508, getExits().securityExitGetValue());
        pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
        pcfmessage.addParameter(3509, getExits().msgExitGetValue());
        pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
        pcfmessage.addParameter(1505, getRetry().shortRetryCountGetValue());
        pcfmessage.addParameter(1504, getRetry().shortRetryIntervalGetValue());
        pcfmessage.addParameter(1507, getRetry().longRetryCountGetValue());
        pcfmessage.addParameter(1506, getRetry().longRetryIntervalGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doChangeServer: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doChangeServerConnection()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(21);
        pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
        pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
        pcfmessage.addParameter(3502, getGeneral().channelDescGetValue());
        pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
        pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
        pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
        pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
        pcfmessage.addParameter(3510, getExits().sendExitGetValue());
        pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
        pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
        pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
        pcfmessage.addParameter(3508, getExits().securityExitGetValue());
        pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doChangeServerConnection: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doCreateClusterReceiver()
        throws MQException
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(23);
            pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
            pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
            pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
            pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
            pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
            pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
            pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
            pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
            pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
            pcfmessage.addParameter(1564, getExtended().batchIntervalGetValue());
            pcfmessage.addParameter(1503, getExtended().discIntervalGetValue());
            pcfmessage.addParameter(1515, getExtended().dataConversionGetValue());
            pcfmessage.addParameter(1508, getExtended().putAuthorityGetValue());
            pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
            pcfmessage.addParameter(3510, getExits().sendExitGetValue());
            pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
            pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
            pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
            pcfmessage.addParameter(3508, getExits().securityExitGetValue());
            pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
            pcfmessage.addParameter(3509, getExits().msgExitGetValue());
            pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
            pcfmessage.addParameter(1544, getRetry().msgRetryCountGetValue());
            pcfmessage.addParameter(1545, getRetry().msgRetryIntervalGetValue());
            pcfmessage.addParameter(3534, getRetry().msgRetryExitGetValue());
            pcfmessage.addParameter(3535, getRetry().msgRetryUserDataGetValue());
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doCreateClusterReceiver: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doCreateClusterSender()
        throws MQException
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(23);
            pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
            pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
            pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
            pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
            pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
            pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
            pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
            pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
            pcfmessage.addParameter(1564, getExtended().batchIntervalGetValue());
            pcfmessage.addParameter(1503, getExtended().discIntervalGetValue());
            pcfmessage.addParameter(1515, getExtended().dataConversionGetValue());
            pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
            pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
            pcfmessage.addParameter(3510, getExits().sendExitGetValue());
            pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
            pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
            pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
            pcfmessage.addParameter(3508, getExits().securityExitGetValue());
            pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
            pcfmessage.addParameter(3509, getExits().msgExitGetValue());
            pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
            pcfmessage.addParameter(1505, getRetry().shortRetryCountGetValue());
            pcfmessage.addParameter(1504, getRetry().shortRetryIntervalGetValue());
            pcfmessage.addParameter(1507, getRetry().longRetryCountGetValue());
            pcfmessage.addParameter(1506, getRetry().longRetryIntervalGetValue());
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doCreateClusterSender: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doCreateReceiver()
        throws MQException
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(23);
            pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
            pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
            pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
            pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
            pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
            pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
            pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
            pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
            pcfmessage.addParameter(1508, getExtended().putAuthorityGetValue());
            pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
            pcfmessage.addParameter(3510, getExits().sendExitGetValue());
            pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
            pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
            pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
            pcfmessage.addParameter(3508, getExits().securityExitGetValue());
            pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
            pcfmessage.addParameter(3509, getExits().msgExitGetValue());
            pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
            pcfmessage.addParameter(1544, getRetry().msgRetryCountGetValue());
            pcfmessage.addParameter(1545, getRetry().msgRetryIntervalGetValue());
            pcfmessage.addParameter(3534, getRetry().msgRetryExitGetValue());
            pcfmessage.addParameter(3535, getRetry().msgRetryUserDataGetValue());
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doCreateReceiver: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doCreateRequester()
        throws MQException
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(23);
            pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
            pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
            pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
            pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
            pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
            pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
            pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
            pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
            pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
            pcfmessage.addParameter(1508, getExtended().putAuthorityGetValue());
            pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
            pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
            pcfmessage.addParameter(3510, getExits().sendExitGetValue());
            pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
            pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
            pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
            pcfmessage.addParameter(3508, getExits().securityExitGetValue());
            pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
            pcfmessage.addParameter(3509, getExits().msgExitGetValue());
            pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
            pcfmessage.addParameter(1544, getRetry().msgRetryCountGetValue());
            pcfmessage.addParameter(1545, getRetry().msgRetryIntervalGetValue());
            pcfmessage.addParameter(3534, getRetry().msgRetryExitGetValue());
            pcfmessage.addParameter(3535, getRetry().msgRetryUserDataGetValue());
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doCreateRequester: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doCreateSender()
        throws MQException
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(23);
            pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
            pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
            pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
            pcfmessage.addParameter(3505, getGeneral().xmitQNameGetValue());
            pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
            pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
            pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
            pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
            pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
            pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
            pcfmessage.addParameter(1564, getExtended().batchIntervalGetValue());
            pcfmessage.addParameter(1503, getExtended().discIntervalGetValue());
            pcfmessage.addParameter(1515, getExtended().dataConversionGetValue());
            pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
            pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
            pcfmessage.addParameter(3510, getExits().sendExitGetValue());
            pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
            pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
            pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
            pcfmessage.addParameter(3508, getExits().securityExitGetValue());
            pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
            pcfmessage.addParameter(3509, getExits().msgExitGetValue());
            pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
            pcfmessage.addParameter(1505, getRetry().shortRetryCountGetValue());
            pcfmessage.addParameter(1504, getRetry().shortRetryIntervalGetValue());
            pcfmessage.addParameter(1507, getRetry().longRetryCountGetValue());
            pcfmessage.addParameter(1506, getRetry().longRetryIntervalGetValue());
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doCreateSender: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doCreateServer()
        throws MQException
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(23);
            pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
            pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
            pcfmessage.addParameter(3506, getGeneral().connectionNameGetValue());
            pcfmessage.addParameter(3505, getGeneral().xmitQNameGetValue());
            pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
            pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
            pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
            pcfmessage.addParameter(1509, getExtended().seqNumberWrapGetValue());
            pcfmessage.addParameter(1562, getExtended().nonPersistentMsgSpeedGetValue());
            pcfmessage.addParameter(1502, getExtended().batchSizeGetValue());
            pcfmessage.addParameter(1564, getExtended().batchIntervalGetValue());
            pcfmessage.addParameter(1503, getExtended().discIntervalGetValue());
            pcfmessage.addParameter(1515, getExtended().dataConversionGetValue());
            pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
            pcfmessage.addParameter(1517, getMCA().MCATypeGetValue());
            pcfmessage.addParameter(3510, getExits().sendExitGetValue());
            pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
            pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
            pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
            pcfmessage.addParameter(3508, getExits().securityExitGetValue());
            pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
            pcfmessage.addParameter(3509, getExits().msgExitGetValue());
            pcfmessage.addParameter(3514, getExits().msgUserDataGetValue());
            pcfmessage.addParameter(1505, getRetry().shortRetryCountGetValue());
            pcfmessage.addParameter(1504, getRetry().shortRetryIntervalGetValue());
            pcfmessage.addParameter(1507, getRetry().longRetryCountGetValue());
            pcfmessage.addParameter(1506, getRetry().longRetryIntervalGetValue());
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doCreateServer: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doCreateServerConnection()
        throws MQException
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(23);
            pcfmessage.addParameter(3501, getGeneral().channelNameGetValue());
            pcfmessage.addParameter(1511, getGeneral().channelTypeGetValue());
            pcfmessage.addParameter(1501, getGeneral().transportTypeGetValue());
            pcfmessage.addParameter(1510, getExtended().maxMsgLengthGetValue());
            pcfmessage.addParameter(1563, getExtended().heartBeatIntervalGetValue());
            pcfmessage.addParameter(3527, getMCA().MCAUserIdentifierGetValue());
            pcfmessage.addParameter(3510, getExits().sendExitGetValue());
            pcfmessage.addParameter(3515, getExits().sendUserDataGetValue());
            pcfmessage.addParameter(3511, getExits().receiveExitGetValue());
            pcfmessage.addParameter(3516, getExits().receiveUserDataGetValue());
            pcfmessage.addParameter(3508, getExits().securityExitGetValue());
            pcfmessage.addParameter(3513, getExits().securityUserDataGetValue());
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doCreateServerConnection: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    private JButton getCancel()
    {
        if(ivjCancel == null)
            try
            {
                ivjCancel = new JButton();
                ivjCancel.setName("Cancel");
                ivjCancel.setText("Cancel");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCancel;
    }

    public String getChannelName()
    {
        return getGeneral().channelNameGetValue();
    }

    private ChannelExitsPane getExits()
    {
        if(ivjExits == null)
            try
            {
                ivjExits = new ChannelExitsPane();
                ivjExits.setName("Exits");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExits;
    }

    private ChannelExtendedPane getExtended()
    {
        if(ivjExtended == null)
            try
            {
                ivjExtended = new ChannelExtendedPane();
                ivjExtended.setName("Extended");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExtended;
    }

    private ChannelGeneralPane getGeneral()
    {
        if(ivjGeneral == null)
            try
            {
                ivjGeneral = new ChannelGeneralPane();
                ivjGeneral.setName("General");
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
                getJDialogContentPane().add(getTabbedPane(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
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

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(getJPanel1FlowLayout());
                getJPanel1().add(getOK(), getOK().getName());
                getJPanel1().add(getCancel(), getCancel().getName());
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

    private ChannelMCAPane getMCA()
    {
        if(ivjMCA == null)
            try
            {
                ivjMCA = new ChannelMCAPane();
                ivjMCA.setName("MCA");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMCA;
    }

    private JButton getOK()
    {
        if(ivjOK == null)
            try
            {
                ivjOK = new JButton();
                ivjOK.setName("OK");
                ivjOK.setText("OK");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOK;
    }

    private ChannelRetryPanel getRetry()
    {
        if(ivjRetry == null)
            try
            {
                ivjRetry = new ChannelRetryPanel();
                ivjRetry.setName("Retry");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRetry;
    }

    private JTabbedPane getTabbedPane()
    {
        if(ivjTabbedPane == null)
            try
            {
                ivjTabbedPane = new JTabbedPane();
                ivjTabbedPane.setName("TabbedPane");
                ivjTabbedPane.insertTab("General", null, getGeneral(), null, 0);
                ivjTabbedPane.insertTab("Extended", null, getExtended(), null, 1);
                ivjTabbedPane.insertTab("MCA", null, getMCA(), null, 2);
                ivjTabbedPane.insertTab("Exits", null, getExits(), null, 3);
                ivjTabbedPane.insertTab("Retry", null, getRetry(), null, 4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTabbedPane;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getOK().addActionListener(ivjEventHandler);
        getCancel().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("ChannelDlg");
            setDefaultCloseOperation(2);
            setSize(426, 346);
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
            ChannelDlg channeldlg = new ChannelDlg();
            channeldlg.setModal(true);
            channeldlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            channeldlg.show();
            Insets insets = channeldlg.getInsets();
            channeldlg.setSize(channeldlg.getWidth() + insets.left + insets.right, channeldlg.getHeight() + insets.top + insets.bottom);
            channeldlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void oK_ActionEvents()
    {
        try
        {
            if(type == 1)
                switch(getGeneral().channelTypeGetValue())
                {
                case 1: // '\001'
                    doCreateSender();
                    break;

                case 2: // '\002'
                    doCreateServer();
                    break;

                case 3: // '\003'
                    doCreateReceiver();
                    break;

                case 4: // '\004'
                    doCreateRequester();
                    break;

                case 7: // '\007'
                    doCreateServerConnection();
                    break;

                case 9: // '\t'
                    doCreateClusterSender();
                    break;

                case 8: // '\b'
                    doCreateClusterReceiver();
                    break;

                case 5: // '\005'
                case 6: // '\006'
                default:
                    System.out.println("Unhandled create type");
                    break;
                }
            else
            if(type == 2)
                switch(getGeneral().channelTypeGetValue())
                {
                case 1: // '\001'
                    doChangeSender();
                    break;

                case 2: // '\002'
                    doChangeServer();
                    break;

                case 3: // '\003'
                    doChangeReceiver();
                    break;

                case 4: // '\004'
                    doChangeRequester();
                    break;

                case 7: // '\007'
                    doChangeServerConnection();
                    break;

                case 9: // '\t'
                    doChangeClusterSender();
                    break;

                case 8: // '\b'
                    doChangeClusterReceiver();
                    break;

                case 5: // '\005'
                case 6: // '\006'
                default:
                    System.out.println("Unhandled change type");
                    break;
                }
            dispose();
        }
        catch(MQException mqexception)
        {
            displayError(mqexception);
            System.out.println("Exception (handled) " + mqexception.toString());
        }
        catch(Exception exception)
        {
            System.out.println("Exception!! " + exception.toString());
        }
    }

    private JButton ivjCancel;
    private ChannelExitsPane ivjExits;
    private ChannelExtendedPane ivjExtended;
    private ChannelGeneralPane ivjGeneral;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private ChannelMCAPane ivjMCA;
    private JButton ivjOK;
    private ChannelRetryPanel ivjRetry;
    private QueueManagerModel queueManagerModel;
    IvjEventHandler ivjEventHandler;
    private int type;
    private static final int TYPE_CREATE = 1;
    private static final int TYPE_CHANGE = 2;
    private JTabbedPane ivjTabbedPane;




}
