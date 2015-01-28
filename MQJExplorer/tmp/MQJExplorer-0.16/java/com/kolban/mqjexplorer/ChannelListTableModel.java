/*
 * Copyright (C) 2012 Marco Ratto
 *
 * This file is part of the project MQJExplorer.
 *
 * MQJExplorer is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * any later version.
 *
 * MQJExplorer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MQJExplorer; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.kolban.mqjexplorer;

import javax.swing.table.AbstractTableModel;

// Referenced classes of package com.kolban.mqjexplorer:
//            QueueManagerModel, ChannelListModel

public class ChannelListTableModel extends AbstractTableModel
{

    public ChannelListTableModel()
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
            return queueManagerModel.getChannelListModel().getChannelCount();
    }

    public Object getValueAt(int i, int j)
    {
        if(queueManagerModel == null)
        {
            return null;
        } else
        {
            Object obj = queueManagerModel.getChannelListModel().getValueAt(i, getColumnName(j));
            return obj;
        }
    }

    public void setQueueManagerModel(QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
    }

    private QueueManagerModel queueManagerModel;
    private static final String columnNames[] = {
        "Name", "Channel Type", "Protocol Type", "Connection Name", "Transmission Queue Name", "Overall Channel Status", "Alteration Date (GMT)", "Alteration Date/Time", "Alteration Time (GMT)", "Batch Interval", 
        "Batch Size", "Cluster Name", "Cluster Namelist", "Data Conversion", "Description", "Disconnection Interval", "Heartbeat Interval", "Long Retry Count", "Long Retry Timer", "Maximum Message Length", 
        "MCA Name", "MCA Type", "MCA User ID", "Message Exit Name", "Message Exit User Data", "Message Retry Count", "Message Retry Exit Name", "Message Retry Exit User Data", "Message Retry Interval", "Mode Name", 
        "Network Priority", "Non-persistent Message Speed", "Password", "Put Authority", "Receive Exit Name", "Receive Exit User Data", "Security Exit Name", "Security Exit User Data", "Send Exit Name", "Send Exit User Data", 
        "Sequence Number Wrap", "Short Retry Count", "Short Retry Timer", "TP Name", "User ID"
    };

}
