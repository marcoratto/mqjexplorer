// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NumericTextField.java

package com.kolban.mqjexplorer.mqattributes;

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
                if(!Character.isDigit(s.charAt(j)))
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
}
