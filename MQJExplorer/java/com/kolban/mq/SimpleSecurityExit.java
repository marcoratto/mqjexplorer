// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SimpleSecurityExit.java

package com.kolban.mq;

import com.ibm.mq.*;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class SimpleSecurityExit extends JDialog
    implements MQSecurityExit
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getOK())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getCancel())
                connEtoC2(actionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public SimpleSecurityExit()
    {
        ivjJDialogContentPane = null;
        ivjCancel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjOK = null;
        ivjPassword = null;
        ivjSecurityEntryPanel = null;
        ivjUserid = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjEventHandler = new IvjEventHandler();
        initialize();
    }

    public SimpleSecurityExit(Dialog dialog)
    {
        super(dialog);
        ivjJDialogContentPane = null;
        ivjCancel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjOK = null;
        ivjPassword = null;
        ivjSecurityEntryPanel = null;
        ivjUserid = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public SimpleSecurityExit(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjJDialogContentPane = null;
        ivjCancel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjOK = null;
        ivjPassword = null;
        ivjSecurityEntryPanel = null;
        ivjUserid = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public SimpleSecurityExit(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjJDialogContentPane = null;
        ivjCancel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjOK = null;
        ivjPassword = null;
        ivjSecurityEntryPanel = null;
        ivjUserid = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public SimpleSecurityExit(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjJDialogContentPane = null;
        ivjCancel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjOK = null;
        ivjPassword = null;
        ivjSecurityEntryPanel = null;
        ivjUserid = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public SimpleSecurityExit(Frame frame)
    {
        super(frame);
        ivjJDialogContentPane = null;
        ivjCancel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjOK = null;
        ivjPassword = null;
        ivjSecurityEntryPanel = null;
        ivjUserid = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public SimpleSecurityExit(Frame frame, String s)
    {
        super(frame, s);
        ivjJDialogContentPane = null;
        ivjCancel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjOK = null;
        ivjPassword = null;
        ivjSecurityEntryPanel = null;
        ivjUserid = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public SimpleSecurityExit(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjJDialogContentPane = null;
        ivjCancel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjOK = null;
        ivjPassword = null;
        ivjSecurityEntryPanel = null;
        ivjUserid = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public SimpleSecurityExit(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjJDialogContentPane = null;
        ivjCancel = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjOK = null;
        ivjPassword = null;
        ivjSecurityEntryPanel = null;
        ivjUserid = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public void cancel()
    {
        dispose();
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            oK();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(ActionEvent actionevent)
    {
        try
        {
            cancel();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JButton getCancel()
    {
        if(ivjCancel == null)
            try
            {
                ivjCancel = new JButton();
                ivjCancel.setName("Cancel");
                ivjCancel.setMnemonic('C');
                ivjCancel.setText("Cancel");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCancel;
    }

    private JPanel getFooterPanel()
    {
        if(ivjFooterPanel == null)
            try
            {
                ivjFooterPanel = new JPanel();
                ivjFooterPanel.setName("FooterPanel");
                ivjFooterPanel.setLayout(getFooterPanelFlowLayout());
                getFooterPanel().add(getOK(), getOK().getName());
                getFooterPanel().add(getCancel(), getCancel().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooterPanel;
    }

    private FlowLayout getFooterPanelFlowLayout()
    {
        FlowLayout flowlayout = null;
        try
        {
            flowlayout = new FlowLayout();
            flowlayout.setAlignment(2);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return flowlayout;
    }

    private JPanel getJDialogContentPane()
    {
        if(ivjJDialogContentPane == null)
            try
            {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                getJDialogContentPane().add(getSecurityEntryPanel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                getJDialogContentPane().add(getFooterPanel(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Userid:");
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
                ivjJLabel2.setText("Password:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
    }

    private JButton getOK()
    {
        if(ivjOK == null)
            try
            {
                ivjOK = new JButton();
                ivjOK.setName("OK");
                ivjOK.setMnemonic('O');
                ivjOK.setText("OK");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOK;
    }

    private JPasswordField getPassword()
    {
        if(ivjPassword == null)
            try
            {
                ivjPassword = new JPasswordField();
                ivjPassword.setName("Password");
                ivjPassword.setColumns(10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPassword;
    }

    private JPanel getSecurityEntryPanel()
    {
        if(ivjSecurityEntryPanel == null)
            try
            {
                ivjSecurityEntryPanel = new JPanel();
                ivjSecurityEntryPanel.setName("SecurityEntryPanel");
                ivjSecurityEntryPanel.setBorder(BorderFactory.createTitledBorder("Security Settings"));
                ivjSecurityEntryPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getSecurityEntryPanel().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getSecurityEntryPanel().add(getJLabel2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getSecurityEntryPanel().add(getUserid(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getSecurityEntryPanel().add(getPassword(), gridbagconstraints3);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSecurityEntryPanel;
    }

    private JTextField getUserid()
    {
        if(ivjUserid == null)
            try
            {
                ivjUserid = new JTextField();
                ivjUserid.setName("Userid");
                ivjUserid.setColumns(10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjUserid;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getOK().addActionListener(ivjEventHandler);
        getCancel().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("SimpleSecurityExit");
            setDefaultCloseOperation(2);
            setTitle("MQJExplorer Security Exit");
            setSize(364, 152);
            setModal(true);
            setResizable(false);
            setContentPane(getJDialogContentPane());
            initConnections();
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
            SimpleSecurityExit simplesecurityexit = new SimpleSecurityExit();
            simplesecurityexit.setModal(true);
            simplesecurityexit.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            simplesecurityexit.show();
            Insets insets = simplesecurityexit.getInsets();
            simplesecurityexit.setSize(simplesecurityexit.getWidth() + insets.left + insets.right, simplesecurityexit.getHeight() + insets.top + insets.bottom);
            simplesecurityexit.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void oK()
    {
        dispose();
    }

    public byte[] securityExit(MQChannelExit mqchannelexit, MQChannelDefinition mqchanneldefinition, byte abyte0[])
    {
        mqchannelexit.exitResponse = 0;
        String s;
        switch(mqchannelexit.exitReason)
        {
        case 11: // '\013'
            s = "MQXR_INIT";
            break;

        case 12: // '\f'
            s = "MQXR_TERM";
            break;

        case 14: // '\016'
            s = "MQXR_XMIT";
            break;

        case 15: // '\017'
            s = "MQXR_SEC_MSG";
            break;

        case 16: // '\020'
            s = "MQXR_INIT_SEC";
            break;

        case 13: // '\r'
        default:
            s = "Unknown: " + mqchannelexit.exitReason;
            break;
        }
        System.out.println("Security exit invoked: reason: " + s);
        switch(mqchannelexit.exitReason)
        {
        case 15: // '\017'
            setTitle(mqchanneldefinition.connectionName);
            pack();
            SwingUtils.setCenter(null, this);
            setVisible(true);
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            try
            {
                System.out.println("Agent buffer size = " + abyte0.length);
                bytearrayoutputstream.write("SEC1".getBytes());
                bytearrayoutputstream.write(0);
                bytearrayoutputstream.write(0);
                bytearrayoutputstream.write(0);
                bytearrayoutputstream.write(0);
                StringBuffer stringbuffer = new StringBuffer(getUserid().getText());
                stringbuffer.setLength(12);
                bytearrayoutputstream.write(stringbuffer.toString().getBytes());
                stringbuffer = new StringBuffer(new String(getPassword().getPassword()));
                stringbuffer.setLength(20);
                bytearrayoutputstream.write(stringbuffer.toString().getBytes());
                bytearrayoutputstream.flush();
                byte abyte1[] = bytearrayoutputstream.toByteArray();
                bytearrayoutputstream.close();
                mqchannelexit.exitResponse = -4;
                return abyte1;
            }
            catch(Exception exception)
            {
                System.out.println("Exception: " + exception.toString());
            }
            mqchannelexit.exitResponse = -1;
            break;
        }
        return null;
    }

    private JPanel ivjJDialogContentPane;
    private JButton ivjCancel;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JButton ivjOK;
    private JPasswordField ivjPassword;
    private JPanel ivjSecurityEntryPanel;
    private JTextField ivjUserid;
    private JPanel ivjFooterPanel;
    private FlowLayout ivjFooterPanelFlowLayout;
    IvjEventHandler ivjEventHandler;




}
