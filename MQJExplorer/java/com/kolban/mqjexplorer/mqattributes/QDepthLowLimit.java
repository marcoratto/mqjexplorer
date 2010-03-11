// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QDepthLowLimit.java

package com.kolban.mqjexplorer.mqattributes;

// Referenced classes of package com.kolban.mqjexplorer.mqattributes:
//            NumericTextField

public class QDepthLowLimit extends NumericTextField
{

    public QDepthLowLimit()
    {
    }

    public int getValue()
    {
        return Integer.parseInt(getText());
    }

    public void setValue(int i)
    {
        setText(Integer.toString(i));
    }
}
