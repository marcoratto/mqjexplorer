// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TeeOutStreams.java

package com.kolban.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

public class TeeOutStreams extends OutputStream
{

    public TeeOutStreams()
    {
        streams = new Vector();
    }

    public void addStream(OutputStream outputstream)
    {
        streams.addElement(outputstream);
    }

    public void write(byte abyte0[])
        throws IOException
    {
        for(int i = 0; i < streams.size(); i++)
        {
            OutputStream outputstream = (OutputStream)streams.get(i);
            outputstream.write(abyte0);
        }

    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        for(int k = 0; k < streams.size(); k++)
        {
            OutputStream outputstream = (OutputStream)streams.get(k);
            outputstream.write(abyte0, i, j);
        }

    }

    public void write(int i)
        throws IOException
    {
        for(int j = 0; j < streams.size(); j++)
        {
            OutputStream outputstream = (OutputStream)streams.get(j);
            outputstream.write(i);
        }

    }

    private Vector streams;
}
