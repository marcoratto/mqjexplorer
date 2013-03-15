// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QNameComboBox.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.*;
import javax.swing.text.*;

public class QNameComboBox extends JComboBox
{
    static class QNameDocument extends PlainDocument
    {

        public void insertString(int i, String s, AttributeSet attributeset)
            throws BadLocationException
        {
            if(s == null)
                return;
            for(int j = 0; j < s.length(); j++)
            {
                char c = s.charAt(j);
                if(!Character.isLetterOrDigit(c) && c != '.' && c != '%' && c != '_' && c != '/')
                    return;
            }

            super.insertString(i, s, attributeset);
        }

        QNameDocument()
        {
        }
    }


    public QNameComboBox()
    {
        JTextField jtextfield = (JTextField)getEditor().getEditorComponent();
        jtextfield.setDocument(new QNameDocument());
    }
}
