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

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.*;
import java.io.IOException;
import java.util.Enumeration;

import org.apache.log4j.Logger;

public class PCFUtils
{

	private final static Logger logger = Logger.getLogger(PCFUtils.class);

	public PCFUtils()
    {
    }

    public static void clearQueue(PCFMessageAgent pcfmessageagent, String s)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(9);
        pcfmessage.addParameter(2016, s);
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException _ex) { }
    }

    public static void copyQueue(PCFMessageAgent pcfmessageagent, String s, String s1, int i)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(10);
        pcfmessage.addParameter(3001, s);
        pcfmessage.addParameter(3002, s1);
        pcfmessage.addParameter(20, i);
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException _ex) { }
    }

    public static int countItems(int i, PCFMessage pcfmessage)
    {
        int j = 0;
        for(Enumeration enumeration = pcfmessage.getParameters(); enumeration.hasMoreElements();)
        {
            PCFParameter pcfparameter = (PCFParameter)enumeration.nextElement();
            if(pcfparameter.getParameter() == i)
                j++;
        }

        return j;
    }

    public static void deleteChannel(PCFMessageAgent pcfmessageagent, String s)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(24);
        pcfmessage.addParameter(3501, s);
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException _ex) { }
    }

    public static void deleteNamelist(PCFMessageAgent pcfmessageagent, String s)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(35);
        pcfmessage.addParameter(2010, s);
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException _ex) { }
    }

    public static void deleteProcess(PCFMessageAgent pcfmessageagent, String s)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(6);
        pcfmessage.addParameter(2012, s);
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException _ex) { }
    }

    public static void deleteQueue(PCFMessageAgent pcfmessageagent, String s, boolean flag)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(12);
        pcfmessage.addParameter(2016, s);
        pcfmessage.addParameter(1007, flag ? 1 : 0);
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException _ex) { }
    }

    public static String escape(PCFMessageAgent pcfmessageagent, String s)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(38);
        pcfmessage.addParameter(1017, 1);
        pcfmessage.addParameter(3014, s);
        try
        {
            PCFMessage apcfmessage[] = pcfmessageagent.send(pcfmessage);
            String s1 = "";
            for(int i = 0; i < apcfmessage.length; i++)
                try
                {
                    s1 = s1 + apcfmessage[i].getStringParameterValue(3014) + "\n";
                }
                catch(Exception _ex) { }

            return s1;
        }
        catch(IOException _ex)
        {
            return "";
        }
    }

    public static Integer getIntParameter(int i, int j, PCFMessage pcfmessage)
    {
        int k = 0;
        for(Enumeration enumeration = pcfmessage.getParameters(); enumeration.hasMoreElements();)
        {
            PCFParameter pcfparameter = (PCFParameter)enumeration.nextElement();
            if(pcfparameter.getParameter() == i)
            {
                if(k == j)
                    return (Integer)pcfparameter.getValue();
                k++;
            }
        }

        return null;
    }

    public static String getStringParameter(int i, int j, PCFMessage pcfmessage)
    {
        int k = 0;
        for(Enumeration enumeration = pcfmessage.getParameters(); enumeration.hasMoreElements();)
        {
            PCFParameter pcfparameter = (PCFParameter)enumeration.nextElement();
            if(pcfparameter.getParameter() == i)
            {
                if(k == j)
                    return (String)pcfparameter.getValue();
                k++;
            }
        }

        return null;
    }

    public static void pingChannel(PCFMessageAgent pcfmessageagent, String s)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(26);
        pcfmessage.addParameter(3501, s);
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException _ex) { }
    }

    public static void startChannel(PCFMessageAgent pcfmessageagent, String s)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(28);
        pcfmessage.addParameter(3501, s);
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException ioexception)
        {
            logger.info("startChannel: " + ioexception.toString());
        }
    }

    public static void stopChannel(PCFMessageAgent pcfmessageagent, String s, boolean flag)
        throws MQException
    {
        PCFMessage pcfmessage = new PCFMessage(29);
        pcfmessage.addParameter(3501, s);
        pcfmessage.addParameter(1008, flag ? 1 : 0);
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException ioexception)
        {
            logger.info("Error stopping channel: " + ioexception.toString());
        }
    }
}
