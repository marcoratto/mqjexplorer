// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueClusterPane.java

package com.kolban.mqjexplorer.panels;

import com.kolban.mqjexplorer.mqattributes.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class QueueClusterPane extends JPanel
{
    class IvjEventHandler
        implements PropertyChangeListener, ChangeListener
    {

        public void propertyChange(PropertyChangeEvent propertychangeevent)
        {
            if(propertychangeevent.getSource() == getClusterName() && propertychangeevent.getPropertyName().equals("value"))
                connEtoC4(propertychangeevent);
            if(propertychangeevent.getSource() == getClusterNameList() && propertychangeevent.getPropertyName().equals("value"))
                connEtoC5(propertychangeevent);
        }

        public void stateChanged(ChangeEvent changeevent)
        {
            if(changeevent.getSource() == getClusterNotSharedSelection())
                connEtoC1(changeevent);
            if(changeevent.getSource() == getClusterSharedSelection())
                connEtoC2(changeevent);
            if(changeevent.getSource() == getClusterNameListSelection())
                connEtoC3(changeevent);
        }

        IvjEventHandler()
        {
        }
    }


    public QueueClusterPane()
    {
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDefBind = null;
        ivjfiller = null;
        ivjClusterName = null;
        ivjClusterNameListSelection = null;
        ivjClusterNotSharedSelection = null;
        ivjClusterSharedSelection = null;
        ivjClusterNameList = null;
        initialize();
    }

    public QueueClusterPane(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDefBind = null;
        ivjfiller = null;
        ivjClusterName = null;
        ivjClusterNameListSelection = null;
        ivjClusterNotSharedSelection = null;
        ivjClusterSharedSelection = null;
        ivjClusterNameList = null;
    }

    public QueueClusterPane(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDefBind = null;
        ivjfiller = null;
        ivjClusterName = null;
        ivjClusterNameListSelection = null;
        ivjClusterNotSharedSelection = null;
        ivjClusterSharedSelection = null;
        ivjClusterNameList = null;
    }

    public QueueClusterPane(boolean flag)
    {
        super(flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDefBind = null;
        ivjfiller = null;
        ivjClusterName = null;
        ivjClusterNameListSelection = null;
        ivjClusterNotSharedSelection = null;
        ivjClusterSharedSelection = null;
        ivjClusterNameList = null;
    }

    public String clusterNameGetValue()
    {
        return getClusterName().getValue();
    }

    public void clusterNameInit(String as[])
    {
        getClusterName().init(as);
    }

    public void clusterNameList_StateChanged(ChangeEvent changeevent)
    {
        if(getClusterNameListSelection().isSelected())
        {
            getClusterNameList().setEnabled(true);
            getClusterName().setEnabled(false);
        }
    }

    public void clusterNameSetValue(String s)
    {
        getClusterName().setValue(s);
    }

    public void clusterNotShared_StateChanged(ChangeEvent changeevent)
    {
        if(getClusterNotSharedSelection().isEnabled())
        {
            getClusterNameList().setEnabled(false);
            getClusterName().setEnabled(false);
        }
    }

    public void clusterShared_StateChanged(ChangeEvent changeevent)
    {
        if(getClusterSharedSelection().isSelected())
        {
            getClusterName().setEnabled(true);
            getClusterNameList().setEnabled(false);
        }
    }

    private void connEtoC1(ChangeEvent changeevent)
    {
        try
        {
            clusterNotShared_StateChanged(changeevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(ChangeEvent changeevent)
    {
        try
        {
            clusterShared_StateChanged(changeevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(ChangeEvent changeevent)
    {
        try
        {
            clusterNameList_StateChanged(changeevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(PropertyChangeEvent propertychangeevent)
    {
        try
        {
            firePropertyChange("clusterNameValue", propertychangeevent.getOldValue(), propertychangeevent.getNewValue());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5(PropertyChangeEvent propertychangeevent)
    {
        try
        {
            firePropertyChange("clusterNameListValue", propertychangeevent.getOldValue(), propertychangeevent.getNewValue());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public boolean connEtoM1_Value()
    {
        return !getClusterNotSharedSelection().isSelected();
    }

    public int defBindGetValue()
    {
        return getDefBind().getValue();
    }

    public void defBindSetValue(int i)
    {
        getDefBind().setValue(i);
    }

    private ButtonGroup getButtonGroup1()
    {
        if(ivjButtonGroup1 == null)
            try
            {
                ivjButtonGroup1 = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjButtonGroup1;
    }

    private ClusterName getClusterName()
    {
        if(ivjClusterName == null)
            try
            {
                ivjClusterName = new ClusterName();
                ivjClusterName.setName("ClusterName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClusterName;
    }

    private ClusterNameList getClusterNameList()
    {
        if(ivjClusterNameList == null)
            try
            {
                ivjClusterNameList = new ClusterNameList();
                ivjClusterNameList.setName("ClusterNameList");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClusterNameList;
    }

    private JRadioButton getClusterNameListSelection()
    {
        if(ivjClusterNameListSelection == null)
            try
            {
                ivjClusterNameListSelection = new JRadioButton();
                ivjClusterNameListSelection.setName("ClusterNameListSelection");
                ivjClusterNameListSelection.setText("Shared in a list of clusters");
                getButtonGroup1().add(ivjClusterNameListSelection);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClusterNameListSelection;
    }

    public String getClusterNameListValue()
    {
        return getClusterNameList().getValue();
    }

    public String getClusterNameValue()
    {
        return getClusterName().getValue();
    }

    private JRadioButton getClusterNotSharedSelection()
    {
        if(ivjClusterNotSharedSelection == null)
            try
            {
                ivjClusterNotSharedSelection = new JRadioButton();
                ivjClusterNotSharedSelection.setName("ClusterNotSharedSelection");
                ivjClusterNotSharedSelection.setSelected(true);
                ivjClusterNotSharedSelection.setText("Not shared in cluster");
                getButtonGroup1().add(ivjClusterNotSharedSelection);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClusterNotSharedSelection;
    }

    public int getClusterSelection()
    {
        if(getClusterNotSharedSelection().isSelected())
            return 0;
        return !getClusterSharedSelection().isSelected() ? 2 : 1;
    }

    private JRadioButton getClusterSharedSelection()
    {
        if(ivjClusterSharedSelection == null)
            try
            {
                ivjClusterSharedSelection = new JRadioButton();
                ivjClusterSharedSelection.setName("ClusterSharedSelection");
                ivjClusterSharedSelection.setText("Shared in cluster");
                getButtonGroup1().add(ivjClusterSharedSelection);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClusterSharedSelection;
    }

    private DefBind getDefBind()
    {
        if(ivjDefBind == null)
            try
            {
                ivjDefBind = new DefBind();
                ivjDefBind.setName("DefBind");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDefBind;
    }

    private JPanel getfiller()
    {
        if(ivjfiller == null)
            try
            {
                ivjfiller = new JPanel();
                ivjfiller.setName("filler");
                ivjfiller.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjfiller;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Cluster:");
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
                ivjJLabel2.setText("Cluster Namelist:");
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
                ivjJLabel3.setText("Default Bind:");
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
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getClusterNotSharedSelection(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getClusterSharedSelection(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 3;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getClusterNameListSelection(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel2(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 2;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.weightx = 1.0D;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getClusterName(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 1;
                gridbagconstraints6.gridy = 4;
                gridbagconstraints6.fill = 2;
                gridbagconstraints6.weightx = 1.0D;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getClusterNameList(), gridbagconstraints6);
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

    private void initConnections()
        throws Exception
    {
        getClusterNotSharedSelection().addChangeListener(ivjEventHandler);
        getClusterSharedSelection().addChangeListener(ivjEventHandler);
        getClusterNameListSelection().addChangeListener(ivjEventHandler);
        getClusterName().addPropertyChangeListener(ivjEventHandler);
        getClusterNameList().addPropertyChangeListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("NewQueueCluster");
            setLayout(new GridBagLayout());
            setSize(347, 312);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.gridwidth = 2;
            gridbagconstraints.fill = 2;
            gridbagconstraints.ipadx = -94;
            gridbagconstraints.ipady = 13;
            add(getJPanel1(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 1;
            gridbagconstraints1.gridy = 1;
            gridbagconstraints1.fill = 2;
            gridbagconstraints1.weightx = 1.0D;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getDefBind(), gridbagconstraints1);
            GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
            gridbagconstraints2.gridx = 0;
            gridbagconstraints2.gridy = 1;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getJLabel3(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 0;
            gridbagconstraints3.gridy = 2;
            gridbagconstraints3.gridwidth = 2;
            gridbagconstraints3.fill = 1;
            gridbagconstraints3.weightx = 1.0D;
            gridbagconstraints3.weighty = 1.0D;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getfiller(), gridbagconstraints3);
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
            JFrame jframe = new JFrame();
            QueueClusterPane queueclusterpane = new QueueClusterPane();
            jframe.setContentPane(queueclusterpane);
            jframe.setSize(queueclusterpane.getSize());
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

    public void setClusterNameListValue(String s)
    {
        getClusterNameList().setValue(s);
    }

    public void setClusterNameValue(String s)
    {
        getClusterName().setValue(s);
    }

    public void setClusterSelection(int i)
    {
        switch(i)
        {
        case 0: // '\0'
            getClusterNotSharedSelection().setSelected(true);
            break;

        case 1: // '\001'
            getClusterSharedSelection().setSelected(true);
            break;

        case 2: // '\002'
            getClusterNameListSelection().setSelected(true);
            break;
        }
    }

    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JPanel ivjJPanel1;
    private ButtonGroup ivjButtonGroup1;
    IvjEventHandler ivjEventHandler;
    private DefBind ivjDefBind;
    private JPanel ivjfiller;
    public static final int NOT_IN_CLUSTER = 0;
    public static final int SHARED_IN_CLUSTER_BY_NAME = 1;
    public static final int SHARED_IN_CLUSTER_BY_NAMELIST = 2;
    private ClusterName ivjClusterName;
    private JRadioButton ivjClusterNameListSelection;
    private JRadioButton ivjClusterNotSharedSelection;
    private JRadioButton ivjClusterSharedSelection;
    private ClusterNameList ivjClusterNameList;










}
