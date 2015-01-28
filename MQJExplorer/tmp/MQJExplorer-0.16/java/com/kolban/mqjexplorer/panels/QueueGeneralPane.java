// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueGeneralPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QueueGeneralPane extends JPanel
{

    public QueueGeneralPane()
    {
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjInhibitPut = null;
        ivjInhibitGet = null;
        ivjDefPersistence = null;
        ivjScope = null;
        ivjUsage = null;
        ivjQName = null;
        ivjDefPriority = null;
        ivjQDesc = null;
        ivjJPanel1 = null;
        ivjQType = null;
        initialize();
    }

    public QueueGeneralPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjInhibitPut = null;
        ivjInhibitGet = null;
        ivjDefPersistence = null;
        ivjScope = null;
        ivjUsage = null;
        ivjQName = null;
        ivjDefPriority = null;
        ivjQDesc = null;
        ivjJPanel1 = null;
        ivjQType = null;
    }

    public QueueGeneralPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjInhibitPut = null;
        ivjInhibitGet = null;
        ivjDefPersistence = null;
        ivjScope = null;
        ivjUsage = null;
        ivjQName = null;
        ivjDefPriority = null;
        ivjQDesc = null;
        ivjJPanel1 = null;
        ivjQType = null;
    }

    public QueueGeneralPane(boolean flag)
    {
        super(flag);
        ivjJLabel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjInhibitPut = null;
        ivjInhibitGet = null;
        ivjDefPersistence = null;
        ivjScope = null;
        ivjUsage = null;
        ivjQName = null;
        ivjDefPriority = null;
        ivjQDesc = null;
        ivjJPanel1 = null;
        ivjQType = null;
    }

    public int defPersistenceGetValue()
    {
        return getDefPersistence().getValue();
    }

    public void defPersistenceSetValue(int i)
    {
        getDefPersistence().setValue(i);
    }

    public int defPriorityGetValue()
    {
        return getDefPriority().getValue();
    }

    public void defPrioritySetValue(int i)
    {
        getDefPriority().setValue(i);
    }

    private DefPersistence getDefPersistence()
    {
        if(ivjDefPersistence == null)
            try
            {
                ivjDefPersistence = new DefPersistence();
                ivjDefPersistence.setName("DefPersistence");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDefPersistence;
    }

    private DefPriority getDefPriority()
    {
        if(ivjDefPriority == null)
            try
            {
                ivjDefPriority = new DefPriority();
                ivjDefPriority.setName("DefPriority");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDefPriority;
    }

    private InhibitGet getInhibitGet()
    {
        if(ivjInhibitGet == null)
            try
            {
                ivjInhibitGet = new InhibitGet();
                ivjInhibitGet.setName("InhibitGet");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInhibitGet;
    }

    private InhibitPut getInhibitPut()
    {
        if(ivjInhibitPut == null)
            try
            {
                ivjInhibitPut = new InhibitPut();
                ivjInhibitPut.setName("InhibitPut");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInhibitPut;
    }

    private JLabel getJLabel()
    {
        if(ivjJLabel == null)
            try
            {
                ivjJLabel = new JLabel();
                ivjJLabel.setName("JLabel");
                ivjJLabel.setText("Usage:");
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
                ivjJLabel1.setText("Queue Name:");
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
                ivjJLabel2.setText("Type:");
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
                ivjJLabel3.setText("Description:");
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
                ivjJLabel4.setText("Put Messages:");
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
                ivjJLabel5.setText("Get Messages:");
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
                ivjJLabel6.setText("Default Priority:");
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
                ivjJLabel7.setText("Default Persistence:");
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
                ivjJLabel8.setText("Scope:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel8;
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

    private QDesc getQDesc()
    {
        if(ivjQDesc == null)
            try
            {
                ivjQDesc = new QDesc();
                ivjQDesc.setName("QDesc");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQDesc;
    }

    private QName getQName()
    {
        if(ivjQName == null)
            try
            {
                ivjQName = new QName();
                ivjQName.setName("QName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQName;
    }

    private QType getQType()
    {
        if(ivjQType == null)
            try
            {
                ivjQType = new QType();
                ivjQType.setName("QType");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQType;
    }

    private Scope getScope()
    {
        if(ivjScope == null)
            try
            {
                ivjScope = new Scope();
                ivjScope.setName("Scope");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjScope;
    }

    private Usage getUsage()
    {
        if(ivjUsage == null)
            try
            {
                ivjUsage = new Usage();
                ivjUsage.setName("Usage");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjUsage;
    }

    private void handleException(Throwable throwable)
    {
    }

    public int inhibitGetGetValue()
    {
        return getInhibitGet().getValue();
    }

    public void inhibitGetSetValue(int i)
    {
        getInhibitGet().setValue(i);
    }

    public int inhibitPutGetValue()
    {
        return getInhibitPut().getValue();
    }

    public void inhibitPutSetValue(int i)
    {
        getInhibitPut().setValue(i);
    }

    private void initialize()
    {
        try
        {
            setName("NewQueueGeneral");
            setLayout(new GridBagLayout());
            setSize(284, 373);
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
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 8;
            gridbagconstraints8.anchor = 17;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getJLabel(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 3;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getInhibitPut(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 4;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getInhibitGet(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 6;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getDefPersistence(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 7;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getScope(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 1;
            gridbagconstraints13.gridy = 8;
            gridbagconstraints13.fill = 2;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getUsage(), gridbagconstraints13);
            GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
            gridbagconstraints14.gridx = 1;
            gridbagconstraints14.gridy = 0;
            gridbagconstraints14.fill = 2;
            gridbagconstraints14.weightx = 1.0D;
            gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
            add(getQName(), gridbagconstraints14);
            GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
            gridbagconstraints15.gridx = 1;
            gridbagconstraints15.gridy = 5;
            gridbagconstraints15.fill = 2;
            gridbagconstraints15.weightx = 1.0D;
            gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
            add(getDefPriority(), gridbagconstraints15);
            GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
            gridbagconstraints16.gridx = 1;
            gridbagconstraints16.gridy = 2;
            gridbagconstraints16.fill = 2;
            gridbagconstraints16.weightx = 1.0D;
            gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
            add(getQDesc(), gridbagconstraints16);
            GridBagConstraints gridbagconstraints17 = new GridBagConstraints();
            gridbagconstraints17.gridx = 0;
            gridbagconstraints17.gridy = 9;
            gridbagconstraints17.gridwidth = 2;
            gridbagconstraints17.fill = 1;
            gridbagconstraints17.weightx = 1.0D;
            gridbagconstraints17.weighty = 1.0D;
            gridbagconstraints17.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints17);
            GridBagConstraints gridbagconstraints18 = new GridBagConstraints();
            gridbagconstraints18.gridx = 1;
            gridbagconstraints18.gridy = 1;
            gridbagconstraints18.fill = 2;
            gridbagconstraints18.weightx = 1.0D;
            gridbagconstraints18.insets = new Insets(4, 4, 4, 4);
            add(getQType(), gridbagconstraints18);
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
            QueueGeneralPane queuegeneralpane = new QueueGeneralPane();
            jframe.setContentPane(queuegeneralpane);
            jframe.setSize(queuegeneralpane.getSize());
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

    public String QDescGetValue()
    {
        return getQDesc().getValue();
    }

    public void QDescSetValue(String s)
    {
        getQDesc().setValue(s);
    }

    public String QNameGetValue()
    {
        return getQName().getValue();
    }

    public void QNameSetEditable(boolean flag)
    {
        getQName().setEditable(flag);
    }

    public void QNameSetValue(String s)
    {
        getQName().setValue(s);
    }

    public void QTypeSetValue(int i)
    {
        getQType().setValue(i);
    }

    public int scopeGetValue()
    {
        return getScope().getValue();
    }

    public void scopeSetValue(int i)
    {
        getScope().setValue(i);
    }

    public int usageGetValue()
    {
        return getUsage().getValue();
    }

    public void usageSetValue(int i)
    {
        getUsage().setValue(i);
    }

    private JLabel ivjJLabel;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private JLabel ivjJLabel8;
    private InhibitPut ivjInhibitPut;
    private InhibitGet ivjInhibitGet;
    private DefPersistence ivjDefPersistence;
    private Scope ivjScope;
    private Usage ivjUsage;
    private QName ivjQName;
    private DefPriority ivjDefPriority;
    private QDesc ivjQDesc;
    private JPanel ivjJPanel1;
    private QType ivjQType;
}
