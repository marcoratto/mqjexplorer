// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseIdentifiers.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;
import com.kolban.utils.StringUtils;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class BrowseIdentifiers extends JPanel
{

    public BrowseIdentifiers()
    {
        ivjCorrelationID = null;
        ivjCorrelationIDHex = null;
        ivjGroupID = null;
        ivjGroupIDHex = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjMessageID = null;
        ivjMessageIDHex = null;
        initialize();
    }

    public BrowseIdentifiers(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjCorrelationID = null;
        ivjCorrelationIDHex = null;
        ivjGroupID = null;
        ivjGroupIDHex = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjMessageID = null;
        ivjMessageIDHex = null;
    }

    public BrowseIdentifiers(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjCorrelationID = null;
        ivjCorrelationIDHex = null;
        ivjGroupID = null;
        ivjGroupIDHex = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjMessageID = null;
        ivjMessageIDHex = null;
    }

    public BrowseIdentifiers(boolean flag)
    {
        super(flag);
        ivjCorrelationID = null;
        ivjCorrelationIDHex = null;
        ivjGroupID = null;
        ivjGroupIDHex = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjMessageID = null;
        ivjMessageIDHex = null;
    }

    private JTextField getCorrelationID()
    {
        if(ivjCorrelationID == null)
            try
            {
                ivjCorrelationID = new JTextField();
                ivjCorrelationID.setName("CorrelationID");
                ivjCorrelationID.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCorrelationID;
    }

    private JTextField getCorrelationIDHex()
    {
        if(ivjCorrelationIDHex == null)
            try
            {
                ivjCorrelationIDHex = new JTextField();
                ivjCorrelationIDHex.setName("CorrelationIDHex");
                ivjCorrelationIDHex.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCorrelationIDHex;
    }

    private JTextField getGroupID()
    {
        if(ivjGroupID == null)
            try
            {
                ivjGroupID = new JTextField();
                ivjGroupID.setName("GroupID");
                ivjGroupID.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjGroupID;
    }

    private JTextField getGroupIDHex()
    {
        if(ivjGroupIDHex == null)
            try
            {
                ivjGroupIDHex = new JTextField();
                ivjGroupIDHex.setName("GroupIDHex");
                ivjGroupIDHex.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjGroupIDHex;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Message ID:");
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
                ivjJLabel2.setText("Correlation ID:");
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
                ivjJLabel3.setText("Group ID:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel3;
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

    private JTextField getMessageID()
    {
        if(ivjMessageID == null)
            try
            {
                ivjMessageID = new JTextField();
                ivjMessageID.setName("MessageID");
                ivjMessageID.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageID;
    }

    private JTextField getMessageIDHex()
    {
        if(ivjMessageIDHex == null)
            try
            {
                ivjMessageIDHex = new JTextField();
                ivjMessageIDHex.setName("MessageIDHex");
                ivjMessageIDHex.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageIDHex;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("BrowseIdentifiers");
            setLayout(new GridBagLayout());
            setSize(276, 327);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.anchor = 17;
            gridbagconstraints.insets = new Insets(4, 4, 4, 4);
            add(getJLabel1(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 1;
            gridbagconstraints1.gridy = 0;
            gridbagconstraints1.fill = 2;
            gridbagconstraints1.weightx = 1.0D;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getMessageID(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 1;
            gridbagconstraints2.gridwidth = 2;
            gridbagconstraints2.fill = 2;
            gridbagconstraints2.weightx = 1.0D;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getMessageIDHex(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 2;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getJLabel2(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 2;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getCorrelationID(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 3;
            gridbagconstraints5.gridwidth = 2;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getCorrelationIDHex(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 4;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getJLabel3(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 4;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getGroupID(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 5;
            gridbagconstraints8.gridwidth = 2;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getGroupIDHex(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 0;
            gridbagconstraints9.gridy = 6;
            gridbagconstraints9.gridwidth = 2;
            gridbagconstraints9.fill = 1;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.weighty = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints9);
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
            BrowseIdentifiers browseidentifiers = new BrowseIdentifiers();
            jframe.setContentPane(browseidentifiers);
            jframe.setSize(browseidentifiers.getSize());
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
        getMessageID().setText(new String(((MQMD) (mqmessage)).messageId));
        getMessageIDHex().setText(StringUtils.byteArrayToHexString(((MQMD) (mqmessage)).messageId));
        getCorrelationID().setText(new String(((MQMD) (mqmessage)).correlationId));
        getCorrelationIDHex().setText(StringUtils.byteArrayToHexString(((MQMD) (mqmessage)).correlationId));
        getGroupID().setText(new String(((MQMD) (mqmessage)).groupId));
        getGroupIDHex().setText(StringUtils.byteArrayToHexString(((MQMD) (mqmessage)).groupId));
    }

    private JTextField ivjCorrelationID;
    private JTextField ivjCorrelationIDHex;
    private JTextField ivjGroupID;
    private JTextField ivjGroupIDHex;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JPanel ivjJPanel1;
    private JTextField ivjMessageID;
    private JTextField ivjMessageIDHex;
}
