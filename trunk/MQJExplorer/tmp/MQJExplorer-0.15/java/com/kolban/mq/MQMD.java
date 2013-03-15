/*
 * Copyright (C) 2012 Marco Ratto
 *
 * This file is part of the project MQJExplorer.
 *
 * MQJExplorer is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * any later version.
 *
 * MQJExplorer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MQJExplorer; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.kolban.mq;

import com.ibm.mq.MQMessage;
import com.kolban.utils.StringUtils;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

public class MQMD
{
	private final static Logger logger = Logger.getLogger(MQMD.class);
	
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
            logger.error("Exception: " + exception.toString());
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
