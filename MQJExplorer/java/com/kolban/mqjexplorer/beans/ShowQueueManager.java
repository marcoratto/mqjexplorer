// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ShowQueueManager.java

package com.kolban.mqjexplorer.beans;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class ShowQueueManager extends JDialog
{
    class IvjEventHandler
        implements ActionListener, ItemListener, PropertyChangeListener, DocumentListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getCancel())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getOK())
                connEtoC2(actionevent);
        }

        public void changedUpdate(DocumentEvent documentevent)
        {
            if(documentevent.getDocument() == getLocalQueueManagerDocument())
                connEtoC3(documentevent);
            if(documentevent.getDocument() == getRemoteQueueManagerDocument())
                connEtoC4(documentevent);
            if(documentevent.getDocument() == getConnectionNameDocument())
                connEtoC5(documentevent);
        }

        public void insertUpdate(DocumentEvent documentevent)
        {
            if(documentevent.getDocument() == getLocalQueueManagerDocument())
                connEtoC3(documentevent);
            if(documentevent.getDocument() == getRemoteQueueManagerDocument())
                connEtoC4(documentevent);
            if(documentevent.getDocument() == getConnectionNameDocument())
                connEtoC5(documentevent);
        }

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getShowLocalRadioButton())
                connEtoM1(itemevent);
            if(itemevent.getSource() == getShowRemoteRadioButton())
                connEtoM2(itemevent);
            if(itemevent.getSource() == getShowRemoteRadioButton())
                connEtoM3(itemevent);
            if(itemevent.getSource() == getShowRemoteRadioButton())
                connEtoM4(itemevent);
            if(itemevent.getSource() == getShowRemoteRadioButton())
                connEtoM5(itemevent);
            if(itemevent.getSource() == getShowLocalRadioButton())
                connEtoM6(itemevent);
            if(itemevent.getSource() == getShowLocalRadioButton())
                connEtoC6(itemevent);
            if(itemevent.getSource() == getShowRemoteRadioButton())
                connEtoC7(itemevent);
        }

        public void propertyChange(PropertyChangeEvent propertychangeevent)
        {
            if(propertychangeevent.getSource() == getLocalQueueManagerName() && propertychangeevent.getPropertyName().equals("document"))
                connPtoP1SetTarget();
            if(propertychangeevent.getSource() == getRemoteQueueManagerName() && propertychangeevent.getPropertyName().equals("document"))
                connPtoP2SetTarget();
            if(propertychangeevent.getSource() == getRemoteConnectionName() && propertychangeevent.getPropertyName().equals("document"))
                connPtoP3SetTarget();
        }

        public void removeUpdate(DocumentEvent documentevent)
        {
            if(documentevent.getDocument() == getLocalQueueManagerDocument())
                connEtoC3(documentevent);
            if(documentevent.getDocument() == getRemoteQueueManagerDocument())
                connEtoC4(documentevent);
            if(documentevent.getDocument() == getConnectionNameDocument())
                connEtoC5(documentevent);
        }

        IvjEventHandler()
        {
        }
    }


    public ShowQueueManager()
    {
        ivjCancel = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjShowLocalRadioButton = null;
        ivjShowRemoteRadioButton = null;
        returnCode = 0;
        queueManagerName = null;
        connectionName = null;
        local = true;
        ivjLocalQueueManagerName = null;
        ivjRemoteQueueManagerName = null;
        ivjRemoteConnectionName = null;
        ivjConnPtoP1Aligning = false;
        ivjLocalQueueManagerDocument = null;
        ivjConnectionNameDocument = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjRemoteQueueManagerDocument = null;
        ivjBanner = null;
        ivjBannerFlowLayout = null;
        ivjBannerIcon = null;
        ivjJPanel1 = null;
        ivjJSeparator2 = null;
        initialize();
    }

    public ShowQueueManager(Dialog dialog)
    {
        super(dialog);
        ivjCancel = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjShowLocalRadioButton = null;
        ivjShowRemoteRadioButton = null;
        returnCode = 0;
        queueManagerName = null;
        connectionName = null;
        local = true;
        ivjLocalQueueManagerName = null;
        ivjRemoteQueueManagerName = null;
        ivjRemoteConnectionName = null;
        ivjConnPtoP1Aligning = false;
        ivjLocalQueueManagerDocument = null;
        ivjConnectionNameDocument = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjRemoteQueueManagerDocument = null;
        ivjBanner = null;
        ivjBannerFlowLayout = null;
        ivjBannerIcon = null;
        ivjJPanel1 = null;
        ivjJSeparator2 = null;
        initialize();
    }

    public ShowQueueManager(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjCancel = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjShowLocalRadioButton = null;
        ivjShowRemoteRadioButton = null;
        returnCode = 0;
        queueManagerName = null;
        connectionName = null;
        local = true;
        ivjLocalQueueManagerName = null;
        ivjRemoteQueueManagerName = null;
        ivjRemoteConnectionName = null;
        ivjConnPtoP1Aligning = false;
        ivjLocalQueueManagerDocument = null;
        ivjConnectionNameDocument = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjRemoteQueueManagerDocument = null;
        ivjBanner = null;
        ivjBannerFlowLayout = null;
        ivjBannerIcon = null;
        ivjJPanel1 = null;
        ivjJSeparator2 = null;
    }

    public ShowQueueManager(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjCancel = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjShowLocalRadioButton = null;
        ivjShowRemoteRadioButton = null;
        returnCode = 0;
        queueManagerName = null;
        connectionName = null;
        local = true;
        ivjLocalQueueManagerName = null;
        ivjRemoteQueueManagerName = null;
        ivjRemoteConnectionName = null;
        ivjConnPtoP1Aligning = false;
        ivjLocalQueueManagerDocument = null;
        ivjConnectionNameDocument = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjRemoteQueueManagerDocument = null;
        ivjBanner = null;
        ivjBannerFlowLayout = null;
        ivjBannerIcon = null;
        ivjJPanel1 = null;
        ivjJSeparator2 = null;
    }

    public ShowQueueManager(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjCancel = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjShowLocalRadioButton = null;
        ivjShowRemoteRadioButton = null;
        returnCode = 0;
        queueManagerName = null;
        connectionName = null;
        local = true;
        ivjLocalQueueManagerName = null;
        ivjRemoteQueueManagerName = null;
        ivjRemoteConnectionName = null;
        ivjConnPtoP1Aligning = false;
        ivjLocalQueueManagerDocument = null;
        ivjConnectionNameDocument = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjRemoteQueueManagerDocument = null;
        ivjBanner = null;
        ivjBannerFlowLayout = null;
        ivjBannerIcon = null;
        ivjJPanel1 = null;
        ivjJSeparator2 = null;
    }

    public ShowQueueManager(Frame frame)
    {
        super(frame);
        ivjCancel = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjShowLocalRadioButton = null;
        ivjShowRemoteRadioButton = null;
        returnCode = 0;
        queueManagerName = null;
        connectionName = null;
        local = true;
        ivjLocalQueueManagerName = null;
        ivjRemoteQueueManagerName = null;
        ivjRemoteConnectionName = null;
        ivjConnPtoP1Aligning = false;
        ivjLocalQueueManagerDocument = null;
        ivjConnectionNameDocument = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjRemoteQueueManagerDocument = null;
        ivjBanner = null;
        ivjBannerFlowLayout = null;
        ivjBannerIcon = null;
        ivjJPanel1 = null;
        ivjJSeparator2 = null;
        initialize();
    }

    public ShowQueueManager(Frame frame, String s)
    {
        super(frame, s);
        ivjCancel = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjShowLocalRadioButton = null;
        ivjShowRemoteRadioButton = null;
        returnCode = 0;
        queueManagerName = null;
        connectionName = null;
        local = true;
        ivjLocalQueueManagerName = null;
        ivjRemoteQueueManagerName = null;
        ivjRemoteConnectionName = null;
        ivjConnPtoP1Aligning = false;
        ivjLocalQueueManagerDocument = null;
        ivjConnectionNameDocument = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjRemoteQueueManagerDocument = null;
        ivjBanner = null;
        ivjBannerFlowLayout = null;
        ivjBannerIcon = null;
        ivjJPanel1 = null;
        ivjJSeparator2 = null;
    }

    public ShowQueueManager(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjCancel = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjShowLocalRadioButton = null;
        ivjShowRemoteRadioButton = null;
        returnCode = 0;
        queueManagerName = null;
        connectionName = null;
        local = true;
        ivjLocalQueueManagerName = null;
        ivjRemoteQueueManagerName = null;
        ivjRemoteConnectionName = null;
        ivjConnPtoP1Aligning = false;
        ivjLocalQueueManagerDocument = null;
        ivjConnectionNameDocument = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjRemoteQueueManagerDocument = null;
        ivjBanner = null;
        ivjBannerFlowLayout = null;
        ivjBannerIcon = null;
        ivjJPanel1 = null;
        ivjJSeparator2 = null;
    }

    public ShowQueueManager(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjCancel = null;
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJSeparator1 = null;
        ivjOK = null;
        ivjButtonGroup1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjShowLocalRadioButton = null;
        ivjShowRemoteRadioButton = null;
        returnCode = 0;
        queueManagerName = null;
        connectionName = null;
        local = true;
        ivjLocalQueueManagerName = null;
        ivjRemoteQueueManagerName = null;
        ivjRemoteConnectionName = null;
        ivjConnPtoP1Aligning = false;
        ivjLocalQueueManagerDocument = null;
        ivjConnectionNameDocument = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjRemoteQueueManagerDocument = null;
        ivjBanner = null;
        ivjBannerFlowLayout = null;
        ivjBannerIcon = null;
        ivjJPanel1 = null;
        ivjJSeparator2 = null;
    }

    private void cancel()
    {
        returnCode = 1;
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
            oK();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(DocumentEvent documentevent)
    {
        try
        {
            enableOK();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(DocumentEvent documentevent)
    {
        try
        {
            enableOK();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5(DocumentEvent documentevent)
    {
        try
        {
            enableOK();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(ItemEvent itemevent)
    {
        try
        {
            enableOK();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC7(ItemEvent itemevent)
    {
        try
        {
            enableOK();
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
            getLocalQueueManagerName().setEnabled(getShowLocalRadioButton().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM2(ItemEvent itemevent)
    {
        try
        {
            getRemoteQueueManagerName().setEnabled(getShowRemoteRadioButton().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM3(ItemEvent itemevent)
    {
        try
        {
            getRemoteConnectionName().setEnabled(getShowRemoteRadioButton().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM4(ItemEvent itemevent)
    {
        try
        {
            getJLabel2().setEnabled(getShowRemoteRadioButton().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM5(ItemEvent itemevent)
    {
        try
        {
            getJLabel3().setEnabled(getShowRemoteRadioButton().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM6(ItemEvent itemevent)
    {
        try
        {
            getJLabel1().setEnabled(getShowLocalRadioButton().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connPtoP1SetSource()
    {
        try
        {
            if(!ivjConnPtoP1Aligning)
            {
                ivjConnPtoP1Aligning = true;
                if(getLocalQueueManagerDocument() != null)
                    getLocalQueueManagerName().setDocument(getLocalQueueManagerDocument());
                ivjConnPtoP1Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP1Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP1SetTarget()
    {
        try
        {
            if(!ivjConnPtoP1Aligning)
            {
                ivjConnPtoP1Aligning = true;
                setLocalQueueManagerDocument(getLocalQueueManagerName().getDocument());
                ivjConnPtoP1Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP1Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP2SetSource()
    {
        try
        {
            if(!ivjConnPtoP2Aligning)
            {
                ivjConnPtoP2Aligning = true;
                if(getRemoteQueueManagerDocument() != null)
                    getRemoteQueueManagerName().setDocument(getRemoteQueueManagerDocument());
                ivjConnPtoP2Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP2Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP2SetTarget()
    {
        try
        {
            if(!ivjConnPtoP2Aligning)
            {
                ivjConnPtoP2Aligning = true;
                setRemoteQueueManagerDocument(getRemoteQueueManagerName().getDocument());
                ivjConnPtoP2Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP2Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP3SetSource()
    {
        try
        {
            if(!ivjConnPtoP3Aligning)
            {
                ivjConnPtoP3Aligning = true;
                if(getConnectionNameDocument() != null)
                    getRemoteConnectionName().setDocument(getConnectionNameDocument());
                ivjConnPtoP3Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP3Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP3SetTarget()
    {
        try
        {
            if(!ivjConnPtoP3Aligning)
            {
                ivjConnPtoP3Aligning = true;
                setConnectionNameDocument(getRemoteConnectionName().getDocument());
                ivjConnPtoP3Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP3Aligning = false;
            handleException(throwable);
        }
    }

    private void enableOK()
    {
        boolean flag;
        if(getShowLocalRadioButton().isSelected())
        {
            flag = getLocalQueueManagerDocument().getLength() > 0;
        } else
        {
            flag = getRemoteQueueManagerDocument().getLength() > 0;
            flag &= getConnectionNameDocument().getLength() > 0;
        }
        getOK().setEnabled(flag);
    }

    private JPanel getBanner()
    {
        if(ivjBanner == null)
            try
            {
                ivjBanner = new JPanel();
                ivjBanner.setName("Banner");
                ivjBanner.setBorder(BorderFactory.createEtchedBorder());
                ivjBanner.setLayout(getBannerFlowLayout());
                getBanner().add(getBannerIcon(), getBannerIcon().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBanner;
    }

    private FlowLayout getBannerFlowLayout()
    {
        FlowLayout flowlayout = null;
        try
        {
            flowlayout = new FlowLayout();
            flowlayout.setAlignment(2);
            flowlayout.setVgap(0);
            flowlayout.setHgap(0);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return flowlayout;
    }

    private JLabel getBannerIcon()
    {
        if(ivjBannerIcon == null)
            try
            {
                ivjBannerIcon = new JLabel();
                ivjBannerIcon.setName("BannerIcon");
                ivjBannerIcon.setIcon(new ImageIcon(this.getClass().getResource("/icons/queueManagerSelectionBanner.jpg")));
                ivjBannerIcon.setText("");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBannerIcon;
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

    public String getConnectionName()
    {
        return connectionName;
    }

    private Document getConnectionNameDocument()
    {
        return ivjConnectionNameDocument;
    }

    private JPanel getFooterPanel()
    {
        if(ivjFooterPanel == null)
            try
            {
                ivjFooterPanel = new JPanel();
                ivjFooterPanel.setName("FooterPanel");
                ivjFooterPanel.setLayout(getFooterPanelFlowLayout());
                getFooterPanel().add(getOK(), getOK().getName());
                getFooterPanel().add(getCancel(), getCancel().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooterPanel;
    }

    private FlowLayout getFooterPanelFlowLayout()
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
                gridbagconstraints.fill = 1;
                gridbagconstraints.anchor = 13;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getBanner(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSeparator2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.gridwidth = 2;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.gridwidth = 2;
                gridbagconstraints4.anchor = 14;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.weighty = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooterPanel(), gridbagconstraints4);
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
                ivjJLabel1.setText("Queue Manager Name:");
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
                ivjJLabel2.setText("Queue Manager Name:");
                ivjJLabel2.setEnabled(false);
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
                ivjJLabel3.setText("Connection Name:");
                ivjJLabel3.setEnabled(false);
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
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getShowLocalRadioButton(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getLocalQueueManagerName(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.gridwidth = 2;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getShowRemoteRadioButton(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 3;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel2(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 3;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.weightx = 1.0D;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getRemoteQueueManagerName(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 4;
                gridbagconstraints6.anchor = 17;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel3(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 1;
                gridbagconstraints7.gridy = 4;
                gridbagconstraints7.fill = 2;
                gridbagconstraints7.weightx = 1.0D;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getRemoteConnectionName(), gridbagconstraints7);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
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

    private JSeparator getJSeparator2()
    {
        if(ivjJSeparator2 == null)
            try
            {
                ivjJSeparator2 = new JSeparator();
                ivjJSeparator2.setName("JSeparator2");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSeparator2;
    }

    private Document getLocalQueueManagerDocument()
    {
        return ivjLocalQueueManagerDocument;
    }

    private JTextField getLocalQueueManagerName()
    {
        if(ivjLocalQueueManagerName == null)
            try
            {
                ivjLocalQueueManagerName = new JTextField();
                ivjLocalQueueManagerName.setName("LocalQueueManagerName");
                ivjLocalQueueManagerName.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLocalQueueManagerName;
    }

    private Document getLocalQueueManagerNameDocument()
    {
        return getLocalQueueManagerName().getDocument();
    }

    private JButton getOK()
    {
        if(ivjOK == null)
            try
            {
                ivjOK = new JButton();
                ivjOK.setName("OK");
                ivjOK.setMnemonic('O');
                ivjOK.setText("OK");
                ivjOK.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOK;
    }

    public String getQueueManagerName()
    {
        return queueManagerName;
    }

    private JTextField getRemoteConnectionName()
    {
        if(ivjRemoteConnectionName == null)
            try
            {
                ivjRemoteConnectionName = new JTextField();
                ivjRemoteConnectionName.setName("RemoteConnectionName");
                ivjRemoteConnectionName.setEnabled(false);
                ivjRemoteConnectionName.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRemoteConnectionName;
    }

    private Document getRemoteQueueManagerDocument()
    {
        return ivjRemoteQueueManagerDocument;
    }

    private JTextField getRemoteQueueManagerName()
    {
        if(ivjRemoteQueueManagerName == null)
            try
            {
                ivjRemoteQueueManagerName = new JTextField();
                ivjRemoteQueueManagerName.setName("RemoteQueueManagerName");
                ivjRemoteQueueManagerName.setEnabled(false);
                ivjRemoteQueueManagerName.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRemoteQueueManagerName;
    }

    public int getReturnCode()
    {
        return returnCode;
    }

    private JRadioButton getShowLocalRadioButton()
    {
        if(ivjShowLocalRadioButton == null)
            try
            {
                ivjShowLocalRadioButton = new JRadioButton();
                ivjShowLocalRadioButton.setName("ShowLocalRadioButton");
                ivjShowLocalRadioButton.setSelected(true);
                ivjShowLocalRadioButton.setText("Show a local queue manager");
                getButtonGroup1().add(ivjShowLocalRadioButton);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjShowLocalRadioButton;
    }

    private JRadioButton getShowRemoteRadioButton()
    {
        if(ivjShowRemoteRadioButton == null)
            try
            {
                ivjShowRemoteRadioButton = new JRadioButton();
                ivjShowRemoteRadioButton.setName("ShowRemoteRadioButton");
                ivjShowRemoteRadioButton.setText("Show a remote queue manager");
                getButtonGroup1().add(ivjShowRemoteRadioButton);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjShowRemoteRadioButton;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getShowLocalRadioButton().addItemListener(ivjEventHandler);
        getShowRemoteRadioButton().addItemListener(ivjEventHandler);
        getCancel().addActionListener(ivjEventHandler);
        getOK().addActionListener(ivjEventHandler);
        getLocalQueueManagerName().addPropertyChangeListener(ivjEventHandler);
        getRemoteQueueManagerName().addPropertyChangeListener(ivjEventHandler);
        getRemoteConnectionName().addPropertyChangeListener(ivjEventHandler);
        connPtoP1SetTarget();
        connPtoP2SetTarget();
        connPtoP3SetTarget();
    }

    private void initialize()
    {
        try
        {
            setName("ShowQueueManager");
            setDefaultCloseOperation(0);
            setTitle("Show Queue Manager");
            setSize(426, 296);
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

    public boolean isLocal()
    {
        return local;
    }

    public static void main(String args[])
    {
        try
        {
            ShowQueueManager showqueuemanager = new ShowQueueManager();
            showqueuemanager.setModal(true);
            showqueuemanager.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            showqueuemanager.show();
            Insets insets = showqueuemanager.getInsets();
            showqueuemanager.setSize(showqueuemanager.getWidth() + insets.left + insets.right, showqueuemanager.getHeight() + insets.top + insets.bottom);
            showqueuemanager.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void oK()
    {
        returnCode = 0;
        local = getShowLocalRadioButton().isSelected();
        if(local)
        {
            queueManagerName = getLocalQueueManagerName().getText();
            connectionName = "";
        } else
        {
            queueManagerName = getRemoteQueueManagerName().getText();
            connectionName = getRemoteConnectionName().getText();
        }
        dispose();
    }

    public void setConnectionName(String s)
    {
        connectionName = s;
        if(!isLocal())
            getRemoteConnectionName().setText(connectionName);
    }

    private void setConnectionNameDocument(Document document)
    {
        if(ivjConnectionNameDocument != document)
            try
            {
                Document document1 = getConnectionNameDocument();
                if(ivjConnectionNameDocument != null)
                    ivjConnectionNameDocument.removeDocumentListener(ivjEventHandler);
                ivjConnectionNameDocument = document;
                if(ivjConnectionNameDocument != null)
                    ivjConnectionNameDocument.addDocumentListener(ivjEventHandler);
                connPtoP3SetSource();
                firePropertyChange("localQueueManagerNameDocument", document1, document);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
    }

    public void setLocal(boolean flag)
    {
        local = flag;
        getShowLocalRadioButton().setSelected(local);
        getShowRemoteRadioButton().setSelected(!local);
    }

    private void setLocalQueueManagerDocument(Document document)
    {
        if(ivjLocalQueueManagerDocument != document)
            try
            {
                Document document1 = getLocalQueueManagerDocument();
                if(ivjLocalQueueManagerDocument != null)
                    ivjLocalQueueManagerDocument.removeDocumentListener(ivjEventHandler);
                ivjLocalQueueManagerDocument = document;
                if(ivjLocalQueueManagerDocument != null)
                    ivjLocalQueueManagerDocument.addDocumentListener(ivjEventHandler);
                connPtoP1SetSource();
                firePropertyChange("localQueueManagerNameDocument", document1, document);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
    }

    private void setLocalQueueManagerNameDocument(Document document)
    {
        getLocalQueueManagerName().setDocument(document);
    }

    public void setQueueManagerName(String s)
    {
        queueManagerName = s;
        if(isLocal())
            getLocalQueueManagerName().setText(queueManagerName);
        else
            getRemoteQueueManagerName().setText(queueManagerName);
    }

    private void setRemoteQueueManagerDocument(Document document)
    {
        if(ivjRemoteQueueManagerDocument != document)
            try
            {
                Document document1 = getRemoteQueueManagerDocument();
                if(ivjRemoteQueueManagerDocument != null)
                    ivjRemoteQueueManagerDocument.removeDocumentListener(ivjEventHandler);
                ivjRemoteQueueManagerDocument = document;
                if(ivjRemoteQueueManagerDocument != null)
                    ivjRemoteQueueManagerDocument.addDocumentListener(ivjEventHandler);
                connPtoP2SetSource();
                firePropertyChange("localQueueManagerNameDocument", document1, document);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
    }

    private JButton ivjCancel;
    private JPanel ivjFooterPanel;
    private FlowLayout ivjFooterPanelFlowLayout;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JSeparator ivjJSeparator1;
    private JButton ivjOK;
    private ButtonGroup ivjButtonGroup1;
    IvjEventHandler ivjEventHandler;
    private JRadioButton ivjShowLocalRadioButton;
    private JRadioButton ivjShowRemoteRadioButton;
    public static final int OK = 0;
    public static final int CANCEL = 1;
    private int returnCode;
    private String queueManagerName;
    private String connectionName;
    private boolean local;
    private JTextField ivjLocalQueueManagerName;
    private JTextField ivjRemoteQueueManagerName;
    private JTextField ivjRemoteConnectionName;
    private boolean ivjConnPtoP1Aligning;
    private Document ivjLocalQueueManagerDocument;
    private Document ivjConnectionNameDocument;
    private boolean ivjConnPtoP2Aligning;
    private boolean ivjConnPtoP3Aligning;
    private Document ivjRemoteQueueManagerDocument;
    private JPanel ivjBanner;
    private FlowLayout ivjBannerFlowLayout;
    private JLabel ivjBannerIcon;
    private JPanel ivjJPanel1;
    private JSeparator ivjJSeparator2;


























}
