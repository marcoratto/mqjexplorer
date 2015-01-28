// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PutTestMessage.java

package com.kolban.mqjexplorer.beans;

import com.kolban.mqjexplorer.MQJExplorer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class PutTestMessage extends JDialog
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


    public PutTestMessage()
    {
        super(MQJExplorer.mainFrame);
        ivjJDialogContentPane = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjQueueManagerName = null;
        ivjQueueName = null;
        ivjCancel = null;
        ivjData = null;
        ivjJPanel2FlowLayout = null;
        ivjOK = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel3 = null;
        ivjJPanel3 = null;
        ivjJLabel4 = null;
        initialize();
    }

    public PutTestMessage(Dialog dialog)
    {
        super(dialog);
        ivjJDialogContentPane = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjQueueManagerName = null;
        ivjQueueName = null;
        ivjCancel = null;
        ivjData = null;
        ivjJPanel2FlowLayout = null;
        ivjOK = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel3 = null;
        ivjJPanel3 = null;
        ivjJLabel4 = null;
    }

    public PutTestMessage(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjJDialogContentPane = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjQueueManagerName = null;
        ivjQueueName = null;
        ivjCancel = null;
        ivjData = null;
        ivjJPanel2FlowLayout = null;
        ivjOK = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel3 = null;
        ivjJPanel3 = null;
        ivjJLabel4 = null;
    }

    public PutTestMessage(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjJDialogContentPane = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjQueueManagerName = null;
        ivjQueueName = null;
        ivjCancel = null;
        ivjData = null;
        ivjJPanel2FlowLayout = null;
        ivjOK = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel3 = null;
        ivjJPanel3 = null;
        ivjJLabel4 = null;
    }

    public PutTestMessage(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjJDialogContentPane = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjQueueManagerName = null;
        ivjQueueName = null;
        ivjCancel = null;
        ivjData = null;
        ivjJPanel2FlowLayout = null;
        ivjOK = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel3 = null;
        ivjJPanel3 = null;
        ivjJLabel4 = null;
        initialize();
    }

    public PutTestMessage(Frame frame)
    {
        super(frame);
        ivjJDialogContentPane = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjQueueManagerName = null;
        ivjQueueName = null;
        ivjCancel = null;
        ivjData = null;
        ivjJPanel2FlowLayout = null;
        ivjOK = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel3 = null;
        ivjJPanel3 = null;
        ivjJLabel4 = null;
    }

    public PutTestMessage(Frame frame, String s)
    {
        super(frame, s);
        ivjJDialogContentPane = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjQueueManagerName = null;
        ivjQueueName = null;
        ivjCancel = null;
        ivjData = null;
        ivjJPanel2FlowLayout = null;
        ivjOK = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel3 = null;
        ivjJPanel3 = null;
        ivjJLabel4 = null;
    }

    public PutTestMessage(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjJDialogContentPane = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjQueueManagerName = null;
        ivjQueueName = null;
        ivjCancel = null;
        ivjData = null;
        ivjJPanel2FlowLayout = null;
        ivjOK = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel3 = null;
        ivjJPanel3 = null;
        ivjJLabel4 = null;
    }

    public PutTestMessage(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjJDialogContentPane = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjQueueManagerName = null;
        ivjQueueName = null;
        ivjCancel = null;
        ivjData = null;
        ivjJPanel2FlowLayout = null;
        ivjOK = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJLabel3 = null;
        ivjJPanel3 = null;
        ivjJLabel4 = null;
        initialize();
    }

    public void cancel_ActionEvents()
    {
        setDataText("");
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

    private JTextField getData()
    {
        if(ivjData == null)
            try
            {
                ivjData = new JTextField();
                ivjData.setName("Data");
                ivjData.setColumns(40);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjData;
    }

    public String getDataText()
    {
        return getData().getText();
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
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJLabel2(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 2;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getData(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 4;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel2(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.fill = 1;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 3;
                gridbagconstraints4.fill = 1;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.weighty = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel3(), gridbagconstraints4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JLabel getJLabel()
    {
        if(ivjJLabel == null)
            try
            {
                ivjJLabel = new JLabel();
                ivjJLabel.setName("JLabel");
                ivjJLabel.setText("Queue:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Queue Manager:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("Message Data:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
    }

    private JLabel getJLabel3()
    {
        if(ivjJLabel3 == null)
            try
            {
                ivjJLabel3 = new JLabel();
                ivjJLabel3.setName("JLabel3");
                ivjJLabel3.setIcon(new ImageIcon(this.getClass().getResource("/icons/letterLarge.gif")));
                ivjJLabel3.setText("The queue which will receive the test message is on the");
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
                ivjJLabel4.setText("computer.  The message will be put directly to the queue.");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel4;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setBorder(BorderFactory.createTitledBorder("Putting Message To"));
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getQueueManagerName(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getQueueName(), gridbagconstraints3);
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
                ivjJPanel2.setLayout(getJPanel2FlowLayout());
                getJPanel2().add(getOK(), getOK().getName());
                getJPanel2().add(getCancel(), getCancel().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
    }

    private FlowLayout getJPanel2FlowLayout()
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

    private JPanel getJPanel3()
    {
        if(ivjJPanel3 == null)
            try
            {
                ivjJPanel3 = new JPanel();
                ivjJPanel3.setName("JPanel3");
                ivjJPanel3.setBorder(new EtchedBorder());
                ivjJPanel3.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 1;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.insets = new Insets(7, 0, 35, 0);
                getJPanel3().add(getJLabel3(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.insets = new Insets(20, 4, 4, 4);
                getJPanel3().add(getJLabel4(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel3;
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

    private JTextField getQueueManagerName()
    {
        if(ivjQueueManagerName == null)
            try
            {
                ivjQueueManagerName = new JTextField();
                ivjQueueManagerName.setName("QueueManagerName");
                ivjQueueManagerName.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQueueManagerName;
    }

    public String getQueueManagerNameText()
    {
        return getQueueManagerName().getText();
    }

    private JTextField getQueueName()
    {
        if(ivjQueueName == null)
            try
            {
                ivjQueueName = new JTextField();
                ivjQueueName.setName("QueueName");
                ivjQueueName.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQueueName;
    }

    public String getQueueNameText()
    {
        return getQueueName().getText();
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
            setName("PutTestMessage");
            setDefaultCloseOperation(2);
            setResizable(false);
            setSize(426, 336);
            setModal(true);
            setTitle("Put Test Message");
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
            PutTestMessage puttestmessage = new PutTestMessage();
            puttestmessage.setModal(true);
            puttestmessage.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            puttestmessage.show();
            Insets insets = puttestmessage.getInsets();
            puttestmessage.setSize(puttestmessage.getWidth() + insets.left + insets.right, puttestmessage.getHeight() + insets.top + insets.bottom);
            puttestmessage.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void oK_ActionEvents()
    {
        dispose();
    }

    public void setDataText(String s)
    {
        getData().setText(s);
    }

    public void setQueueManagerNameText(String s)
    {
        getQueueManagerName().setText(s);
    }

    public void setQueueNameText(String s)
    {
        getQueueName().setText(s);
    }

    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JPanel ivjJPanel1;
    private JPanel ivjJPanel2;
    private JTextField ivjQueueManagerName;
    private JTextField ivjQueueName;
    private JButton ivjCancel;
    private JTextField ivjData;
    private FlowLayout ivjJPanel2FlowLayout;
    private JButton ivjOK;
    IvjEventHandler ivjEventHandler;
    private JLabel ivjJLabel3;
    private JPanel ivjJPanel3;
    private JLabel ivjJLabel4;




}
