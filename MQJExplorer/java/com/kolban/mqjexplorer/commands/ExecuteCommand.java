// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExecuteCommand.java

package com.kolban.mqjexplorer.commands;

import java.io.*;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ExecuteCommand
    implements Runnable
{
    class UpdateTextFiled
        implements Runnable
    {

        public void run()
        {
            textArea.append(line);
        }

        public void update(JTextArea jtextarea, String s)
        {
            textArea = jtextarea;
            line = s;
            SwingUtilities.invokeLater(this);
        }

        JTextArea textArea;
        String line;

        UpdateTextFiled()
        {
        }
    }

    class UpdateTextField
        implements Runnable
    {

        public void run()
        {
            textArea.append(line);
        }

        public void update(JTextArea jtextarea, String s)
        {
            textArea = jtextarea;
            line = s;
            SwingUtilities.invokeLater(this);
        }

        JTextArea textArea;
        String line;

        UpdateTextField()
        {
        }
    }


    public ExecuteCommand()
    {
        command = null;
        callback = null;
        textArea = null;
    }

    private Runnable getCallback()
    {
        return callback;
    }

    private String[] getCommand()
    {
        return command;
    }

    public JTextArea getTextArea()
    {
        return textArea;
    }

    public void run()
    {
        try
        {
            Process process = Runtime.getRuntime().exec(command);
            for(int i = 0; i < command.length; i++)
                System.out.print(command[i] + " ");

            System.out.print("\n");
            java.io.InputStream inputstream = process.getErrorStream();
            InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
            BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
            String s;
            while((s = bufferedreader.readLine()) != null) 
                System.out.println(": " + s);
            System.out.println("No more data");
            process.waitFor();
            textArea.append("Command ended with: " + process.exitValue());
        }
        catch(Exception _ex) { }
        if(callback != null)
            SwingUtilities.invokeLater(callback);
    }

    public void setCallback(Runnable runnable)
    {
        callback = runnable;
    }

    public void setCommand(String as[])
    {
        command = as;
    }

    public void setTextArea(JTextArea jtextarea)
    {
        textArea = jtextarea;
    }

    private String command[];
    private Runnable callback;
    private JTextArea textArea;
}
