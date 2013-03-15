// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseGeneral.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class BrowseGeneral extends JPanel
{

    public BrowseGeneral()
    {
        ivjBackoutCount = null;
        ivjExpiryInterval = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjMessagePersistence = null;
        ivjMessagePriority = null;
        ivjMessageType = null;
        ivjPutDate = null;
        ivjPutTime = null;
        ivjReplyToQueue = null;
        ivjReplyToQueueManager = null;
        initialize();
    }

    public BrowseGeneral(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjBackoutCount = null;
        ivjExpiryInterval = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjMessagePersistence = null;
        ivjMessagePriority = null;
        ivjMessageType = null;
        ivjPutDate = null;
        ivjPutTime = null;
        ivjReplyToQueue = null;
        ivjReplyToQueueManager = null;
    }

    public BrowseGeneral(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjBackoutCount = null;
        ivjExpiryInterval = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjMessagePersistence = null;
        ivjMessagePriority = null;
        ivjMessageType = null;
        ivjPutDate = null;
        ivjPutTime = null;
        ivjReplyToQueue = null;
        ivjReplyToQueueManager = null;
    }

    public BrowseGeneral(boolean flag)
    {
        super(flag);
        ivjBackoutCount = null;
        ivjExpiryInterval = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel1 = null;
        ivjMessagePersistence = null;
        ivjMessagePriority = null;
        ivjMessageType = null;
        ivjPutDate = null;
        ivjPutTime = null;
        ivjReplyToQueue = null;
        ivjReplyToQueueManager = null;
    }

    private JTextField getBackoutCount()
    {
        if(ivjBackoutCount == null)
            try
            {
                ivjBackoutCount = new JTextField();
                ivjBackoutCount.setName("BackoutCount");
                ivjBackoutCount.setEnabled(true);
                ivjBackoutCount.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBackoutCount;
    }

    private JTextField getExpiryInterval()
    {
        if(ivjExpiryInterval == null)
            try
            {
                ivjExpiryInterval = new JTextField();
                ivjExpiryInterval.setName("ExpiryInterval");
                ivjExpiryInterval.setEnabled(true);
                ivjExpiryInterval.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExpiryInterval;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Message Type:");
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
                ivjJLabel2.setText("Message Priority:");
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
                ivjJLabel3.setText("Message Persistence:");
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
                ivjJLabel4.setText("Put Date:");
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
                ivjJLabel5.setText("Put Time:");
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
                ivjJLabel6.setText("Expiry Interval:");
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
                ivjJLabel7.setText("Reply-To Queue:");
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
                ivjJLabel8.setText("Reply-To Queue Manager:");
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
                ivjJLabel9.setText("Backout Count:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel9;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JTextField getMessagePersistence()
    {
        if(ivjMessagePersistence == null)
            try
            {
                ivjMessagePersistence = new JTextField();
                ivjMessagePersistence.setName("MessagePersistence");
                ivjMessagePersistence.setEnabled(true);
                ivjMessagePersistence.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessagePersistence;
    }

    private JTextField getMessagePriority()
    {
        if(ivjMessagePriority == null)
            try
            {
                ivjMessagePriority = new JTextField();
                ivjMessagePriority.setName("MessagePriority");
                ivjMessagePriority.setEnabled(true);
                ivjMessagePriority.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessagePriority;
    }

    private JTextField getMessageType()
    {
        if(ivjMessageType == null)
            try
            {
                ivjMessageType = new JTextField();
                ivjMessageType.setName("MessageType");
                ivjMessageType.setEnabled(true);
                ivjMessageType.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageType;
    }

    private JTextField getPutDate()
    {
        if(ivjPutDate == null)
            try
            {
                ivjPutDate = new JTextField();
                ivjPutDate.setName("PutDate");
                ivjPutDate.setEnabled(true);
                ivjPutDate.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutDate;
    }

    private JTextField getPutTime()
    {
        if(ivjPutTime == null)
            try
            {
                ivjPutTime = new JTextField();
                ivjPutTime.setName("PutTime");
                ivjPutTime.setEnabled(true);
                ivjPutTime.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutTime;
    }

    private JTextField getReplyToQueue()
    {
        if(ivjReplyToQueue == null)
            try
            {
                ivjReplyToQueue = new JTextField();
                ivjReplyToQueue.setName("ReplyToQueue");
                ivjReplyToQueue.setEnabled(true);
                ivjReplyToQueue.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReplyToQueue;
    }

    private JTextField getReplyToQueueManager()
    {
        if(ivjReplyToQueueManager == null)
            try
            {
                ivjReplyToQueueManager = new JTextField();
                ivjReplyToQueueManager.setName("ReplyToQueueManager");
                ivjReplyToQueueManager.setEnabled(true);
                ivjReplyToQueueManager.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReplyToQueueManager;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("BrowseGeneral");
            setLayout(new GridBagLayout());
            setSize(299, 336);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.anchor = 17;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJLabel1(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 1;
            gridbagconstraints1.anchor = 17;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getJLabel2(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 2;
            gridbagconstraints2.anchor = 17;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getJLabel3(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 3;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getJLabel4(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 4;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 5;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getJLabel6(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 6;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getJLabel7(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 0;
            gridbagconstraints7.gridy = 7;
            gridbagconstraints7.anchor = 17;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getJLabel8(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 8;
            gridbagconstraints8.anchor = 17;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getJLabel9(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 0;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getMessageType(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 1;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getMessagePriority(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 2;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getMessagePersistence(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 3;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getPutDate(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 1;
            gridbagconstraints13.gridy = 4;
            gridbagconstraints13.fill = 2;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getPutTime(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 5;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getExpiryInterval(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 1;
            gridbagconstraints15.gridy = 6;
            gridbagconstraints15.fill = 2;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getReplyToQueue(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 1;
            gridbagconstraints16.gridy = 7;
            gridbagconstraints16.fill = 2;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getReplyToQueueManager(), gridbagconstraints16);
            GridBagConstraints gridbagconstraints17 = new GridBagConstraints();
            gridbagconstraints17.gridx = 1;
            gridbagconstraints17.gridy = 8;
            gridbagconstraints17.fill = 2;
            gridbagconstraints17.weightx = 1.0D;
            gridbagconstraints17.insets = new Insets(4, 4, 4, 4);
            add(getBackoutCount(), gridbagconstraints17);
            GridBagConstraints gridbagconstraints18 = new GridBagConstraints();
            gridbagconstraints18.gridx = 0;
            gridbagconstraints18.gridy = 9;
            gridbagconstraints18.gridwidth = 2;
            gridbagconstraints18.fill = 1;
            gridbagconstraints18.weightx = 1.0D;
            gridbagconstraints18.weighty = 1.0D;
            gridbagconstraints18.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints18);
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
            JFrame jframe = new JFrame();
            BrowseGeneral browsegeneral = new BrowseGeneral();
            jframe.setContentPane(browsegeneral);
            jframe.setSize(browsegeneral.getSize());
            jframe.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            jframe.show();
            Insets insets = jframe.getInsets();
            jframe.setSize(jframe.getWidth() + insets.left + insets.right, jframe.getHeight() + insets.top + insets.bottom);
            jframe.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JPanel");
            throwable.printStackTrace(System.out);
        }
    }

    public void setFromMessage(MQMessage mqmessage)
    {
        switch(((MQMD) (mqmessage)).persistence)
        {
        case 0: // '\0'
            getMessagePersistence().setText("Non Persistent");
            break;

        case 1: // '\001'
            getMessagePersistence().setText("Persistent");
            break;
        }
        getMessagePriority().setText(Integer.toString(((MQMD) (mqmessage)).priority));
        switch(((MQMD) (mqmessage)).messageType)
        {
        case 8: // '\b'
            getMessageType().setText("Datagram");
            break;

        case 2: // '\002'
            getMessageType().setText("Reply");
            break;

        case 4: // '\004'
            getMessageType().setText("Report");
            break;

        case 1: // '\001'
            getMessageType().setText("Request");
            break;

        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        default:
            getMessageType().setText(Integer.toString(((MQMD) (mqmessage)).messageType));
            break;
        }
        getPutDate().setText((new Integer(((MQMD) (mqmessage)).putDateTime.get(2) + 1)).toString() + "/" + Integer.toString(((MQMD) (mqmessage)).putDateTime.get(5)) + "/" + Integer.toString(((MQMD) (mqmessage)).putDateTime.get(1)));
        getPutTime().setText(Integer.toString(((MQMD) (mqmessage)).putDateTime.get(10)) + ":" + Integer.toString(((MQMD) (mqmessage)).putDateTime.get(12)) + ":" + Integer.toString(((MQMD) (mqmessage)).putDateTime.get(13)) + " " + (((MQMD) (mqmessage)).putDateTime.get(9) != 0 ? "PM" : "AM"));
        if(((MQMD) (mqmessage)).expiry == -1)
            getExpiryInterval().setText("Unlimited");
        else
            getExpiryInterval().setText(Integer.toString(((MQMD) (mqmessage)).expiry));
        getReplyToQueue().setText(((MQMD) (mqmessage)).replyToQueueName);
        getReplyToQueueManager().setText(((MQMD) (mqmessage)).replyToQueueManagerName);
        getBackoutCount().setText(Integer.toString(((MQMD) (mqmessage)).backoutCount));
    }

    private JTextField ivjBackoutCount;
    private JTextField ivjExpiryInterval;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private JLabel ivjJLabel8;
    private JLabel ivjJLabel9;
    private JPanel ivjJPanel1;
    private JTextField ivjMessagePersistence;
    private JTextField ivjMessagePriority;
    private JTextField ivjMessageType;
    private JTextField ivjPutDate;
    private JTextField ivjPutTime;
    private JTextField ivjReplyToQueue;
    private JTextField ivjReplyToQueueManager;
}
