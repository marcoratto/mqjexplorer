// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseMQRFH2.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMessage;
import com.kolban.mq.MQRFH2;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class BrowseMQRFH2 extends JPanel
{

    public BrowseMQRFH2()
    {
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFlags = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJScrollPane1 = null;
        ivjRFH2Data = null;
        initialize();
    }

    public BrowseMQRFH2(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFlags = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJScrollPane1 = null;
        ivjRFH2Data = null;
    }

    public BrowseMQRFH2(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFlags = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJScrollPane1 = null;
        ivjRFH2Data = null;
    }

    public BrowseMQRFH2(boolean flag)
    {
        super(flag);
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFlags = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJScrollPane1 = null;
        ivjRFH2Data = null;
    }

    private JTextField getCCSID()
    {
        if(ivjCCSID == null)
            try
            {
                ivjCCSID = new JTextField();
                ivjCCSID.setName("CCSID");
                ivjCCSID.setEditable(false);
                ivjCCSID.setColumns(10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCCSID;
    }

    private JTextField getEncoding()
    {
        if(ivjEncoding == null)
            try
            {
                ivjEncoding = new JTextField();
                ivjEncoding.setName("Encoding");
                ivjEncoding.setEditable(false);
                ivjEncoding.setColumns(10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEncoding;
    }

    private JTextField getFlags()
    {
        if(ivjFlags == null)
            try
            {
                ivjFlags = new JTextField();
                ivjFlags.setName("Flags");
                ivjFlags.setEditable(false);
                ivjFlags.setColumns(10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFlags;
    }

    private JTextField getFormat()
    {
        if(ivjFormat == null)
            try
            {
                ivjFormat = new JTextField();
                ivjFormat.setName("Format");
                ivjFormat.setEditable(false);
                ivjFormat.setColumns(10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFormat;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Encoding:");
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
                ivjJLabel2.setText("CCSID:");
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
                ivjJLabel3.setText("Format:");
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
                ivjJLabel4.setText("Flags:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel4;
    }

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                getJScrollPane1().setViewportView(getRFH2Data());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
    }

    private JTextArea getRFH2Data()
    {
        if(ivjRFH2Data == null)
            try
            {
                ivjRFH2Data = new JTextArea();
                ivjRFH2Data.setName("RFH2Data");
                ivjRFH2Data.setBounds(0, 0, 160, 120);
                ivjRFH2Data.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRFH2Data;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("BrowseMQRFH2");
            setLayout(new GridBagLayout());
            setSize(403, 323);
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
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 0;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getEncoding(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 1;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getCCSID(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 2;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getFormat(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 3;
            gridbagconstraints7.anchor = 17;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getFlags(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 4;
            gridbagconstraints8.gridwidth = 2;
            gridbagconstraints8.fill = 1;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.weighty = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getJScrollPane1(), gridbagconstraints8);
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
            BrowseMQRFH2 browsemqrfh2 = new BrowseMQRFH2();
            jframe.setContentPane(browsemqrfh2);
            jframe.setSize(browsemqrfh2.getSize());
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
        MQRFH2 mqrfh2 = new MQRFH2();
        mqrfh2.setFromMessage(mqmessage);
        getCCSID().setText(Integer.toString(mqrfh2.codedCharSetId));
        getEncoding().setText(Integer.toString(mqrfh2.encoding));
        getFlags().setText(Integer.toString(mqrfh2.flags));
        getFormat().setText(mqrfh2.format.trim());
        getRFH2Data().setText(mqrfh2.getData().trim());
    }

    private JTextField ivjCCSID;
    private JTextField ivjEncoding;
    private JTextField ivjFlags;
    private JTextField ivjFormat;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JScrollPane ivjJScrollPane1;
    private JTextArea ivjRFH2Data;
}
