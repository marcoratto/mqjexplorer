// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MessageListTableModel.java

package com.kolban.mqjexplorer;

import com.ibm.mq.*;
import com.kolban.utils.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

// Referenced classes of package com.kolban.mqjexplorer:
//            TextIcon, QueueManagerModel

public class MessageListTableModel extends AbstractTableModel
{

    public MessageListTableModel()
    {
        startMessage = 0;
        messageVector = new Vector(200);
    }

    public Class getColumnClass(int i)
    {
        switch(i)
        {
        case 0: // '\0'
            return com.kolban.mqjexplorer.TextIcon.class;
        }
        return java.lang.String.class;
    }

    public int getColumnCount()
    {
        return columnNames.length;
    }

    public String getColumnName(int i)
    {
        return columnNames[i];
    }

    public MQMessage getMessage(int i)
    {
        return (MQMessage)messageVector.get(i);
    }

    public int getRowCount()
    {
        return messageVector.size();
    }

    public int getStartMessage()
    {
        return startMessage;
    }

    public Object getValueAt(int i, int j)
    {
        String s = getColumnName(j);
        MQMessage mqmessage = (MQMessage)messageVector.get(i);
        if(s.equals("Position"))
        {
            TextIcon texticon = new TextIcon();
            texticon.setText(Integer.toString(i + 1 + startMessage));
            texticon.setIcon(new ImageIcon(getClass().getResource("/icons/letter1.gif")));
            return texticon;
        }
        if(s.equals("Put Date/Time"))
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("M/dd/yyyy h:mm:ss aa");
            return simpledateformat.format(((MQMD) (mqmessage)).putDateTime.getTime());
        }
        if(s.equals("User Identifier"))
            return ((MQMD) (mqmessage)).userId;
        if(s.equals("Put Application Name"))
            return ((MQMD) (mqmessage)).putApplicationName;
        if(s.equals("Format"))
            return ((MQMD) (mqmessage)).format;
        if(s.equals("Data Length"))
            try
            {
                return Integer.toString(mqmessage.getMessageLength());
            }
            catch(Exception _ex)
            {
                return "Err";
            }
        if(s.equals("Message Data"))
            if(((MQMD) (mqmessage)).format.equals("MQSTR   "))
                try
                {
                    mqmessage.seek(0);
                    return mqmessage.readString(mqmessage.getDataLength());
                }
                catch(Exception _ex)
                {
                    return "";
                }
            else
                return "";
        if(s.equals("Accounting Token"))
            return StringUtils.byteArrayToHexString(((MQMD) (mqmessage)).accountingToken);
        if(s.equals("Application Identity Data"))
            return ((MQMD) (mqmessage)).applicationIdData;
        if(s.equals("Application Origin Data"))
            return ((MQMD) (mqmessage)).applicationOriginData;
        if(s.equals("Application Type"))
            switch(((MQMD) (mqmessage)).putApplicationType)
            {
            case 6: // '\006'
                return "Unix";

            case 1: // '\001'
                return "CICS";

            case 21: // '\025'
                return "CICS Bridge";

            case 10: // '\n'
                return "CICS/VSE";

            case 5: // '\005'
                return "DOS";

            case 13: // '\r'
                return "Guardian/NSK";

            case 3: // '\003'
                return "IMS";

            case 19: // '\023'
                return "IMS Bridge";

            case 28: // '\034'
                return "Java";

            case 2: // '\002'
                return "MVS";

            case 22: // '\026'
                return "Notes";

            case 4: // '\004'
                return "OS/2";

            case 8: // '\b'
                return "OS/400";

            case 12: // '\f'
                return "VMS";

            case 9: // '\t'
                return "Windows";

            case 11: // '\013'
                return "Windows NT";

            case 7: // '\007'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 20: // '\024'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            default:
                return "Unknown: " + Integer.toString(((MQMD) (mqmessage)).putApplicationType);
            }
        if(s.equals("Backout Count"))
            return Integer.toString(((MQMD) (mqmessage)).backoutCount);
        if(s.equals("Coded Character Set ID"))
            return Integer.toString(((MQMD) (mqmessage)).characterSet);
        if(s.equals("Correlation ID"))
            return new String(((MQMD) (mqmessage)).correlationId);
        if(s.equals("Correlation ID Bytes"))
            return StringUtils.byteArrayToHexString(((MQMD) (mqmessage)).correlationId);
        if(s.equals("Encoding"))
            return Integer.toString(((MQMD) (mqmessage)).encoding);
        if(s.equals("Expiry"))
            return Integer.toString(((MQMD) (mqmessage)).expiry);
        if(s.equals("Feedback"))
        {
            switch(((MQMD) (mqmessage)).feedback)
            {
            case 0: // '\0'
                return "None";
            }
            return Integer.toString(((MQMD) (mqmessage)).feedback);
        }
        if(s.equals("Group ID"))
            return new String(((MQMD) (mqmessage)).groupId);
        if(s.equals("Group ID Bytes"))
            return StringUtils.byteArrayToHexString(((MQMD) (mqmessage)).groupId);
        if(s.equals("Logical Sequence Number"))
            return Integer.toString(((MQMD) (mqmessage)).messageSequenceNumber);
        if(s.equals("Message Data Bytes"))
            try
            {
                mqmessage.seek(0);
                byte abyte0[] = new byte[mqmessage.getDataLength()];
                mqmessage.readFully(abyte0);
                return StringUtils.byteArrayToHexString(abyte0);
            }
            catch(Exception _ex)
            {
                return "Err";
            }
        if(s.equals("Message ID"))
            return new String(((MQMD) (mqmessage)).messageId);
        if(s.equals("Message ID Bytes"))
            return StringUtils.byteArrayToHexString(((MQMD) (mqmessage)).messageId);
        if(s.equals("Message Type"))
            switch(((MQMD) (mqmessage)).messageType)
            {
            case 8: // '\b'
                return "Datagram";

            case 2: // '\002'
                return "Reply";

            case 4: // '\004'
                return "Report";

            case 1: // '\001'
                return "Request";
            }
        if(s.equals("Offset"))
            return Integer.toString(((MQMD) (mqmessage)).offset);
        if(s.equals("Original Length"))
            return Integer.toString(mqmessage.getTotalMessageLength());
        if(s.equals("Persistence"))
            switch(((MQMD) (mqmessage)).persistence)
            {
            case 0: // '\0'
                return "Not persistent";

            case 1: // '\001'
                return "Persistent";
            }
        if(s.equals("Priority"))
            return Integer.toString(((MQMD) (mqmessage)).priority);
        if(s.equals("Put Date (GMT)"))
        {
            SimpleDateFormat simpledateformat1 = new SimpleDateFormat("M/dd/yyyy");
            return simpledateformat1.format(((MQMD) (mqmessage)).putDateTime.getTime());
        }
        if(s.equals("Put Time (GMT)"))
        {
            SimpleDateFormat simpledateformat2 = new SimpleDateFormat("h:mm:ss aa");
            return simpledateformat2.format(((MQMD) (mqmessage)).putDateTime.getTime());
        }
        if(s.equals("Reply-To Queue"))
            return ((MQMD) (mqmessage)).replyToQueueName;
        if(s.equals("Reply-To Queue Manager"))
            return ((MQMD) (mqmessage)).replyToQueueManagerName;
        else
            return "Cell (" + i + "," + j + ")";
    }

    public void refreshAll(MQQueueManager mqqueuemanager, String s)
    {
        try
        {
            MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
            mqgetmessageoptions.options = 96;
            mqgetmessageoptions.matchOptions = 0;
            Object obj = null;
            MQQueue mqqueue = null;
            int i = 0;
            messageVector.clear();
            try
            {
                mqqueue = mqqueuemanager.accessQueue(s, 9);
                MQMessage mqmessage = new MQMessage();
                for(int j = 0; j < startMessage; j++)
                    try
                    {
                        mqqueue.get(mqmessage, mqgetmessageoptions, 1);
                    }
                    catch(MQException mqexception2)
                    {
                        if(mqexception2.reasonCode != 2079)
                            throw mqexception2;
                    }

                while(i < 200) 
                {
                    MQMessage mqmessage1 = new MQMessage();
                    try
                    {
                        i++;
                        mqqueue.get(mqmessage1, mqgetmessageoptions, 200);
                    }
                    catch(MQException mqexception)
                    {
                        if(mqexception.reasonCode != 2079)
                            throw mqexception;
                    }
                    messageVector.addElement(mqmessage1);
                }
            }
            catch(MQException mqexception1)
            {
                if(mqexception1.reasonCode != 2033)
                    QueueManagerModel.displayError(mqexception1);
                System.out.println("Ended mqget: " + mqexception1.toString());
            }
            mqqueue.close();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        fireTableDataChanged();
    }

    public void removeMessage(int i)
    {
        messageVector.removeElementAt(i);
        fireTableDataChanged();
    }

    public void setStartMessage(int i)
    {
        startMessage = i;
    }

    private final int SAMPLE_DATA_SIZE = 200;
    private final int DEFAULT_MESSAGE_COUNT = 200;
    private static final String columnNames[] = {
        "Position", "Put Date/Time", "User Identifier", "Put Application Name", "Format", "Data Length", "Message Data", "Accounting Token", "Application Identity Data", "Application Origin Data", 
        "Application Type", "Backout Count", "Coded Character Set ID", "Correlation ID", "Correlation ID Bytes", "Encoding", "Expiry", "Feedback", "Group ID", "Group ID Bytes", 
        "Logical Sequence Number", "Message Data Bytes", "Message ID", "Message ID Bytes", "Message Type", "Offset", "Original Length", "Persistence", "Priority", "Put Date (GMT)", 
        "Put Time (GMT)", "Reply-To Queue", "Reply-To Queue Manager"
    };
    private Vector messageVector;
    private int startMessage;

}
