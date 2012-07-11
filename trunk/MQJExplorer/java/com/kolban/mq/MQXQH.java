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

// Referenced classes of package com.kolban.mq:
//            MQMD

public class MQXQH
{

	private final static Logger logger = Logger.getLogger("com.kolban.mqjexplorer");

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
            logger.error("Exception: " + exception.toString());
        }
    }

    public String remoteQName;
    public String remoteQMgrName;
    public String strucId;
    int version;
    public MQMD mqmd;
}
