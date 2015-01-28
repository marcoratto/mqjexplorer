// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TableSorter.java

package com.kolban.swing.table;

import com.kolban.mqjexplorer.TextIcon;
import java.util.Date;

// Referenced classes of package com.kolban.swing.table:
//            SortableTableModel

public class TableSorter
{

    public TableSorter(SortableTableModel sortabletablemodel)
    {
        model = sortabletablemodel;
    }

    public int compare(int i, int j, int k)
    {
        Object obj = model.getValueAt(j, i);
        Object obj1 = model.getValueAt(k, i);
        if(obj == null && obj1 == null)
            return 0;
        if(obj == null)
            return -1;
        if(obj1 == null)
            return 1;
        if(obj.getClass().isInstance(obj1))
        {
            Class class1 = model.getColumnClass(i);
            if(class1.getSuperclass() == java.lang.Number.class)
                return compare((Number)obj, (Number)obj1);
            if(class1 == java.lang.String.class)
                return ((String)obj).compareTo((String)obj1);
            if(class1 == java.util.Date.class)
                return compare((Date)obj, (Date)obj1);
            if(class1 == java.lang.Boolean.class)
                return compare((Boolean)obj, (Boolean)obj1);
            if(obj instanceof Comparable)
            {
                Comparable comparable = (Comparable)obj;
                return comparable.compareTo(obj1);
            } else
            {
                return ((String)obj).compareTo((String)obj1);
            }
        } else
        {
            return 0;
        }
    }

    int compare(TextIcon texticon, TextIcon texticon1)
    {
        return texticon.getText().compareTo(texticon1.getText());
    }

    public int compare(Boolean boolean1, Boolean boolean2)
    {
        boolean flag = boolean1.booleanValue();
        boolean flag1 = boolean2.booleanValue();
        if(flag == flag1)
            return 0;
        return !flag ? -1 : 1;
    }

    public int compare(Number number, Number number1)
    {
        double d = number.doubleValue();
        double d1 = number1.doubleValue();
        if(d < d1)
            return -1;
        return d <= d1 ? 0 : 1;
    }

    public int compare(Date date, Date date1)
    {
        long l = date.getTime();
        long l1 = date1.getTime();
        if(l < l1)
            return -1;
        return l <= l1 ? 0 : 1;
    }

    public void sort(int i, boolean flag)
    {
        int j = model.getRowCount();
        int ai[] = model.getIndexes();
        for(int k = 0; k < j - 1; k++)
        {
            int l = k;
            for(int i1 = k + 1; i1 < j; i1++)
                if(flag)
                {
                    if(compare(i, i1, l) < 0)
                        l = i1;
                } else
                if(compare(i, i1, l) > 0)
                    l = i1;

            int j1 = ai[k];
            ai[k] = ai[l];
            ai[l] = j1;
        }

    }

    SortableTableModel model;
}
