// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TopicDlg.java

package com.kolban.mqjexplorer.jms;

import com.ibm.mq.jms.MQTopic;
import com.kolban.mqjexplorer.beans.Encoding;
import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TopicDlg extends JDialog
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
            if(windowevent.getSource() == TopicDlg.this)
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


    public TopicDlg()
    {
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjCCSID = null;
        ivjDescription = null;
        ivjEncoding = null;
        ivjEventHandler = new IvjEventHandler();
        ivjExpiry = null;
        ivjPersistence = null;
        ivjPriority = null;
        ivjTargClient = null;
        returnCode = 0;
        managedObjectName = null;
        ivjJMSTopic = null;
        ivjJLabel11 = null;
        ivjMQTopic = null;
        ivjDurableCCQueue = null;
        ivjDurableQueue = null;
        initialize();
    }

    public TopicDlg(Dialog dialog)
    {
        super(dialog);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjCCSID = null;
        ivjDescription = null;
        ivjEncoding = null;
        ivjEventHandler = new IvjEventHandler();
        ivjExpiry = null;
        ivjPersistence = null;
        ivjPriority = null;
        ivjTargClient = null;
        returnCode = 0;
        managedObjectName = null;
        ivjJMSTopic = null;
        ivjJLabel11 = null;
        ivjMQTopic = null;
        ivjDurableCCQueue = null;
        ivjDurableQueue = null;
    }

    public TopicDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjCCSID = null;
        ivjDescription = null;
        ivjEncoding = null;
        ivjEventHandler = new IvjEventHandler();
        ivjExpiry = null;
        ivjPersistence = null;
        ivjPriority = null;
        ivjTargClient = null;
        returnCode = 0;
        managedObjectName = null;
        ivjJMSTopic = null;
        ivjJLabel11 = null;
        ivjMQTopic = null;
        ivjDurableCCQueue = null;
        ivjDurableQueue = null;
    }

    public TopicDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjCCSID = null;
        ivjDescription = null;
        ivjEncoding = null;
        ivjEventHandler = new IvjEventHandler();
        ivjExpiry = null;
        ivjPersistence = null;
        ivjPriority = null;
        ivjTargClient = null;
        returnCode = 0;
        managedObjectName = null;
        ivjJMSTopic = null;
        ivjJLabel11 = null;
        ivjMQTopic = null;
        ivjDurableCCQueue = null;
        ivjDurableQueue = null;
    }

    public TopicDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjCCSID = null;
        ivjDescription = null;
        ivjEncoding = null;
        ivjEventHandler = new IvjEventHandler();
        ivjExpiry = null;
        ivjPersistence = null;
        ivjPriority = null;
        ivjTargClient = null;
        returnCode = 0;
        managedObjectName = null;
        ivjJMSTopic = null;
        ivjJLabel11 = null;
        ivjMQTopic = null;
        ivjDurableCCQueue = null;
        ivjDurableQueue = null;
    }

    public TopicDlg(Frame frame)
    {
        super(frame);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjCCSID = null;
        ivjDescription = null;
        ivjEncoding = null;
        ivjEventHandler = new IvjEventHandler();
        ivjExpiry = null;
        ivjPersistence = null;
        ivjPriority = null;
        ivjTargClient = null;
        returnCode = 0;
        managedObjectName = null;
        ivjJMSTopic = null;
        ivjJLabel11 = null;
        ivjMQTopic = null;
        ivjDurableCCQueue = null;
        ivjDurableQueue = null;
    }

    public TopicDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjCCSID = null;
        ivjDescription = null;
        ivjEncoding = null;
        ivjEventHandler = new IvjEventHandler();
        ivjExpiry = null;
        ivjPersistence = null;
        ivjPriority = null;
        ivjTargClient = null;
        returnCode = 0;
        managedObjectName = null;
        ivjJMSTopic = null;
        ivjJLabel11 = null;
        ivjMQTopic = null;
        ivjDurableCCQueue = null;
        ivjDurableQueue = null;
    }

    public TopicDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjCCSID = null;
        ivjDescription = null;
        ivjEncoding = null;
        ivjEventHandler = new IvjEventHandler();
        ivjExpiry = null;
        ivjPersistence = null;
        ivjPriority = null;
        ivjTargClient = null;
        returnCode = 0;
        managedObjectName = null;
        ivjJMSTopic = null;
        ivjJLabel11 = null;
        ivjMQTopic = null;
        ivjDurableCCQueue = null;
        ivjDurableQueue = null;
    }

    public TopicDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjCCSID = null;
        ivjDescription = null;
        ivjEncoding = null;
        ivjEventHandler = new IvjEventHandler();
        ivjExpiry = null;
        ivjPersistence = null;
        ivjPriority = null;
        ivjTargClient = null;
        returnCode = 0;
        managedObjectName = null;
        ivjJMSTopic = null;
        ivjJLabel11 = null;
        ivjMQTopic = null;
        ivjDurableCCQueue = null;
        ivjDurableQueue = null;
    }

    public void cancel()
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

    private CodedCharSetId getCCSID()
    {
        if(ivjCCSID == null)
            try
            {
                ivjCCSID = new CodedCharSetId();
                ivjCCSID.setName("CCSID");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCCSID;
    }

    private JTextField getDescription()
    {
        if(ivjDescription == null)
            try
            {
                ivjDescription = new JTextField();
                ivjDescription.setName("Description");
                ivjDescription.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDescription;
    }

    private JTextField getDurableCCQueue()
    {
        if(ivjDurableCCQueue == null)
            try
            {
                ivjDurableCCQueue = new JTextField();
                ivjDurableCCQueue.setName("DurableCCQueue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDurableCCQueue;
    }

    private JTextField getDurableQueue()
    {
        if(ivjDurableQueue == null)
            try
            {
                ivjDurableQueue = new JTextField();
                ivjDurableQueue.setName("DurableQueue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDurableQueue;
    }

    private Encoding getEncoding()
    {
        if(ivjEncoding == null)
            try
            {
                ivjEncoding = new Encoding();
                ivjEncoding.setName("Encoding");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEncoding;
    }

    private JMSExpiry getExpiry()
    {
        if(ivjExpiry == null)
            try
            {
                ivjExpiry = new JMSExpiry();
                ivjExpiry.setName("Expiry");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExpiry;
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
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints2);
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
                ivjJLabel1.setText("Description:");
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
                ivjJLabel10.setText("JMS Topic:");
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
                ivjJLabel11.setText("MQ Topic:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel11;
    }

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("CCSID:");
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
                ivjJLabel3.setText("Durable Queue:");
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
                ivjJLabel4.setText("Durable CC Queue:");
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
                ivjJLabel5.setText("Expiry:");
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
                ivjJLabel6.setText("Priority:");
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
                ivjJLabel7.setText("Persistence:");
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
                ivjJLabel8.setText("Target:");
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
                ivjJLabel9.setText("Encoding:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel9;
    }

    private JTextField getJMSTopic()
    {
        if(ivjJMSTopic == null)
            try
            {
                ivjJMSTopic = new JTextField();
                ivjJMSTopic.setName("JMSTopic");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMSTopic;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 2;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 7;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 9;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel3(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 10;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel4(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 5;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel5(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 6;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel6(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 3;
                gridbagconstraints6.anchor = 17;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel7(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 0;
                gridbagconstraints7.gridy = 4;
                gridbagconstraints7.anchor = 17;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel8(), gridbagconstraints7);
                GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
                gridbagconstraints8.gridx = 0;
                gridbagconstraints8.gridy = 8;
                gridbagconstraints8.anchor = 17;
                gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel9(), gridbagconstraints8);
                GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
                gridbagconstraints9.gridx = 0;
                gridbagconstraints9.gridy = 0;
                gridbagconstraints9.anchor = 17;
                gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel10(), gridbagconstraints9);
                GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
                gridbagconstraints10.gridx = 1;
                gridbagconstraints10.gridy = 2;
                gridbagconstraints10.fill = 2;
                gridbagconstraints10.weightx = 1.0D;
                gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getDescription(), gridbagconstraints10);
                GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
                gridbagconstraints11.gridx = 1;
                gridbagconstraints11.gridy = 7;
                gridbagconstraints11.fill = 2;
                gridbagconstraints11.weightx = 1.0D;
                gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getCCSID(), gridbagconstraints11);
                GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
                gridbagconstraints12.gridx = 1;
                gridbagconstraints12.gridy = 5;
                gridbagconstraints12.fill = 2;
                gridbagconstraints12.weightx = 1.0D;
                gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getExpiry(), gridbagconstraints12);
                GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
                gridbagconstraints13.gridx = 1;
                gridbagconstraints13.gridy = 6;
                gridbagconstraints13.fill = 2;
                gridbagconstraints13.weightx = 1.0D;
                gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getPriority(), gridbagconstraints13);
                GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
                gridbagconstraints14.gridx = 1;
                gridbagconstraints14.gridy = 3;
                gridbagconstraints14.fill = 2;
                gridbagconstraints14.weightx = 1.0D;
                gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getPersistence(), gridbagconstraints14);
                GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
                gridbagconstraints15.gridx = 1;
                gridbagconstraints15.gridy = 4;
                gridbagconstraints15.fill = 2;
                gridbagconstraints15.weightx = 1.0D;
                gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getTargClient(), gridbagconstraints15);
                GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
                gridbagconstraints16.gridx = 1;
                gridbagconstraints16.gridy = 8;
                gridbagconstraints16.anchor = 17;
                gridbagconstraints16.weightx = 1.0D;
                gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getEncoding(), gridbagconstraints16);
                GridBagConstraints gridbagconstraints17 = new GridBagConstraints();
                gridbagconstraints17.gridx = 1;
                gridbagconstraints17.gridy = 9;
                gridbagconstraints17.fill = 2;
                gridbagconstraints17.weightx = 1.0D;
                gridbagconstraints17.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getDurableQueue(), gridbagconstraints17);
                GridBagConstraints gridbagconstraints18 = new GridBagConstraints();
                gridbagconstraints18.gridx = 1;
                gridbagconstraints18.gridy = 10;
                gridbagconstraints18.fill = 2;
                gridbagconstraints18.weightx = 1.0D;
                gridbagconstraints18.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getDurableCCQueue(), gridbagconstraints18);
                GridBagConstraints gridbagconstraints19 = new GridBagConstraints();
                gridbagconstraints19.gridx = 1;
                gridbagconstraints19.gridy = 0;
                gridbagconstraints19.fill = 2;
                gridbagconstraints19.weightx = 1.0D;
                gridbagconstraints19.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJMSTopic(), gridbagconstraints19);
                GridBagConstraints gridbagconstraints20 = new GridBagConstraints();
                gridbagconstraints20.gridx = 0;
                gridbagconstraints20.gridy = 1;
                gridbagconstraints20.anchor = 17;
                gridbagconstraints20.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel11(), gridbagconstraints20);
                GridBagConstraints gridbagconstraints21 = new GridBagConstraints();
                gridbagconstraints21.gridx = 1;
                gridbagconstraints21.gridy = 1;
                gridbagconstraints21.fill = 2;
                gridbagconstraints21.weightx = 1.0D;
                gridbagconstraints21.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getMQTopic(), gridbagconstraints21);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
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

    private JTextField getMQTopic()
    {
        if(ivjMQTopic == null)
            try
            {
                ivjMQTopic = new JTextField();
                ivjMQTopic.setName("MQTopic");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQTopic;
    }

    private JMSPersistence getPersistence()
    {
        if(ivjPersistence == null)
            try
            {
                ivjPersistence = new JMSPersistence();
                ivjPersistence.setName("Persistence");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPersistence;
    }

    private JMSPriority getPriority()
    {
        if(ivjPriority == null)
            try
            {
                ivjPriority = new JMSPriority();
                ivjPriority.setName("Priority");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPriority;
    }

    public int getReturnCode()
    {
        return returnCode;
    }

    private JMSTargClient getTargClient()
    {
        if(ivjTargClient == null)
            try
            {
                ivjTargClient = new JMSTargClient();
                ivjTargClient.setName("TargClient");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTargClient;
    }

    public MQTopic getTopic()
    {
        return topic;
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
            setName("TopicDlg");
            setDefaultCloseOperation(0);
            setSize(426, 424);
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
            TopicDlg topicdlg = new TopicDlg();
            topicdlg.setModal(true);
            topicdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            topicdlg.show();
            Insets insets = topicdlg.getInsets();
            topicdlg.setSize(topicdlg.getWidth() + insets.left + insets.right, topicdlg.getHeight() + insets.top + insets.bottom);
            topicdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void ok()
    {
        topic = new MQTopic();
        try
        {
            topic.setDescription(getDescription().getText());
            topic.setPersistence(getPersistence().getValue());
            topic.setTargetClient(getTargClient().getValue());
            topic.setExpiry(getExpiry().getValue());
            topic.setPriority(getPriority().getValue());
            topic.setCCSID(getCCSID().getValue());
            topic.setEncoding(getEncoding().getIntValue());
            topic.setBaseTopicName(getMQTopic().getText());
            topic.setBrokerDurSubQueue(getDurableQueue().getText());
            topic.setBrokerCCDurSubQueue(getDurableCCQueue().getText());
            managedObjectName = getJMSTopic().getText();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        dispose();
        returnCode = 1;
    }

    public void setFromTopic(MQTopic mqtopic)
    {
        getDescription().setText(mqtopic.getDescription());
        getPersistence().setValue(mqtopic.getPersistence());
        getTargClient().setValue(mqtopic.getTargetClient());
        getExpiry().setValue(mqtopic.getExpiry());
        getPriority().setValue(mqtopic.getPriority());
        getCCSID().setValue(mqtopic.getCCSID());
        getEncoding().setIntValue(mqtopic.getEncoding());
        getMQTopic().setText(mqtopic.getBaseTopicName());
        getDurableQueue().setText(mqtopic.getBrokerDurSubQueue());
        getDurableCCQueue().setText(mqtopic.getBrokerCCDurSubQueue());
    }

    public void setManagedObjectName(String s)
    {
        managedObjectName = s;
        getJMSTopic().setText(s);
        getJMSTopic().setEditable(false);
    }

    private JPanel ivjFooter;
    private FlowLayout ivjFooterFlowLayout;
    private JButton ivjJButton1;
    private JButton ivjJButton2;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel10;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private JLabel ivjJLabel8;
    private JLabel ivjJLabel9;
    private JPanel ivjJPanel1;
    private JSeparator ivjJSeparator1;
    private CodedCharSetId ivjCCSID;
    private JTextField ivjDescription;
    private Encoding ivjEncoding;
    IvjEventHandler ivjEventHandler;
    private JMSExpiry ivjExpiry;
    private JMSPersistence ivjPersistence;
    private JMSPriority ivjPriority;
    private JMSTargClient ivjTargClient;
    public static final int OK = 1;
    public static final int CANCEL = 2;
    private int returnCode;
    private String managedObjectName;
    private JTextField ivjJMSTopic;
    private MQTopic topic;
    private JLabel ivjJLabel11;
    private JTextField ivjMQTopic;
    private JTextField ivjDurableCCQueue;
    private JTextField ivjDurableQueue;





}
