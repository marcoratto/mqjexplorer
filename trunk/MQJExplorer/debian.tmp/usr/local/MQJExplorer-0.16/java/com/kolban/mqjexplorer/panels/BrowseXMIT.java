// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseXMIT.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMessage;
import com.kolban.mq.MQMD;
import com.kolban.mq.MQXQH;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class BrowseXMIT extends JPanel
{

    public BrowseXMIT()
    {
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjRemoteQMgrName = null;
        ivjRemoteQName = null;
        ivjScrollPane = null;
        initialize();
    }

    public BrowseXMIT(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjRemoteQMgrName = null;
        ivjRemoteQName = null;
        ivjScrollPane = null;
    }

    public BrowseXMIT(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjRemoteQMgrName = null;
        ivjRemoteQName = null;
        ivjScrollPane = null;
    }

    public BrowseXMIT(boolean flag)
    {
        super(flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjRemoteQMgrName = null;
        ivjRemoteQName = null;
        ivjScrollPane = null;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Remote Q Name:");
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
                ivjJLabel2.setText("Remote QMgr Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
    }

    private JLabel getRemoteQMgrName()
    {
        if(ivjRemoteQMgrName == null)
            try
            {
                ivjRemoteQMgrName = new JLabel();
                ivjRemoteQMgrName.setName("RemoteQMgrName");
                ivjRemoteQMgrName.setText("JLabel4");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRemoteQMgrName;
    }

    private JLabel getRemoteQName()
    {
        if(ivjRemoteQName == null)
            try
            {
                ivjRemoteQName = new JLabel();
                ivjRemoteQName.setName("RemoteQName");
                ivjRemoteQName.setText("JLabel3");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRemoteQName;
    }

    private JScrollPane getScrollPane()
    {
        if(ivjScrollPane == null)
            try
            {
                ivjScrollPane = new JScrollPane();
                ivjScrollPane.setName("ScrollPane");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjScrollPane;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("BrowseXMIT");
            setLayout(new GridBagLayout());
            setSize(315, 316);
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
            gridbagconstraints2.gridx = 1;
            gridbagconstraints2.gridy = 0;
            gridbagconstraints2.anchor = 17;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getRemoteQName(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 1;
            gridbagconstraints3.gridy = 1;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getRemoteQMgrName(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 2;
            gridbagconstraints4.gridwidth = 2;
            gridbagconstraints4.fill = 1;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.weighty = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getScrollPane(), gridbagconstraints4);
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
            BrowseXMIT browsexmit = new BrowseXMIT();
            jframe.setContentPane(browsexmit);
            jframe.setSize(browsexmit.getSize());
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
        MQXQH mqxqh = new MQXQH();
        mqxqh.setFromMessage(mqmessage);
        getRemoteQName().setText(mqxqh.remoteQName);
        getRemoteQMgrName().setText(mqxqh.remoteQMgrName);
        MQMD mqmd = new MQMD();
        javax.swing.JTable jtable = mqmd.toTable(mqxqh.mqmd);
        getScrollPane().setViewportView(jtable);
    }

    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjRemoteQMgrName;
    private JLabel ivjRemoteQName;
    private JScrollPane ivjScrollPane;
}
