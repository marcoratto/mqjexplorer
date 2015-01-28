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
package com.kolban.swing;

import javax.swing.JComponent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextFieldEnabler
    implements DocumentListener
{

    public TextFieldEnabler(JComponent jcomponent)
    {
        enabledComponent = jcomponent;
    }

    public void changedUpdate(DocumentEvent documentevent)
    {
    }

    public void insertUpdate(DocumentEvent documentevent)
    {
        enabledComponent.setEnabled(documentevent.getDocument().getLength() > 0);
    }

    public void removeUpdate(DocumentEvent documentevent)
    {
        enabledComponent.setEnabled(documentevent.getDocument().getLength() > 0);
    }

    private JComponent enabledComponent;
}
