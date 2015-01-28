// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DefInputOpenOption.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class DefInputOpenOption extends JComboBox
{

    public DefInputOpenOption()
    {
        init();
    }

    public int getValue()
    {
        switch(getSelectedIndex())
        {
        case 1: // '\001'
            return 2;

        case 0: // '\0'
            return 4;
        }
        return 0;
    }

    private void init()
    {
        addItem("Exclusive");
        addItem("Shared");
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case 4: // '\004'
            setSelectedIndex(0);
            return;

        case 2: // '\002'
            setSelectedIndex(1);
            return;

        case 3: // '\003'
        default:
            return;
        }
    }
}
