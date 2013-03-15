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

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;

// Referenced classes of package com.kolban.mqjexplorer:
//            TextIcon

public class TextIconRenderer extends JLabel
    implements TableCellRenderer
{

    public TextIconRenderer()
    {
    }

    public Component getTableCellRendererComponent(JTable jtable, Object obj, boolean flag, boolean flag1, int i, int j)
    {
        if(flag)
        {
            setBackground(jtable.getSelectionBackground());
            setForeground(jtable.getSelectionForeground());
        } else
        {
            setBackground(jtable.getBackground());
            setForeground(jtable.getForeground());
        }
        setOpaque(true);
        if(obj instanceof TextIcon)
        {
            setFont(jtable.getFont());
            TextIcon texticon = (TextIcon)obj;
            javax.swing.Icon icon = texticon.getIcon();
            if(icon != null)
                setIcon(texticon.getIcon());
            setText(texticon.getText());
        }
        return this;
    }
}
