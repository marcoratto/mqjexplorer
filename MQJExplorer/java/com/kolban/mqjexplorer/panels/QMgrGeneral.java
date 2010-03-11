// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QMgrGeneral.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QMgrGeneral extends JPanel
{

    public QMgrGeneral()
    {
        ivjCodedCharSetId = null;
        ivjCommandLevel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjPlatform = null;
        ivjQMgrDesc = null;
        ivjQMgrName = null;
        ivjJPanel1 = null;
        initialize();
    }

    public QMgrGeneral(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjCodedCharSetId = null;
        ivjCommandLevel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjPlatform = null;
        ivjQMgrDesc = null;
        ivjQMgrName = null;
        ivjJPanel1 = null;
    }

    public QMgrGeneral(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjCodedCharSetId = null;
        ivjCommandLevel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjPlatform = null;
        ivjQMgrDesc = null;
        ivjQMgrName = null;
        ivjJPanel1 = null;
    }

    public QMgrGeneral(boolean flag)
    {
        super(flag);
        ivjCodedCharSetId = null;
        ivjCommandLevel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjPlatform = null;
        ivjQMgrDesc = null;
        ivjQMgrName = null;
        ivjJPanel1 = null;
    }

    public int codedCharSetIdGetValue()
    {
        return getCodedCharSetId().getValue();
    }

    public void codedCharSetIdSetValue(int i)
    {
        getCodedCharSetId().setValue(i);
    }

    public int commandLevelGetValue()
    {
        return getCommandLevel().getValue();
    }

    public void commandLevelSetValue(int i)
    {
        getCommandLevel().setValue(i);
    }

    private CodedCharSetId getCodedCharSetId()
    {
        if(ivjCodedCharSetId == null)
            try
            {
                ivjCodedCharSetId = new CodedCharSetId();
                ivjCodedCharSetId.setName("CodedCharSetId");
                ivjCodedCharSetId.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCodedCharSetId;
    }

    private CommandLevel getCommandLevel()
    {
        if(ivjCommandLevel == null)
            try
            {
                ivjCommandLevel = new CommandLevel();
                ivjCommandLevel.setName("CommandLevel");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCommandLevel;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Queue Manager Name:");
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
                ivjJLabel3.setText("Coded Character Set ID:");
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
                ivjJLabel4.setText("Platform:");
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
                ivjJLabel5.setText("Command Level:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel5;
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

    private Platform getPlatform()
    {
        if(ivjPlatform == null)
            try
            {
                ivjPlatform = new Platform();
                ivjPlatform.setName("Platform");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPlatform;
    }

    private QMgrDesc getQMgrDesc()
    {
        if(ivjQMgrDesc == null)
            try
            {
                ivjQMgrDesc = new QMgrDesc();
                ivjQMgrDesc.setName("QMgrDesc");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQMgrDesc;
    }

    private QMgrName getQMgrName()
    {
        if(ivjQMgrName == null)
            try
            {
                ivjQMgrName = new QMgrName();
                ivjQMgrName.setName("QMgrName");
                ivjQMgrName.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQMgrName;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("QMgrGeneral");
            setLayout(new GridBagLayout());
            setSize(373, 315);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.anchor = 17;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJLabel1(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 1;
            gridbagconstraints1.gridy = 0;
            gridbagconstraints1.fill = 2;
            gridbagconstraints1.weightx = 1.0D;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getQMgrName(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 1;
            gridbagconstraints2.anchor = 17;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getJLabel2(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 1;
            gridbagconstraints3.gridy = 1;
            gridbagconstraints3.fill = 2;
            gridbagconstraints3.weightx = 1.0D;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getQMgrDesc(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 2;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJLabel3(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 2;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getCodedCharSetId(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 3;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getJLabel4(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 3;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getPlatform(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 4;
            gridbagconstraints8.anchor = 17;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 4;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getCommandLevel(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 0;
            gridbagconstraints10.gridy = 5;
            gridbagconstraints10.gridwidth = 2;
            gridbagconstraints10.fill = 1;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.weighty = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints10);
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
            QMgrGeneral qmgrgeneral = new QMgrGeneral();
            jframe.setContentPane(qmgrgeneral);
            jframe.setSize(qmgrgeneral.getSize());
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

    public int platformGetValue()
    {
        return getPlatform().getValue();
    }

    public void platformSetValue(int i)
    {
        getPlatform().setValue(i);
    }

    public String QMgrDescGetValue()
    {
        return getQMgrDesc().getValue();
    }

    public void QMgrDescSetValue(String s)
    {
        getQMgrDesc().setValue(s);
    }

    public String QMgrNameGetValue()
    {
        return getQMgrName().getValue();
    }

    public void QMgrNameSetValue(String s)
    {
        getQMgrName().setValue(s);
    }

    private CodedCharSetId ivjCodedCharSetId;
    private CommandLevel ivjCommandLevel;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private Platform ivjPlatform;
    private QMgrDesc ivjQMgrDesc;
    private QMgrName ivjQMgrName;
    private JPanel ivjJPanel1;
}
