// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SwingUtils.java

package com.kolban.swing;

import java.awt.*;
import java.awt.event.ComponentEvent;
import javax.swing.JTextArea;

public class SwingUtils
{

    public SwingUtils()
    {
    }

    public static void constrainResize(ComponentEvent componentevent)
    {
        Component component = componentevent.getComponent();
        Dimension dimension = component.getSize();
        Dimension dimension1 = component.getMinimumSize();
        Dimension dimension2 = new Dimension(dimension);
        boolean flag = false;
        if(dimension.width < dimension1.width)
        {
            flag = true;
            dimension2.width = dimension1.width;
        }
        if(dimension.height < dimension1.height)
        {
            flag = true;
            dimension2.height = dimension1.height;
        }
        if(flag)
            component.setSize(dimension2);
    }

    public static void enableAll(Container container, boolean flag)
    {
        if(container == null)
            return;
        container.setEnabled(flag);
        Component acomponent[] = container.getComponents();
        if(acomponent == null)
            return;
        for(int i = 0; i < acomponent.length; i++)
            if(acomponent[i] instanceof Container)
                enableAll((Container)acomponent[i], flag);
            else
                acomponent[i].setEnabled(flag);

    }

    public static void setCaretPosition(int i, int j, JTextArea jtextarea)
    {
        if(i < 0 || j < 0)
            return;
        StringBuffer stringbuffer = new StringBuffer(jtextarea.getText());
        int k = 0;
        int l;
        for(l = stringbuffer.length(); i > 0 && k < l; k++)
            if(stringbuffer.charAt(k) == '\n')
                i--;

        if(i > 0)
            return;
        k += j;
        if(k > l)
            k = l;
        jtextarea.setCaretPosition(k);
    }

    public static void setCenter(Component component, Component component1)
    {
        Point point;
        Dimension dimension;
        if(component != null)
        {
            point = component.getLocation();
            dimension = component.getSize();
        } else
        {
            dimension = Toolkit.getDefaultToolkit().getScreenSize();
            point = new Point(0, 0);
        }
        Dimension dimension1 = Toolkit.getDefaultToolkit().getScreenSize();
        point.setLocation((double)point.x + dimension.getWidth() / 2D, (double)point.y + dimension.getHeight() / 2D);
        Point point1 = new Point(point.x - component1.getWidth() / 2, point.y - component1.getHeight() / 2);
        if(point1.y < 0)
            point1.y = 0;
        if(point1.x < 0)
            point1.y = 0;
        if(point1.x + component1.getWidth() > dimension1.width)
            point1.x = dimension1.width - component1.getWidth();
        if(point1.y + component1.getHeight() > dimension1.height)
            point1.y = dimension1.height - component1.getHeight();
        component1.setLocation(point1);
    }
}
