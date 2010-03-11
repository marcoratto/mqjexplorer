// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FlowControlDlg.java

package com.kolban.mqjexplorer.beans;

import com.kolban.swing.NumericTextField;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class FlowControlDlg extends JDialog
{

    public FlowControlDlg()
    {
        ivjClose = null;
        ivjCount = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjJTextField3 = null;
        ivjStart = null;
        initialize();
    }

    public FlowControlDlg(Dialog dialog)
    {
        super(dialog);
        ivjClose = null;
        ivjCount = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjJTextField3 = null;
        ivjStart = null;
    }

    public FlowControlDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjClose = null;
        ivjCount = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjJTextField3 = null;
        ivjStart = null;
    }

    public FlowControlDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjClose = null;
        ivjCount = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjJTextField3 = null;
        ivjStart = null;
    }

    public FlowControlDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjClose = null;
        ivjCount = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjJTextField3 = null;
        ivjStart = null;
    }

    public FlowControlDlg(Frame frame)
    {
        super(frame);
        ivjClose = null;
        ivjCount = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjJTextField3 = null;
        ivjStart = null;
    }

    public FlowControlDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjClose = null;
        ivjCount = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjJTextField3 = null;
        ivjStart = null;
    }

    public FlowControlDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjClose = null;
        ivjCount = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjJTextField3 = null;
        ivjStart = null;
    }

    public FlowControlDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjClose = null;
        ivjCount = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjJTextField1 = null;
        ivjJTextField2 = null;
        ivjJTextField3 = null;
        ivjStart = null;
    }

    private JButton getClose()
    {
        if(ivjClose == null)
            try
            {
                ivjClose = new JButton();
                ivjClose.setName("Close");
                ivjClose.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClose;
    }

    private NumericTextField getCount()
    {
        if(ivjCount == null)
            try
            {
                ivjCount = new NumericTextField();
                ivjCount.setName("Count");
                ivjCount.setColumns(6);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCount;
    }

    private JPanel getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new JPanel();
                ivjFooter.setName("Footer");
                ivjFooter.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getFooter().add(getJSeparator1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getFooter().add(getJPanel2(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
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
                gridbagconstraints.gridy = 1;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints1);
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
                ivjJLabel1.setText("Input Queue:");
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
                ivjJLabel2.setText("Output Queue:");
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
                ivjJLabel3.setText("Trigger Queue:");
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
                ivjJLabel4.setText("Count:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel4;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel3(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJTextField1(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 1;
                gridbagconstraints4.gridy = 1;
                gridbagconstraints4.fill = 2;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJTextField2(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 2;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.weightx = 1.0D;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJTextField3(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 3;
                gridbagconstraints6.anchor = 17;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel4(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 1;
                gridbagconstraints7.gridy = 3;
                gridbagconstraints7.anchor = 17;
                gridbagconstraints7.weightx = 1.0D;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getCount(), gridbagconstraints7);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JPanel getJPanel2()
    {
        if(ivjJPanel2 == null)
            try
            {
                ivjJPanel2 = new JPanel();
                ivjJPanel2.setName("JPanel2");
                ivjJPanel2.setLayout(getJPanel2FlowLayout());
                getJPanel2().add(getStart(), getStart().getName());
                getJPanel2().add(getClose(), getClose().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
    }

    private FlowLayout getJPanel2FlowLayout()
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

    private JTextField getJTextField3()
    {
        if(ivjJTextField3 == null)
            try
            {
                ivjJTextField3 = new JTextField();
                ivjJTextField3.setName("JTextField3");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField3;
    }

    private JButton getStart()
    {
        if(ivjStart == null)
            try
            {
                ivjStart = new JButton();
                ivjStart.setName("Start");
                ivjStart.setText("Start");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStart;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("FlowControlDlg");
            setDefaultCloseOperation(2);
            setTitle("Flow Control");
            setSize(335, 240);
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
            FlowControlDlg flowcontroldlg = new FlowControlDlg();
            flowcontroldlg.setModal(true);
            flowcontroldlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            flowcontroldlg.show();
            Insets insets = flowcontroldlg.getInsets();
            flowcontroldlg.setSize(flowcontroldlg.getWidth() + insets.left + insets.right, flowcontroldlg.getHeight() + insets.top + insets.bottom);
            flowcontroldlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private JButton ivjClose;
    private NumericTextField ivjCount;
    private JPanel ivjFooter;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JPanel ivjJPanel1;
    private JPanel ivjJPanel2;
    private FlowLayout ivjJPanel2FlowLayout;
    private JSeparator ivjJSeparator1;
    private JTextField ivjJTextField1;
    private JTextField ivjJTextField2;
    private JTextField ivjJTextField3;
    private JButton ivjStart;
}
