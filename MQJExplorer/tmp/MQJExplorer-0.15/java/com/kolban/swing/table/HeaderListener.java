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
package com.kolban.swing.table;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import org.apache.log4j.Logger;

public class HeaderListener extends MouseAdapter {

	private final static Logger logger = Logger.getLogger(HeaderListener.class);

	public HeaderListener(JTable table, JTableHeader jtableheader, SortButtonRenderer sortbuttonrenderer) {
		logger.trace("HeaderListener()");
		this.table = table;
		header = jtableheader;
		renderer = sortbuttonrenderer;
	}

	public void mousePressed(MouseEvent mouseevent) {
		 // data gathering
        int clicks = mouseevent.getClickCount();
		logger.trace("HeaderListener.mousePressed():click=" + clicks);

		if ((mouseevent.getModifiers() & 4) == 0)
			return;
		int i = header.columnAtPoint(mouseevent.getPoint());
		int j = header.getTable().convertColumnIndexToModel(i);
		renderer.setPressedColumn(i);
		renderer.setSelectedColumn(i);
		header.repaint();
		if (header.getTable().isEditing())
			header.getTable().getCellEditor().stopCellEditing();
		boolean flag;

		if (1 == renderer.getState(i))
			flag = true;
		else
			flag = false;

		((SortableTableModel) header.getTable().getModel()).sortByColumn(j,
				flag);
	}

	public void mouseReleased(MouseEvent mouseevent) {
		logger.trace("HeaderListener.mouseReleased()");
		header.columnAtPoint(mouseevent.getPoint());
		renderer.setPressedColumn(-1);
		header.repaint();
	}

	private void setPreferredColumnWidth(int column, int preferredWidth) {
	    this.table.getColumnModel().getColumn(column).setPreferredWidth(1000);	    
	}

	public void adjustColumnWidth(int column) {
	    setPreferredColumnWidth(column, getPreferredSizeForColumn(column));
	}

	private int getPreferredSizeForColumn(int columnIndex) {
	    // base setup
	    int preferredWidth = 0;
	    int rowCount = this.table.getRowCount();
	    TableColumnModel columnModel = this.table.getColumnModel();
	    TableColumn column = columnModel.getColumn(columnIndex);

	    // header
        preferredWidth = renderer.getPreferredSize().width;

	    for (int row = 0; row < rowCount; row++) {
	        preferredWidth = Math.max(preferredWidth, column.getPreferredWidth());
	    }

	    // exit
	    return (preferredWidth <= 0) ? 25 : (preferredWidth + 15);
	}

	private JTable table;
	private JTableHeader header;
	private SortButtonRenderer renderer;
}
