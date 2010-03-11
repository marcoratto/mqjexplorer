// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcessPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ProcessPane extends JPanel
{

    public ProcessPane()
    {
        ivjApplId = null;
        ivjApplType = null;
        ivjEnvData = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjProcessDesc = null;
        ivjProcessName = null;
        ivjUserData = null;
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTimeLabel = null;
        ivjJPanel1 = null;
        initialize();
    }

    public ProcessPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjApplId = null;
        ivjApplType = null;
        ivjEnvData = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjProcessDesc = null;
        ivjProcessName = null;
        ivjUserData = null;
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTimeLabel = null;
        ivjJPanel1 = null;
    }

    public ProcessPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjApplId = null;
        ivjApplType = null;
        ivjEnvData = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjProcessDesc = null;
        ivjProcessName = null;
        ivjUserData = null;
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTimeLabel = null;
        ivjJPanel1 = null;
    }

    public ProcessPane(boolean flag)
    {
        super(flag);
        ivjApplId = null;
        ivjApplType = null;
        ivjEnvData = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjProcessDesc = null;
        ivjProcessName = null;
        ivjUserData = null;
        ivjAlterationDate = null;
        ivjAlterationTime = null;
        ivjAlterationDateLabel = null;
        ivjAlterationTimeLabel = null;
        ivjJPanel1 = null;
    }

    public void alterationDateSetEditable(boolean flag)
    {
        getAlterationDate().setEditable(flag);
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

    public void alterationTimeSetEditable(boolean flag)
    {
        getAlterationTime().setEditable(flag);
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

    public String applIdGetValue()
    {
        return getApplId().getValue();
    }

    public void applIdSetValue(String s)
    {
        getApplId().setValue(s);
    }

    public int applTypeGetValue()
    {
        return getApplType().getValue();
    }

    public void applTypeSetValue(int i)
    {
        getApplType().setValue(i);
    }

    public String envDataGetValue()
    {
        return getEnvData().getValue();
    }

    public void envDataSetValue(String s)
    {
        getEnvData().setValue(s);
    }

    private AlterationDate getAlterationDate()
    {
        if(ivjAlterationDate == null)
            try
            {
                ivjAlterationDate = new AlterationDate();
                ivjAlterationDate.setName("AlterationDate");
                ivjAlterationDate.setVisible(true);
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
                ivjAlterationDateLabel.setVisible(true);
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
                ivjAlterationTime.setVisible(true);
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
                ivjAlterationTimeLabel.setVisible(true);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAlterationTimeLabel;
    }

    private ApplId getApplId()
    {
        if(ivjApplId == null)
            try
            {
                ivjApplId = new ApplId();
                ivjApplId.setName("ApplId");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjApplId;
    }

    private ApplType getApplType()
    {
        if(ivjApplType == null)
            try
            {
                ivjApplType = new ApplType();
                ivjApplType.setName("ApplType");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjApplType;
    }

    private EnvData getEnvData()
    {
        if(ivjEnvData == null)
            try
            {
                ivjEnvData = new EnvData();
                ivjEnvData.setName("EnvData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEnvData;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Process Definition Name:");
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
                ivjJLabel3.setText("Application Type:");
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
                ivjJLabel4.setText("Application Identifier:");
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
                ivjJLabel5.setText("Environment Data:");
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
                ivjJLabel6.setText("User Data:");
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

    private ProcessDesc getProcessDesc()
    {
        if(ivjProcessDesc == null)
            try
            {
                ivjProcessDesc = new ProcessDesc();
                ivjProcessDesc.setName("ProcessDesc");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjProcessDesc;
    }

    private ProcessName getProcessName()
    {
        if(ivjProcessName == null)
            try
            {
                ivjProcessName = new ProcessName();
                ivjProcessName.setName("ProcessName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjProcessName;
    }

    private UserData getUserData()
    {
        if(ivjUserData == null)
            try
            {
                ivjUserData = new UserData();
                ivjUserData.setName("UserData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjUserData;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("ProcessPane");
            setLayout(new GridBagLayout());
            setSize(324, 343);
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
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 0;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getProcessName(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 1;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getProcessDesc(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 2;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getApplType(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 3;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getApplId(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 4;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getEnvData(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 5;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getUserData(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 0;
            gridbagconstraints12.gridy = 6;
            gridbagconstraints12.anchor = 17;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getAlterationDateLabel(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 0;
            gridbagconstraints13.gridy = 7;
            gridbagconstraints13.anchor = 17;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getAlterationTimeLabel(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 6;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getAlterationDate(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 1;
            gridbagconstraints15.gridy = 7;
            gridbagconstraints15.fill = 2;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getAlterationTime(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 0;
            gridbagconstraints16.gridy = 8;
            gridbagconstraints16.gridwidth = 2;
            gridbagconstraints16.fill = 1;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.weighty = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints16);
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
            ProcessPane processpane = new ProcessPane();
            jframe.setContentPane(processpane);
            jframe.setSize(processpane.getSize());
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

    public String processDescGetValue()
    {
        return getProcessDesc().getValue();
    }

    public void processDescSetValue(String s)
    {
        getProcessDesc().setValue(s);
    }

    public String processNameGetValue()
    {
        return getProcessName().getValue();
    }

    public void processNameSetEditable(boolean flag)
    {
        getProcessName().setEditable(flag);
    }

    public void processNameSetValue(String s)
    {
        getProcessName().setValue(s);
    }

    public String userDataGetValue()
    {
        return getUserData().getValue();
    }

    public void userDataSetValue(String s)
    {
        getUserData().setValue(s);
    }

    private ApplId ivjApplId;
    private ApplType ivjApplType;
    private EnvData ivjEnvData;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private ProcessDesc ivjProcessDesc;
    private ProcessName ivjProcessName;
    private UserData ivjUserData;
    private AlterationDate ivjAlterationDate;
    private AlterationTime ivjAlterationTime;
    private JLabel ivjAlterationDateLabel;
    private JLabel ivjAlterationTimeLabel;
    private JPanel ivjJPanel1;
}
