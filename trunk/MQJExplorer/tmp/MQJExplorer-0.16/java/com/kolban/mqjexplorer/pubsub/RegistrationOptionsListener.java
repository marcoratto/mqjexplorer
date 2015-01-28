// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegistrationOptionsListener.java

package com.kolban.mqjexplorer.pubsub;

import java.util.EventListener;
import java.util.EventObject;

public interface RegistrationOptionsListener
    extends EventListener
{

    public abstract void correlAsIdItem_itemStateChanged(EventObject eventobject);
}
