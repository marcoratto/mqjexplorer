// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueStoragePane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QueueStoragePane extends JPanel
{

    public QueueStoragePane()
    {
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessageArchiving = null;
        ivjStorageClass = null;
        ivjHardenGetBackout = null;
        ivjBackoutRequeueName = null;
        ivjBackoutThreshold = null;
        ivjJPanel1 = null;
        initialize();
    }

    public QueueStoragePane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessageArchiving = null;
        ivjStorageClass = null;
        ivjHardenGetBackout = null;
        ivjBackoutRequeueName = null;
        ivjBackoutThreshold = null;
        ivjJPanel1 = null;
    }

    public QueueStoragePane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessageArchiving = null;
        ivjStorageClass = null;
        ivjHardenGetBackout = null;
        ivjBackoutRequeueName = null;
        ivjBackoutThreshold = null;
        ivjJPanel1 = null;
    }

    public QueueStoragePane(boolean flag)
    {
        super(flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMessageArchiving = null;
        ivjStorageClass = null;
        ivjHardenGetBackout = null;
        ivjBackoutRequeueName = null;
        ivjBackoutThreshold = null;
        ivjJPanel1 = null;
    }

    public String backoutRequeueNameGetValue()
    {
        return getBackoutRequeueName().getValue();
    }

    public void backoutRequeueNameInit(String as[])
    {
        getBackoutRequeueName().init(as);
    }

    public void backoutRequeueNameSetValue(String s)
    {
        getBackoutRequeueName().setValue(s);
    }

    public int backoutThresholdGetValue()
    {
        return getBackoutThreshold().getValue();
    }

    public void backoutThresholdSetValue(int i)
    {
        getBackoutThreshold().setValue(i);
    }

    private BackoutRequeueName getBackoutRequeueName()
    {
        if(ivjBackoutRequeueName == null)
            try
            {
                ivjBackoutRequeueName = new BackoutRequeueName();
                ivjBackoutRequeueName.setName("BackoutRequeueName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBackoutRequeueName;
    }

    private BackoutThreshold getBackoutThreshold()
    {
        if(ivjBackoutThreshold == null)
            try
            {
                ivjBackoutThreshold = new BackoutThreshold();
                ivjBackoutThreshold.setName("BackoutThreshold");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBackoutThreshold;
    }

    private HardenGetBackout getHardenGetBackout()
    {
        if(ivjHardenGetBackout == null)
            try
            {
                ivjHardenGetBackout = new HardenGetBackout();
                ivjHardenGetBackout.setName("HardenGetBackout");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHardenGetBackout;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Backout Requeue Name:");
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
                ivjJLabel2.setText("Backout Threshold:");
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
                ivjJLabel3.setText("Harden Get Backout:");
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
                ivjJLabel4.setText("Storage Class:");
                ivjJLabel4.setEnabled(false);
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
                ivjJLabel5.setText("Message Archiving:");
                ivjJLabel5.setEnabled(false);
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

    private JTextField getMessageArchiving()
    {
        if(ivjMessageArchiving == null)
            try
            {
                ivjMessageArchiving = new JTextField();
                ivjMessageArchiving.setName("MessageArchiving");
                ivjMessageArchiving.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageArchiving;
    }

    private JTextField getStorageClass()
    {
        if(ivjStorageClass == null)
            try
            {
                ivjStorageClass = new JTextField();
                ivjStorageClass.setName("StorageClass");
                ivjStorageClass.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStorageClass;
    }

    private void handleException(Throwable throwable)
    {
    }

    public int hardenGetBackoutGetValue()
    {
        return getHardenGetBackout().getValue();
    }

    public void hardenGetBackoutSetValue(int i)
    {
        getHardenGetBackout().setValue(i);
    }

    private void initialize()
    {
        try
        {
            setName("NewQueueStorage");
            setLayout(new GridBagLayout());
            setSize(344, 277);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJLabel1(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 1;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getJLabel2(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 2;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getJLabel3(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 3;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getJLabel4(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 4;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 3;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getStorageClass(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 4;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getMessageArchiving(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 2;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getHardenGetBackout(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 0;
            gridbagconstraints8.fill = 1;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getBackoutRequeueName(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 1;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getBackoutThreshold(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 0;
            gridbagconstraints10.gridy = 5;
            gridbagconstraints10.gridwidth = 2;
            gridbagconstraints10.fill = 1;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.weighty = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints10);
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
            QueueStoragePane queuestoragepane = new QueueStoragePane();
            jframe.setContentPane(queuestoragepane);
            jframe.setSize(queuestoragepane.getSize());
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

    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JTextField ivjMessageArchiving;
    private JTextField ivjStorageClass;
    private HardenGetBackout ivjHardenGetBackout;
    private BackoutRequeueName ivjBackoutRequeueName;
    private BackoutThreshold ivjBackoutThreshold;
    private JPanel ivjJPanel1;
}
