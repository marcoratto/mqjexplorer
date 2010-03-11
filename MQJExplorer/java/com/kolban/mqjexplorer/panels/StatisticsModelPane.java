// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StatisticsModelPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer.panels:
//            StatisticsPane

public class StatisticsModelPane extends JPanel
{

    public StatisticsModelPane()
    {
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjCreationDate = null;
        ivjCreationTime = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        initialize();
    }

    public StatisticsModelPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjCreationDate = null;
        ivjCreationTime = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
    }

    public StatisticsModelPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjCreationDate = null;
        ivjCreationTime = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
    }

    public StatisticsModelPane(boolean flag)
    {
        super(flag);
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjCreationDate = null;
        ivjCreationTime = null;
        ivjJLabel = null;
        ivjJLabel1 = null;
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

    public void creationDateSetValue(String s)
    {
        getCreationDate().setValue(s);
    }

    public void creationTimeSetValue(String s)
    {
        getCreationTime().setValue(s);
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

    private CreationDate getCreationDate()
    {
        if(ivjCreationDate == null)
            try
            {
                ivjCreationDate = new CreationDate();
                ivjCreationDate.setName("CreationDate");
                ivjCreationDate.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCreationDate;
    }

    private CreationTime getCreationTime()
    {
        if(ivjCreationTime == null)
            try
            {
                ivjCreationTime = new CreationTime();
                ivjCreationTime.setName("CreationTime");
                ivjCreationTime.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCreationTime;
    }

    private JLabel getJLabel()
    {
        if(ivjJLabel == null)
            try
            {
                ivjJLabel = new JLabel();
                ivjJLabel.setName("JLabel");
                ivjJLabel.setText("Creation Time:");
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
                ivjJLabel1.setText("Creation Date:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
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
            add(getJLabel5(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 3;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getJLabel6(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 0;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getCreationDate(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 1;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getCreationTime(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 2;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getAlterationDate(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 3;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getAlterationTime(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 4;
            gridbagconstraints8.gridwidth = 2;
            gridbagconstraints8.fill = 1;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.weighty = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints8);
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
            StatisticsPane statisticspane = new StatisticsPane();
            jframe.setContentPane(statisticspane);
            jframe.setSize(statisticspane.getSize());
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
    private CreationDate ivjCreationDate;
    private CreationTime ivjCreationTime;
    private JLabel ivjJLabel;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JPanel ivjJPanel1;
}
