// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StatisticsAliasPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.AlterationDate;
import com.kolban.mqjexplorer.mqattributes.AlterationTime;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class StatisticsAliasPane extends JPanel
{

    public StatisticsAliasPane()
    {
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        initialize();
    }

    public StatisticsAliasPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
    }

    public StatisticsAliasPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
    }

    public StatisticsAliasPane(boolean flag)
    {
        super(flag);
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
    }

    public void alterationDateSetValue(String s)
    {
        getAlterationDate().setValue(s);
    }

    public void alterationTimeSetValue(String s)
    {
        getAlterationTime().setValue(s);
    }

    private AlterationDate getAlterationDate()
    {
        if(ivjAlterationDate == null)
            try
            {
                ivjAlterationDate = new AlterationDate();
                ivjAlterationDate.setName("AlterationDate");
                ivjAlterationDate.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAlterationDate;
    }

    private AlterationTime getAlterationTime()
    {
        if(ivjAlterationTime == null)
            try
            {
                ivjAlterationTime = new AlterationTime();
                ivjAlterationTime.setName("AlterationTime");
                ivjAlterationTime.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAlterationTime;
    }

    private JLabel getJLabel5()
    {
        if(ivjJLabel5 == null)
            try
            {
                ivjJLabel5 = new JLabel();
                ivjJLabel5.setName("JLabel5");
                ivjJLabel5.setText("Alteration Date:");
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
                ivjJLabel6.setText("Alteration Time:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel6;
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
            setName("StatisticsPane");
            setLayout(new GridBagLayout());
            setSize(236, 237);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.anchor = 17;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 1;
            gridbagconstraints1.anchor = 17;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getJLabel6(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 1;
            gridbagconstraints2.gridy = 0;
            gridbagconstraints2.fill = 2;
            gridbagconstraints2.weightx = 1.0D;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getAlterationDate(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 1;
            gridbagconstraints3.gridy = 1;
            gridbagconstraints3.fill = 2;
            gridbagconstraints3.weightx = 1.0D;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getAlterationTime(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 2;
            gridbagconstraints4.gridwidth = 2;
            gridbagconstraints4.fill = 1;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.weighty = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints4);
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
            StatisticsAliasPane statisticsaliaspane = new StatisticsAliasPane();
            jframe.setContentPane(statisticsaliaspane);
            jframe.setSize(statisticsaliaspane.getSize());
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

    private AlterationDate ivjAlterationDate;
    private AlterationTime ivjAlterationTime;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JPanel ivjJPanel1;
}
