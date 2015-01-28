// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JMSMessageRetention.java

package com.kolban.mqjexplorer.mqattributes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class JMSMessageRetention extends JPanel
{

    public JMSMessageRetention()
    {
        ivjCheckBox = null;
        initialize();
    }

    public JMSMessageRetention(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjCheckBox = null;
    }

    public JMSMessageRetention(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjCheckBox = null;
    }

    public JMSMessageRetention(boolean flag)
    {
        super(flag);
        ivjCheckBox = null;
    }

    private JCheckBox getCheckBox()
    {
        if(ivjCheckBox == null)
            try
            {
                ivjCheckBox = new JCheckBox();
                ivjCheckBox.setName("CheckBox");
                ivjCheckBox.setText("Yes");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCheckBox;
    }

    public int getValue()
    {
        return !getCheckBox().isSelected() ? 0 : 1;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("JMSMessageRetention");
            setLayout(new GridBagLayout());
            setSize(54, 30);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getCheckBox(), gridbagconstraints);
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
            JMSMessageRetention jmsmessageretention = new JMSMessageRetention();
            jframe.setContentPane(jmsmessageretention);
            jframe.setSize(jmsmessageretention.getSize());
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

    public void setValue(int i)
    {
        if(i == 1)
            getCheckBox().setSelected(true);
        else
            getCheckBox().setSelected(false);
    }

    private JCheckBox ivjCheckBox;
}
