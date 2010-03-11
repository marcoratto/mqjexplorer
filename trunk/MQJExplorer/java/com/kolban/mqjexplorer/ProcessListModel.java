// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProcessListModel.java

package com.kolban.mqjexplorer;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFMessage;
import com.ibm.mq.pcf.PCFMessageAgent;
import com.kolban.mqjexplorer.mqattributes.AlterationDate;
import com.kolban.mqjexplorer.mqattributes.AlterationTime;
import com.kolban.mqjexplorer.mqattributes.ApplId;
import com.kolban.mqjexplorer.mqattributes.ApplType;
import com.kolban.mqjexplorer.mqattributes.EnvData;
import com.kolban.mqjexplorer.mqattributes.ProcessDesc;
import com.kolban.mqjexplorer.mqattributes.ProcessName;
import com.kolban.mqjexplorer.mqattributes.UserData;
import java.util.Vector;
import javax.swing.ImageIcon;

// Referenced classes of package com.kolban.mqjexplorer:
//            TextIcon

public class ProcessListModel
{

    public ProcessListModel()
    {
        responses = null;
        filteredResponses = null;
        showSystem = false;
    }

    public void deleteProcess(String s)
    {
        try
        {
            s = s.trim();
            int i = -1;
            for(int j = 0; j < responses.length; j++)
            {
                String s1 = responses[j].getStringParameterValue(2012).trim();
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
            filterProcesses();
        }
        catch(Exception exception)
        {
            System.out.println("deleteProcess: " + exception.toString());
        }
    }

    public void filterProcesses()
    {
        if(showSystem)
        {
            filteredResponses = responses;
        } else
        {
            Vector vector = new Vector();
            for(int i = 0; i < responses.length; i++)
                try
                {
                    String s = responses[i].getStringParameterValue(2012);
                    if(!s.startsWith("SYSTEM."))
                        vector.addElement(responses[i]);
                }
                catch(Exception _ex) { }

            filteredResponses = new PCFMessage[vector.size()];
            for(int j = 0; j < vector.size(); j++)
                filteredResponses[j] = (PCFMessage)vector.elementAt(j);

        }
    }

    public PCFMessage findProcessByName(String s)
    {
        s = s.trim();
        for(int i = 0; i < responses.length; i++)
            try
            {
                if(s.equals(responses[i].getStringParameterValue(2012).trim()))
                    return responses[i];
            }
            catch(Exception _ex) { }

        return null;
    }

    public String[] getListOfProcesses(int i)
    {
        boolean flag = (i & 1) != 0;
        Vector vector = new Vector();
        for(int j = 0; j < responses.length; j++)
            try
            {
                String s = responses[j].getStringParameterValue(2012).trim();
                if(flag || !s.startsWith("SYSTEM."))
                    vector.addElement(s);
            }
            catch(Exception _ex) { }

        String as[] = new String[vector.size()];
        for(int k = 0; k < vector.size(); k++)
            as[k] = (String)vector.get(k);

        return as;
    }

    public int getProcessCount()
    {
        if(filteredResponses == null)
            return 0;
        else
            return filteredResponses.length;
    }

    public String getProcessName(int i)
    {
        try
        {
            return filteredResponses[i].getStringParameterValue(2012);
        }
        catch(Exception _ex)
        {
            return "";
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
                texticon.setText(ProcessName.toString(pcfmessage.getStringParameterValue(2012)));
                texticon.setIcon(new ImageIcon(getClass().getResource("/icons/process.gif")));
                return texticon;
            }
            if(s.equals("Application Type"))
                return ApplType.toString(pcfmessage.getIntParameterValue(1));
            if(s.equals("Application ID"))
                return ApplId.toString(pcfmessage.getStringParameterValue(2001));
            if(s.equals("Alteration Date (GMT)"))
                return AlterationDate.toString(pcfmessage.getStringParameterValue(2027));
            if(s.equals("Alteration Time (GMT)"))
                return AlterationTime.toString(pcfmessage.getStringParameterValue(2028));
            if(s.equals("Alteration Date/Time"))
                return AlterationDate.toString(pcfmessage.getStringParameterValue(2027)) + " " + AlterationTime.toString(pcfmessage.getStringParameterValue(2028));
            if(s.equals("Description"))
                return ProcessDesc.toString(pcfmessage.getStringParameterValue(2011));
            if(s.equals("Environment Data"))
                return EnvData.toString(pcfmessage.getStringParameterValue(2007));
            if(s.equals("User Data"))
                return UserData.toString(pcfmessage.getStringParameterValue(2021));
        }
        catch(Exception _ex)
        {
            return "";
        }
        return "Cell(" + Integer.toString(i) + "," + s + ")";
    }

    void refreshAll(PCFMessageAgent pcfmessageagent)
    {
        try
        {
            System.out.println("** Refreshing all processes --");
            PCFMessage pcfmessage = new PCFMessage(7);
            pcfmessage.addParameter(2012, "*");
            int ai[] = {
                1009
            };
            pcfmessage.addParameter(1003, ai);
            responses = pcfmessageagent.send(pcfmessage);
            filterProcesses();
        }
        catch(Exception exception)
        {
            System.out.println("Exception (ProcessListModel::refreshAll): " + exception.toString());
        }
    }

    public void refreshIfNeeded(PCFMessageAgent pcfmessageagent)
    {
        if(responses == null)
            refreshAll(pcfmessageagent);
    }

    public void refreshProcess(PCFMessageAgent pcfmessageagent, String s)
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(7);
            pcfmessage.addParameter(2012, s);
            int ai[] = {
                1009
            };
            pcfmessage.addParameter(1003, ai);
            PCFMessage apcfmessage[];
            try
            {
                apcfmessage = pcfmessageagent.send(pcfmessage);
            }
            catch(MQException mqexception)
            {
                if(mqexception.reasonCode == 2085)
                {
                    deleteProcess(s);
                    return;
                } else
                {
                    throw mqexception;
                }
            }
            boolean flag = false;
            for(int i = 0; i < responses.length; i++)
            {
                String s1 = responses[i].getStringParameterValue(2012);
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
            filterProcesses();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public void setShowSystem(boolean flag)
    {
        showSystem = flag;
        filterProcesses();
    }

    private PCFMessage responses[];
    private PCFMessage filteredResponses[];
    private boolean showSystem;
    public static final int INCLUDE_SYSTEM = 1;
}
