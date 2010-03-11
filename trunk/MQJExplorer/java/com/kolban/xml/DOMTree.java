// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DOMTree.java

package com.kolban.xml;

import java.io.Serializable;
import java.util.Hashtable;
import javax.swing.JTree;
import javax.swing.tree.*;
import org.w3c.dom.*;

public class DOMTree extends JTree
{
    static class Model extends DefaultTreeModel
        implements Serializable
    {

        public synchronized void setDocument(Document document1)
        {
            document = document1;
            ((DefaultMutableTreeNode)getRoot()).removeAllChildren();
            nodeMap.clear();
            buildTree();
            fireTreeStructureChanged(this, new Object[] {
                getRoot()
            }, new int[0], new Object[0]);
        }

        public Document getDocument()
        {
            return document;
        }

        public Node getNode(Object obj)
        {
            return (Node)nodeMap.get(obj);
        }

        private void buildTree()
        {
            if(document == null)
                return;
            NodeList nodelist = document.getChildNodes();
            int i = nodelist == null ? 0 : nodelist.getLength();
            MutableTreeNode mutabletreenode = (MutableTreeNode)getRoot();
            for(int j = 0; j < i; j++)
            {
                Node node = nodelist.item(j);
                switch(node.getNodeType())
                {
                case 9: // '\t'
                    mutabletreenode = insertDocumentNode(node, mutabletreenode);
                    break;

                case 1: // '\001'
                    insertElementNode(node, mutabletreenode);
                    break;
                }
            }

        }

        private MutableTreeNode insertNode(String s, MutableTreeNode mutabletreenode)
        {
            DefaultMutableTreeNode defaultmutabletreenode = new DefaultMutableTreeNode(s);
            insertNodeInto(defaultmutabletreenode, mutabletreenode, mutabletreenode.getChildCount());
            return defaultmutabletreenode;
        }

        private MutableTreeNode insertDocumentNode(Node node, MutableTreeNode mutabletreenode)
        {
            MutableTreeNode mutabletreenode1 = insertNode("<" + node.getNodeName() + '>', mutabletreenode);
            nodeMap.put(mutabletreenode1, node);
            return mutabletreenode1;
        }

        private MutableTreeNode insertElementNode(Node node, MutableTreeNode mutabletreenode)
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append('<');
            stringbuffer.append(node.getNodeName());
            NamedNodeMap namednodemap = node.getAttributes();
            int i = namednodemap == null ? 0 : namednodemap.getLength();
            for(int j = 0; j < i; j++)
            {
                Node node1 = namednodemap.item(j);
                stringbuffer.append(' ');
                stringbuffer.append(node1.getNodeName());
                stringbuffer.append("=\"");
                stringbuffer.append(node1.getNodeValue());
                stringbuffer.append('"');
            }

            stringbuffer.append('>');
            MutableTreeNode mutabletreenode1 = insertNode(stringbuffer.toString(), mutabletreenode);
            nodeMap.put(mutabletreenode1, node);
            NodeList nodelist = node.getChildNodes();
            int k = nodelist == null ? 0 : nodelist.getLength();
            for(int l = 0; l < k; l++)
            {
                Node node2 = nodelist.item(l);
                switch(node2.getNodeType())
                {
                case 4: // '\004'
                    insertCDataSectionNode(node2, mutabletreenode1);
                    break;

                case 3: // '\003'
                    insertTextNode(node2, mutabletreenode1);
                    break;

                case 1: // '\001'
                    insertElementNode(node2, mutabletreenode1);
                    break;
                }
            }

            return mutabletreenode1;
        }

        private MutableTreeNode insertTextNode(Node node, MutableTreeNode mutabletreenode)
        {
            String s = node.getNodeValue().trim();
            if(s.length() > 0)
            {
                MutableTreeNode mutabletreenode1 = insertNode(s, mutabletreenode);
                nodeMap.put(mutabletreenode1, node);
                return mutabletreenode1;
            } else
            {
                return null;
            }
        }

        private MutableTreeNode insertCDataSectionNode(Node node, MutableTreeNode mutabletreenode)
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append(node.getNodeValue());
            if(stringbuffer.length() > 0)
            {
                MutableTreeNode mutabletreenode1 = insertNode(stringbuffer.toString(), mutabletreenode);
                nodeMap.put(mutabletreenode1, node);
                return mutabletreenode1;
            } else
            {
                return null;
            }
        }

        private Document document;
        private Hashtable nodeMap;

        public Model()
        {
            this(null);
        }

        public Model(Document document1)
        {
            super(new DefaultMutableTreeNode());
            nodeMap = new Hashtable();
            setDocument(document1);
        }
    }


    public DOMTree()
    {
        this(null);
    }

    public DOMTree(Document document)
    {
        super(new Model());
        setRootVisible(false);
        setDocument(document);
    }

    public void colapseAll()
    {
        int i = getRowCount();
        for(int j = i - 1; j > 0; j--)
            collapseRow(j);

    }

    public void expandAll()
    {
        for(int i = 0; i < getRowCount(); i++)
            expandRow(i);

    }

    public Document getDocument()
    {
        return ((Model)getModel()).getDocument();
    }

    public Node getNode(Object obj)
    {
        return ((Model)getModel()).getNode(obj);
    }

    public void setDocument(Document document)
    {
        ((Model)getModel()).setDocument(document);
        expandRow(0);
    }
}
