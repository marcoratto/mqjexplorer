// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CodeWizard.java

package com.kolban.mqjexplorer.codewiz;

import java.io.*;
import java.util.Vector;
import java.util.jar.JarFile;
import javax.swing.JOptionPane;

// Referenced classes of package com.kolban.mqjexplorer.codewiz:
//            Project, ProjectChooser

public class CodeWizard
{
    private class JarFilenameFilter
        implements FilenameFilter
    {

        public boolean accept(File file, String s)
        {
            return s.endsWith(".jar");
        }

        JarFilenameFilter()
        {
        }
    }


    public CodeWizard()
    {
        projectVector = null;
    }

    public void initialize()
    {
        projectVector = new Vector();
        File file = new File(INVENTORY_DIR);
        File afile[] = file.listFiles(new JarFilenameFilter());
        if(afile == null)
        {
            JOptionPane.showMessageDialog(null, "Unable to find CodeWiz data", "CodeWiz", 0);
            return;
        }
        for(int i = 0; i < afile.length; i++)
        {
            Project project = new Project();
            try
            {
                project.setJarFile(new JarFile(afile[i]));
                projectVector.addElement(project);
            }
            catch(IOException _ex) { }
        }

    }

    public static void main(String args[])
    {
        CodeWizard codewizard = new CodeWizard();
        codewizard.initialize();
        ProjectChooser projectchooser = new ProjectChooser();
        projectchooser.setProjectVector(codewizard.projectVector);
        projectchooser.show();
    }

    private static final String INVENTORY_DIR = ".\\CodeWiz\\Data";
    
    public Vector projectVector;
}
