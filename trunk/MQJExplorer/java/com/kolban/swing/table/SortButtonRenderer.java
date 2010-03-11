// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SortButtonRenderer.java

package com.kolban.swing.table;

import java.awt.Component;
import java.awt.Insets;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;

// Referenced classes of package com.kolban.swing.table:
//            BlankIcon, BevelArrowIcon

public class SortButtonRenderer extends JButton
    implements TableCellRenderer
{

    public SortButtonRenderer()
    {
        pushedColumn = -1;
        state = new Hashtable();
        setMargin(new Insets(0, 0, 0, 0));
        setHorizontalTextPosition(2);
        setIcon(new BlankIcon());
        downButton = new JButton();
        downButton.setMargin(new Insets(0, 0, 0, 0));
        downButton.setHorizontalTextPosition(2);
        downButton.setIcon(new BevelArrowIcon(1, false, false));
        downButton.setPressedIcon(new BevelArrowIcon(1, false, true));
        downButton.setMinimumSize(downButton.getPreferredSize());
        upButton = new JButton();
        upButton.setMargin(new Insets(0, 0, 0, 0));
        upButton.setHorizontalTextPosition(2);
        upButton.setIcon(new BevelArrowIcon(0, false, false));
        upButton.setPressedIcon(new BevelArrowIcon(0, false, true));
        upButton.setMinimumSize(upButton.getPreferredSize());
    }

    public int getState(int i)
    {
        Object obj = state.get(new Integer(i));
        byte byte0;
        if(obj == null)
            byte0 = 0;
        else
        if(((Integer)obj).intValue() == 1)
            byte0 = 1;
        else
            byte0 = 2;
        return byte0;
    }

    public Component getTableCellRendererComponent(JTable jtable, Object obj, boolean flag, boolean flag1, int i, int j)
    {
        Object obj1 = this;
        Object obj2 = state.get(new Integer(j));
        if(obj2 != null)
            if(((Integer)obj2).intValue() == 1)
                obj1 = downButton;
            else
                obj1 = upButton;
        ((AbstractButton) (obj1)).setText(obj != null ? obj.toString() : "");
        boolean flag2 = j == pushedColumn;
        ((AbstractButton) (obj1)).getModel().setPressed(flag2);
        ((AbstractButton) (obj1)).getModel().setArmed(flag2);
        return ((Component) (obj1));
    }

    public void setPressedColumn(int i)
    {
        pushedColumn = i;
    }

    public void setSelectedColumn(int i)
    {
        if(i < 0)
            return;
        Integer integer = null;
        Object obj = state.get(new Integer(i));
        if(obj == null)
            integer = new Integer(1);
        else
        if(((Integer)obj).intValue() == 1)
            integer = new Integer(2);
        else
            integer = new Integer(1);
        state.clear();
        state.put(new Integer(i), integer);
    }

    public static final int NONE = 0;
    public static final int DOWN = 1;
    public static final int UP = 2;
    int pushedColumn;
    Hashtable state;
    JButton downButton;
    JButton upButton;
}
