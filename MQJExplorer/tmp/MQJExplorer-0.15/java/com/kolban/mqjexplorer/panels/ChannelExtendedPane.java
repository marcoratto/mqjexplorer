// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelExtendedPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ChannelExtendedPane extends JPanel
{

    public ChannelExtendedPane()
    {
        ivjBatchInterval = null;
        ivjBatchSize = null;
        ivjDataConversion = null;
        ivjDiscInterval = null;
        ivjHeartBeatInterval = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjMaxMsgLength = null;
        ivjNonPersistentMsgSpeed = null;
        ivjPutAuthority = null;
        ivjSeqNumberWrap = null;
        ivjJPanel1 = null;
        ivjBatchIntervalLabel = null;
        ivjDataConversionLabel = null;
        ivjDiscIntervalLabel = null;
        ivjBatchSizeLabel = null;
        ivjNonPersistentMsgSpeedLabel = null;
        ivjPutAuthorityLabel = null;
        ivjSeqNumberWrapLabel = null;
        initialize();
    }

    public ChannelExtendedPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjBatchInterval = null;
        ivjBatchSize = null;
        ivjDataConversion = null;
        ivjDiscInterval = null;
        ivjHeartBeatInterval = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjMaxMsgLength = null;
        ivjNonPersistentMsgSpeed = null;
        ivjPutAuthority = null;
        ivjSeqNumberWrap = null;
        ivjJPanel1 = null;
        ivjBatchIntervalLabel = null;
        ivjDataConversionLabel = null;
        ivjDiscIntervalLabel = null;
        ivjBatchSizeLabel = null;
        ivjNonPersistentMsgSpeedLabel = null;
        ivjPutAuthorityLabel = null;
        ivjSeqNumberWrapLabel = null;
    }

    public ChannelExtendedPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjBatchInterval = null;
        ivjBatchSize = null;
        ivjDataConversion = null;
        ivjDiscInterval = null;
        ivjHeartBeatInterval = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjMaxMsgLength = null;
        ivjNonPersistentMsgSpeed = null;
        ivjPutAuthority = null;
        ivjSeqNumberWrap = null;
        ivjJPanel1 = null;
        ivjBatchIntervalLabel = null;
        ivjDataConversionLabel = null;
        ivjDiscIntervalLabel = null;
        ivjBatchSizeLabel = null;
        ivjNonPersistentMsgSpeedLabel = null;
        ivjPutAuthorityLabel = null;
        ivjSeqNumberWrapLabel = null;
    }

    public ChannelExtendedPane(boolean flag)
    {
        super(flag);
        ivjBatchInterval = null;
        ivjBatchSize = null;
        ivjDataConversion = null;
        ivjDiscInterval = null;
        ivjHeartBeatInterval = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjMaxMsgLength = null;
        ivjNonPersistentMsgSpeed = null;
        ivjPutAuthority = null;
        ivjSeqNumberWrap = null;
        ivjJPanel1 = null;
        ivjBatchIntervalLabel = null;
        ivjDataConversionLabel = null;
        ivjDiscIntervalLabel = null;
        ivjBatchSizeLabel = null;
        ivjNonPersistentMsgSpeedLabel = null;
        ivjPutAuthorityLabel = null;
        ivjSeqNumberWrapLabel = null;
    }

    public int batchIntervalGetValue()
    {
        return getBatchInterval().getValue();
    }

    public void batchIntervalSetValue(int i)
    {
        getBatchInterval().setValue(i);
    }

    public void batchIntervalSetVisible(boolean flag)
    {
        getBatchInterval().setVisible(flag);
        getBatchIntervalLabel().setVisible(flag);
    }

    public int batchSizeGetValue()
    {
        return getBatchSize().getValue();
    }

    public void batchSizeSetValue(int i)
    {
        getBatchSize().setValue(i);
    }

    public void batchSizeSetVisible(boolean flag)
    {
        getBatchSize().setVisible(flag);
        getBatchSizeLabel().setVisible(flag);
    }

    public int dataConversionGetValue()
    {
        return getDataConversion().getValue();
    }

    public void dataConversionSetValue(int i)
    {
        getDataConversion().setValue(i);
    }

    public void dataConversionSetVisible(boolean flag)
    {
        getDataConversion().setVisible(flag);
        getDataConversionLabel().setVisible(flag);
    }

    public int discIntervalGetValue()
    {
        return getDiscInterval().getValue();
    }

    public void discIntervalSetValue(int i)
    {
        getDiscInterval().setValue(i);
    }

    public void discIntervalSetVisible(boolean flag)
    {
        getDiscInterval().setVisible(flag);
        getDiscIntervalLabel().setVisible(flag);
    }

    private BatchInterval getBatchInterval()
    {
        if(ivjBatchInterval == null)
            try
            {
                ivjBatchInterval = new BatchInterval();
                ivjBatchInterval.setName("BatchInterval");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBatchInterval;
    }

    private JLabel getBatchIntervalLabel()
    {
        if(ivjBatchIntervalLabel == null)
            try
            {
                ivjBatchIntervalLabel = new JLabel();
                ivjBatchIntervalLabel.setName("BatchIntervalLabel");
                ivjBatchIntervalLabel.setText("Batch Interval:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBatchIntervalLabel;
    }

    private BatchSize getBatchSize()
    {
        if(ivjBatchSize == null)
            try
            {
                ivjBatchSize = new BatchSize();
                ivjBatchSize.setName("BatchSize");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBatchSize;
    }

    private JLabel getBatchSizeLabel()
    {
        if(ivjBatchSizeLabel == null)
            try
            {
                ivjBatchSizeLabel = new JLabel();
                ivjBatchSizeLabel.setName("BatchSizeLabel");
                ivjBatchSizeLabel.setText("Batch Size:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBatchSizeLabel;
    }

    private DataConversion getDataConversion()
    {
        if(ivjDataConversion == null)
            try
            {
                ivjDataConversion = new DataConversion();
                ivjDataConversion.setName("DataConversion");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDataConversion;
    }

    private JLabel getDataConversionLabel()
    {
        if(ivjDataConversionLabel == null)
            try
            {
                ivjDataConversionLabel = new JLabel();
                ivjDataConversionLabel.setName("DataConversionLabel");
                ivjDataConversionLabel.setText("Data Conversion:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDataConversionLabel;
    }

    private DiscInterval getDiscInterval()
    {
        if(ivjDiscInterval == null)
            try
            {
                ivjDiscInterval = new DiscInterval();
                ivjDiscInterval.setName("DiscInterval");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDiscInterval;
    }

    private JLabel getDiscIntervalLabel()
    {
        if(ivjDiscIntervalLabel == null)
            try
            {
                ivjDiscIntervalLabel = new JLabel();
                ivjDiscIntervalLabel.setName("DiscIntervalLabel");
                ivjDiscIntervalLabel.setText("Disconnect Interval:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDiscIntervalLabel;
    }

    private HeartBeatInterval getHeartBeatInterval()
    {
        if(ivjHeartBeatInterval == null)
            try
            {
                ivjHeartBeatInterval = new HeartBeatInterval();
                ivjHeartBeatInterval.setName("HeartBeatInterval");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHeartBeatInterval;
    }

    private JLabel getJLabel()
    {
        if(ivjJLabel == null)
            try
            {
                ivjJLabel = new JLabel();
                ivjJLabel.setName("JLabel");
                ivjJLabel.setText("Heartbeat Interval:");
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
                ivjJLabel1.setText("Maximum Message Length:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
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

    private NonPersistentMsgSpeed getNonPersistentMsgSpeed()
    {
        if(ivjNonPersistentMsgSpeed == null)
            try
            {
                ivjNonPersistentMsgSpeed = new NonPersistentMsgSpeed();
                ivjNonPersistentMsgSpeed.setName("NonPersistentMsgSpeed");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNonPersistentMsgSpeed;
    }

    private JLabel getNonPersistentMsgSpeedLabel()
    {
        if(ivjNonPersistentMsgSpeedLabel == null)
            try
            {
                ivjNonPersistentMsgSpeedLabel = new JLabel();
                ivjNonPersistentMsgSpeedLabel.setName("NonPersistentMsgSpeedLabel");
                ivjNonPersistentMsgSpeedLabel.setText("Non-Persistent Message Speed:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNonPersistentMsgSpeedLabel;
    }

    private PutAuthority getPutAuthority()
    {
        if(ivjPutAuthority == null)
            try
            {
                ivjPutAuthority = new PutAuthority();
                ivjPutAuthority.setName("PutAuthority");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutAuthority;
    }

    private JLabel getPutAuthorityLabel()
    {
        if(ivjPutAuthorityLabel == null)
            try
            {
                ivjPutAuthorityLabel = new JLabel();
                ivjPutAuthorityLabel.setName("PutAuthorityLabel");
                ivjPutAuthorityLabel.setText("Put Authority:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutAuthorityLabel;
    }

    private SeqNumberWrap getSeqNumberWrap()
    {
        if(ivjSeqNumberWrap == null)
            try
            {
                ivjSeqNumberWrap = new SeqNumberWrap();
                ivjSeqNumberWrap.setName("SeqNumberWrap");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSeqNumberWrap;
    }

    private JLabel getSeqNumberWrapLabel()
    {
        if(ivjSeqNumberWrapLabel == null)
            try
            {
                ivjSeqNumberWrapLabel = new JLabel();
                ivjSeqNumberWrapLabel.setName("SeqNumberWrapLabel");
                ivjSeqNumberWrapLabel.setText("Sequence Number Wrap:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSeqNumberWrapLabel;
    }

    private void handleException(Throwable throwable)
    {
    }

    public int heartBeatIntervalGetValue()
    {
        return getHeartBeatInterval().getValue();
    }

    public void heartBeatIntervalSetValue(int i)
    {
        getHeartBeatInterval().setValue(i);
    }

    private void initialize()
    {
        try
        {
            setName("ChannelExtended");
            setLayout(new GridBagLayout());
            setSize(322, 319);
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
            add(getSeqNumberWrapLabel(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 3;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getNonPersistentMsgSpeedLabel(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 4;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getBatchSizeLabel(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 5;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getBatchIntervalLabel(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 6;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getDiscIntervalLabel(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 0;
            gridbagconstraints7.gridy = 7;
            gridbagconstraints7.anchor = 17;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getDataConversionLabel(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 8;
            gridbagconstraints8.anchor = 17;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getPutAuthorityLabel(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 8;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getPutAuthority(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 7;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getDataConversion(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 6;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getDiscInterval(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 5;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getBatchInterval(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 1;
            gridbagconstraints13.gridy = 4;
            gridbagconstraints13.fill = 2;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getBatchSize(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 3;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getNonPersistentMsgSpeed(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 1;
            gridbagconstraints15.gridy = 2;
            gridbagconstraints15.fill = 2;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getSeqNumberWrap(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 1;
            gridbagconstraints16.gridy = 1;
            gridbagconstraints16.fill = 2;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getHeartBeatInterval(), gridbagconstraints16);
            GridBagConstraints gridbagconstraints17 = new GridBagConstraints();
            gridbagconstraints17.gridx = 1;
            gridbagconstraints17.gridy = 0;
            gridbagconstraints17.fill = 2;
            gridbagconstraints17.weightx = 1.0D;
            gridbagconstraints17.insets = new Insets(4, 4, 4, 4);
            add(getMaxMsgLength(), gridbagconstraints17);
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
            ChannelExtendedPane channelextendedpane = new ChannelExtendedPane();
            jframe.setContentPane(channelextendedpane);
            jframe.setSize(channelextendedpane.getSize());
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

    public int nonPersistentMsgSpeedGetValue()
    {
        return getNonPersistentMsgSpeed().getValue();
    }

    public void nonPersistentMsgSpeedSetValue(int i)
    {
        getNonPersistentMsgSpeed().setValue(i);
    }

    public void nonPersistentMsgSpeedSetVisible(boolean flag)
    {
        getNonPersistentMsgSpeed().setVisible(flag);
        getNonPersistentMsgSpeedLabel().setVisible(flag);
    }

    public int putAuthorityGetValue()
    {
        return getPutAuthority().getValue();
    }

    public void putAuthoritySetValue(int i)
    {
        getPutAuthority().setValue(i);
    }

    public void putAuthoritySetVisible(boolean flag)
    {
        getPutAuthority().setVisible(flag);
        getPutAuthorityLabel().setVisible(flag);
    }

    public int seqNumberWrapGetValue()
    {
        return getSeqNumberWrap().getValue();
    }

    public void seqNumberWrapSetValue(int i)
    {
        getSeqNumberWrap().setValue(i);
    }

    public void seqNumberWrapSetVisible(boolean flag)
    {
        getSeqNumberWrap().setVisible(flag);
        getSeqNumberWrapLabel().setVisible(flag);
    }

    private BatchInterval ivjBatchInterval;
    private BatchSize ivjBatchSize;
    private DataConversion ivjDataConversion;
    private DiscInterval ivjDiscInterval;
    private HeartBeatInterval ivjHeartBeatInterval;
    private JLabel ivjJLabel;
    private JLabel ivjJLabel1;
    private MaxMsgLength ivjMaxMsgLength;
    private NonPersistentMsgSpeed ivjNonPersistentMsgSpeed;
    private PutAuthority ivjPutAuthority;
    private SeqNumberWrap ivjSeqNumberWrap;
    private JPanel ivjJPanel1;
    private JLabel ivjBatchIntervalLabel;
    private JLabel ivjDataConversionLabel;
    private JLabel ivjDiscIntervalLabel;
    private JLabel ivjBatchSizeLabel;
    private JLabel ivjNonPersistentMsgSpeedLabel;
    private JLabel ivjPutAuthorityLabel;
    private JLabel ivjSeqNumberWrapLabel;
}
