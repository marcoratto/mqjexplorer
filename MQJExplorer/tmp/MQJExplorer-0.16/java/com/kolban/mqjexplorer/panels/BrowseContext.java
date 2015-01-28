// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseContext.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;
import com.kolban.utils.StringUtils;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class BrowseContext extends JPanel
{

    public BrowseContext()
    {
        ivjAccountingToken = null;
        ivjApplicationIdentityData = null;
        ivjApplicationOriginData = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjPutApplicationName = null;
        ivjPutApplicationType = null;
        ivjUserID = null;
        initialize();
    }

    public BrowseContext(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjAccountingToken = null;
        ivjApplicationIdentityData = null;
        ivjApplicationOriginData = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjPutApplicationName = null;
        ivjPutApplicationType = null;
        ivjUserID = null;
    }

    public BrowseContext(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjAccountingToken = null;
        ivjApplicationIdentityData = null;
        ivjApplicationOriginData = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjPutApplicationName = null;
        ivjPutApplicationType = null;
        ivjUserID = null;
    }

    public BrowseContext(boolean flag)
    {
        super(flag);
        ivjAccountingToken = null;
        ivjApplicationIdentityData = null;
        ivjApplicationOriginData = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjPutApplicationName = null;
        ivjPutApplicationType = null;
        ivjUserID = null;
    }

    private JTextField getAccountingToken()
    {
        if(ivjAccountingToken == null)
            try
            {
                ivjAccountingToken = new JTextField();
                ivjAccountingToken.setName("AccountingToken");
                ivjAccountingToken.setEditable(false);
                ivjAccountingToken.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAccountingToken;
    }

    private JTextField getApplicationIdentityData()
    {
        if(ivjApplicationIdentityData == null)
            try
            {
                ivjApplicationIdentityData = new JTextField();
                ivjApplicationIdentityData.setName("ApplicationIdentityData");
                ivjApplicationIdentityData.setEditable(false);
                ivjApplicationIdentityData.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjApplicationIdentityData;
    }

    private JTextField getApplicationOriginData()
    {
        if(ivjApplicationOriginData == null)
            try
            {
                ivjApplicationOriginData = new JTextField();
                ivjApplicationOriginData.setName("ApplicationOriginData");
                ivjApplicationOriginData.setEditable(false);
                ivjApplicationOriginData.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjApplicationOriginData;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("User ID:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("Put-Application Type:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
    }

    private JLabel getJLabel3()
    {
        if(ivjJLabel3 == null)
            try
            {
                ivjJLabel3 = new JLabel();
                ivjJLabel3.setName("JLabel3");
                ivjJLabel3.setText("Put-Application Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel3;
    }

    private JLabel getJLabel4()
    {
        if(ivjJLabel4 == null)
            try
            {
                ivjJLabel4 = new JLabel();
                ivjJLabel4.setName("JLabel4");
                ivjJLabel4.setText("Application Identity Data:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel4;
    }

    private JLabel getJLabel5()
    {
        if(ivjJLabel5 == null)
            try
            {
                ivjJLabel5 = new JLabel();
                ivjJLabel5.setName("JLabel5");
                ivjJLabel5.setText("Application Origin Data:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel5;
    }

    private JLabel getJLabel6()
    {
        if(ivjJLabel6 == null)
            try
            {
                ivjJLabel6 = new JLabel();
                ivjJLabel6.setName("JLabel6");
                ivjJLabel6.setText("Accounting Token:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel6;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JTextField getPutApplicationName()
    {
        if(ivjPutApplicationName == null)
            try
            {
                ivjPutApplicationName = new JTextField();
                ivjPutApplicationName.setName("PutApplicationName");
                ivjPutApplicationName.setEditable(false);
                ivjPutApplicationName.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutApplicationName;
    }

    private JTextField getPutApplicationType()
    {
        if(ivjPutApplicationType == null)
            try
            {
                ivjPutApplicationType = new JTextField();
                ivjPutApplicationType.setName("PutApplicationType");
                ivjPutApplicationType.setEditable(false);
                ivjPutApplicationType.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutApplicationType;
    }

    private JTextField getUserID()
    {
        if(ivjUserID == null)
            try
            {
                ivjUserID = new JTextField();
                ivjUserID.setName("UserID");
                ivjUserID.setEditable(false);
                ivjUserID.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjUserID;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("BrowseContext");
            setLayout(new GridBagLayout());
            setSize(238, 307);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.anchor = 17;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJLabel1(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 1;
            gridbagconstraints1.anchor = 17;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getJLabel2(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 2;
            gridbagconstraints2.anchor = 17;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getJLabel3(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 3;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getJLabel4(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 4;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 5;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getJLabel6(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 0;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getUserID(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 1;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getPutApplicationType(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 2;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getPutApplicationName(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 3;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getApplicationIdentityData(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 4;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getApplicationOriginData(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 5;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getAccountingToken(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 0;
            gridbagconstraints12.gridy = 6;
            gridbagconstraints12.gridwidth = 2;
            gridbagconstraints12.fill = 1;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.weighty = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints12);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public static void main(String args[])
    {
        try
        {
            JFrame jframe = new JFrame();
            BrowseContext browsecontext = new BrowseContext();
            jframe.setContentPane(browsecontext);
            jframe.setSize(browsecontext.getSize());
            jframe.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            jframe.show();
            Insets insets = jframe.getInsets();
            jframe.setSize(jframe.getWidth() + insets.left + insets.right, jframe.getHeight() + insets.top + insets.bottom);
            jframe.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JPanel");
            throwable.printStackTrace(System.out);
        }
    }

    public void setFromMessage(MQMessage mqmessage)
    {
        getUserID().setText(((MQMD) (mqmessage)).userId);
        String s;
        switch(((MQMD) (mqmessage)).putApplicationType)
        {
        case 1: // '\001'
            s = "CICS";
            break;

        case 21: // '\025'
            s = "CICS Bridge";
            break;

        case 5: // '\005'
            s = "DOS";
            break;

        case 3: // '\003'
            s = "IMS";
            break;

        case 28: // '\034'
            s = "Java";
            break;

        case 2: // '\002'
            s = "MVS";
            break;

        case 11: // '\013'
            s = "Windows NT";
            break;

        case 6: // '\006'
            s = "Unix";
            break;

        default:
            s = "Unknown: " + Integer.toString(((MQMD) (mqmessage)).putApplicationType);
            break;
        }
        getPutApplicationType().setText(s);
        getPutApplicationName().setText(((MQMD) (mqmessage)).putApplicationName);
        getApplicationIdentityData().setText(((MQMD) (mqmessage)).applicationIdData);
        getApplicationOriginData().setText(((MQMD) (mqmessage)).applicationOriginData);
        getAccountingToken().setText(StringUtils.byteArrayToHexString(((MQMD) (mqmessage)).accountingToken));
    }

    private JTextField ivjAccountingToken;
    private JTextField ivjApplicationIdentityData;
    private JTextField ivjApplicationOriginData;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JPanel ivjJPanel1;
    private JTextField ivjPutApplicationName;
    private JTextField ivjPutApplicationType;
    private JTextField ivjUserID;
}
