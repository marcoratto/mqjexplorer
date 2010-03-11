// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HeaderListener.java

package com.kolban.swing.table;

import java.awt.event.*;
import javax.swing.table.JTableHeader;

// Referenced classes of package com.kolban.swing.table:
//            SortButtonRenderer, SortableTableModel

public class HeaderListener extends MouseAdapter
{

    public HeaderListener(JTableHeader jtableheader, SortButtonRenderer sortbuttonrenderer)
    {
        header = jtableheader;
        renderer = sortbuttonrenderer;
    }

    public void mousePressed(MouseEvent mouseevent)
    {
        if((mouseevent.getModifiers() & 4) == 0)
            return;
        int i = header.columnAtPoint(mouseevent.getPoint());
        int j = header.getTable().convertColumnIndexToModel(i);
        renderer.setPressedColumn(i);
        renderer.setSelectedColumn(i);
        header.repaint();
        if(header.getTable().isEditing())
            header.getTable().getCellEditor().stopCellEditing();
        boolean flag;
        if(1 == renderer.getState(i))
            flag = true;
        else
            flag = false;
        ((SortableTableModel)header.getTable().getModel()).sortByColumn(j, flag);
    }

    public void mouseReleased(MouseEvent mouseevent)
    {
        header.columnAtPoint(mouseevent.getPoint());
        renderer.setPressedColumn(-1);
        header.repaint();
    }

    private JTableHeader header;
    private SortButtonRenderer renderer;
}
