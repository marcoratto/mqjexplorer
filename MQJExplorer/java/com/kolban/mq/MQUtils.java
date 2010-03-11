// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQUtils.java

package com.kolban.mq;

import com.ibm.mq.*;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.Observer;

public class MQUtils
{

    public MQUtils()
    {
    }

    public static MQMessage getIndexedMessage(MQQueueManager mqqueuemanager, String s, int i)
    {
        MQQueue mqqueue = null;
        MQMessage mqmessage = new MQMessage();
        MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
        mqgetmessageoptions.matchOptions = 0;
        mqgetmessageoptions.options = 8288;
        try
        {
            mqqueue = mqqueuemanager.accessQueue(s, 8201);
            for(int j = 0; j < i; j++)
                try
                {
                    mqqueue.get(mqmessage, mqgetmessageoptions, 1);
                }
                catch(MQException mqexception2)
                {
                    if(mqexception2.reasonCode != 2079)
                        throw mqexception2;
                }

            try
            {
                mqgetmessageoptions.options = 8224;
                mqqueue.get(mqmessage, mqgetmessageoptions);
            }
            catch(MQException mqexception)
            {
                if(mqexception.reasonCode != 2079)
                    throw mqexception;
            }
        }
        catch(MQException mqexception1)
        {
            mqmessage = null;
            System.out.println("Exception: " + mqexception1.toString());
        }
        try
        {
            if(mqqueue != null)
                mqqueue.close();
        }
        catch(Exception _ex) { }
        return mqmessage;
    }

    public static int qDepth(MQQueueManager mqqueuemanager, String s)
    {
        MQQueue mqqueue = null;
        int i = 0;
        try
        {
            mqqueue = mqqueuemanager.accessQueue(s, 32);
            i = mqqueue.getCurrentDepth();
        }
        catch(Exception _ex) { }
        if(mqqueue != null)
            try
            {
                mqqueue.close();
            }
            catch(Exception _ex) { }
        return i;
    }

    private static MQMessage readMessage(ObjectInputStream objectinputstream)
        throws Exception
    {
        MQMessage mqmessage = new MQMessage();
        mqmessage.report = objectinputstream.readInt();
        mqmessage.messageType = objectinputstream.readInt();
        mqmessage.expiry = objectinputstream.readInt();
        mqmessage.feedback = objectinputstream.readInt();
        mqmessage.encoding = objectinputstream.readInt();
        mqmessage.characterSet = objectinputstream.readInt();
        mqmessage.feedback = objectinputstream.readInt();
        mqmessage.format = (String)objectinputstream.readObject();
        mqmessage.priority = objectinputstream.readInt();
        mqmessage.persistence = objectinputstream.readInt();
        objectinputstream.readFully(mqmessage.messageId);
        objectinputstream.readFully(mqmessage.correlationId);
        mqmessage.backoutCount = objectinputstream.readInt();
        mqmessage.replyToQueueName = (String)objectinputstream.readObject();
        mqmessage.replyToQueueManagerName = (String)objectinputstream.readObject();
        mqmessage.userId = (String)objectinputstream.readObject();
        objectinputstream.readFully(mqmessage.accountingToken);
        mqmessage.applicationIdData = (String)objectinputstream.readObject();
        mqmessage.putApplicationType = objectinputstream.readInt();
        mqmessage.putApplicationName = (String)objectinputstream.readObject();
        mqmessage.putDateTime = (GregorianCalendar)objectinputstream.readObject();
        mqmessage.applicationOriginData = (String)objectinputstream.readObject();
        objectinputstream.readFully(mqmessage.groupId);
        mqmessage.messageSequenceNumber = objectinputstream.readInt();
        mqmessage.offset = objectinputstream.readInt();
        mqmessage.messageFlags = objectinputstream.readInt();
        mqmessage.originalLength = objectinputstream.readInt();
        int i = objectinputstream.readInt();
        byte abyte0[] = new byte[i];
        objectinputstream.readFully(abyte0);
        mqmessage.write(abyte0);
        return mqmessage;
    }

    public static int readQueueFromFile(MQQueueManager mqqueuemanager, String s, String s1, Observer observer)
        throws Exception
    {
        MQQueue mqqueue = null;
        Object obj = null;
        MQPutMessageOptions mqputmessageoptions = new MQPutMessageOptions();
        FileInputStream fileinputstream = null;
        int i = 0;
        Exception exception = null;
        Object obj1 = null;
        boolean flag = false;
        Object obj2 = null;
        try
        {
            fileinputstream = new FileInputStream(s1);
            ObjectInputStream objectinputstream;
            try
            {
                objectinputstream = new ObjectInputStream(fileinputstream);
                String s2 = (String)objectinputstream.readObject();
                int j = objectinputstream.readInt();
                if(s2 == null || !s2.equals("MQJEXPLORER") || j != 0x10001)
                    throw new Exception("Bad file");
            }
            catch(Exception _ex)
            {
                throw new Exception("Not a valid MQJExplorer data file");
            }
            String _tmp = (String)objectinputstream.readObject();
            int k = objectinputstream.readInt();
            if(observer != null)
                observer.update(null, new Integer(k));
            mqqueue = mqqueuemanager.accessQueue(s, 10256);
            mqputmessageoptions.options = 10244;
            for(i = 0; i < k; i++)
            {
                MQMessage mqmessage = readMessage(objectinputstream);
                mqqueue.put(mqmessage, mqputmessageoptions);
                if(observer != null)
                    observer.update(null, new Integer(i + 1));
            }

        }
        catch(Exception exception1)
        {
            System.out.println("Exception: " + exception1.toString());
            exception = exception1;
        }
        if(mqqueue != null)
            try
            {
                mqqueue.close();
            }
            catch(Exception _ex) { }
        if(fileinputstream != null)
            try
            {
                fileinputstream.close();
            }
            catch(Exception _ex) { }
        if(exception != null)
            throw exception;
        else
            return i;
    }

    private static void writeMessage(MQMessage mqmessage, ObjectOutputStream objectoutputstream)
    {
        try
        {
            objectoutputstream.writeInt(mqmessage.report);
            objectoutputstream.writeInt(mqmessage.messageType);
            objectoutputstream.writeInt(mqmessage.expiry);
            objectoutputstream.writeInt(mqmessage.feedback);
            objectoutputstream.writeInt(mqmessage.encoding);
            objectoutputstream.writeInt(mqmessage.characterSet);
            objectoutputstream.writeInt(mqmessage.feedback);
            objectoutputstream.writeObject(mqmessage.format);
            objectoutputstream.writeInt(mqmessage.priority);
            objectoutputstream.writeInt(mqmessage.persistence);
            objectoutputstream.write(mqmessage.messageId);
            objectoutputstream.write(mqmessage.correlationId);
            objectoutputstream.writeInt(mqmessage.backoutCount);
            objectoutputstream.writeObject(mqmessage.replyToQueueName);
            objectoutputstream.writeObject(mqmessage.replyToQueueManagerName);
            objectoutputstream.writeObject(mqmessage.userId);
            objectoutputstream.write(mqmessage.accountingToken);
            objectoutputstream.writeObject(mqmessage.applicationIdData);
            objectoutputstream.writeInt(mqmessage.putApplicationType);
            objectoutputstream.writeObject(mqmessage.putApplicationName);
            objectoutputstream.writeObject(mqmessage.putDateTime);
            objectoutputstream.writeObject(mqmessage.applicationOriginData);
            objectoutputstream.write(mqmessage.groupId);
            objectoutputstream.writeInt(mqmessage.messageSequenceNumber);
            objectoutputstream.writeInt(mqmessage.offset);
            objectoutputstream.writeInt(mqmessage.messageFlags);
            objectoutputstream.writeInt(mqmessage.originalLength);
            mqmessage.seek(0);
            objectoutputstream.writeInt(mqmessage.getMessageLength());
            byte abyte0[] = new byte[mqmessage.getMessageLength()];
            mqmessage.readFully(abyte0);
            objectoutputstream.write(abyte0);
        }
        catch(Exception exception)
        {
            System.out.println("Exception writing MQMessage: " + exception.toString());
        }
    }

    public static int writeQueueToFile(MQQueueManager mqqueuemanager, String s, String s1, Observer observer)
    {
        Object obj = null;
        MQMessage mqmessage = new MQMessage();
        MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
        BufferedOutputStream bufferedoutputstream = null;
        ObjectOutputStream objectoutputstream = null;
        int i = 0;
        boolean flag = false;
        try
        {
            bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(s1));
            objectoutputstream = new ObjectOutputStream(bufferedoutputstream);
            objectoutputstream.writeObject("MQJEXPLORER");
            objectoutputstream.writeInt(0x10001);
            objectoutputstream.writeObject(s);
            MQQueue mqqueue = mqqueuemanager.accessQueue(s, 8233);
            int j = mqqueue.getCurrentDepth();
            objectoutputstream.writeInt(j);
            try
            {
                mqgetmessageoptions.options = 8224;
                mqgetmessageoptions.matchOptions = 0;
                do
                {
                    do
                    {
                        mqqueue.get(mqmessage, mqgetmessageoptions);
                        writeMessage(mqmessage, objectoutputstream);
                        i++;
                    } while(observer == null);
                    observer.update(null, new Integer(i));
                } while(true);
            }
            catch(MQException mqexception)
            {
                if(mqexception.reasonCode != 2033)
                    System.out.println("Exception: " + mqexception.toString());
            }
            objectoutputstream.flush();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        if(objectoutputstream != null)
            try
            {
                objectoutputstream.close();
            }
            catch(Exception _ex) { }
        if(bufferedoutputstream != null)
            try
            {
                bufferedoutputstream.flush();
                bufferedoutputstream.close();
            }
            catch(Exception _ex) { }
        return i;
    }
}
