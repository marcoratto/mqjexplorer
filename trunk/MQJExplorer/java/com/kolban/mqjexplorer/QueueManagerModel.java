// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueManagerModel.java

package com.kolban.mqjexplorer;

import com.ibm.mq.*;
import com.ibm.mq.pcf.*;
import com.kolban.mq.PCFUtils;
import com.kolban.mq.SimpleSecurityExit;
import com.kolban.mqjexplorer.beans.QMgrDlg;
import java.io.*;
import java.util.Properties;
import javax.swing.JOptionPane;

// Referenced classes of package com.kolban.mqjexplorer:
//            QueueListModel, ProcessListModel, ChannelListModel, NamelistListModel, 
//            MQJExplorer

public class QueueManagerModel
    implements Externalizable
{

    public QueueManagerModel()
    {
        agent = null;
        queueManagerName = null;
        hostName = "";
        channel = "SYSTEM.ADMIN.SVRCONN";
        port = 1414;
        queueManager = null;
        queueListModel = new QueueListModel();
        processListModel = new ProcessListModel();
        channelListModel = new ChannelListModel();
        nameListListModel = new NamelistListModel();
        responses = null;
    }

    public void changeProperties()
    {
        QMgrDlg qmgrdlg = new QMgrDlg();
        qmgrdlg.change(this);
        refreshQMgrProperties();
    }

    public void connect()
        throws MQException
    {
        Properties properties = new Properties();
        properties.put("hostname", hostName);
        properties.put("port", new Integer(port));
        properties.put("channel", channel);
        properties.put("transport", "MQSeries");
        properties.put("securityExit", new SimpleSecurityExit());
        try
        {
            queueManager = new MQQueueManager(queueManagerName, properties);
        }
        catch(MQException mqexception)
        {
            System.out.println("Failed to connect to queue manager: " + mqexception.toString());
            queueManager = null;
            throw mqexception;
        }
        MQQueue mqqueue = queueManager.accessQueue(queueManager.getCommandInputQueueName(), 32);
        int i = mqqueue.getOpenInputCount();
        mqqueue.close();
        if(i == 0)
        {
            disconnect();
            throw new MQException(2, 1, "No command server running!");
        } else
        {
            queueListModel.refreshAll(getAgent());
            channelListModel.refreshAll(getAgent());
            nameListListModel.refreshAll(getAgent());
            processListModel.refreshAll(getAgent());
            refreshQMgrProperties();
            return;
        }
    }

    public void deleteQueue(String s, boolean flag)
        throws MQException
    {
        PCFUtils.deleteQueue(getAgent(), s, flag);
        queueListModel.deleteQueue(s);
    }

    public void disconnect()
    {
        try
        {
            if(agent != null)
            {
                agent.disconnect();
                agent = null;
            }
            if(queueManager != null)
            {
                queueManager.disconnect();
                queueManager = null;
            }
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public static boolean displayError(MQException mqexception)
    {
        String s = null;
        switch(mqexception.reasonCode)
        {
        case 4068: 
            s = "Cell directory is not available";
            break;

        case 4004: 
            s = "Object open";
            break;

        case 2042: 
            s = "Object in use";
            break;

        case 2016: 
            s = "Get Inhibited";
            break;

        case 2053: 
            s = "Queue full";
            break;

        case 2059: 
            s = "Queue manager not available";
            break;

        case 2063: 
            s = "Security error";
            break;

        case 1: // '\001'
            s = "No command server running!";
            break;

        case 2161: 
            s = "Queue manager quiescing";
            break;

        case 4001: 
            s = "Object already exists";
            break;

        case 4010: 
            s = "Host not available";
            break;

        case 4033: 
            s = "Unknown remote channel";
            break;

        default:
            s = "Unknown error: " + mqexception.toString();
            break;
        }
        JOptionPane.showMessageDialog(MQJExplorer.mainFrame, s, "MQSeries error", 0);
        return true;
    }

    public boolean equals(QueueManagerModel queuemanagermodel)
    {
        if(queuemanagermodel.port != port)
            return false;
        if(!hostName.equals(queuemanagermodel.hostName))
            return false;
        return queueManagerName.equals(queuemanagermodel.queueManagerName);
    }

    public void executePCF(PCFMessage pcfmessage)
        throws MQException
    {
        PCFMessageAgent pcfmessageagent = getAgent();
        try
        {
            pcfmessageagent.send(pcfmessage);
        }
        catch(IOException ioexception)
        {
            System.out.println("executePCF: " + ioexception.toString());
        }
    }

    public PCFMessage findQueueByName(String s)
    {
        return queueListModel.findQueueByName(s);
    }

    public PCFMessageAgent getAgent()
        throws MQException
    {
        if(agent != null)
        {
            return agent;
        } else
        {
            MQQueueManager mqqueuemanager = getQueueManager();
            agent = new PCFMessageAgent(mqqueuemanager);
            agent.setWaitInterval(30);
            return agent;
        }
    }

    public String getChannel()
    {
        return channel;
    }

    public ChannelListModel getChannelListModel()
    {
        return channelListModel;
    }

    public String getHostName()
    {
        return hostName;
    }

    public NamelistListModel getNamelistListModel()
    {
        return nameListListModel;
    }

    public MQQueueManager getNewQueueManager()
        throws MQException
    {
        MQQueueManager mqqueuemanager = null;
        Properties properties = new Properties();
        properties.put("hostname", hostName);
        properties.put("port", new Integer(port));
        properties.put("channel", channel);
        properties.put("transport", "MQSeries");
        properties.put("securityExit", new SimpleSecurityExit());
        try
        {
            mqqueuemanager = new MQQueueManager(queueManagerName, properties);
        }
        catch(MQException mqexception)
        {
            System.out.println("Failed to connect to queue manager: " + mqexception.toString());
            mqqueuemanager = null;
            throw mqexception;
        }
        return mqqueuemanager;
    }

    public int getPort()
    {
        return port;
    }

    public ProcessListModel getProcessListModel()
    {
        return processListModel;
    }

    public PCFMessage getQMgrProperties()
    {
        if(responses == null)
            return null;
        else
            return responses[0];
    }

    public QueueListModel getQueueListModel()
    {
        return queueListModel;
    }

    public MQQueueManager getQueueManager()
        throws MQException
    {
        if(queueManager == null)
            connect();
        return queueManager;
    }

    public String getQueueManagerName()
    {
        return queueManagerName;
    }

    public boolean hasPubSub()
    {
        QueueListModel queuelistmodel = getQueueListModel();
        if(queuelistmodel == null)
            return false;
        return queuelistmodel.findQueueByName("SYSTEM.BROKER.CONTROL.QUEUE") != null;
    }

    public boolean hasWMQI()
    {
        return false;
    }

    public boolean isConnected()
    {
        return queueManager != null;
    }

    public boolean isLocal()
    {
        return hostName == null || hostName.length() == 0;
    }

    boolean isShowAliasQueues()
    {
        return queueListModel.isShowAliasQueues();
    }

    boolean isShowLocalQueues()
    {
        return queueListModel.isShowLocalQueues();
    }

    boolean isShowModelQueues()
    {
        return queueListModel.isShowModelQueues();
    }

    boolean isShowRemoteQueues()
    {
        return queueListModel.isShowRemoteQueues();
    }

    boolean isShowSystemQueues()
    {
        return queueListModel.isShowSystemQueues();
    }

    boolean isShowTempQueues()
    {
        return queueListModel.isShowTempQueues();
    }

    public void parseConnectionString(String s)
        throws Exception
    {
        int j = s.indexOf('(');
        if(j > 0)
        {
            int i = s.indexOf(')');
            if(i < 0)
                throw new Exception("Badly formed connection string - no ')'");
            String s1 = s.substring(j + 1, i);
            try
            {
                port = Integer.parseInt(s1);
                hostName = s.substring(0, j);
            }
            catch(Exception _ex)
            {
                throw new Exception("Badly formed connection string - not a numeric port");
            }
        } else
        {
            port = 1414;
            hostName = s;
        }
    }

    public void putText(String s, String s1)
        throws MQException
    {
        MQMessage mqmessage = new MQMessage();
        mqmessage.format = "MQSTR   ";
        MQQueue mqqueue = null;
        try
        {
            mqqueue = getQueueManager().accessQueue(s, 16);
            mqmessage.writeString(s1);
            mqqueue.put(mqmessage);
            mqqueue.close();
        }
        catch(MQException mqexception)
        {
            if(mqqueue != null)
                mqqueue.close();
            throw mqexception;
        }
        catch(IOException _ex) { }
    }

    public void readExternal(ObjectInput objectinput)
        throws IOException
    {
        try
        {
            queueManagerName = (String)objectinput.readObject();
            hostName = (String)objectinput.readObject();
            port = objectinput.readInt();
            queueListModel.setShowSystemQueues(objectinput.readBoolean());
            queueListModel.setShowAliasQueues(objectinput.readBoolean());
            queueListModel.setShowLocalQueues(objectinput.readBoolean());
            queueListModel.setShowModelQueues(objectinput.readBoolean());
            queueListModel.setShowRemoteQueues(objectinput.readBoolean());
            queueListModel.setShowTempQueues(objectinput.readBoolean());
            try
            {
                if(isLocal())
                    connect();
            }
            catch(MQException _ex) { }
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            System.out.println("Exception: " + classnotfoundexception.toString());
        }
    }

    public void refreshQMgrProperties()
    {
        try
        {
            System.out.println("** Refreshing queue manager --");
            PCFMessage pcfmessage = new PCFMessage(2);
            int ai[] = {
                1009
            };
            pcfmessage.addParameter(1001, ai);
            responses = agent.send(pcfmessage);
        }
        catch(Exception exception)
        {
            System.out.println("Exception (QueueManagerModel::refresh): " + exception.toString());
        }
    }

    public void setChannel(String s)
    {
        queueManager = null;
        channel = s;
    }

    public void setHostName(String s)
    {
        if(s != null)
        {
            hostName = s;
            queueManager = null;
        }
    }

    public void setPort(int i)
    {
        port = i;
        queueManager = null;
    }

    public void setQueueManagerName(String s)
    {
        queueManagerName = s;
        queueManager = null;
        agent = null;
    }

    public void setShowAliasQueues(boolean flag)
    {
        queueListModel.setShowAliasQueues(flag);
    }

    public void setShowLocalQueues(boolean flag)
    {
        queueListModel.setShowLocalQueues(flag);
    }

    public void setShowModelQueues(boolean flag)
    {
        queueListModel.setShowModelQueues(flag);
    }

    public void setShowRemoteQueues(boolean flag)
    {
        queueListModel.setShowRemoteQueues(flag);
    }

    public void setShowSystemQueues(boolean flag)
    {
        queueListModel.setShowSystemQueues(flag);
    }

    public void setShowTempQueues(boolean flag)
    {
        queueListModel.setShowTempQueues(flag);
    }

    public String toString()
    {
        if(hostName.length() > 0)
            return queueManagerName + " on " + hostName + "(" + port + ")";
        else
            return queueManagerName;
    }

    public void writeExternal(ObjectOutput objectoutput)
        throws IOException
    {
        objectoutput.writeObject(queueManagerName);
        objectoutput.writeObject(hostName);
        objectoutput.writeInt(port);
        objectoutput.writeBoolean(queueListModel.isShowSystemQueues());
        objectoutput.writeBoolean(queueListModel.isShowAliasQueues());
        objectoutput.writeBoolean(queueListModel.isShowLocalQueues());
        objectoutput.writeBoolean(queueListModel.isShowModelQueues());
        objectoutput.writeBoolean(queueListModel.isShowRemoteQueues());
        objectoutput.writeBoolean(queueListModel.isShowTempQueues());
    }

    private transient PCFMessageAgent agent;
    private String queueManagerName;
    private String hostName;
    private String channel;
    private final int DEFAULT_PORT = 1414;
    private int port;
    private transient MQQueueManager queueManager;
    private transient QueueListModel queueListModel;
    private transient ProcessListModel processListModel;
    private transient ChannelListModel channelListModel;
    private transient NamelistListModel nameListListModel;
    private transient PCFMessage responses[];
    private static final int NO_COMMAND_SERVER = 1;
}
