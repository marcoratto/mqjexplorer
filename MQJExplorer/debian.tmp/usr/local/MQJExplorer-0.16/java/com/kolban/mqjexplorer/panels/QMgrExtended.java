// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QMgrExtended.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QMgrExtended extends JPanel
{

    public QMgrExtended()
    {
        ivjCommandInputQName = null;
        ivjDeadLetterQName = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjMaxHandles = null;
        ivjMaxMsgLength = null;
        ivjMaxPriority = null;
        ivjSyncPoint = null;
        ivjTriggerInterval = null;
        ivjJPanel1 = null;
        ivjMaxUncommitedMsgs = null;
        initialize();
    }

    public QMgrExtended(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjCommandInputQName = null;
        ivjDeadLetterQName = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjMaxHandles = null;
        ivjMaxMsgLength = null;
        ivjMaxPriority = null;
        ivjSyncPoint = null;
        ivjTriggerInterval = null;
        ivjJPanel1 = null;
        ivjMaxUncommitedMsgs = null;
    }

    public QMgrExtended(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjCommandInputQName = null;
        ivjDeadLetterQName = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjMaxHandles = null;
        ivjMaxMsgLength = null;
        ivjMaxPriority = null;
        ivjSyncPoint = null;
        ivjTriggerInterval = null;
        ivjJPanel1 = null;
        ivjMaxUncommitedMsgs = null;
    }

    public QMgrExtended(boolean flag)
    {
        super(flag);
        ivjCommandInputQName = null;
        ivjDeadLetterQName = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjMaxHandles = null;
        ivjMaxMsgLength = null;
        ivjMaxPriority = null;
        ivjSyncPoint = null;
        ivjTriggerInterval = null;
        ivjJPanel1 = null;
        ivjMaxUncommitedMsgs = null;
    }

    public String commandInputQNameGetValue()
    {
        return getCommandInputQName().getValue();
    }

    public void commandInputQNameSetValue(String s)
    {
        getCommandInputQName().setValue(s);
    }

    public String deadLetterQNameGetValue()
    {
        return getDeadLetterQName().getValue();
    }

    public void deadLetterQNameInit(String as[])
    {
        getDeadLetterQName().init(as);
    }

    public void deadLetterQNameSetValue(String s)
    {
        getDeadLetterQName().setValue(s);
    }

    private CommandInputQName getCommandInputQName()
    {
        if(ivjCommandInputQName == null)
            try
            {
                ivjCommandInputQName = new CommandInputQName();
                ivjCommandInputQName.setName("CommandInputQName");
                ivjCommandInputQName.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCommandInputQName;
    }

    private DeadLetterQName getDeadLetterQName()
    {
        if(ivjDeadLetterQName == null)
            try
            {
                ivjDeadLetterQName = new DeadLetterQName();
                ivjDeadLetterQName.setName("DeadLetterQName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDeadLetterQName;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Dead-Letter Queue:");
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
                ivjJLabel2.setText("Trigger Interval:");
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
                ivjJLabel3.setText("Maximum Uncommitted Messages:");
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
                ivjJLabel4.setText("Maximum Open Handles:");
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
                ivjJLabel5.setText("Maximum Message Length:");
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
                ivjJLabel6.setText("Maximum Priority:");
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
                ivjJLabel7.setText("Command Input Queue:");
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
                ivjJLabel8.setText("Syncpoint:");
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
                ivjJLabel9.setText("Distribution Lists:");
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

    private MaxHandles getMaxHandles()
    {
        if(ivjMaxHandles == null)
            try
            {
                ivjMaxHandles = new MaxHandles();
                ivjMaxHandles.setName("MaxHandles");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMaxHandles;
    }

    private MaxMsgLength getMaxMsgLength()
    {
        if(ivjMaxMsgLength == null)
            try
            {
                ivjMaxMsgLength = new MaxMsgLength();
                ivjMaxMsgLength.setName("MaxMsgLength");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMaxMsgLength;
    }

    private MaxPriority getMaxPriority()
    {
        if(ivjMaxPriority == null)
            try
            {
                ivjMaxPriority = new MaxPriority();
                ivjMaxPriority.setName("MaxPriority");
                ivjMaxPriority.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMaxPriority;
    }

    private MaxUncommitedMsgs getMaxUncommitedMsgs()
    {
        if(ivjMaxUncommitedMsgs == null)
            try
            {
                ivjMaxUncommitedMsgs = new MaxUncommitedMsgs();
                ivjMaxUncommitedMsgs.setName("MaxUncommitedMsgs");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMaxUncommitedMsgs;
    }

    private SyncPoint getSyncPoint()
    {
        if(ivjSyncPoint == null)
            try
            {
                ivjSyncPoint = new SyncPoint();
                ivjSyncPoint.setName("SyncPoint");
                ivjSyncPoint.setEnabled(false);
                ivjSyncPoint.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSyncPoint;
    }

    private TriggerInterval getTriggerInterval()
    {
        if(ivjTriggerInterval == null)
            try
            {
                ivjTriggerInterval = new TriggerInterval();
                ivjTriggerInterval.setName("TriggerInterval");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTriggerInterval;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("QMgrExtended");
            setLayout(new GridBagLayout());
            setSize(364, 294);
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
            gridbagconstraints9.insets = new Insets(8, 4, 4, 4);
            add(getDeadLetterQName(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 1;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getTriggerInterval(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 3;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getMaxHandles(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 4;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getMaxMsgLength(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 1;
            gridbagconstraints13.gridy = 5;
            gridbagconstraints13.fill = 2;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getMaxPriority(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 7;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getSyncPoint(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 0;
            gridbagconstraints15.gridy = 9;
            gridbagconstraints15.gridwidth = 2;
            gridbagconstraints15.fill = 1;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.weighty = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 1;
            gridbagconstraints16.gridy = 6;
            gridbagconstraints16.fill = 2;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getCommandInputQName(), gridbagconstraints16);
            GridBagConstraints gridbagconstraints17 = new GridBagConstraints();
            gridbagconstraints17.gridx = 1;
            gridbagconstraints17.gridy = 2;
            gridbagconstraints17.fill = 2;
            gridbagconstraints17.weightx = 1.0D;
            gridbagconstraints17.insets = new Insets(4, 4, 4, 4);
            add(getMaxUncommitedMsgs(), gridbagconstraints17);
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
            QMgrExtended qmgrextended = new QMgrExtended();
            jframe.setContentPane(qmgrextended);
            jframe.setSize(qmgrextended.getSize());
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

    public int maxHandlesGetValue()
    {
        return getMaxHandles().getValue();
    }

    public void maxHandlesSetValue(int i)
    {
        getMaxHandles().setValue(i);
    }

    public int maxMsgLengthGetValue()
    {
        return getMaxMsgLength().getValue();
    }

    public void maxMsgLengthSetValue(int i)
    {
        getMaxMsgLength().setValue(i);
    }

    public int maxPriorityGetValue()
    {
        return getMaxPriority().getValue();
    }

    public void maxPrioritySetValue(int i)
    {
        getMaxPriority().setValue(i);
    }

    public int maxUncommitedMsgsGetValue()
    {
        return getMaxUncommitedMsgs().getValue();
    }

    public void maxUncommitedMsgsSetValue(int i)
    {
        getMaxUncommitedMsgs().setValue(i);
    }

    public int syncPointGetValue()
    {
        return getSyncPoint().getValue();
    }

    public void syncPointSetValue(int i)
    {
        getSyncPoint().setValue(i);
    }

    public int triggerIntervalGetValue()
    {
        return getTriggerInterval().getValue();
    }

    public void triggerIntervalSetValue(int i)
    {
        getTriggerInterval().setValue(i);
    }

    private CommandInputQName ivjCommandInputQName;
    private DeadLetterQName ivjDeadLetterQName;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private JLabel ivjJLabel8;
    private JLabel ivjJLabel9;
    private MaxHandles ivjMaxHandles;
    private MaxMsgLength ivjMaxMsgLength;
    private MaxPriority ivjMaxPriority;
    private SyncPoint ivjSyncPoint;
    private TriggerInterval ivjTriggerInterval;
    private JPanel ivjJPanel1;
    private MaxUncommitedMsgs ivjMaxUncommitedMsgs;
}
