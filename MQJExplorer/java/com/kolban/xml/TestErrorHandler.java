// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestErrorHandler.java

package com.kolban.xml;

import org.xml.sax.*;

public class TestErrorHandler
    implements ErrorHandler
{

    public TestErrorHandler()
    {
    }

    public void error(SAXParseException saxparseexception)
        throws SAXException
    {
        System.out.println("Error!");
        logInformation(saxparseexception);
    }

    public void fatalError(SAXParseException saxparseexception)
        throws SAXException
    {
        System.out.println("Fatal Error!");
        logInformation(saxparseexception);
        throw (SAXException)saxparseexception.getException();
    }

    public void logInformation(SAXParseException saxparseexception)
    {
        System.out.println("Error at: (" + saxparseexception.getLineNumber() + "," + saxparseexception.getColumnNumber() + ")");
        System.out.println("PublicID: " + saxparseexception.getPublicId());
        System.out.println("SystemID: " + saxparseexception.getSystemId());
        System.out.println("Message: " + saxparseexception.getMessage());
    }

    public void warning(SAXParseException saxparseexception)
        throws SAXException
    {
        System.out.println("Warning!");
        logInformation(saxparseexception);
        throw (SAXException)saxparseexception.getException();
    }
}
