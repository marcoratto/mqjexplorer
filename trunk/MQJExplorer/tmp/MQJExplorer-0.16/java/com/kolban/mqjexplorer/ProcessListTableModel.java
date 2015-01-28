// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcessListTableModel.java

package com.kolban.mqjexplorer;

import javax.swing.table.AbstractTableModel;

// Referenced classes of package com.kolban.mqjexplorer:
//            QueueManagerModel, ProcessListModel

public class ProcessListTableModel extends AbstractTableModel
{

    public ProcessListTableModel()
    {
        queueManagerModel = null;
    }

    public Class getColumnClass(int i)
    {
        switch(i)
        {
        case 0: // '\0'
            return com.kolban.mqjexplorer.TextIcon.class;
        }
        return java.lang.String.class;
    }

    public int getColumnCount()
    {
        return columnNames.length;
    }

    public String getColumnName(int i)
    {
        return columnNames[i];
    }

    public int getRowCount()
    {
        if(queueManagerModel == null)
            return 0;
        else
            return queueManagerModel.getProcessListModel().getProcessCount();
    }

    public Object getValueAt(int i, int j)
    {
        if(queueManagerModel == null)
        {
            return null;
        } else
        {
            Object obj = queueManagerModel.getProcessListModel().getValueAt(i, getColumnName(j));
            return obj;
        }
    }

    public void setQueueManagerModel(QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
    }

    private QueueManagerModel queueManagerModel;
    private static final String columnNames[] = {
        "Name", "Application Type", "Application ID", "Alteration Date (GMT)", "Alteration Time (GMT)", "Alteration Date/Time", "Description", "Environment Data", "User Data"
    };

}
