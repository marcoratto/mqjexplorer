// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BlankIcon.java

package com.kolban.swing.table;

import java.awt.*;
import javax.swing.Icon;

public class BlankIcon
    implements Icon
{

    public BlankIcon()
    {
        this(null, 11);
    }

    public BlankIcon(Color color, int i)
    {
        fillColor = color;
        size = i;
    }

    public int getIconHeight()
    {
        return size;
    }

    public int getIconWidth()
    {
        return size;
    }

    public void paintIcon(Component component, Graphics g, int i, int j)
    {
        if(fillColor != null)
        {
            g.setColor(fillColor);
            g.drawRect(i, j, size - 1, size - 1);
        }
    }

    private Color fillColor;
    private int size;
}
