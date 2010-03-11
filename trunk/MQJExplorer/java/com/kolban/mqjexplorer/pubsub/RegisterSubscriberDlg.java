// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegisterSubscriberDlg.java

package com.kolban.mqjexplorer.pubsub;

import com.kolban.mq.MQRFH;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.mqjexplorer.mqattributes.QNameTextField;
import com.kolban.swing.Footer;
import com.kolban.swing.FooterListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.EventObject;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// Referenced classes of package com.kolban.mqjexplorer.pubsub:
//            RegistrationOptions, MQPubSub, PubSubError, RegistrationOptionsListener

public class RegisterSubscriberDlg extends JDialog
{
    class IvjEventHandler
        implements RegistrationOptionsListener, FooterListener
    {

        public void cancel(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC2(eventobject);
        }

        public void correlAsIdItem_itemStateChanged(EventObject eventobject)
        {
            if(eventobject.getSource() == getRegistrationOptions())
                connEtoM1(eventobject);
            if(eventobject.getSource() == getRegistrationOptions())
                connEtoC3(eventobject);
        }

        public void ok(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC1(eventobject);
        }

        IvjEventHandler()
        {
        }
    }


    public RegisterSubscriberDlg()
    {
        ivjJDialogContentPane = null;
        ivjFooter = null;
        ivjJPanel1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjRegistrationOptions = null;
        qMgrModel = null;
        ivjQueue = null;
        ivjQueueManager = null;
        ivjStreamName = null;
        ivjTopic = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCorrelId = null;
        ivjJLabel5 = null;
        newTopic = null;
        initialize();
    }

    public RegisterSubscriberDlg(Dialog dialog)
    {
        super(dialog);
        ivjJDialogContentPane = null;
        ivjFooter = null;
        ivjJPanel1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjRegistrationOptions = null;
        qMgrModel = null;
        ivjQueue = null;
        ivjQueueManager = null;
        ivjStreamName = null;
        ivjTopic = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCorrelId = null;
        ivjJLabel5 = null;
        newTopic = null;
    }

    public RegisterSubscriberDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjJDialogContentPane = null;
        ivjFooter = null;
        ivjJPanel1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjRegistrationOptions = null;
        qMgrModel = null;
        ivjQueue = null;
        ivjQueueManager = null;
        ivjStreamName = null;
        ivjTopic = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCorrelId = null;
        ivjJLabel5 = null;
        newTopic = null;
    }

    public RegisterSubscriberDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjJDialogContentPane = null;
        ivjFooter = null;
        ivjJPanel1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjRegistrationOptions = null;
        qMgrModel = null;
        ivjQueue = null;
        ivjQueueManager = null;
        ivjStreamName = null;
        ivjTopic = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCorrelId = null;
        ivjJLabel5 = null;
        newTopic = null;
    }

    public RegisterSubscriberDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjJDialogContentPane = null;
        ivjFooter = null;
        ivjJPanel1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjRegistrationOptions = null;
        qMgrModel = null;
        ivjQueue = null;
        ivjQueueManager = null;
        ivjStreamName = null;
        ivjTopic = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCorrelId = null;
        ivjJLabel5 = null;
        newTopic = null;
    }

    public RegisterSubscriberDlg(Frame frame)
    {
        super(frame);
        ivjJDialogContentPane = null;
        ivjFooter = null;
        ivjJPanel1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjRegistrationOptions = null;
        qMgrModel = null;
        ivjQueue = null;
        ivjQueueManager = null;
        ivjStreamName = null;
        ivjTopic = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCorrelId = null;
        ivjJLabel5 = null;
        newTopic = null;
    }

    public RegisterSubscriberDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjJDialogContentPane = null;
        ivjFooter = null;
        ivjJPanel1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjRegistrationOptions = null;
        qMgrModel = null;
        ivjQueue = null;
        ivjQueueManager = null;
        ivjStreamName = null;
        ivjTopic = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCorrelId = null;
        ivjJLabel5 = null;
        newTopic = null;
    }

    public RegisterSubscriberDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjJDialogContentPane = null;
        ivjFooter = null;
        ivjJPanel1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjRegistrationOptions = null;
        qMgrModel = null;
        ivjQueue = null;
        ivjQueueManager = null;
        ivjStreamName = null;
        ivjTopic = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCorrelId = null;
        ivjJLabel5 = null;
        newTopic = null;
    }

    public RegisterSubscriberDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjJDialogContentPane = null;
        ivjFooter = null;
        ivjJPanel1 = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjRegistrationOptions = null;
        qMgrModel = null;
        ivjQueue = null;
        ivjQueueManager = null;
        ivjStreamName = null;
        ivjTopic = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCorrelId = null;
        ivjJLabel5 = null;
        newTopic = null;
    }

    private void cancel()
    {
        dispose();
    }

    private void connEtoC1(EventObject eventobject)
    {
        try
        {
            ok();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(EventObject eventobject)
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

    private void connEtoC3(EventObject eventobject)
    {
        try
        {
            validateOK();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM1(EventObject eventobject)
    {
        try
        {
            getCorrelId().setEnabled(getRegistrationOptions().getCorrelAsIdSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private boolean execute()
    {
        if(qMgrModel == null)
            return false;
        MQRFH mqrfh = new MQRFH();
        mqrfh.addNameValue("MQPSCommand", "RegSub");
        mqrfh.addNameValue("MQPSTopic", getTopic().getText());
        getRegistrationOptions().getRegOpts(mqrfh);
        if(getStreamName().getText().length() > 0)
            mqrfh.addNameValue("MQPSStreamName", getStreamName().getText());
        if(getQueueManager().getText().length() > 0)
            mqrfh.addNameValue("MQPSQMgrName", getQueueManager().getText());
        if(getQueue().getText().length() > 0)
            mqrfh.addNameValue("MQPSQName", getQueue().getText());
        try
        {
            com.ibm.mq.MQQueueManager mqqueuemanager = qMgrModel.getQueueManager();
            PubSubError pubsuberror = MQPubSub.execute(mqqueuemanager, mqrfh, getCorrelId().getText().getBytes());
            if(pubsuberror != null)
            {
                JOptionPane.showMessageDialog(this, pubsuberror.toString(), "PubSub error", 0);
                return false;
            }
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
            return false;
        }
        return true;
    }

    private JTextField getCorrelId()
    {
        if(ivjCorrelId == null)
            try
            {
                ivjCorrelId = new JTextField();
                ivjCorrelId.setName("CorrelId");
                ivjCorrelId.setEnabled(false);
                ivjCorrelId.setColumns(20);
                ivjCorrelId.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent documentevent)
                    {
                    }

                    public void removeUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
                    }

                    public void insertUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
                    }

                }
);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCorrelId;
    }

    private Footer getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new Footer();
                ivjFooter.setName("Footer");
                ivjFooter.setOKEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
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
                gridbagconstraints.gridy = 1;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints1);
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
                ivjJLabel1.setText("Topic:");
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
                ivjJLabel2.setText("Stream Name:");
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
                ivjJLabel3.setText("Queue Manager:");
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
                ivjJLabel4.setText("Queue:");
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
                ivjJLabel5.setText("CorrelId:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel5;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getTopic(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel2(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel3(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 3;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel4(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 1;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.weightx = 1.0D;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getStreamName(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 1;
                gridbagconstraints6.gridy = 2;
                gridbagconstraints6.fill = 2;
                gridbagconstraints6.weightx = 1.0D;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getQueueManager(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 0;
                gridbagconstraints7.gridy = 4;
                gridbagconstraints7.gridwidth = 2;
                gridbagconstraints7.anchor = 17;
                gridbagconstraints7.weightx = 1.0D;
                gridbagconstraints7.weighty = 1.0D;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getRegistrationOptions(), gridbagconstraints7);
                GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
                gridbagconstraints8.gridx = 0;
                gridbagconstraints8.gridy = 5;
                gridbagconstraints8.anchor = 17;
                gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel5(), gridbagconstraints8);
                GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
                gridbagconstraints9.gridx = 1;
                gridbagconstraints9.gridy = 5;
                gridbagconstraints9.fill = 2;
                gridbagconstraints9.weightx = 1.0D;
                gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getCorrelId(), gridbagconstraints9);
                GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
                gridbagconstraints10.gridx = 1;
                gridbagconstraints10.gridy = 3;
                gridbagconstraints10.fill = 2;
                gridbagconstraints10.weightx = 1.0D;
                gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getQueue(), gridbagconstraints10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    public String getNewTopic()
    {
        return newTopic;
    }

    private QNameTextField getQueue()
    {
        if(ivjQueue == null)
            try
            {
                ivjQueue = new QNameTextField();
                ivjQueue.setName("Queue");
                ivjQueue.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent documentevent)
                    {
                    }

                    public void removeUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
                    }

                    public void insertUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
                    }

                }
);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQueue;
    }

    private JTextField getQueueManager()
    {
        if(ivjQueueManager == null)
            try
            {
                ivjQueueManager = new JTextField();
                ivjQueueManager.setName("QueueManager");
                ivjQueueManager.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQueueManager;
    }

    private RegistrationOptions getRegistrationOptions()
    {
        if(ivjRegistrationOptions == null)
            try
            {
                ivjRegistrationOptions = new RegistrationOptions();
                ivjRegistrationOptions.setName("RegistrationOptions");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRegistrationOptions;
    }

    private JTextField getStreamName()
    {
        if(ivjStreamName == null)
            try
            {
                ivjStreamName = new JTextField();
                ivjStreamName.setName("StreamName");
                ivjStreamName.setText("SYSTEM.BROKER.DEFAULT.STREAM");
                ivjStreamName.setColumns(20);
                ivjStreamName.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent documentevent)
                    {
                    }

                    public void removeUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
                    }

                    public void insertUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
                    }

                }
);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStreamName;
    }

    private JTextField getTopic()
    {
        if(ivjTopic == null)
            try
            {
                ivjTopic = new JTextField();
                ivjTopic.setName("Topic");
                ivjTopic.setColumns(20);
                ivjTopic.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent documentevent)
                    {
                    }

                    public void removeUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
                    }

                    public void insertUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
                    }

                }
);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTopic;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getFooter().addFooterListener(ivjEventHandler);
        getRegistrationOptions().addRegistrationOptionsListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("RegisterSubscriberDlg");
            setDefaultCloseOperation(2);
            setTitle("Register Subscriber");
            setSize(426, 397);
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
            RegisterSubscriberDlg registersubscriberdlg = new RegisterSubscriberDlg();
            registersubscriberdlg.setModal(true);
            registersubscriberdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            registersubscriberdlg.show();
            Insets insets = registersubscriberdlg.getInsets();
            registersubscriberdlg.setSize(registersubscriberdlg.getWidth() + insets.left + insets.right, registersubscriberdlg.getHeight() + insets.top + insets.bottom);
            registersubscriberdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void ok()
    {
        if(getTopic().getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "No topic supplied", "Error", 0);
            return;
        }
        if(getRegistrationOptions().getCorrelAsIdSelected() && getCorrelId().getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "No CorrelId supplied", "Error", 0);
            return;
        }
        boolean flag = execute();
        if(flag)
        {
            newTopic = getTopic().getText();
            dispose();
        }
    }

    public void setQMgrModel(QueueManagerModel queuemanagermodel)
    {
        qMgrModel = queuemanagermodel;
    }

    public void setTopicName(String s)
    {
        getTopic().setText(s);
    }

    private void validateOK()
    {
        if(getQueue().getDocument().getLength() == 0 || getTopic().getDocument().getLength() == 0 || getStreamName().getDocument().getLength() == 0 || getRegistrationOptions().getCorrelAsIdSelected() && getCorrelId().getDocument().getLength() == 0)
            getFooter().setOKEnabled(false);
        else
            getFooter().setOKEnabled(true);
    }

    private JPanel ivjJDialogContentPane;
    private Footer ivjFooter;
    private JPanel ivjJPanel1;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private RegistrationOptions ivjRegistrationOptions;
    private QueueManagerModel qMgrModel;
    private QNameTextField ivjQueue;
    private JTextField ivjQueueManager;
    private JTextField ivjStreamName;
    private JTextField ivjTopic;
    IvjEventHandler ivjEventHandler;
    private JTextField ivjCorrelId;
    private JLabel ivjJLabel5;
    private String newTopic;







}
