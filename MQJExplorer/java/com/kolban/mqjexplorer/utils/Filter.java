// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Filter.java

package com.kolban.mqjexplorer.utils;

import java.util.*;

public class Filter
{

    public Filter()
    {
        hashTable = null;
        hashTable = new Hashtable();
    }

    public void add(String s, boolean flag)
    {
        hashTable.put(s, new Boolean(flag));
    }

    public boolean allVisible()
    {
        return countVisible() == size();
    }

    public int countVisible()
    {
        int i = 0;
        for(Enumeration enumeration = names(); enumeration.hasMoreElements();)
            if(getIncluded((String)enumeration.nextElement()).booleanValue())
                i++;

        return i;
    }

    public Boolean getIncluded(String s)
    {
        Boolean boolean1 = (Boolean)hashTable.get(s);
        return boolean1;
    }

    public Iterator iterator()
    {
        TreeSet treeset = new TreeSet();
        for(Enumeration enumeration = hashTable.keys(); enumeration.hasMoreElements(); treeset.add(enumeration.nextElement()));
        return treeset.iterator();
    }

    public Enumeration names()
    {
        return hashTable.keys();
    }

    public void remove(String s)
    {
        hashTable.remove(s);
    }

    public void setIncluded(String s, boolean flag)
    {
        hashTable.put(s, new Boolean(flag));
    }

    public int size()
    {
        return hashTable.size();
    }

    private Hashtable hashTable;
}
