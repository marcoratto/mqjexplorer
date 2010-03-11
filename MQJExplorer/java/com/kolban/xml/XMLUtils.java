// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   XMLUtils.java

package com.kolban.xml;

import java.util.Vector;
import org.w3c.dom.*;

public class XMLUtils
{

    public XMLUtils()
    {
    }

    public static int getElementIndex(Node node)
    {
        String s = node.getNodeName();
        int i = 0;
        for(Node node1 = node.getPreviousSibling(); node1 != null; node1 = node1.getPreviousSibling())
            if(node1.getNodeName().equals(s) && node1.getNodeType() == 1)
                i++;

        return i;
    }

    public static String[] getElementPath(Node node)
    {
        Vector vector = new Vector();
        for(; node != null; node = node.getParentNode())
            if(node.getNodeType() == 1)
                if(!hasSameNamedSibling(node))
                    vector.addElement(node.getNodeName());
                else
                    vector.addElement(node.getNodeName() + "[" + (getElementIndex(node) + 1) + "]");

        int i = vector.size();
        String as[] = new String[i];
        int j = i - 1;
        for(int k = 0; k < i;)
        {
            as[k] = (String)vector.elementAt(j);
            k++;
            j--;
        }

        return as;
    }

    public static boolean hasSameNamedSibling(Node node)
    {
        String s = node.getNodeName();
        for(Node node1 = node.getPreviousSibling(); node1 != null; node1 = node1.getPreviousSibling())
            if(node1.getNodeName().equals(s) && node1.getNodeType() == node.getNodeType())
                return true;

        for(Node node2 = node.getNextSibling(); node2 != null; node2 = node2.getNextSibling())
            if(node2.getNodeName().equals(s) && node2.getNodeType() == node.getNodeType())
                return true;

        return false;
    }

    public static boolean isTagOnly(Node node)
    {
        for(Node node1 = node.getFirstChild(); node1 != null; node1 = node1.getNextSibling())
        {
            short word0 = node1.getNodeType();
            if(word0 == 4 || word0 == 3 || word0 == 7)
                return false;
        }

        return true;
    }

    public static void logTree(Node node)
    {
        System.out.println("-----------");
        System.out.println("Node name: " + node.getNodeName());
        String s;
        switch(node.getNodeType())
        {
        case 2: // '\002'
            s = "Attribute";
            break;

        case 8: // '\b'
            s = "Comment";
            break;

        case 4: // '\004'
            s = "CData Section";
            break;

        case 11: // '\013'
            s = "Document fragment";
            break;

        case 9: // '\t'
            s = "Document";
            break;

        case 10: // '\n'
            s = "Document Type";
            break;

        case 1: // '\001'
            s = "Element";
            break;

        case 6: // '\006'
            s = "Entity";
            break;

        case 5: // '\005'
            s = "Entity Reference";
            break;

        case 12: // '\f'
            s = "Notation";
            break;

        case 7: // '\007'
            s = "Processing instruction";
            break;

        case 3: // '\003'
            s = "Text";
            break;

        default:
            s = "Unknown: " + node.getNodeType();
            break;
        }
        System.out.println("Node type: " + s);
        NamedNodeMap namednodemap = node.getAttributes();
        boolean flag;
        if(namednodemap == null)
            flag = false;
        else
        if(namednodemap.getLength() == 0)
            flag = false;
        else
            flag = true;
        System.out.println("Has attributes: " + flag);
        System.out.println("Value: \"" + node.getNodeValue() + "\"");
        Node node1;
        switch(node.getNodeType())
        {
        case 10: // '\n'
            DocumentType documenttype = (DocumentType)node;
            System.out.println("SystemId: " + documenttype.getSystemId());
            System.out.println("DTD Name: " + documenttype.getName());
            System.out.println("Internal subset: " + documenttype.getInternalSubset());
            NamedNodeMap namednodemap1 = documenttype.getEntities();
            int i = namednodemap1.getLength();
            for(int j = 0; j < i; j++)
            {
                Node node2 = namednodemap1.item(j);
                System.out.println("Entity: " + node2.getNodeName() + "=" + node2.getNodeValue());
            }

            // fall through

        default:
            node1 = node.getFirstChild();
            break;
        }
        for(; node1 != null; node1 = node1.getNextSibling())
            logTree(node1);

    }
}
