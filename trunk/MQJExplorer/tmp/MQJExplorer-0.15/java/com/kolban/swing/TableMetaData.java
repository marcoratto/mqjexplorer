// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TableMetaData.java

package com.kolban.swing;

import java.awt.FontMetrics;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.*;

public class TableMetaData
    implements Serializable
{

    public TableMetaData()
    {
    }

    public Enumeration getVisibleElements()
    {
        return visible.elements();
    }

    public int getWidth(int i)
    {
        if(i > widths.length - 1)
            return 0;
        else
            return widths[i];
    }

    public void hideAll()
    {
        visible = new Vector();
    }

    public boolean isVisible(int i)
    {
        for(Enumeration enumeration = visible.elements(); enumeration.hasMoreElements();)
            if(((Integer)enumeration.nextElement()).intValue() == i)
                return true;

        return false;
    }

    public void setTable(JTable jtable)
    {
        table = jtable;
        TableModel tablemodel = jtable.getModel();
        TableColumnModel tablecolumnmodel = jtable.getColumnModel();
        columns = new TableColumn[tablemodel.getColumnCount()];
        for(int i = 0; i < tablemodel.getColumnCount(); i++)
        {
            columns[i] = tablecolumnmodel.getColumn(i);
            String s = tablemodel.getColumnName(i);
            columns[i].setHeaderValue(s);
            columns[i].setIdentifier(s);
            columns[i].setModelIndex(i);
        }

        if(widths == null || visible == null)
        {
            int j = tablemodel.getColumnCount();
            widths = new int[j];
            visible = new Vector();
            FontMetrics fontmetrics = jtable.getFontMetrics(jtable.getFont());
            for(int k = 0; k < j; k++)
            {
                int l;
                if(columns[k].getHeaderRenderer() == null)
                {
                    l = fontmetrics.stringWidth(tablemodel.getColumnName(k));
                } else
                {
                    columns[k].sizeWidthToFit();
                    l = columns[k].getWidth();
                }
                if(k == 0 && l < 120)
                    l = 120;
                widths[k] = l + 10;
                visible.add(new Integer(k));
            }

        }
    }

    public void setVisible(int i)
    {
        visible.addElement(new Integer(i));
    }

    public void setVisibleFromTable()
    {
        if(table == null)
            return;
        TableColumnModel tablecolumnmodel = table.getColumnModel();
        visible = new Vector();
        int i;
        for(Enumeration enumeration = tablecolumnmodel.getColumns(); enumeration.hasMoreElements(); setVisible(i))
        {
            TableColumn tablecolumn = (TableColumn)enumeration.nextElement();
            i = tablecolumn.getModelIndex();
        }

    }

    public void setWidthsFromTable()
    {
        if(table == null)
            return;
        TableColumnModel tablecolumnmodel = table.getColumnModel();
        for(Enumeration enumeration = tablecolumnmodel.getColumns(); enumeration.hasMoreElements();)
        {
            TableColumn tablecolumn = (TableColumn)enumeration.nextElement();
            int i = tablecolumn.getModelIndex();
            widths[i] = tablecolumn.getWidth();
        }

    }

    public void synchronizeTable()
    {
        AbstractTableModel _tmp = (AbstractTableModel)table.getModel();
        DefaultTableColumnModel defaulttablecolumnmodel = new DefaultTableColumnModel();
        TableColumn tablecolumn;
        for(Enumeration enumeration = visible.elements(); enumeration.hasMoreElements(); defaulttablecolumnmodel.addColumn(tablecolumn))
        {
            int i = ((Integer)enumeration.nextElement()).intValue();
            tablecolumn = columns[i];
            tablecolumn.setPreferredWidth(getWidth(i));
            tablecolumn.setWidth(getWidth(i));
        }

        table.setColumnModel(defaulttablecolumnmodel);
    }

    private int widths[];
    private Vector visible;
    private transient JTable table;
    private transient TableColumn columns[];
}
