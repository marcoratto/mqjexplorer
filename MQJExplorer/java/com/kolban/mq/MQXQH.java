// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQXQH.java

package com.kolban.mq;

import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;

// Referenced classes of package com.kolban.mq:
//            MQMD

public class MQXQH
{

    public MQXQH()
    {
    }

    public void setFromMessage(MQMessage mqmessage)
    {
        if(!((MQMD) (mqmessage)).format.equals("MQXMIT  "))
            return;
        try
        {
            mqmessage.seek(0);
            strucId = mqmessage.readString(4);
            version = mqmessage.readInt();
            remoteQName = mqmessage.readString(48);
            remoteQMgrName = mqmessage.readString(48);
            com.kolban.mq.MQMD mqmd1 = new com.kolban.mq.MQMD(mqmessage);
            mqmd = mqmd1.mqmd;
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public String remoteQName;
    public String remoteQMgrName;
    public String strucId;
    int version;
    public MQMD mqmd;
}
