// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FooterListener.java

package com.kolban.swing;

import java.util.EventListener;
import java.util.EventObject;

public interface FooterListener
    extends EventListener
{

    public abstract void cancel(EventObject eventobject);

    public abstract void ok(EventObject eventobject);
}
