// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueListModel.java

package com.kolban.mqjexplorer;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFMessage;
import com.ibm.mq.pcf.PCFMessageAgent;
import com.kolban.mqjexplorer.guibeans.QFullBar;
import com.kolban.mqjexplorer.utils.Filter;
import java.util.Vector;
import javax.swing.ImageIcon;

// Referenced classes of package com.kolban.mqjexplorer:
//            TextIcon

public class QueueListModel
{

    public QueueListModel()
    {
        responses = null;
        filteredResponses = null;
        showSystemQueues = false;
        showTempQueues = false;
        showModelQueues = true;
        showAliasQueues = true;
        showRemoteQueues = true;
        showLocalQueues = true;
        filter = new Filter();
    }

    public void deleteQueue(String s)
    {
        try
        {
            int i = -1;
            for(int j = 0; j < responses.length; j++)
            {
                String s1 = responses[j].getStringParameterValue(2016);
                if(!s1.equals(s))
                    continue;
                i = j;
                break;
            }

            if(i != -1)
            {
                PCFMessage apcfmessage[] = new PCFMessage[responses.length - 1];
                System.arraycopy(responses, 0, apcfmessage, 0, i);
                System.arraycopy(responses, i + 1, apcfmessage, i, responses.length - i - 1);
                responses = apcfmessage;
            }
            filter.remove(s);
            filterQueues();
        }
        catch(Exception exception)
        {
            System.out.println("deleteQueue: " + exception.toString());
        }
    }

    private void filterQueues()
    {
        if(responses == null)
            return;
        if(showSystemQueues)
        {
            filteredResponses = responses;
        } else
        {
            Vector vector = new Vector();
            for(int i = 0; i < responses.length; i++)
                try
                {
                    String s1 = responses[i].getStringParameterValue(2016);
                    if(!s1.startsWith("SYSTEM."))
                        vector.addElement(responses[i]);
                }
                catch(Exception _ex) { }

            filteredResponses = new PCFMessage[vector.size()];
            for(int j = 0; j < vector.size(); j++)
                filteredResponses[j] = (PCFMessage)vector.elementAt(j);

        }
        Vector vector1 = new Vector();
        for(int k = 0; k < filteredResponses.length; k++)
            try
            {
                int i1 = filteredResponses[k].getIntParameterValue(20);
                switch(i1)
                {
                case 4: // '\004'
                case 5: // '\005'
                default:
                    break;

                case 2: // '\002'
                    if(showModelQueues)
                        vector1.addElement(filteredResponses[k]);
                    break;

                case 3: // '\003'
                    if(showAliasQueues)
                        vector1.addElement(filteredResponses[k]);
                    break;

                case 6: // '\006'
                    if(showRemoteQueues)
                        vector1.addElement(filteredResponses[k]);
                    break;

                case 1: // '\001'
                    if(!showLocalQueues)
                        break;
                    if(!showTempQueues)
                        try
                        {
                            int l1 = filteredResponses[k].getIntParameterValue(7);
                            if(l1 != 3)
                                vector1.addElement(filteredResponses[k]);
                        }
                        catch(Exception _ex)
                        {
                            vector1.addElement(filteredResponses[k]);
                        }
                    else
                        vector1.addElement(filteredResponses[k]);
                    break;
                }
            }
            catch(Exception _ex) { }

        filteredResponses = new PCFMessage[vector1.size()];
        for(int l = 0; l < vector1.size(); l++)
            filteredResponses[l] = (PCFMessage)vector1.elementAt(l);

        vector1 = new Vector();
        Object obj = null;
        for(int j1 = 0; j1 < filteredResponses.length; j1++)
            try
            {
                String s = filteredResponses[j1].getStringParameterValue(2016);
                Boolean boolean1 = filter.getIncluded(s);
                if(boolean1 == null)
                {
                    boolean1 = new Boolean(true);
                    filter.setIncluded(s, true);
                }
                if(boolean1.booleanValue())
                    vector1.addElement(filteredResponses[j1]);
            }
            catch(Exception _ex) { }

        filteredResponses = new PCFMessage[vector1.size()];
        for(int k1 = 0; k1 < vector1.size(); k1++)
            filteredResponses[k1] = (PCFMessage)vector1.elementAt(k1);

    }

    public PCFMessage findQueueByName(String s)
    {
        s = s.trim();
        for(int i = 0; i < responses.length; i++)
            try
            {
                if(s.equals(responses[i].getStringParameterValue(2016).trim()))
                    return responses[i];
            }
            catch(Exception _ex) { }

        return null;
    }

    public Filter getFilter()
    {
        return filter;
    }

    public String[] getLocalQueueNames(int i)
    {
        boolean flag = (i & 2) != 0;
        boolean flag1 = (i & 1) != 0;
        boolean flag2 = (i & 4) != 0;
        boolean flag3 = (i & 8) != 0;
        int j = responses.length;
        Vector vector = new Vector(j);
        for(int k = 0; k < j; k++)
            try
            {
                String s = responses[k].getStringParameterValue(2016).trim();
                if((flag1 || !s.startsWith("SYSTEM.")) && responses[k].getIntParameterValue(20) == 1)
                {
                    boolean flag4 = responses[k].getIntParameterValue(7) == 1;
                    boolean flag5 = responses[k].getIntParameterValue(12) == 1;
                    if(flag2)
                    {
                        if(flag5)
                            vector.addElement(s);
                    } else
                    if((!flag5 || flag3) && (flag4 || flag))
                        vector.addElement(s);
                }
            }
            catch(Exception _ex) { }

        String as[] = new String[vector.size()];
        for(int l = 0; l < vector.size(); l++)
            as[l] = (String)vector.get(l);

        return as;
    }

    public int getQueueCount()
    {
        if(filteredResponses == null)
            return 0;
        else
            return filteredResponses.length;
    }

    public String getQueueName(int i)
    {
        try
        {
            return filteredResponses[i].getStringParameterValue(2016);
        }
        catch(Exception _ex)
        {
            return "";
        }
    }

    public int getQueueType(int i)
    {
        try
        {
            return filteredResponses[i].getIntParameterValue(20);
        }
        catch(Exception _ex)
        {
            return -1;
        }
    }

    public Object getValueAt(int i, String s)
    {
        if(filteredResponses == null)
            return null;
        try
        {
            PCFMessage pcfmessage = filteredResponses[i];
            if(s.equals("QFull Level"))
            {
                QFullBar qfullbar = new QFullBar();
                qfullbar.qDepth = pcfmessage.getIntParameterValue(3);
                qfullbar.maxQDepth = pcfmessage.getIntParameterValue(15);
                return qfullbar;
            }
            if(s.equals("Name"))
            {
                TextIcon texticon = new TextIcon();
                texticon.setText(pcfmessage.getStringParameterValue(2016).trim());
                switch(pcfmessage.getIntParameterValue(20))
                {
                case 4: // '\004'
                case 5: // '\005'
                case 7: // '\007'
                default:
                    break;

                case 3: // '\003'
                    texticon.setIcon(new ImageIcon(getClass().getResource("/icons/qAlias.gif")));
                    break;

                case 1: // '\001'
                    switch(pcfmessage.getIntParameterValue(12))
                    {
                    case 0: // '\0'
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/qLocal.gif")));
                        break;

                    case 1: // '\001'
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/qXmit.gif")));
                        break;
                    }
                    break;

                case 2: // '\002'
                    texticon.setIcon(new ImageIcon(getClass().getResource("/icons/qModel.gif")));
                    break;

                case 6: // '\006'
                    texticon.setIcon(new ImageIcon(getClass().getResource("/icons/qRemote.gif")));
                    break;
                }
                return texticon;
            }
            if(s.equals("Queue Type"))
            {
                int j = pcfmessage.getIntParameterValue(20);
                switch(j)
                {
                case 3: // '\003'
                    return "Alias";

                case 7: // '\007'
                    return "Cluster";

                case 1: // '\001'
                    return "Local";

                case 2: // '\002'
                    return "Model";

                case 6: // '\006'
                    return "Remote";
                }
            }
            if(s.equals("Cluster Name"))
                return pcfmessage.getStringParameterValue(2029).trim();
            if(s.equals("Cluster Namelist"))
                return pcfmessage.getStringParameterValue(2030).trim();
            if(s.equals("Hosting Queue Manager"))
                return pcfmessage.getStringParameterValue(2031).trim();
            if(s.equals("Cluster Queue Type"))
            {
                int k = pcfmessage.getIntParameterValue(59);
                switch(k)
                {
                case 2: // '\002'
                    return "Alias";

                case 1: // '\001'
                    return "Local";

                case 4: // '\004'
                    return "Queue Manager Alias";

                case 3: // '\003'
                    return "Remote";
                }
                return "** unknown **";
            }
            if(s.equals("Current Depth"))
                return Integer.toString(pcfmessage.getIntParameterValue(3));
            if(s.equals("Default Persistence"))
            {
                int l = pcfmessage.getIntParameterValue(5);
                switch(l)
                {
                case 0: // '\0'
                    return "Not persistent";

                case 1: // '\001'
                    return "Persistent";
                }
            }
            if(s.equals("Alteration Date (GMT)"))
                return pcfmessage.getStringParameterValue(2027).trim();
            if(s.equals("Alteration Time (GMT)"))
                return pcfmessage.getStringParameterValue(2028).trim();
            if(s.equals("Backout Requeue Queue Name"))
                return pcfmessage.getStringParameterValue(2019).trim();
            if(s.equals("Base Queue Name"))
                return pcfmessage.getStringParameterValue(2002).trim();
            if(s.equals("Backout Threshold"))
                return Integer.toString(pcfmessage.getIntParameterValue(22));
            if(s.equals("Alteration Date/Time"))
                return pcfmessage.getStringParameterValue(2027).trim() + " " + pcfmessage.getStringParameterValue(2028).trim();
            if(s.equals("Creation Date (GMT)"))
                return pcfmessage.getStringParameterValue(2004).trim();
            if(s.equals("Creation Date/Time"))
                return pcfmessage.getStringParameterValue(2004).trim() + " " + pcfmessage.getStringParameterValue(2005).trim();
            if(s.equals("Default Bind"))
            {
                int i1 = pcfmessage.getIntParameterValue(61);
                switch(i1)
                {
                case 1: // '\001'
                    return "Not fixed";

                case 0: // '\0'
                    return "On Open";
                }
            }
            if(s.equals("Default Input Open Option"))
            {
                int j1 = pcfmessage.getIntParameterValue(4);
                switch(j1)
                {
                case 4: // '\004'
                    return "Exclusive";

                case 2: // '\002'
                    return "Shared";
                }
            }
            if(s.equals("Default Priority"))
                return Integer.toString(pcfmessage.getIntParameterValue(6));
            if(s.equals("Definition Type"))
            {
                int k1 = pcfmessage.getIntParameterValue(7);
                switch(k1)
                {
                case 2: // '\002'
                    return "Permanent dynamic";

                case 1: // '\001'
                    return "Predefined";

                case 3: // '\003'
                    return "Temporary dynamic";
                }
            }
            if(s.equals("Description"))
                return pcfmessage.getStringParameterValue(2013).trim();
            if(s.equals("Distribution Lists"))
            {
                int l1 = pcfmessage.getIntParameterValue(34);
                switch(l1)
                {
                case 0: // '\0'
                    return "Not supported";

                case 1: // '\001'
                    return "Supported";
                }
            }
            if(s.equals("Get Messages"))
            {
                int i2 = pcfmessage.getIntParameterValue(9);
                switch(i2)
                {
                case 1: // '\001'
                    return "Get inhibited";

                case 0: // '\0'
                    return "Get allowed";
                }
            }
            if(s.equals("Put Message"))
            {
                int j2 = pcfmessage.getIntParameterValue(10);
                switch(j2)
                {
                case 1: // '\001'
                    return "Put inhibited";

                case 0: // '\0'
                    return "Put allowed";
                }
            }
            if(s.equals("Harden Get Backout"))
            {
                int k2 = pcfmessage.getIntParameterValue(8);
                switch(k2)
                {
                case 1: // '\001'
                    return "Hardened";

                case 0: // '\0'
                    return "Not hardened";
                }
            }
            if(s.equals("High Depth Event"))
            {
                int l2 = pcfmessage.getIntParameterValue(43);
                switch(l2)
                {
                case 1: // '\001'
                    return "Enabled";

                case 0: // '\0'
                    return "Disabled";
                }
            }
            if(s.equals("Low Depth Event"))
            {
                int i3 = pcfmessage.getIntParameterValue(44);
                switch(i3)
                {
                case 1: // '\001'
                    return "Enabled";

                case 0: // '\0'
                    return "Disabled";
                }
            }
            if(s.equals("Maximum Depth Event"))
            {
                int j3 = pcfmessage.getIntParameterValue(44);
                switch(j3)
                {
                case 1: // '\001'
                    return "Enabled";

                case 0: // '\0'
                    return "Disabled";
                }
            }
            if(s.equals("High Depth Limit"))
                return Integer.toString(pcfmessage.getIntParameterValue(40));
            if(s.equals("Low Depth Limit"))
                return Integer.toString(pcfmessage.getIntParameterValue(41));
            if(s.equals("Initiation Queue Name"))
                return pcfmessage.getStringParameterValue(2008).trim();
            if(s.equals("Maximum Depth"))
                return Integer.toString(pcfmessage.getIntParameterValue(15));
            if(s.equals("Maximum Message Length"))
                return Integer.toString(pcfmessage.getIntParameterValue(13));
            if(s.equals("Open Output Count"))
                return Integer.toString(pcfmessage.getIntParameterValue(18));
            if(s.equals("Open Input Count"))
                return Integer.toString(pcfmessage.getIntParameterValue(17));
            if(s.equals("Process Name"))
                return pcfmessage.getStringParameterValue(2012).trim();
            if(s.equals("Message Delivery Sequence"))
            {
                int k3 = pcfmessage.getIntParameterValue(16);
                switch(k3)
                {
                case 1: // '\001'
                    return "FIFO";

                case 0: // '\0'
                    return "Priority";
                }
            }
            if(s.equals("Queue Manager Identifier"))
                return pcfmessage.getStringParameterValue(2032).trim();
            if(s.equals("Queue Service Interval"))
                return Integer.toString(pcfmessage.getIntParameterValue(54));
            if(s.equals("Queue Service Interval Event"))
            {
                int l3 = pcfmessage.getIntParameterValue(46);
                switch(l3)
                {
                case 1: // '\001'
                    return "High";

                case 0: // '\0'
                    return "None";

                case 2: // '\002'
                    return "Ok";
                }
            }
            if(s.equals("Remote Queue Manager Name"))
                return pcfmessage.getStringParameterValue(2017).trim();
            if(s.equals("Remote Queue Name"))
                return pcfmessage.getStringParameterValue(2018).trim();
            if(s.equals("Retention Interval"))
                return Integer.toString(pcfmessage.getIntParameterValue(21));
            if(s.equals("Scope"))
            {
                int i4 = pcfmessage.getIntParameterValue(45);
                switch(i4)
                {
                case 1: // '\001'
                    return "QMgr";

                case 2: // '\002'
                    return "Cell";
                }
            }
            if(s.equals("Shareability"))
            {
                int j4 = pcfmessage.getIntParameterValue(23);
                switch(j4)
                {
                case 1: // '\001'
                    return "Shareable";

                case 0: // '\0'
                    return "Not shareable";
                }
            }
            if(s.equals("Transmission Queue Name"))
                return pcfmessage.getStringParameterValue(2024).trim();
            if(s.equals("Trigger Control"))
            {
                int k4 = pcfmessage.getIntParameterValue(24);
                switch(k4)
                {
                case 0: // '\0'
                    return "Off";

                case 1: // '\001'
                    return "On";
                }
            }
            if(s.equals("Trigger Data"))
                return pcfmessage.getStringParameterValue(2023).trim();
            if(s.equals("Trigger Depth"))
                return Integer.toString(pcfmessage.getIntParameterValue(29));
            if(s.equals("Trigger Message Priority"))
                return Integer.toString(pcfmessage.getIntParameterValue(26));
            if(s.equals("Trigger Type"))
            {
                int l4 = pcfmessage.getIntParameterValue(28);
                switch(l4)
                {
                case 3: // '\003'
                    return "Depth";

                case 2: // '\002'
                    return "Every";

                case 1: // '\001'
                    return "First";

                case 0: // '\0'
                    return "None";
                }
            }
            if(s.equals("Usage"))
            {
                int i5 = pcfmessage.getIntParameterValue(12);
                switch(i5)
                {
                case 0: // '\0'
                    return "Normal";

                case 1: // '\001'
                    return "Transmission";
                }
            }
            if(s.equals("Message Archiving"))
                return "";
            if(s.equals("Storage Class"))
                return "";
        }
        catch(Exception _ex)
        {
            return "";
        }
        return "Cell(" + Integer.toString(i) + "," + s + ")";
    }

    public boolean isShowAliasQueues()
    {
        return showAliasQueues;
    }

    public boolean isShowLocalQueues()
    {
        return showLocalQueues;
    }

    public boolean isShowModelQueues()
    {
        return showModelQueues;
    }

    public boolean isShowRemoteQueues()
    {
        return showRemoteQueues;
    }

    public boolean isShowSystemQueues()
    {
        return showSystemQueues;
    }

    public boolean isShowTempQueues()
    {
        return showTempQueues;
    }

    void refreshAll(PCFMessageAgent pcfmessageagent)
    {
        try
        {
            System.out.println("** Refreshing all queues --");
            PCFMessage pcfmessage = new PCFMessage(13);
            pcfmessage.addParameter(2016, "*");
            pcfmessage.addParameter(20, 1001);
            responses = pcfmessageagent.send(pcfmessage);
            filterQueues();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public void refreshIfNeeded(PCFMessageAgent pcfmessageagent)
    {
        if(responses == null)
            refreshAll(pcfmessageagent);
    }

    public void refreshQueue(PCFMessageAgent pcfmessageagent, String s)
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(13);
            pcfmessage.addParameter(2016, s);
            pcfmessage.addParameter(20, 1001);
            PCFMessage apcfmessage[];
            try
            {
                apcfmessage = pcfmessageagent.send(pcfmessage);
            }
            catch(MQException mqexception)
            {
                if(mqexception.reasonCode == 2085)
                {
                    deleteQueue(s);
                    return;
                } else
                {
                    throw mqexception;
                }
            }
            boolean flag = false;
            for(int i = 0; i < responses.length; i++)
            {
                String s1 = responses[i].getStringParameterValue(2016);
                if(!s1.equals(s))
                    continue;
                responses[i] = apcfmessage[0];
                flag = true;
                break;
            }

            if(!flag)
            {
                PCFMessage apcfmessage1[] = new PCFMessage[responses.length + 1];
                System.arraycopy(responses, 0, apcfmessage1, 0, responses.length);
                apcfmessage1[responses.length] = apcfmessage[0];
                responses = apcfmessage1;
            }
            filterQueues();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public void setFilter(Filter filter1)
    {
        filter = filter1;
        filterQueues();
    }

    public void setShowAliasQueues(boolean flag)
    {
        showAliasQueues = flag;
        filterQueues();
    }

    public void setShowLocalQueues(boolean flag)
    {
        showLocalQueues = flag;
        filterQueues();
    }

    public void setShowModelQueues(boolean flag)
    {
        showModelQueues = flag;
        filterQueues();
    }

    public void setShowRemoteQueues(boolean flag)
    {
        showRemoteQueues = flag;
        filterQueues();
    }

    public void setShowSystemQueues(boolean flag)
    {
        showSystemQueues = flag;
        filterQueues();
    }

    public void setShowTempQueues(boolean flag)
    {
        showTempQueues = flag;
        filterQueues();
    }

    private PCFMessage responses[];
    private PCFMessage filteredResponses[];
    private boolean showSystemQueues;
    private boolean showTempQueues;
    private boolean showModelQueues;
    private boolean showAliasQueues;
    private boolean showRemoteQueues;
    private boolean showLocalQueues;
    public static final int INCLUDE_SYSTEM = 1;
    public static final int INCLUDE_TEMP = 2;
    public static final int MATCH_XMIT = 4;
    public static final int INCLUDE_XMIT = 8;
    private Filter filter;
}
