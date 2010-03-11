// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQMD.java

package com.kolban.mq;

import com.ibm.mq.MQMessage;
import com.kolban.utils.StringUtils;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MQMD
{
    class MQMDTableModel extends DefaultTableModel
    {

        public boolean isCellEditable(int i, int j)
        {
            return false;
        }

        MQMDTableModel(Object aobj[][], Object aobj1[])
        {
            super(aobj, aobj1);
        }
    }


    public MQMD()
    {
    }

    public MQMD(MQMessage mqmessage)
    {
        setFromMessage(mqmessage);
    }

    public void setFromMessage(MQMessage mqmessage)
    {
        try
        {
            mqmd = new com.ibm.mq.MQMD();
            mqmessage.skipBytes(4);
            mqmd.setVersion(mqmessage.readInt());
            mqmd.report = mqmessage.readInt();
            mqmd.messageType = mqmessage.readInt();
            mqmd.expiry = mqmessage.readInt();
            mqmd.feedback = mqmessage.readInt();
            mqmd.encoding = mqmessage.readInt();
            mqmd.characterSet = mqmessage.readInt();
            mqmd.format = mqmessage.readString(8);
            mqmd.priority = mqmessage.readInt();
            mqmd.persistence = mqmessage.readInt();
            mqmessage.readFully(mqmd.messageId);
            mqmessage.readFully(mqmd.correlationId);
            mqmd.backoutCount = mqmessage.readInt();
            mqmd.replyToQueueName = mqmessage.readString(48);
            mqmd.replyToQueueManagerName = mqmessage.readString(48);
            mqmd.userId = mqmessage.readString(12);
            mqmessage.readFully(mqmd.accountingToken);
            mqmd.applicationIdData = mqmessage.readString(32);
            mqmd.putApplicationType = mqmessage.readInt();
            mqmd.putApplicationName = mqmessage.readString(28);
            String s = mqmessage.readString(16);
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmmssSS");
            mqmd.putDateTime = new GregorianCalendar();
            mqmd.putDateTime.setTime(simpledateformat.parse(s));
            mqmd.applicationOriginData = mqmessage.readString(4);
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
            exception.printStackTrace();
        }
    }

    public JTable toTable(com.ibm.mq.MQMD mqmd1)
    {
        String as[] = {
            "Property", "Value"
        };
        Object aobj[][] = {
            {
                "Version", new Integer(mqmd1.getVersion())
            }, {
                "Report", new Integer(mqmd1.report)
            }, {
                "MsgType", new Integer(mqmd1.messageType)
            }, {
                "Expiry", new Integer(mqmd1.expiry)
            }, {
                "Feedback", new Integer(mqmd1.feedback)
            }, {
                "CodedCharSetId", new Integer(mqmd1.characterSet)
            }, {
                "Format", mqmd1.format
            }, {
                "Priority", new Integer(mqmd1.priority)
            }, {
                "Persistence", new Integer(mqmd1.persistence)
            }, {
                "MsgId", StringUtils.byteArrayToHexString(mqmd1.messageId)
            }, {
                "CorrelId", StringUtils.byteArrayToHexString(mqmd1.correlationId)
            }, {
                "BackoutCount", new Integer(mqmd1.backoutCount)
            }, {
                "ReplyToQ", mqmd1.replyToQueueName
            }, {
                "ReplyToQMgr", mqmd1.replyToQueueManagerName
            }, {
                "UserIdentifier", mqmd1.userId
            }, {
                "AccountingToken", StringUtils.byteArrayToHexString(mqmd1.accountingToken)
            }, {
                "ApplIdentityData", mqmd1.applicationIdData
            }, {
                "PutDate", (new SimpleDateFormat("yyyy-MM-dd")).format(mqmd1.putDateTime.getTime())
            }, {
                "PutTime", (new SimpleDateFormat("HH:mm:ss.SS")).format(mqmd1.putDateTime.getTime())
            }, {
                "ApplOriginData", mqmd1.applicationOriginData
            }
        };
        MQMDTableModel mqmdtablemodel = new MQMDTableModel(aobj, as);
        JTable jtable = new JTable(mqmdtablemodel);
        return jtable;
    }

    public com.ibm.mq.MQMD mqmd;
}
