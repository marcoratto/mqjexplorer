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

import java.awt.Component;
import java.awt.Insets;
import java.util.Hashtable;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import org.apache.log4j.Logger;

public class SortButtonRenderer extends JButton implements TableCellRenderer {

	private final static Logger logger = Logger.getLogger(SortButtonRenderer.class);

	public SortButtonRenderer() {
		logger.trace("SortButtonRenderer()");
		pushedColumn = -1;
		state = new Hashtable<Integer, Integer>();
		setMargin(new Insets(0, 0, 0, 0));
		setHorizontalTextPosition(JButton.CENTER);
		setIcon(new BlankIcon());	
		
		downButton = new JButton();
		downButton.setMargin(new Insets(0, 0, 0, 0));
		downButton.setHorizontalTextPosition(2);
		downButton.setIcon(new BevelArrowIcon(1, false, false));
		downButton.setPressedIcon(new BevelArrowIcon(1, false, true));
		downButton.setMinimumSize(downButton.getPreferredSize());
		
		upButton = new JButton();
		upButton.setMargin(new Insets(0, 0, 0, 0));
		upButton.setHorizontalTextPosition(2);
		upButton.setIcon(new BevelArrowIcon(0, false, false));
		upButton.setPressedIcon(new BevelArrowIcon(0, false, true));
		upButton.setMinimumSize(upButton.getPreferredSize());
	}
	
	public int getState(int i) {
		logger.trace("getState()");
		Object obj = state.get(new Integer(i));
		byte byte0;
		if (obj == null)
			byte0 = 0;
		else if (((Integer) obj).intValue() == 1)
			byte0 = 1;
		else
			byte0 = 2;
		return byte0;
	}

	public Component getTableCellRendererComponent(JTable jtable, Object obj,
			boolean flag, boolean flag1, int i, int j) {
		logger.trace("getTableCellRendererComponent(): start");
		Object obj1 = this;
		Object obj2 = state.get(new Integer(j));
		if (obj2 != null)
			if (((Integer) obj2).intValue() == 1)
				obj1 = downButton;
			else
				obj1 = upButton;
		
		((AbstractButton) (obj1)).setText(obj != null ? obj.toString() : "");
		boolean flag2 = j == pushedColumn;
		((AbstractButton) (obj1)).getModel().setPressed(flag2);
		((AbstractButton) (obj1)).getModel().setArmed(flag2);
		
		// this.setMinimumSize(new Dimension(this.getWidth()+10, this.getHeight()));
		logger.trace("getTableCellRendererComponent(): end");
		return ((Component) (obj1));
	}

	public void setPressedColumn(int i) {
		logger.trace("setPressedColumn():" + i);
		pushedColumn = i;
	}

	public void setSelectedColumn(int i) {
		logger.trace("setSelectedColumn()");
		if (i < 0)
			return;
		Integer integer = null;
		Object obj = state.get(new Integer(i));
		if (obj == null)
			integer = new Integer(1);
		else if (((Integer) obj).intValue() == 1)
			integer = new Integer(2);
		else
			integer = new Integer(1);
		state.clear();
		state.put(new Integer(i), integer);
	}

	public static final int NONE = 0;
	public static final int DOWN = 1;
	public static final int UP = 2;
	int pushedColumn;
	Hashtable<Integer, Integer> state;
	JButton downButton;
	JButton upButton;
}
