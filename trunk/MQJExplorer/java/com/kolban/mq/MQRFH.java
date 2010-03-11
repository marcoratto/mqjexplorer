// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQRFH.java

package com.kolban.mq;

import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;
import com.kolban.utils.StringUtils;
import java.util.Vector;

public class MQRFH
{

    public MQRFH()
    {
        nameVector = null;
        valueVector = null;
        reset();
    }

    public void addNameValue(String s, String s1)
    {
        if(s == null || s1 == null)
        {
            return;
        } else
        {
            nameVector.addElement(s.trim());
            valueVector.addElement(s1.trim());
            return;
        }
    }

    public int getCodedCharSetId()
    {
        return codedCharSetId;
    }

    public int getEncoding()
    {
        return encoding;
    }

    public int getEntryCount()
    {
        return nameVector.size();
    }

    public int getFlags()
    {
        return flags;
    }

    public String getFormat()
    {
        return format;
    }

    public MQMessage getMessage()
    {
        MQMessage mqmessage = new MQMessage();
        String s = getNameValueString();
        int i = s.length();
        if(i % 4 != 0)
            s = StringUtils.pad(s, (i + 4) - i % 4);
        strucLength = 32 + s.length();
        try
        {
            mqmessage.writeString("RFH ");
            mqmessage.writeInt4(version);
            mqmessage.writeInt4(strucLength);
            mqmessage.writeInt4(encoding);
            mqmessage.writeInt4(codedCharSetId);
            mqmessage.writeString(format);
            mqmessage.writeInt4(flags);
            mqmessage.writeString(s);
            System.out.println("NVS: " + s);
            mqmessage.format = "MQHRF   ";
        }
        catch(Exception _ex) { }
        return mqmessage;
    }

    public String getName(int i)
    {
        if(i >= nameVector.size())
            return null;
        else
            return (String)nameVector.elementAt(i);
    }

    public String getNameValueString()
    {
        String s = "";
        for(int i = 0; i < getEntryCount(); i++)
            if(s.length() == 0)
                s = s + getName(i) + " " + getValue(i);
            else
                s = s + " " + getName(i) + " " + getValue(i);

        return s;
    }

    public String getValue(int i)
    {
        if(i >= valueVector.size())
            return null;
        else
            return (String)valueVector.elementAt(i);
    }

    public String getValue(String s)
    {
        for(int i = 0; i < getEntryCount(); i++)
            if(s.equals(nameVector.elementAt(i)))
                return (String)valueVector.elementAt(i);

        return null;
    }

    public void reset()
    {
        version = 1;
        strucLength = 32;
        encoding = 273;
        codedCharSetId = -2;
        format = "        ";
        flags = 0;
        nameVector = new Vector();
        valueVector = new Vector();
    }

    public void setCodedCharSetId(int i)
    {
        codedCharSetId = i;
    }

    public void setEncoding(int i)
    {
        encoding = i;
    }

    public void setFlags(int i)
    {
        flags = i;
    }

    public void setFormat(String s)
    {
        format = s;
    }

    public void setFromMessage(MQMessage mqmessage)
    {
        if(!((MQMD) (mqmessage)).format.equals("MQHRF   "))
            return;
        try
        {
            mqmessage.seek(0);
            mqmessage.readString(4);
            version = mqmessage.readInt4();
            strucLength = mqmessage.readInt4();
            encoding = mqmessage.readInt4();
            codedCharSetId = mqmessage.readInt4();
            format = mqmessage.readString(8);
            flags = mqmessage.readInt4();
            String s = mqmessage.readString(strucLength - 32);
            StringBuffer stringbuffer = new StringBuffer();
            StringBuffer stringbuffer1 = new StringBuffer();
            nameVector.clear();
            valueVector.clear();
            int i = 1;
            boolean flag = false;
            for(int j = 0; j < s.length(); j++)
            {
                char c = s.charAt(j);
                switch(i)
                {
                default:
                    break;

                case 1: // '\001'
                    if(!Character.isWhitespace(c) && !Character.isISOControl(c))
                    {
                        stringbuffer.append(c);
                        i = 2;
                    }
                    break;

                case 2: // '\002'
                    if(!Character.isWhitespace(c) && !Character.isISOControl(c))
                        stringbuffer.append(c);
                    else
                        i = 3;
                    break;

                case 3: // '\003'
                    if(!Character.isWhitespace(c) && !Character.isISOControl(c))
                    {
                        stringbuffer1.append(c);
                        i = 4;
                    }
                    break;

                case 4: // '\004'
                    if(flag || !Character.isWhitespace(c) && !Character.isISOControl(c))
                    {
                        if(c == '"')
                            flag = !flag;
                        else
                            stringbuffer1.append(c);
                    } else
                    {
                        i = 1;
                        addNameValue(stringbuffer.toString(), stringbuffer1.toString());
                        stringbuffer.setLength(0);
                        stringbuffer1.setLength(0);
                    }
                    break;
                }
            }

            if(i == 4 && stringbuffer.length() > 0 && stringbuffer1.length() > 0)
                addNameValue(stringbuffer.toString(), stringbuffer1.toString());
        }
        catch(Exception exception)
        {
            System.out.println("setFromMessage: " + exception.toString());
        }
    }

    private int codedCharSetId;
    private int encoding;
    private int flags;
    private String format;
    private int strucLength;
    private int version;
    private Vector nameVector;
    private Vector valueVector;
}
