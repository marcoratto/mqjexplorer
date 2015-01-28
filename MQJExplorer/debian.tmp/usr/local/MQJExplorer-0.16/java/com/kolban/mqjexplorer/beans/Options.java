// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Options.java

package com.kolban.mqjexplorer.beans;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Options extends JDialog
{

    public Options()
    {
        ivjAutoSaveProfile = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTabbedPane1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjOK = null;
        ivjPage = null;
        initialize();
    }

    public Options(Dialog dialog)
    {
        super(dialog);
        ivjAutoSaveProfile = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTabbedPane1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjOK = null;
        ivjPage = null;
    }

    public Options(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjAutoSaveProfile = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTabbedPane1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjOK = null;
        ivjPage = null;
    }

    public Options(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjAutoSaveProfile = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTabbedPane1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjOK = null;
        ivjPage = null;
    }

    public Options(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjAutoSaveProfile = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTabbedPane1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjOK = null;
        ivjPage = null;
    }

    public Options(Frame frame)
    {
        super(frame);
        ivjAutoSaveProfile = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTabbedPane1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjOK = null;
        ivjPage = null;
    }

    public Options(Frame frame, String s)
    {
        super(frame, s);
        ivjAutoSaveProfile = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTabbedPane1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjOK = null;
        ivjPage = null;
    }

    public Options(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjAutoSaveProfile = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTabbedPane1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjOK = null;
        ivjPage = null;
    }

    public Options(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjAutoSaveProfile = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTabbedPane1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjOK = null;
        ivjPage = null;
    }

    private JCheckBox getAutoSaveProfile()
    {
        if(ivjAutoSaveProfile == null)
            try
            {
                ivjAutoSaveProfile = new JCheckBox();
                ivjAutoSaveProfile.setName("AutoSaveProfile");
                ivjAutoSaveProfile.setText("AutoSave profile on Exit");
                ivjAutoSaveProfile.setHorizontalAlignment(0);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAutoSaveProfile;
    }

    private JButton getCancel()
    {
        if(ivjCancel == null)
            try
            {
                ivjCancel = new JButton();
                ivjCancel.setName("Cancel");
                ivjCancel.setMnemonic('C');
                ivjCancel.setText("Cancel");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCancel;
    }

    private JPanel getJDialogContentPane()
    {
        if(ivjJDialogContentPane == null)
            try
            {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 13;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJTabbedPane1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Browse Count:");
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
                ivjJLabel2.setText("Browse Data Size:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(getJPanel1FlowLayout());
                getJPanel1().add(getOK(), getOK().getName());
                getJPanel1().add(getCancel(), getCancel().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private FlowLayout getJPanel1FlowLayout()
    {
        FlowLayout flowlayout = null;
        try
        {
            flowlayout = new FlowLayout();
            flowlayout.setAlignment(2);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return flowlayout;
    }

    private JSeparator getJSeparator1()
    {
        if(ivjJSeparator1 == null)
            try
            {
                ivjJSeparator1 = new JSeparator();
                ivjJSeparator1.setName("JSeparator1");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSeparator1;
    }

    private JTabbedPane getJTabbedPane1()
    {
        if(ivjJTabbedPane1 == null)
            try
            {
                ivjJTabbedPane1 = new JTabbedPane();
                ivjJTabbedPane1.setName("JTabbedPane1");
                ivjJTabbedPane1.setTabPlacement(2);
                ivjJTabbedPane1.insertTab("General", null, getPage(), null, 0);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTabbedPane1;
    }

    private JTextField getJTextField1()
    {
        if(ivjJTextField1 == null)
            try
            {
                ivjJTextField1 = new JTextField();
                ivjJTextField1.setName("JTextField1");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField1;
    }

    private JTextField getJTextField2()
    {
        if(ivjJTextField2 == null)
            try
            {
                ivjJTextField2 = new JTextField();
                ivjJTextField2.setName("JTextField2");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField2;
    }

    private JButton getOK()
    {
        if(ivjOK == null)
            try
            {
                ivjOK = new JButton();
                ivjOK.setName("OK");
                ivjOK.setMnemonic('O');
                ivjOK.setText("OK");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOK;
    }

    private JPanel getPage()
    {
        if(ivjPage == null)
            try
            {
                ivjPage = new JPanel();
                ivjPage.setName("Page");
                ivjPage.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getPage().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getPage().add(getJTextField1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getPage().add(getJLabel2(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getPage().add(getJTextField2(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 2;
                gridbagconstraints4.gridwidth = 2;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getPage().add(getAutoSaveProfile(), gridbagconstraints4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPage;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("Options");
            setDefaultCloseOperation(2);
            setTitle("MQJExplorer Options");
            setSize(426, 240);
            setModal(true);
            setResizable(false);
            setContentPane(getJDialogContentPane());
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
            Options options = new Options();
            options.setModal(true);
            options.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            options.show();
            Insets insets = options.getInsets();
            options.setSize(options.getWidth() + insets.left + insets.right, options.getHeight() + insets.top + insets.bottom);
            options.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private JCheckBox ivjAutoSaveProfile;
    private JButton ivjCancel;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JSeparator ivjJSeparator1;
    private JTabbedPane ivjJTabbedPane1;
    private JTextField ivjJTextField1;
    private JTextField ivjJTextField2;
    private JButton ivjOK;
    private JPanel ivjPage;
}
