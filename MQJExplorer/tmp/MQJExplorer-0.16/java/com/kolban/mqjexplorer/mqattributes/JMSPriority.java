// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JMSPriority.java

package com.kolban.mqjexplorer.mqattributes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;
import javax.swing.*;

public class JMSPriority extends JComboBox
{

    public JMSPriority()
    {
        initialize();
    }

    public JMSPriority(Object aobj[])
    {
        super(aobj);
    }

    public JMSPriority(Vector vector)
    {
        super(vector);
    }

    public JMSPriority(ComboBoxModel comboboxmodel)
    {
        super(comboboxmodel);
    }

    public int getValue()
    {
        String s = (String)getSelectedItem();
        if(s.equals("App"))
            return -2;
        if(s.equals("QDef"))
            return -1;
        else
            return Integer.parseInt(s);
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            addItem("App");
            addItem("QDef");
            setName("JMSPriority");
            setSize(121, 23);
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
            JMSPriority jmspriority = new JMSPriority();
            jframe.setContentPane(jmspriority);
            jframe.setSize(jmspriority.getSize());
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
            System.err.println("Exception occurred in main() of com.kolban.mqjexplorer.mqattributes.JMSPriority");
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

        case -1: 
            setSelectedItem("QDef");
            return;
        }
        setSelectedItem(Integer.toString(i));
    }
}
