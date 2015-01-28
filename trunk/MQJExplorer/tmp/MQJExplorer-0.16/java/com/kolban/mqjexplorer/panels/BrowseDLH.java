// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseDLH.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMessage;
import com.kolban.mq.MQDLH;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class BrowseDLH extends JPanel
{

    public BrowseDLH()
    {
        ivjDestinationQueue = null;
        ivjDestinationQueueManager = null;
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
        ivjOriginalCCSID = null;
        ivjOriginalEncoding = null;
        ivjOriginalFormat = null;
        ivjPutApplicationName = null;
        ivjPutApplicationType = null;
        ivjPutDate = null;
        ivjPutTime = null;
        ivjReason = null;
        initialize();
    }

    public BrowseDLH(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjDestinationQueue = null;
        ivjDestinationQueueManager = null;
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
        ivjOriginalCCSID = null;
        ivjOriginalEncoding = null;
        ivjOriginalFormat = null;
        ivjPutApplicationName = null;
        ivjPutApplicationType = null;
        ivjPutDate = null;
        ivjPutTime = null;
        ivjReason = null;
    }

    public BrowseDLH(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjDestinationQueue = null;
        ivjDestinationQueueManager = null;
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
        ivjOriginalCCSID = null;
        ivjOriginalEncoding = null;
        ivjOriginalFormat = null;
        ivjPutApplicationName = null;
        ivjPutApplicationType = null;
        ivjPutDate = null;
        ivjPutTime = null;
        ivjReason = null;
    }

    public BrowseDLH(boolean flag)
    {
        super(flag);
        ivjDestinationQueue = null;
        ivjDestinationQueueManager = null;
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
        ivjOriginalCCSID = null;
        ivjOriginalEncoding = null;
        ivjOriginalFormat = null;
        ivjPutApplicationName = null;
        ivjPutApplicationType = null;
        ivjPutDate = null;
        ivjPutTime = null;
        ivjReason = null;
    }

    private JTextField getDestinationQueue()
    {
        if(ivjDestinationQueue == null)
            try
            {
                ivjDestinationQueue = new JTextField();
                ivjDestinationQueue.setName("DestinationQueue");
                ivjDestinationQueue.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDestinationQueue;
    }

    private JTextField getDestinationQueueManager()
    {
        if(ivjDestinationQueueManager == null)
            try
            {
                ivjDestinationQueueManager = new JTextField();
                ivjDestinationQueueManager.setName("DestinationQueueManager");
                ivjDestinationQueueManager.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDestinationQueueManager;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Reason:");
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
                ivjJLabel10.setText("Put Time:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel10;
    }

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("Destination Queue:");
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
                ivjJLabel3.setText("Destination Queue Manager:");
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
                ivjJLabel4.setText("Original Encoding:");
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
                ivjJLabel5.setText("Original CCSID:");
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
                ivjJLabel6.setText("Original Format:");
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
                ivjJLabel7.setText("Put Application Type:");
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
                ivjJLabel8.setText("Put Application Name:");
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
                ivjJLabel9.setText("Put Date:");
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

    private JTextField getOriginalCCSID()
    {
        if(ivjOriginalCCSID == null)
            try
            {
                ivjOriginalCCSID = new JTextField();
                ivjOriginalCCSID.setName("OriginalCCSID");
                ivjOriginalCCSID.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOriginalCCSID;
    }

    private JTextField getOriginalEncoding()
    {
        if(ivjOriginalEncoding == null)
            try
            {
                ivjOriginalEncoding = new JTextField();
                ivjOriginalEncoding.setName("OriginalEncoding");
                ivjOriginalEncoding.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOriginalEncoding;
    }

    private JTextField getOriginalFormat()
    {
        if(ivjOriginalFormat == null)
            try
            {
                ivjOriginalFormat = new JTextField();
                ivjOriginalFormat.setName("OriginalFormat");
                ivjOriginalFormat.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOriginalFormat;
    }

    private JTextField getPutApplicationName()
    {
        if(ivjPutApplicationName == null)
            try
            {
                ivjPutApplicationName = new JTextField();
                ivjPutApplicationName.setName("PutApplicationName");
                ivjPutApplicationName.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutApplicationName;
    }

    private JTextField getPutApplicationType()
    {
        if(ivjPutApplicationType == null)
            try
            {
                ivjPutApplicationType = new JTextField();
                ivjPutApplicationType.setName("PutApplicationType");
                ivjPutApplicationType.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutApplicationType;
    }

    private JTextField getPutDate()
    {
        if(ivjPutDate == null)
            try
            {
                ivjPutDate = new JTextField();
                ivjPutDate.setName("PutDate");
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
                ivjPutTime.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutTime;
    }

    private JTextField getReason()
    {
        if(ivjReason == null)
            try
            {
                ivjReason = new JTextField();
                ivjReason.setName("Reason");
                ivjReason.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReason;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("BrowseDLH");
            setLayout(new GridBagLayout());
            setSize(329, 366);
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
            gridbagconstraints9.gridx = 0;
            gridbagconstraints9.gridy = 9;
            gridbagconstraints9.anchor = 17;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getJLabel10(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 0;
            gridbagconstraints10.gridy = 10;
            gridbagconstraints10.gridwidth = 2;
            gridbagconstraints10.fill = 1;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.weighty = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 0;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getReason(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 1;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getDestinationQueue(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 1;
            gridbagconstraints13.gridy = 2;
            gridbagconstraints13.fill = 2;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getDestinationQueueManager(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 3;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getOriginalEncoding(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 1;
            gridbagconstraints15.gridy = 4;
            gridbagconstraints15.fill = 2;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getOriginalCCSID(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 1;
            gridbagconstraints16.gridy = 5;
            gridbagconstraints16.fill = 2;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getOriginalFormat(), gridbagconstraints16);
            GridBagConstraints gridbagconstraints17 = new GridBagConstraints();
            gridbagconstraints17.gridx = 1;
            gridbagconstraints17.gridy = 6;
            gridbagconstraints17.fill = 2;
            gridbagconstraints17.weightx = 1.0D;
            gridbagconstraints17.insets = new Insets(4, 4, 4, 4);
            add(getPutApplicationType(), gridbagconstraints17);
            GridBagConstraints gridbagconstraints18 = new GridBagConstraints();
            gridbagconstraints18.gridx = 1;
            gridbagconstraints18.gridy = 7;
            gridbagconstraints18.fill = 2;
            gridbagconstraints18.weightx = 1.0D;
            gridbagconstraints18.insets = new Insets(4, 4, 4, 4);
            add(getPutApplicationName(), gridbagconstraints18);
            GridBagConstraints gridbagconstraints19 = new GridBagConstraints();
            gridbagconstraints19.gridx = 1;
            gridbagconstraints19.gridy = 8;
            gridbagconstraints19.fill = 2;
            gridbagconstraints19.weightx = 1.0D;
            gridbagconstraints19.insets = new Insets(4, 4, 4, 4);
            add(getPutDate(), gridbagconstraints19);
            GridBagConstraints gridbagconstraints20 = new GridBagConstraints();
            gridbagconstraints20.gridx = 1;
            gridbagconstraints20.gridy = 9;
            gridbagconstraints20.fill = 2;
            gridbagconstraints20.weightx = 1.0D;
            gridbagconstraints20.insets = new Insets(4, 4, 4, 4);
            add(getPutTime(), gridbagconstraints20);
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
            BrowseDLH browsedlh = new BrowseDLH();
            jframe.setContentPane(browsedlh);
            jframe.setSize(browsedlh.getSize());
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
        MQDLH mqdlh = new MQDLH();
        mqdlh.setFromMessage(mqmessage);
        getOriginalCCSID().setText(Integer.toString(mqdlh.codedCharSetId));
        getOriginalEncoding().setText(Integer.toString(mqdlh.encoding));
        getOriginalFormat().setText(mqdlh.format.trim());
        getPutApplicationName().setText(mqdlh.putApplName.trim());
        getPutApplicationType().setText(Integer.toString(mqdlh.putApplType));
        getPutDate().setText(mqdlh.putDate);
        getPutTime().setText(mqdlh.putTime);
        getReason().setText(Integer.toString(mqdlh.reason));
        getDestinationQueue().setText(mqdlh.destQName.trim());
        getDestinationQueueManager().setText(mqdlh.destQMgrName.trim());
    }

    private JTextField ivjDestinationQueue;
    private JTextField ivjDestinationQueueManager;
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
    private JTextField ivjOriginalCCSID;
    private JTextField ivjOriginalEncoding;
    private JTextField ivjOriginalFormat;
    private JTextField ivjPutApplicationName;
    private JTextField ivjPutApplicationType;
    private JTextField ivjPutDate;
    private JTextField ivjPutTime;
    private JTextField ivjReason;
}
