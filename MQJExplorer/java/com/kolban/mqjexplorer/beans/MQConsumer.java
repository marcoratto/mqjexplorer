// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQConsumer.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.*;

public class MQConsumer
    implements Runnable
{

    public MQConsumer()
    {
        stop = false;
        qMgr = null;
        qName = null;
        totalMessages = 0;
        startTime = 0L;
    }

    public long getElapsedTime()
    {
        return System.currentTimeMillis() - startTime;
    }

    public int getTotalMessages()
    {
        return totalMessages;
    }

    public void run()
    {
        MQQueue mqqueue = null;
        MQMessage mqmessage = new MQMessage();
        MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
        startTime = System.currentTimeMillis();
        totalMessages = 0;
        if(qName == null || qMgr == null)
            return;
        try
        {
            mqqueue = qMgr.accessQueue(qName, 1);
        }
        catch(Exception exception)
        {
            System.out.println("MQConsumer::run(): " + exception.toString());
        }
        mqgetmessageoptions.options = 8257;
        mqgetmessageoptions.waitInterval = 1000;
        mqgetmessageoptions.matchOptions = 0;
        try
        {
            mqmessage.resizeBuffer(1);
        }
        catch(Exception _ex) { }
        while(!stop) 
        {
            try
            {
                mqqueue.get(mqmessage, mqgetmessageoptions, 1);
                totalMessages++;
            }
            catch(MQException mqexception)
            {
                switch(mqexception.reasonCode)
                {
                case 2079: 
                    totalMessages++;
                    break;

                default:
                    System.out.println("Get exception ... " + mqexception.toString());
                    stop = true;
                    break;

                case 2033: 
                    break;
                }
            }
            if((totalMessages & 0xff) == 0)
                Thread.yield();
        }
        if(mqqueue != null)
            try
            {
                mqqueue.close();
            }
            catch(Exception _ex) { }
        System.out.println("MQConsumer thread ended ...");
    }

    public void setQMgr(MQQueueManager mqqueuemanager)
    {
        qMgr = mqqueuemanager;
    }

    public void setQName(String s)
    {
        qName = s;
    }

    public void setStop(boolean flag)
    {
        stop = flag;
    }

    private boolean stop;
    private MQQueueManager qMgr;
    private String qName;
    private int totalMessages;
    private long startTime;
}
