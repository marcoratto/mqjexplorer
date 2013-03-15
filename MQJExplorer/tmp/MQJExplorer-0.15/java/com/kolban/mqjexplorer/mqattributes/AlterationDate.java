// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AlterationDate.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JTextField;

public class AlterationDate extends JTextField
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -4274656575228990564L;

	public AlterationDate()
    {
        setColumns(20);
    }

    public String getValue()
    {
        return getText();
    }

    public void setValue(String s)
    {
        setText(s);
    }

    public static String toString(String s)
    {
        return s.trim();
    }
}
