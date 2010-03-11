// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExpiredDlg.java

package com.kolban.mqjexplorer.beans;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ExpiredDlg extends JDialog
{

    public ExpiredDlg()
    {
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        initialize();
    }

    public ExpiredDlg(Dialog dialog)
    {
        super(dialog);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
    }

    public ExpiredDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
    }

    public ExpiredDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
    }

    public ExpiredDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
    }

    public ExpiredDlg(Frame frame)
    {
        super(frame);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
    }

    public ExpiredDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
    }

    public ExpiredDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
    }

    public ExpiredDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
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
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getJDialogContentPane().add(getJLabel1(), gridbagconstraints);
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
                ivjJLabel1.setText("<html><body><p><font color=\"#FF0000\" size=\"5\">MQJExplorer</font></p>\n<p>This version has expired.&nbsp; Please obtain<br>\nthe latest version of this tool.</p>\n<p>See <a href=\"http://www.kolban.com/mqjexplorer\">\nhttp://www.kolban.com/mqjexplorer</a></p>\n<p>&nbsp;</p>\n<p>Neil Kolban: <a href=\"mailto:kolban@kolban.com\">kolban@kolban.com</a></p>\n<hr></body></html>");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("ExpiredDlg");
            setDefaultCloseOperation(2);
            setTitle("Expired MQJExplorer");
            setSize(291, 222);
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
            ExpiredDlg expireddlg = new ExpiredDlg();
            expireddlg.setModal(true);
            expireddlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            expireddlg.show();
            Insets insets = expireddlg.getInsets();
            expireddlg.setSize(expireddlg.getWidth() + insets.left + insets.right, expireddlg.getHeight() + insets.top + insets.bottom);
            expireddlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
}
