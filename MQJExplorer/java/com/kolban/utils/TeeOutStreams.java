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
