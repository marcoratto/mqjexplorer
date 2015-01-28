// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueEventsPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QueueEventsPane extends JPanel
{

    public QueueEventsPane()
    {
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjQDepthMaxEvent = null;
        ivjQDepthLowEvent = null;
        ivjQServiceIntervalEvent = null;
        ivjQDepthHighEvent = null;
        ivjQDepthHighLimit = null;
        ivjQDepthLowLimit = null;
        ivjQServiceInterval = null;
        ivjJPanel1 = null;
        initialize();
    }

    public QueueEventsPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjQDepthMaxEvent = null;
        ivjQDepthLowEvent = null;
        ivjQServiceIntervalEvent = null;
        ivjQDepthHighEvent = null;
        ivjQDepthHighLimit = null;
        ivjQDepthLowLimit = null;
        ivjQServiceInterval = null;
        ivjJPanel1 = null;
    }

    public QueueEventsPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjQDepthMaxEvent = null;
        ivjQDepthLowEvent = null;
        ivjQServiceIntervalEvent = null;
        ivjQDepthHighEvent = null;
        ivjQDepthHighLimit = null;
        ivjQDepthLowLimit = null;
        ivjQServiceInterval = null;
        ivjJPanel1 = null;
    }

    public QueueEventsPane(boolean flag)
    {
        super(flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjQDepthMaxEvent = null;
        ivjQDepthLowEvent = null;
        ivjQServiceIntervalEvent = null;
        ivjQDepthHighEvent = null;
        ivjQDepthHighLimit = null;
        ivjQDepthLowLimit = null;
        ivjQServiceInterval = null;
        ivjJPanel1 = null;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Maximum Depth Event:");
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
                ivjJLabel2.setText("High Depth Event:");
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
                ivjJLabel3.setText("High Depth Limit:");
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
                ivjJLabel4.setText("Low Depth Event:");
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
                ivjJLabel5.setText("Low Depth Limit:");
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
                ivjJLabel6.setText("Service Interval Event:");
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
                ivjJLabel7.setText("Service Interval:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel7;
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

    private QDepthHighEvent getQDepthHighEvent()
    {
        if(ivjQDepthHighEvent == null)
            try
            {
                ivjQDepthHighEvent = new QDepthHighEvent();
                ivjQDepthHighEvent.setName("QDepthHighEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQDepthHighEvent;
    }

    private QDepthHighLimit getQDepthHighLimit()
    {
        if(ivjQDepthHighLimit == null)
            try
            {
                ivjQDepthHighLimit = new QDepthHighLimit();
                ivjQDepthHighLimit.setName("QDepthHighLimit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQDepthHighLimit;
    }

    private QDepthLowEvent getQDepthLowEvent()
    {
        if(ivjQDepthLowEvent == null)
            try
            {
                ivjQDepthLowEvent = new QDepthLowEvent();
                ivjQDepthLowEvent.setName("QDepthLowEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQDepthLowEvent;
    }

    private QDepthLowLimit getQDepthLowLimit()
    {
        if(ivjQDepthLowLimit == null)
            try
            {
                ivjQDepthLowLimit = new QDepthLowLimit();
                ivjQDepthLowLimit.setName("QDepthLowLimit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQDepthLowLimit;
    }

    private QDepthMaxEvent getQDepthMaxEvent()
    {
        if(ivjQDepthMaxEvent == null)
            try
            {
                ivjQDepthMaxEvent = new QDepthMaxEvent();
                ivjQDepthMaxEvent.setName("QDepthMaxEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQDepthMaxEvent;
    }

    private QServiceInterval getQServiceInterval()
    {
        if(ivjQServiceInterval == null)
            try
            {
                ivjQServiceInterval = new QServiceInterval();
                ivjQServiceInterval.setName("QServiceInterval");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQServiceInterval;
    }

    private QServiceIntervalEvent getQServiceIntervalEvent()
    {
        if(ivjQServiceIntervalEvent == null)
            try
            {
                ivjQServiceIntervalEvent = new QServiceIntervalEvent();
                ivjQServiceIntervalEvent.setName("QServiceIntervalEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQServiceIntervalEvent;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("NewQueueEvents");
            setLayout(new GridBagLayout());
            setSize(231, 306);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 1;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.fill = 2;
            gridbagconstraints.weightx = 1.0D;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getQDepthMaxEvent(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 0;
            gridbagconstraints1.anchor = 17;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getJLabel1(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 1;
            gridbagconstraints2.gridy = 1;
            gridbagconstraints2.fill = 2;
            gridbagconstraints2.weightx = 1.0D;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getQDepthHighEvent(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 1;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getJLabel2(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 2;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getQDepthHighLimit(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 2;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getJLabel3(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 3;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getQDepthLowEvent(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 0;
            gridbagconstraints7.gridy = 3;
            gridbagconstraints7.anchor = 17;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getJLabel4(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 4;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getQDepthLowLimit(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 0;
            gridbagconstraints9.gridy = 4;
            gridbagconstraints9.anchor = 17;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 5;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getQServiceIntervalEvent(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 0;
            gridbagconstraints11.gridy = 5;
            gridbagconstraints11.anchor = 17;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getJLabel6(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 6;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getQServiceInterval(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 0;
            gridbagconstraints13.gridy = 6;
            gridbagconstraints13.anchor = 17;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getJLabel7(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 0;
            gridbagconstraints14.gridy = 7;
            gridbagconstraints14.gridwidth = 2;
            gridbagconstraints14.fill = 1;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.weighty = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints14);
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
            QueueEventsPane queueeventspane = new QueueEventsPane();
            jframe.setContentPane(queueeventspane);
            jframe.setSize(queueeventspane.getSize());
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

    public int QDepthHighEventGetValue()
    {
        return getQDepthHighEvent().getValue();
    }

    public void QDepthHighEventSetValue(int i)
    {
        getQDepthHighEvent().setValue(i);
    }

    public int QDepthHighLimitGetValue()
    {
        return getQDepthHighLimit().getValue();
    }

    public void QDepthHighLimitSetValue(int i)
    {
        getQDepthHighLimit().setValue(i);
    }

    public int QDepthLowEventGetValue()
    {
        return getQDepthLowEvent().getValue();
    }

    public void QDepthLowEventSetValue(int i)
    {
        getQDepthLowEvent().setValue(i);
    }

    public int QDepthLowLimitGetValue()
    {
        return getQDepthLowLimit().getValue();
    }

    public void QDepthLowLimitSetValue(int i)
    {
        getQDepthLowLimit().setValue(i);
    }

    public int QDepthMaxEventGetValue()
    {
        return getQDepthMaxEvent().getValue();
    }

    public void QDepthMaxEventSetValue(int i)
    {
        getQDepthMaxEvent().setValue(i);
    }

    public int QServiceIntervalEventGetValue()
    {
        return getQServiceIntervalEvent().getValue();
    }

    public void QServiceIntervalEventSetValue(int i)
    {
        getQServiceIntervalEvent().setValue(i);
    }

    public int QServiceIntervalGetValue()
    {
        return getQServiceInterval().getValue();
    }

    public void QServiceIntervalSetValue(int i)
    {
        getQServiceInterval().setValue(i);
    }

    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private QDepthMaxEvent ivjQDepthMaxEvent;
    private QDepthLowEvent ivjQDepthLowEvent;
    private QServiceIntervalEvent ivjQServiceIntervalEvent;
    private QDepthHighEvent ivjQDepthHighEvent;
    private QDepthHighLimit ivjQDepthHighLimit;
    private QDepthLowLimit ivjQDepthLowLimit;
    private QServiceInterval ivjQServiceInterval;
    private JPanel ivjJPanel1;
}
