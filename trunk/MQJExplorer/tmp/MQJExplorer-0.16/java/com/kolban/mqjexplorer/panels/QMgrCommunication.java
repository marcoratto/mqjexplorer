// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QMgrCommunication.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QMgrCommunication extends JPanel
{

    public QMgrCommunication()
    {
        ivjChannelAutoDef = null;
        ivjChannelAutoDefEvent = null;
        ivjChannelAutoDefExit = null;
        ivjDefXmitQName = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        initialize();
    }

    public QMgrCommunication(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjChannelAutoDef = null;
        ivjChannelAutoDefEvent = null;
        ivjChannelAutoDefExit = null;
        ivjDefXmitQName = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
    }

    public QMgrCommunication(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjChannelAutoDef = null;
        ivjChannelAutoDefEvent = null;
        ivjChannelAutoDefExit = null;
        ivjDefXmitQName = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
    }

    public QMgrCommunication(boolean flag)
    {
        super(flag);
        ivjChannelAutoDef = null;
        ivjChannelAutoDefEvent = null;
        ivjChannelAutoDefExit = null;
        ivjDefXmitQName = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
    }

    public int channelAutoDefEventGetValue()
    {
        return getChannelAutoDefEvent().getValue();
    }

    public void channelAutoDefEventSetValue(int i)
    {
        getChannelAutoDefEvent().setValue(i);
    }

    public String channelAutoDefExitGetValue()
    {
        return getChannelAutoDefExit().getValue();
    }

    public void channelAutoDefExitSetValue(String s)
    {
        getChannelAutoDefExit().setValue(s);
    }

    public int channelAutoDefGetValue()
    {
        return getChannelAutoDef().getValue();
    }

    public void channelAutoDefSetValue(int i)
    {
        getChannelAutoDef().setValue(i);
    }

    public String defXmitQNameGetValue()
    {
        return getDefXmitQName().getValue();
    }

    public void defXmitQNameInit(String as[])
    {
        getDefXmitQName().init(as);
    }

    public void defXmitQNameSetValue(String s)
    {
        getDefXmitQName().setValue(s);
    }

    private ChannelAutoDef getChannelAutoDef()
    {
        if(ivjChannelAutoDef == null)
            try
            {
                ivjChannelAutoDef = new ChannelAutoDef();
                ivjChannelAutoDef.setName("ChannelAutoDef");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjChannelAutoDef;
    }

    private ChannelAutoDefEvent getChannelAutoDefEvent()
    {
        if(ivjChannelAutoDefEvent == null)
            try
            {
                ivjChannelAutoDefEvent = new ChannelAutoDefEvent();
                ivjChannelAutoDefEvent.setName("ChannelAutoDefEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjChannelAutoDefEvent;
    }

    private ChannelAutoDefExit getChannelAutoDefExit()
    {
        if(ivjChannelAutoDefExit == null)
            try
            {
                ivjChannelAutoDefExit = new ChannelAutoDefExit();
                ivjChannelAutoDefExit.setName("ChannelAutoDefExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjChannelAutoDefExit;
    }

    private DefXmitQName getDefXmitQName()
    {
        if(ivjDefXmitQName == null)
            try
            {
                ivjDefXmitQName = new DefXmitQName();
                ivjDefXmitQName.setName("DefXmitQName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDefXmitQName;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Default Transmission Queue:");
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
                ivjJLabel2.setText("Automatic Channel Definition:");
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
                ivjJLabel3.setText("Channel Auto-Definition Event:");
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
                ivjJLabel4.setText("Channel Auto-Definition Exit:");
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
                ivjJPanel1.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("QMgrCommunication");
            setLayout(new GridBagLayout());
            setSize(294, 325);
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
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 0;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getDefXmitQName(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 1;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getChannelAutoDef(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 2;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getChannelAutoDefEvent(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 3;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getChannelAutoDefExit(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 4;
            gridbagconstraints8.gridwidth = 2;
            gridbagconstraints8.fill = 1;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.weighty = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints8);
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
            QMgrCommunication qmgrcommunication = new QMgrCommunication();
            jframe.setContentPane(qmgrcommunication);
            jframe.setSize(qmgrcommunication.getSize());
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

    private ChannelAutoDef ivjChannelAutoDef;
    private ChannelAutoDefEvent ivjChannelAutoDefEvent;
    private ChannelAutoDefExit ivjChannelAutoDefExit;
    private DefXmitQName ivjDefXmitQName;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JPanel ivjJPanel1;
}
