// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AlterationTime.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JTextField;

public class AlterationTime extends JTextField
{

    public AlterationTime()
    {
        setColumns(20);
    }

    public String getValue()
    {
        return getText();
    }

    public void setValue(String s)
    {
        setText(s);
    }

    public static String toString(String s)
    {
        return s.trim();
    }
}
