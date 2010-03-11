// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseDlg.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.*;
import com.kolban.mq.MQUtils;
import com.kolban.mqjexplorer.panels.*;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BrowseDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener, ComponentListener, WindowListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getClose())
                connEtoC1(actionevent);
        }

        public void componentHidden(ComponentEvent componentevent)
        {
        }

        public void componentMoved(ComponentEvent componentevent)
        {
        }

        public void componentResized(ComponentEvent componentevent)
        {
            if(componentevent.getSource() == BrowseDlg.this)
                connEtoC2(componentevent);
        }

        public void componentShown(ComponentEvent componentevent)
        {
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
            if(windowevent.getSource() == BrowseDlg.this)
                connEtoC3(windowevent);
        }

        public void windowDeactivated(WindowEvent windowevent)
        {
        }

        public void windowDeiconified(WindowEvent windowevent)
        {
        }

        public void windowIconified(WindowEvent windowevent)
        {
        }

        public void windowOpened(WindowEvent windowevent)
        {
        }

        IvjEventHandler()
        {
        }
    }


    public BrowseDlg()
    {
        ivjBrowseContext = null;
        ivjBrowseGeneral = null;
        ivjBrowseReport = null;
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjBrowseIdentifiers = null;
        ivjBrowseSegmentation = null;
        ivjSep1 = null;
        ivjBrowseData = null;
        profile_browse = null;
        row = 0;
        qMgr = null;
        qName = null;
        initialize();
    }

    public BrowseDlg(Dialog dialog)
    {
        super(dialog);
        ivjBrowseContext = null;
        ivjBrowseGeneral = null;
        ivjBrowseReport = null;
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjBrowseIdentifiers = null;
        ivjBrowseSegmentation = null;
        ivjSep1 = null;
        ivjBrowseData = null;
        profile_browse = null;
        row = 0;
        qMgr = null;
        qName = null;
        initialize();
    }

    public BrowseDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjBrowseContext = null;
        ivjBrowseGeneral = null;
        ivjBrowseReport = null;
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjBrowseIdentifiers = null;
        ivjBrowseSegmentation = null;
        ivjSep1 = null;
        ivjBrowseData = null;
        profile_browse = null;
        row = 0;
        qMgr = null;
        qName = null;
    }

    public BrowseDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjBrowseContext = null;
        ivjBrowseGeneral = null;
        ivjBrowseReport = null;
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjBrowseIdentifiers = null;
        ivjBrowseSegmentation = null;
        ivjSep1 = null;
        ivjBrowseData = null;
        profile_browse = null;
        row = 0;
        qMgr = null;
        qName = null;
    }

    public BrowseDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjBrowseContext = null;
        ivjBrowseGeneral = null;
        ivjBrowseReport = null;
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjBrowseIdentifiers = null;
        ivjBrowseSegmentation = null;
        ivjSep1 = null;
        ivjBrowseData = null;
        profile_browse = null;
        row = 0;
        qMgr = null;
        qName = null;
    }

    public BrowseDlg(Frame frame)
    {
        super(frame);
        ivjBrowseContext = null;
        ivjBrowseGeneral = null;
        ivjBrowseReport = null;
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjBrowseIdentifiers = null;
        ivjBrowseSegmentation = null;
        ivjSep1 = null;
        ivjBrowseData = null;
        profile_browse = null;
        row = 0;
        qMgr = null;
        qName = null;
        initialize();
    }

    public BrowseDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjBrowseContext = null;
        ivjBrowseGeneral = null;
        ivjBrowseReport = null;
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjBrowseIdentifiers = null;
        ivjBrowseSegmentation = null;
        ivjSep1 = null;
        ivjBrowseData = null;
        profile_browse = null;
        row = 0;
        qMgr = null;
        qName = null;
    }

    public BrowseDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjBrowseContext = null;
        ivjBrowseGeneral = null;
        ivjBrowseReport = null;
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjBrowseIdentifiers = null;
        ivjBrowseSegmentation = null;
        ivjSep1 = null;
        ivjBrowseData = null;
        profile_browse = null;
        row = 0;
        qMgr = null;
        qName = null;
    }

    public BrowseDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjBrowseContext = null;
        ivjBrowseGeneral = null;
        ivjBrowseReport = null;
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJTabbedPane1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjBrowseIdentifiers = null;
        ivjBrowseSegmentation = null;
        ivjSep1 = null;
        ivjBrowseData = null;
        profile_browse = null;
        row = 0;
        qMgr = null;
        qName = null;
    }

    public void close()
    {
        dispose();
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            close();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(ComponentEvent componentevent)
    {
        try
        {
            handleResized(componentevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(WindowEvent windowevent)
    {
        try
        {
            close();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public void dispose()
    {
        profile_browse.dimensions = getSize();
        super.dispose();
    }

    private BrowseContext getBrowseContext()
    {
        if(ivjBrowseContext == null)
            try
            {
                ivjBrowseContext = new BrowseContext();
                ivjBrowseContext.setName("BrowseContext");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrowseContext;
    }

    private BrowseData getBrowseData()
    {
        if(ivjBrowseData == null)
            try
            {
                ivjBrowseData = new BrowseData();
                ivjBrowseData.setName("BrowseData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrowseData;
    }

    private BrowseGeneral getBrowseGeneral()
    {
        if(ivjBrowseGeneral == null)
            try
            {
                ivjBrowseGeneral = new BrowseGeneral();
                ivjBrowseGeneral.setName("BrowseGeneral");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrowseGeneral;
    }

    private BrowseIdentifiers getBrowseIdentifiers()
    {
        if(ivjBrowseIdentifiers == null)
            try
            {
                ivjBrowseIdentifiers = new BrowseIdentifiers();
                ivjBrowseIdentifiers.setName("BrowseIdentifiers");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrowseIdentifiers;
    }

    private BrowseReport getBrowseReport()
    {
        if(ivjBrowseReport == null)
            try
            {
                ivjBrowseReport = new BrowseReport();
                ivjBrowseReport.setName("BrowseReport");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrowseReport;
    }

    private BrowseSegmentation getBrowseSegmentation()
    {
        if(ivjBrowseSegmentation == null)
            try
            {
                ivjBrowseSegmentation = new BrowseSegmentation();
                ivjBrowseSegmentation.setName("BrowseSegmentation");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrowseSegmentation;
    }

    private JButton getClose()
    {
        if(ivjClose == null)
            try
            {
                ivjClose = new JButton();
                ivjClose.setName("Close");
                ivjClose.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClose;
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
                gridbagconstraints.anchor = 11;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(3, 5, 0, 5);
                getJDialogContentPane().add(getJTabbedPane1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 2;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.insets = new Insets(4, 4, 0, 4);
                getJDialogContentPane().add(getSep1(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(getJPanel1FlowLayout());
                getJPanel1().add(getClose(), getClose().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private FlowLayout getJPanel1FlowLayout()
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

    private JTabbedPane getJTabbedPane1()
    {
        if(ivjJTabbedPane1 == null)
            try
            {
                ivjJTabbedPane1 = new JTabbedPane();
                ivjJTabbedPane1.setName("JTabbedPane1");
                ivjJTabbedPane1.insertTab("General", null, getBrowseGeneral(), null, 0);
                ivjJTabbedPane1.insertTab("Report", null, getBrowseReport(), null, 1);
                ivjJTabbedPane1.insertTab("Context", null, getBrowseContext(), null, 2);
                ivjJTabbedPane1.insertTab("Identifiers", null, getBrowseIdentifiers(), null, 3);
                ivjJTabbedPane1.insertTab("Segmentation", null, getBrowseSegmentation(), null, 4);
                ivjJTabbedPane1.insertTab("Data", null, getBrowseData(), null, 5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTabbedPane1;
    }

    private JSeparator getSep1()
    {
        if(ivjSep1 == null)
            try
            {
                ivjSep1 = new JSeparator();
                ivjSep1.setName("Sep1");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSep1;
    }

    private void handleException(Throwable throwable)
    {
    }

    public void handleResized(ComponentEvent componentevent)
    {
        SwingUtils.constrainResize(componentevent);
    }

    private void initConnections()
        throws Exception
    {
        getClose().addActionListener(ivjEventHandler);
        addComponentListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            getRootPane().setDefaultButton(getClose());
            setName("BrowseDlg");
            setDefaultCloseOperation(0);
            setTitle("Properties for message");
            setSize(383, 372);
            setModal(true);
            setResizable(true);
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
            BrowseDlg browsedlg = new BrowseDlg();
            browsedlg.setModal(true);
            browsedlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            browsedlg.show();
            Insets insets = browsedlg.getInsets();
            browsedlg.setSize(browsedlg.getWidth() + insets.left + insets.right, browsedlg.getHeight() + insets.top + insets.bottom);
            browsedlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void setBrowseSettings(com.kolban.mqjexplorer.Profile.BrowseSettings browsesettings)
    {
        profile_browse = browsesettings;
        setSize(browsesettings.dimensions);
    }

    public void setMessage(MQMessage mqmessage, MQQueueManager mqqueuemanager, String s, int i)
    {
        message = mqmessage;
        row = i;
        getBrowseGeneral().setFromMessage(mqmessage);
        getBrowseContext().setFromMessage(mqmessage);
        getBrowseReport().setFromMessage(mqmessage);
        getBrowseIdentifiers().setFromMessage(mqmessage);
        getBrowseSegmentation().setFromMessage(mqmessage);
        getBrowseData().setFromMessage(mqmessage, mqqueuemanager, s, i);
        if(((MQMD) (mqmessage)).format.equals("MQDEAD  "))
        {
            BrowseDLH browsedlh = new BrowseDLH();
            browsedlh.setFromMessage(mqmessage);
            getJTabbedPane1().insertTab("DLH", null, browsedlh, null, 6);
        }
        if(((MQMD) (mqmessage)).format.equals("MQHRF2  "))
        {
            BrowseMQRFH2 browsemqrfh2 = new BrowseMQRFH2();
            browsemqrfh2.setFromMessage(mqmessage);
            getJTabbedPane1().insertTab("RFH2", null, browsemqrfh2, null, 6);
        }
        if(((MQMD) (mqmessage)).format.equals("MQHRF   "))
        {
            BrowseMQRFH1 browsemqrfh1 = new BrowseMQRFH1();
            browsemqrfh1.setFromMessage(mqmessage);
            getJTabbedPane1().insertTab("RFH1", null, browsemqrfh1, null, 6);
        }
        if(((MQMD) (mqmessage)).format.equals("MQPCF   "))
        {
            BrowsePCF browsepcf = new BrowsePCF();
            MQMessage mqmessage2 = MQUtils.getIndexedMessage(mqqueuemanager, s, i);
            browsepcf.setFromMessage(mqmessage2);
            getJTabbedPane1().insertTab("PCF", null, browsepcf, null, 6);
        }
        if(((MQMD) (mqmessage)).format.equals("MQXMIT  "))
        {
            MQMessage mqmessage1 = MQUtils.getIndexedMessage(mqqueuemanager, s, i);
            BrowseXMIT browsexmit = new BrowseXMIT();
            browsexmit.setFromMessage(mqmessage1);
            getJTabbedPane1().insertTab("XMIT", null, browsexmit, null, 6);
        }
    }

    public void setQInfo(MQQueueManager mqqueuemanager, String s)
    {
        qMgr = mqqueuemanager;
        qName = s;
    }

    private BrowseContext ivjBrowseContext;
    private BrowseGeneral ivjBrowseGeneral;
    private BrowseReport ivjBrowseReport;
    private JButton ivjClose;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JTabbedPane ivjJTabbedPane1;
    private MQMessage message;
    IvjEventHandler ivjEventHandler;
    private BrowseIdentifiers ivjBrowseIdentifiers;
    private BrowseSegmentation ivjBrowseSegmentation;
    private JSeparator ivjSep1;
    private BrowseData ivjBrowseData;
    private com.kolban.mqjexplorer.Profile.BrowseSettings profile_browse;
    private int row;
    private MQQueueManager qMgr;
    private String qName;




}
