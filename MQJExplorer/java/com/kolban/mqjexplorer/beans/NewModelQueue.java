// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NewModelQueue.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFException;
import com.ibm.mq.pcf.PCFMessage;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.mqjexplorer.panels.*;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewModelQueue extends JDialog
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


    public NewModelQueue()
    {
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjStorage = null;
        ivjTriggering = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        initialize();
    }

    public NewModelQueue(Dialog dialog)
    {
        super(dialog);
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjStorage = null;
        ivjTriggering = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewModelQueue(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjStorage = null;
        ivjTriggering = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewModelQueue(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjStorage = null;
        ivjTriggering = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewModelQueue(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjStorage = null;
        ivjTriggering = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewModelQueue(Frame frame)
    {
        super(frame);
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjStorage = null;
        ivjTriggering = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewModelQueue(Frame frame, String s)
    {
        super(frame, s);
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjStorage = null;
        ivjTriggering = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewModelQueue(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjStorage = null;
        ivjTriggering = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewModelQueue(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjEvents = null;
        ivjExtended = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjStorage = null;
        ivjTriggering = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public void cancel_ActionEvents()
    {
        dispose();
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

    private void createQueue()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(11);
        pcfmessage.addParameter(2016, getGeneral().QNameGetValue());
        pcfmessage.addParameter(20, 2);
        pcfmessage.addParameter(2013, getGeneral().QDescGetValue());
        pcfmessage.addParameter(10, getGeneral().inhibitPutGetValue());
        pcfmessage.addParameter(9, getGeneral().inhibitGetGetValue());
        pcfmessage.addParameter(6, getGeneral().defPriorityGetValue());
        pcfmessage.addParameter(5, getGeneral().defPersistenceGetValue());
        pcfmessage.addParameter(15, getExtended().maxQDepthGetValue());
        pcfmessage.addParameter(13, getExtended().maxMsgLengthGetValue());
        pcfmessage.addParameter(22, getStorage().backoutThresholdGetValue());
        pcfmessage.addParameter(2019, getStorage().backoutRequeueNameGetValue());
        pcfmessage.addParameter(23, getExtended().shareabilityGetValue());
        pcfmessage.addParameter(4, getExtended().defInputOpenOptionGetValue());
        pcfmessage.addParameter(8, getStorage().hardenGetBackoutGetValue());
        pcfmessage.addParameter(16, getExtended().msgDeliverySequenceGetValue());
        pcfmessage.addParameter(21, getExtended().retentionIntervalGetValue());
        pcfmessage.addParameter(34, getExtended().distListsGetValue());
        pcfmessage.addParameter(7, getExtended().definitionTypeGetValue());
        pcfmessage.addParameter(12, getGeneral().usageGetValue());
        pcfmessage.addParameter(2008, getTriggering().initiationQueueNameGetValue());
        pcfmessage.addParameter(24, getTriggering().triggerControlGetValue());
        pcfmessage.addParameter(28, getTriggering().triggerTypeGetValue());
        pcfmessage.addParameter(26, getTriggering().triggerMsgPriorityGetValue());
        pcfmessage.addParameter(29, getTriggering().triggerDepthGetValue());
        pcfmessage.addParameter(2023, getTriggering().triggerDataGetValue());
        pcfmessage.addParameter(40, getEvents().QDepthHighLimitGetValue());
        pcfmessage.addParameter(41, getEvents().QDepthLowLimitGetValue());
        pcfmessage.addParameter(42, getEvents().QDepthMaxEventGetValue());
        pcfmessage.addParameter(43, getEvents().QDepthHighEventGetValue());
        pcfmessage.addParameter(44, getEvents().QDepthLowEventGetValue());
        pcfmessage.addParameter(54, getEvents().QServiceIntervalGetValue());
        pcfmessage.addParameter(46, getEvents().QServiceIntervalEventGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("createQueue: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doModal(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        PCFMessage pcfmessage = queuemanagermodel.findQueueByName("SYSTEM.DEFAULT.MODEL.QUEUE");
        if(pcfmessage == null)
        {
            return;
        } else
        {
            setMessageTemplate(pcfmessage, queuemanagermodel.getQueueListModel().getLocalQueueNames(0));
            pack();
            SwingUtils.setCenter(frame, this);
            setVisible(true);
            return;
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

    private QueueEventsPane getEvents()
    {
        if(ivjEvents == null)
            try
            {
                ivjEvents = new QueueEventsPane();
                ivjEvents.setName("Events");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEvents;
    }

    private QueueExtendedPane getExtended()
    {
        if(ivjExtended == null)
            try
            {
                ivjExtended = new QueueExtendedPane();
                ivjExtended.setName("Extended");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExtended;
    }

    private QueueModelGeneralPane getGeneral()
    {
        if(ivjGeneral == null)
            try
            {
                ivjGeneral = new QueueModelGeneralPane();
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
                gridbagconstraints.gridy = 1;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJTabbedPane1(), gridbagconstraints1);
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

    private JTabbedPane getJTabbedPane1()
    {
        if(ivjJTabbedPane1 == null)
            try
            {
                ivjJTabbedPane1 = new JTabbedPane();
                ivjJTabbedPane1.setName("JTabbedPane1");
                ivjJTabbedPane1.insertTab("General", null, getGeneral(), null, 0);
                ivjJTabbedPane1.insertTab("Extended", null, getExtended(), null, 1);
                ivjJTabbedPane1.insertTab("Triggering", null, getTriggering(), null, 2);
                ivjJTabbedPane1.insertTab("Events", null, getEvents(), null, 3);
                ivjJTabbedPane1.insertTab("Storage", null, getStorage(), null, 4);
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

    public String getQueueName()
    {
        return getGeneral().QNameGetValue();
    }

    private QueueStoragePane getStorage()
    {
        if(ivjStorage == null)
            try
            {
                ivjStorage = new QueueStoragePane();
                ivjStorage.setName("Storage");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStorage;
    }

    private QueueTriggeringPane getTriggering()
    {
        if(ivjTriggering == null)
            try
            {
                ivjTriggering = new QueueTriggeringPane();
                ivjTriggering.setName("Triggering");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTriggering;
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
            setName("NewModelQueue");
            setDefaultCloseOperation(2);
            setTitle("Create Model Queue");
            setSize(426, 371);
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
            NewModelQueue newmodelqueue = new NewModelQueue();
            newmodelqueue.setModal(true);
            newmodelqueue.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            newmodelqueue.show();
            Insets insets = newmodelqueue.getInsets();
            newmodelqueue.setSize(newmodelqueue.getWidth() + insets.left + insets.right, newmodelqueue.getHeight() + insets.top + insets.bottom);
            newmodelqueue.setVisible(true);
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
            createQueue();
            dispose();
        }
        catch(MQException mqexception)
        {
            System.out.println("ok_ActionEvents: " + mqexception.toString());
        }
    }

    public void setMessageTemplate(PCFMessage pcfmessage, String as[])
    {
        try
        {
            getGeneral().QTypeSetValue(2);
            getGeneral().inhibitPutSetValue(pcfmessage.getIntParameterValue(10));
            getGeneral().inhibitGetSetValue(pcfmessage.getIntParameterValue(9));
            getGeneral().defPrioritySetValue(pcfmessage.getIntParameterValue(6));
            getGeneral().defPersistenceSetValue(pcfmessage.getIntParameterValue(5));
            getGeneral().usageSetValue(pcfmessage.getIntParameterValue(12));
            getExtended().maxQDepthSetValue(pcfmessage.getIntParameterValue(15));
            getExtended().maxMsgLengthSetValue(pcfmessage.getIntParameterValue(13));
            getExtended().shareabilitySetValue(pcfmessage.getIntParameterValue(23));
            getExtended().defInputOpenOptionSetValue(pcfmessage.getIntParameterValue(4));
            getExtended().msgDeliverySequenceSetValue(pcfmessage.getIntParameterValue(16));
            getExtended().retentionIntervalSetValue(pcfmessage.getIntParameterValue(21));
            getExtended().distListsSetValue(pcfmessage.getIntParameterValue(34));
            getTriggering().triggerControlSetValue(pcfmessage.getIntParameterValue(24));
            getTriggering().triggerTypeSetValue(pcfmessage.getIntParameterValue(28));
            getTriggering().triggerDepthSetValue(pcfmessage.getIntParameterValue(29));
            getTriggering().triggerMsgPrioritySetValue(pcfmessage.getIntParameterValue(26));
            getTriggering().initiationQueueNameInit(as);
            getTriggering().initiationQueueNameSetValue(pcfmessage.getStringParameterValue(2008));
            getEvents().QDepthMaxEventSetValue(pcfmessage.getIntParameterValue(42));
            getEvents().QDepthHighEventSetValue(pcfmessage.getIntParameterValue(43));
            getEvents().QDepthHighLimitSetValue(pcfmessage.getIntParameterValue(40));
            getEvents().QDepthLowEventSetValue(pcfmessage.getIntParameterValue(44));
            getEvents().QDepthLowLimitSetValue(pcfmessage.getIntParameterValue(41));
            getEvents().QServiceIntervalEventSetValue(pcfmessage.getIntParameterValue(46));
            getEvents().QServiceIntervalSetValue(pcfmessage.getIntParameterValue(54));
            getStorage().backoutRequeueNameInit(as);
            getStorage().backoutRequeueNameSetValue(pcfmessage.getStringParameterValue(2019).trim());
            getStorage().backoutThresholdSetValue(pcfmessage.getIntParameterValue(22));
            getStorage().hardenGetBackoutSetValue(pcfmessage.getIntParameterValue(8));
        }
        catch(Exception _ex) { }
    }

    private QueueEventsPane ivjEvents;
    private QueueExtendedPane ivjExtended;
    private QueueModelGeneralPane ivjGeneral;
    private JPanel ivjJDialogContentPane;
    private JTabbedPane ivjJTabbedPane1;
    private QueueStoragePane ivjStorage;
    private QueueTriggeringPane ivjTriggering;
    private QueueManagerModel queueManagerModel;
    private JButton ivjCancel;
    IvjEventHandler ivjEventHandler;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JButton ivjOK;




}
