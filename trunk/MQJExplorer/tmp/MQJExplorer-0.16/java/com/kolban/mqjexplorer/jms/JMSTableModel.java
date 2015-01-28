// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JMSTableModel.java

package com.kolban.mqjexplorer.jms;

import com.ibm.ejs.jms.mq.JMSWrapXAQueueConnectionFactory;
import com.ibm.ejs.jms.mq.JMSWrapXATopicConnectionFactory;
import com.ibm.mq.jms.MQConnectionFactory;
import com.ibm.mq.jms.MQDestination;
import com.kolban.mqjexplorer.TextIcon;
import javax.naming.Binding;
import javax.naming.NameClassPair;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

// Referenced classes of package com.kolban.mqjexplorer.jms:
//            JNDINameSpace

public class JMSTableModel extends AbstractTableModel
{

    public Class getColumnClass(int i)
    {
        switch(i)
        {
        case 0: // '\0'
            return com.kolban.mqjexplorer.TextIcon.class;
        }
        return java.lang.String.class;
    }

    public JMSTableModel()
    {
        jndiNameSpace = null;
    }

    public int getColumnCount()
    {
        return columnNames.length;
    }

    public String getColumnName(int i)
    {
        return columnNames[i];
    }

    public int getRowCount()
    {
        if(jndiNameSpace == null)
            return 0;
        else
            return jndiNameSpace.countManagedObjects();
    }

    public Object getValueAt(int i, int j)
    {
        if(jndiNameSpace == null)
            return null;
        Binding binding = jndiNameSpace.getBinding(i);
        String s = columnNames[j];
        if(s.equals("Name"))
        {
            TextIcon texticon = new TextIcon();
            texticon.setText(binding.getName());
            String s3 = binding.getClassName();
            if(s3.equals("com.ibm.mq.jms.MQQueue"))
                texticon.setIcon(new ImageIcon(this.getClass().getResource("/icons/tableicons/jms/q.gif")));
            else
            if(s3.equals("com.ibm.mq.jms.MQTopic"))
                texticon.setIcon(new ImageIcon(this.getClass().getResource("/icons/tableicons/jms/t.gif")));
            else
            if(s3.equals("com.ibm.mq.jms.MQXAQueueConnectionFactory"))
                texticon.setIcon(null);
            else
            if(s3.equals("com.ibm.mq.jms.MQXATopicConnectionFactory"))
                texticon.setIcon(null);
            else
            if(s3.equals("com.ibm.ejs.jms.mq.JMSWrapXAQueueConnectionFactory"))
                texticon.setIcon(new ImageIcon(this.getClass().getResource("/icons/tableicons/jms/qcf.gif")));
            else
            if(s3.equals("com.ibm.ejs.jms.mq.JMSWrapXATopicConnectionFactory"))
                texticon.setIcon(new ImageIcon(this.getClass().getResource("/icons/tableicons/jms/tcf.gif")));
            else
            if(s3.equals("com.ibm.mq.jms.MQQueueConnectionFactory"))
                texticon.setIcon(new ImageIcon(getClass().getResource("/icons/tableicons/jms/qcf.gif")));
            else
            if(s3.equals("com.ibm.mq.jms.MQTopicConnectionFactory"))
                texticon.setIcon(new ImageIcon(getClass().getResource("/icons/tableicons/jms/tcf.gif")));
            else
                texticon.setIcon(null);
            return texticon;
        }
        if(s.equals("Type"))
        {
            String s1 = binding.getClassName();
            if(s1.equals("com.ibm.mq.jms.MQQueue"))
                return "Queue";
            if(s1.equals("com.ibm.mq.jms.MQTopic"))
                return "Topic";
            if(s1.equals("com.ibm.mq.jms.MQQueueConnectionFactory"))
                return "Queue Connection Factory";
            if(s1.equals("com.ibm.mq.jms.MQTopicConnectionFactory"))
                return "Topic Connection Factory";
            if(s1.equals("com.ibm.mq.jms.MQXAQueueConnectionFactory"))
                return "XA Queue Connection Factory";
            if(s1.equals("com.ibm.mq.jms.MQXATopicConnectionFactory"))
                return "XA Topic Connection Factory";
            if(s1.equals("com.ibm.ejs.jms.mq.JMSWrapXAQueueConnectionFactory"))
                return "WAS Queue Connection Factory";
            if(s1.equals("com.ibm.ejs.jms.mq.JMSWrapXATopicConnectionFactory"))
                return "WAS Topic Connection Factory";
        }
        if(s.equals("Description"))
        {
            String s2 = binding.getClassName();
            if(s2.equals("com.ibm.mq.jms.MQQueue") || s2.equals("com.ibm.mq.jms.MQTopic"))
            {
                MQDestination mqdestination = (MQDestination)binding.getObject();
                return mqdestination.getDescription();
            }
            if(s2.equals("com.ibm.mq.jms.MQQueueConnectionFactory") || s2.equals("com.ibm.mq.jms.MQTopicConnectionFactory") || s2.equals("com.ibm.mq.jms.MQXAQueueConnectionFactory") || s2.equals("com.ibm.mq.jms.MQXATopicConnectionFactory"))
            {
                MQConnectionFactory mqconnectionfactory = (MQConnectionFactory)binding.getObject();
                return mqconnectionfactory.getDescription();
            }
            if(s2.equals("com.ibm.ejs.jms.mq.JMSWrapXAQueueConnectionFactory"))
            {
                JMSWrapXAQueueConnectionFactory jmswrapxaqueueconnectionfactory = (JMSWrapXAQueueConnectionFactory)binding.getObject();
                MQConnectionFactory mqconnectionfactory1 = (MQConnectionFactory)jmswrapxaqueueconnectionfactory.getProviderObject();
                return mqconnectionfactory1.getDescription();
            }
            if(s2.equals("com.ibm.ejs.jms.mq.JMSWrapXATopicConnectionFactory"))
            {
                JMSWrapXATopicConnectionFactory jmswrapxatopicconnectionfactory = (JMSWrapXATopicConnectionFactory)binding.getObject();
                MQConnectionFactory mqconnectionfactory2 = (MQConnectionFactory)jmswrapxatopicconnectionfactory.getProviderObject();
                return mqconnectionfactory2.getDescription();
            }
        }
        return null;
    }

    public void setJndiNameSpace(JNDINameSpace jndinamespace)
    {
        jndiNameSpace = jndinamespace;
        fireTableDataChanged();
    }

    private final String columnNames[] = {
        "Name", "Type", "Description"
    };
    private JNDINameSpace jndiNameSpace;
}
