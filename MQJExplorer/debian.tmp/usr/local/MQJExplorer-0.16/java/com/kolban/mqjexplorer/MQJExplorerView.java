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

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;

// Referenced classes of package com.kolban.mqjexplorer:
//            Profile

public interface MQJExplorerView
{

    public abstract void actionPerformed(ActionEvent actionevent);

    public abstract void addToolBarButtons(JToolBar jtoolbar, Dimension dimension);

    public abstract void refresh();

    public abstract void showHideColumns();

    public abstract void setProfile(Profile profile);

    public abstract void setModel(Object obj);
}
