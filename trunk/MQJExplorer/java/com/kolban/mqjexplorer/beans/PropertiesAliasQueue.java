// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PropertiesAliasQueue.java

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

// Referenced classes of package com.kolban.mqjexplorer.beans:
//            PropertiesLocalQueue

public class PropertiesAliasQueue extends JDialog
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


    public PropertiesAliasQueue()
    {
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjCluster = null;
        ivjGeneral = null;
        ivjStatistics = null;
        ivjCancel = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        hasQueueChanged = false;
        ivjEventHandler = new IvjEventHandler();
        initialize();
    }

    public PropertiesAliasQueue(Dialog dialog)
    {
        super(dialog);
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjCluster = null;
        ivjGeneral = null;
        ivjStatistics = null;
        ivjCancel = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        hasQueueChanged = false;
        ivjEventHandler = new IvjEventHandler();
    }

    public PropertiesAliasQueue(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjCluster = null;
        ivjGeneral = null;
        ivjStatistics = null;
        ivjCancel = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        hasQueueChanged = false;
        ivjEventHandler = new IvjEventHandler();
    }

    public PropertiesAliasQueue(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjCluster = null;
        ivjGeneral = null;
        ivjStatistics = null;
        ivjCancel = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        hasQueueChanged = false;
        ivjEventHandler = new IvjEventHandler();
    }

    public PropertiesAliasQueue(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjCluster = null;
        ivjGeneral = null;
        ivjStatistics = null;
        ivjCancel = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        hasQueueChanged = false;
        ivjEventHandler = new IvjEventHandler();
    }

    public PropertiesAliasQueue(Frame frame)
    {
        super(frame);
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjCluster = null;
        ivjGeneral = null;
        ivjStatistics = null;
        ivjCancel = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        hasQueueChanged = false;
        ivjEventHandler = new IvjEventHandler();
    }

    public PropertiesAliasQueue(Frame frame, String s)
    {
        super(frame, s);
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjCluster = null;
        ivjGeneral = null;
        ivjStatistics = null;
        ivjCancel = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        hasQueueChanged = false;
        ivjEventHandler = new IvjEventHandler();
    }

    public PropertiesAliasQueue(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjCluster = null;
        ivjGeneral = null;
        ivjStatistics = null;
        ivjCancel = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        hasQueueChanged = false;
        ivjEventHandler = new IvjEventHandler();
    }

    public PropertiesAliasQueue(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjJDialogContentPane = null;
        ivjJTabbedPane1 = null;
        ivjCluster = null;
        ivjGeneral = null;
        ivjStatistics = null;
        ivjCancel = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjOK = null;
        hasQueueChanged = false;
        ivjEventHandler = new IvjEventHandler();
    }

    public void cancel()
    {
        dispose();
    }

    private void changeQueue(boolean flag)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(8);
        pcfmessage.addParameter(2016, getGeneral().QNameGetValue());
        pcfmessage.addParameter(20, 3);
        pcfmessage.addParameter(1005, flag ? 1 : 0);
        pcfmessage.addParameter(2013, getGeneral().QDescGetValue());
        pcfmessage.addParameter(10, getGeneral().inhibitPutGetValue());
        pcfmessage.addParameter(9, getGeneral().inhibitGetGetValue());
        pcfmessage.addParameter(6, getGeneral().defPriorityGetValue());
        pcfmessage.addParameter(5, getGeneral().defPersistenceGetValue());
        pcfmessage.addParameter(45, getGeneral().scopeGetValue());
        pcfmessage.addParameter(2002, getGeneral().baseQueueNameGetValue());
        pcfmessage.addParameter(61, getCluster().defBindGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
            hasQueueChanged = true;
        }
        catch(PCFException pcfexception)
        {
            System.out.println("changeQueue: " + pcfexception.toString());
            throw pcfexception;
        }
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

    public void doModal(Frame frame, String s, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        PCFMessage pcfmessage = queuemanagermodel.findQueueByName(s);
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
                ivjCancel.setHorizontalAlignment(4);
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
                ivjJTabbedPane1.insertTab("Statistics", null, getStatistics(), null, 2);
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

    private StatisticsAliasPane getStatistics()
    {
        if(ivjStatistics == null)
            try
            {
                ivjStatistics = new StatisticsAliasPane();
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
            setName("PropertiesLocalQueue");
            setDefaultCloseOperation(2);
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
            PropertiesLocalQueue propertieslocalqueue = new PropertiesLocalQueue();
            propertieslocalqueue.setModal(true);
            propertieslocalqueue.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            propertieslocalqueue.show();
            Insets insets = propertieslocalqueue.getInsets();
            propertieslocalqueue.setSize(propertieslocalqueue.getWidth() + insets.left + insets.right, propertieslocalqueue.getHeight() + insets.top + insets.bottom);
            propertieslocalqueue.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void oK()
    {
        try
        {
            changeQueue(false);
            dispose();
        }
        catch(MQException mqexception)
        {
            if(mqexception.reasonCode == 4004)
            {
                int i = JOptionPane.showConfirmDialog(this, "The queue is open, do you want to force the change?", "Force queue change?", 0);
                if(i == 0)
                    try
                    {
                        changeQueue(true);
                        dispose();
                    }
                    catch(MQException _ex) { }
            }
        }
    }

    public void setMessageTemplate(PCFMessage pcfmessage, String as[])
    {
        try
        {
            getGeneral().QNameSetValue(pcfmessage.getStringParameterValue(2016));
            getGeneral().QDescSetValue(pcfmessage.getStringParameterValue(2013));
            getGeneral().inhibitPutSetValue(pcfmessage.getIntParameterValue(10));
            getGeneral().inhibitGetSetValue(pcfmessage.getIntParameterValue(9));
            getGeneral().defPrioritySetValue(pcfmessage.getIntParameterValue(6));
            getGeneral().defPersistenceSetValue(pcfmessage.getIntParameterValue(5));
            getGeneral().scopeSetValue(pcfmessage.getIntParameterValue(45));
            getGeneral().baseQueueNameInit(as);
            getGeneral().baseQueueNameSetValue(pcfmessage.getStringParameterValue(2002));
            getGeneral().QNameSetEditable(false);
            setTitle(getGeneral().QNameGetValue().trim() + " Properties");
            getStatistics().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getStatistics().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
        }
        catch(Exception _ex) { }
    }

    private JPanel ivjJDialogContentPane;
    private JTabbedPane ivjJTabbedPane1;
    private QueueClusterPane ivjCluster;
    private QueueAliasGeneralPane ivjGeneral;
    private StatisticsAliasPane ivjStatistics;
    private JButton ivjCancel;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JButton ivjOK;
    private QueueManagerModel queueManagerModel;
    private boolean hasQueueChanged;
    IvjEventHandler ivjEventHandler;




}
