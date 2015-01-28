// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HookedListEntry.java

package com.kolban.swing;

import javax.swing.ComboBoxModel;
import javax.swing.ListModel;

public class HookedListEntry
{

    public HookedListEntry()
    {
        name = "";
        value = null;
    }

    public HookedListEntry(String s, Object obj)
    {
        name = "";
        value = null;
        name = s;
        value = obj;
    }

    public static HookedListEntry findByValue(Object obj, ListModel listmodel)
    {
        int i = listmodel.getSize();
        for(int j = 0; j < i; j++)
        {
            HookedListEntry hookedlistentry = (HookedListEntry)listmodel.getElementAt(j);
            if(obj.equals(hookedlistentry.getValue()))
                return hookedlistentry;
        }

        return null;
    }

    public String getName()
    {
        return name;
    }

    public Object getValue()
    {
        return value;
    }

    public static void setComboListByValue(Object obj, ComboBoxModel comboboxmodel)
    {
        int i = comboboxmodel.getSize();
        for(int j = 0; j < i; j++)
        {
            HookedListEntry hookedlistentry = (HookedListEntry)comboboxmodel.getElementAt(j);
            if(obj.equals(hookedlistentry.getValue()))
            {
                comboboxmodel.setSelectedItem(hookedlistentry);
                return;
            }
        }

        comboboxmodel.setSelectedItem(null);
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setValue(Object obj)
    {
        value = obj;
    }

    public String toString()
    {
        return getName();
    }

    private String name;
    private Object value;
}
