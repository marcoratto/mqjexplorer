// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ClassUtils.java

package com.kolban.utils;

import com.kolban.swing.HookedListEntry;
import java.lang.reflect.Field;
import java.util.*;

public class ClassUtils
{

    public ClassUtils()
    {
    }

    public static HookedListEntry[] getMatchingFields(Class class1, String s)
    {
        Vector vector = new Vector();
        Field afield[] = class1.getFields();
        for(int i = 0; i < afield.length; i++)
            if(afield[i].getName().startsWith(s))
                vector.addElement(afield[i]);

        HookedListEntry ahookedlistentry[] = new HookedListEntry[vector.size()];
        for(int j = 0; j < ahookedlistentry.length; j++)
        {
            Field field = (Field)vector.elementAt(j);
            try
            {
                ahookedlistentry[j] = new HookedListEntry(field.getName(), field.get(null));
            }
            catch(Exception _ex)
            {
                ahookedlistentry[j] = new HookedListEntry("Field ERROR", null);
            }
        }

        Arrays.sort(ahookedlistentry, new Comparator() {

            public int compare(Object obj, Object obj1)
            {
                String s1 = ((HookedListEntry)obj).getName();
                String s2 = ((HookedListEntry)obj1).getName();
                return s1.compareTo(s2);
            }

        }
);
        return ahookedlistentry;
    }
}
