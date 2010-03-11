// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TextIcon.java

package com.kolban.mqjexplorer;

import javax.swing.Icon;

public class TextIcon
    implements Comparable
{

    public TextIcon()
    {
    }

    public Icon getIcon()
    {
        return icon;
    }

    public String getText()
    {
        return text;
    }

    public void setIcon(Icon icon1)
    {
        icon = icon1;
    }

    public void setText(String s)
    {
        text = s;
    }

    public int compareTo(Object obj)
    {
        TextIcon texticon = (TextIcon)obj;
        return getText().compareTo(texticon.getText());
    }

    private String text;
    private Icon icon;
}
