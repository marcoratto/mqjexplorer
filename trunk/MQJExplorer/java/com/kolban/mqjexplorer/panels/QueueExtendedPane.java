// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueExtendedPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QueueExtendedPane extends JPanel
{

    public QueueExtendedPane()
    {
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjDefinitionType = null;
        ivjMsgDeliverySequence = null;
        ivjDistLists = null;
        ivjDefInputOpenOption = null;
        ivjShareability = null;
        ivjMaxMsgLength = null;
        ivjMaxQDepth = null;
        ivjRetentionInterval = null;
        ivjfiller = null;
        initialize();
    }

    public QueueExtendedPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjDefinitionType = null;
        ivjMsgDeliverySequence = null;
        ivjDistLists = null;
        ivjDefInputOpenOption = null;
        ivjShareability = null;
        ivjMaxMsgLength = null;
        ivjMaxQDepth = null;
        ivjRetentionInterval = null;
        ivjfiller = null;
    }

    public QueueExtendedPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjDefinitionType = null;
        ivjMsgDeliverySequence = null;
        ivjDistLists = null;
        ivjDefInputOpenOption = null;
        ivjShareability = null;
        ivjMaxMsgLength = null;
        ivjMaxQDepth = null;
        ivjRetentionInterval = null;
        ivjfiller = null;
    }

    public QueueExtendedPane(boolean flag)
    {
        super(flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjDefinitionType = null;
        ivjMsgDeliverySequence = null;
        ivjDistLists = null;
        ivjDefInputOpenOption = null;
        ivjShareability = null;
        ivjMaxMsgLength = null;
        ivjMaxQDepth = null;
        ivjRetentionInterval = null;
        ivjfiller = null;
    }

    public int definitionTypeGetValue()
    {
        return getDefinitionType().getValue();
    }

    public void definitionTypeSetEditable(boolean flag)
    {
        getDefinitionType().setEditable(flag);
    }

    public void definitionTypeSetValue(int i)
    {
        getDefinitionType().setValue(i);
    }

    public int defInputOpenOptionGetValue()
    {
        return getDefInputOpenOption().getValue();
    }

    public void defInputOpenOptionSetValue(int i)
    {
        getDefInputOpenOption().setValue(i);
    }

    public int distListsGetValue()
    {
        return getDistLists().getValue();
    }

    public void distListsSetValue(int i)
    {
        getDistLists().setValue(i);
    }

    private DefinitionType getDefinitionType()
    {
        if(ivjDefinitionType == null)
            try
            {
                ivjDefinitionType = new DefinitionType();
                ivjDefinitionType.setName("DefinitionType");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDefinitionType;
    }

    private DefInputOpenOption getDefInputOpenOption()
    {
        if(ivjDefInputOpenOption == null)
            try
            {
                ivjDefInputOpenOption = new DefInputOpenOption();
                ivjDefInputOpenOption.setName("DefInputOpenOption");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDefInputOpenOption;
    }

    private DistLists getDistLists()
    {
        if(ivjDistLists == null)
            try
            {
                ivjDistLists = new DistLists();
                ivjDistLists.setName("DistLists");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDistLists;
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

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Maximum Queue Depth:");
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
                ivjJLabel2.setText("Maximum Message Length:");
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
                ivjJLabel3.setText("Shareability:");
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
                ivjJLabel4.setText("Default Input Open Option:");
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
                ivjJLabel5.setText("Message Delivery Sequence:");
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
                ivjJLabel6.setText("Retention Level:");
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
                ivjJLabel7.setText("Definition Type:");
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
                ivjJLabel8.setText("Distribution Lists:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel8;
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

    private MaxQDepth getMaxQDepth()
    {
        if(ivjMaxQDepth == null)
            try
            {
                ivjMaxQDepth = new MaxQDepth();
                ivjMaxQDepth.setName("MaxQDepth");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMaxQDepth;
    }

    private MsgDeliverySequence getMsgDeliverySequence()
    {
        if(ivjMsgDeliverySequence == null)
            try
            {
                ivjMsgDeliverySequence = new MsgDeliverySequence();
                ivjMsgDeliverySequence.setName("MsgDeliverySequence");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgDeliverySequence;
    }

    private RetentionInterval getRetentionInterval()
    {
        if(ivjRetentionInterval == null)
            try
            {
                ivjRetentionInterval = new RetentionInterval();
                ivjRetentionInterval.setName("RetentionInterval");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRetentionInterval;
    }

    private Shareability getShareability()
    {
        if(ivjShareability == null)
            try
            {
                ivjShareability = new Shareability();
                ivjShareability.setName("Shareability");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjShareability;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("NewQueueExtended");
            setLayout(new GridBagLayout());
            setSize(280, 296);
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
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 4;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getMsgDeliverySequence(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 7;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getDistLists(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 3;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getDefInputOpenOption(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 2;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getShareability(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 1;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getMaxMsgLength(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 1;
            gridbagconstraints13.gridy = 0;
            gridbagconstraints13.fill = 2;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getMaxQDepth(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 5;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getRetentionInterval(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 0;
            gridbagconstraints15.gridy = 8;
            gridbagconstraints15.gridwidth = 2;
            gridbagconstraints15.fill = 1;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.weighty = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getfiller(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 1;
            gridbagconstraints16.gridy = 6;
            gridbagconstraints16.fill = 2;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getDefinitionType(), gridbagconstraints16);
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
            QueueExtendedPane queueextendedpane = new QueueExtendedPane();
            jframe.setContentPane(queueextendedpane);
            jframe.setSize(queueextendedpane.getSize());
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

    public int maxMsgLengthGetValue()
    {
        return getMaxMsgLength().getValue();
    }

    public void maxMsgLengthSetValue(int i)
    {
        getMaxMsgLength().setValue(i);
    }

    public int maxQDepthGetValue()
    {
        return getMaxQDepth().getValue();
    }

    public void maxQDepthSetValue(int i)
    {
        getMaxQDepth().setValue(i);
    }

    public int msgDeliverySequenceGetValue()
    {
        return getMsgDeliverySequence().getValue();
    }

    public void msgDeliverySequenceSetValue(int i)
    {
        getMsgDeliverySequence().setValue(i);
    }

    public int retentionIntervalGetValue()
    {
        return getRetentionInterval().getValue();
    }

    public void retentionIntervalSetValue(int i)
    {
        getRetentionInterval().setValue(i);
    }

    public int shareabilityGetValue()
    {
        return getShareability().getValue();
    }

    public void shareabilitySetValue(int i)
    {
        getShareability().setValue(i);
    }

    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private JLabel ivjJLabel8;
    private DefinitionType ivjDefinitionType;
    private MsgDeliverySequence ivjMsgDeliverySequence;
    private DistLists ivjDistLists;
    private DefInputOpenOption ivjDefInputOpenOption;
    private Shareability ivjShareability;
    private MaxMsgLength ivjMaxMsgLength;
    private MaxQDepth ivjMaxQDepth;
    private RetentionInterval ivjRetentionInterval;
    private JPanel ivjfiller;
}
