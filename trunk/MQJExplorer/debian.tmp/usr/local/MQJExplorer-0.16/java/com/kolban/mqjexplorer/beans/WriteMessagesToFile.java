// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WriteMessagesToFile.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQQueueManager;
import com.kolban.mq.MQUtils;
import com.kolban.swing.TextFieldEnabler;
import com.kolban.utils.ExampleFileFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;
import javax.swing.*;

public class WriteMessagesToFile extends JDialog
    implements Observer
{
    class IvjEventHandler
        implements ActionListener, WindowListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getClose())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getWrite())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getBrowse())
                connEtoC3(actionevent);
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
            if(windowevent.getSource() == WriteMessagesToFile.this)
                connEtoC4(windowevent);
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


    public WriteMessagesToFile()
    {
        ivjButtonPanel = null;
        ivjClose = null;
        ivjControlPanel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileNameText = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjSep1 = null;
        ivjBrowse = null;
        ivjWrite = null;
        qName = null;
        qMgr = null;
        ivjButtonPanelFlowLayout = null;
        ivjMessageText = null;
        lastFilePath = "";
        ivjProgress = null;
        ivjControlPanelFlowLayout = null;
        initialize();
    }

    public WriteMessagesToFile(Frame frame)
    {
        super(frame);
        ivjButtonPanel = null;
        ivjClose = null;
        ivjControlPanel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileNameText = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjSep1 = null;
        ivjBrowse = null;
        ivjWrite = null;
        qName = null;
        qMgr = null;
        ivjButtonPanelFlowLayout = null;
        ivjMessageText = null;
        lastFilePath = "";
        ivjProgress = null;
        ivjControlPanelFlowLayout = null;
        initialize();
    }

    public WriteMessagesToFile(Frame frame, String s, MQQueueManager mqqueuemanager)
    {
        super(frame);
        ivjButtonPanel = null;
        ivjClose = null;
        ivjControlPanel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileNameText = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjSep1 = null;
        ivjBrowse = null;
        ivjWrite = null;
        qName = null;
        qMgr = null;
        ivjButtonPanelFlowLayout = null;
        ivjMessageText = null;
        lastFilePath = "";
        ivjProgress = null;
        ivjControlPanelFlowLayout = null;
        qName = s;
        qMgr = mqqueuemanager;
        initialize();
    }

    public void browse()
    {
        JFileChooser jfilechooser = new JFileChooser(lastFilePath);
        ExampleFileFilter examplefilefilter = new ExampleFileFilter("dat", "Data file");
        jfilechooser.setFileFilter(examplefilefilter);
        jfilechooser.setDialogTitle("Message source file selection");
        jfilechooser.setApproveButtonToolTipText("Select the file of messages to be read.");
        if(jfilechooser.showDialog(this, "Select File") == 0)
        {
            File file = jfilechooser.getSelectedFile();
            lastFilePath = file.getAbsolutePath();
            if(lastFilePath.indexOf('.') < 0)
                lastFilePath += ".dat";
            getFileNameText().setText(lastFilePath);
        }
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

    private void connEtoC2(ActionEvent actionevent)
    {
        try
        {
            write();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(ActionEvent actionevent)
    {
        try
        {
            browse();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(WindowEvent windowevent)
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

    private JButton getBrowse()
    {
        if(ivjBrowse == null)
            try
            {
                ivjBrowse = new JButton();
                ivjBrowse.setName("Browse");
                ivjBrowse.setMnemonic('B');
                ivjBrowse.setText("Browse...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrowse;
    }

    private JPanel getButtonPanel()
    {
        if(ivjButtonPanel == null)
            try
            {
                ivjButtonPanel = new JPanel();
                ivjButtonPanel.setName("ButtonPanel");
                ivjButtonPanel.setLayout(getButtonPanelFlowLayout());
                getButtonPanel().add(getWrite(), getWrite().getName());
                getButtonPanel().add(getClose(), getClose().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjButtonPanel;
    }

    private FlowLayout getButtonPanelFlowLayout()
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

    private JButton getClose()
    {
        if(ivjClose == null)
            try
            {
                ivjClose = new JButton();
                ivjClose.setName("Close");
                ivjClose.setMnemonic('C');
                ivjClose.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClose;
    }

    private JPanel getControlPanel()
    {
        if(ivjControlPanel == null)
            try
            {
                ivjControlPanel = new JPanel();
                ivjControlPanel.setName("ControlPanel");
                ivjControlPanel.setLayout(getControlPanelFlowLayout());
                getControlPanel().add(getJLabel1(), getJLabel1().getName());
                getControlPanel().add(getFileNameText(), getFileNameText().getName());
                getControlPanel().add(getBrowse(), getBrowse().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjControlPanel;
    }

    private FlowLayout getControlPanelFlowLayout()
    {
        FlowLayout flowlayout = null;
        try
        {
            flowlayout = new FlowLayout();
            flowlayout.setAlignment(0);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return flowlayout;
    }

    private JTextField getFileNameText()
    {
        if(ivjFileNameText == null)
            try
            {
                ivjFileNameText = new JTextField();
                ivjFileNameText.setName("FileNameText");
                ivjFileNameText.setColumns(20);
                ivjFileNameText.getDocument().addDocumentListener(new TextFieldEnabler(getWrite()));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileNameText;
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
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 18;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.ipadx = 4;
                gridbagconstraints.ipady = 4;
                gridbagconstraints.insets = new Insets(4, 0, 4, 0);
                getJDialogContentPane().add(getControlPanel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getProgress(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getMessageText(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                getJDialogContentPane().add(getSep1(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.fill = 1;
                gridbagconstraints4.weightx = 1.0D;
                getJDialogContentPane().add(getButtonPanel(), gridbagconstraints4);
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
                ivjJLabel1.setText("File Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private JLabel getMessageText()
    {
        if(ivjMessageText == null)
            try
            {
                ivjMessageText = new JLabel();
                ivjMessageText.setName("MessageText");
                ivjMessageText.setText(" ");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageText;
    }

    private JProgressBar getProgress()
    {
        if(ivjProgress == null)
            try
            {
                ivjProgress = new JProgressBar();
                ivjProgress.setName("Progress");
                ivjProgress.setStringPainted(true);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjProgress;
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

    private JButton getWrite()
    {
        if(ivjWrite == null)
            try
            {
                ivjWrite = new JButton();
                ivjWrite.setName("Write");
                ivjWrite.setMnemonic('W');
                ivjWrite.setText("Write");
                ivjWrite.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjWrite;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getClose().addActionListener(ivjEventHandler);
        getWrite().addActionListener(ivjEventHandler);
        getBrowse().addActionListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("WriteMessages");
            setDefaultCloseOperation(0);
            setResizable(false);
            setSize(426, 300);
            setModal(true);
            setTitle("Backup messages to a file");
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
            WriteMessagesToFile writemessagestofile = new WriteMessagesToFile();
            writemessagestofile.setModal(true);
            writemessagestofile.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            writemessagestofile.show();
            Insets insets = writemessagestofile.getInsets();
            writemessagestofile.setSize(writemessagestofile.getWidth() + insets.left + insets.right, writemessagestofile.getHeight() + insets.top + insets.bottom);
            writemessagestofile.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void update(Observable observable, Object obj)
    {
        Integer integer = (Integer)obj;
        getProgress().setValue(integer.intValue());
        Dimension dimension = getProgress().getSize();
        getProgress().paintImmediately(0, 0, dimension.width, dimension.height);
    }

    public void write()
    {
        getProgress().setMaximum(MQUtils.qDepth(qMgr, qName));
        int i = MQUtils.writeQueueToFile(qMgr, qName, getFileNameText().getText(), this);
        getMessageText().setText(i + " Messages written to file");
    }

    private JPanel ivjButtonPanel;
    private JButton ivjClose;
    private JPanel ivjControlPanel;
    IvjEventHandler ivjEventHandler;
    private JTextField ivjFileNameText;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JSeparator ivjSep1;
    private JButton ivjBrowse;
    private JButton ivjWrite;
    private String qName;
    private MQQueueManager qMgr;
    private FlowLayout ivjButtonPanelFlowLayout;
    private JLabel ivjMessageText;
    private String lastFilePath;
    private JProgressBar ivjProgress;
    private FlowLayout ivjControlPanelFlowLayout;







}
