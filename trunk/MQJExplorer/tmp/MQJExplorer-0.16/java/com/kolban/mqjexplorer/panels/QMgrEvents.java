// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QMgrEvents.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QMgrEvents extends JPanel
{

    public QMgrEvents()
    {
        ivjAuthorityEvent = null;
        ivjInhibitEvent = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjPerformanceEvent = null;
        ivjRemoteEvent = null;
        ivjStartStopEvent = null;
        ivjLocalEvent = null;
        initialize();
    }

    public QMgrEvents(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjAuthorityEvent = null;
        ivjInhibitEvent = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjPerformanceEvent = null;
        ivjRemoteEvent = null;
        ivjStartStopEvent = null;
        ivjLocalEvent = null;
    }

    public QMgrEvents(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjAuthorityEvent = null;
        ivjInhibitEvent = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjPerformanceEvent = null;
        ivjRemoteEvent = null;
        ivjStartStopEvent = null;
        ivjLocalEvent = null;
    }

    public QMgrEvents(boolean flag)
    {
        super(flag);
        ivjAuthorityEvent = null;
        ivjInhibitEvent = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJPanel1 = null;
        ivjPerformanceEvent = null;
        ivjRemoteEvent = null;
        ivjStartStopEvent = null;
        ivjLocalEvent = null;
    }

    public int authorityEventGetValue()
    {
        return getAuthorityEvent().getValue();
    }

    public void authorityEventSetValue(int i)
    {
        getAuthorityEvent().setValue(i);
    }

    private AuthorityEvent getAuthorityEvent()
    {
        if(ivjAuthorityEvent == null)
            try
            {
                ivjAuthorityEvent = new AuthorityEvent();
                ivjAuthorityEvent.setName("AuthorityEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAuthorityEvent;
    }

    private InhibitEvent getInhibitEvent()
    {
        if(ivjInhibitEvent == null)
            try
            {
                ivjInhibitEvent = new InhibitEvent();
                ivjInhibitEvent.setName("InhibitEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInhibitEvent;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Authority Events:");
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
                ivjJLabel2.setText("Inhibit Events:");
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
                ivjJLabel3.setText("Local Events:");
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
                ivjJLabel4.setText("Remote Events:");
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
                ivjJLabel5.setText("Start/Stop Events:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel5;
    }

    private JLabel getJLabel6()
    {
        if(ivjJLabel6 == null)
            try
            {
                ivjJLabel6 = new JLabel();
                ivjJLabel6.setName("JLabel6");
                ivjJLabel6.setText("Performance Events:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel6;
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

    private LocalEvent getLocalEvent()
    {
        if(ivjLocalEvent == null)
            try
            {
                ivjLocalEvent = new LocalEvent();
                ivjLocalEvent.setName("LocalEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLocalEvent;
    }

    private PerformanceEvent getPerformanceEvent()
    {
        if(ivjPerformanceEvent == null)
            try
            {
                ivjPerformanceEvent = new PerformanceEvent();
                ivjPerformanceEvent.setName("PerformanceEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPerformanceEvent;
    }

    private RemoteEvent getRemoteEvent()
    {
        if(ivjRemoteEvent == null)
            try
            {
                ivjRemoteEvent = new RemoteEvent();
                ivjRemoteEvent.setName("RemoteEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRemoteEvent;
    }

    private StartStopEvent getStartStopEvent()
    {
        if(ivjStartStopEvent == null)
            try
            {
                ivjStartStopEvent = new StartStopEvent();
                ivjStartStopEvent.setName("StartStopEvent");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjStartStopEvent;
    }

    private void handleException(Throwable throwable)
    {
    }

    public int inhibitEventGetValue()
    {
        return getInhibitEvent().getValue();
    }

    public void inhibitEventSetValue(int i)
    {
        getInhibitEvent().setValue(i);
    }

    private void initialize()
    {
        try
        {
            setName("QMgrEvents");
            setLayout(new GridBagLayout());
            setSize(255, 269);
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
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 4;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 5;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getJLabel6(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 0;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getAuthorityEvent(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 1;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getInhibitEvent(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 3;
            gridbagconstraints8.fill = 2;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getRemoteEvent(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 4;
            gridbagconstraints9.fill = 2;
            gridbagconstraints9.weightx = 1.0D;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getStartStopEvent(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 5;
            gridbagconstraints10.fill = 2;
            gridbagconstraints10.weightx = 1.0D;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getPerformanceEvent(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 0;
            gridbagconstraints11.gridy = 6;
            gridbagconstraints11.gridwidth = 2;
            gridbagconstraints11.fill = 1;
            gridbagconstraints11.weightx = 1.0D;
            gridbagconstraints11.weighty = 1.0D;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 1;
            gridbagconstraints12.gridy = 2;
            gridbagconstraints12.fill = 2;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getLocalEvent(), gridbagconstraints12);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public int localEventGetValue()
    {
        return getLocalEvent().getValue();
    }

    public void localEventSetValue(int i)
    {
        getLocalEvent().setValue(i);
    }

    public static void main(String args[])
    {
        try
        {
            JFrame jframe = new JFrame();
            QMgrEvents qmgrevents = new QMgrEvents();
            jframe.setContentPane(qmgrevents);
            jframe.setSize(qmgrevents.getSize());
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

    public int performanceEventGetValue()
    {
        return getPerformanceEvent().getValue();
    }

    public void performanceEventSetValue(int i)
    {
        getPerformanceEvent().setValue(i);
    }

    public int remoteEventGetValue()
    {
        return getRemoteEvent().getValue();
    }

    public void remoteEventSetValue(int i)
    {
        getRemoteEvent().setValue(i);
    }

    public int startStopEventGetValue()
    {
        return getStartStopEvent().getValue();
    }

    public void startStopEventSetValue(int i)
    {
        getStartStopEvent().setValue(i);
    }

    private AuthorityEvent ivjAuthorityEvent;
    private InhibitEvent ivjInhibitEvent;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JPanel ivjJPanel1;
    private PerformanceEvent ivjPerformanceEvent;
    private RemoteEvent ivjRemoteEvent;
    private StartStopEvent ivjStartStopEvent;
    private LocalEvent ivjLocalEvent;
}
