// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DepleteQ.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.*;
import com.kolban.mqjexplorer.MQJExplorer;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;
import javax.swing.*;

public class DepleteQ extends JDialog
    implements ActionListener, Runnable
{
    class IvjEventHandler
        implements FooterListener
    {

        public void cancel(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC1(eventobject);
        }

        public void ok(EventObject eventobject)
        {
        }

        IvjEventHandler()
        {
        }
    }


    public DepleteQ()
    {
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjProgressBar = null;
        qMgr = null;
        queueName = null;
        finished = false;
        progressTimer = null;
        totalMessages = 0;
        depletedMessages = 0;
        ivjEventHandler = new IvjEventHandler();
        initialize();
    }

    public DepleteQ(Dialog dialog)
    {
        super(dialog);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjProgressBar = null;
        qMgr = null;
        queueName = null;
        finished = false;
        progressTimer = null;
        totalMessages = 0;
        depletedMessages = 0;
        ivjEventHandler = new IvjEventHandler();
    }

    public DepleteQ(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjProgressBar = null;
        qMgr = null;
        queueName = null;
        finished = false;
        progressTimer = null;
        totalMessages = 0;
        depletedMessages = 0;
        ivjEventHandler = new IvjEventHandler();
    }

    public DepleteQ(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjProgressBar = null;
        qMgr = null;
        queueName = null;
        finished = false;
        progressTimer = null;
        totalMessages = 0;
        depletedMessages = 0;
        ivjEventHandler = new IvjEventHandler();
    }

    public DepleteQ(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjProgressBar = null;
        qMgr = null;
        queueName = null;
        finished = false;
        progressTimer = null;
        totalMessages = 0;
        depletedMessages = 0;
        ivjEventHandler = new IvjEventHandler();
    }

    public DepleteQ(Frame frame)
    {
        super(frame);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjProgressBar = null;
        qMgr = null;
        queueName = null;
        finished = false;
        progressTimer = null;
        totalMessages = 0;
        depletedMessages = 0;
        ivjEventHandler = new IvjEventHandler();
    }

    public DepleteQ(Frame frame, String s)
    {
        super(frame, s);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjProgressBar = null;
        qMgr = null;
        queueName = null;
        finished = false;
        progressTimer = null;
        totalMessages = 0;
        depletedMessages = 0;
        ivjEventHandler = new IvjEventHandler();
    }

    public DepleteQ(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjProgressBar = null;
        qMgr = null;
        queueName = null;
        finished = false;
        progressTimer = null;
        totalMessages = 0;
        depletedMessages = 0;
        ivjEventHandler = new IvjEventHandler();
    }

    public DepleteQ(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjProgressBar = null;
        qMgr = null;
        queueName = null;
        finished = false;
        progressTimer = null;
        totalMessages = 0;
        depletedMessages = 0;
        ivjEventHandler = new IvjEventHandler();
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        if(finished)
        {
            progressTimer.stop();
            dispose();
            return;
        } else
        {
            JProgressBar jprogressbar = getProgressBar();
            jprogressbar.setMaximum(totalMessages);
            jprogressbar.setValue(depletedMessages);
            return;
        }
    }

    private void connEtoC1(EventObject eventobject)
    {
        try
        {
            footer_Cancel();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public void execute()
    {
        if(queueName == null || qMgr == null)
        {
            return;
        } else
        {
            Thread thread = new Thread(this);
            finished = false;
            progressTimer = new Timer(1000, this);
            progressTimer.setDelay(1000);
            progressTimer.setRepeats(true);
            thread.start();
            progressTimer.start();
            pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, this);
            setVisible(true);
            return;
        }
    }

    public void footer_Cancel()
    {
        finished = true;
    }

    private Footer getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new Footer();
                ivjFooter.setName("Footer");
                ivjFooter.setOKEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
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
                gridbagconstraints.gridx = 1;
                gridbagconstraints.gridy = 2;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
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
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getProgressBar(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JProgressBar getProgressBar()
    {
        if(ivjProgressBar == null)
            try
            {
                ivjProgressBar = new JProgressBar();
                ivjProgressBar.setName("ProgressBar");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjProgressBar;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getFooter().addFooterListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("DepleteQ");
            setDefaultCloseOperation(2);
            setTitle("Deplete Queue");
            setSize(334, 111);
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
            DepleteQ depleteq = new DepleteQ();
            depleteq.setModal(true);
            depleteq.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            depleteq.show();
            Insets insets = depleteq.getInsets();
            depleteq.setSize(depleteq.getWidth() + insets.left + insets.right, depleteq.getHeight() + insets.top + insets.bottom);
            depleteq.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void run()
    {
        Object obj = null;
        try
        {
            MQMessage mqmessage = new MQMessage();
            MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
            mqgetmessageoptions.matchOptions = 0;
            mqgetmessageoptions.options = 64;
            MQQueue mqqueue = qMgr.accessQueue(queueName, 33);
            boolean flag = false;
            totalMessages = mqqueue.getCurrentDepth();
            depletedMessages = 0;
            while((!flag) & (!finished)) 
                try
                {
                    mqqueue.get(mqmessage, mqgetmessageoptions, 1);
                    depletedMessages++;
                }
                catch(MQException mqexception1)
                {
                    switch(mqexception1.reasonCode)
                    {
                    case 2033: 
                        flag = true;
                        break;

                    default:
                        throw mqexception1;

                    case 2079: 
                        break;
                    }
                }
            mqqueue.close();
            qMgr.close();
        }
        catch(MQException mqexception)
        {
            QueueManagerModel.displayError(mqexception);
        }
        finished = true;
    }

    public void setQueueManager(MQQueueManager mqqueuemanager)
    {
        qMgr = mqqueuemanager;
    }

    public void setQueueName(String s)
    {
        queueName = s;
    }

    private Footer ivjFooter;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private JProgressBar ivjProgressBar;
    private MQQueueManager qMgr;
    private String queueName;
    private boolean finished;
    private Timer progressTimer;
    private int totalMessages;
    private int depletedMessages;
    IvjEventHandler ivjEventHandler;


}
