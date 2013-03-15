// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JMSPersistence.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class JMSPersistence extends JComboBox
{

    public JMSPersistence()
    {
        init();
    }

    public int getValue()
    {
        switch(getSelectedIndex())
        {
        case 0: // '\0'
            return -2;

        case 1: // '\001'
            return -1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 1;
        }
        return 0;
    }

    private void init()
    {
        addItem("APP");
        addItem("QDEF");
        addItem("PERS");
        addItem("NON");
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case -2: 
            setSelectedIndex(0);
            return;

        case -1: 
            setSelectedIndex(1);
            return;

        case 2: // '\002'
            setSelectedIndex(2);
            return;

        case 1: // '\001'
            setSelectedIndex(3);
            return;

        case 0: // '\0'
        default:
            return;
        }
    }
}
