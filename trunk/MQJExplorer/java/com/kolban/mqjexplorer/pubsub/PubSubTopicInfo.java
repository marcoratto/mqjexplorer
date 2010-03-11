// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PubSubTopicInfo.java

package com.kolban.mqjexplorer.pubsub;

import com.ibm.mq.pcf.PCFMessage;
import com.ibm.mq.pcf.PCFParameter;
import com.kolban.mq.PCFUtils;
import java.util.Enumeration;
import java.util.Vector;

public class PubSubTopicInfo
{

    public PubSubTopicInfo()
    {
        applCount = 0;
        anonymousCount = 0;
        brokerCount = 0;
    }

    public String getRegistrationCorrelId(int i)
    {
        populate();
        if(registrationCorrelId == null)
            return null;
        if(registrationCorrelId.size() <= i)
            return null;
        else
            return (String)registrationCorrelId.elementAt(i);
    }

    public Integer getRegistrationOptions(int i)
    {
        populate();
        if(registrationOptions == null)
            return null;
        if(registrationOptions.size() <= i)
            return null;
        else
            return (Integer)registrationOptions.elementAt(i);
    }

    public String getRegistrationQMgrName(int i)
    {
        populate();
        if(registrationQMgrName == null)
            return null;
        if(registrationQMgrName.size() <= i)
            return null;
        else
            return (String)registrationQMgrName.elementAt(i);
    }

    public String getRegistrationQName(int i)
    {
        populate();
        if(registrationQName == null)
            return null;
        if(registrationQName.size() <= i)
            return null;
        else
            return (String)registrationQName.elementAt(i);
    }

    public String getRegistrationTime(int i)
    {
        populate();
        if(registrationTime == null)
            return null;
        if(registrationTime.size() <= i)
            return null;
        else
            return (String)registrationTime.elementAt(i);
    }

    public String getRegistrationUserid(int i)
    {
        populate();
        if(registrationUserid == null)
            return null;
        if(registrationUserid.size() <= i)
            return null;
        else
            return (String)registrationUserid.elementAt(i);
    }

    public String getStream()
    {
        return stream;
    }

    public int getSubscriberCount()
    {
        populate();
        if(registrationQName == null)
            return 0;
        else
            return registrationQName.size();
    }

    private void populate()
    {
        if(pcf != null)
        {
            int i = PCFUtils.countItems(3038, pcf);
            if(i > 0)
            {
                registrationQName = new Vector(i);
                registrationQMgrName = new Vector(i);
                registrationUserid = new Vector(i);
                registrationOptions = new Vector(i);
                registrationTime = new Vector(i);
                registrationCorrelId = new Vector(i);
                Enumeration enumeration = pcf.getParameters();
                PCFParameter pcfparameter = null;
                if(enumeration.hasMoreElements())
                    pcfparameter = (PCFParameter)enumeration.nextElement();
                for(; enumeration.hasMoreElements() && pcfparameter.getParameter() != 3042; pcfparameter = (PCFParameter)enumeration.nextElement());
                int j = -1;
                do
                {
                    switch(pcfparameter.getParameter())
                    {
                    case 3042: 
                        j++;
                        registrationQName.add("");
                        registrationQMgrName.add("");
                        registrationUserid.add("");
                        registrationTime.add("");
                        registrationOptions.add("");
                        registrationCorrelId.add("N/A");
                        registrationQMgrName.setElementAt(((String)pcfparameter.getValue()).trim(), j);
                        break;

                    case 3039: 
                        registrationUserid.setElementAt(((String)pcfparameter.getValue()).trim(), j);
                        break;

                    case 3043: 
                        registrationQName.setElementAt(((String)pcfparameter.getValue()).trim(), j);
                        break;

                    case 3038: 
                        String s = ((String)pcfparameter.getValue()).trim();
                        registrationTime.setElementAt(s.substring(0, 4) + "-" + s.substring(4, 6) + "-" + s.substring(6, 8) + " " + s.substring(8, 10) + ":" + s.substring(10, 12) + ":" + s.substring(12, 14) + "." + s.substring(14), j);
                        break;

                    case 1091: 
                        registrationOptions.setElementAt((Integer)pcfparameter.getValue(), j);
                        break;

                    case 3044: 
                        registrationCorrelId.setElementAt(((String)pcfparameter.getValue()).trim(), j);
                        break;

                    default:
                        System.out.println("Unexpected PCF: " + pcfparameter.toString());
                        break;
                    }
                    if(!enumeration.hasMoreElements())
                        break;
                    pcfparameter = (PCFParameter)enumeration.nextElement();
                } while(true);
            } else
            {
                registrationCorrelId = null;
                registrationOptions = null;
                registrationQMgrName = null;
                registrationQName = null;
                registrationTime = null;
                registrationUserid = null;
            }
            pcf = null;
        }
    }

    public void remove(int i)
    {
        registrationCorrelId.remove(i);
        registrationOptions.remove(i);
        registrationQMgrName.remove(i);
        registrationQName.remove(i);
        registrationTime.remove(i);
        registrationUserid.remove(i);
    }

    public void setStream(String s)
    {
        stream = s;
    }

    public int applCount;
    public int anonymousCount;
    public int brokerCount;
    public String topicName;
    public PCFMessage pcf;
    private Vector registrationQName;
    private Vector registrationQMgrName;
    private Vector registrationCorrelId;
    private Vector registrationUserid;
    private Vector registrationTime;
    private Vector registrationOptions;
    private String stream;
}
