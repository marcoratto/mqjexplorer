// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QMgrDesc.java

package com.kolban.mqjexplorer.mqattributes;

import com.kolban.utils.StringUtils;

// Referenced classes of package com.kolban.mqjexplorer.mqattributes:
//            QMgrTextField

public class QMgrDesc extends QMgrTextField
{

    public QMgrDesc()
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
