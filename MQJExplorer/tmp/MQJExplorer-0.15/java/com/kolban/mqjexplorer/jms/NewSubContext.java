// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NewSubContext.java

package com.kolban.mqjexplorer.jms;

import com.kolban.swing.Footer;
import com.kolban.swing.FooterListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.EventObject;
import javax.swing.*;

public class NewSubContext extends JDialog
{
    class IvjEventHandler
        implements FooterListener
    {

        public void cancel(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC1(eventobject);
        }

        public void ok(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC2(eventobject);
        }

        IvjEventHandler()
        {
        }
    }


    public NewSubContext()
    {
        ivjContextName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        rc = 0;
        ivjEventHandler = new IvjEventHandler();
        subContextName = null;
        initialize();
    }

    public NewSubContext(Dialog dialog)
    {
        super(dialog);
        ivjContextName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        rc = 0;
        ivjEventHandler = new IvjEventHandler();
        subContextName = null;
    }

    public NewSubContext(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjContextName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        rc = 0;
        ivjEventHandler = new IvjEventHandler();
        subContextName = null;
    }

    public NewSubContext(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjContextName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        rc = 0;
        ivjEventHandler = new IvjEventHandler();
        subContextName = null;
    }

    public NewSubContext(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjContextName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        rc = 0;
        ivjEventHandler = new IvjEventHandler();
        subContextName = null;
    }

    public NewSubContext(Frame frame)
    {
        super(frame);
        ivjContextName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        rc = 0;
        ivjEventHandler = new IvjEventHandler();
        subContextName = null;
    }

    public NewSubContext(Frame frame, String s)
    {
        super(frame, s);
        ivjContextName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        rc = 0;
        ivjEventHandler = new IvjEventHandler();
        subContextName = null;
    }

    public NewSubContext(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjContextName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        rc = 0;
        ivjEventHandler = new IvjEventHandler();
        subContextName = null;
    }

    public NewSubContext(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjContextName = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        rc = 0;
        ivjEventHandler = new IvjEventHandler();
        subContextName = null;
    }

    public void cancel()
    {
        rc = 2;
        dispose();
    }

    private void connEtoC1(EventObject eventobject)
    {
        try
        {
            cancel();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(EventObject eventobject)
    {
        try
        {
            ok();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JTextField getContextName()
    {
        if(ivjContextName == null)
            try
            {
                ivjContextName = new JTextField();
                ivjContextName.setName("ContextName");
                ivjContextName.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjContextName;
    }

    private Footer getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new Footer();
                ivjFooter.setName("Footer");
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
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints1);
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
                ivjJLabel1.setText("Context Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
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
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getContextName(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    public int getRc()
    {
        return rc;
    }

    public String getSubContextName()
    {
        return subContextName;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getFooter().addFooterListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("NewSubContext");
            setDefaultCloseOperation(2);
            setResizable(false);
            setSize(426, 240);
            setModal(true);
            setTitle("New Context");
            setContentPane(getJDialogContentPane());
            initConnections();
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
            NewSubContext newsubcontext = new NewSubContext();
            newsubcontext.setModal(true);
            newsubcontext.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            newsubcontext.show();
            Insets insets = newsubcontext.getInsets();
            newsubcontext.setSize(newsubcontext.getWidth() + insets.left + insets.right, newsubcontext.getHeight() + insets.top + insets.bottom);
            newsubcontext.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void ok()
    {
        rc = 1;
        subContextName = getContextName().getText().trim();
        dispose();
    }

    private JTextField ivjContextName;
    private Footer ivjFooter;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JPanel ivjJPanel1;
    public static final int OK = 1;
    public static final int CANCEL = 2;
    private int rc;
    IvjEventHandler ivjEventHandler;
    private String subContextName;



}
