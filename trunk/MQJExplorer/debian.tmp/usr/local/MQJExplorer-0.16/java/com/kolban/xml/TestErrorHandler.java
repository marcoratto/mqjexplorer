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
package com.kolban.xml;

import org.apache.log4j.Logger;
import org.xml.sax.*;

public class TestErrorHandler
    implements ErrorHandler
{

	private final static Logger logger = Logger.getLogger(TestErrorHandler.class);

	public TestErrorHandler()
    {
    }

    public void error(SAXParseException saxparseexception)
        throws SAXException
    {
        logger.info("Error!");
        logInformation(saxparseexception);
    }

    public void fatalError(SAXParseException saxparseexception)
        throws SAXException
    {
        logger.info("Fatal Error!");
        logInformation(saxparseexception);
        throw (SAXException)saxparseexception.getException();
    }

    public void logInformation(SAXParseException saxparseexception)
    {
        logger.info("Error at: (" + saxparseexception.getLineNumber() + "," + saxparseexception.getColumnNumber() + ")");
        logger.info("PublicID: " + saxparseexception.getPublicId());
        logger.info("SystemID: " + saxparseexception.getSystemId());
        logger.info("Message: " + saxparseexception.getMessage());
    }

    public void warning(SAXParseException saxparseexception)
        throws SAXException
    {
        logger.info("Warning!");
        logInformation(saxparseexception);
        throw (SAXException)saxparseexception.getException();
    }
}
