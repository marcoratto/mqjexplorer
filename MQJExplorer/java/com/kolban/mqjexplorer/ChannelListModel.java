// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ChannelListModel.java

package com.kolban.mqjexplorer;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFMessage;
import com.ibm.mq.pcf.PCFMessageAgent;
import com.kolban.mqjexplorer.mqattributes.AlterationDate;
import com.kolban.mqjexplorer.mqattributes.AlterationTime;
import com.kolban.mqjexplorer.mqattributes.BatchInterval;
import com.kolban.mqjexplorer.mqattributes.BatchSize;
import com.kolban.mqjexplorer.mqattributes.ChannelDesc;
import com.kolban.mqjexplorer.mqattributes.ChannelName;
import com.kolban.mqjexplorer.mqattributes.ChannelStatus;
import com.kolban.mqjexplorer.mqattributes.ChannelType;
import com.kolban.mqjexplorer.mqattributes.ClusterName;
import com.kolban.mqjexplorer.mqattributes.ConnectionName;
import com.kolban.mqjexplorer.mqattributes.DataConversion;
import com.kolban.mqjexplorer.mqattributes.DiscInterval;
import com.kolban.mqjexplorer.mqattributes.HeartBeatInterval;
import com.kolban.mqjexplorer.mqattributes.LongRetryCount;
import com.kolban.mqjexplorer.mqattributes.LongRetryInterval;
import com.kolban.mqjexplorer.mqattributes.MCAName;
import com.kolban.mqjexplorer.mqattributes.MCAType;
import com.kolban.mqjexplorer.mqattributes.MCAUserIdentifier;
import com.kolban.mqjexplorer.mqattributes.MaxMsgLength;
import com.kolban.mqjexplorer.mqattributes.ModeName;
import com.kolban.mqjexplorer.mqattributes.MsgExit;
import com.kolban.mqjexplorer.mqattributes.MsgRetryCount;
import com.kolban.mqjexplorer.mqattributes.MsgRetryExit;
import com.kolban.mqjexplorer.mqattributes.MsgRetryInterval;
import com.kolban.mqjexplorer.mqattributes.MsgRetryUserData;
import com.kolban.mqjexplorer.mqattributes.MsgUserData;
import com.kolban.mqjexplorer.mqattributes.NetworkPriority;
import com.kolban.mqjexplorer.mqattributes.NonPersistentMsgSpeed;
import com.kolban.mqjexplorer.mqattributes.Password;
import com.kolban.mqjexplorer.mqattributes.PutAuthority;
import com.kolban.mqjexplorer.mqattributes.ReceiveExit;
import com.kolban.mqjexplorer.mqattributes.ReceiveUserData;
import com.kolban.mqjexplorer.mqattributes.SecurityExit;
import com.kolban.mqjexplorer.mqattributes.SecurityUserData;
import com.kolban.mqjexplorer.mqattributes.SendExit;
import com.kolban.mqjexplorer.mqattributes.SendUserData;
import com.kolban.mqjexplorer.mqattributes.SeqNumberWrap;
import com.kolban.mqjexplorer.mqattributes.ShortRetryCount;
import com.kolban.mqjexplorer.mqattributes.ShortRetryInterval;
import com.kolban.mqjexplorer.mqattributes.TpName;
import com.kolban.mqjexplorer.mqattributes.TransportType;
import com.kolban.mqjexplorer.mqattributes.UserIdentifier;
import java.util.Vector;
import javax.swing.ImageIcon;

// Referenced classes of package com.kolban.mqjexplorer:
//            TextIcon

public class ChannelListModel
{

    public ChannelListModel()
    {
        responses = null;
        filteredResponses = null;
        channelStatusResponses = null;
        showSystem = false;
    }

    public void deleteChannel(String s)
    {
        try
        {
            s = s.trim();
            int i = -1;
            for(int j = 0; j < responses.length; j++)
            {
                String s1 = responses[j].getStringParameterValue(3501).trim();
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
            deleteChannelStatus(s);
            filterChannels();
        }
        catch(Exception exception)
        {
            System.out.println("deleteChannel: " + exception.toString());
        }
    }

    public void deleteChannelStatus(String s)
    {
        try
        {
            s = s.trim();
            int i = -1;
            for(int j = 0; j < channelStatusResponses.length; j++)
            {
                String s1 = channelStatusResponses[j].getStringParameterValue(3501).trim();
                if(!s1.equals(s))
                    continue;
                i = j;
                break;
            }

            if(i != -1)
            {
                PCFMessage apcfmessage[] = new PCFMessage[channelStatusResponses.length - 1];
                System.arraycopy(channelStatusResponses, 0, apcfmessage, 0, i);
                System.arraycopy(channelStatusResponses, i + 1, apcfmessage, i, channelStatusResponses.length - i - 1);
                channelStatusResponses = apcfmessage;
            }
        }
        catch(Exception exception)
        {
            System.out.println("deleteChannel: " + exception.toString());
        }
    }

    public void filterChannels()
    {
        if(showSystem)
        {
            Vector vector = new Vector();
            for(int i = 0; i < responses.length; i++)
                try
                {
                    if(responses[i].getIntParameterValue(1511) != 6)
                        vector.addElement(responses[i]);
                }
                catch(Exception _ex) { }

            filteredResponses = new PCFMessage[vector.size()];
            for(int j = 0; j < vector.size(); j++)
                filteredResponses[j] = (PCFMessage)vector.elementAt(j);

        } else
        {
            Vector vector1 = new Vector();
            for(int k = 0; k < responses.length; k++)
                try
                {
                    if(responses[k].getIntParameterValue(1511) != 6)
                    {
                        String s = responses[k].getStringParameterValue(3501);
                        if(!s.startsWith("SYSTEM."))
                            vector1.addElement(responses[k]);
                    }
                }
                catch(Exception _ex) { }

            filteredResponses = new PCFMessage[vector1.size()];
            for(int l = 0; l < vector1.size(); l++)
                filteredResponses[l] = (PCFMessage)vector1.elementAt(l);

        }
    }

    public PCFMessage findChannelByName(String s)
    {
        s = s.trim();
        for(int i = 0; i < responses.length; i++)
            try
            {
                if(s.equals(responses[i].getStringParameterValue(3501).trim()))
                    return responses[i];
            }
            catch(Exception _ex) { }

        return null;
    }

    public PCFMessage findChannelStatusByName(String s)
    {
        if(channelStatusResponses == null)
            return null;
        s = s.trim();
        for(int i = 0; i < channelStatusResponses.length; i++)
            try
            {
                if(s.equals(channelStatusResponses[i].getStringParameterValue(3501).trim()))
                    return channelStatusResponses[i];
            }
            catch(Exception _ex) { }

        return null;
    }

    public int getChannelCount()
    {
        if(filteredResponses == null)
            return 0;
        else
            return filteredResponses.length;
    }

    public String getChannelName(int i)
    {
        try
        {
            return filteredResponses[i].getStringParameterValue(3501);
        }
        catch(Exception _ex)
        {
            return "";
        }
    }

    public int getChannelStatus(int i)
    {
        try
        {
            return filteredResponses[i].getIntParameterValue(1527);
        }
        catch(Exception _ex)
        {
            return -1;
        }
    }

    public int getChannelType(int i)
    {
        try
        {
            return filteredResponses[i].getIntParameterValue(1511);
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
            if(s.equals("Name"))
            {
                TextIcon texticon = new TextIcon();
                texticon.setText(ChannelName.toString(pcfmessage.getStringParameterValue(3501)));
                int j = getChannelStatus(i);
                switch(pcfmessage.getIntParameterValue(1511))
                {
                case 5: // '\005'
                case 6: // '\006'
                default:
                    break;

                case 1: // '\001'
                    if(j == 6)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelSenderStopped.gif")));
                        break;
                    }
                    if(j == 0)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelSender.gif")));
                        break;
                    }
                    if(j == 3)
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelSenderRunning.gif")));
                    else
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelSenderRetrying.gif")));
                    break;

                case 2: // '\002'
                    if(j == 6)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelServerStopped.gif")));
                        break;
                    }
                    if(j == 0)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelServer.gif")));
                        break;
                    }
                    if(j == 3)
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelServerRunning.gif")));
                    else
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelServerRetrying.gif")));
                    break;

                case 3: // '\003'
                    if(j == 6)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelReceiverStopped.gif")));
                        break;
                    }
                    if(j == 0)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelReceiver.gif")));
                        break;
                    }
                    if(j == 3)
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelReceiverRunning.gif")));
                    else
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelReceiverRetrying.gif")));
                    break;

                case 4: // '\004'
                    if(j == 6)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelRequestorStopped.gif")));
                        break;
                    }
                    if(j == 0)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelRequestor.gif")));
                        break;
                    }
                    if(j == 3)
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelRequesterRunning.gif")));
                    else
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelRequestorRetrying.gif")));
                    break;

                case 7: // '\007'
                    if(j == 6)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelServerConnectionStopped.gif")));
                        break;
                    }
                    if(j == 0)
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelServerConnection.gif")));
                    else
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelServerConnectionRetrying.gif")));
                    break;

                case 8: // '\b'
                    if(j == 6)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelClusterReceiverStopped.gif")));
                        break;
                    }
                    if(j == 0)
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelClusterReceiver.gif")));
                    else
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelClusterReceiverRetrying.gif")));
                    break;

                case 9: // '\t'
                    if(j == 6)
                    {
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelClusterSenderStopped.gif")));
                        break;
                    }
                    if(j == 0)
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelClusterSender.gif")));
                    else
                        texticon.setIcon(new ImageIcon(getClass().getResource("/icons/channelClusterSenderRetrying.gif")));
                    break;
                }
                return texticon;
            }
            if(s.equals("Channel Type"))
                return ChannelType.toString(pcfmessage.getIntParameterValue(1511));
            if(s.equals("Protocol Type"))
                return TransportType.toString(pcfmessage.getIntParameterValue(1501));
            if(s.equals("Connection Name"))
                return ConnectionName.toString(pcfmessage.getStringParameterValue(3506));
            if(s.equals("Transmission Queue Name"))
                return ConnectionName.toString(pcfmessage.getStringParameterValue(3505));
            if(s.equals("Overall Channel Status"))
                return ChannelStatus.toString(pcfmessage.getIntParameterValue(1527));
            if(s.equals("Alteration Date (GMT)"))
                return AlterationDate.toString(pcfmessage.getStringParameterValue(2027));
            if(s.equals("Alteration Time (GMT)"))
                return AlterationTime.toString(pcfmessage.getStringParameterValue(2028));
            if(s.equals("Alteration Date/Time"))
                return AlterationDate.toString(pcfmessage.getStringParameterValue(2027)) + " " + AlterationTime.toString(pcfmessage.getStringParameterValue(2028));
            if(s.equals("Batch Interval"))
                return BatchInterval.toString(pcfmessage.getIntParameterValue(1564));
            if(s.equals("Batch Size"))
                return BatchSize.toString(pcfmessage.getIntParameterValue(1502));
            if(s.equals("Cluster Name"))
                return ClusterName.toString(pcfmessage.getStringParameterValue(2029));
            if(s.equals("Data Conversion"))
                return DataConversion.toString(pcfmessage.getIntParameterValue(1515));
            if(s.equals("Description"))
                return ChannelDesc.toString(pcfmessage.getStringParameterValue(3502));
            if(s.equals("Disconnection Interval"))
                return DiscInterval.toString(pcfmessage.getIntParameterValue(1503));
            if(s.equals("Heartbeat Interval"))
                return HeartBeatInterval.toString(pcfmessage.getIntParameterValue(1563));
            if(s.equals("Long Retry Count"))
                return LongRetryCount.toString(pcfmessage.getIntParameterValue(1507));
            if(s.equals("Long Retry Timer"))
                return LongRetryInterval.toString(pcfmessage.getIntParameterValue(1506));
            if(s.equals("Maximum Message Length"))
                return MaxMsgLength.toString(pcfmessage.getIntParameterValue(1510));
            if(s.equals("MCA Name"))
                return MCAName.toString(pcfmessage.getStringParameterValue(3507));
            if(s.equals("MCA Type"))
                return MCAType.toString(pcfmessage.getIntParameterValue(1517));
            if(s.equals("MCA User ID"))
                return MCAUserIdentifier.toString(pcfmessage.getStringParameterValue(3527));
            if(s.equals("Message Exit Name"))
                return MsgExit.toString(pcfmessage.getStringParameterValue(3509));
            if(s.equals("Message Exit User Data"))
                return MsgUserData.toString(pcfmessage.getStringParameterValue(3514));
            if(s.equals("Message Retry Count"))
                return MsgRetryCount.toString(pcfmessage.getIntParameterValue(1544));
            if(s.equals("Message Retry Exit Name"))
                return MsgRetryExit.toString(pcfmessage.getStringParameterValue(3534));
            if(s.equals("Message Retry Exit User Data"))
                return MsgRetryUserData.toString(pcfmessage.getStringParameterValue(3535));
            if(s.equals("Message Retry Interval"))
                return MsgRetryInterval.toString(pcfmessage.getIntParameterValue(1545));
            if(s.equals("Mode Name"))
                return ModeName.toString(pcfmessage.getStringParameterValue(3503));
            if(s.equals("Network Priority"))
                return NetworkPriority.toString(pcfmessage.getIntParameterValue(1565));
            if(s.equals("Non-persistent Message Speed"))
                return NonPersistentMsgSpeed.toString(pcfmessage.getIntParameterValue(1562));
            if(s.equals("Password"))
                return Password.toString(pcfmessage.getStringParameterValue(3518));
            if(s.equals("Put Authority"))
                return PutAuthority.toString(pcfmessage.getIntParameterValue(1508));
            if(s.equals("Receive Exit Name"))
                return ReceiveExit.toString(pcfmessage.getStringParameterValue(3511));
            if(s.equals("Receive Exit User Data"))
                return ReceiveUserData.toString(pcfmessage.getStringParameterValue(3516));
            if(s.equals("Security Exit Name"))
                return SecurityExit.toString(pcfmessage.getStringParameterValue(3508));
            if(s.equals("Security Exit User Data"))
                return SecurityUserData.toString(pcfmessage.getStringParameterValue(3513));
            if(s.equals("Send Exit Name"))
                return SendExit.toString(pcfmessage.getStringParameterValue(3510));
            if(s.equals("Send Exit User Data"))
                return SendUserData.toString(pcfmessage.getStringParameterValue(3515));
            if(s.equals("Sequence Number Wrap"))
                return SeqNumberWrap.toString(pcfmessage.getIntParameterValue(1509));
            if(s.equals("Short Retry Count"))
                return ShortRetryCount.toString(pcfmessage.getIntParameterValue(1505));
            if(s.equals("Short Retry Timer"))
                return ShortRetryInterval.toString(pcfmessage.getIntParameterValue(1504));
            if(s.equals("TP Name"))
                return TpName.toString(pcfmessage.getStringParameterValue(3503));
            if(s.equals("User ID"))
                return UserIdentifier.toString(pcfmessage.getStringParameterValue(3517));
        }
        catch(Exception _ex)
        {
            return "";
        }
        return "Cell(" + Integer.toString(i) + "," + s + ")";
    }

    public void refreshAll(PCFMessageAgent pcfmessageagent)
    {
        try
        {
            System.out.println("** Refreshing all channels --");
            PCFMessage pcfmessage = new PCFMessage(25);
            pcfmessage.addParameter(3501, "*");
            pcfmessage.addParameter(1511, 5);
            responses = pcfmessageagent.send(pcfmessage);
            refreshChannelStatusAll(pcfmessageagent);
            for(int i = 0; i < responses.length; i++)
            {
                String s = responses[i].getStringParameterValue(3501);
                PCFMessage pcfmessage1 = findChannelStatusByName(s);
                if(pcfmessage1 == null)
                {
                    setChannelStatus(s, 0);
                } else
                {
                    int j = pcfmessage1.getIntParameterValue(1527);
                    setChannelStatus(s, j);
                }
            }

            filterChannels();
        }
        catch(Exception exception)
        {
            System.out.println("Exception (ChannelListModel::refreshAll): " + exception.toString());
        }
    }

    public void refreshChannel(PCFMessageAgent pcfmessageagent, String s)
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(25);
            pcfmessage.addParameter(3501, s);
            PCFMessage apcfmessage[];
            try
            {
                apcfmessage = pcfmessageagent.send(pcfmessage);
            }
            catch(MQException mqexception)
            {
                if(mqexception.reasonCode == 2085)
                {
                    deleteChannel(s);
                    return;
                } else
                {
                    throw mqexception;
                }
            }
            boolean flag = false;
            for(int i = 0; i < responses.length; i++)
            {
                String s1 = responses[i].getStringParameterValue(3501);
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
            refreshChannelStatus(pcfmessageagent, s);
            PCFMessage pcfmessage1 = findChannelStatusByName(s);
            if(pcfmessage1 == null)
            {
                setChannelStatus(s, 0);
            } else
            {
                int j = pcfmessage1.getIntParameterValue(1527);
                setChannelStatus(s, j);
            }
            filterChannels();
        }
        catch(Exception exception)
        {
            System.out.println("Exception:refreshChannel: " + exception.toString());
        }
    }

    public void refreshChannelStatus(PCFMessageAgent pcfmessageagent, String s)
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(42);
            pcfmessage.addParameter(3501, s);
            PCFMessage apcfmessage[];
            try
            {
                apcfmessage = pcfmessageagent.send(pcfmessage);
            }
            catch(Exception exception)
            {
                deleteChannelStatus(s);
                throw exception;
            }
            boolean flag = false;
            for(int i = 0; i < channelStatusResponses.length; i++)
            {
                String s1 = channelStatusResponses[i].getStringParameterValue(3501);
                if(!s1.equals(s))
                    continue;
                channelStatusResponses[i] = apcfmessage[0];
                flag = true;
                break;
            }

            if(!flag)
            {
                PCFMessage apcfmessage1[] = new PCFMessage[channelStatusResponses.length + 1];
                System.arraycopy(channelStatusResponses, 0, apcfmessage1, 0, channelStatusResponses.length);
                apcfmessage1[channelStatusResponses.length] = apcfmessage[0];
                channelStatusResponses = apcfmessage1;
            }
        }
        catch(Exception exception1)
        {
            System.out.println("refreshChannelStatus:Exception: " + exception1.toString());
        }
    }

    public void refreshChannelStatusAll(PCFMessageAgent pcfmessageagent)
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(42);
            pcfmessage.addParameter(3501, "*");
            channelStatusResponses = pcfmessageagent.send(pcfmessage);
        }
        catch(Exception exception)
        {
            System.out.println("Exception (ChannelListModel::refreshChannelStatusAll): " + exception.toString());
        }
    }

    public void refreshIfNeeded(PCFMessageAgent pcfmessageagent)
    {
        if(responses == null)
            refreshAll(pcfmessageagent);
    }

    private void setChannelStatus(String s, int i)
    {
        PCFMessage pcfmessage = findChannelByName(s);
        if(pcfmessage != null)
            pcfmessage.addParameter(1527, i);
    }

    public void setShowSystem(boolean flag)
    {
        showSystem = flag;
        filterChannels();
    }

    private PCFMessage responses[];
    private PCFMessage filteredResponses[];
    private PCFMessage channelStatusResponses[];
    private boolean showSystem;
}
