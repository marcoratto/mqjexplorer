// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JMSExpiry.java

package com.kolban.mqjexplorer.mqattributes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;
import javax.swing.*;

public class JMSExpiry extends JComboBox
{

    public JMSExpiry()
    {
        initialize();
    }

    public JMSExpiry(Object aobj[])
    {
        super(aobj);
    }

    public JMSExpiry(Vector vector)
    {
        super(vector);
    }

    public JMSExpiry(ComboBoxModel comboboxmodel)
    {
        super(comboboxmodel);
    }

    public long getValue()
    {
        String s = (String)getSelectedItem();
        if(s.equals("App"))
            return -2L;
        if(s.equals("Unlimited"))
            return 0L;
        else
            return Long.parseLong(s);
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            addItem("App");
            addItem("Unlimited");
            setName("JMSExpiry");
            setSize(130, 23);
            setEditable(true);
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
            JMSExpiry jmsexpiry = new JMSExpiry();
            jframe.setContentPane(jmsexpiry);
            jframe.setSize(jmsexpiry.getSize());
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
            System.err.println("Exception occurred in main() of com.kolban.mqjexplorer.mqattributes.JMSExpiry");
            throwable.printStackTrace(System.out);
        }
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case -2: 
            setSelectedItem("App");
            return;

        case 0: // '\0'
            setSelectedItem("Unlimited");
            return;

        case -1: 
        default:
            setSelectedItem(Integer.toString(i));
            return;
        }
    }

    public void setValue(long l)
    {
        switch((int)l)
        {
        case -2: 
            setSelectedItem("App");
            return;

        case 0: // '\0'
            setSelectedItem("Unlimited");
            return;

        case -1: 
        default:
            setSelectedItem(Integer.toString((int)l));
            return;
        }
    }
}
