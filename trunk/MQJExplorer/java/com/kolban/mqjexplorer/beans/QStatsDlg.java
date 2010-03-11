// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QStatsDlg.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQException;
import com.ibm.mq.pcf.PCFMessage;
import com.ibm.mq.pcf.PCFMessageAgent;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.mqjexplorer.guibeans.QFullBar;
import com.kolban.mqjexplorer.guibeans.QFullBarTableRenderer;
import com.kolban.swing.NumericTextField;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.TableModel;

// Referenced classes of package com.kolban.mqjexplorer.beans:
//            QStatsTableModel

public class QStatsDlg extends JDialog
    implements ActionListener
{
    class IvjEventHandler
        implements ActionListener, ComponentListener, ItemListener, WindowListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getStart())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getStop())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getClose())
                connEtoC3(actionevent);
            if(actionevent.getSource() == getJButton2())
                connEtoC5();
            if(actionevent.getSource() == getLogButton())
                connEtoC6(actionevent);
        }

        public void componentHidden(ComponentEvent componentevent)
        {
        }

        public void componentMoved(ComponentEvent componentevent)
        {
        }

        public void componentResized(ComponentEvent componentevent)
        {
            if(componentevent.getSource() == QStatsDlg.this)
                connEtoC4(componentevent);
        }

        public void componentShown(ComponentEvent componentevent)
        {
        }

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getLoggingEnabled())
                connEtoM1(itemevent);
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
            if(windowevent.getSource() == getLogDlg())
                connEtoC7(windowevent);
            if(windowevent.getSource() == QStatsDlg.this)
                connEtoC8(windowevent);
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


    public QStatsDlg()
    {
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjQStatsTable = null;
        qManagerModel = null;
        ivjInterval = null;
        ivjJLabel1 = null;
        ivjStart = null;
        ivjStop = null;
        ivjEventHandler = new IvjEventHandler();
        timer = null;
        flashTimer = null;
        agent = null;
        qStatsSettings = null;
        redBall = null;
        ivjJPanel3 = null;
        ivjJPanel3FlowLayout = null;
        ivjFooter = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLastUpdatedTime = null;
        simpleDateFormat = null;
        ivjJButton2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel3 = null;
        ivjJPanel4 = null;
        ivjJPanel4FlowLayout = null;
        ivjJPanel5 = null;
        ivjJSeparator1 = null;
        ivjLogDlg = null;
        ivjLogFile = null;
        ivjLoggingEnabled = null;
        logFileWriter = null;
        loggingEnabled = false;
        ivjLogButton = null;
        initialize();
    }

    public QStatsDlg(Dialog dialog)
    {
        super(dialog);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjQStatsTable = null;
        qManagerModel = null;
        ivjInterval = null;
        ivjJLabel1 = null;
        ivjStart = null;
        ivjStop = null;
        ivjEventHandler = new IvjEventHandler();
        timer = null;
        flashTimer = null;
        agent = null;
        qStatsSettings = null;
        redBall = null;
        ivjJPanel3 = null;
        ivjJPanel3FlowLayout = null;
        ivjFooter = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLastUpdatedTime = null;
        simpleDateFormat = null;
        ivjJButton2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel3 = null;
        ivjJPanel4 = null;
        ivjJPanel4FlowLayout = null;
        ivjJPanel5 = null;
        ivjJSeparator1 = null;
        ivjLogDlg = null;
        ivjLogFile = null;
        ivjLoggingEnabled = null;
        logFileWriter = null;
        loggingEnabled = false;
        ivjLogButton = null;
    }

    public QStatsDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjQStatsTable = null;
        qManagerModel = null;
        ivjInterval = null;
        ivjJLabel1 = null;
        ivjStart = null;
        ivjStop = null;
        ivjEventHandler = new IvjEventHandler();
        timer = null;
        flashTimer = null;
        agent = null;
        qStatsSettings = null;
        redBall = null;
        ivjJPanel3 = null;
        ivjJPanel3FlowLayout = null;
        ivjFooter = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLastUpdatedTime = null;
        simpleDateFormat = null;
        ivjJButton2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel3 = null;
        ivjJPanel4 = null;
        ivjJPanel4FlowLayout = null;
        ivjJPanel5 = null;
        ivjJSeparator1 = null;
        ivjLogDlg = null;
        ivjLogFile = null;
        ivjLoggingEnabled = null;
        logFileWriter = null;
        loggingEnabled = false;
        ivjLogButton = null;
    }

    public QStatsDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjQStatsTable = null;
        qManagerModel = null;
        ivjInterval = null;
        ivjJLabel1 = null;
        ivjStart = null;
        ivjStop = null;
        ivjEventHandler = new IvjEventHandler();
        timer = null;
        flashTimer = null;
        agent = null;
        qStatsSettings = null;
        redBall = null;
        ivjJPanel3 = null;
        ivjJPanel3FlowLayout = null;
        ivjFooter = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLastUpdatedTime = null;
        simpleDateFormat = null;
        ivjJButton2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel3 = null;
        ivjJPanel4 = null;
        ivjJPanel4FlowLayout = null;
        ivjJPanel5 = null;
        ivjJSeparator1 = null;
        ivjLogDlg = null;
        ivjLogFile = null;
        ivjLoggingEnabled = null;
        logFileWriter = null;
        loggingEnabled = false;
        ivjLogButton = null;
    }

    public QStatsDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjQStatsTable = null;
        qManagerModel = null;
        ivjInterval = null;
        ivjJLabel1 = null;
        ivjStart = null;
        ivjStop = null;
        ivjEventHandler = new IvjEventHandler();
        timer = null;
        flashTimer = null;
        agent = null;
        qStatsSettings = null;
        redBall = null;
        ivjJPanel3 = null;
        ivjJPanel3FlowLayout = null;
        ivjFooter = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLastUpdatedTime = null;
        simpleDateFormat = null;
        ivjJButton2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel3 = null;
        ivjJPanel4 = null;
        ivjJPanel4FlowLayout = null;
        ivjJPanel5 = null;
        ivjJSeparator1 = null;
        ivjLogDlg = null;
        ivjLogFile = null;
        ivjLoggingEnabled = null;
        logFileWriter = null;
        loggingEnabled = false;
        ivjLogButton = null;
    }

    public QStatsDlg(Frame frame)
    {
        super(frame);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjQStatsTable = null;
        qManagerModel = null;
        ivjInterval = null;
        ivjJLabel1 = null;
        ivjStart = null;
        ivjStop = null;
        ivjEventHandler = new IvjEventHandler();
        timer = null;
        flashTimer = null;
        agent = null;
        qStatsSettings = null;
        redBall = null;
        ivjJPanel3 = null;
        ivjJPanel3FlowLayout = null;
        ivjFooter = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLastUpdatedTime = null;
        simpleDateFormat = null;
        ivjJButton2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel3 = null;
        ivjJPanel4 = null;
        ivjJPanel4FlowLayout = null;
        ivjJPanel5 = null;
        ivjJSeparator1 = null;
        ivjLogDlg = null;
        ivjLogFile = null;
        ivjLoggingEnabled = null;
        logFileWriter = null;
        loggingEnabled = false;
        ivjLogButton = null;
        initialize();
    }

    public QStatsDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjQStatsTable = null;
        qManagerModel = null;
        ivjInterval = null;
        ivjJLabel1 = null;
        ivjStart = null;
        ivjStop = null;
        ivjEventHandler = new IvjEventHandler();
        timer = null;
        flashTimer = null;
        agent = null;
        qStatsSettings = null;
        redBall = null;
        ivjJPanel3 = null;
        ivjJPanel3FlowLayout = null;
        ivjFooter = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLastUpdatedTime = null;
        simpleDateFormat = null;
        ivjJButton2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel3 = null;
        ivjJPanel4 = null;
        ivjJPanel4FlowLayout = null;
        ivjJPanel5 = null;
        ivjJSeparator1 = null;
        ivjLogDlg = null;
        ivjLogFile = null;
        ivjLoggingEnabled = null;
        logFileWriter = null;
        loggingEnabled = false;
        ivjLogButton = null;
    }

    public QStatsDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjQStatsTable = null;
        qManagerModel = null;
        ivjInterval = null;
        ivjJLabel1 = null;
        ivjStart = null;
        ivjStop = null;
        ivjEventHandler = new IvjEventHandler();
        timer = null;
        flashTimer = null;
        agent = null;
        qStatsSettings = null;
        redBall = null;
        ivjJPanel3 = null;
        ivjJPanel3FlowLayout = null;
        ivjFooter = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLastUpdatedTime = null;
        simpleDateFormat = null;
        ivjJButton2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel3 = null;
        ivjJPanel4 = null;
        ivjJPanel4FlowLayout = null;
        ivjJPanel5 = null;
        ivjJSeparator1 = null;
        ivjLogDlg = null;
        ivjLogFile = null;
        ivjLoggingEnabled = null;
        logFileWriter = null;
        loggingEnabled = false;
        ivjLogButton = null;
    }

    public QStatsDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjClose = null;
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjQStatsTable = null;
        qManagerModel = null;
        ivjInterval = null;
        ivjJLabel1 = null;
        ivjStart = null;
        ivjStop = null;
        ivjEventHandler = new IvjEventHandler();
        timer = null;
        flashTimer = null;
        agent = null;
        qStatsSettings = null;
        redBall = null;
        ivjJPanel3 = null;
        ivjJPanel3FlowLayout = null;
        ivjFooter = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLastUpdatedTime = null;
        simpleDateFormat = null;
        ivjJButton2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel3 = null;
        ivjJPanel4 = null;
        ivjJPanel4FlowLayout = null;
        ivjJPanel5 = null;
        ivjJSeparator1 = null;
        ivjLogDlg = null;
        ivjLogFile = null;
        ivjLoggingEnabled = null;
        logFileWriter = null;
        loggingEnabled = false;
        ivjLogButton = null;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        if(actionevent.getSource() == timer)
            updateStats();
        else
            getStop().setIcon(redBall);
    }

    public void close()
    {
        stop();
        if(qStatsSettings != null)
        {
            qStatsSettings.dimensions = getSize();
            qStatsSettings.loggingEnabled = getLoggingEnabled().isSelected();
            qStatsSettings.fileName = getLogFile().getText();
        }
        dispose();
    }

    public void closeLogSettings()
    {
        loggingEnabled = getLoggingEnabled().isSelected();
        getLogDlg().dispose();
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            start();
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
            stop();
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
            close();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(ComponentEvent componentevent)
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

    private void connEtoC5()
    {
        try
        {
            closeLogSettings();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(ActionEvent actionevent)
    {
        try
        {
            displayLogSettings();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC7(WindowEvent windowevent)
    {
        try
        {
            closeLogSettings();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC8(WindowEvent windowevent)
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

    private void connEtoM1(ItemEvent itemevent)
    {
        try
        {
            getLogFile().setEnabled(getLoggingEnabled().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public void displayLogSettings()
    {
        getLogDlg().pack();
        SwingUtils.setCenter(this, getLogDlg());
        getLogDlg().show();
        qStatsSettings.loggingEnabled = loggingEnabled;
        qStatsSettings.fileName = getLogFile().getText().trim();
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

    private JPanel getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new JPanel();
                ivjFooter.setName("Footer");
                ivjFooter.setLayout(new BorderLayout());
                getFooter().add(getJPanel1(), "East");
                getFooter().add(getJPanel2(), "West");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
    }

    private NumericTextField getInterval()
    {
        if(ivjInterval == null)
            try
            {
                ivjInterval = new NumericTextField();
                ivjInterval.setName("Interval");
                ivjInterval.setToolTipText("Interval between refreshes in seconds");
                ivjInterval.setText("3");
                ivjInterval.setColumns(4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInterval;
    }

    private JButton getJButton2()
    {
        if(ivjJButton2 == null)
            try
            {
                ivjJButton2 = new JButton();
                ivjJButton2.setName("JButton2");
                ivjJButton2.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton2;
    }

    private JPanel getJDialogContentPane()
    {
        if(ivjJDialogContentPane == null)
            try
            {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setPreferredSize(new Dimension(528, 350));
                ivjJDialogContentPane.setLayout(new GridBagLayout());
                ivjJDialogContentPane.setBackground(SystemColor.window);
                ivjJDialogContentPane.setMinimumSize(new Dimension(528, 350));
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.anchor = 11;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                getJDialogContentPane().add(getJScrollPane1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.gridwidth = 0;
                gridbagconstraints1.gridheight = 0;
                gridbagconstraints1.fill = 1;
                getJDialogContentPane().add(getFooter(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JPanel getJDialogContentPane1()
    {
        if(ivjJDialogContentPane1 == null)
            try
            {
                ivjJDialogContentPane1 = new JPanel();
                ivjJDialogContentPane1.setName("JDialogContentPane1");
                ivjJDialogContentPane1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                getJDialogContentPane1().add(getJPanel4(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane1().add(getJSeparator1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane1().add(getJPanel5(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane1;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Interval:");
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
                ivjJLabel2.setText("Last Updated:");
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
                ivjJLabel3.setText("Log File:");
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
                ivjJPanel1.setLayout(new FlowLayout());
                ivjJPanel1.add(getJPanel3());
                ivjJPanel1.add(getStart());
                ivjJPanel1.add(getStop());
                getJPanel1().add(getClose(), getClose().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JPanel getJPanel2()
    {
        if(ivjJPanel2 == null)
            try
            {
                ivjJPanel2 = new JPanel();
                ivjJPanel2.setName("JPanel2");
                ivjJPanel2.setPreferredSize(new Dimension(168, 24));
                ivjJPanel2.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 1;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(0, 5, 5, 0);
                getJPanel2().add(getJLabel2(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 1;
                getJPanel2().add(getLastUpdatedTime(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.gridheight = 2;
                gridbagconstraints2.insets = new Insets(4, 5, 4, 4);
                getJPanel2().add(getLogButton(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
    }

    private JPanel getJPanel3()
    {
        if(ivjJPanel3 == null)
            try
            {
                ivjJPanel3 = new JPanel();
                ivjJPanel3.setName("JPanel3");
                ivjJPanel3.setLayout(getJPanel3FlowLayout());
                getJPanel3().add(getJLabel1(), getJLabel1().getName());
                getJPanel3().add(getInterval(), getInterval().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel3;
    }

    private FlowLayout getJPanel3FlowLayout()
    {
        FlowLayout flowlayout = null;
        try
        {
            flowlayout = new FlowLayout();
            flowlayout.setAlignment(1);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return flowlayout;
    }

    private JPanel getJPanel4()
    {
        if(ivjJPanel4 == null)
            try
            {
                ivjJPanel4 = new JPanel();
                ivjJPanel4.setName("JPanel4");
                ivjJPanel4.setLayout(getJPanel4FlowLayout());
                getJPanel4().add(getJButton2(), getJButton2().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel4;
    }

    private FlowLayout getJPanel4FlowLayout()
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

    private JPanel getJPanel5()
    {
        if(ivjJPanel5 == null)
            try
            {
                ivjJPanel5 = new JPanel();
                ivjJPanel5.setName("JPanel5");
                ivjJPanel5.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel5().add(getLoggingEnabled(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel5().add(getJLabel3(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel5().add(getLogFile(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel5;
    }

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                ivjJScrollPane1.setVerticalScrollBarPolicy(22);
                ivjJScrollPane1.setHorizontalScrollBarPolicy(32);
                getJScrollPane1().setViewportView(getQStatsTable());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
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

    private JLabel getLastUpdatedTime()
    {
        if(ivjLastUpdatedTime == null)
            try
            {
                ivjLastUpdatedTime = new JLabel();
                ivjLastUpdatedTime.setName("LastUpdatedTime");
                ivjLastUpdatedTime.setText("00:00:00");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLastUpdatedTime;
    }

    private JButton getLogButton()
    {
        if(ivjLogButton == null)
            try
            {
                ivjLogButton = new JButton();
                ivjLogButton.setName("LogButton");
                ivjLogButton.setText("Log...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLogButton;
    }

    private JDialog getLogDlg()
    {
        if(ivjLogDlg == null)
            try
            {
                ivjLogDlg = new JDialog();
                ivjLogDlg.setName("LogDlg");
                ivjLogDlg.setDefaultCloseOperation(0);
                ivjLogDlg.setTitle("Log Settings");
                ivjLogDlg.setBounds(86, 404, 530, 240);
                ivjLogDlg.setModal(true);
                ivjLogDlg.setResizable(false);
                getLogDlg().setContentPane(getJDialogContentPane1());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLogDlg;
    }

    private JTextField getLogFile()
    {
        if(ivjLogFile == null)
            try
            {
                ivjLogFile = new JTextField();
                ivjLogFile.setName("LogFile");
                ivjLogFile.setEnabled(false);
                ivjLogFile.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLogFile;
    }

    private JCheckBox getLoggingEnabled()
    {
        if(ivjLoggingEnabled == null)
            try
            {
                ivjLoggingEnabled = new JCheckBox();
                ivjLoggingEnabled.setName("LoggingEnabled");
                ivjLoggingEnabled.setText("Logging Enabled");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLoggingEnabled;
    }

    private JTable getQStatsTable()
    {
        if(ivjQStatsTable == null)
            try
            {
                ivjQStatsTable = new JTable();
                ivjQStatsTable.setName("QStatsTable");
                getJScrollPane1().setColumnHeaderView(ivjQStatsTable.getTableHeader());
                getJScrollPane1().getViewport().setBackingStoreEnabled(true);
                ivjQStatsTable.setModel(new QStatsTableModel());
                ivjQStatsTable.setBounds(0, 0, 200, 200);
                ivjQStatsTable.setShowVerticalLines(false);
                ivjQStatsTable.setRowSelectionAllowed(true);
                ivjQStatsTable.setDefaultRenderer(com.kolban.mqjexplorer.guibeans.QFullBar.class, new QFullBarTableRenderer());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjQStatsTable;
    }

    private JButton getStart()
    {
        if(ivjStart == null)
            try
            {
                ivjStart = new JButton();
                ivjStart.setName("Start");
                ivjStart.setIcon(new ImageIcon(this.getClass().getResource("/icons/buttonicons/GreenCircle.gif")));
                ivjStart.setToolTipText("Start displaying statistics");
                ivjStart.setText("Start");
                ivjStart.setHorizontalTextPosition(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStart;
    }

    private JButton getStop()
    {
        if(ivjStop == null)
            try
            {
                ivjStop = new JButton();
                ivjStop.setName("Stop");
                ivjStop.setToolTipText("Stop displaying statistics");
                ivjStop.setText("Stop");
                ivjStop.setHorizontalTextPosition(2);
                ivjStop.setIcon(new ImageIcon(getClass().getResource("/icons/buttonicons/RedCircle.gif")));
                ivjStop.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStop;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void handleResized(ComponentEvent componentevent)
    {
        SwingUtils.constrainResize(componentevent);
    }

    private void initConnections()
        throws Exception
    {
        getStart().addActionListener(ivjEventHandler);
        getStop().addActionListener(ivjEventHandler);
        getClose().addActionListener(ivjEventHandler);
        addComponentListener(ivjEventHandler);
        getJButton2().addActionListener(ivjEventHandler);
        getLogButton().addActionListener(ivjEventHandler);
        getLogDlg().addWindowListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
        getLoggingEnabled().addItemListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            redBall = new ImageIcon(getClass().getResource("/icons/buttonicons/RedCircle.gif"));
            yellowBall = new ImageIcon(getClass().getResource("/icons/buttonicons/YellowCircle.gif"));
            timer = new Timer(1000, this);
            timer.setRepeats(true);
            timer.setInitialDelay(0);
            flashTimer = new Timer(250, this);
            flashTimer.setRepeats(false);
            flashTimer.setInitialDelay(250);
            getRootPane().setDefaultButton(getClose());
            simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            setName("QStatsDlg");
            setDefaultCloseOperation(0);
            setSize(590, 240);
            setModal(false);
            setTitle("Queue Statistics");
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
            QStatsDlg qstatsdlg = new QStatsDlg();
            qstatsdlg.setModal(true);
            qstatsdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            qstatsdlg.show();
            Insets insets = qstatsdlg.getInsets();
            qstatsdlg.setSize(qstatsdlg.getWidth() + insets.left + insets.right, qstatsdlg.getHeight() + insets.top + insets.bottom);
            qstatsdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void setData()
    {
        QStatsTableModel qstatstablemodel = (QStatsTableModel)getQStatsTable().getModel();
        qstatstablemodel.setData(qManagerModel);
    }

    public void setQStatsSettings(com.kolban.mqjexplorer.Profile.QStatsSettings qstatssettings)
    {
        qStatsSettings = qstatssettings;
        if(qStatsSettings != null)
        {
            setSize(qStatsSettings.dimensions);
            getLoggingEnabled().setSelected(qStatsSettings.loggingEnabled);
            loggingEnabled = qStatsSettings.loggingEnabled;
            getLogFile().setText(qStatsSettings.fileName);
        }
    }

    public void setQueueManager(QueueManagerModel queuemanagermodel)
    {
        qManagerModel = queuemanagermodel;
        try
        {
            agent = new PCFMessageAgent(queuemanagermodel.getNewQueueManager());
            setData();
        }
        catch(MQException _ex) { }
    }

    public void start()
    {
        int i = Integer.parseInt(getInterval().getText());
        if(i == 0)
            return;
        getStart().setEnabled(false);
        getStop().setEnabled(true);
        getInterval().setEnabled(false);
        getLogButton().setEnabled(false);
        timer.setDelay(i * 1000);
        if(getLoggingEnabled().isSelected())
        {
            TableModel tablemodel = getQStatsTable().getModel();
            int j = tablemodel.getRowCount();
            try
            {
                logFileWriter = new PrintWriter(new FileWriter(getLogFile().getText()));
                String s = "Time";
                for(int k = 0; k < j; k++)
                    s = s + "," + tablemodel.getValueAt(k, 0);

                logFileWriter.println(s);
            }
            catch(Exception _ex) { }
        }
        timer.start();
    }

    public void stop()
    {
        if(logFileWriter != null)
        {
            try
            {
                logFileWriter.close();
            }
            catch(Exception _ex) { }
            logFileWriter = null;
        }
        timer.stop();
        flashTimer.stop();
        getStop().setIcon(redBall);
        getStart().setEnabled(true);
        getStop().setEnabled(false);
        getInterval().setEnabled(true);
        getLogButton().setEnabled(true);
    }

    private void updateStats()
    {
        String s = "";
        boolean flag = loggingEnabled & (logFileWriter != null);
        QStatsTableModel qstatstablemodel = (QStatsTableModel)getQStatsTable().getModel();
        int i = qstatstablemodel.getRowCount();
        if(flag)
            s = simpleDateFormat.format(new Date());
        try
        {
            PCFMessage pcfmessage = new PCFMessage(17);
            for(int j = 0; j < i; j++)
            {
                String s1 = (String)qstatstablemodel.getValueAt(j, 0);
                pcfmessage.initialize(17);
                pcfmessage.addParameter(2016, s1);
                try
                {
                    PCFMessage apcfmessage[] = agent.send(pcfmessage);
                    int k = apcfmessage[0].getIntParameterValue(35);
                    int l = apcfmessage[0].getIntParameterValue(36);
                    if(k > 0)
                    {
                        int i1 = apcfmessage[0].getIntParameterValue(37);
                        int j1 = apcfmessage[0].getIntParameterValue(38);
                        qstatstablemodel.setValueAt(new Integer(i1 / k), j, 1);
                        qstatstablemodel.setValueAt(new Integer(j1 / k), j, 2);
                        qstatstablemodel.setValueAt(new Integer(l), j, 3);
                        qstatstablemodel.setValueAt(new Integer((i1 - j1) / k), j, 4);
                        QFullBar qfullbar = (QFullBar)qstatstablemodel.getValueAt(j, 5);
                        qfullbar.qDepth = l;
                    }
                    if(flag)
                        s = s + "," + l;
                }
                catch(Exception _ex)
                {
                    qstatstablemodel.setValueAt("N/A", j, 1);
                    qstatstablemodel.setValueAt("N/A", j, 2);
                    qstatstablemodel.setValueAt("N/A", j, 3);
                    qstatstablemodel.setValueAt("N/A", j, 4);
                    if(flag)
                        s = s + ",NA";
                }
            }

            if(flag)
                logFileWriter.println(s);
            qstatstablemodel.fireTableDataChanged();
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        getLastUpdatedTime().setText(simpleDateFormat.format(new Date()));
        getStop().setIcon(yellowBall);
        flashTimer.setDelay(250);
        flashTimer.restart();
    }

    private JButton ivjClose;
    private JPanel ivjJDialogContentPane;
    private JScrollPane ivjJScrollPane1;
    private JTable ivjQStatsTable;
    private QueueManagerModel qManagerModel;
    private NumericTextField ivjInterval;
    private JLabel ivjJLabel1;
    private JButton ivjStart;
    private JButton ivjStop;
    IvjEventHandler ivjEventHandler;
    private Timer timer;
    private Timer flashTimer;
    private PCFMessageAgent agent;
    private com.kolban.mqjexplorer.Profile.QStatsSettings qStatsSettings;
    private ImageIcon redBall;
    private ImageIcon yellowBall;
    private JPanel ivjJPanel3;
    private FlowLayout ivjJPanel3FlowLayout;
    private JPanel ivjFooter;
    private JLabel ivjJLabel2;
    private JPanel ivjJPanel1;
    private JPanel ivjJPanel2;
    private JLabel ivjLastUpdatedTime;
    private SimpleDateFormat simpleDateFormat;
    private JButton ivjJButton2;
    private JPanel ivjJDialogContentPane1;
    private JLabel ivjJLabel3;
    private JPanel ivjJPanel4;
    private FlowLayout ivjJPanel4FlowLayout;
    private JPanel ivjJPanel5;
    private JSeparator ivjJSeparator1;
    private JDialog ivjLogDlg;
    private JTextField ivjLogFile;
    private JCheckBox ivjLoggingEnabled;
    private PrintWriter logFileWriter;
    private boolean loggingEnabled;
    private JButton ivjLogButton;
















}
