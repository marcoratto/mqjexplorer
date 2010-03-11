// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQDLH.java

package com.kolban.mq;

import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;

public class MQDLH
{

    public MQDLH()
    {
    }

    public void setFromMessage(MQMessage mqmessage)
    {
        if(!((MQMD) (mqmessage)).format.equals("MQDEAD  "))
            return;
        try
        {
            mqmessage.seek(0);
            strucId = mqmessage.readString(4);
            version = mqmessage.readInt();
            reason = mqmessage.readInt();
            destQName = mqmessage.readString(48);
            destQMgrName = mqmessage.readString(48);
            encoding = mqmessage.readInt();
            codedCharSetId = mqmessage.readInt();
            format = mqmessage.readString(8);
            putApplType = mqmessage.readInt();
            putApplName = mqmessage.readString(28);
            putDate = mqmessage.readString(8);
            putTime = mqmessage.readString(8);
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public String strucId;
    public int version;
    public int reason;
    public String destQName;
    public String destQMgrName;
    public int encoding;
    public int codedCharSetId;
    public String format;
    public int putApplType;
    public String putApplName;
    public String putDate;
    public String putTime;
}
