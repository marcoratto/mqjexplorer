// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TransportType.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class TransportType extends JComboBox
{

    public TransportType()
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
            return 2;

        case 2: // '\002'
            return 3;

        case 3: // '\003'
            return 4;

        case 4: // '\004'
            return 5;

        case 5: // '\005'
            return 6;
        }
        return 0;
    }

    private void init()
    {
        addItem("LU6.2");
        addItem("TCP/IP");
        addItem("NetBios");
        addItem("SPX");
        addItem("DecNet");
        addItem("UDP");
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case 1: // '\001'
            setSelectedIndex(0);
            return;

        case 2: // '\002'
            setSelectedIndex(1);
            return;

        case 3: // '\003'
            setSelectedIndex(2);
            return;

        case 4: // '\004'
            setSelectedIndex(3);
            return;

        case 5: // '\005'
            setSelectedIndex(4);
            return;

        case 6: // '\006'
            setSelectedIndex(5);
            return;
        }
    }

    public static String toString(int i)
    {
        switch(i)
        {
        case 1: // '\001'
            return "LU 6.2";

        case 2: // '\002'
            return "TCP/IP";

        case 3: // '\003'
            return "NetBios";

        case 4: // '\004'
            return "SPX";

        case 5: // '\005'
            return "DecNet";

        case 6: // '\006'
            return "UDP";
        }
        return "** Unknown **";
    }
}
