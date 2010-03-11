// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcessDlg.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFException;
import com.ibm.mq.pcf.PCFMessage;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.mqjexplorer.panels.ProcessPane;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProcessDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getCancel())
                connEtoC1();
            if(actionevent.getSource() == getOK())
                connEtoC2();
        }

        IvjEventHandler()
        {
        }
    }


    public ProcessDlg()
    {
        ivjCancel = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
        initialize();
    }

    public ProcessDlg(Dialog dialog)
    {
        super(dialog);
        ivjCancel = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public ProcessDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjCancel = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public ProcessDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjCancel = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public ProcessDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjCancel = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public ProcessDlg(Frame frame)
    {
        super(frame);
        ivjCancel = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public ProcessDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjCancel = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public ProcessDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjCancel = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public ProcessDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjCancel = null;
        ivjGeneral = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjOK = null;
        queueManagerModel = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public void cancel_ActionEvents()
    {
        dispose();
    }

    public void change(Frame frame, QueueManagerModel queuemanagermodel, String s)
    {
        queueManagerModel = queuemanagermodel;
        type = 2;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getProcessListModel().findProcessByName(s);
            getGeneral().processNameSetValue(pcfmessage.getStringParameterValue(2012));
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().processDescSetValue(pcfmessage.getStringParameterValue(2011));
            getGeneral().applTypeSetValue(pcfmessage.getIntParameterValue(1));
            getGeneral().applIdSetValue(pcfmessage.getStringParameterValue(2001));
            getGeneral().envDataSetValue(pcfmessage.getStringParameterValue(2007));
            getGeneral().userDataSetValue(pcfmessage.getStringParameterValue(2021));
            getGeneral().alterationDateSetEditable(false);
            getGeneral().alterationTimeSetEditable(false);
            getGeneral().processNameSetEditable(false);
            setTitle(s.trim() + " Properties");
        }
        catch(Exception exception)
        {
            System.out.println("change: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    private void connEtoC1()
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

    private void connEtoC2()
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

    public void create(Frame frame, QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
        type = 1;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getProcessListModel().findProcessByName("SYSTEM.DEFAULT.PROCESS");
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().processDescSetValue(pcfmessage.getStringParameterValue(2011));
            getGeneral().applTypeSetValue(pcfmessage.getIntParameterValue(1));
            getGeneral().applIdSetValue(pcfmessage.getStringParameterValue(2001));
            getGeneral().envDataSetValue(pcfmessage.getStringParameterValue(2007));
            getGeneral().userDataSetValue(pcfmessage.getStringParameterValue(2021));
            getGeneral().alterationDateSetVisible(false);
            getGeneral().alterationTimeSetVisible(false);
            setTitle("Create Process Definition");
        }
        catch(Exception exception)
        {
            System.out.println("change: " + exception.toString());
        }
        pack();
        SwingUtils.setCenter(frame, this);
        setVisible(true);
    }

    public void doChange()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(3);
        pcfmessage.addParameter(2012, getGeneral().processNameGetValue());
        pcfmessage.addParameter(2011, getGeneral().processDescGetValue());
        pcfmessage.addParameter(1, getGeneral().applTypeGetValue());
        pcfmessage.addParameter(2001, getGeneral().applIdGetValue());
        pcfmessage.addParameter(2021, getGeneral().userDataGetValue());
        pcfmessage.addParameter(2007, getGeneral().envDataGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doChange: " + pcfexception.toString());
            throw pcfexception;
        }
    }

    public void doCreate()
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(5);
        pcfmessage.addParameter(2012, getGeneral().processNameGetValue());
        pcfmessage.addParameter(2011, getGeneral().processDescGetValue());
        pcfmessage.addParameter(1, getGeneral().applTypeGetValue());
        pcfmessage.addParameter(2001, getGeneral().applIdGetValue());
        pcfmessage.addParameter(2021, getGeneral().userDataGetValue());
        pcfmessage.addParameter(2007, getGeneral().envDataGetValue());
        try
        {
            queueManagerModel.executePCF(pcfmessage);
        }
        catch(PCFException pcfexception)
        {
            System.out.println("doChange: " + pcfexception.toString());
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

    private ProcessPane getGeneral()
    {
        if(ivjGeneral == null)
            try
            {
                ivjGeneral = new ProcessPane();
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

    public String getProcessName()
    {
        return getGeneral().processNameGetValue();
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getCancel().addActionListener(ivjEventHandler);
        getOK().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("ProcessDlg");
            setDefaultCloseOperation(2);
            setSize(426, 341);
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
            ProcessDlg processdlg = new ProcessDlg();
            processdlg.setModal(true);
            processdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            processdlg.show();
            Insets insets = processdlg.getInsets();
            processdlg.setSize(processdlg.getWidth() + insets.left + insets.right, processdlg.getHeight() + insets.top + insets.bottom);
            processdlg.setVisible(true);
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
            if(type == 2)
                doChange();
            else
                doCreate();
            dispose();
        }
        catch(Exception _ex) { }
    }

    private JButton ivjCancel;
    private ProcessPane ivjGeneral;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JTabbedPane ivjJTabbedPane1;
    private JButton ivjOK;
    private QueueManagerModel queueManagerModel;
    private static final int TYPE_CREATE = 1;
    private static final int TYPE_CHANGE = 2;
    private int type;
    IvjEventHandler ivjEventHandler;




}
