// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseReport.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class BrowseReport extends JPanel
{

    public BrowseReport()
    {
        ivjFeedbackCode = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel9 = null;
        ivjOriginalLength = null;
        ivjReport = null;
        ivjCOALabel = null;
        ivjCODLabel = null;
        ivjDiscardLabel = null;
        ivjExceptionLabel = null;
        ivjExpirationLabel = null;
        ivjNANLabel = null;
        ivjPANLabel = null;
        ivjJPanel1 = null;
        initialize();
    }

    public BrowseReport(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjFeedbackCode = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel9 = null;
        ivjOriginalLength = null;
        ivjReport = null;
        ivjCOALabel = null;
        ivjCODLabel = null;
        ivjDiscardLabel = null;
        ivjExceptionLabel = null;
        ivjExpirationLabel = null;
        ivjNANLabel = null;
        ivjPANLabel = null;
        ivjJPanel1 = null;
    }

    public BrowseReport(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjFeedbackCode = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel9 = null;
        ivjOriginalLength = null;
        ivjReport = null;
        ivjCOALabel = null;
        ivjCODLabel = null;
        ivjDiscardLabel = null;
        ivjExceptionLabel = null;
        ivjExpirationLabel = null;
        ivjNANLabel = null;
        ivjPANLabel = null;
        ivjJPanel1 = null;
    }

    public BrowseReport(boolean flag)
    {
        super(flag);
        ivjFeedbackCode = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel9 = null;
        ivjOriginalLength = null;
        ivjReport = null;
        ivjCOALabel = null;
        ivjCODLabel = null;
        ivjDiscardLabel = null;
        ivjExceptionLabel = null;
        ivjExpirationLabel = null;
        ivjNANLabel = null;
        ivjPANLabel = null;
        ivjJPanel1 = null;
    }

    private JLabel getCOALabel()
    {
        if(ivjCOALabel == null)
            try
            {
                ivjCOALabel = new JLabel();
                ivjCOALabel.setName("COALabel");
                ivjCOALabel.setIcon(new ImageIcon(getClass().getResource("/icons/bullet_red.gif")));
                ivjCOALabel.setIconTextGap(8);
                ivjCOALabel.setText("Confirmation-on-arrival reports required");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCOALabel;
    }

    private JLabel getCODLabel()
    {
        if(ivjCODLabel == null)
            try
            {
                ivjCODLabel = new JLabel();
                ivjCODLabel.setName("CODLabel");
                ivjCODLabel.setIcon(new ImageIcon(getClass().getResource("/icons/bullet_red.gif")));
                ivjCODLabel.setIconTextGap(8);
                ivjCODLabel.setText("Confirmation-on-delivery reports required");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCODLabel;
    }

    private JLabel getDiscardLabel()
    {
        if(ivjDiscardLabel == null)
            try
            {
                ivjDiscardLabel = new JLabel();
                ivjDiscardLabel.setName("DiscardLabel");
                ivjDiscardLabel.setIcon(new ImageIcon(getClass().getResource("/icons/bullet_red.gif")));
                ivjDiscardLabel.setIconTextGap(8);
                ivjDiscardLabel.setText("Discard message on non-delivery");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDiscardLabel;
    }

    private JLabel getExceptionLabel()
    {
        if(ivjExceptionLabel == null)
            try
            {
                ivjExceptionLabel = new JLabel();
                ivjExceptionLabel.setName("ExceptionLabel");
                ivjExceptionLabel.setIcon(new ImageIcon(getClass().getResource("/icons/bullet_red.gif")));
                ivjExceptionLabel.setIconTextGap(8);
                ivjExceptionLabel.setText("Exception reports required");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExceptionLabel;
    }

    private JLabel getExpirationLabel()
    {
        if(ivjExpirationLabel == null)
            try
            {
                ivjExpirationLabel = new JLabel();
                ivjExpirationLabel.setName("ExpirationLabel");
                ivjExpirationLabel.setIcon(new ImageIcon(getClass().getResource("/icons/bullet_red.gif")));
                ivjExpirationLabel.setIconTextGap(8);
                ivjExpirationLabel.setText("Expiration reports required");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExpirationLabel;
    }

    private JTextField getFeedbackCode()
    {
        if(ivjFeedbackCode == null)
            try
            {
                ivjFeedbackCode = new JTextField();
                ivjFeedbackCode.setName("FeedbackCode");
                ivjFeedbackCode.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFeedbackCode;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Report:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private JLabel getJLabel10()
    {
        if(ivjJLabel10 == null)
            try
            {
                ivjJLabel10 = new JLabel();
                ivjJLabel10.setName("JLabel10");
                ivjJLabel10.setText("Original Length:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel10;
    }

    private JLabel getJLabel9()
    {
        if(ivjJLabel9 == null)
            try
            {
                ivjJLabel9 = new JLabel();
                ivjJLabel9.setName("JLabel9");
                ivjJLabel9.setText("Feedback code:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel9;
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

    private JLabel getNANLabel()
    {
        if(ivjNANLabel == null)
            try
            {
                ivjNANLabel = new JLabel();
                ivjNANLabel.setName("NANLabel");
                ivjNANLabel.setIcon(new ImageIcon(getClass().getResource("/icons/bullet_red.gif")));
                ivjNANLabel.setIconTextGap(8);
                ivjNANLabel.setText("Negative action notification reports required");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNANLabel;
    }

    private JTextField getOriginalLength()
    {
        if(ivjOriginalLength == null)
            try
            {
                ivjOriginalLength = new JTextField();
                ivjOriginalLength.setName("OriginalLength");
                ivjOriginalLength.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOriginalLength;
    }

    private JLabel getPANLabel()
    {
        if(ivjPANLabel == null)
            try
            {
                ivjPANLabel = new JLabel();
                ivjPANLabel.setName("PANLabel");
                ivjPANLabel.setIcon(new ImageIcon(getClass().getResource("/icons/bullet_red.gif")));
                ivjPANLabel.setIconTextGap(8);
                ivjPANLabel.setText("Positive action notification reports required");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPANLabel;
    }

    private JTextField getReport()
    {
        if(ivjReport == null)
            try
            {
                ivjReport = new JTextField();
                ivjReport.setName("Report");
                ivjReport.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReport;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("BrowseReport");
            setLayout(new GridBagLayout());
            setSize(292, 301);
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
            add(getReport(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 1;
            gridbagconstraints2.gridwidth = 2;
            gridbagconstraints2.fill = 2;
            gridbagconstraints2.anchor = 17;
            gridbagconstraints2.weightx = 1.0D;
            gridbagconstraints2.insets = new Insets(4, 8, 4, 4);
            add(getPANLabel(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 2;
            gridbagconstraints3.gridwidth = 2;
            gridbagconstraints3.fill = 2;
            gridbagconstraints3.anchor = 17;
            gridbagconstraints3.weightx = 1.0D;
            gridbagconstraints3.insets = new Insets(4, 8, 4, 4);
            add(getNANLabel(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 3;
            gridbagconstraints4.gridwidth = 2;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 8, 4, 4);
            add(getCOALabel(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 4;
            gridbagconstraints5.gridwidth = 2;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 8, 4, 4);
            add(getCODLabel(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 5;
            gridbagconstraints6.gridwidth = 2;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 8, 4, 4);
            add(getExpirationLabel(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 0;
            gridbagconstraints7.gridy = 6;
            gridbagconstraints7.gridwidth = 2;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.anchor = 17;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 8, 4, 4);
            add(getExceptionLabel(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 7;
            gridbagconstraints8.gridwidth = 2;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.anchor = 17;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 8, 4, 4);
            add(getDiscardLabel(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 0;
            gridbagconstraints9.gridy = 8;
            gridbagconstraints9.anchor = 17;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getJLabel9(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 0;
            gridbagconstraints10.gridy = 9;
            gridbagconstraints10.anchor = 17;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getJLabel10(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 8;
            gridbagconstraints11.fill = 2;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getFeedbackCode(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 9;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getOriginalLength(), gridbagconstraints12);
            GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
            gridbagconstraints13.gridx = 0;
            gridbagconstraints13.gridy = 10;
            gridbagconstraints13.gridwidth = 2;
            gridbagconstraints13.fill = 1;
            gridbagconstraints13.weightx = 1.0D;
            gridbagconstraints13.weighty = 1.0D;
            gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints13);
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
            BrowseReport browsereport = new BrowseReport();
            jframe.setContentPane(browsereport);
            jframe.setSize(browsereport.getSize());
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
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/icons/bullet_green.gif"));
        if((((MQMD) (mqmessage)).report & 0x1000000) != 0)
            getExceptionLabel().setIcon(imageicon);
        if((((MQMD) (mqmessage)).report & 0x200000) != 0)
            getExpirationLabel().setIcon(imageicon);
        if((((MQMD) (mqmessage)).report & 0x8000000) != 0)
            getDiscardLabel().setIcon(imageicon);
        if((((MQMD) (mqmessage)).report & 2) != 0)
            getNANLabel().setIcon(imageicon);
        if((((MQMD) (mqmessage)).report & 1) != 0)
            getPANLabel().setIcon(imageicon);
        if((((MQMD) (mqmessage)).report & 0x800) != 0)
            getCODLabel().setIcon(imageicon);
        if((((MQMD) (mqmessage)).report & 0x100) != 0)
            getCOALabel().setIcon(imageicon);
        getReport().setText(Integer.toString(((MQMD) (mqmessage)).report));
        getFeedbackCode().setText(Integer.toString(((MQMD) (mqmessage)).feedback));
        try
        {
            if(((MQMD) (mqmessage)).originalLength == -1)
                getOriginalLength().setText("Undefined");
            else
                getOriginalLength().setText(Integer.toString(((MQMD) (mqmessage)).originalLength));
        }
        catch(Exception _ex) { }
    }

    private JTextField ivjFeedbackCode;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel10;
    private JLabel ivjJLabel9;
    private JTextField ivjOriginalLength;
    private JTextField ivjReport;
    private JLabel ivjCOALabel;
    private JLabel ivjCODLabel;
    private JLabel ivjDiscardLabel;
    private JLabel ivjExceptionLabel;
    private JLabel ivjExpirationLabel;
    private JLabel ivjNANLabel;
    private JLabel ivjPANLabel;
    private JPanel ivjJPanel1;
}
