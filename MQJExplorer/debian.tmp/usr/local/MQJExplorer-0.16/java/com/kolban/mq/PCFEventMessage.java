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

import java.io.IOException;
import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

import com.ibm.mq.MQException;
import com.ibm.mq.MQMessage;
import com.ibm.mq.pcf.PCFMessage;

public class PCFEventMessage extends PCFMessage
{

	private final static Logger logger = Logger.getLogger(PCFEventMessage.class);

	public PCFEventMessage(int i)
    {
        super(i);
        eventTime = null;
        majorObject = "";
    }

    public PCFEventMessage(int i, int j, int k, boolean flag)
    {
        super(i, j, k, flag);
        eventTime = null;
        majorObject = "";
    }

    public PCFEventMessage(MQMessage mqmessage)
        throws MQException, IOException
    {
        super(mqmessage);
        eventTime = null;
        majorObject = "";
        eventTime = mqmessage.putDateTime;
        setInfo();
    }

    public GregorianCalendar getEventTime()
    {
        return eventTime;
    }

    public String getMajorObject()
    {
        return majorObject;
    }

    /**
     * @deprecated
     */
	public String getTypeOld() {		
		switch (getReason()) {
		case 2001:
			return "Alias Base Queue Type Error";

		case 2295:
			return "Channel Activated";

		case 2234:
			return "Channel Auto-definition Error";

		case 2233:
			return "Channel Auto-definition OK";

		case 2284:
			return "Channel Conversion Error";

		case 2296:
			return "Channel Not Actviated";

		case 2282:
			return "Channel Started";

		case 2283:
			return "Channel Stopped";

		case 2279:
			return "Channel Stopped by User";

		case 2198:
			return "Default Transmission Queue Type Error";

		case 2199:
			return "Default Transmission Queue Usage Error";

		case 2016:
			return "Get Inhibited";

		case 2035:
			return "Not Authorized";

		case 2051:
			return "Put Inhibited";

		case 2224:
			return "Queue Depth High";

		case 2225:
			return "Queue Depth Low";

		case 2053:
			return "Queue Full";

		case 2222:
			return "Queue Manager Active";

		case 2223:
			return "Queue Manager Not Active";

		case 2226:
			return "Queue Service Interval High";

		case 2227:
			return "Queue Service Interval OK";

		case 2057:
			return "Queue Type Error";

		case 2184:
			return "Remote Queue Name Error";

		case 2091:
			return "Transmission Queue Type Error";

		case 2092:
			return "Transmission Queue Usage Error";

		case 2082:
			return "Unknown Alias Base Queue";

		case 2197:
			return "Unknown Default Transmission Queue";

		case 2085:
			return "Unknown Object Name";

		case 2087:
			return "Unknown Remote Queue Manager";

		case 2196:
			return "Unknown Transmission Queue";
		}
		return "Unknown reason: " + getReason();
	}

    public void initialize(MQMessage mqmessage)
        throws MQException, IOException
    {
        super.initialize(mqmessage);
        eventTime = mqmessage.putDateTime;
        setInfo();
    }

    private void setInfo()
    {
        try
        {
            switch(getReason())
            {
            case 2001: 
                majorObject = getStringParameterValue(2016);
                break;

            case 2233: 
            case 2234: 
            case 2279: 
            case 2282: 
            case 2283: 
            case 2284: 
            case 2295: 
            case 2296: 
                majorObject = getStringParameterValue(3501);
                break;

            case 2198: 
            case 2199: 
                majorObject = getStringParameterValue(2024);
                break;

            case 2016: 
            case 2051: 
            case 2057: 
            case 2091: 
            case 2092: 
            case 2184: 
            case 2224: 
            case 2225: 
            case 2226: 
            case 2227: 
                majorObject = getStringParameterValue(2002);
                break;

            case 2053: 
                majorObject = getStringParameterValue(2016);
                break;

            case 2035: 
                majorObject = getStringParameterValue(3025);
                break;

            case 2222: 
            case 2223: 
                majorObject = getStringParameterValue(2015);
                break;

            case 2082: 
                majorObject = getStringParameterValue(2016);
                break;

            case 2197: 
                majorObject = getStringParameterValue(2016);
                break;

            case 2085: 
                try
                {
                    majorObject = "Q: " + getStringParameterValue(2002);
                }
                catch(Exception _ex)
                {
                    majorObject = "P: " + getStringParameterValue(2012);
                }
                break;

            case 2087: 
                majorObject = getStringParameterValue(2016);
                break;

            case 2196: 
                majorObject = getStringParameterValue(2016);
                break;

            default:
                majorObject = "Unknown Object: " + getReason();
                break;
            }
        }
        catch(Exception exception)
        {
            logger.error("Exception: " + exception.toString());
        }
    }

    public String toString()
    {
        String s = getType() + " " + getMajorObject();
        switch(getReason())
        {
        default:
            break;

        case 2283: 
            try
            {
                switch(getIntParameterValue(1020))
                {
                case 7: // '\007'
                    s = s + "\nChannel stopped ok";
                    break;

                case 8: // '\b'
                    s = s + "\nChannel stopped with error";
                    break;

                case 10: // '\n'
                    s = s + "\nChannel stopped and in stopped state";
                    break;

                case 9: // '\t'
                    s = s + "\nChannel closed and in retry state";
                    break;
                }
            }
            catch(Exception _ex) { }
            break;

        case 2016: 
        case 2051: 
            try
            {
                s = s + "\nApplication name: \"" + getStringParameterValue(3024) + "\"";
            }
            catch(Exception _ex) { }
            break;

        case 2053: 
            try
            {
                s = s + "\nTime since last stats reset: " + getIntParameterValue(35);
                s = s + "\nHigh Queue Depth: " + getIntParameterValue(36);
                s = s + "\nMessage put count: " + getIntParameterValue(37);
                s = s + "\nMessage get count: " + getIntParameterValue(38);
            }
            catch(Exception _ex) { }
            break;
        }
        return s;
    }

    private GregorianCalendar eventTime;
    private String majorObject;
}
