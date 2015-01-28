// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TriggerType.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class TriggerType extends JComboBox
{

    public TriggerType()
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

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
        return 0;
    }

    private void init()
    {
        addItem("None");
        addItem("First");
        addItem("Every");
        addItem("Depth");
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

        case 2: // '\002'
            setSelectedIndex(2);
            return;

        case 3: // '\003'
            setSelectedIndex(3);
            return;
        }
    }
}
