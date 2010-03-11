// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelType.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JTextField;

public class ChannelType extends JTextField
{

    public ChannelType()
    {
        value = 0;
        init();
    }

    public int getValue()
    {
        return value;
    }

    private void init()
    {
        setEditable(false);
    }

    public void setValue(int i)
    {
        value = i;
        switch(i)
        {
        case 1: // '\001'
            setText("Sender");
            return;

        case 2: // '\002'
            setText("Server");
            return;

        case 3: // '\003'
            setText("Receiver");
            return;

        case 4: // '\004'
            setText("Requester");
            return;

        case 7: // '\007'
            setText("Server Connection");
            return;

        case 8: // '\b'
            setText("Cluster Receiver");
            return;

        case 9: // '\t'
            setText("Cluster Sender");
            return;

        case 5: // '\005'
        case 6: // '\006'
        default:
            return;
        }
    }

    public static String toString(int i)
    {
        switch(i)
        {
        case 1: // '\001'
            return "Sender";

        case 2: // '\002'
            return "Server";

        case 3: // '\003'
            return "Receiver";

        case 4: // '\004'
            return "Requestor";

        case 7: // '\007'
            return "Server Connection";

        case 8: // '\b'
            return "Cluster Receiver";

        case 9: // '\t'
            return "Cluster Sender";

        case 5: // '\005'
        case 6: // '\006'
        default:
            return "** Unknown **";
        }
    }

    private int value;
}
