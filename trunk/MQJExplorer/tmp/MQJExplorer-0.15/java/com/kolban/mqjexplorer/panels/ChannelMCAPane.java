// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelMCAPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ChannelMCAPane extends JPanel
{

    public ChannelMCAPane()
    {
        ivjMCAName = null;
        ivjMCAType = null;
        ivjMCAUserIdentifier = null;
        ivjJPanel1 = null;
        ivjMCANameLabel = null;
        ivjMCATypeLabel = null;
        ivjMCAUseridentifierLabel = null;
        initialize();
    }

    public ChannelMCAPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjMCAName = null;
        ivjMCAType = null;
        ivjMCAUserIdentifier = null;
        ivjJPanel1 = null;
        ivjMCANameLabel = null;
        ivjMCATypeLabel = null;
        ivjMCAUseridentifierLabel = null;
    }

    public ChannelMCAPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjMCAName = null;
        ivjMCAType = null;
        ivjMCAUserIdentifier = null;
        ivjJPanel1 = null;
        ivjMCANameLabel = null;
        ivjMCATypeLabel = null;
        ivjMCAUseridentifierLabel = null;
    }

    public ChannelMCAPane(boolean flag)
    {
        super(flag);
        ivjMCAName = null;
        ivjMCAType = null;
        ivjMCAUserIdentifier = null;
        ivjJPanel1 = null;
        ivjMCANameLabel = null;
        ivjMCATypeLabel = null;
        ivjMCAUseridentifierLabel = null;
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

    private MCAName getMCAName()
    {
        if(ivjMCAName == null)
            try
            {
                ivjMCAName = new MCAName();
                ivjMCAName.setName("MCAName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMCAName;
    }

    private JLabel getMCANameLabel()
    {
        if(ivjMCANameLabel == null)
            try
            {
                ivjMCANameLabel = new JLabel();
                ivjMCANameLabel.setName("MCANameLabel");
                ivjMCANameLabel.setText("MCA Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMCANameLabel;
    }

    private MCAType getMCAType()
    {
        if(ivjMCAType == null)
            try
            {
                ivjMCAType = new MCAType();
                ivjMCAType.setName("MCAType");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMCAType;
    }

    private JLabel getMCATypeLabel()
    {
        if(ivjMCATypeLabel == null)
            try
            {
                ivjMCATypeLabel = new JLabel();
                ivjMCATypeLabel.setName("MCATypeLabel");
                ivjMCATypeLabel.setText("MCA Type:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMCATypeLabel;
    }

    private MCAUserIdentifier getMCAUserIdentifier()
    {
        if(ivjMCAUserIdentifier == null)
            try
            {
                ivjMCAUserIdentifier = new MCAUserIdentifier();
                ivjMCAUserIdentifier.setName("MCAUserIdentifier");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMCAUserIdentifier;
    }

    private JLabel getMCAUseridentifierLabel()
    {
        if(ivjMCAUseridentifierLabel == null)
            try
            {
                ivjMCAUseridentifierLabel = new JLabel();
                ivjMCAUseridentifierLabel.setName("MCAUseridentifierLabel");
                ivjMCAUseridentifierLabel.setText("MCA User ID:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMCAUseridentifierLabel;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("ChannelMCA");
            setLayout(new GridBagLayout());
            setSize(245, 246);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.anchor = 17;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getMCAUseridentifierLabel(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 1;
            gridbagconstraints1.anchor = 17;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getMCATypeLabel(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 2;
            gridbagconstraints2.anchor = 17;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getMCANameLabel(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 1;
            gridbagconstraints3.gridy = 2;
            gridbagconstraints3.fill = 2;
            gridbagconstraints3.weightx = 1.0D;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getMCAName(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 0;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getMCAUserIdentifier(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 1;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getMCAType(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 3;
            gridbagconstraints6.gridwidth = 2;
            gridbagconstraints6.fill = 1;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.weighty = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints6);
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
            ChannelMCAPane channelmcapane = new ChannelMCAPane();
            jframe.setContentPane(channelmcapane);
            jframe.setSize(channelmcapane.getSize());
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

    public String MCANameGetValue()
    {
        return getMCAName().getValue();
    }

    public void MCANameSetValue(String s)
    {
        getMCAName().setValue(s);
    }

    public void MCANameSetVisible(boolean flag)
    {
        getMCAName().setVisible(flag);
        getMCANameLabel().setVisible(flag);
    }

    public int MCATypeGetValue()
    {
        return getMCAType().getValue();
    }

    public void MCATypeSetValue(int i)
    {
        getMCAType().setValue(i);
    }

    public void MCATypeSetVisible(boolean flag)
    {
        getMCAType().setVisible(flag);
        getMCATypeLabel().setVisible(flag);
    }

    public String MCAUserIdentifierGetValue()
    {
        return getMCAUserIdentifier().getValue();
    }

    public void MCAUserIdentifierSetValue(String s)
    {
        getMCAUserIdentifier().setValue(s);
    }

    public void MCAUseridentifierSetVisible(boolean flag)
    {
        getMCAUserIdentifier().setVisible(flag);
        getMCAUseridentifierLabel().setVisible(flag);
    }

    private MCAName ivjMCAName;
    private MCAType ivjMCAType;
    private MCAUserIdentifier ivjMCAUserIdentifier;
    private JPanel ivjJPanel1;
    private JLabel ivjMCANameLabel;
    private JLabel ivjMCATypeLabel;
    private JLabel ivjMCAUseridentifierLabel;
}
