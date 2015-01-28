// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueTriggeringPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QueueTriggeringPane extends JPanel
{

    public QueueTriggeringPane()
    {
        ivjJLabel10 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel9 = null;
        ivjProcessName = null;
        ivjTriggerControl = null;
        ivjTriggerType = null;
        ivjTriggerDepth = null;
        ivjTriggerMsgPriority = null;
        ivjInitiationQueueName = null;
        ivjfiller = null;
        ivjTriggerData = null;
        initialize();
    }

    public QueueTriggeringPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel10 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel9 = null;
        ivjProcessName = null;
        ivjTriggerControl = null;
        ivjTriggerType = null;
        ivjTriggerDepth = null;
        ivjTriggerMsgPriority = null;
        ivjInitiationQueueName = null;
        ivjfiller = null;
        ivjTriggerData = null;
    }

    public QueueTriggeringPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel10 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel9 = null;
        ivjProcessName = null;
        ivjTriggerControl = null;
        ivjTriggerType = null;
        ivjTriggerDepth = null;
        ivjTriggerMsgPriority = null;
        ivjInitiationQueueName = null;
        ivjfiller = null;
        ivjTriggerData = null;
    }

    public QueueTriggeringPane(boolean flag)
    {
        super(flag);
        ivjJLabel10 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel9 = null;
        ivjProcessName = null;
        ivjTriggerControl = null;
        ivjTriggerType = null;
        ivjTriggerDepth = null;
        ivjTriggerMsgPriority = null;
        ivjInitiationQueueName = null;
        ivjfiller = null;
        ivjTriggerData = null;
    }

    private JPanel getfiller()
    {
        if(ivjfiller == null)
            try
            {
                ivjfiller = new JPanel();
                ivjfiller.setName("filler");
                ivjfiller.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjfiller;
    }

    private InitiationQueueName getInitiationQueueName()
    {
        if(ivjInitiationQueueName == null)
            try
            {
                ivjInitiationQueueName = new InitiationQueueName();
                ivjInitiationQueueName.setName("InitiationQueueName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInitiationQueueName;
    }

    private JLabel getJLabel10()
    {
        if(ivjJLabel10 == null)
            try
            {
                ivjJLabel10 = new JLabel();
                ivjJLabel10.setName("JLabel10");
                ivjJLabel10.setText("Trigger Control:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel10;
    }

    private JLabel getJLabel3()
    {
        if(ivjJLabel3 == null)
            try
            {
                ivjJLabel3 = new JLabel();
                ivjJLabel3.setName("JLabel3");
                ivjJLabel3.setText("Trigger Depth:");
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
                ivjJLabel4.setText("Trigger Message Priority:");
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
                ivjJLabel5.setText("Trigger Data:");
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
                ivjJLabel6.setText("Initiation Queue Name:");
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
                ivjJLabel7.setText("Process Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel7;
    }

    private JLabel getJLabel9()
    {
        if(ivjJLabel9 == null)
            try
            {
                ivjJLabel9 = new JLabel();
                ivjJLabel9.setName("JLabel9");
                ivjJLabel9.setText("Trigger Type:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel9;
    }

    private ProcessName2 getProcessName()
    {
        if(ivjProcessName == null)
            try
            {
                ivjProcessName = new ProcessName2();
                ivjProcessName.setName("ProcessName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjProcessName;
    }

    private TriggerControl getTriggerControl()
    {
        if(ivjTriggerControl == null)
            try
            {
                ivjTriggerControl = new TriggerControl();
                ivjTriggerControl.setName("TriggerControl");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTriggerControl;
    }

    private TriggerData getTriggerData()
    {
        if(ivjTriggerData == null)
            try
            {
                ivjTriggerData = new TriggerData();
                ivjTriggerData.setName("TriggerData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTriggerData;
    }

    private TriggerDepth getTriggerDepth()
    {
        if(ivjTriggerDepth == null)
            try
            {
                ivjTriggerDepth = new TriggerDepth();
                ivjTriggerDepth.setName("TriggerDepth");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTriggerDepth;
    }

    private TriggerMsgPriority getTriggerMsgPriority()
    {
        if(ivjTriggerMsgPriority == null)
            try
            {
                ivjTriggerMsgPriority = new TriggerMsgPriority();
                ivjTriggerMsgPriority.setName("TriggerMsgPriority");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTriggerMsgPriority;
    }

    private TriggerType getTriggerType()
    {
        if(ivjTriggerType == null)
            try
            {
                ivjTriggerType = new TriggerType();
                ivjTriggerType.setName("TriggerType");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTriggerType;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("NewQueueTriggering");
            setLayout(new GridBagLayout());
            setSize(258, 279);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 2;
            gridbagconstraints.anchor = 17;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJLabel3(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 3;
            gridbagconstraints1.anchor = 17;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getJLabel4(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 4;
            gridbagconstraints2.anchor = 17;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 5;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getJLabel6(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 6;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJLabel7(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 1;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getJLabel9(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 0;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getJLabel10(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 0;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getTriggerControl(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 1;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getTriggerType(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 2;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getTriggerDepth(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 3;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getTriggerMsgPriority(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 5;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getInitiationQueueName(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 0;
            gridbagconstraints12.gridy = 7;
            gridbagconstraints12.gridwidth = 2;
            gridbagconstraints12.fill = 1;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.weighty = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getfiller(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 1;
            gridbagconstraints13.gridy = 4;
            gridbagconstraints13.fill = 2;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getTriggerData(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 6;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getProcessName(), gridbagconstraints14);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public String initiationQueueNameGetValue()
    {
        return getInitiationQueueName().getValue();
    }

    public void initiationQueueNameInit(String as[])
    {
        getInitiationQueueName().init(as);
    }

    public void initiationQueueNameSetValue(String s)
    {
        getInitiationQueueName().setValue(s);
    }

    public static void main(String args[])
    {
        try
        {
            JFrame jframe = new JFrame();
            QueueTriggeringPane queuetriggeringpane = new QueueTriggeringPane();
            jframe.setContentPane(queuetriggeringpane);
            jframe.setSize(queuetriggeringpane.getSize());
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

    public int triggerControlGetValue()
    {
        return getTriggerControl().getValue();
    }

    public void triggerControlSetValue(int i)
    {
        getTriggerControl().setValue(i);
    }

    public String triggerDataGetValue()
    {
        return getTriggerData().getValue();
    }

    public void triggerDataSetValue(String s)
    {
        getTriggerData().setValue(s);
    }

    public int triggerDepthGetValue()
    {
        return getTriggerDepth().getValue();
    }

    public void triggerDepthSetValue(int i)
    {
        getTriggerDepth().setValue(i);
    }

    public int triggerMsgPriorityGetValue()
    {
        return getTriggerMsgPriority().getValue();
    }

    public void triggerMsgPrioritySetValue(int i)
    {
        getTriggerMsgPriority().setValue(i);
    }

    public int triggerTypeGetValue()
    {
        return getTriggerType().getValue();
    }

    public void triggerTypeSetValue(int i)
    {
        getTriggerType().setValue(i);
    }

    private JLabel ivjJLabel10;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private JLabel ivjJLabel9;
    private ProcessName2 ivjProcessName;
    private TriggerControl ivjTriggerControl;
    private TriggerType ivjTriggerType;
    private TriggerDepth ivjTriggerDepth;
    private TriggerMsgPriority ivjTriggerMsgPriority;
    private InitiationQueueName ivjInitiationQueueName;
    private JPanel ivjfiller;
    private TriggerData ivjTriggerData;
}
