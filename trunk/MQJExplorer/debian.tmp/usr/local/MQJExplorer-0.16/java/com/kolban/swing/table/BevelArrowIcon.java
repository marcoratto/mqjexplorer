// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BevelArrowIcon.java

package com.kolban.swing.table;

import java.awt.*;
import javax.swing.Icon;
import javax.swing.UIManager;

public class BevelArrowIcon
    implements Icon
{

    public BevelArrowIcon(int i, boolean flag, boolean flag1)
    {
        if(flag)
        {
            if(flag1)
                init(UIManager.getColor("controlLtHighlight"), UIManager.getColor("controlDkShadow"), UIManager.getColor("controlShadow"), 11, i);
            else
                init(UIManager.getColor("controlHighlight"), UIManager.getColor("controlShadow"), UIManager.getColor("control"), 11, i);
        } else
        if(flag1)
            init(UIManager.getColor("controlDkShadow"), UIManager.getColor("controlLtHighlight"), UIManager.getColor("controlShadow"), 11, i);
        else
            init(UIManager.getColor("controlShadow"), UIManager.getColor("controlHighlight"), UIManager.getColor("control"), 11, i);
    }

    public BevelArrowIcon(Color color, Color color1, Color color2, int i, int j)
    {
        init(color, color1, color2, i, j);
    }

    private void drawDownArrow(Graphics g, int i, int j)
    {
        g.setColor(edge1);
        g.drawLine(i, j, (i + size) - 1, j);
        g.drawLine(i, j + 1, (i + size) - 3, j + 1);
        g.setColor(edge2);
        g.drawLine((i + size) - 2, j + 1, (i + size) - 1, j + 1);
        int k = i + 1;
        int l = j + 2;
        for(int i1 = size - 6; l + 1 < j + size; i1 -= 2)
        {
            g.setColor(edge1);
            g.drawLine(k, l, k + 1, l);
            g.drawLine(k, l + 1, k + 1, l + 1);
            if(i1 > 0)
            {
                g.setColor(fill);
                g.drawLine(k + 2, l, k + 1 + i1, l);
                g.drawLine(k + 2, l + 1, k + 1 + i1, l + 1);
            }
            g.setColor(edge2);
            g.drawLine(k + i1 + 2, l, k + i1 + 3, l);
            g.drawLine(k + i1 + 2, l + 1, k + i1 + 3, l + 1);
            k++;
            l += 2;
        }

        g.setColor(edge1);
        g.drawLine(i + size / 2, (j + size) - 1, i + size / 2, (j + size) - 1);
    }

    private void drawUpArrow(Graphics g, int i, int j)
    {
        g.setColor(edge1);
        int k = i + size / 2;
        g.drawLine(k, j, k, j);
        k--;
        int l = j + 1;
        for(int i1 = 0; l + 3 < j + size; i1 += 2)
        {
            g.setColor(edge1);
            g.drawLine(k, l, k + 1, l);
            g.drawLine(k, l + 1, k + 1, l + 1);
            if(i1 > 0)
            {
                g.setColor(fill);
                g.drawLine(k + 2, l, k + 1 + i1, l);
                g.drawLine(k + 2, l + 1, k + 1 + i1, l + 1);
            }
            g.setColor(edge2);
            g.drawLine(k + i1 + 2, l, k + i1 + 3, l);
            g.drawLine(k + i1 + 2, l + 1, k + i1 + 3, l + 1);
            k--;
            l += 2;
        }

        g.setColor(edge1);
        g.drawLine(i, (j + size) - 3, i + 1, (j + size) - 3);
        g.setColor(edge2);
        g.drawLine(i + 2, (j + size) - 2, (i + size) - 1, (j + size) - 2);
        g.drawLine(i, (j + size) - 1, i + size, (j + size) - 1);
    }

    public int getIconHeight()
    {
        return size;
    }

    public int getIconWidth()
    {
        return size;
    }

    private void init(Color color, Color color1, Color color2, int i, int j)
    {
        edge1 = color;
        edge2 = color1;
        fill = color2;
        size = i;
        direction = j;
    }

    public void paintIcon(Component component, Graphics g, int i, int j)
    {
        switch(direction)
        {
        case 1: // '\001'
            drawDownArrow(g, i, j);
            break;

        case 0: // '\0'
            drawUpArrow(g, i, j);
            break;
        }
    }

    public static final int UP = 0;
    public static final int DOWN = 1;
    private static final int DEFAULT_SIZE = 11;
    private Color edge1;
    private Color edge2;
    private Color fill;
    private int size;
    private int direction;
}
