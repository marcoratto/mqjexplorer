// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQPubSub.java

package com.kolban.mqjexplorer.pubsub;

import com.ibm.mq.*;
import com.kolban.mq.MQRFH;

// Referenced classes of package com.kolban.mqjexplorer.pubsub:
//            PubSubError

public class MQPubSub
{

    public MQPubSub()
    {
    }

    public static PubSubError execute(MQQueueManager mqqueuemanager, MQRFH mqrfh)
    {
        return execute(mqqueuemanager, mqrfh, null);
    }

    public static PubSubError execute(MQQueueManager mqqueuemanager, MQRFH mqrfh, byte abyte0[])
    {
        MQQueue mqqueue = null;
        PubSubError pubsuberror = null;
        try
        {
            MQQueue mqqueue1 = mqqueuemanager.accessQueue("SYSTEM.BROKER.CONTROL.QUEUE", 8208);
            mqqueue = mqqueuemanager.accessQueue("AMQSPSD.PERMDYN.MODEL.QUEUE", 1, null, "MQJ.*", null);
            System.out.println("Response queue: " + ((MQManagedObject) (mqqueue)).name);
            MQMessage mqmessage = mqrfh.getMessage();
            mqmessage.messageType = 1;
            mqmessage.replyToQueueName = ((MQManagedObject) (mqqueue)).name;
            if(abyte0 != null)
                mqmessage.correlationId = abyte0;
            mqqueue1.put(mqmessage);
            mqqueue1.close();
            MQMessage mqmessage1 = new MQMessage();
            MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
            mqgetmessageoptions.options = 1;
            mqgetmessageoptions.waitInterval = 5000;
            mqqueue.get(mqmessage1, mqgetmessageoptions);
            System.out.println("Got a response!!");
            MQRFH mqrfh1 = new MQRFH();
            mqrfh1.setFromMessage(mqmessage1);
            String s = mqrfh1.getValue("MQPSReason");
            if(s != null && !s.equals("0"))
            {
                pubsuberror = new PubSubError(mqrfh1);
                System.out.println(pubsuberror.toString());
            }
        }
        catch(MQException mqexception)
        {
            System.out.println("Exception: " + mqexception.toString());
            pubsuberror = new PubSubError(mqexception);
        }
        if(mqqueue != null)
            try
            {
                mqqueue.closeOptions = 2;
                mqqueue.close();
            }
            catch(MQException _ex) { }
        return pubsuberror;
    }

    public static final String CONTROL_QUEUE = "SYSTEM.BROKER.CONTROL.QUEUE";
    public static final String ADMIN_STREAM = "SYSTEM.BROKER.ADMIN.STREAM";
    public static final String MQPS_CORREL_ID_AS_IDENTITY = "CorrelAsId";
    public static final String MQPS_REQUEST_UPDATE = "ReqUpdate";
    public static final String MQPS_DEREGISTER_SUBSCRIBER = "DeregSub";
    public static final String DEFAULT_STREAM = "SYSTEM.BROKER.DEFAULT.STREAM";
    public static final String MQPSCommand = "MQPSCommand";
    public static final String MQPSTopic = "MQPSTopic";
    public static final String MQPSRegOpts = "MQPSRegOpts";
    public static final String MQPSStreamName = "MQPSStreamName";
    public static final String MQPSQMgrName = "MQPSQMgrName";
    public static final String MQPSQName = "MQPSQName";
}
