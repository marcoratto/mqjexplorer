// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QMgrDlg.java

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

public class QMgrDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getOK())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getCancel())
                connEtoC2(actionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public QMgrDlg()
    {
        ivjCancel = null;
        ivjCluster = null;
        ivjCommunication = null;
        ivjEventHandler = new IvjEventHandler();
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        ivjStatistics = null;
        ivjFooterPanel = null;
        queueManagerModel = null;
        initialize();
    }

    public QMgrDlg(Dialog dialog)
    {
        super(dialog);
        ivjCancel = null;
        ivjCluster = null;
        ivjCommunication = null;
        ivjEventHandler = new IvjEventHandler();
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        ivjStatistics = null;
        ivjFooterPanel = null;
        queueManagerModel = null;
    }

    public QMgrDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjCancel = null;
        ivjCluster = null;
        ivjCommunication = null;
        ivjEventHandler = new IvjEventHandler();
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        ivjStatistics = null;
        ivjFooterPanel = null;
        queueManagerModel = null;
    }

    public QMgrDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjCancel = null;
        ivjCluster = null;
        ivjCommunication = null;
        ivjEventHandler = new IvjEventHandler();
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        ivjStatistics = null;
        ivjFooterPanel = null;
        queueManagerModel = null;
    }

    public QMgrDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjCancel = null;
        ivjCluster = null;
        ivjCommunication = null;
        ivjEventHandler = new IvjEventHandler();
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        ivjStatistics = null;
        ivjFooterPanel = null;
        queueManagerModel = null;
    }

    public QMgrDlg(Frame frame)
    {
        super(frame);
        ivjCancel = null;
        ivjCluster = null;
        ivjCommunication = null;
        ivjEventHandler = new IvjEventHandler();
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        ivjStatistics = null;
        ivjFooterPanel = null;
        queueManagerModel = null;
    }

    public QMgrDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjCancel = null;
        ivjCluster = null;
        ivjCommunication = null;
        ivjEventHandler = new IvjEventHandler();
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        ivjStatistics = null;
        ivjFooterPanel = null;
        queueManagerModel = null;
    }

    public QMgrDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjCancel = null;
        ivjCluster = null;
        ivjCommunication = null;
        ivjEventHandler = new IvjEventHandler();
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        ivjStatistics = null;
        ivjFooterPanel = null;
        queueManagerModel = null;
    }

    public QMgrDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjCancel = null;
        ivjCluster = null;
        ivjCommunication = null;
        ivjEventHandler = new IvjEventHandler();
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        ivjStatistics = null;
        ivjFooterPanel = null;
        queueManagerModel = null;
    }

    public void cancel()
    {
        dispose();
    }

    public void change(QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        PCFMessage pcfmessage = queuemanagermodel.getQMgrProperties();
        if(pcfmessage == null)
            return;
        try
        {
            getGeneral().QMgrNameSetValue(pcfmessage.getStringParameterValue(2015));
            getGeneral().QMgrDescSetValue(pcfmessage.getStringParameterValue(2014));
            getGeneral().codedCharSetIdSetValue(pcfmessage.getIntParameterValue(2));
            getGeneral().platformSetValue(pcfmessage.getIntParameterValue(32));
            getGeneral().commandLevelSetValue(pcfmessage.getIntParameterValue(31));
            getExtended().deadLetterQNameSetValue(pcfmessage.getStringParameterValue(2006));
            getExtended().triggerIntervalSetValue(pcfmessage.getIntParameterValue(25));
            getExtended().maxHandlesSetValue(pcfmessage.getIntParameterValue(11));
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(13));
            getExtended().maxPrioritySetValue(pcfmessage.getIntParameterValue(14));
            getExtended().commandInputQNameSetValue(pcfmessage.getStringParameterValue(2003));
            getExtended().syncPointSetValue(pcfmessage.getIntParameterValue(30));
            getExtended().commandInputQNameSetValue(pcfmessage.getStringParameterValue(2003));
            getExtended().maxUncommitedMsgsSetValue(pcfmessage.getIntParameterValue(33));
            getCluster().clusterWorkLoadExitSetValue(pcfmessage.getStringParameterValue(2033));
            getCluster().clusterWorkLoadDataSetValue(pcfmessage.getStringParameterValue(2034));
            getCluster().clusterWorkLoadLengthSetValue(pcfmessage.getIntParameterValue(58));
            getCommunication().defXmitQNameSetValue(pcfmessage.getStringParameterValue(2025));
            getCommunication().channelAutoDefSetValue(pcfmessage.getIntParameterValue(55));
            getCommunication().channelAutoDefEventSetValue(pcfmessage.getIntParameterValue(56));
            getCommunication().channelAutoDefExitSetValue(pcfmessage.getStringParameterValue(2026));
            getEvents().authorityEventSetValue(pcfmessage.getIntParameterValue(47));
            getEvents().localEventSetValue(pcfmessage.getIntParameterValue(49));
            getEvents().inhibitEventSetValue(pcfmessage.getIntParameterValue(48));
            getEvents().remoteEventSetValue(pcfmessage.getIntParameterValue(50));
            getEvents().startStopEventSetValue(pcfmessage.getIntParameterValue(52));
            getEvents().performanceEventSetValue(pcfmessage.getIntParameterValue(53));
            getStatistics().creationDateSetValue(pcfmessage.getStringParameterValue(2004));
            getStatistics().creationTimeSetValue(pcfmessage.getStringParameterValue(2005));
            getStatistics().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getStatistics().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getStatistics().QMgrIdentifierSetValue(pcfmessage.getStringParameterValue(2032));
            QueueListModel queuelistmodel = queuemanagermodel.getQueueListModel();
            String as[] = queuelistmodel.getLocalQueueNames(0);
            getExtended().deadLetterQNameInit(as);
            as = queuelistmodel.getLocalQueueNames(4);
            getCommunication().defXmitQNameInit(as);
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        SwingUtils.setCenter(MQJExplorer.mainFrame, this);
        setTitle(queuemanagermodel.getQueueManagerName() + " Properties");
        setVisible(true);
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            oK();
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
            cancel();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void doChange()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(1);
        pcfmessage.addParameter(2014, getGeneral().QMgrDescGetValue());
        pcfmessage.addParameter(2006, getExtended().deadLetterQNameGetValue());
        pcfmessage.addParameter(25, getExtended().triggerIntervalGetValue());
        pcfmessage.addParameter(11, getExtended().maxHandlesGetValue());
        pcfmessage.addParameter(13, getExtended().maxMsgLengthGetValue());
        pcfmessage.addParameter(33, getExtended().maxUncommitedMsgsGetValue());
        pcfmessage.addParameter(1005, 1);
        pcfmessage.addParameter(2025, getCommunication().defXmitQNameGetValue());
        pcfmessage.addParameter(55, getCommunication().channelAutoDefGetValue());
        pcfmessage.addParameter(56, getCommunication().channelAutoDefEventGetValue());
        pcfmessage.addParameter(2026, getCommunication().channelAutoDefExitGetValue());
        pcfmessage.addParameter(47, getEvents().authorityEventGetValue());
        pcfmessage.addParameter(49, getEvents().localEventGetValue());
        pcfmessage.addParameter(50, getEvents().remoteEventGetValue());
        pcfmessage.addParameter(52, getEvents().startStopEventGetValue());
        pcfmessage.addParameter(53, getEvents().performanceEventGetValue());
        pcfmessage.addParameter(48, getEvents().inhibitEventGetValue());
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

    private JButton getCancel()
    {
        if(ivjCancel == null)
            try
            {
                ivjCancel = new JButton();
                ivjCancel.setName("Cancel");
                ivjCancel.setText("Cancel");
                ivjCancel.setHorizontalAlignment(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCancel;
    }

    private QMgrCluster getCluster()
    {
        if(ivjCluster == null)
            try
            {
                ivjCluster = new QMgrCluster();
                ivjCluster.setName("Cluster");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCluster;
    }

    private QMgrCommunication getCommunication()
    {
        if(ivjCommunication == null)
            try
            {
                ivjCommunication = new QMgrCommunication();
                ivjCommunication.setName("Communication");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCommunication;
    }

    private QMgrEvents getEvents()
    {
        if(ivjEvents == null)
            try
            {
                ivjEvents = new QMgrEvents();
                ivjEvents.setName("Events");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEvents;
    }

    private QMgrExtended getExtended()
    {
        if(ivjExtended == null)
            try
            {
                ivjExtended = new QMgrExtended();
                ivjExtended.setName("Extended");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExtended;
    }

    private JPanel getFooterPanel()
    {
        if(ivjFooterPanel == null)
            try
            {
                ivjFooterPanel = new JPanel();
                ivjFooterPanel.setName("FooterPanel");
                ivjFooterPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 13;
                getFooterPanel().add(getOK(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.anchor = 13;
                getFooterPanel().add(getCancel(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooterPanel;
    }

    private QMgrGeneral getGeneral()
    {
        if(ivjGeneral == null)
            try
            {
                ivjGeneral = new QMgrGeneral();
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
                getJDialogContentPane().add(getJTabbedPane1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 13;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooterPanel(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JTabbedPane getJTabbedPane1()
    {
        if(ivjJTabbedPane1 == null)
            try
            {
                ivjJTabbedPane1 = new JTabbedPane();
                ivjJTabbedPane1.setName("JTabbedPane1");
                ivjJTabbedPane1.insertTab("General", null, getGeneral(), null, 0);
                ivjJTabbedPane1.insertTab("Extended", null, getExtended(), null, 1);
                ivjJTabbedPane1.insertTab("Cluster", null, getCluster(), null, 2);
                ivjJTabbedPane1.insertTab("Communication", null, getCommunication(), null, 3);
                ivjJTabbedPane1.insertTab("Events", null, getEvents(), null, 4);
                ivjJTabbedPane1.insertTab("Statistics", null, getStatistics(), null, 5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTabbedPane1;
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

    private QMgrStatistics getStatistics()
    {
        if(ivjStatistics == null)
            try
            {
                ivjStatistics = new QMgrStatistics();
                ivjStatistics.setName("Statistics");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStatistics;
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
            setName("QMgrDlg");
            setDefaultCloseOperation(2);
            setSize(426, 354);
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
            QMgrDlg qmgrdlg = new QMgrDlg();
            qmgrdlg.setModal(true);
            qmgrdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            qmgrdlg.show();
            Insets insets = qmgrdlg.getInsets();
            qmgrdlg.setSize(qmgrdlg.getWidth() + insets.left + insets.right, qmgrdlg.getHeight() + insets.top + insets.bottom);
            qmgrdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void oK()
    {
        try
        {
            doChange();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        dispose();
    }

    private JButton ivjCancel;
    private QMgrCluster ivjCluster;
    private QMgrCommunication ivjCommunication;
    IvjEventHandler ivjEventHandler;
    private QMgrEvents ivjEvents;
    private QMgrExtended ivjExtended;
    private QMgrGeneral ivjGeneral;
    private JPanel ivjJDialogContentPane;
    private JTabbedPane ivjJTabbedPane1;
    private JButton ivjOK;
    private QMgrStatistics ivjStatistics;
    private JPanel ivjFooterPanel;
    private QueueManagerModel queueManagerModel;




}
