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

import org.apache.log4j.Logger;

// Referenced classes of package com.kolban.mqjexplorer:
//            QueueManagerModel, QueueListModel

public class QueueListTableModel extends AbstractTableModel {

	private final static Logger logger = Logger.getLogger("com.kolban.mqjexplorer");

	public QueueListTableModel(QueueManagerModel queuemanagermodel) {
		columnClasses = (new Class[] { TextIcon.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				com.kolban.mqjexplorer.guibeans.QFullBar.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class });
		queueManagerModel = queuemanagermodel;
	}

	public Class getColumnClass(int i) {
        switch(i)
        {
        case 0: // '\0'
            return com.kolban.mqjexplorer.TextIcon.class;
        }
        return java.lang.String.class;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int i) {
		return columnNames[i];
	}

	public int getRowCount() {
		if (queueManagerModel == null)
			return 0;
		else
			return queueManagerModel.getQueueListModel().getQueueCount();
	}

	public Object getValueAt(int i, int j) {
		String s = getColumnName(j);
		logger.trace("getValueAt():" + s);
		Object obj = queueManagerModel.getQueueListModel().getValueAt(i, s);
		
		logger.trace("getValueAt():" + obj);
		return obj;
	}

	public void setQueueManagerModel(QueueManagerModel queuemanagermodel) {
		queueManagerModel = queuemanagermodel;
	}

	private QueueManagerModel queueManagerModel;
	private final Class columnClasses[];
	private final String columnNames[] = { "Name", "Open Input Count",
			"Open Output Count", "Current Depth", "Maximum Depth",
			"QFull Level", "Queue Type", "Cluster Name", "Cluster Namelist",
			"Hosting Queue Manager", "Cluster Queue Type",
			"Alteration Date (GMT)", "Alteration Date/Time",
			"Alteration Time (GMT)", "Backout Requeue Queue Name",
			"Backout Threshold", "Base Queue Name", "Creation Date (GMT)",
			"Creation Date/Time", "Default Bind", "Default Input Open Option",
			"Default Persistence", "Default Priority", "Definition Type",
			"Description", "Distribution Lists", "Get Messages",
			"Harden Get Backout", "High Depth Event", "High Depth Limit",
			"Initiation Queue Name", "Low Depth Event", "Low Depth Limit",
			"Maximum Depth Event", "Maximum Message Length",
			"Message Archiving", "Message Delivery Sequence", "Process Name",
			"Put Message", "Queue Manager Identifier",
			"Queue Service Interval", "Queue Service Interval Event",
			"Remote Queue Manager Name", "Remote Queue Name",
			"Retention Interval", "Scope", "Shareability", "Storage Class",
			"Transmission Queue Name", "Trigger Control", "Trigger Data",
			"Trigger Depth", "Trigger Message Priority", "Trigger Type",
			"Usage" };
}
