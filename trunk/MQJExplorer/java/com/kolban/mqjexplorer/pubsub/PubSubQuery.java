// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PubSubQuery.java

package com.kolban.mqjexplorer.pubsub;

import com.ibm.mq.*;
import com.ibm.mq.pcf.PCFMessage;
import com.ibm.mq.pcf.PCFParameter;
import com.kolban.mq.MQRFH;
import com.kolban.mq.PCFUtils;
import com.kolban.utils.StringUtils;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package com.kolban.mqjexplorer.pubsub:
//            MQPubSub, PubSubError, PubSubTopicInfo

public class PubSubQuery
{

    public PubSubQuery()
    {
        responseQueue = null;
        queueManagerName = null;
        queueManager = null;
        topicsVector = new Vector();
        allIdentities = false;
    }

    public void close()
    {
        try
        {
            if(responseQueue != null)
            {
                responseQueue.close();
                responseQueue = null;
            }
        }
        catch(MQException _ex) { }
    }

    private void executeStreamQuery()
    {
        String s = "\"MQ/" + queueManagerName + "/StreamSupport\"";
        MQRFH mqrfh = new MQRFH();
        mqrfh.addNameValue("MQPSCommand", "RegSub");
        mqrfh.addNameValue("MQPSTopic", s);
        mqrfh.addNameValue("MQPSRegOpts", "PubOnReqOnly");
        mqrfh.addNameValue("MQPSStreamName", "SYSTEM.BROKER.ADMIN.STREAM");
        mqrfh.addNameValue("MQPSQName", ((MQManagedObject) (responseQueue)).name);
        PubSubError pubsuberror = MQPubSub.execute(queueManager, mqrfh);
        if(pubsuberror != null)
        {
            System.out.println("Query error (RegSub): " + pubsuberror.toString());
            return;
        }
        mqrfh.reset();
        mqrfh.addNameValue("MQPSCommand", "ReqUpdate");
        mqrfh.addNameValue("MQPSTopic", s);
        mqrfh.addNameValue("MQPSStreamName", "SYSTEM.BROKER.ADMIN.STREAM");
        mqrfh.addNameValue("MQPSQName", ((MQManagedObject) (responseQueue)).name);
        pubsuberror = MQPubSub.execute(queueManager, mqrfh);
        if(pubsuberror != null)
        {
            System.out.println("Query error (ReqUpdate): " + pubsuberror.toString());
        } else
        {
            MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
            mqgetmessageoptions.options = 8193;
            mqgetmessageoptions.matchOptions = 0;
            mqgetmessageoptions.waitInterval = 1000;
            MQMessage mqmessage = new MQMessage();
            try
            {
                responseQueue.get(mqmessage, mqgetmessageoptions);
                PCFMessage pcfmessage = new PCFMessage(mqmessage);
                int i = PCFUtils.countItems(3036, pcfmessage);
                streamNameVector = new Vector(i);
                for(int j = 0; j < i; j++)
                    streamNameVector.add(PCFUtils.getStringParameter(3036, j, pcfmessage));

                System.out.println("Control: " + pcfmessage.getControl() + " " + pcfmessage.getMsgSeqNumber());
                PCFParameter pcfparameter;
                for(Enumeration enumeration = pcfmessage.getParameters(); enumeration.hasMoreElements(); System.out.println(pcfparameter.getParameter() + " " + pcfparameter.getStringValue()))
                    pcfparameter = (PCFParameter)enumeration.nextElement();

                int k = PCFUtils.countItems(3038, pcfmessage);
                for(int l = 0; l < k; l++)
                    System.out.println(PCFUtils.getStringParameter(3038, l, pcfmessage));

            }
            catch(Exception exception)
            {
                System.out.println("Exception: " + exception.toString());
            }
        }
        mqrfh.reset();
        mqrfh.addNameValue("MQPSCommand", "DeregSub");
        mqrfh.addNameValue("MQPSTopic", s);
        mqrfh.addNameValue("MQPSStreamName", "SYSTEM.BROKER.ADMIN.STREAM");
        mqrfh.addNameValue("MQPSQName", ((MQManagedObject) (responseQueue)).name);
        pubsuberror = MQPubSub.execute(queueManager, mqrfh);
        if(pubsuberror != null)
        {
            System.out.println("Query error (DeregSub): " + pubsuberror.toString());
            return;
        } else
        {
            return;
        }
    }

    private void executeSubscriptionQuery(String s)
    {
        boolean flag = false;
        if(topicsVector == null)
        {
            topicsVector = new Vector();
            flag = true;
        }
        String s1;
        if(allIdentities)
            s1 = "\"MQ/SA/" + queueManagerName + "/Subscribers/AllIdentities/" + s + "\"";
        else
            s1 = "\"MQ/S/" + queueManagerName + "/Subscribers/Identities/" + s + "\"";
        MQRFH mqrfh = new MQRFH();
        mqrfh.addNameValue("MQPSCommand", "RegSub");
        mqrfh.addNameValue("MQPSTopic", s1);
        mqrfh.addNameValue("MQPSRegOpts", "PubOnReqOnly");
        mqrfh.addNameValue("MQPSStreamName", getCurrentStream());
        mqrfh.addNameValue("MQPSQName", ((MQManagedObject) (responseQueue)).name);
        PubSubError pubsuberror = MQPubSub.execute(queueManager, mqrfh);
        if(pubsuberror != null)
        {
            System.out.println("Query error (RegSub): " + pubsuberror.toString());
        } else
        {
            mqrfh.reset();
            mqrfh.addNameValue("MQPSCommand", "ReqUpdate");
            mqrfh.addNameValue("MQPSTopic", s1);
            mqrfh.addNameValue("MQPSStreamName", getCurrentStream());
            mqrfh.addNameValue("MQPSQName", ((MQManagedObject) (responseQueue)).name);
            pubsuberror = MQPubSub.execute(queueManager, mqrfh);
            if(pubsuberror != null)
            {
                System.out.println("Query error (ReqUpdate): " + pubsuberror.toString());
                return;
            }
            MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
            mqgetmessageoptions.options = 8193;
            mqgetmessageoptions.matchOptions = 0;
            mqgetmessageoptions.waitInterval = 1000;
            MQMessage mqmessage = new MQMessage();
            try
            {
                do
                {
                    responseQueue.get(mqmessage, mqgetmessageoptions);
                    PCFMessage pcfmessage = new PCFMessage(mqmessage);
                    System.out.println("Control: " + pcfmessage.getControl() + " " + pcfmessage.getMsgSeqNumber());
                    String s2 = pcfmessage.getStringParameterValue(3031);
                    if(s2 != null)
                    {
                        if(s2.startsWith("MQ/S/"))
                            s2 = s2.substring(77);
                        else
                        if(s2.startsWith("MQ/SA/"))
                            s2 = s2.substring(81);
                        if(s2.startsWith("MQ/S/") || s2.startsWith("MQ/SA/"))
                            continue;
                        PubSubTopicInfo pubsubtopicinfo = new PubSubTopicInfo();
                        pubsubtopicinfo.applCount = pcfmessage.getIntParameterValue(1089);
                        pubsubtopicinfo.anonymousCount = pcfmessage.getIntParameterValue(1090);
                        pubsubtopicinfo.brokerCount = pcfmessage.getIntParameterValue(1088);
                        pubsubtopicinfo.topicName = s2;
                        pubsubtopicinfo.pcf = pcfmessage;
                        pubsubtopicinfo.setStream(getCurrentStream());
                        if(flag)
                        {
                            topicsVector.addElement(pubsubtopicinfo);
                        } else
                        {
                            boolean flag1 = false;
                            for(int k = 0; (k < topicsVector.size()) & (!flag1); k++)
                            {
                                PubSubTopicInfo pubsubtopicinfo1 = (PubSubTopicInfo)topicsVector.elementAt(k);
                                if(pubsubtopicinfo1.topicName.equals(pubsubtopicinfo.topicName))
                                {
                                    flag1 = true;
                                    topicsVector.setElementAt(pubsubtopicinfo, k);
                                }
                            }

                            if(!flag1)
                                topicsVector.addElement(pubsubtopicinfo);
                        }
                    }
                    PCFParameter pcfparameter;
                    for(Enumeration enumeration = pcfmessage.getParameters(); enumeration.hasMoreElements(); System.out.println(pcfparameter.getParameter() + " " + pcfparameter.getStringValue()))
                        pcfparameter = (PCFParameter)enumeration.nextElement();

                    int i = PCFUtils.countItems(3038, pcfmessage);
                    for(int j = 0; j < i; j++)
                        System.out.println(PCFUtils.getStringParameter(3038, j, pcfmessage));

                } while(true);
            }
            catch(Exception exception)
            {
                System.out.println("Exception: " + exception.toString());
            }
        }
        mqrfh.reset();
        mqrfh.addNameValue("MQPSCommand", "DeregSub");
        mqrfh.addNameValue("MQPSTopic", s1);
        mqrfh.addNameValue("MQPSStreamName", getCurrentStream());
        mqrfh.addNameValue("MQPSQName", ((MQManagedObject) (responseQueue)).name);
        pubsuberror = MQPubSub.execute(queueManager, mqrfh);
        if(pubsuberror != null)
        {
            System.out.println("Query error (DeregSub): " + pubsuberror.toString());
            return;
        } else
        {
            return;
        }
    }

    public void finalize()
        throws Throwable
    {
        close();
        super.finalize();
    }

    public String getCurrentStream()
    {
        return currentStream;
    }

    public int getStreamCount()
    {
        if(streamNameVector == null)
            return 0;
        else
            return streamNameVector.size();
    }

    public String getStreamName(int i)
    {
        if(streamNameVector == null || i >= streamNameVector.size())
            return null;
        else
            return (String)streamNameVector.elementAt(i);
    }

    public PubSubTopicInfo getTopic(int i)
    {
        return (PubSubTopicInfo)topicsVector.elementAt(i);
    }

    public int getTopicCount()
    {
        return topicsVector.size();
    }

    public boolean isAllIdentities()
    {
        return allIdentities;
    }

    public void refreshAll()
    {
        topicsVector = null;
        executeSubscriptionQuery("*");
    }

    public void refreshNamedTopic(String s)
    {
        executeSubscriptionQuery(s);
    }

    public void refreshStreams()
    {
        executeStreamQuery();
    }

    public void setAllIdentities(boolean flag)
    {
        allIdentities = flag;
    }

    public void setCurrentStream(String s)
    {
        currentStream = s;
    }

    public void setQueueManager(MQQueueManager mqqueuemanager)
    {
        queueManagerName = StringUtils.pad(((MQManagedObject) (mqqueuemanager)).name.trim(), 48);
        queueManager = mqqueuemanager;
        close();
        try
        {
            responseQueue = mqqueuemanager.accessQueue("AMQSPSD.PERMDYN.MODEL.QUEUE", 8193, null, "MQJ.*", null);
            responseQueue.closeOptions = 2;
        }
        catch(MQException mqexception)
        {
            System.out.println("Exception: " + mqexception.toString());
            close();
        }
    }

    private MQQueue responseQueue;
    private String queueManagerName;
    private MQQueueManager queueManager;
    private Vector topicsVector;
    public static final String ALL_TOPICS = "*";
    private Vector streamNameVector;
    private String currentStream;
    private boolean allIdentities;
}
