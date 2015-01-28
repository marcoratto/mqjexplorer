// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StartStopEvent.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class StartStopEvent extends JComboBox
{

    public StartStopEvent()
    {
        init();
    }

    public int getValue()
    {
        switch(getSelectedIndex())
        {
        case 0: // '\0'
            return 1;

        case 1: // '\001'
            return 0;
        }
        return 0;
    }

    private void init()
    {
        addItem("Enabled");
        addItem("Disabled");
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case 1: // '\001'
            setSelectedIndex(0);
            return;

        case 0: // '\0'
            setSelectedIndex(1);
            return;
        }
    }
}
