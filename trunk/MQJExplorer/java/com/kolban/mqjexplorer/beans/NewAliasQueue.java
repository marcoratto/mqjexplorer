// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NewAliasQueue.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFException;
import com.ibm.mq.pcf.PCFMessage;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.mqjexplorer.panels.QueueAliasGeneralPane;
import com.kolban.mqjexplorer.panels.QueueClusterPane;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewAliasQueue extends JDialog
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


    public NewAliasQueue()
    {
        ivjCluster = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        initialize();
    }

    public NewAliasQueue(Dialog dialog)
    {
        super(dialog);
        ivjCluster = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewAliasQueue(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjCluster = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewAliasQueue(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjCluster = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewAliasQueue(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjCluster = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewAliasQueue(Frame frame)
    {
        super(frame);
        ivjCluster = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewAliasQueue(Frame frame, String s)
    {
        super(frame, s);
        ivjCluster = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewAliasQueue(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjCluster = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        queueManagerModel = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
    }

    public NewAliasQueue(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjCluster = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
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

    private void createAliasQueue()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(11);
        pcfmessage.addParameter(2016, getGeneral().QNameGetValue());
        pcfmessage.addParameter(20, 3);
        pcfmessage.addParameter(2013, getGeneral().QDescGetValue());
        pcfmessage.addParameter(10, getGeneral().inhibitPutGetValue());
        pcfmessage.addParameter(9, getGeneral().inhibitGetGetValue());
        pcfmessage.addParameter(6, getGeneral().defPriorityGetValue());
        pcfmessage.addParameter(5, getGeneral().defPersistenceGetValue());
        pcfmessage.addParameter(2002, getGeneral().baseQueueNameGetValue());
        pcfmessage.addParameter(61, getCluster().defBindGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("createAliasQueue: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doModal(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        PCFMessage pcfmessage = queuemanagermodel.findQueueByName("SYSTEM.DEFAULT.ALIAS.QUEUE");
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

    private QueueClusterPane getCluster()
    {
        if(ivjCluster == null)
            try
            {
                ivjCluster = new QueueClusterPane();
                ivjCluster.setName("Cluster");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCluster;
    }

    private QueueAliasGeneralPane getGeneral()
    {
        if(ivjGeneral == null)
            try
            {
                ivjGeneral = new QueueAliasGeneralPane();
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

    private JTabbedPane getJTabbedPane1()
    {
        if(ivjJTabbedPane1 == null)
            try
            {
                ivjJTabbedPane1 = new JTabbedPane();
                ivjJTabbedPane1.setName("JTabbedPane1");
                ivjJTabbedPane1.insertTab("General", null, getGeneral(), null, 0);
                ivjJTabbedPane1.insertTab("Cluster", null, getCluster(), null, 1);
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
            setName("NewAliasQueue");
            setDefaultCloseOperation(2);
            setTitle("Create Alias Queue");
            setSize(426, 376);
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
            NewAliasQueue newaliasqueue = new NewAliasQueue();
            newaliasqueue.setModal(true);
            newaliasqueue.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            newaliasqueue.show();
            Insets insets = newaliasqueue.getInsets();
            newaliasqueue.setSize(newaliasqueue.getWidth() + insets.left + insets.right, newaliasqueue.getHeight() + insets.top + insets.bottom);
            newaliasqueue.setVisible(true);
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
            createAliasQueue();
            dispose();
        }
        catch(Exception exception)
        {
            System.out.println("ok_ActionEvents: " + exception.toString());
        }
    }

    public void setMessageTemplate(PCFMessage pcfmessage, String as[])
    {
        try
        {
            getGeneral().QTypeSetValue(3);
            getGeneral().inhibitPutSetValue(pcfmessage.getIntParameterValue(10));
            getGeneral().inhibitGetSetValue(pcfmessage.getIntParameterValue(9));
            getGeneral().defPrioritySetValue(pcfmessage.getIntParameterValue(6));
            getGeneral().defPersistenceSetValue(pcfmessage.getIntParameterValue(5));
            getGeneral().scopeSetValue(pcfmessage.getIntParameterValue(45));
            getGeneral().baseQueueNameInit(as);
            getGeneral().baseQueueNameSetValue(pcfmessage.getStringParameterValue(2002));
            getCluster().clusterNameSetValue(pcfmessage.getStringParameterValue(2029));
            getCluster().defBindSetValue(pcfmessage.getIntParameterValue(61));
        }
        catch(Exception _ex) { }
    }

    private QueueClusterPane ivjCluster;
    private QueueAliasGeneralPane ivjGeneral;
    private JPanel ivjJDialogContentPane;
    private JTabbedPane ivjJTabbedPane1;
    private QueueManagerModel queueManagerModel;
    private JButton ivjCancel;
    IvjEventHandler ivjEventHandler;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JButton ivjOK;




}
