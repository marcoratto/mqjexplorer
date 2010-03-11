// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StopDialog.java

package com.kolban.mqjexplorer.commands;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer.commands:
//            ExecuteCommand

public class StopDialog extends JDialog
{
    class IvjEventHandler
        implements ActionListener, ItemListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getCancel())
                connEtoC1();
            if(actionevent.getSource() == getOK())
                connEtoC2();
        }

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getStopQueueManager())
                connEtoM1(itemevent);
            if(itemevent.getSource() == getStopQueueManager())
                connEtoM2(itemevent);
            if(itemevent.getSource() == getStopQueueManager())
                connEtoM3(itemevent);
        }

        IvjEventHandler()
        {
        }
    }


    public StopDialog()
    {
        ivjCancel = null;
        ivjControlled = null;
        ivjFooterPanel = null;
        ivjFooterPanel2 = null;
        ivjFooterPanel2FlowLayout = null;
        ivjImmediate = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjOptions = null;
        ivjPreemptive = null;
        ivjEventHandler = new IvjEventHandler();
        queueManagerName = null;
        ivjJScrollPane1 = null;
        ivjOutput = null;
        ivjOutputPanel = null;
        ivjShutdownTypeButtonGroup = null;
        ivjStopTypeButtonGroup = null;
        ivjStopCommandServer = null;
        ivjStopQueueManager = null;
        initialize();
    }

    public StopDialog(Dialog dialog)
    {
        super(dialog);
        ivjCancel = null;
        ivjControlled = null;
        ivjFooterPanel = null;
        ivjFooterPanel2 = null;
        ivjFooterPanel2FlowLayout = null;
        ivjImmediate = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjOptions = null;
        ivjPreemptive = null;
        ivjEventHandler = new IvjEventHandler();
        queueManagerName = null;
        ivjJScrollPane1 = null;
        ivjOutput = null;
        ivjOutputPanel = null;
        ivjShutdownTypeButtonGroup = null;
        ivjStopTypeButtonGroup = null;
        ivjStopCommandServer = null;
        ivjStopQueueManager = null;
    }

    public StopDialog(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjCancel = null;
        ivjControlled = null;
        ivjFooterPanel = null;
        ivjFooterPanel2 = null;
        ivjFooterPanel2FlowLayout = null;
        ivjImmediate = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjOptions = null;
        ivjPreemptive = null;
        ivjEventHandler = new IvjEventHandler();
        queueManagerName = null;
        ivjJScrollPane1 = null;
        ivjOutput = null;
        ivjOutputPanel = null;
        ivjShutdownTypeButtonGroup = null;
        ivjStopTypeButtonGroup = null;
        ivjStopCommandServer = null;
        ivjStopQueueManager = null;
    }

    public StopDialog(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjCancel = null;
        ivjControlled = null;
        ivjFooterPanel = null;
        ivjFooterPanel2 = null;
        ivjFooterPanel2FlowLayout = null;
        ivjImmediate = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjOptions = null;
        ivjPreemptive = null;
        ivjEventHandler = new IvjEventHandler();
        queueManagerName = null;
        ivjJScrollPane1 = null;
        ivjOutput = null;
        ivjOutputPanel = null;
        ivjShutdownTypeButtonGroup = null;
        ivjStopTypeButtonGroup = null;
        ivjStopCommandServer = null;
        ivjStopQueueManager = null;
    }

    public StopDialog(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjCancel = null;
        ivjControlled = null;
        ivjFooterPanel = null;
        ivjFooterPanel2 = null;
        ivjFooterPanel2FlowLayout = null;
        ivjImmediate = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjOptions = null;
        ivjPreemptive = null;
        ivjEventHandler = new IvjEventHandler();
        queueManagerName = null;
        ivjJScrollPane1 = null;
        ivjOutput = null;
        ivjOutputPanel = null;
        ivjShutdownTypeButtonGroup = null;
        ivjStopTypeButtonGroup = null;
        ivjStopCommandServer = null;
        ivjStopQueueManager = null;
    }

    public StopDialog(Frame frame)
    {
        super(frame);
        ivjCancel = null;
        ivjControlled = null;
        ivjFooterPanel = null;
        ivjFooterPanel2 = null;
        ivjFooterPanel2FlowLayout = null;
        ivjImmediate = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjOptions = null;
        ivjPreemptive = null;
        ivjEventHandler = new IvjEventHandler();
        queueManagerName = null;
        ivjJScrollPane1 = null;
        ivjOutput = null;
        ivjOutputPanel = null;
        ivjShutdownTypeButtonGroup = null;
        ivjStopTypeButtonGroup = null;
        ivjStopCommandServer = null;
        ivjStopQueueManager = null;
    }

    public StopDialog(Frame frame, String s)
    {
        super(frame, s);
        ivjCancel = null;
        ivjControlled = null;
        ivjFooterPanel = null;
        ivjFooterPanel2 = null;
        ivjFooterPanel2FlowLayout = null;
        ivjImmediate = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjOptions = null;
        ivjPreemptive = null;
        ivjEventHandler = new IvjEventHandler();
        queueManagerName = null;
        ivjJScrollPane1 = null;
        ivjOutput = null;
        ivjOutputPanel = null;
        ivjShutdownTypeButtonGroup = null;
        ivjStopTypeButtonGroup = null;
        ivjStopCommandServer = null;
        ivjStopQueueManager = null;
    }

    public StopDialog(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjCancel = null;
        ivjControlled = null;
        ivjFooterPanel = null;
        ivjFooterPanel2 = null;
        ivjFooterPanel2FlowLayout = null;
        ivjImmediate = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjOptions = null;
        ivjPreemptive = null;
        ivjEventHandler = new IvjEventHandler();
        queueManagerName = null;
        ivjJScrollPane1 = null;
        ivjOutput = null;
        ivjOutputPanel = null;
        ivjShutdownTypeButtonGroup = null;
        ivjStopTypeButtonGroup = null;
        ivjStopCommandServer = null;
        ivjStopQueueManager = null;
    }

    public StopDialog(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjCancel = null;
        ivjControlled = null;
        ivjFooterPanel = null;
        ivjFooterPanel2 = null;
        ivjFooterPanel2FlowLayout = null;
        ivjImmediate = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjOptions = null;
        ivjPreemptive = null;
        ivjEventHandler = new IvjEventHandler();
        queueManagerName = null;
        ivjJScrollPane1 = null;
        ivjOutput = null;
        ivjOutputPanel = null;
        ivjShutdownTypeButtonGroup = null;
        ivjStopTypeButtonGroup = null;
        ivjStopCommandServer = null;
        ivjStopQueueManager = null;
    }

    public void cancel_ActionEvents()
    {
        dispose();
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

    private void connEtoM1(ItemEvent itemevent)
    {
        try
        {
            getControlled().setEnabled(getStopQueueManager().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM2(ItemEvent itemevent)
    {
        try
        {
            getImmediate().setEnabled(getStopQueueManager().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM3(ItemEvent itemevent)
    {
        try
        {
            getPreemptive().setEnabled(getStopQueueManager().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JButton getCancel()
    {
        if(ivjCancel == null)
            try
            {
                ivjCancel = new JButton();
                ivjCancel.setName("Cancel");
                ivjCancel.setMnemonic('C');
                ivjCancel.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCancel;
    }

    private JRadioButton getControlled()
    {
        if(ivjControlled == null)
            try
            {
                ivjControlled = new JRadioButton();
                ivjControlled.setName("Controlled");
                ivjControlled.setSelected(true);
                ivjControlled.setText("Controlled");
                getShutdownTypeButtonGroup().add(ivjControlled);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjControlled;
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
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getFooterPanel().add(getJSeparator1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.gridwidth = 2;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getFooterPanel().add(getFooterPanel2(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooterPanel;
    }

    private JPanel getFooterPanel2()
    {
        if(ivjFooterPanel2 == null)
            try
            {
                ivjFooterPanel2 = new JPanel();
                ivjFooterPanel2.setName("FooterPanel2");
                ivjFooterPanel2.setLayout(getFooterPanel2FlowLayout());
                getFooterPanel2().add(getOK(), getOK().getName());
                getFooterPanel2().add(getCancel(), getCancel().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooterPanel2;
    }

    private FlowLayout getFooterPanel2FlowLayout()
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

    private JRadioButton getImmediate()
    {
        if(ivjImmediate == null)
            try
            {
                ivjImmediate = new JRadioButton();
                ivjImmediate.setName("Immediate");
                ivjImmediate.setText("Immediate");
                getShutdownTypeButtonGroup().add(ivjImmediate);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjImmediate;
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
                gridbagconstraints.gridwidth = 3;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooterPanel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 3;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getOptions(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 2;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.gridheight = 2;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getOutputPanel(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.anchor = 18;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getStopQueueManager(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 1;
                gridbagconstraints4.gridwidth = 2;
                gridbagconstraints4.fill = 2;
                gridbagconstraints4.anchor = 18;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getStopCommandServer(), gridbagconstraints4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                getJScrollPane1().setViewportView(getOutput());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
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

    private JButton getOK()
    {
        if(ivjOK == null)
            try
            {
                ivjOK = new JButton();
                ivjOK.setName("OK");
                ivjOK.setMnemonic('E');
                ivjOK.setText("Execute");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOK;
    }

    private JPanel getOptions()
    {
        if(ivjOptions == null)
            try
            {
                ivjOptions = new JPanel();
                ivjOptions.setName("Options");
                ivjOptions.setLayout(new GridBagLayout());
                ivjOptions.setEnabled(true);
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 18;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getOptions().add(getControlled(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 18;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getOptions().add(getImmediate(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 18;
                gridbagconstraints2.insets = new Insets(0, 4, 0, 4);
                getOptions().add(getPreemptive(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOptions;
    }

    private JTextArea getOutput()
    {
        if(ivjOutput == null)
            try
            {
                ivjOutput = new JTextArea();
                ivjOutput.setName("Output");
                ivjOutput.setBounds(0, 0, 160, 120);
                ivjOutput.setEditable(false);
                ivjOutput.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOutput;
    }

    private JPanel getOutputPanel()
    {
        if(ivjOutputPanel == null)
            try
            {
                ivjOutputPanel = new JPanel();
                ivjOutputPanel.setName("OutputPanel");
                ivjOutputPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.gridheight = 2;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getOutputPanel().add(getJScrollPane1(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOutputPanel;
    }

    private JRadioButton getPreemptive()
    {
        if(ivjPreemptive == null)
            try
            {
                ivjPreemptive = new JRadioButton();
                ivjPreemptive.setName("Preemptive");
                ivjPreemptive.setText("Preemtive");
                getShutdownTypeButtonGroup().add(ivjPreemptive);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPreemptive;
    }

    private String getQueueManagerName()
    {
        return queueManagerName;
    }

    private ButtonGroup getShutdownTypeButtonGroup()
    {
        if(ivjShutdownTypeButtonGroup == null)
            try
            {
                ivjShutdownTypeButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjShutdownTypeButtonGroup;
    }

    private JRadioButton getStopCommandServer()
    {
        if(ivjStopCommandServer == null)
            try
            {
                ivjStopCommandServer = new JRadioButton();
                ivjStopCommandServer.setName("StopCommandServer");
                ivjStopCommandServer.setText("Stop Command Server");
                getStopTypeButtonGroup().add(ivjStopCommandServer);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStopCommandServer;
    }

    private JRadioButton getStopQueueManager()
    {
        if(ivjStopQueueManager == null)
            try
            {
                ivjStopQueueManager = new JRadioButton();
                ivjStopQueueManager.setName("StopQueueManager");
                ivjStopQueueManager.setSelected(true);
                ivjStopQueueManager.setText("Stop Queue Manager");
                getStopTypeButtonGroup().add(ivjStopQueueManager);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStopQueueManager;
    }

    private ButtonGroup getStopTypeButtonGroup()
    {
        if(ivjStopTypeButtonGroup == null)
            try
            {
                ivjStopTypeButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStopTypeButtonGroup;
    }

    private void handleException(Throwable throwable)
    {
        System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        throwable.printStackTrace(System.out);
    }

    private void initConnections()
        throws Exception
    {
        getCancel().addActionListener(ivjEventHandler);
        getOK().addActionListener(ivjEventHandler);
        getStopQueueManager().addItemListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            getRootPane().setDefaultButton(getCancel());
            setName("StopQueueManager");
            setDefaultCloseOperation(2);
            setResizable(false);
            setSize(507, 210);
            setModal(true);
            setTitle("Stop MQSeries Components");
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
            StopDialog stopdialog = new StopDialog();
            stopdialog.setModal(true);
            stopdialog.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            stopdialog.pack();
            stopdialog.show();
            Insets insets = stopdialog.getInsets();
            stopdialog.setSize(stopdialog.getWidth() + insets.left + insets.right, stopdialog.getHeight() + insets.top + insets.bottom);
            stopdialog.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void oK_ActionEvents()
    {
        String s = null;
        if(getImmediate().isSelected())
            s = "-i";
        if(getControlled().isSelected())
            s = "-w";
        if(getPreemptive().isSelected())
            s = "-p";
        String as[] = new String[3];
        as[0] = "endmqm";
        as[1] = s;
        as[2] = getQueueManagerName();
        getOK().setEnabled(false);
        ExecuteCommand executecommand = new ExecuteCommand();
        executecommand.setCommand(as);
        executecommand.setTextArea(getOutput());
        executecommand.setCallback(new Runnable() {

            public void run()
            {
                getOK().setEnabled(true);
            }

        }
);
        Thread thread = new Thread(executecommand);
        thread.start();
    }

    public void setQueueManagerName(String s)
    {
        queueManagerName = s;
    }

    private JButton ivjCancel;
    private JRadioButton ivjControlled;
    private JPanel ivjFooterPanel;
    private JPanel ivjFooterPanel2;
    private FlowLayout ivjFooterPanel2FlowLayout;
    private JRadioButton ivjImmediate;
    private JPanel ivjJDialogContentPane;
    private JSeparator ivjJSeparator1;
    private JButton ivjOK;
    private JPanel ivjOptions;
    private JRadioButton ivjPreemptive;
    IvjEventHandler ivjEventHandler;
    private String queueManagerName;
    private JScrollPane ivjJScrollPane1;
    private JTextArea ivjOutput;
    private JPanel ivjOutputPanel;
    private ButtonGroup ivjShutdownTypeButtonGroup;
    private ButtonGroup ivjStopTypeButtonGroup;
    private JRadioButton ivjStopCommandServer;
    private JRadioButton ivjStopQueueManager;








}
