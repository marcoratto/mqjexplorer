// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FooterListenerEventMulticaster.java

package com.kolban.swing;

import java.awt.AWTEventMulticaster;
import java.util.EventListener;
import java.util.EventObject;

// Referenced classes of package com.kolban.swing:
//            FooterListener

public class FooterListenerEventMulticaster extends AWTEventMulticaster
    implements FooterListener
{

    protected FooterListenerEventMulticaster(EventListener eventlistener, EventListener eventlistener1)
    {
        super(eventlistener, eventlistener1);
    }

    public static FooterListener add(FooterListener footerlistener, FooterListener footerlistener1)
    {
        return (FooterListener)addInternal(footerlistener, footerlistener1);
    }

    protected static EventListener addInternal(EventListener eventlistener, EventListener eventlistener1)
    {
        if(eventlistener == null)
            return eventlistener1;
        if(eventlistener1 == null)
            return eventlistener;
        else
            return new FooterListenerEventMulticaster(eventlistener, eventlistener1);
    }

    public void cancel(EventObject eventobject)
    {
        ((FooterListener)super.a).cancel(eventobject);
        ((FooterListener)super.b).cancel(eventobject);
    }

    public void ok(EventObject eventobject)
    {
        ((FooterListener)super.a).ok(eventobject);
        ((FooterListener)super.b).ok(eventobject);
    }

    protected EventListener remove(FooterListener footerlistener)
    {
        if(footerlistener == super.a)
            return super.b;
        if(footerlistener == super.b)
            return super.a;
        EventListener eventlistener = AWTEventMulticaster.removeInternal(super.a, footerlistener);
        EventListener eventlistener1 = AWTEventMulticaster.removeInternal(super.b, footerlistener);
        if(eventlistener == super.a && eventlistener1 == super.b)
            return this;
        else
            return addInternal(eventlistener, eventlistener1);
    }

    public static FooterListener remove(FooterListener footerlistener, FooterListener footerlistener1)
    {
        if(footerlistener == footerlistener1 || footerlistener == null)
            return null;
        if(footerlistener instanceof FooterListenerEventMulticaster)
            return (FooterListener)((FooterListenerEventMulticaster)footerlistener).remove(footerlistener1);
        else
            return footerlistener;
    }
}
