// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CopyQDlg.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFMessageAgent;
import com.kolban.mq.PCFUtils;
import com.kolban.mqjexplorer.QueueManagerModel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CopyQDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJButton1())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getJButton2())
                connEtoC2(actionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public CopyQDlg()
    {
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel2 = null;
        ivjTemplateQueueName = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjNewQueueNameText = null;
        newQueueName = "";
        initialize();
    }

    public CopyQDlg(Dialog dialog)
    {
        super(dialog);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel2 = null;
        ivjTemplateQueueName = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjNewQueueNameText = null;
        newQueueName = "";
    }

    public CopyQDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel2 = null;
        ivjTemplateQueueName = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjNewQueueNameText = null;
        newQueueName = "";
    }

    public CopyQDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel2 = null;
        ivjTemplateQueueName = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjNewQueueNameText = null;
        newQueueName = "";
    }

    public CopyQDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel2 = null;
        ivjTemplateQueueName = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjNewQueueNameText = null;
        newQueueName = "";
    }

    public CopyQDlg(Frame frame)
    {
        super(frame);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel2 = null;
        ivjTemplateQueueName = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjNewQueueNameText = null;
        newQueueName = "";
        initialize();
    }

    public CopyQDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel2 = null;
        ivjTemplateQueueName = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjNewQueueNameText = null;
        newQueueName = "";
    }

    public CopyQDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel2 = null;
        ivjTemplateQueueName = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjNewQueueNameText = null;
        newQueueName = "";
    }

    public CopyQDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel2 = null;
        ivjTemplateQueueName = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjNewQueueNameText = null;
        newQueueName = "";
    }

    public void cancel()
    {
        result = 2;
        dispose();
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
            copy();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public void copy()
    {
        newQueueName = getNewQueueNameText().getText();
        try
        {
            PCFUtils.copyQueue(agent, templateQueueName, newQueueName, templateQueueType);
            result = 1;
            dispose();
        }
        catch(MQException mqexception)
        {
            QueueManagerModel.displayError(mqexception);
        }
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
                ivjJButton2.setText("Copy");
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
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel2(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 2;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints2);
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
                ivjJLabel1.setText("New queue name:");
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
                ivjJLabel2.setText("Template queue Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
    }

    private JPanel getJPanel2()
    {
        if(ivjJPanel2 == null)
            try
            {
                ivjJPanel2 = new JPanel();
                ivjJPanel2.setName("JPanel2");
                ivjJPanel2.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getNewQueueNameText(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getJLabel2(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getTemplateQueueName(), gridbagconstraints3);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
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

    public String getNewQueueName()
    {
        return newQueueName;
    }

    private JTextField getNewQueueNameText()
    {
        if(ivjNewQueueNameText == null)
            try
            {
                ivjNewQueueNameText = new JTextField();
                ivjNewQueueNameText.setName("NewQueueNameText");
                ivjNewQueueNameText.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNewQueueNameText;
    }

    public int getResult()
    {
        return result;
    }

    private JLabel getTemplateQueueName()
    {
        if(ivjTemplateQueueName == null)
            try
            {
                ivjTemplateQueueName = new JLabel();
                ivjTemplateQueueName.setName("TemplateQueueName");
                ivjTemplateQueueName.setText("JLabel3");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTemplateQueueName;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getJButton1().addActionListener(ivjEventHandler);
        getJButton2().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            result = 2;
            setName("CopyQDlg");
            setDefaultCloseOperation(2);
            setSize(426, 142);
            setModal(true);
            setTitle("Copy queue ...");
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
            CopyQDlg copyqdlg = new CopyQDlg();
            copyqdlg.setModal(true);
            copyqdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            copyqdlg.show();
            Insets insets = copyqdlg.getInsets();
            copyqdlg.setSize(copyqdlg.getWidth() + insets.left + insets.right, copyqdlg.getHeight() + insets.top + insets.bottom);
            copyqdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    void newMethod()
    {
    }

    public void setQueueManager(QueueManagerModel queuemanagermodel)
    {
        try
        {
            agent = queuemanagermodel.getAgent();
        }
        catch(Exception _ex)
        {
            agent = null;
        }
    }

    public void setTemplateQueueName(String s)
    {
        templateQueueName = s;
        getTemplateQueueName().setText(templateQueueName);
    }

    public void setTemplateQueueType(int i)
    {
        templateQueueType = i;
    }

    private JPanel ivjFooter;
    private FlowLayout ivjFooterFlowLayout;
    private JButton ivjJButton1;
    private JButton ivjJButton2;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JPanel ivjJPanel2;
    private JLabel ivjTemplateQueueName;
    private String templateQueueName;
    private JSeparator ivjJSeparator1;
    private int templateQueueType;
    IvjEventHandler ivjEventHandler;
    private PCFMessageAgent agent;
    public static final int COPIED = 1;
    public static final int CANCELED = 2;
    private int result;
    private JTextField ivjNewQueueNameText;
    private String newQueueName;




}
