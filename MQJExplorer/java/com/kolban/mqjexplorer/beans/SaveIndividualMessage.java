// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SaveIndividualMessage.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.*;
import com.kolban.utils.ExampleFileFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class SaveIndividualMessage extends JDialog
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getCancel())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getBrowse())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getWrite())
                connEtoC3(actionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public SaveIndividualMessage()
    {
        ivjBrowse = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjWrite = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileName = null;
        lastFile = null;
        message = null;
        qName = null;
        qMgr = null;
        initialize();
    }

    public SaveIndividualMessage(Dialog dialog)
    {
        super(dialog);
        ivjBrowse = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjWrite = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileName = null;
        lastFile = null;
        message = null;
        qName = null;
        qMgr = null;
        initialize();
    }

    public SaveIndividualMessage(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjBrowse = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjWrite = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileName = null;
        lastFile = null;
        message = null;
        qName = null;
        qMgr = null;
    }

    public SaveIndividualMessage(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjBrowse = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjWrite = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileName = null;
        lastFile = null;
        message = null;
        qName = null;
        qMgr = null;
    }

    public SaveIndividualMessage(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjBrowse = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjWrite = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileName = null;
        lastFile = null;
        message = null;
        qName = null;
        qMgr = null;
    }

    public SaveIndividualMessage(Frame frame)
    {
        super(frame);
        ivjBrowse = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjWrite = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileName = null;
        lastFile = null;
        message = null;
        qName = null;
        qMgr = null;
        initialize();
    }

    public SaveIndividualMessage(Frame frame, String s)
    {
        super(frame, s);
        ivjBrowse = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjWrite = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileName = null;
        lastFile = null;
        message = null;
        qName = null;
        qMgr = null;
    }

    public SaveIndividualMessage(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjBrowse = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjWrite = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileName = null;
        lastFile = null;
        message = null;
        qName = null;
        qMgr = null;
    }

    public SaveIndividualMessage(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjBrowse = null;
        ivjCancel = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJSeparator1 = null;
        ivjWrite = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileName = null;
        lastFile = null;
        message = null;
        qName = null;
        qMgr = null;
    }

    public void browse()
    {
        JFileChooser jfilechooser = new JFileChooser(lastFile);
        ExampleFileFilter examplefilefilter = new ExampleFileFilter("msg", "Message file");
        jfilechooser.setFileFilter(examplefilefilter);
        jfilechooser.setDialogTitle("Message target file selection");
        jfilechooser.setApproveButtonToolTipText("Select the file whose contents will be the message");
        if(jfilechooser.showDialog(this, "Select File") == 0)
        {
            File file = jfilechooser.getSelectedFile();
            lastFile = file.getAbsolutePath();
            if(lastFile.indexOf('.') < 0)
                lastFile += ".msg";
            getFileName().setText(lastFile);
        }
    }

    public void cancel()
    {
        dispose();
    }

    private void connEtoC1(ActionEvent actionevent)
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

    private void connEtoC2(ActionEvent actionevent)
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

    private void connEtoC3(ActionEvent actionevent)
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

    private JTextField getFileName()
    {
        if(ivjFileName == null)
            try
            {
                ivjFileName = new JTextField();
                ivjFileName.setName("FileName");
                ivjFileName.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileName;
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
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel2(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints2);
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

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(getJPanel1FlowLayout());
                getJPanel1().add(getWrite(), getWrite().getName());
                getJPanel1().add(getCancel(), getCancel().getName());
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

    private JPanel getJPanel2()
    {
        if(ivjJPanel2 == null)
            try
            {
                ivjJPanel2 = new JPanel();
                ivjJPanel2.setName("JPanel2");
                ivjJPanel2.setLayout(getJPanel2FlowLayout());
                getJPanel2().add(getJLabel1(), getJLabel1().getName());
                getJPanel2().add(getFileName(), getFileName().getName());
                getJPanel2().add(getBrowse(), getBrowse().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
    }

    private FlowLayout getJPanel2FlowLayout()
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

    private JButton getWrite()
    {
        if(ivjWrite == null)
            try
            {
                ivjWrite = new JButton();
                ivjWrite.setName("Write");
                ivjWrite.setMnemonic('W');
                ivjWrite.setText("Write");
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
        getCancel().addActionListener(ivjEventHandler);
        getBrowse().addActionListener(ivjEventHandler);
        getWrite().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("SaveIndividualMessage");
            setDefaultCloseOperation(2);
            setResizable(false);
            setSize(426, 240);
            setModal(true);
            setTitle("Write single message");
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
            SaveIndividualMessage saveindividualmessage = new SaveIndividualMessage();
            saveindividualmessage.setModal(true);
            saveindividualmessage.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            saveindividualmessage.show();
            Insets insets = saveindividualmessage.getInsets();
            saveindividualmessage.setSize(saveindividualmessage.getWidth() + insets.left + insets.right, saveindividualmessage.getHeight() + insets.top + insets.bottom);
            saveindividualmessage.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void setMessage(MQMessage mqmessage)
    {
        message = mqmessage;
    }

    public void setQMgr(MQQueueManager mqqueuemanager)
    {
        qMgr = mqqueuemanager;
    }

    public void setQName(String s)
    {
        qName = s;
    }

    public void write()
    {
        if(qMgr == null || qName == null || message == null)
            return;
        MQQueue mqqueue = null;
        try
        {
            mqqueue = qMgr.accessQueue(qName, 9);
            MQGetMessageOptions mqgetmessageoptions = new MQGetMessageOptions();
            mqgetmessageoptions.options = 32;
            mqgetmessageoptions.matchOptions = 3;
            mqqueue.get(message, mqgetmessageoptions);
            FileOutputStream fileoutputstream = new FileOutputStream(getFileName().getText());
            message.seek(0);
            byte abyte0[] = new byte[message.getMessageLength()];
            message.readFully(abyte0);
            fileoutputstream.write(abyte0);
            fileoutputstream.flush();
            fileoutputstream.close();
            dispose();
        }
        catch(Exception exception)
        {
            JOptionPane.showMessageDialog(this, exception.getMessage(), "Error with message write", 0);
        }
        if(mqqueue != null)
            try
            {
                mqqueue.close();
            }
            catch(Exception _ex) { }
    }

    private JButton ivjBrowse;
    private JButton ivjCancel;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JPanel ivjJPanel2;
    private FlowLayout ivjJPanel2FlowLayout;
    private JSeparator ivjJSeparator1;
    private JButton ivjWrite;
    IvjEventHandler ivjEventHandler;
    private JTextField ivjFileName;
    private String lastFile;
    private MQMessage message;
    private String qName;
    private MQQueueManager qMgr;






}
