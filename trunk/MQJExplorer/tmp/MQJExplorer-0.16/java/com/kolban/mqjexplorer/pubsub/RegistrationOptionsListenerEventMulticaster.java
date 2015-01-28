// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegistrationOptionsListenerEventMulticaster.java

package com.kolban.mqjexplorer.pubsub;

import java.awt.AWTEventMulticaster;
import java.util.EventListener;
import java.util.EventObject;

// Referenced classes of package com.kolban.mqjexplorer.pubsub:
//            RegistrationOptionsListener

public class RegistrationOptionsListenerEventMulticaster extends AWTEventMulticaster
    implements RegistrationOptionsListener
{

    protected RegistrationOptionsListenerEventMulticaster(EventListener eventlistener, EventListener eventlistener1)
    {
        super(eventlistener, eventlistener1);
    }

    public static RegistrationOptionsListener add(RegistrationOptionsListener registrationoptionslistener, RegistrationOptionsListener registrationoptionslistener1)
    {
        return (RegistrationOptionsListener)addInternal(registrationoptionslistener, registrationoptionslistener1);
    }

    protected static EventListener addInternal(EventListener eventlistener, EventListener eventlistener1)
    {
        if(eventlistener == null)
            return eventlistener1;
        if(eventlistener1 == null)
            return eventlistener;
        else
            return new RegistrationOptionsListenerEventMulticaster(eventlistener, eventlistener1);
    }

    public void correlAsIdItem_itemStateChanged(EventObject eventobject)
    {
        ((RegistrationOptionsListener)super.a).correlAsIdItem_itemStateChanged(eventobject);
        ((RegistrationOptionsListener)super.b).correlAsIdItem_itemStateChanged(eventobject);
    }

    protected EventListener remove(RegistrationOptionsListener registrationoptionslistener)
    {
        if(registrationoptionslistener == super.a)
            return super.b;
        if(registrationoptionslistener == super.b)
            return super.a;
        EventListener eventlistener = AWTEventMulticaster.removeInternal(super.a, registrationoptionslistener);
        EventListener eventlistener1 = AWTEventMulticaster.removeInternal(super.b, registrationoptionslistener);
        if(eventlistener == super.a && eventlistener1 == super.b)
            return this;
        else
            return addInternal(eventlistener, eventlistener1);
    }

    public static RegistrationOptionsListener remove(RegistrationOptionsListener registrationoptionslistener, RegistrationOptionsListener registrationoptionslistener1)
    {
        if(registrationoptionslistener == registrationoptionslistener1 || registrationoptionslistener == null)
            return null;
        if(registrationoptionslistener instanceof RegistrationOptionsListenerEventMulticaster)
            return (RegistrationOptionsListener)((RegistrationOptionsListenerEventMulticaster)registrationoptionslistener).remove(registrationoptionslistener1);
        else
            return registrationoptionslistener;
    }
}
