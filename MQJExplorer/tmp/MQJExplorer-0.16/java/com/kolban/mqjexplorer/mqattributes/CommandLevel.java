// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CommandLevel.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JTextField;

public class CommandLevel extends JTextField
{

    public CommandLevel()
    {
        setColumns(20);
        setEditable(false);
    }

    public int getValue()
    {
        return commandLevel;
    }

    public void setValue(int i)
    {
        commandLevel = i;
        setText(Integer.toString(i));
    }

    int commandLevel;
}
