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
package com.kolban.mqjexplorer;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.help.DefaultHelpBroker;
import javax.help.HelpSet;

import org.apache.log4j.Logger;

public class Help
{

	private final static Logger logger = Logger.getLogger("com.kolban.mqjexplorer");
	
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
            logger.info("HelpSet MQJExplorer.hs not found");
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
