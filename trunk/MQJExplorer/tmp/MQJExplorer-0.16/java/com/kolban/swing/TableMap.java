// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TableMap.java

package com.kolban.swing;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class TableMap extends AbstractTableModel
    implements TableModelListener
{

    public TableMap()
    {
    }

    public Class getColumnClass(int i)
    {
        return model.getColumnClass(i);
    }

    public int getColumnCount()
    {
        return model != null ? model.getColumnCount() : 0;
    }

    public String getColumnName(int i)
    {
        return model.getColumnName(i);
    }

    public TableModel getModel()
    {
        return model;
    }

    public int getRowCount()
    {
        return model != null ? model.getRowCount() : 0;
    }

    public Object getValueAt(int i, int j)
    {
        return model.getValueAt(i, j);
    }

    public boolean isCellEditable(int i, int j)
    {
        return model.isCellEditable(i, j);
    }

    public void setModel(TableModel tablemodel)
    {
        model = tablemodel;
        tablemodel.addTableModelListener(this);
    }

    public void setValueAt(Object obj, int i, int j)
    {
        model.setValueAt(obj, i, j);
    }

    public void tableChanged(TableModelEvent tablemodelevent)
    {
        fireTableChanged(tablemodelevent);
    }

    protected TableModel model;
}
