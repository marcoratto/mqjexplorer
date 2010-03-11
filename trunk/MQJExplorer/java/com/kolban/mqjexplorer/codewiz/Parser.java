// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Parser.java

package com.kolban.mqjexplorer.codewiz;

import java.io.*;
import java.util.Hashtable;

public class Parser
{
    private class Tree
    {

        Tree parent;
        Tree trueChild;
        Tree falseChild;
        boolean include;
        int line;

        public Tree()
        {
            trueChild = null;
            falseChild = null;
            parent = null;
        }
    }


    public Parser(Hashtable hashtable)
    {
        hashTable = hashtable;
    }

    private int getToken(String s)
    {
        String s1 = s.trim();
        if(s1.startsWith("$$/"))
            return 5;
        if(s1.startsWith("$$ELSE"))
            return 4;
        if(s1.startsWith("$$ENDIF"))
            return 3;
        if(s1.startsWith("$$IF("))
        {
            int i = s1.indexOf('(');
            int j = s1.indexOf(')');
            String s2 = s1.substring(i + 1, j);
            return hashTable.get(s2) == null ? 2 : 1;
        } else
        {
            return 0;
        }
    }

    public static void main(String args[])
    {
        String s = "";
        s = s + "This is line one $$XHERE$$$$THERE$$ more!\n";
        s = s + "$$IF(_TRUE)\n";
        s = s + "$$IF(_TRUE)\n";
        s = s + "first if text\n";
        s = s + "$$IF(_TRUE)\n";
        s = s + "This should be here\n";
        s = s + "$$ELSE\n";
        s = s + "... folowing else ...\n";
        s = s + "$$ENDIF\n";
        s = s + "more ...\n";
        s = s + "$$ENDIF\n";
        s = s + "the end!\n";
        StringReader stringreader = new StringReader(s);
        Parser parser = new Parser(null);
        parser.parse(stringreader);
    }

    public void parse(Reader reader)
    {
        LineNumberReader linenumberreader = new LineNumberReader(reader);
        String s;
        try
        {
            s = linenumberreader.readLine();
        }
        catch(Exception _ex)
        {
            return;
        }
        Tree tree = new Tree();
        tree.parent = null;
        tree.include = true;
        Tree tree1 = tree;
        try
        {
            while(s != null) 
            {
                switch(getToken(s))
                {
                case 5: // '\005'
                default:
                    break;

                case 4: // '\004'
                    Tree tree2 = tree1;
                    tree1 = tree1.parent;
                    if(tree1 == null)
                        throw new Exception("ELSE encountered at line " + linenumberreader.getLineNumber() + " but no matching IF");
                    if(tree1.trueChild == tree2)
                    {
                        tree1.trueChild = null;
                        tree1.falseChild = new Tree();
                        tree1.falseChild.parent = tree1;
                        tree1.falseChild.include = false;
                        tree1 = tree1.falseChild;
                    } else
                    {
                        tree1.falseChild = null;
                        tree1.trueChild = new Tree();
                        tree1.trueChild.parent = tree1;
                        tree1.trueChild.include = tree1.include;
                        tree1 = tree1.trueChild;
                    }
                    tree2.parent = null;
                    break;

                case 3: // '\003'
                    Tree tree3 = tree1;
                    tree1 = tree1.parent;
                    if(tree1 == null)
                        throw new Exception("ENDIF encountered at line " + linenumberreader.getLineNumber() + " but no matching IF");
                    if(tree1.trueChild == tree3)
                        tree1.trueChild = null;
                    else
                        tree1.falseChild = null;
                    tree3.parent = null;
                    break;

                case 1: // '\001'
                    tree1.trueChild = new Tree();
                    tree1.trueChild.parent = tree1;
                    tree1.trueChild.include = tree1.include;
                    tree1 = tree1.trueChild;
                    tree1.line = linenumberreader.getLineNumber();
                    break;

                case 2: // '\002'
                    tree1.falseChild = new Tree();
                    tree1.falseChild.parent = tree1;
                    tree1.falseChild.include = false;
                    tree1 = tree1.falseChild;
                    tree1.line = linenumberreader.getLineNumber();
                    break;

                case 0: // '\0'
                    if(tree1.include)
                    {
                        s = replaceMacro(s);
                        System.out.println(">>" + s);
                    }
                    break;
                }
                try
                {
                    s = linenumberreader.readLine();
                }
                catch(Exception _ex) { }
            }
            if(tree1.parent != null)
                throw new Exception("EOF reached but no matched ENDIF for IF at line " + tree1.line);
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        try
        {
            linenumberreader.close();
        }
        catch(Exception _ex) { }
    }

    public void parse(Reader reader, Writer writer)
    {
        LineNumberReader linenumberreader = new LineNumberReader(reader);
        BufferedWriter bufferedwriter = new BufferedWriter(writer);
        String s;
        try
        {
            s = linenumberreader.readLine();
        }
        catch(Exception _ex)
        {
            return;
        }
        Tree tree = new Tree();
        tree.parent = null;
        tree.include = true;
        Tree tree1 = tree;
        try
        {
            while(s != null) 
            {
                switch(getToken(s))
                {
                case 5: // '\005'
                default:
                    break;

                case 4: // '\004'
                    Tree tree2 = tree1;
                    tree1 = tree1.parent;
                    if(tree1 == null)
                        throw new Exception("ELSE encountered at line " + linenumberreader.getLineNumber() + " but no matching IF");
                    if(tree1.trueChild == tree2)
                    {
                        tree1.trueChild = null;
                        tree1.falseChild = new Tree();
                        tree1.falseChild.parent = tree1;
                        tree1.falseChild.include = false;
                        tree1 = tree1.falseChild;
                    } else
                    {
                        tree1.falseChild = null;
                        tree1.trueChild = new Tree();
                        tree1.trueChild.parent = tree1;
                        tree1.trueChild.include = tree1.include;
                        tree1 = tree1.trueChild;
                    }
                    tree2.parent = null;
                    break;

                case 3: // '\003'
                    Tree tree3 = tree1;
                    tree1 = tree1.parent;
                    if(tree1 == null)
                        throw new Exception("ENDIF encountered at line " + linenumberreader.getLineNumber() + " but no matching IF");
                    if(tree1.trueChild == tree3)
                        tree1.trueChild = null;
                    else
                        tree1.falseChild = null;
                    tree3.parent = null;
                    break;

                case 1: // '\001'
                    tree1.trueChild = new Tree();
                    tree1.trueChild.parent = tree1;
                    tree1.trueChild.include = tree1.include;
                    tree1 = tree1.trueChild;
                    tree1.line = linenumberreader.getLineNumber();
                    break;

                case 2: // '\002'
                    tree1.falseChild = new Tree();
                    tree1.falseChild.parent = tree1;
                    tree1.falseChild.include = false;
                    tree1 = tree1.falseChild;
                    tree1.line = linenumberreader.getLineNumber();
                    break;

                case 0: // '\0'
                    if(tree1.include)
                    {
                        s = replaceMacro(s);
                        System.out.println(">>" + s);
                        bufferedwriter.write(s);
                        bufferedwriter.newLine();
                    }
                    break;
                }
                try
                {
                    s = linenumberreader.readLine();
                }
                catch(Exception _ex) { }
            }
            if(tree1.parent != null)
                throw new Exception("EOF reached but no matched ENDIF for IF at line " + tree1.line);
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        try
        {
            linenumberreader.close();
            bufferedwriter.close();
        }
        catch(Exception _ex) { }
    }

    private String replaceMacro(String s)
    {
        for(int i = s.indexOf("$$", 0); i != -1; i = s.indexOf("$$", i))
        {
            int j = s.indexOf("$$", i + 1);
            if(j == -1)
                return s;
            String s1 = s.substring(i + 2, j);
            String s2 = (String)hashTable.get(s1);
            if(s2 != null)
            {
                s = s.substring(0, i) + s2 + s.substring(j + 2);
                i += s2.length();
            } else
            {
                i = j + 2;
            }
        }

        return s;
    }

    private Hashtable hashTable;
    private static final int TOKEN_IF_TRUE = 1;
    private static final int TOKEN_IF_FALSE = 2;
    private static final int TOKEN_ENDIF = 3;
    private static final int TOKEN_ELSE = 4;
    private static final int TOKEN_COMMENT = 5;
    private static final int TOKEN_NONE = 0;
    private static final String MAKRO_START = "$$";
}
