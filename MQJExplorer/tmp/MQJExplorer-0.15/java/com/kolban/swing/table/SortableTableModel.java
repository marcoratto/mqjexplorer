// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SortableTableModel.java

package com.kolban.swing.table;

import javax.swing.table.TableModel;

public interface SortableTableModel
    extends TableModel
{

    public abstract int[] getIndexes();

    public abstract void sortByColumn(int i, boolean flag);
}
