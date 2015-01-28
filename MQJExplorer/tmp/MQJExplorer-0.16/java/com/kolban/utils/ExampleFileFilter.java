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
