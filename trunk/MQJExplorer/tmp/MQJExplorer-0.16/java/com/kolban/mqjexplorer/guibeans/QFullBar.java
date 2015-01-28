// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QFullBar.java

package com.kolban.mqjexplorer.guibeans;


public class QFullBar
    implements Comparable
{

    public QFullBar()
    {
        maxQDepth = 1;
        qDepth = 1;
    }

    public int compareTo(Object obj)
    {
        QFullBar qfullbar;
        try
        {
            qfullbar = (QFullBar)obj;
        }
        catch(ClassCastException _ex)
        {
            return 0;
        }
        if(qDepth < qfullbar.qDepth)
            return -1;
        return qDepth <= qfullbar.qDepth ? 0 : 1;
    }

    public int maxQDepth;
    public int qDepth;
}
