// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NamelistListModel.java

package com.kolban.mqjexplorer;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFMessage;
import com.ibm.mq.pcf.PCFMessageAgent;
import com.kolban.mqjexplorer.mqattributes.AlterationDate;
import com.kolban.mqjexplorer.mqattributes.AlterationTime;
import com.kolban.mqjexplorer.mqattributes.Names;
import com.kolban.mqjexplorer.mqattributes.ProcessDesc;
import com.kolban.mqjexplorer.mqattributes.ProcessName;
import java.util.Vector;
import javax.swing.ImageIcon;

// Referenced classes of package com.kolban.mqjexplorer:
//            TextIcon

public class NamelistListModel
{

    public NamelistListModel()
    {
        responses = null;
        filteredResponses = null;
        showSystem = false;
    }

    public void deleteNamelist(String s)
    {
        try
        {
            s = s.trim();
            int i = -1;
            for(int j = 0; j < responses.length; j++)
            {
                String s1 = responses[j].getStringParameterValue(2010).trim();
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
            filterNamelists();
        }
        catch(Exception exception)
        {
            System.out.println("deleteNameList: " + exception.toString());
        }
    }

    public void filterNamelists()
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
                    String s = responses[i].getStringParameterValue(2010);
                    if(!s.startsWith("SYSTEM."))
                        vector.addElement(responses[i]);
                }
                catch(Exception _ex) { }

            filteredResponses = new PCFMessage[vector.size()];
            for(int j = 0; j < vector.size(); j++)
                filteredResponses[j] = (PCFMessage)vector.elementAt(j);

        }
    }

    public PCFMessage findNamelistByName(String s)
    {
        s = s.trim();
        for(int i = 0; i < responses.length; i++)
            try
            {
                if(s.equals(responses[i].getStringParameterValue(2010).trim()))
                    return responses[i];
            }
            catch(Exception _ex) { }

        return null;
    }

    public String[] getListOfNamelists(int i)
    {
        boolean flag = (i & 1) != 0;
        Vector vector = new Vector();
        for(int j = 0; j < responses.length; j++)
            try
            {
                String s = responses[j].getStringParameterValue(2010).trim();
                if(flag || !s.startsWith("SYSTEM."))
                    vector.addElement(s);
            }
            catch(Exception _ex) { }

        String as[] = new String[vector.size()];
        for(int k = 0; k < vector.size(); k++)
            as[k] = (String)vector.get(k);

        return as;
    }

    public int getNamelistCount()
    {
        if(filteredResponses == null)
            return 0;
        else
            return filteredResponses.length;
    }

    public String getNamelistName(int i)
    {
        try
        {
            return filteredResponses[i].getStringParameterValue(2010);
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
                texticon.setText(ProcessName.toString(pcfmessage.getStringParameterValue(2010)));
                texticon.setIcon(new ImageIcon(getClass().getResource("/icons/nameList.gif")));
                return texticon;
            }
            if(s.equals("Name Count"))
                return Integer.toString(pcfmessage.getStringListParameterValue(2020).length);
            if(s.equals("Names"))
                return Names.toString(pcfmessage.getStringListParameterValue(2020));
            if(s.equals("Alteration Date (GMT)"))
                return AlterationDate.toString(pcfmessage.getStringParameterValue(2027));
            if(s.equals("Alteration Time (GMT)"))
                return AlterationTime.toString(pcfmessage.getStringParameterValue(2028));
            if(s.equals("Alteration Date/Time"))
                return AlterationDate.toString(pcfmessage.getStringParameterValue(2027)) + " " + AlterationTime.toString(pcfmessage.getStringParameterValue(2028));
            if(s.equals("Description"))
                return ProcessDesc.toString(pcfmessage.getStringParameterValue(2009));
        }
        catch(Exception exception)
        {
            System.out.println("Exception: NamelistListModel::getValueAt(): " + exception.toString());
            return "";
        }
        return "Cell(" + Integer.toString(i) + "," + s + ")";
    }

    void refreshAll(PCFMessageAgent pcfmessageagent)
    {
        try
        {
            System.out.println("** Refreshing all Namelists --");
            PCFMessage pcfmessage = new PCFMessage(36);
            pcfmessage.addParameter(2010, "*");
            responses = pcfmessageagent.send(pcfmessage);
            filterNamelists();
        }
        catch(Exception exception)
        {
            System.out.println("Exception (NameListListModel::refreshAll): " + exception.toString());
        }
    }

    public void refreshIfNeeded(PCFMessageAgent pcfmessageagent)
    {
        if(responses == null)
            refreshAll(pcfmessageagent);
    }

    public void refreshNameList(PCFMessageAgent pcfmessageagent, String s)
    {
        try
        {
            PCFMessage pcfmessage = new PCFMessage(36);
            pcfmessage.addParameter(2010, s);
            PCFMessage apcfmessage[];
            try
            {
                apcfmessage = pcfmessageagent.send(pcfmessage);
            }
            catch(MQException mqexception)
            {
                if(mqexception.reasonCode == 2085)
                {
                    deleteNamelist(s);
                    return;
                } else
                {
                    throw mqexception;
                }
            }
            boolean flag = false;
            for(int i = 0; i < responses.length; i++)
            {
                String s1 = responses[i].getStringParameterValue(2010);
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
            filterNamelists();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public void setShowSystem(boolean flag)
    {
        showSystem = flag;
        filterNamelists();
    }

    private PCFMessage responses[];
    private PCFMessage filteredResponses[];
    private boolean showSystem;
    public static final int INCLUDE_SYSTEM = 1;
}
