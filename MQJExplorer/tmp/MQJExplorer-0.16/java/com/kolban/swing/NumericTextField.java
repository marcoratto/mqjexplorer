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

import javax.swing.JTextField;
import javax.swing.text.*;

public class NumericTextField extends JTextField
{
    static class NumericDocument extends PlainDocument
    {

        public void insertString(int i, String s, AttributeSet attributeset)
            throws BadLocationException
        {
            if(s == null)
                return;
            for(int j = 0; j < s.length(); j++)
                if((j != 0 || i != 0 || s.charAt(0) != '-') && !Character.isDigit(s.charAt(j)))
                    return;

            super.insertString(i, s, attributeset);
        }

        NumericDocument()
        {
        }
    }


    public NumericTextField()
    {
        setDocument(new NumericDocument());
    }

    public int getIntValue()
    {
        return Integer.parseInt(getText());
    }

    public void setIntValue(int i)
    {
        setText(Integer.toString(i));
    }
}
