// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Footer.java

package com.kolban.swing;

import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;
import javax.swing.*;

// Referenced classes of package com.kolban.swing:
//            FooterListenerEventMulticaster, FooterListener

public class Footer extends JPanel
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getOK())
                connEtoC3(actionevent);
            if(actionevent.getSource() == getCancel())
                connEtoC1(actionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public Footer()
    {
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        fieldFooterListenerEventMulticaster = null;
        initialize();
    }

    public Footer(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        fieldFooterListenerEventMulticaster = null;
    }

    public Footer(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        fieldFooterListenerEventMulticaster = null;
    }

    public Footer(boolean flag)
    {
        super(flag);
        ivjCancel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        fieldFooterListenerEventMulticaster = null;
    }

    public void addFooterListener(FooterListener footerlistener)
    {
        fieldFooterListenerEventMulticaster = FooterListenerEventMulticaster.add(fieldFooterListenerEventMulticaster, footerlistener);
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            fireCancel(new EventObject(this));
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(ActionEvent actionevent)
    {
        try
        {
            fireOk(new EventObject(this));
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    protected void fireCancel(EventObject eventobject)
    {
        if(fieldFooterListenerEventMulticaster == null)
        {
            return;
        } else
        {
            fieldFooterListenerEventMulticaster.cancel(eventobject);
            return;
        }
    }

    protected void fireOk(EventObject eventobject)
    {
        if(fieldFooterListenerEventMulticaster == null)
        {
            return;
        } else
        {
            fieldFooterListenerEventMulticaster.ok(eventobject);
            return;
        }
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

    public boolean getCancelEnabled()
    {
        return getCancel().isEnabled();
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

    public boolean getOKEnabled()
    {
        return getOK().isEnabled();
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getOK().addActionListener(ivjEventHandler);
        getCancel().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("Footer");
            setLayout(new GridBagLayout());
            setSize(460, 120);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.fill = 2;
            gridbagconstraints.weightx = 1.0D;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJSeparator1(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 1;
            gridbagconstraints1.fill = 2;
            gridbagconstraints1.weightx = 1.0D;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints1);
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
            JFrame jframe = new JFrame();
            Footer footer = new Footer();
            jframe.setContentPane(footer);
            jframe.setSize(footer.getSize());
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

    public void removeFooterListener(FooterListener footerlistener)
    {
        fieldFooterListenerEventMulticaster = FooterListenerEventMulticaster.remove(fieldFooterListenerEventMulticaster, footerlistener);
    }

    public void setCancelEnabled(boolean flag)
    {
        getCancel().setEnabled(flag);
    }

    public void setOKEnabled(boolean flag)
    {
        getOK().setEnabled(flag);
    }

    private JButton ivjCancel;
    IvjEventHandler ivjEventHandler;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JSeparator ivjJSeparator1;
    private JButton ivjOK;
    protected transient FooterListener fieldFooterListenerEventMulticaster;




}
