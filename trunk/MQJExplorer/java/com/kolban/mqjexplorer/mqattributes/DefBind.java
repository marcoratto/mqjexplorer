// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DefBind.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class DefBind extends JComboBox
{

    public DefBind()
    {
        init();
    }

    public int getValue()
    {
        switch(getSelectedIndex())
        {
        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 1;
        }
        return 0;
    }

    private void init()
    {
        addItem("On Open");
        addItem("Not Fixed");
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case 0: // '\0'
            setSelectedIndex(0);
            return;

        case 1: // '\001'
            setSelectedIndex(1);
            return;
        }
    }
}
