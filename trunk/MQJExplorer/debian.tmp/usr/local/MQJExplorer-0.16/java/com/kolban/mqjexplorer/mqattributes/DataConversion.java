// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataConversion.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class DataConversion extends JComboBox
{

    public DataConversion()
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
        addItem("No Sender Conversion");
        addItem("Sender Conversion");
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

    public static String toString(int i)
    {
        switch(i)
        {
        case 0: // '\0'
            return "No sender conversion";

        case 1: // '\001'
            return "Sender conversion";
        }
        return "** Unknown **";
    }
}
