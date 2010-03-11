// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QType_SAVE.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class QType_SAVE extends JComboBox
{

    public QType_SAVE()
    {
        init();
    }

    public int getValue()
    {
        switch(getSelectedIndex())
        {
        case 0: // '\0'
            return 3;

        case 1: // '\001'
            return 7;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 6;

        case 4: // '\004'
            return 2;
        }
        return 0;
    }

    private void init()
    {
        addItem("Alias");
        addItem("Cluster");
        addItem("Local");
        addItem("Remote");
        addItem("Model");
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case 3: // '\003'
            setSelectedIndex(0);
            return;

        case 7: // '\007'
            setSelectedIndex(1);
            return;

        case 1: // '\001'
            setSelectedIndex(2);
            return;

        case 6: // '\006'
            setSelectedIndex(3);
            return;

        case 2: // '\002'
            setSelectedIndex(4);
            return;

        case 4: // '\004'
        case 5: // '\005'
        default:
            return;
        }
    }
}
