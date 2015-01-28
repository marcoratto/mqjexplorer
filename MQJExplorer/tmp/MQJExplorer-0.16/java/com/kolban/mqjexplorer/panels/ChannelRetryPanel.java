// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelRetryPanel.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ChannelRetryPanel extends JPanel
{

    public ChannelRetryPanel()
    {
        ivjLongRetryCount = null;
        ivjLongRetryInterval = null;
        ivjShortRetryCount = null;
        ivjShortRetryInterval = null;
        ivjJPanel1 = null;
        ivjLongRetryCountLabel = null;
        ivjLongRetryIntervalLabel = null;
        ivjShortRetryCountLabel = null;
        ivjShortRetryIntervalLabel = null;
        ivjMsgRetryCount = null;
        ivjMsgRetryExit = null;
        ivjMsgRetryInterval = null;
        ivjMsgRetryUserData = null;
        ivjMsgRetryCountLabel = null;
        ivjMsgRetryExitLabel = null;
        ivjMsgRetryIntervalLabel = null;
        ivjMsgRetryUserDataLabel = null;
        initialize();
    }

    public ChannelRetryPanel(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjLongRetryCount = null;
        ivjLongRetryInterval = null;
        ivjShortRetryCount = null;
        ivjShortRetryInterval = null;
        ivjJPanel1 = null;
        ivjLongRetryCountLabel = null;
        ivjLongRetryIntervalLabel = null;
        ivjShortRetryCountLabel = null;
        ivjShortRetryIntervalLabel = null;
        ivjMsgRetryCount = null;
        ivjMsgRetryExit = null;
        ivjMsgRetryInterval = null;
        ivjMsgRetryUserData = null;
        ivjMsgRetryCountLabel = null;
        ivjMsgRetryExitLabel = null;
        ivjMsgRetryIntervalLabel = null;
        ivjMsgRetryUserDataLabel = null;
    }

    public ChannelRetryPanel(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjLongRetryCount = null;
        ivjLongRetryInterval = null;
        ivjShortRetryCount = null;
        ivjShortRetryInterval = null;
        ivjJPanel1 = null;
        ivjLongRetryCountLabel = null;
        ivjLongRetryIntervalLabel = null;
        ivjShortRetryCountLabel = null;
        ivjShortRetryIntervalLabel = null;
        ivjMsgRetryCount = null;
        ivjMsgRetryExit = null;
        ivjMsgRetryInterval = null;
        ivjMsgRetryUserData = null;
        ivjMsgRetryCountLabel = null;
        ivjMsgRetryExitLabel = null;
        ivjMsgRetryIntervalLabel = null;
        ivjMsgRetryUserDataLabel = null;
    }

    public ChannelRetryPanel(boolean flag)
    {
        super(flag);
        ivjLongRetryCount = null;
        ivjLongRetryInterval = null;
        ivjShortRetryCount = null;
        ivjShortRetryInterval = null;
        ivjJPanel1 = null;
        ivjLongRetryCountLabel = null;
        ivjLongRetryIntervalLabel = null;
        ivjShortRetryCountLabel = null;
        ivjShortRetryIntervalLabel = null;
        ivjMsgRetryCount = null;
        ivjMsgRetryExit = null;
        ivjMsgRetryInterval = null;
        ivjMsgRetryUserData = null;
        ivjMsgRetryCountLabel = null;
        ivjMsgRetryExitLabel = null;
        ivjMsgRetryIntervalLabel = null;
        ivjMsgRetryUserDataLabel = null;
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

    private LongRetryCount getLongRetryCount()
    {
        if(ivjLongRetryCount == null)
            try
            {
                ivjLongRetryCount = new LongRetryCount();
                ivjLongRetryCount.setName("LongRetryCount");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLongRetryCount;
    }

    private JLabel getLongRetryCountLabel()
    {
        if(ivjLongRetryCountLabel == null)
            try
            {
                ivjLongRetryCountLabel = new JLabel();
                ivjLongRetryCountLabel.setName("LongRetryCountLabel");
                ivjLongRetryCountLabel.setText("Long Retry Count:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLongRetryCountLabel;
    }

    private LongRetryInterval getLongRetryInterval()
    {
        if(ivjLongRetryInterval == null)
            try
            {
                ivjLongRetryInterval = new LongRetryInterval();
                ivjLongRetryInterval.setName("LongRetryInterval");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLongRetryInterval;
    }

    private JLabel getLongRetryIntervalLabel()
    {
        if(ivjLongRetryIntervalLabel == null)
            try
            {
                ivjLongRetryIntervalLabel = new JLabel();
                ivjLongRetryIntervalLabel.setName("LongRetryIntervalLabel");
                ivjLongRetryIntervalLabel.setText("Long Retry Interval:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLongRetryIntervalLabel;
    }

    private MsgRetryCount getMsgRetryCount()
    {
        if(ivjMsgRetryCount == null)
            try
            {
                ivjMsgRetryCount = new MsgRetryCount();
                ivjMsgRetryCount.setName("MsgRetryCount");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgRetryCount;
    }

    private JLabel getMsgRetryCountLabel()
    {
        if(ivjMsgRetryCountLabel == null)
            try
            {
                ivjMsgRetryCountLabel = new JLabel();
                ivjMsgRetryCountLabel.setName("MsgRetryCountLabel");
                ivjMsgRetryCountLabel.setText("Message Retry Count:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgRetryCountLabel;
    }

    private MsgRetryExit getMsgRetryExit()
    {
        if(ivjMsgRetryExit == null)
            try
            {
                ivjMsgRetryExit = new MsgRetryExit();
                ivjMsgRetryExit.setName("MsgRetryExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgRetryExit;
    }

    private JLabel getMsgRetryExitLabel()
    {
        if(ivjMsgRetryExitLabel == null)
            try
            {
                ivjMsgRetryExitLabel = new JLabel();
                ivjMsgRetryExitLabel.setName("MsgRetryExitLabel");
                ivjMsgRetryExitLabel.setText("Message Retry Exit Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgRetryExitLabel;
    }

    private MsgRetryInterval getMsgRetryInterval()
    {
        if(ivjMsgRetryInterval == null)
            try
            {
                ivjMsgRetryInterval = new MsgRetryInterval();
                ivjMsgRetryInterval.setName("MsgRetryInterval");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgRetryInterval;
    }

    private JLabel getMsgRetryIntervalLabel()
    {
        if(ivjMsgRetryIntervalLabel == null)
            try
            {
                ivjMsgRetryIntervalLabel = new JLabel();
                ivjMsgRetryIntervalLabel.setName("MsgRetryIntervalLabel");
                ivjMsgRetryIntervalLabel.setText("Message Retry Interval:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgRetryIntervalLabel;
    }

    private MsgRetryUserData getMsgRetryUserData()
    {
        if(ivjMsgRetryUserData == null)
            try
            {
                ivjMsgRetryUserData = new MsgRetryUserData();
                ivjMsgRetryUserData.setName("MsgRetryUserData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgRetryUserData;
    }

    private JLabel getMsgRetryUserDataLabel()
    {
        if(ivjMsgRetryUserDataLabel == null)
            try
            {
                ivjMsgRetryUserDataLabel = new JLabel();
                ivjMsgRetryUserDataLabel.setName("MsgRetryUserDataLabel");
                ivjMsgRetryUserDataLabel.setText("Message Retry Exit Data:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgRetryUserDataLabel;
    }

    private ShortRetryCount getShortRetryCount()
    {
        if(ivjShortRetryCount == null)
            try
            {
                ivjShortRetryCount = new ShortRetryCount();
                ivjShortRetryCount.setName("ShortRetryCount");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjShortRetryCount;
    }

    private JLabel getShortRetryCountLabel()
    {
        if(ivjShortRetryCountLabel == null)
            try
            {
                ivjShortRetryCountLabel = new JLabel();
                ivjShortRetryCountLabel.setName("ShortRetryCountLabel");
                ivjShortRetryCountLabel.setText("Short Retry Count:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjShortRetryCountLabel;
    }

    private ShortRetryInterval getShortRetryInterval()
    {
        if(ivjShortRetryInterval == null)
            try
            {
                ivjShortRetryInterval = new ShortRetryInterval();
                ivjShortRetryInterval.setName("ShortRetryInterval");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjShortRetryInterval;
    }

    private JLabel getShortRetryIntervalLabel()
    {
        if(ivjShortRetryIntervalLabel == null)
            try
            {
                ivjShortRetryIntervalLabel = new JLabel();
                ivjShortRetryIntervalLabel.setName("ShortRetryIntervalLabel");
                ivjShortRetryIntervalLabel.setText("Short Retry Interval:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjShortRetryIntervalLabel;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("ChannelRetryPanel");
            setLayout(new GridBagLayout());
            setSize(276, 279);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.anchor = 17;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getShortRetryCountLabel(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 1;
            gridbagconstraints1.anchor = 17;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getShortRetryIntervalLabel(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 2;
            gridbagconstraints2.anchor = 17;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getLongRetryCountLabel(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 3;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getLongRetryIntervalLabel(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 0;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getShortRetryCount(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 1;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getShortRetryInterval(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 2;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getLongRetryCount(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 3;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getLongRetryInterval(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 8;
            gridbagconstraints8.gridwidth = 2;
            gridbagconstraints8.fill = 1;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.weighty = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 0;
            gridbagconstraints9.gridy = 4;
            gridbagconstraints9.anchor = 17;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getMsgRetryCountLabel(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 0;
            gridbagconstraints10.gridy = 5;
            gridbagconstraints10.anchor = 17;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getMsgRetryIntervalLabel(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 0;
            gridbagconstraints11.gridy = 6;
            gridbagconstraints11.anchor = 17;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getMsgRetryExitLabel(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 0;
            gridbagconstraints12.gridy = 7;
            gridbagconstraints12.anchor = 17;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getMsgRetryUserDataLabel(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 1;
            gridbagconstraints13.gridy = 4;
            gridbagconstraints13.fill = 2;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getMsgRetryCount(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 5;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getMsgRetryInterval(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 1;
            gridbagconstraints15.gridy = 6;
            gridbagconstraints15.fill = 2;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getMsgRetryExit(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 1;
            gridbagconstraints16.gridy = 7;
            gridbagconstraints16.fill = 2;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getMsgRetryUserData(), gridbagconstraints16);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public int longRetryCountGetValue()
    {
        return getLongRetryCount().getValue();
    }

    public void longRetryCountSetValue(int i)
    {
        getLongRetryCount().setValue(i);
    }

    public void longRetryCountSetVisible(boolean flag)
    {
        getLongRetryCount().setVisible(flag);
        getLongRetryCountLabel().setVisible(flag);
    }

    public int longRetryIntervalGetValue()
    {
        return getLongRetryInterval().getValue();
    }

    public void longRetryIntervalSetValue(int i)
    {
        getLongRetryInterval().setValue(i);
    }

    public void longRetryIntervalSetVisible(boolean flag)
    {
        getLongRetryInterval().setVisible(flag);
        getLongRetryIntervalLabel().setVisible(flag);
    }

    public static void main(String args[])
    {
        try
        {
            JFrame jframe = new JFrame();
            ChannelRetryPanel channelretrypanel = new ChannelRetryPanel();
            jframe.setContentPane(channelretrypanel);
            jframe.setSize(channelretrypanel.getSize());
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

    public int msgRetryCountGetValue()
    {
        return getMsgRetryCount().getValue();
    }

    public void msgRetryCountSetValue(int i)
    {
        getMsgRetryCount().setValue(i);
    }

    public void msgRetryCountSetVisible(boolean flag)
    {
        getMsgRetryCount().setVisible(flag);
        getMsgRetryCountLabel().setVisible(flag);
    }

    public String msgRetryExitGetValue()
    {
        return getMsgRetryExit().getValue();
    }

    public void msgRetryExitSetValue(String s)
    {
        getMsgRetryExit().setValue(s);
    }

    public void msgRetryExitSetVisible(boolean flag)
    {
        getMsgRetryExit().setVisible(flag);
        getMsgRetryExitLabel().setVisible(flag);
    }

    public int msgRetryIntervalGetValue()
    {
        return getMsgRetryInterval().getValue();
    }

    public void msgRetryIntervalSetValue(int i)
    {
        getMsgRetryInterval().setValue(i);
    }

    public void msgRetryIntervalSetVisible(boolean flag)
    {
        getMsgRetryInterval().setVisible(flag);
        getMsgRetryIntervalLabel().setVisible(flag);
    }

    public String msgRetryUserDataGetValue()
    {
        return getMsgRetryUserData().getValue();
    }

    public void msgRetryUserDataSetValue(String s)
    {
        getMsgRetryUserData().setValue(s);
    }

    public void msgRetryUserDataSetVisible(boolean flag)
    {
        getMsgRetryUserData().setVisible(flag);
        getMsgRetryUserDataLabel().setVisible(flag);
    }

    public int shortRetryCountGetValue()
    {
        return getShortRetryCount().getValue();
    }

    public void shortRetryCountSetValue(int i)
    {
        getShortRetryCount().setValue(i);
    }

    public void shortRetryCountSetVisible(boolean flag)
    {
        getShortRetryCount().setVisible(flag);
        getShortRetryCountLabel().setVisible(flag);
    }

    public int shortRetryIntervalGetValue()
    {
        return getShortRetryInterval().getValue();
    }

    public void shortRetryIntervalSetValue(int i)
    {
        getShortRetryInterval().setValue(i);
    }

    public void shortRetryIntervalSetVisible(boolean flag)
    {
        getShortRetryInterval().setVisible(flag);
        getShortRetryIntervalLabel().setVisible(flag);
    }

    private LongRetryCount ivjLongRetryCount;
    private LongRetryInterval ivjLongRetryInterval;
    private ShortRetryCount ivjShortRetryCount;
    private ShortRetryInterval ivjShortRetryInterval;
    private JPanel ivjJPanel1;
    private JLabel ivjLongRetryCountLabel;
    private JLabel ivjLongRetryIntervalLabel;
    private JLabel ivjShortRetryCountLabel;
    private JLabel ivjShortRetryIntervalLabel;
    private MsgRetryCount ivjMsgRetryCount;
    private MsgRetryExit ivjMsgRetryExit;
    private MsgRetryInterval ivjMsgRetryInterval;
    private MsgRetryUserData ivjMsgRetryUserData;
    private JLabel ivjMsgRetryCountLabel;
    private JLabel ivjMsgRetryExitLabel;
    private JLabel ivjMsgRetryIntervalLabel;
    private JLabel ivjMsgRetryUserDataLabel;
}
