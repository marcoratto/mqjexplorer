// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JMSTransport.java

package com.kolban.mqjexplorer.mqattributes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;

public class JMSTransport extends JPanel
{
    class IvjEventHandler
        implements PropertyChangeListener
    {

        public void propertyChange(PropertyChangeEvent propertychangeevent)
        {
            if(propertychangeevent.getSource() == JMSTransport.this)
                connPtoP1SetTarget();
            if(propertychangeevent.getSource() == JMSTransport.this)
                connPtoP2SetTarget();
        }

        IvjEventHandler()
        {
        }
    }


    public JMSTransport()
    {
        ivjGroup1 = null;
        ivjBind = null;
        ivjClient = null;
        ivjEventHandler = new IvjEventHandler();
        initialize();
    }

    public JMSTransport(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjGroup1 = null;
        ivjBind = null;
        ivjClient = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public JMSTransport(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjGroup1 = null;
        ivjBind = null;
        ivjClient = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public JMSTransport(boolean flag)
    {
        super(flag);
        ivjGroup1 = null;
        ivjBind = null;
        ivjClient = null;
        ivjEventHandler = new IvjEventHandler();
    }

    private void connPtoP1SetTarget()
    {
        try
        {
            getBind().setEnabled(isEnabled());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connPtoP2SetTarget()
    {
        try
        {
            getClient().setEnabled(isEnabled());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JRadioButton getBind()
    {
        if(ivjBind == null)
            try
            {
                ivjBind = new JRadioButton();
                ivjBind.setName("Bind");
                ivjBind.setText("Bind");
                getGroup1().add(ivjBind);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBind;
    }

    private JRadioButton getClient()
    {
        if(ivjClient == null)
            try
            {
                ivjClient = new JRadioButton();
                ivjClient.setName("Client");
                ivjClient.setText("Client");
                getGroup1().add(ivjClient);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClient;
    }

    private ButtonGroup getGroup1()
    {
        if(ivjGroup1 == null)
            try
            {
                ivjGroup1 = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjGroup1;
    }

    public int getValue()
    {
        return !getBind().isSelected() ? 1 : 0;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        addPropertyChangeListener(ivjEventHandler);
        connPtoP1SetTarget();
        connPtoP2SetTarget();
    }

    private void initialize()
    {
        try
        {
            setName("JMSTransport");
            setLayout(new GridBagLayout());
            setSize(123, 30);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.anchor = 17;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getBind(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 1;
            gridbagconstraints1.gridy = 0;
            gridbagconstraints1.anchor = 17;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getClient(), gridbagconstraints1);
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
            JMSTransport jmstransport = new JMSTransport();
            jframe.setContentPane(jmstransport);
            jframe.setSize(jmstransport.getSize());
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

    public void setValue(int i)
    {
        if(i == 0)
            getBind().setSelected(true);
        else
            getClient().setSelected(true);
    }

    private ButtonGroup ivjGroup1;
    private JRadioButton ivjBind;
    private JRadioButton ivjClient;
    IvjEventHandler ivjEventHandler;


}
