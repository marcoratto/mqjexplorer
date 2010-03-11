// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Names.java

package com.kolban.mqjexplorer.mqattributes;

import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JTextField;

public class Names extends JTextField
{

    public Names()
    {
        setColumns(20);
    }

    public String[] getValue()
    {
        Vector vector = new Vector();
        for(StringTokenizer stringtokenizer = new StringTokenizer(getText()); stringtokenizer.hasMoreTokens(); vector.addElement(stringtokenizer.nextToken()));
        String as[] = new String[vector.size()];
        for(int i = 0; i < vector.size(); i++)
            as[i] = (String)vector.elementAt(i);

        return as;
    }

    public void setValue(String as[])
    {
        setText(toString(as));
    }

    public static String toString(String as[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        for(int i = 0; i < as.length; i++)
            if(i > 0)
                stringbuffer.append("," + as[i].trim());
            else
                stringbuffer.append(as[i].trim());

        return stringbuffer.toString();
    }
}
