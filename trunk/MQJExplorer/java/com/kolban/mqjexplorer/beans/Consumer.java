// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Consumer.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQQueueManager;
import com.kolban.swing.NumericTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer.beans:
//            MQConsumer

public class Consumer extends JDialog
    implements ActionListener, Runnable
{
    class IvjEventHandler
        implements ActionListener, WindowListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getClose())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getStop())
                connEtoC2();
            if(actionevent.getSource() == getStart())
                connEtoC3();
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
            if(windowevent.getSource() == Consumer.this)
                connEtoC4(windowevent);
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


    public Consumer()
    {
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
        initialize();
    }

    public Consumer(Dialog dialog)
    {
        super(dialog);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
    }

    public Consumer(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
    }

    public Consumer(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
    }

    public Consumer(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
    }

    public Consumer(Frame frame)
    {
        super(frame);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
        initialize();
    }

    public Consumer(Frame frame, MQQueueManager mqqueuemanager, String s)
    {
        super(frame);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
        qMgr = mqqueuemanager;
        qName = s;
        initialize();
    }

    public Consumer(Frame frame, String s)
    {
        super(frame, s);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
    }

    public Consumer(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
    }

    public Consumer(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjResults = null;
        ivjSettings = null;
        ivjStart = null;
        ivjStop = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjQueueName = null;
        ivjReportRate = null;
        ivjTotalMessages = null;
        ivjElpasedTime = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessagesSec = null;
        ivjEventHandler = new IvjEventHandler();
        workerThread = null;
        mqConsumer = null;
        qMgr = null;
        qName = null;
        timer = null;
        lastElpasedTime = 0L;
        lastTotalMessages = 0;
        ivjSep1 = null;
        ivjJLabel6 = null;
        ivjJPanel1FlowLayout = null;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        System.out.println("Tick");
        int i = mqConsumer.getTotalMessages();
        long l = mqConsumer.getElapsedTime();
        getTotalMessages().setText(Integer.toString(i));
        getElpasedTime().setText(Long.toString(mqConsumer.getElapsedTime() / 1000L));
        int j = (int)(l - lastElpasedTime);
        int k = i - lastTotalMessages;
        if(j > 0)
            getMessagesSec().setText(Integer.toString((k * 1000) / j));
        lastElpasedTime = l;
        lastTotalMessages = i;
    }

    public void close()
    {
        stop_ActionEvents();
        dispose();
        try
        {
            qMgr.disconnect();
        }
        catch(Exception _ex) { }
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            close();
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
            stop_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3()
    {
        try
        {
            start_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(WindowEvent windowevent)
    {
        try
        {
            close();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JButton getClose()
    {
        if(ivjClose == null)
            try
            {
                ivjClose = new JButton();
                ivjClose.setName("Close");
                ivjClose.setMnemonic('C');
                ivjClose.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClose;
    }

    private JLabel getElpasedTime()
    {
        if(ivjElpasedTime == null)
            try
            {
                ivjElpasedTime = new JLabel();
                ivjElpasedTime.setName("ElpasedTime");
                ivjElpasedTime.setText("0        ");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjElpasedTime;
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
                gridbagconstraints.gridy = 3;
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.fill = 1;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getSettings(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 20);
                getJDialogContentPane().add(getResults(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.gridwidth = 2;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                getJDialogContentPane().add(getSep1(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 1;
                gridbagconstraints4.gridy = 0;
                gridbagconstraints4.gridheight = 2;
                gridbagconstraints4.weighty = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJLabel6(), gridbagconstraints4);
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
                ivjJLabel1.setText("Queue Name:");
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
                ivjJLabel2.setText("Report Rate:");
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
                ivjJLabel3.setText("Total Messages:");
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
                ivjJLabel4.setOpaque(true);
                ivjJLabel4.setText("Elpased Time:");
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
                ivjJLabel5.setText("Messages/Second:");
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
                ivjJLabel6.setIcon(new ImageIcon(this.getClass().getResource("/icons/racecar2.jpg")));
                ivjJLabel6.setBorder(BorderFactory.createEtchedBorder());
                ivjJLabel6.setText("");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel6;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(getJPanel1FlowLayout());
                getJPanel1().add(getStart(), getStart().getName());
                getJPanel1().add(getStop(), getStop().getName());
                getJPanel1().add(getClose(), getClose().getName());
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

    private JLabel getMessagesSec()
    {
        if(ivjMessagesSec == null)
            try
            {
                ivjMessagesSec = new JLabel();
                ivjMessagesSec.setName("MessagesSec");
                ivjMessagesSec.setText("0        ");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessagesSec;
    }

    private JLabel getQueueName()
    {
        if(ivjQueueName == null)
            try
            {
                ivjQueueName = new JLabel();
                ivjQueueName.setName("QueueName");
                ivjQueueName.setText("Queue Name");
                getQueueName().setText(qName.trim());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQueueName;
    }

    private NumericTextField getReportRate()
    {
        if(ivjReportRate == null)
            try
            {
                ivjReportRate = new NumericTextField();
                ivjReportRate.setName("ReportRate");
                ivjReportRate.setText("1");
                ivjReportRate.setMinimumSize(new Dimension(55, 20));
                ivjReportRate.setColumns(5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReportRate;
    }

    private JPanel getResults()
    {
        if(ivjResults == null)
            try
            {
                ivjResults = new JPanel();
                ivjResults.setName("Results");
                ivjResults.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getResults().add(getJLabel3(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.ipadx = 20;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getResults().add(getTotalMessages(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getResults().add(getJLabel4(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.ipadx = 20;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getResults().add(getElpasedTime(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 2;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getResults().add(getJLabel5(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 2;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.ipadx = 20;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getResults().add(getMessagesSec(), gridbagconstraints5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjResults;
    }

    private JSeparator getSep1()
    {
        if(ivjSep1 == null)
            try
            {
                ivjSep1 = new JSeparator();
                ivjSep1.setName("Sep1");
                ivjSep1.setPreferredSize(new Dimension(0, 2));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSep1;
    }

    private JPanel getSettings()
    {
        if(ivjSettings == null)
            try
            {
                ivjSettings = new JPanel();
                ivjSettings.setName("Settings");
                ivjSettings.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getSettings().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getSettings().add(getJLabel2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getSettings().add(getQueueName(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getSettings().add(getReportRate(), gridbagconstraints3);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSettings;
    }

    private JButton getStart()
    {
        if(ivjStart == null)
            try
            {
                ivjStart = new JButton();
                ivjStart.setName("Start");
                ivjStart.setMnemonic('S');
                ivjStart.setText("Start");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStart;
    }

    private JButton getStop()
    {
        if(ivjStop == null)
            try
            {
                ivjStop = new JButton();
                ivjStop.setName("Stop");
                ivjStop.setMnemonic('p');
                ivjStop.setText("Stop");
                ivjStop.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStop;
    }

    private JLabel getTotalMessages()
    {
        if(ivjTotalMessages == null)
            try
            {
                ivjTotalMessages = new JLabel();
                ivjTotalMessages.setName("TotalMessages");
                ivjTotalMessages.setText("0        ");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTotalMessages;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getClose().addActionListener(ivjEventHandler);
        getStop().addActionListener(ivjEventHandler);
        getStart().addActionListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            timer = new Timer(0, this);
            getRootPane().setDefaultButton(getStart());
            setName("Consumer");
            setDefaultCloseOperation(0);
            setTitle("Consume messages");
            setSize(479, 204);
            setModal(false);
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
            Consumer consumer = new Consumer();
            consumer.setModal(true);
            consumer.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            consumer.show();
            Insets insets = consumer.getInsets();
            consumer.setSize(consumer.getWidth() + insets.left + insets.right, consumer.getHeight() + insets.top + insets.bottom);
            consumer.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void run()
    {
    }

    public void start_ActionEvents()
    {
        int i = Integer.parseInt(getReportRate().getText());
        if(i == 0)
        {
            return;
        } else
        {
            getStop().setEnabled(true);
            getStart().setEnabled(false);
            getReportRate().setEnabled(false);
            getTotalMessages().setText("0");
            getElpasedTime().setText("0");
            getMessagesSec().setText("0");
            mqConsumer = new MQConsumer();
            mqConsumer.setQMgr(qMgr);
            mqConsumer.setQName(qName);
            mqConsumer.setStop(false);
            workerThread = new Thread(mqConsumer);
            timer.setRepeats(true);
            timer.setDelay(i * 1000);
            timer.setInitialDelay(i * 1000);
            lastElpasedTime = 0L;
            lastTotalMessages = 0;
            timer.start();
            workerThread.start();
            return;
        }
    }

    public void stop_ActionEvents()
    {
        getStop().setEnabled(false);
        getStart().setEnabled(true);
        getReportRate().setEnabled(true);
        if(mqConsumer != null)
            mqConsumer.setStop(true);
        timer.stop();
        try
        {
            if(workerThread != null)
                workerThread.join();
        }
        catch(Exception _ex) { }
    }

    private JButton ivjClose;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private JPanel ivjResults;
    private JPanel ivjSettings;
    private JButton ivjStart;
    private JButton ivjStop;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjQueueName;
    private NumericTextField ivjReportRate;
    private JLabel ivjTotalMessages;
    private JLabel ivjElpasedTime;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjMessagesSec;
    IvjEventHandler ivjEventHandler;
    private Thread workerThread;
    private MQConsumer mqConsumer;
    private MQQueueManager qMgr;
    private String qName;
    private Timer timer;
    private long lastElpasedTime;
    private int lastTotalMessages;
    private JSeparator ivjSep1;
    private JLabel ivjJLabel6;
    private FlowLayout ivjJPanel1FlowLayout;







}
