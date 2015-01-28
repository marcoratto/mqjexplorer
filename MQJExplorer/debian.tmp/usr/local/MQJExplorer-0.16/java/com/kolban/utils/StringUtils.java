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
package com.kolban.utils;

import org.apache.log4j.Logger;

public class StringUtils
{

	private final static Logger logger = Logger.getLogger(StringUtils.class);

	public StringUtils()
    {
    }

    public static String byteArrayToHexString(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer(2 * abyte0.length);
        for(int i = 0; i < abyte0.length; i++)
        {
            String s = Integer.toHexString(abyte0[i] & 0xff).toUpperCase();
            if(s.length() < 2)
                s = "0" + s;
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }

    public static String makePrintable(String s)
    {
        StringBuffer stringbuffer = new StringBuffer(s);
        for(int i = 0; i < stringbuffer.length(); i++)
            if(stringbuffer.charAt(i) != '\n' && Character.isISOControl(stringbuffer.charAt(i)))
                stringbuffer.setCharAt(i, '.');

        return stringbuffer.toString();
    }

    public static String pad(String s, int i)
    {
        StringBuffer stringbuffer = new StringBuffer(s);
        if(stringbuffer.length() >= i)
        {
            stringbuffer.setLength(i);
            return stringbuffer.toString();
        }
        stringbuffer.setLength(i);
        for(int j = s.length(); j < i; j++)
            stringbuffer.setCharAt(j, ' ');

        return stringbuffer.toString();
    }

    public static byte[] stringToByteArray(String s)
    {
        int i = s.length() / 2;
        byte abyte0[] = new byte[i];
        for(int j = 0; j < i; j++)
            try
            {
                abyte0[j] = (byte)Integer.parseInt(s.substring(j * 2, j * 2 + 2), 16);
            }
            catch(NumberFormatException numberformatexception)
            {
                logger.error("Exception: " + numberformatexception.toString() + " at " + j * 2 + " for 2");
            }

        return abyte0;
    }
}
