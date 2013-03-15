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
import java.io.ByteArrayOutputStream;

public class MQRFH2
{

    public MQRFH2()
    {
        encoding = 273;
        codedCharSetId = -2;
        format = "";
        flags = 0;
        nameValueCCSID = 1208;
        data = "";
    }

    public String getData()
    {
        return data;
    }

    public int getDataLength()
    {
        int i = data.length();
        if(i % 4 != 0)
            i += (i + 4) - i % 4;
        return i;
    }

    public byte[] getHeader()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        StringBuffer stringbuffer = new StringBuffer(data);
        stringbuffer.setLength(getDataLength());
        byte abyte0[] = stringbuffer.toString().getBytes();
        byte abyte1[] = null;
        try
        {
            bytearrayoutputstream.write("RFH ".getBytes());
            bytearrayoutputstream.write(int2bytearray(2));
            bytearrayoutputstream.write(int2bytearray(getDataLength() + 36));
            bytearrayoutputstream.write(int2bytearray(encoding));
            bytearrayoutputstream.write(int2bytearray(codedCharSetId));
            StringBuffer stringbuffer1 = new StringBuffer(format);
            stringbuffer1.setLength(8);
            bytearrayoutputstream.write(stringbuffer1.toString().getBytes());
            bytearrayoutputstream.write(int2bytearray(flags));
            bytearrayoutputstream.write(int2bytearray(nameValueCCSID));
            bytearrayoutputstream.write(int2bytearray(getDataLength()));
            bytearrayoutputstream.write(abyte0);
            abyte1 = bytearrayoutputstream.toByteArray();
            bytearrayoutputstream.close();
        }
        catch(Exception _ex) { }
        return abyte1;
    }

    private byte[] int2bytearray(int i)
    {
        byte abyte0[] = new byte[4];
        abyte0[0] = (byte)(i >>> 24 & 0xff);
        abyte0[1] = (byte)(i >>> 16 & 0xff);
        abyte0[2] = (byte)(i >>> 8 & 0xff);
        abyte0[3] = (byte)(i >>> 0 & 0xff);
        return abyte0;
    }

    public void setData(String s)
    {
        data = s;
    }

    public void setFromMessage(MQMessage mqmessage)
    {
        try
        {
            mqmessage.seek(0);
            mqmessage.skipBytes(4);
            mqmessage.skipBytes(4);
            mqmessage.readInt();
            encoding = mqmessage.readInt();
            codedCharSetId = mqmessage.readInt();
            format = mqmessage.readString(8);
            flags = mqmessage.readInt();
            nameValueCCSID = mqmessage.readInt();
            int i = mqmessage.readInt();
            data = mqmessage.readString(i);
        }
        catch(Exception _ex) { }
    }

    public int encoding;
    public int codedCharSetId;
    public String format;
    public int flags;
    public int nameValueCCSID;
    private String data;
}
