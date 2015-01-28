// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelGeneralPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ChannelGeneralPane extends JPanel
{

    public ChannelGeneralPane()
    {
        ivjChannelDesc = null;
        ivjChannelName = null;
        ivjChannelType = null;
        ivjConnectionName = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTransportType = null;
        ivjXmitQName = null;
        ivjJPanel1 = null;
        ivjConnectionNameLabel = null;
        ivjXmitQNameLabel = null;
        ivjAlterationDate = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTime = null;
        ivjAlterationTimeLabel = null;
        initialize();
    }

    public ChannelGeneralPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjChannelDesc = null;
        ivjChannelName = null;
        ivjChannelType = null;
        ivjConnectionName = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTransportType = null;
        ivjXmitQName = null;
        ivjJPanel1 = null;
        ivjConnectionNameLabel = null;
        ivjXmitQNameLabel = null;
        ivjAlterationDate = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTime = null;
        ivjAlterationTimeLabel = null;
    }

    public ChannelGeneralPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjChannelDesc = null;
        ivjChannelName = null;
        ivjChannelType = null;
        ivjConnectionName = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTransportType = null;
        ivjXmitQName = null;
        ivjJPanel1 = null;
        ivjConnectionNameLabel = null;
        ivjXmitQNameLabel = null;
        ivjAlterationDate = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTime = null;
        ivjAlterationTimeLabel = null;
    }

    public ChannelGeneralPane(boolean flag)
    {
        super(flag);
        ivjChannelDesc = null;
        ivjChannelName = null;
        ivjChannelType = null;
        ivjConnectionName = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTransportType = null;
        ivjXmitQName = null;
        ivjJPanel1 = null;
        ivjConnectionNameLabel = null;
        ivjXmitQNameLabel = null;
        ivjAlterationDate = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTime = null;
        ivjAlterationTimeLabel = null;
    }

    public String alterationDateGetValue()
    {
        return getAlterationDate().getValue();
    }

    public void alterationDateSetValue(String s)
    {
        getAlterationDate().setValue(s);
    }

    public void alterationDateSetVisible(boolean flag)
    {
        getAlterationDate().setVisible(flag);
        getAlterationDateLabel().setVisible(flag);
    }

    public String alterationTimeGetValue()
    {
        return getAlterationTime().getValue();
    }

    public void alterationTimeSetValue(String s)
    {
        getAlterationTime().setValue(s);
    }

    public void alterationTimeSetVisible(boolean flag)
    {
        getAlterationTime().setVisible(flag);
        getAlterationTimeLabel().setVisible(flag);
    }

    public String channelDescGetValue()
    {
        return getChannelDesc().getValue();
    }

    public void channelDescSetValue(String s)
    {
        getChannelDesc().setValue(s);
    }

    public String channelNameGetValue()
    {
        return getChannelName().getValue();
    }

    public void channelNameSetEditable(boolean flag)
    {
        getChannelName().setEditable(flag);
    }

    public void channelNameSetValue(String s)
    {
        getChannelName().setValue(s);
    }

    public int channelTypeGetValue()
    {
        return getChannelType().getValue();
    }

    public void channelTypeSetValue(int i)
    {
        getChannelType().setValue(i);
    }

    public void channelTypeSetVisible(boolean flag)
    {
        getChannelType().setVisible(flag);
    }

    public String connectionNameGetValue()
    {
        return getConnectionName().getValue();
    }

    public void connectionNameSetValue(String s)
    {
        getConnectionName().setValue(s);
    }

    public void connectionNameSetVisible(boolean flag)
    {
        getConnectionName().setVisible(flag);
        getConnectionNameLabel().setVisible(flag);
    }

    private AlterationDate getAlterationDate()
    {
        if(ivjAlterationDate == null)
            try
            {
                ivjAlterationDate = new AlterationDate();
                ivjAlterationDate.setName("AlterationDate");
                ivjAlterationDate.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAlterationDate;
    }

    private JLabel getAlterationDateLabel()
    {
        if(ivjAlterationDateLabel == null)
            try
            {
                ivjAlterationDateLabel = new JLabel();
                ivjAlterationDateLabel.setName("AlterationDateLabel");
                ivjAlterationDateLabel.setText("Alteration Date:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAlterationDateLabel;
    }

    private AlterationTime getAlterationTime()
    {
        if(ivjAlterationTime == null)
            try
            {
                ivjAlterationTime = new AlterationTime();
                ivjAlterationTime.setName("AlterationTime");
                ivjAlterationTime.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAlterationTime;
    }

    private JLabel getAlterationTimeLabel()
    {
        if(ivjAlterationTimeLabel == null)
            try
            {
                ivjAlterationTimeLabel = new JLabel();
                ivjAlterationTimeLabel.setName("AlterationTimeLabel");
                ivjAlterationTimeLabel.setText("Alteration Time:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAlterationTimeLabel;
    }

    private ChannelDesc getChannelDesc()
    {
        if(ivjChannelDesc == null)
            try
            {
                ivjChannelDesc = new ChannelDesc();
                ivjChannelDesc.setName("ChannelDesc");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjChannelDesc;
    }

    private ChannelName getChannelName()
    {
        if(ivjChannelName == null)
            try
            {
                ivjChannelName = new ChannelName();
                ivjChannelName.setName("ChannelName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjChannelName;
    }

    private ChannelType getChannelType()
    {
        if(ivjChannelType == null)
            try
            {
                ivjChannelType = new ChannelType();
                ivjChannelType.setName("ChannelType");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjChannelType;
    }

    private ConnectionName getConnectionName()
    {
        if(ivjConnectionName == null)
            try
            {
                ivjConnectionName = new ConnectionName();
                ivjConnectionName.setName("ConnectionName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjConnectionName;
    }

    private JLabel getConnectionNameLabel()
    {
        if(ivjConnectionNameLabel == null)
            try
            {
                ivjConnectionNameLabel = new JLabel();
                ivjConnectionNameLabel.setName("ConnectionNameLabel");
                ivjConnectionNameLabel.setText("Connection Name:");
                ivjConnectionNameLabel.setHorizontalTextPosition(0);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjConnectionNameLabel;
    }

    private JLabel getJLabel()
    {
        if(ivjJLabel == null)
            try
            {
                ivjJLabel = new JLabel();
                ivjJLabel.setName("JLabel");
                ivjJLabel.setText("Type:");
                ivjJLabel.setHorizontalTextPosition(0);
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
                ivjJLabel1.setText("Channel Name:");
                ivjJLabel1.setHorizontalTextPosition(0);
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
                ivjJLabel2.setText("Description:");
                ivjJLabel2.setHorizontalTextPosition(0);
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
                ivjJLabel3.setText("Transmission Protocol:");
                ivjJLabel3.setHorizontalTextPosition(0);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel3;
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

    private TransportType getTransportType()
    {
        if(ivjTransportType == null)
            try
            {
                ivjTransportType = new TransportType();
                ivjTransportType.setName("TransportType");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTransportType;
    }

    private XmitQName getXmitQName()
    {
        if(ivjXmitQName == null)
            try
            {
                ivjXmitQName = new XmitQName();
                ivjXmitQName.setName("XmitQName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjXmitQName;
    }

    private JLabel getXmitQNameLabel()
    {
        if(ivjXmitQNameLabel == null)
            try
            {
                ivjXmitQNameLabel = new JLabel();
                ivjXmitQNameLabel.setName("XmitQNameLabel");
                ivjXmitQNameLabel.setText("Transmission Queue:");
                ivjXmitQNameLabel.setHorizontalTextPosition(0);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjXmitQNameLabel;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("ChannelGeneral");
            setLayout(new GridBagLayout());
            setSize(288, 333);
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
            add(getConnectionNameLabel(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 5;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getXmitQNameLabel(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 0;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getChannelName(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 1;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getChannelType(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 2;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getChannelDesc(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 3;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getTransportType(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 4;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getConnectionName(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 5;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getXmitQName(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 0;
            gridbagconstraints12.gridy = 8;
            gridbagconstraints12.gridwidth = 2;
            gridbagconstraints12.fill = 1;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.weighty = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 0;
            gridbagconstraints13.gridy = 6;
            gridbagconstraints13.anchor = 17;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getAlterationDateLabel(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 0;
            gridbagconstraints14.gridy = 7;
            gridbagconstraints14.anchor = 17;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getAlterationTimeLabel(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 1;
            gridbagconstraints15.gridy = 7;
            gridbagconstraints15.fill = 2;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getAlterationTime(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 1;
            gridbagconstraints16.gridy = 6;
            gridbagconstraints16.fill = 2;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getAlterationDate(), gridbagconstraints16);
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
            ChannelGeneralPane channelgeneralpane = new ChannelGeneralPane();
            jframe.setContentPane(channelgeneralpane);
            jframe.setSize(channelgeneralpane.getSize());
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

    public int transportTypeGetValue()
    {
        return getTransportType().getValue();
    }

    public void transportTypeSetValue(int i)
    {
        getTransportType().setValue(i);
    }

    public String xmitQNameGetValue()
    {
        return getXmitQName().getValue();
    }

    public void xmitQNameInit(String as[])
    {
        getXmitQName().init(as);
    }

    public void xmitQNameSetValue(String s)
    {
        getXmitQName().setValue(s);
    }

    public void xmitQNameSetVisible(boolean flag)
    {
        getXmitQName().setVisible(flag);
        getXmitQNameLabel().setVisible(flag);
    }

    private ChannelDesc ivjChannelDesc;
    private ChannelName ivjChannelName;
    private ChannelType ivjChannelType;
    private ConnectionName ivjConnectionName;
    private JLabel ivjJLabel;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private TransportType ivjTransportType;
    private XmitQName ivjXmitQName;
    private JPanel ivjJPanel1;
    private JLabel ivjConnectionNameLabel;
    private JLabel ivjXmitQNameLabel;
    private AlterationDate ivjAlterationDate;
    private JLabel ivjAlterationDateLabel;
    private AlterationTime ivjAlterationTime;
    private JLabel ivjAlterationTimeLabel;
}
