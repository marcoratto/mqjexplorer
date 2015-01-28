// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Platform.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JTextField;

public class Platform extends JTextField
{

    public Platform()
    {
        setColumns(20);
        setEditable(false);
    }

    public int getValue()
    {
        return platform;
    }

    public void setValue(int i)
    {
        platform = platform;
        switch(i)
        {
        case 4: // '\004'
            setText("OS/400");
            return;

        case 2: // '\002'
            setText("OS/2");
            return;

        case 3: // '\003'
            setText("Unix systems");
            return;

        case 11: // '\013'
            setText("Windows NT");
            return;

        case 13: // '\r'
            setText("Tandem NonStop Kernel");
            return;

        case 12: // '\f'
            setText("Compaq (DIGITAL) OpenVMS");
            return;

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        default:
            setText("Unknown");
            return;
        }
    }

    int platform;
}
