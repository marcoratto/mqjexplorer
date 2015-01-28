// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DLQRule.java

package com.kolban.mqjexplorer.dlq;

import java.io.Serializable;

public class DLQRule
    implements Serializable
{

    public DLQRule()
    {
        applIdentityData = "*";
        applName = "*";
        applType = "*";
        header = 1;
        putAut = 1;
        retry = 1;
        description = "";
        enabled = true;
        destQ = "*";
        destQM = "*";
        userId = "*";
        replyToQ = "*";
        replyToQM = "*";
        reason = -1;
    }

    public int getAction()
    {
        return action;
    }

    public String getApplIdentityData()
    {
        return applIdentityData;
    }

    public String getApplName()
    {
        return applName;
    }

    public String getApplType()
    {
        return applType;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDestQ()
    {
        return destQ;
    }

    public String getDestQM()
    {
        return destQM;
    }

    public int getHeader()
    {
        return header;
    }

    public int getPutAut()
    {
        return putAut;
    }

    public int getReason()
    {
        return reason;
    }

    public String getReplyToQ()
    {
        return replyToQ;
    }

    public String getReplyToQM()
    {
        return replyToQM;
    }

    public int getRetry()
    {
        return retry;
    }

    public String getUserId()
    {
        return userId;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setAction(int i)
    {
        action = i;
    }

    public void setApplIdentityData(String s)
    {
        applIdentityData = s;
    }

    public void setApplName(String s)
    {
        applName = s;
    }

    public void setApplType(String s)
    {
        applType = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDestQ(String s)
    {
        destQ = s;
    }

    public void setDestQM(String s)
    {
        destQM = s;
    }

    public void setEnabled(boolean flag)
    {
        enabled = flag;
    }

    public void setHeader(int i)
    {
        header = i;
    }

    public void setPutAut(int i)
    {
        putAut = i;
    }

    public void setReason(int i)
    {
        reason = i;
    }

    public void setReplyToQ(String s)
    {
        replyToQ = s;
    }

    public void setReplyToQM(String s)
    {
        replyToQM = s;
    }

    public void setRetry(int i)
    {
        retry = i;
    }

    public void setUserId(String s)
    {
        userId = s;
    }

    private String applIdentityData;
    private String applName;
    private String applType;
    public static final int ACTION_DISCARD = 1;
    public static final int FWDQM_LOCALQM = 1;
    public static final int FWDQM_REPLYQM = 2;
    public static final int FWDQM_DESTQM = 3;
    public static final int FWDQM_NAMED = 4;
    public static final int FWDQ_REPLYQ = 3;
    public static final int FWDQ_DESTQ = 2;
    public static final int FWDQ_NAMED = 1;
    public static final int CTX = 2;
    public static final int DEF = 1;
    public static final int NO = 2;
    public static final int YES = 1;
    public static final int ACTION_FORWARD = 4;
    public static final int ACTION_RETRY = 3;
    public static final int ACTION_IGNORE = 2;
    private int action;
    private int header;
    private int putAut;
    private int retry;
    private String description;
    private boolean enabled;
    private String destQ;
    private String destQM;
    private String userId;
    private String replyToQ;
    private String replyToQM;
    private int reason;
}
