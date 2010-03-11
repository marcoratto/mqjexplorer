// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DLQProcessor.java

package com.kolban.mqjexplorer.dlq;

import com.ibm.mq.*;
import com.kolban.mq.MQDLH;

// Referenced classes of package com.kolban.mqjexplorer.dlq:
//            DLQRule

public class DLQProcessor
    implements Runnable
{

    public DLQProcessor()
    {
    }

    public DLQRule[] getRules()
    {
        return rules;
    }

    private boolean match(DLQRule dlqrule, MQMessage mqmessage)
    {
        if(!dlqrule.isEnabled())
            return false;
        MQDLH mqdlh = new MQDLH();
        mqdlh.setFromMessage(mqmessage);
        if(dlqrule.getReason() >= 0 && dlqrule.getReason() == mqdlh.reason)
        {
            System.out.println("Matched reason!");
            return true;
        } else
        {
            return false;
        }
    }

    public void run()
    {
        String s = "DLQ";
        MQQueue mqqueue = null;
        MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
        MQMessage mqmessage = new MQMessage();
        mqgetmessageoptions.matchOptions = 0;
        mqgetmessageoptions.waitInterval = -1;
        mqgetmessageoptions.options = 8193;
        try
        {
            mqqueue = qMgr.accessQueue(s, 8);
            mqqueue.get(mqmessage, mqgetmessageoptions);
            if(((MQMD) (mqmessage)).format.equals("MQDEAD  "))
            {
                for(int i = 0; i < rules.length; i++)
                    if(match(rules[i], mqmessage))
                        break;

            } else
            {
                System.out.println("Skipped ... not a DLQ message");
            }
        }
        catch(MQException _ex) { }
        try
        {
            if(mqqueue != null)
                mqqueue.close();
        }
        catch(MQException _ex) { }
    }

    public void setQMgr(MQQueueManager mqqueuemanager)
    {
        qMgr = mqqueuemanager;
    }

    public void setRules(DLQRule adlqrule[])
    {
        rules = adlqrule;
    }

    private DLQRule rules[];
    private MQQueueManager qMgr;
}
