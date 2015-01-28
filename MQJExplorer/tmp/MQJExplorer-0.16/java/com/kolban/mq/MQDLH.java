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

import org.apache.log4j.Logger;

import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;

public class MQDLH {

	private final static Logger logger = Logger.getLogger(MQDLH.class);
	
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
        } catch(Exception exception) {
            logger.error("Exception: " + exception.toString());
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
