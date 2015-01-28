// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FilterTableModel.java

package com.kolban.mqjexplorer.beans;

import com.kolban.mqjexplorer.utils.Filter;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class FilterTableModel extends AbstractTableModel
{

    public FilterTableModel()
    {
        rowData = null;
    }

    public void clearAll()
    {
        if(rowData == null)
            return;
        for(int i = 0; i < rowData.length; i++)
            rowData[i][1] = new Boolean(false);

        fireTableDataChanged();
    }

    public Class getColumnClass(int i)
    {
        return getValueAt(0, i).getClass();
    }

    public int getColumnCount()
    {
        return names.length;
    }

    public String getColumnName(int i)
    {
        return names[i].toString();
    }

    public Filter getData()
    {
        Filter filter = new Filter();
        for(int i = 0; i < rowData.length; i++)
            filter.add((String)rowData[i][0], ((Boolean)rowData[i][1]).booleanValue());

        return filter;
    }

    public int getRowCount()
    {
        if(rowData == null)
            return 0;
        else
            return rowData.length;
    }

    public Object getValueAt(int i, int j)
    {
        if(rowData == null)
            return null;
        else
            return rowData[i][j];
    }

    public boolean isCellEditable(int i, int j)
    {
        return j == 1;
    }

    public void setAll()
    {
        if(rowData == null)
            return;
        for(int i = 0; i < rowData.length; i++)
            rowData[i][1] = new Boolean(true);

        fireTableDataChanged();
    }

    public void setData(Filter filter)
    {
        int i = 0;
        rowData = new Object[filter.size()][2];
        for(Iterator iterator = filter.iterator(); iterator.hasNext();)
        {
            rowData[i][0] = iterator.next();
            rowData[i][1] = filter.getIncluded((String)rowData[i][0]);
            i++;
        }

        fireTableDataChanged();
    }

    public void setValueAt(Object obj, int i, int j)
    {
        if(rowData == null)
            return;
        if(j == 1)
        {
            rowData[i][j] = obj;
            fireTableCellUpdated(i, j);
        }
    }

    private String names[] = {
        "Name", "Include"
    };
    private Object rowData[][];
}
