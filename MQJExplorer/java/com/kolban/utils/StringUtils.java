// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StringUtils.java

package com.kolban.utils;

public class StringUtils
{

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
                System.out.println("Exception: " + numberformatexception.toString() + " at " + j * 2 + " for 2");
            }

        return abyte0;
    }
}
