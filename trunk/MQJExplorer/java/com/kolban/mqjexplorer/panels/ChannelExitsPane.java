// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelExitsPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ChannelExitsPane extends JPanel
{

    public ChannelExitsPane()
    {
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMsgExit = null;
        ivjMsgUserData = null;
        ivjReceiveExit = null;
        ivjReceiveUserData = null;
        ivjSecurityExit = null;
        ivjSecurityUserData = null;
        ivjSendExit = null;
        ivjSendUserData = null;
        ivjJPanel1 = null;
        ivjMsgExitLabel = null;
        ivjMsgUserDataLabel = null;
        initialize();
    }

    public ChannelExitsPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMsgExit = null;
        ivjMsgUserData = null;
        ivjReceiveExit = null;
        ivjReceiveUserData = null;
        ivjSecurityExit = null;
        ivjSecurityUserData = null;
        ivjSendExit = null;
        ivjSendUserData = null;
        ivjJPanel1 = null;
        ivjMsgExitLabel = null;
        ivjMsgUserDataLabel = null;
    }

    public ChannelExitsPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMsgExit = null;
        ivjMsgUserData = null;
        ivjReceiveExit = null;
        ivjReceiveUserData = null;
        ivjSecurityExit = null;
        ivjSecurityUserData = null;
        ivjSendExit = null;
        ivjSendUserData = null;
        ivjJPanel1 = null;
        ivjMsgExitLabel = null;
        ivjMsgUserDataLabel = null;
    }

    public ChannelExitsPane(boolean flag)
    {
        super(flag);
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMsgExit = null;
        ivjMsgUserData = null;
        ivjReceiveExit = null;
        ivjReceiveUserData = null;
        ivjSecurityExit = null;
        ivjSecurityUserData = null;
        ivjSendExit = null;
        ivjSendUserData = null;
        ivjJPanel1 = null;
        ivjMsgExitLabel = null;
        ivjMsgUserDataLabel = null;
    }

    private JLabel getJLabel()
    {
        if(ivjJLabel == null)
            try
            {
                ivjJLabel = new JLabel();
                ivjJLabel.setName("JLabel");
                ivjJLabel.setText("Send Exit Data:");
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
                ivjJLabel1.setText("Send Exit Name:");
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
                ivjJLabel2.setText("Receive Exit Name:");
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
                ivjJLabel3.setText("Receive Exit Data:");
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
                ivjJLabel4.setText("Security Exit Name:");
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
                ivjJLabel5.setText("Security Exit Data:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel5;
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

    private MsgExit getMsgExit()
    {
        if(ivjMsgExit == null)
            try
            {
                ivjMsgExit = new MsgExit();
                ivjMsgExit.setName("MsgExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgExit;
    }

    private JLabel getMsgExitLabel()
    {
        if(ivjMsgExitLabel == null)
            try
            {
                ivjMsgExitLabel = new JLabel();
                ivjMsgExitLabel.setName("MsgExitLabel");
                ivjMsgExitLabel.setText("Message Exit Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgExitLabel;
    }

    private MsgUserData getMsgUserData()
    {
        if(ivjMsgUserData == null)
            try
            {
                ivjMsgUserData = new MsgUserData();
                ivjMsgUserData.setName("MsgUserData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgUserData;
    }

    private JLabel getMsgUserDataLabel()
    {
        if(ivjMsgUserDataLabel == null)
            try
            {
                ivjMsgUserDataLabel = new JLabel();
                ivjMsgUserDataLabel.setName("MsgUserDataLabel");
                ivjMsgUserDataLabel.setText("Message Exit Data:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgUserDataLabel;
    }

    private ReceiveExit getReceiveExit()
    {
        if(ivjReceiveExit == null)
            try
            {
                ivjReceiveExit = new ReceiveExit();
                ivjReceiveExit.setName("ReceiveExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReceiveExit;
    }

    private ReceiveUserData getReceiveUserData()
    {
        if(ivjReceiveUserData == null)
            try
            {
                ivjReceiveUserData = new ReceiveUserData();
                ivjReceiveUserData.setName("ReceiveUserData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReceiveUserData;
    }

    private SecurityExit getSecurityExit()
    {
        if(ivjSecurityExit == null)
            try
            {
                ivjSecurityExit = new SecurityExit();
                ivjSecurityExit.setName("SecurityExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSecurityExit;
    }

    private SecurityUserData getSecurityUserData()
    {
        if(ivjSecurityUserData == null)
            try
            {
                ivjSecurityUserData = new SecurityUserData();
                ivjSecurityUserData.setName("SecurityUserData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSecurityUserData;
    }

    private SendExit getSendExit()
    {
        if(ivjSendExit == null)
            try
            {
                ivjSendExit = new SendExit();
                ivjSendExit.setName("SendExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSendExit;
    }

    private SendUserData getSendUserData()
    {
        if(ivjSendUserData == null)
            try
            {
                ivjSendUserData = new SendUserData();
                ivjSendUserData.setName("SendUserData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSendUserData;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("ChannelExitsPane");
            setLayout(new GridBagLayout());
            setSize(286, 311);
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
            add(getJLabel(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 2;
            gridbagconstraints2.anchor = 17;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getJLabel2(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 3;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getJLabel3(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 4;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJLabel4(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 5;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 6;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getMsgExitLabel(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 0;
            gridbagconstraints7.gridy = 7;
            gridbagconstraints7.anchor = 17;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getMsgUserDataLabel(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 0;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getSendExit(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 1;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getSendUserData(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 2;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getReceiveExit(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 3;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getReceiveUserData(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 4;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getSecurityExit(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 1;
            gridbagconstraints13.gridy = 5;
            gridbagconstraints13.fill = 2;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getSecurityUserData(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 6;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getMsgExit(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 1;
            gridbagconstraints15.gridy = 7;
            gridbagconstraints15.fill = 2;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getMsgUserData(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 0;
            gridbagconstraints16.gridy = 8;
            gridbagconstraints16.gridwidth = 2;
            gridbagconstraints16.fill = 1;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.weighty = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints16);
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
            ChannelExitsPane channelexitspane = new ChannelExitsPane();
            jframe.setContentPane(channelexitspane);
            jframe.setSize(channelexitspane.getSize());
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

    public String msgExitGetValue()
    {
        return getMsgExit().getValue();
    }

    public void msgExitSetValue(String s)
    {
        getMsgExit().setValue(s);
    }

    public void msgExitSetVisible(boolean flag)
    {
        getMsgExit().setVisible(flag);
        getMsgExitLabel().setVisible(flag);
    }

    public String msgUserDataGetValue()
    {
        return getMsgUserData().getValue();
    }

    public void msgUserDataSetValue(String s)
    {
        getMsgUserData().setValue(s);
    }

    public void msgUserDataSetVisible(boolean flag)
    {
        getMsgUserData().setVisible(flag);
        getMsgUserDataLabel().setVisible(flag);
    }

    public String receiveExitGetValue()
    {
        return getReceiveExit().getValue();
    }

    public void receiveExitSetValue(String s)
    {
        getReceiveExit().setValue(s);
    }

    public String receiveUserDataGetValue()
    {
        return getReceiveUserData().getValue();
    }

    public void receiveUserDataSetValue(String s)
    {
        getReceiveUserData().setValue(s);
    }

    public String securityExitGetValue()
    {
        return getSecurityExit().getValue();
    }

    public void securityExitSetValue(String s)
    {
        getSecurityExit().setValue(s);
    }

    public String securityUserDataGetValue()
    {
        return getSecurityUserData().getValue();
    }

    public void securityUserDataSetValue(String s)
    {
        getSecurityUserData().setValue(s);
    }

    public String sendExitGetValue()
    {
        return getSendExit().getValue();
    }

    public void sendExitSetValue(String s)
    {
        getSendExit().setValue(s);
    }

    public String sendUserDataGetValue()
    {
        return getSendUserData().getValue();
    }

    public void sendUserDataSetValue(String s)
    {
        getSendUserData().setValue(s);
    }

    private JLabel ivjJLabel;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private MsgExit ivjMsgExit;
    private MsgUserData ivjMsgUserData;
    private ReceiveExit ivjReceiveExit;
    private ReceiveUserData ivjReceiveUserData;
    private SecurityExit ivjSecurityExit;
    private SecurityUserData ivjSecurityUserData;
    private SendExit ivjSendExit;
    private SendUserData ivjSendUserData;
    private JPanel ivjJPanel1;
    private JLabel ivjMsgExitLabel;
    private JLabel ivjMsgUserDataLabel;
}
