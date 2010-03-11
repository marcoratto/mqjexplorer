// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NameListPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class NameListPane extends JPanel
{

    public NameListPane()
    {
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjNames = null;
        ivjJPanel1 = null;
        ivjAlterationDate = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTime = null;
        ivjAlterationTimeLabel = null;
        ivjNamelistDesc = null;
        ivjNamelistName = null;
        initialize();
    }

    public NameListPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjNames = null;
        ivjJPanel1 = null;
        ivjAlterationDate = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTime = null;
        ivjAlterationTimeLabel = null;
        ivjNamelistDesc = null;
        ivjNamelistName = null;
    }

    public NameListPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjNames = null;
        ivjJPanel1 = null;
        ivjAlterationDate = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTime = null;
        ivjAlterationTimeLabel = null;
        ivjNamelistDesc = null;
        ivjNamelistName = null;
    }

    public NameListPane(boolean flag)
    {
        super(flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjNames = null;
        ivjJPanel1 = null;
        ivjAlterationDate = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTime = null;
        ivjAlterationTimeLabel = null;
        ivjNamelistDesc = null;
        ivjNamelistName = null;
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

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("NameList Name:");
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
                ivjJLabel3.setText("Names:");
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

    private NameListDesc getNamelistDesc()
    {
        if(ivjNamelistDesc == null)
            try
            {
                ivjNamelistDesc = new NameListDesc();
                ivjNamelistDesc.setName("NamelistDesc");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNamelistDesc;
    }

    private NameListName getNamelistName()
    {
        if(ivjNamelistName == null)
            try
            {
                ivjNamelistName = new NameListName();
                ivjNamelistName.setName("NamelistName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNamelistName;
    }

    private Names getNames()
    {
        if(ivjNames == null)
            try
            {
                ivjNames = new Names();
                ivjNames.setName("Names");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNames;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("NameListPane");
            setLayout(new GridBagLayout());
            setSize(331, 321);
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
            gridbagconstraints3.gridx = 1;
            gridbagconstraints3.gridy = 0;
            gridbagconstraints3.fill = 2;
            gridbagconstraints3.weightx = 1.0D;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getNamelistName(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 1;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getNamelistDesc(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 2;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getNames(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 5;
            gridbagconstraints6.gridwidth = 2;
            gridbagconstraints6.fill = 1;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.weighty = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 0;
            gridbagconstraints7.gridy = 3;
            gridbagconstraints7.anchor = 17;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getAlterationDateLabel(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 4;
            gridbagconstraints8.anchor = 17;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getAlterationTimeLabel(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 3;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getAlterationDate(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 4;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getAlterationTime(), gridbagconstraints10);
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
            NameListPane namelistpane = new NameListPane();
            jframe.setContentPane(namelistpane);
            jframe.setSize(namelistpane.getSize());
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

    public String nameListDescGetValue()
    {
        return getNamelistDesc().getValue();
    }

    public void nameListDescSetValue(String s)
    {
        getNamelistDesc().setValue(s);
    }

    public String nameListNameGetValue()
    {
        return getNamelistName().getValue();
    }

    public void nameListNameSetEditable(boolean flag)
    {
        getNamelistName().setEditable(flag);
    }

    public void nameListNameSetValue(String s)
    {
        getNamelistName().setValue(s);
    }

    public String[] namesGetValue()
    {
        return getNames().getValue();
    }

    public void namesSetValue(String as[])
    {
        getNames().setValue(as);
    }

    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private Names ivjNames;
    private JPanel ivjJPanel1;
    private AlterationDate ivjAlterationDate;
    private JLabel ivjAlterationDateLabel;
    private AlterationTime ivjAlterationTime;
    private JLabel ivjAlterationTimeLabel;
    private NameListDesc ivjNamelistDesc;
    private NameListName ivjNamelistName;
}
