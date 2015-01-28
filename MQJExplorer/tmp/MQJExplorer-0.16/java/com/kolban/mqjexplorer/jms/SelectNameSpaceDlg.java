// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SelectNameSpaceDlg.java

package com.kolban.mqjexplorer.jms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SelectNameSpaceDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener, ItemListener, WindowListener, ChangeListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJButton1())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getOK())
                connEtoC2(actionevent);
        }

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getOtherFactorySelection())
                connEtoM1(itemevent);
        }

        public void stateChanged(ChangeEvent changeevent)
        {
            if(changeevent.getSource() == getFileSystemSelection())
                connEtoC3(changeevent);
            if(changeevent.getSource() == getLDAPFactorySelection())
                connEtoC4(changeevent);
            if(changeevent.getSource() == getOtherFactorySelection())
                connEtoC5(changeevent);
            if(changeevent.getSource() == getWASFactorySelection())
                connEtoC7(changeevent);
            if(changeevent.getSource() == getFileSystemSelection())
                connEtoC8(changeevent);
            if(changeevent.getSource() == getLDAPFactorySelection())
                connEtoC9(changeevent);
            if(changeevent.getSource() == getWASFactorySelection())
                connEtoC10(changeevent);
            if(changeevent.getSource() == getOtherFactorySelection())
                connEtoC11(changeevent);
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
            if(windowevent.getSource() == SelectNameSpaceDlg.this)
                connEtoC6(windowevent);
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


    public SelectNameSpaceDlg()
    {
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjProviderURLText = null;
        initialContextFactory = null;
        providerURL = null;
        ivjFileSystemSelection = null;
        ivjJPanel2 = null;
        ivjLDAPFactorySelection = null;
        ivjOtherFactorySelection = null;
        ivjSelectionGroup = null;
        ivjOtherSelectionText = null;
        ivjOK = null;
        ivjWASFactorySelection = null;
        initialize();
    }

    public SelectNameSpaceDlg(Dialog dialog)
    {
        super(dialog);
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjProviderURLText = null;
        initialContextFactory = null;
        providerURL = null;
        ivjFileSystemSelection = null;
        ivjJPanel2 = null;
        ivjLDAPFactorySelection = null;
        ivjOtherFactorySelection = null;
        ivjSelectionGroup = null;
        ivjOtherSelectionText = null;
        ivjOK = null;
        ivjWASFactorySelection = null;
    }

    public SelectNameSpaceDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjProviderURLText = null;
        initialContextFactory = null;
        providerURL = null;
        ivjFileSystemSelection = null;
        ivjJPanel2 = null;
        ivjLDAPFactorySelection = null;
        ivjOtherFactorySelection = null;
        ivjSelectionGroup = null;
        ivjOtherSelectionText = null;
        ivjOK = null;
        ivjWASFactorySelection = null;
    }

    public SelectNameSpaceDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjProviderURLText = null;
        initialContextFactory = null;
        providerURL = null;
        ivjFileSystemSelection = null;
        ivjJPanel2 = null;
        ivjLDAPFactorySelection = null;
        ivjOtherFactorySelection = null;
        ivjSelectionGroup = null;
        ivjOtherSelectionText = null;
        ivjOK = null;
        ivjWASFactorySelection = null;
    }

    public SelectNameSpaceDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjProviderURLText = null;
        initialContextFactory = null;
        providerURL = null;
        ivjFileSystemSelection = null;
        ivjJPanel2 = null;
        ivjLDAPFactorySelection = null;
        ivjOtherFactorySelection = null;
        ivjSelectionGroup = null;
        ivjOtherSelectionText = null;
        ivjOK = null;
        ivjWASFactorySelection = null;
    }

    public SelectNameSpaceDlg(Frame frame)
    {
        super(frame);
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjProviderURLText = null;
        initialContextFactory = null;
        providerURL = null;
        ivjFileSystemSelection = null;
        ivjJPanel2 = null;
        ivjLDAPFactorySelection = null;
        ivjOtherFactorySelection = null;
        ivjSelectionGroup = null;
        ivjOtherSelectionText = null;
        ivjOK = null;
        ivjWASFactorySelection = null;
        initialize();
    }

    public SelectNameSpaceDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjProviderURLText = null;
        initialContextFactory = null;
        providerURL = null;
        ivjFileSystemSelection = null;
        ivjJPanel2 = null;
        ivjLDAPFactorySelection = null;
        ivjOtherFactorySelection = null;
        ivjSelectionGroup = null;
        ivjOtherSelectionText = null;
        ivjOK = null;
        ivjWASFactorySelection = null;
    }

    public SelectNameSpaceDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjProviderURLText = null;
        initialContextFactory = null;
        providerURL = null;
        ivjFileSystemSelection = null;
        ivjJPanel2 = null;
        ivjLDAPFactorySelection = null;
        ivjOtherFactorySelection = null;
        ivjSelectionGroup = null;
        ivjOtherSelectionText = null;
        ivjOK = null;
        ivjWASFactorySelection = null;
    }

    public SelectNameSpaceDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjProviderURLText = null;
        initialContextFactory = null;
        providerURL = null;
        ivjFileSystemSelection = null;
        ivjJPanel2 = null;
        ivjLDAPFactorySelection = null;
        ivjOtherFactorySelection = null;
        ivjSelectionGroup = null;
        ivjOtherSelectionText = null;
        ivjOK = null;
        ivjWASFactorySelection = null;
    }

    private void cancel()
    {
        dispose();
        returnValue = 2;
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

    private void connEtoC10(ChangeEvent changeevent)
    {
        try
        {
            setProviderURLText("iiop://");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC11(ChangeEvent changeevent)
    {
        try
        {
            setProviderURLText("");
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
            ok();
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
            validateOK();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(ChangeEvent changeevent)
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

    private void connEtoC5(ChangeEvent changeevent)
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

    private void connEtoC6(WindowEvent windowevent)
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

    private void connEtoC7(ChangeEvent changeevent)
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

    private void connEtoC8(ChangeEvent changeevent)
    {
        try
        {
            setProviderURLText("file://");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC9(ChangeEvent changeevent)
    {
        try
        {
            setProviderURLText("ldap://");
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
            getOtherSelectionText().setEditable(getOtherFactorySelection().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JRadioButton getFileSystemSelection()
    {
        if(ivjFileSystemSelection == null)
            try
            {
                ivjFileSystemSelection = new JRadioButton();
                ivjFileSystemSelection.setName("FileSystemSelection");
                ivjFileSystemSelection.setSelected(true);
                ivjFileSystemSelection.setToolTipText("com.sun.jndi.fscontext.RefFSContextFactory");
                ivjFileSystemSelection.setText("File System");
                getSelectionGroup().add(ivjFileSystemSelection);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileSystemSelection;
    }

    private JPanel getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new JPanel();
                ivjFooter.setName("Footer");
                ivjFooter.setLayout(getFooterFlowLayout());
                getFooter().add(getOK(), getOK().getName());
                getFooter().add(getJButton1(), getJButton1().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
    }

    private FlowLayout getFooterFlowLayout()
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

    public String getInitialContextFactory()
    {
        return initialContextFactory;
    }

    private JButton getJButton1()
    {
        if(ivjJButton1 == null)
            try
            {
                ivjJButton1 = new JButton();
                ivjJButton1.setName("JButton1");
                ivjJButton1.setText("Cancel");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton1;
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
                gridbagconstraints.gridy = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 1;
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

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("Provider URL:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
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
                gridbagconstraints.gridy = 1;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel2(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getProviderURLText(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.gridwidth = 2;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJPanel2(), gridbagconstraints2);
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
                ivjJPanel2.setBorder(BorderFactory.createTitledBorder("Initial Context Factory"));
                ivjJPanel2.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getFileSystemSelection(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.gridwidth = 2;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getLDAPFactorySelection(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 3;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getOtherFactorySelection(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getOtherSelectionText(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 2;
                gridbagconstraints4.gridwidth = 2;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getWASFactorySelection(), gridbagconstraints4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
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

    private JRadioButton getLDAPFactorySelection()
    {
        if(ivjLDAPFactorySelection == null)
            try
            {
                ivjLDAPFactorySelection = new JRadioButton();
                ivjLDAPFactorySelection.setName("LDAPFactorySelection");
                ivjLDAPFactorySelection.setToolTipText("com.sun.jndi.ldap.LdapCtxFactory");
                ivjLDAPFactorySelection.setText("LDAP");
                getSelectionGroup().add(ivjLDAPFactorySelection);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLDAPFactorySelection;
    }

    private JButton getOK()
    {
        if(ivjOK == null)
            try
            {
                ivjOK = new JButton();
                ivjOK.setName("OK");
                ivjOK.setText("OK");
                ivjOK.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOK;
    }

    private JRadioButton getOtherFactorySelection()
    {
        if(ivjOtherFactorySelection == null)
            try
            {
                ivjOtherFactorySelection = new JRadioButton();
                ivjOtherFactorySelection.setName("OtherFactorySelection");
                ivjOtherFactorySelection.setText("Other...");
                getSelectionGroup().add(ivjOtherFactorySelection);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOtherFactorySelection;
    }

    private JTextField getOtherSelectionText()
    {
        if(ivjOtherSelectionText == null)
            try
            {
                ivjOtherSelectionText = new JTextField();
                ivjOtherSelectionText.setName("OtherSelectionText");
                ivjOtherSelectionText.setEditable(false);
                ivjOtherSelectionText.setEnabled(true);
                ivjOtherSelectionText.setColumns(20);
                ivjOtherSelectionText.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
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
        return ivjOtherSelectionText;
    }

    public String getProviderURL()
    {
        return providerURL;
    }

    private JTextField getProviderURLText()
    {
        if(ivjProviderURLText == null)
            try
            {
                ivjProviderURLText = new JTextField();
                ivjProviderURLText.setName("ProviderURLText");
                ivjProviderURLText.setText("file://");
                ivjProviderURLText.setColumns(20);
                ivjProviderURLText.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent documentevent)
                    {
                        validateOK();
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
        return ivjProviderURLText;
    }

    public int getReturnValue()
    {
        return returnValue;
    }

    private ButtonGroup getSelectionGroup()
    {
        if(ivjSelectionGroup == null)
            try
            {
                ivjSelectionGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelectionGroup;
    }

    private JRadioButton getWASFactorySelection()
    {
        if(ivjWASFactorySelection == null)
            try
            {
                ivjWASFactorySelection = new JRadioButton();
                ivjWASFactorySelection.setName("WASFactorySelection");
                ivjWASFactorySelection.setToolTipText("com.ibm.ejs.ns.jndi.CNInitialContextFactory");
                ivjWASFactorySelection.setText("WebSphere App Server");
                getSelectionGroup().add(ivjWASFactorySelection);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjWASFactorySelection;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getJButton1().addActionListener(ivjEventHandler);
        getOK().addActionListener(ivjEventHandler);
        getFileSystemSelection().addChangeListener(ivjEventHandler);
        getLDAPFactorySelection().addChangeListener(ivjEventHandler);
        getOtherFactorySelection().addChangeListener(ivjEventHandler);
        getOtherFactorySelection().addItemListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
        getWASFactorySelection().addChangeListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("SelectNameSpaceDlg");
            setDefaultCloseOperation(0);
            setResizable(false);
            setSize(426, 240);
            setModal(true);
            setTitle("Select JNDI NameSpace");
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
            SelectNameSpaceDlg selectnamespacedlg = new SelectNameSpaceDlg();
            selectnamespacedlg.setModal(true);
            selectnamespacedlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            selectnamespacedlg.show();
            Insets insets = selectnamespacedlg.getInsets();
            selectnamespacedlg.setSize(selectnamespacedlg.getWidth() + insets.left + insets.right, selectnamespacedlg.getHeight() + insets.top + insets.bottom);
            selectnamespacedlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void ok()
    {
        if(getFileSystemSelection().isSelected())
            initialContextFactory = "com.sun.jndi.fscontext.RefFSContextFactory";
        else
        if(getLDAPFactorySelection().isSelected())
            initialContextFactory = "com.sun.jndi.ldap.LdapCtxFactory";
        else
        if(getWASFactorySelection().isSelected())
            initialContextFactory = "com.ibm.ejs.ns.jndi.CNInitialContextFactory";
        else
            initialContextFactory = getOtherSelectionText().getText();
        providerURL = getProviderURLText().getText();
        dispose();
        returnValue = 1;
    }

    private void setProviderURLText(String s)
    {
        getProviderURLText().setText(s);
    }

    public void test()
    {
    }

    public void test(DocumentEvent documentevent)
    {
    }

    private void validateOK()
    {
        if(getOtherFactorySelection().isSelected() && getOtherSelectionText().getText().trim().length() == 0)
        {
            getOK().setEnabled(false);
            return;
        }
        if(getProviderURLText().getText().trim().length() == 0)
        {
            getOK().setEnabled(false);
            return;
        } else
        {
            getOK().setEnabled(true);
            return;
        }
    }

    IvjEventHandler ivjEventHandler;
    private JPanel ivjFooter;
    private FlowLayout ivjFooterFlowLayout;
    private JButton ivjJButton1;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel2;
    private JPanel ivjJPanel1;
    private JSeparator ivjJSeparator1;
    public static final int OK = 1;
    public static final int CANCEL = 2;
    private int returnValue;
    private JTextField ivjProviderURLText;
    private String initialContextFactory;
    private String providerURL;
    private JRadioButton ivjFileSystemSelection;
    private JPanel ivjJPanel2;
    private JRadioButton ivjLDAPFactorySelection;
    private JRadioButton ivjOtherFactorySelection;
    private ButtonGroup ivjSelectionGroup;
    private JTextField ivjOtherSelectionText;
    private JButton ivjOK;
    private JRadioButton ivjWASFactorySelection;



















}
