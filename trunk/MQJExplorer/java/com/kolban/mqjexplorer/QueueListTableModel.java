// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueListTableModel.java

package com.kolban.mqjexplorer;

import javax.swing.table.AbstractTableModel;

// Referenced classes of package com.kolban.mqjexplorer:
//            QueueManagerModel, QueueListModel

public class QueueListTableModel extends AbstractTableModel
{

    public QueueListTableModel(QueueManagerModel queuemanagermodel)
    {
        columnClasses = (new Class[] {
            com.kolban.mqjexplorer.TextIcon.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, com.kolban.mqjexplorer.guibeans.QFullBar.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, 
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, 
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, 
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, 
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, 
            java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
        });
        queueManagerModel = queuemanagermodel;
    }

    public Class getColumnClass(int i)
    {
        return columnClasses[i];
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
            return queueManagerModel.getQueueListModel().getQueueCount();
    }

    public Object getValueAt(int i, int j)
    {
        String s = getColumnName(j);
        return queueManagerModel.getQueueListModel().getValueAt(i, s);
    }

    public void setQueueManagerModel(QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
    }

    private QueueManagerModel queueManagerModel;
    private final Class columnClasses[];
    private final String columnNames[] = {
        "Name", "Open Input Count", "Open Output Count", "Current Depth", "Maximum Depth", "QFull Level", "Queue Type", "Cluster Name", "Cluster Namelist", "Hosting Queue Manager", 
        "Cluster Queue Type", "Alteration Date (GMT)", "Alteration Date/Time", "Alteration Time (GMT)", "Backout Requeue Queue Name", "Backout Threshold", "Base Queue Name", "Creation Date (GMT)", "Creation Date/Time", "Default Bind", 
        "Default Input Open Option", "Default Persistence", "Default Priority", "Definition Type", "Description", "Distribution Lists", "Get Messages", "Harden Get Backout", "High Depth Event", "High Depth Limit", 
        "Initiation Queue Name", "Low Depth Event", "Low Depth Limit", "Maximum Depth Event", "Maximum Message Length", "Message Archiving", "Message Delivery Sequence", "Process Name", "Put Message", "Queue Manager Identifier", 
        "Queue Service Interval", "Queue Service Interval Event", "Remote Queue Manager Name", "Remote Queue Name", "Retention Interval", "Scope", "Shareability", "Storage Class", "Transmission Queue Name", "Trigger Control", 
        "Trigger Data", "Trigger Depth", "Trigger Message Priority", "Trigger Type", "Usage"
    };
}
