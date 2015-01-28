// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcessName2.java

package com.kolban.mqjexplorer.mqattributes;

import com.kolban.utils.StringUtils;

// Referenced classes of package com.kolban.mqjexplorer.mqattributes:
//            ProcessNameComboBox

public class ProcessName2 extends ProcessNameComboBox
{

    public ProcessName2()
    {
        setEditable(true);
    }

    public String getValue()
    {
        return StringUtils.pad((String)getSelectedItem(), 48);
    }

    public void init(String as[])
    {
        for(int i = 0; i < as.length; i++)
            addItem(as[i].trim());

    }

    public void setValue(String s)
    {
        setSelectedItem(s.trim());
    }
}
