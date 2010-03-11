// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelStatus.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class ChannelStatus extends JComboBox
{

    public ChannelStatus()
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
            return 8;

        case 4: // '\004'
            return 4;

        case 5: // '\005'
            return 5;

        case 6: // '\006'
            return 6;

        case 7: // '\007'
            return 7;

        case 8: // '\b'
            return 13;

        case 9: // '\t'
            return 0;
        }
        return 0;
    }

    private void init()
    {
        addItem("Binding");
        addItem("Staring");
        addItem("Running");
        addItem("Paused");
        addItem("Stopping");
        addItem("Retrying");
        addItem("Stopped");
        addItem("Requesting");
        addItem("Initialzing");
        addItem("Inactive");
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

        case 8: // '\b'
            setSelectedIndex(3);
            return;

        case 4: // '\004'
            setSelectedIndex(4);
            return;

        case 5: // '\005'
            setSelectedIndex(5);
            return;

        case 6: // '\006'
            setSelectedIndex(6);
            return;

        case 7: // '\007'
            setSelectedIndex(7);
            return;

        case 13: // '\r'
            setSelectedIndex(8);
            return;

        case 0: // '\0'
            setSelectedIndex(9);
            return;

        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        default:
            return;
        }
    }

    public static String toString(int i)
    {
        switch(i)
        {
        case 1: // '\001'
            return "Binding";

        case 2: // '\002'
            return "Starting";

        case 3: // '\003'
            return "Running";

        case 8: // '\b'
            return "Paused";

        case 4: // '\004'
            return "Stopping";

        case 5: // '\005'
            return "Retrying";

        case 6: // '\006'
            return "Stopped";

        case 7: // '\007'
            return "Requesting";

        case 13: // '\r'
            return "Initializing";

        case 0: // '\0'
            return "Inactive";

        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        default:
            return "** Unknown **";
        }
    }
}
