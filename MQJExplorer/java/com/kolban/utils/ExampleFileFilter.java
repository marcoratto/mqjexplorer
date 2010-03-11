// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExampleFileFilter.java

package com.kolban.utils;

import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.filechooser.FileFilter;

public class ExampleFileFilter extends FileFilter
{

    public ExampleFileFilter()
    {
        filters = null;
        description = null;
        fullDescription = null;
        useExtensionsInDescription = true;
        filters = new Hashtable();
    }

    public ExampleFileFilter(String as[])
    {
        this(as, null);
    }

    public ExampleFileFilter(String as[], String s)
    {
        this();
        for(int i = 0; i < as.length; i++)
            addExtension(as[i]);

        if(s != null)
            setDescription(s);
    }

    public ExampleFileFilter(String s)
    {
        this(s, null);
    }

    public ExampleFileFilter(String s, String s1)
    {
        this();
        if(s != null)
            addExtension(s);
        if(s1 != null)
            setDescription(s1);
    }

    public boolean accept(File file)
    {
        if(file != null)
        {
            if(file.isDirectory())
                return true;
            String s = getExtension(file);
            if(s != null && filters.get(getExtension(file)) != null)
                return true;
        }
        return false;
    }

    public void addExtension(String s)
    {
        if(filters == null)
            filters = new Hashtable(5);
        filters.put(s.toLowerCase(), this);
        fullDescription = null;
    }

    public String getDescription()
    {
        if(fullDescription == null)
            if(description == null || isExtensionListInDescription())
            {
                fullDescription = description != null ? description + " (" : "(";
                Enumeration enumeration = filters.keys();
                if(enumeration != null)
                    for(fullDescription += "*." + (String)enumeration.nextElement(); enumeration.hasMoreElements(); fullDescription += ", " + (String)enumeration.nextElement());
                fullDescription += ")";
            } else
            {
                fullDescription = description;
            }
        return fullDescription;
    }

    public String getExtension(File file)
    {
        if(file != null)
        {
            String s = file.getName();
            int i = s.lastIndexOf('.');
            if(i > 0 && i < s.length() - 1)
                return s.substring(i + 1).toLowerCase();
        }
        return null;
    }

    public boolean isExtensionListInDescription()
    {
        return useExtensionsInDescription;
    }

    public void setDescription(String s)
    {
        description = s;
        fullDescription = null;
    }

    public void setExtensionListInDescription(boolean flag)
    {
        useExtensionsInDescription = flag;
        fullDescription = null;
    }

    private static String TYPE_UNKNOWN = "Type Unknown";
    private static String HIDDEN_FILE = "Hidden File";
    private Hashtable filters;
    private String description;
    private String fullDescription;
    private boolean useExtensionsInDescription;

}
