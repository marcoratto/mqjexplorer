// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Help.java

package com.kolban.mqjexplorer;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.help.DefaultHelpBroker;
import javax.help.HelpSet;

public class Help
{

    public Help()
    {
        try
        {
            java.net.URL url = HelpSet.findHelpSet(null, "MQJExplorer.hs");
            HelpSet helpset = new HelpSet(null, url);
            helpBroker = new DefaultHelpBroker();
            helpBroker.setHelpSet(helpset);
            helpBroker.setSize(new Dimension(930, 690));
        }
        catch(Exception _ex)
        {
            System.out.println("HelpSet MQJExplorer.hs not found");
            return;
        }
    }

    public static ActionListener getActionListener()
    {
        if(helpBroker == null)
            return null;
        else
            return new javax.help.CSH.DisplayHelpFromSource(helpBroker);
    }

    private static DefaultHelpBroker helpBroker = null;

}
