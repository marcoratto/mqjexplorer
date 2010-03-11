// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QMgrCluster.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class QMgrCluster extends JPanel
{

    public QMgrCluster()
    {
        ivjClusterWorkLoadData = null;
        ivjClusterWorkLoadExit = null;
        ivjClusterWorkLoadLength = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        initialize();
    }

    public QMgrCluster(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjClusterWorkLoadData = null;
        ivjClusterWorkLoadExit = null;
        ivjClusterWorkLoadLength = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
    }

    public QMgrCluster(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjClusterWorkLoadData = null;
        ivjClusterWorkLoadExit = null;
        ivjClusterWorkLoadLength = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
    }

    public QMgrCluster(boolean flag)
    {
        super(flag);
        ivjClusterWorkLoadData = null;
        ivjClusterWorkLoadExit = null;
        ivjClusterWorkLoadLength = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
    }

    public String clusterWorkLoadDataGetValue()
    {
        return getClusterWorkLoadData().getValue();
    }

    public void clusterWorkLoadDataSetValue(String s)
    {
        getClusterWorkLoadData().setValue(s);
    }

    public String clusterWorkLoadExitGetValue()
    {
        return getClusterWorkLoadExit().getValue();
    }

    public void clusterWorkLoadExitSetValue(String s)
    {
        getClusterWorkLoadExit().setValue(s);
    }

    public int clusterWorkLoadLengthGetValue()
    {
        return getClusterWorkLoadLength().getValue();
    }

    public void clusterWorkLoadLengthSetValue(int i)
    {
        getClusterWorkLoadLength().setValue(i);
    }

    private ClusterWorkLoadData getClusterWorkLoadData()
    {
        if(ivjClusterWorkLoadData == null)
            try
            {
                ivjClusterWorkLoadData = new ClusterWorkLoadData();
                ivjClusterWorkLoadData.setName("ClusterWorkLoadData");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClusterWorkLoadData;
    }

    private ClusterWorkLoadExit getClusterWorkLoadExit()
    {
        if(ivjClusterWorkLoadExit == null)
            try
            {
                ivjClusterWorkLoadExit = new ClusterWorkLoadExit();
                ivjClusterWorkLoadExit.setName("ClusterWorkLoadExit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClusterWorkLoadExit;
    }

    private ClusterWorkLoadLength getClusterWorkLoadLength()
    {
        if(ivjClusterWorkLoadLength == null)
            try
            {
                ivjClusterWorkLoadLength = new ClusterWorkLoadLength();
                ivjClusterWorkLoadLength.setName("ClusterWorkLoadLength");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClusterWorkLoadLength;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Cluster Workload Exit:");
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
                ivjJLabel2.setText("Cluster Workload Exit Data:");
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
                ivjJLabel3.setText("Cluster Workload Length:");
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
                ivjJPanel1.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("QMgrCluster");
            setLayout(new GridBagLayout());
            setSize(335, 290);
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
            gridbagconstraints3.gridx = 1;
            gridbagconstraints3.gridy = 1;
            gridbagconstraints3.fill = 2;
            gridbagconstraints3.weightx = 1.0D;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getClusterWorkLoadData(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 0;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getClusterWorkLoadExit(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 2;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getClusterWorkLoadLength(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 0;
            gridbagconstraints6.gridy = 3;
            gridbagconstraints6.gridwidth = 2;
            gridbagconstraints6.fill = 1;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.weighty = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints6);
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
            QMgrCluster qmgrcluster = new QMgrCluster();
            jframe.setContentPane(qmgrcluster);
            jframe.setSize(qmgrcluster.getSize());
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

    private ClusterWorkLoadData ivjClusterWorkLoadData;
    private ClusterWorkLoadExit ivjClusterWorkLoadExit;
    private ClusterWorkLoadLength ivjClusterWorkLoadLength;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JPanel ivjJPanel1;
}
