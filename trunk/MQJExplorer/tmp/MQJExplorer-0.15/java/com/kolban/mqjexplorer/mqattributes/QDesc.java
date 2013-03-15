// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QDesc.java

package com.kolban.mqjexplorer.mqattributes;

import com.kolban.utils.StringUtils;
import javax.swing.JTextField;

public class QDesc extends JTextField
{

    public QDesc()
    {
        setColumns(20);
    }

    public String getValue()
    {
        return StringUtils.pad(getText(), 64);
    }

    public void setValue(String s)
    {
        setText(s.trim());
    }
}
