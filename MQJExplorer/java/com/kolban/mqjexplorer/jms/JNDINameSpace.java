// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JNDINameSpace.java

package com.kolban.mqjexplorer.jms;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;
import javax.naming.*;
import javax.swing.JOptionPane;

public class JNDINameSpace
    implements Serializable
{

    public JNDINameSpace()
    {
        providerURL = null;
        initialContext = null;
        context = null;
        subContextBindings = null;
        managedObjects = null;
    }

    public void bind(String s, Object obj)
        throws NamingException
    {
        context.bind(s, obj);
        refresh();
    }

    public void connect()
    {
        if(initialContext == null || providerURL == null)
        {
            System.out.println("No context or provider URL supplied!");
            return;
        }
        if(isConnected())
            return;
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", initialContext);
        hashtable.put("java.naming.provider.url", providerURL);
        try
        {
            context = new InitialContext(hashtable);
            context.listBindings("");
            refresh();
        }
        catch(NamingException namingexception)
        {
            if(context != null)
                try
                {
                    context.close();
                }
                catch(Exception _ex) { }
            context = null;
            JOptionPane.showMessageDialog(null, namingexception.getExplanation() + namingexception.getRootCause() == null ? "" : ((Object) (namingexception.getRootCause().getMessage())), "Connect error", 0);
            System.out.println("Exception: " + namingexception.toString());
        }
    }

    public int countManagedObjects()
    {
        if(managedObjects == null)
            return 0;
        else
            return managedObjects.size();
    }

    public void deleteSubContext(String s)
        throws NamingException
    {
        context.destroySubcontext(s);
    }

    public void disconnect()
    {
        if(isConnected())
        {
            try
            {
                context.close();
            }
            catch(Exception _ex) { }
            context = null;
        }
    }

    public Binding getBinding(int i)
    {
        return (Binding)managedObjects.elementAt(i);
    }

    public String getInitialContext()
    {
        return initialContext;
    }

    public String getProviderURL()
    {
        return providerURL;
    }

    public Binding getSubContextBinding(int i)
    {
        return (Binding)subContextBindings.elementAt(i);
    }

    public int getSubContextCount()
    {
        if(subContextBindings == null)
            return 0;
        else
            return subContextBindings.size();
    }

    public boolean isConnected()
    {
        return context != null;
    }

    public JNDINameSpace newSubContext(String s)
        throws NamingException
    {
        Context context1 = context.createSubcontext(s);
        JNDINameSpace jndinamespace = new JNDINameSpace();
        jndinamespace.setContext(context1);
        jndinamespace.setProviderURL(s);
        return jndinamespace;
    }

    public void rebind(String s, Object obj)
        throws NamingException
    {
        context.rebind(s, obj);
        refresh();
    }

    public void refresh()
    {
        if(!isConnected())
            return;
        try
        {
            NamingEnumeration namingenumeration = context.listBindings("");
            managedObjects = new Vector();
            subContextBindings = new Vector();
            while(namingenumeration.hasMore()) 
            {
                Binding binding = (Binding)namingenumeration.next();
                String s = binding.getClassName();
                System.out.println("Name: " + binding.getName() + " ClassName: " + s);
                if(binding.getObject() instanceof Context)
                {
                    System.out.println("Subcontext ...");
                    subContextBindings.addElement(binding);
                }
                if(s.equals("com.ibm.mq.jms.MQQueue"))
                {
                    System.out.println("Got queue (by name): " + binding.getName());
                    managedObjects.addElement(binding);
                }
                if(s.equals("com.ibm.mq.jms.MQTopic"))
                {
                    System.out.println("Got topic (by name): " + binding.getName());
                    managedObjects.addElement(binding);
                }
                if(s.equals("com.ibm.mq.jms.MQQueueConnectionFactory"))
                    managedObjects.addElement(binding);
                if(s.equals("com.ibm.mq.jms.MQTopicConnectionFactory"))
                    managedObjects.addElement(binding);
                if(s.equals("com.ibm.mq.jms.MQXAQueueConnectionFactory"))
                    managedObjects.addElement(binding);
                if(s.equals("com.ibm.mq.jms.MQXATopicConnectionFactory"))
                    managedObjects.addElement(binding);
                if(s.equals("com.ibm.ejs.jms.mq.JMSWrapXAQueueConnectionFactory"))
                    managedObjects.addElement(binding);
                if(s.equals("com.ibm.ejs.jms.mq.JMSWrapXATopicConnectionFactory"))
                    managedObjects.addElement(binding);
            }
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public void setContext(Context context1)
    {
        context = context1;
    }

    public void setInitialContext(String s)
    {
        initialContext = s;
    }

    public void setProviderURL(String s)
    {
        providerURL = s;
    }

    public String toString()
    {
        return providerURL;
    }

    public void unbind(String s)
        throws NamingException
    {
        context.unbind(s);
        refresh();
    }

    private String providerURL;
    private String initialContext;
    private transient Context context;
    private transient Vector managedObjects;
    private transient Vector subContextBindings;
}
