// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RepositoryName.java

package com.kolban.mqjexplorer.mqattributes;

import com.kolban.utils.StringUtils;

// Referenced classes of package com.kolban.mqjexplorer.mqattributes:
//            QMgrTextField

public class RepositoryName extends QMgrTextField
{

    public RepositoryName()
    {
        setColumns(20);
    }

    public String getValue()
    {
        String s = getText();
        return StringUtils.pad(s, 64);
    }

    public void setValue(String s)
    {
        setText(s.trim());
    }
}
