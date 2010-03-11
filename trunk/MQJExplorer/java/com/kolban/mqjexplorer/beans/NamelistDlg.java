// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NamelistDlg.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFException;
import com.ibm.mq.pcf.PCFMessage;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.mqjexplorer.panels.NameListPane;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NamelistDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getCancel())
                connEtoC2();
            if(actionevent.getSource() == getOk())
                connEtoC1();
        }

        IvjEventHandler()
        {
        }
    }


    public NamelistDlg()
    {
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjGeneral = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjOk = null;
        queueManagerModel = null;
        initialize();
    }

    public NamelistDlg(Dialog dialog)
    {
        super(dialog);
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjGeneral = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjOk = null;
        queueManagerModel = null;
    }

    public NamelistDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjGeneral = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjOk = null;
        queueManagerModel = null;
    }

    public NamelistDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjGeneral = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjOk = null;
        queueManagerModel = null;
    }

    public NamelistDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjGeneral = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjOk = null;
        queueManagerModel = null;
    }

    public NamelistDlg(Frame frame)
    {
        super(frame);
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjGeneral = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjOk = null;
        queueManagerModel = null;
    }

    public NamelistDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjGeneral = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjOk = null;
        queueManagerModel = null;
    }

    public NamelistDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjGeneral = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjOk = null;
        queueManagerModel = null;
    }

    public NamelistDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        ivjGeneral = null;
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjOk = null;
        queueManagerModel = null;
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
            PCFMessage pcfmessage = queuemanagermodel.getNamelistListModel().findNamelistByName(s);
            getGeneral().nameListNameSetValue(pcfmessage.getStringParameterValue(2010));
            getGeneral().nameListNameSetEditable(false);
            getGeneral().alterationTimeSetValue(pcfmessage.getStringParameterValue(2028));
            getGeneral().alterationDateSetValue(pcfmessage.getStringParameterValue(2027));
            getGeneral().nameListDescSetValue(pcfmessage.getStringParameterValue(2009));
            getGeneral().namesSetValue(pcfmessage.getStringListParameterValue(2020));
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
            ok_ActionEvents();
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
        type = 1;
        try
        {
            PCFMessage pcfmessage = queuemanagermodel.getNamelistListModel().findNamelistByName("SYSTEM.DEFAULT.NAMELIST");
            getGeneral().nameListDescSetValue(pcfmessage.getStringParameterValue(2009));
            getGeneral().namesSetValue(pcfmessage.getStringListParameterValue(2020));
            getGeneral().alterationDateSetVisible(false);
            getGeneral().alterationTimeSetVisible(false);
            setTitle("Create NameList Definition");
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
        PCFMessage pcfmessage = new PCFMessage(32);
        pcfmessage.addParameter(2010, getGeneral().nameListNameGetValue());
        pcfmessage.addParameter(2009, getGeneral().nameListDescGetValue());
        pcfmessage.addParameter(2020, getGeneral().namesGetValue());
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
        PCFMessage pcfmessage = new PCFMessage(34);
        pcfmessage.addParameter(2010, getGeneral().nameListNameGetValue());
        pcfmessage.addParameter(2009, getGeneral().nameListDescGetValue());
        pcfmessage.addParameter(2020, getGeneral().namesGetValue());
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

    private NameListPane getGeneral()
    {
        if(ivjGeneral == null)
            try
            {
                ivjGeneral = new NameListPane();
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
                getJPanel1().add(getOk(), getOk().getName());
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

    public String getNamelistName()
    {
        return getGeneral().nameListNameGetValue();
    }

    private JButton getOk()
    {
        if(ivjOk == null)
            try
            {
                ivjOk = new JButton();
                ivjOk.setName("Ok");
                ivjOk.setText("OK");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOk;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getCancel().addActionListener(ivjEventHandler);
        getOk().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("NameListDlg");
            setDefaultCloseOperation(2);
            setSize(426, 240);
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

    public void jButton1_ActionEvents()
    {
        dispose();
    }

    public static void main(String args[])
    {
        try
        {
            NamelistDlg namelistdlg = new NamelistDlg();
            namelistdlg.setModal(true);
            namelistdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            namelistdlg.show();
            Insets insets = namelistdlg.getInsets();
            namelistdlg.setSize(namelistdlg.getWidth() + insets.left + insets.right, namelistdlg.getHeight() + insets.top + insets.bottom);
            namelistdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void ok_ActionEvents()
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

    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JTabbedPane ivjJTabbedPane1;
    private NameListPane ivjGeneral;
    private JButton ivjCancel;
    IvjEventHandler ivjEventHandler;
    private JButton ivjOk;
    private QueueManagerModel queueManagerModel;
    private int type;
    private static final int TYPE_CREATE = 1;
    private static final int TYPE_CHANGE = 2;




}
