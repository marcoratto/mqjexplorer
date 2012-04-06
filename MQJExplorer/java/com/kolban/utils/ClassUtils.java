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
