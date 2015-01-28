// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PubSubError.java

package com.kolban.mqjexplorer.pubsub;

import com.ibm.mq.MQException;
import com.kolban.mq.MQRFH;

public class PubSubError
{

    public PubSubError(MQException mqexception)
    {
        reason = 0;
        reasonText = "";
        errorId = 0;
        errorPos = -1;
        reasonText = mqexception.toString();
    }

    public PubSubError(MQRFH mqrfh)
    {
        reason = 0;
        reasonText = "";
        errorId = 0;
        errorPos = -1;
        reasonText = mqrfh.getValue("MQPSReasonText");
        String s = mqrfh.getValue("MQPSErrorId");
        if(s == null)
            errorId = -1;
        else
            errorId = Integer.parseInt(s);
        s = mqrfh.getValue("MQPSReason");
        if(s == null)
            errorId = -1;
        else
            reason = Integer.parseInt(s);
        s = mqrfh.getValue("MQPSErrorPos");
        if(s == null)
            errorPos = -1;
        else
            errorPos = Integer.parseInt(s);
    }

    public int getErrorId()
    {
        return errorId;
    }

    public int getReason()
    {
        return reason;
    }

    public String getReasonText()
    {
        return reasonText;
    }

    public String toString()
    {
        String s = "Reason: " + reason + " : " + reasonText + " : " + errorId;
        if(errorPos >= 0)
            s = s + " Position:" + errorPos;
        return s;
    }

    private int reason;
    private String reasonText;
    private int errorId;
    private int errorPos;
}
