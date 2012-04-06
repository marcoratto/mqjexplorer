// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Project.java

package com.kolban.mqjexplorer.codewiz;

import java.io.*;
import java.util.*;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import javax.swing.ImageIcon;

import org.apache.log4j.Logger;

// Referenced classes of package com.kolban.mqjexplorer.codewiz:
//            Parser

public class Project
{

	private final static Logger logger = Logger.getLogger("com.kolban.mqjexplorer");

	public Project()
    {
        name = null;
        description = null;
        jarFile = null;
        icon = null;
        iconFileName = null;
        contentsFileName = null;
    }

    public void buildOutput(File file, String s, String s1, Parser parser)
    {
        File file1 = new File(file, s1);
        InputStream inputstream = readFile(s);
        try
        {
            File file2 = file1.getParentFile();
            file2.mkdirs();
            FileWriter filewriter = new FileWriter(file1);
            parser.parse(new InputStreamReader(inputstream), filewriter);
            filewriter.close();
            inputstream.close();
        }
        catch(IOException ioexception)
        {
            logger.info("Exception: " + ioexception.toString());
        }
    }

    public void buildProject(File file, Hashtable hashtable)
    {
        if(contentsFileName == null)
        {
            logger.info("Error: No contents file specified!");
            return;
        }
        InputStream inputstream = readFile(contentsFileName);
        if(inputstream == null)
        {
            logger.info("Error: Unable to read contents file: " + contentsFileName);
            return;
        }
        Parser parser = new Parser(hashtable);
        StringWriter stringwriter = new StringWriter();
        parser.parse(new InputStreamReader(inputstream), stringwriter);
        LineNumberReader linenumberreader = new LineNumberReader(new StringReader(stringwriter.toString()));
        try
        {
            for(String s2 = linenumberreader.readLine(); s2 != null; s2 = linenumberreader.readLine())
            {
                s2 = s2.trim();
                if(s2.length() > 0)
                {
                    StringTokenizer stringtokenizer = new StringTokenizer(s2);
                    try
                    {
                        String s = stringtokenizer.nextToken();
                        String s1 = stringtokenizer.nextToken();
                        logger.info("From: " + s + " -> " + s1);
                        buildOutput(file, s, s1, parser);
                    }
                    catch(NoSuchElementException _ex)
                    {
                        logger.info("Error with format: " + s2);
                    }
                }
            }

        }
        catch(IOException ioexception)
        {
            logger.info("Exception: " + ioexception.toString());
        }
    }

    public String getDescription()
    {
        return description;
    }

    public ImageIcon getIcon()
    {
        return icon;
    }

    public String getName()
    {
        return name;
    }

    private void loadIcon(String s)
    {
        icon = null;
        ZipEntry zipentry = jarFile.getEntry(s);
        if(zipentry == null)
        {
            logger.info("No such project icon: " + s);
            return;
        }
        long l = zipentry.getSize();
        byte abyte0[] = new byte[(int)l];
        try
        {
            InputStream inputstream = jarFile.getInputStream(zipentry);
            inputstream.read(abyte0);
            inputstream.close();
            icon = new ImageIcon(abyte0);
        }
        catch(IOException ioexception)
        {
            logger.info("Exception: " + ioexception.toString());
        }
    }

    public void loadInventory(Reader reader)
    {
        try
        {
            LineNumberReader linenumberreader = new LineNumberReader(reader);
            for(String s = linenumberreader.readLine(); s != null; s = linenumberreader.readLine())
            {
                s = s.trim();
                s.startsWith("#");
                if(s.startsWith("NAME:"))
                    name = s.substring(5).trim();
                else
                if(s.startsWith("CONTENTS:"))
                    contentsFileName = s.substring(9).trim();
                else
                if(s.startsWith("DESCRIPTION:"))
                    description = s.substring(12).trim();
                else
                if(s.startsWith("ICON:"))
                {
                    iconFileName = s.substring(5).trim();
                    loadIcon(iconFileName);
                } else
                if(s.length() > 0)
                    logger.info("Error at line " + linenumberreader.getLineNumber() + ": " + s);
            }

        }
        catch(Exception exception)
        {
            logger.info("Exception: " + exception.toString());
        }
        try
        {
            reader.close();
        }
        catch(Exception _ex) { }
    }

    public InputStream readFile(String s)
    {
        ZipEntry zipentry = jarFile.getEntry(s);
        if(zipentry == null)
        {
            logger.info("No such file: " + s);
            return null;
        }
        try
        {
            InputStream inputstream = jarFile.getInputStream(zipentry);
            return inputstream;
        }
        catch(IOException ioexception)
        {
            logger.info("Exception: " + ioexception.toString());
        }
        return null;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setJarFile(JarFile jarfile)
    {
        jarFile = jarfile;
        ZipEntry zipentry = jarFile.getEntry("inventory.txt");
        if(zipentry == null)
            return;
        try
        {
            InputStream inputstream = jarFile.getInputStream(zipentry);
            loadInventory(new InputStreamReader(inputstream));
        }
        catch(Exception _ex) { }
    }

    public void setName(String s)
    {
        name = s;
    }

    private String name;
    private String description;
    private JarFile jarFile;
    private ImageIcon icon;
    private String iconFileName;
    private String contentsFileName;
}
