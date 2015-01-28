// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DefinitionType.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class DefinitionType extends JComboBox
{

    public DefinitionType()
    {
        init();
    }

    private void init()
    {
        addItem("Permanent");
        addItem("Temporary");
    }

    public int getValue()
    {
        switch(getSelectedIndex())
        {
        case 0: // '\0'
            return 3;

        case 1: // '\001'
            return 2;
        }
        return 0;
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case 3: // '\003'
            setSelectedIndex(0);
            return;

        case 2: // '\002'
            setSelectedIndex(1);
            return;
        }
    }
}
