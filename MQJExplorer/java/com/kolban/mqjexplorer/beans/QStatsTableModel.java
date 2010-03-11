// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QStatsTableModel.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.pcf.PCFMessage;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.mqjexplorer.guibeans.QFullBar;
import com.kolban.mqjexplorer.utils.Filter;
import java.util.*;
import javax.swing.table.AbstractTableModel;

public class QStatsTableModel extends AbstractTableModel
{

    public QStatsTableModel()
    {
        rowData = null;
    }

    public int getColumnCount()
    {
        return names.length;
    }

    public String getColumnName(int i)
    {
        return names[i].toString();
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
        if(j == 5)
            return (QFullBar)rowData[i][j];
        else
            return rowData[i][j];
    }

    public Class getColumnClass(int i)
    {
        switch(i)
        {
        case 5: // '\005'
            return com.kolban.mqjexplorer.guibeans.QFullBar.class;
        }
        return java.lang.String.class;
    }

    public boolean isCellEditable(int i, int j)
    {
        return false;
    }

    public void setData(QueueManagerModel queuemanagermodel)
    {
        Filter filter = queuemanagermodel.getQueueListModel().getFilter();
        TreeSet treeset = new TreeSet();
        for(Enumeration enumeration = filter.names(); enumeration.hasMoreElements();)
        {
            String s = (String)enumeration.nextElement();
            Boolean boolean1 = filter.getIncluded(s);
            if(boolean1.booleanValue())
                treeset.add(s.trim());
        }

        int i = 0;
        rowData = new Object[filter.countVisible()][6];
        for(Iterator iterator = treeset.iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            rowData[i][0] = s1;
            rowData[i][1] = "N/A";
            rowData[i][2] = "N/A";
            rowData[i][3] = "N/A";
            rowData[i][4] = "N/A";
            QFullBar qfullbar = new QFullBar();
            qfullbar.qDepth = 0;
            PCFMessage pcfmessage = queuemanagermodel.getQueueListModel().findQueueByName(s1);
            try
            {
                qfullbar.maxQDepth = pcfmessage.getIntParameterValue(15);
            }
            catch(Exception _ex)
            {
                qfullbar.maxQDepth = 0;
            }
            rowData[i][5] = qfullbar;
            i++;
        }

        fireTableDataChanged();
    }

    public void setValueAt(Object obj, int i, int j)
    {
        rowData[i][j] = obj;
    }

    private String names[] = {
        "Queue Name", "Puts/Sec", "Gets/Sec", "High", "Growth", "Queue Full"
    };
    private Object rowData[][];
}
