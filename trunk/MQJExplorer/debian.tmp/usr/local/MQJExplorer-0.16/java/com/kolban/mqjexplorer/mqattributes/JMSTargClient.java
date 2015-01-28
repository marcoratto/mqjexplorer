// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JMSTargClient.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class JMSTargClient extends JComboBox
{

    public JMSTargClient()
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
        addItem("JMS Compliant");
        addItem("Non-JMS MQ");
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
