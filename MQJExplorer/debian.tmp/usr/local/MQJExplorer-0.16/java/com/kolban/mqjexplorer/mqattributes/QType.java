// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QType.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JTextField;

public class QType extends JTextField
{

    public QType()
    {
        setColumns(20);
        setEditable(false);
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case 3: // '\003'
            setText("Alias");
            return;

        case 1: // '\001'
            setText("Local");
            return;

        case 2: // '\002'
            setText("Model");
            return;

        case 6: // '\006'
            setText("Remote");
            return;

        case 4: // '\004'
        case 5: // '\005'
        default:
            setText(">??");
            return;
        }
    }
}
