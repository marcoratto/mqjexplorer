// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReadMessagesFromFile.java

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

public class ReadMessagesFromFile extends JDialog
    implements Observer
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getClose())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getRead())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getBrowse())
                connEtoC3(actionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public ReadMessagesFromFile()
    {
        ivjBrowse = null;
        ivjButtonPanel = null;
        ivjClose = null;
        ivjControlPanel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileNameText = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJSeparator1 = null;
        ivjRead = null;
        qName = null;
        qMgr = null;
        ivjButtonPanelFlowLayout = null;
        ivjMessageText = null;
        ivjControlPanelFlowLayout = null;
        lastFilePath = "";
        ivjProgress = null;
        initialize();
    }

    public ReadMessagesFromFile(Frame frame, String s, MQQueueManager mqqueuemanager)
    {
        super(frame);
        ivjBrowse = null;
        ivjButtonPanel = null;
        ivjClose = null;
        ivjControlPanel = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileNameText = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJSeparator1 = null;
        ivjRead = null;
        qName = null;
        qMgr = null;
        ivjButtonPanelFlowLayout = null;
        ivjMessageText = null;
        ivjControlPanelFlowLayout = null;
        lastFilePath = "";
        ivjProgress = null;
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
            read();
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
                getButtonPanel().add(getRead(), getRead().getName());
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
                ivjClose.setBorderPainted(true);
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
                ivjFileNameText.setText("");
                ivjFileNameText.setColumns(20);
                ivjFileNameText.getDocument().addDocumentListener(new TextFieldEnabler(getRead()));
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
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 18;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 0, 4, 4);
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
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getMessageText(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.insets = new Insets(0, 4, 0, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.fill = 1;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
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

    private JSeparator getJSeparator1()
    {
        if(ivjJSeparator1 == null)
            try
            {
                ivjJSeparator1 = new JSeparator();
                ivjJSeparator1.setName("JSeparator1");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSeparator1;
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

    private JButton getRead()
    {
        if(ivjRead == null)
            try
            {
                ivjRead = new JButton();
                ivjRead.setName("Read");
                ivjRead.setMnemonic('R');
                ivjRead.setText("Read");
                ivjRead.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRead;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getClose().addActionListener(ivjEventHandler);
        getRead().addActionListener(ivjEventHandler);
        getBrowse().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("ReadMessages");
            setDefaultCloseOperation(2);
            setTitle("Restore messages from a file");
            setSize(426, 140);
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
            ReadMessagesFromFile readmessagesfromfile = new ReadMessagesFromFile();
            readmessagesfromfile.setModal(true);
            readmessagesfromfile.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            readmessagesfromfile.show();
            Insets insets = readmessagesfromfile.getInsets();
            readmessagesfromfile.setSize(readmessagesfromfile.getWidth() + insets.left + insets.right, readmessagesfromfile.getHeight() + insets.top + insets.bottom);
            readmessagesfromfile.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void read()
    {
        String s = getFileNameText().getText();
        getProgress().setMaximum(0);
        try
        {
            getMessageText().setText("");
            int i = MQUtils.readQueueFromFile(qMgr, qName, s, this);
            getJDialogContentPane().revalidate();
            getMessageText().setText(i + " Messages read from file and put to queue");
        }
        catch(Exception exception)
        {
            JOptionPane.showMessageDialog(this, exception.getMessage(), "Read error", 0);
        }
    }

    public void update(Observable observable, Object obj)
    {
        int i = ((Integer)obj).intValue();
        if(getProgress().getMaximum() == 0)
        {
            System.out.println("Max = " + i);
            getProgress().setMaximum(i);
            getProgress().setValue(0);
        } else
        {
            getProgress().setValue(i);
        }
        Dimension dimension = getProgress().getSize();
        getProgress().paintImmediately(0, 0, dimension.width, dimension.height);
    }

    private JButton ivjBrowse;
    private JPanel ivjButtonPanel;
    private JButton ivjClose;
    private JPanel ivjControlPanel;
    IvjEventHandler ivjEventHandler;
    private JTextField ivjFileNameText;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JSeparator ivjJSeparator1;
    private JButton ivjRead;
    private String qName;
    private MQQueueManager qMgr;
    private FlowLayout ivjButtonPanelFlowLayout;
    private JLabel ivjMessageText;
    private FlowLayout ivjControlPanelFlowLayout;
    private String lastFilePath;
    private JProgressBar ivjProgress;






}
