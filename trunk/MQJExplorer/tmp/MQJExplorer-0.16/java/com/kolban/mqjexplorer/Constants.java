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

import java.io.File;

public final class Constants {

    public final static File CONFIG_DIR = new File(System.getProperty("user.home"), ".MQJExplorer");
        
    public final static File PROPS_FILE = new File(CONFIG_DIR, "MQJExplorer.properties");
    
    public final static File XML_CONFIG_FILE = new File(CONFIG_DIR, "config.xml");
    
    public final static String EOL = System.getProperty("line.separator");

    public final static int MAX_MESSAGES_FOR_BROWSING = 1000;
}
