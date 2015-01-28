// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQSeriesTreeListener.java

package com.kolban.mqjexplorer;

import java.awt.event.ActionEvent;

// Referenced classes of package com.kolban.mqjexplorer:
//            QueueManagerModel

public interface MQSeriesTreeListener
{

    public abstract void disconnectQueueManager(QueueManagerModel queuemanagermodel);

    public abstract void menuAction(ActionEvent actionevent);

    public abstract void treeSelection(Object obj, int i);
}
