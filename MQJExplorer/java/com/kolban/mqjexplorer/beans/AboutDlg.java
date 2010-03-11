// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AboutDlg.java

package com.kolban.mqjexplorer.beans;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Properties;
import javax.swing.*;

public class AboutDlg extends JDialog
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -44403319552619266L;
	
	class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getClose())
                connEtoC1();
        }

        IvjEventHandler()
        {
        }
    }


    public AboutDlg()
    {
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjClose = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjFreeMemory = null;
        ivjInfoPanel = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTotalMemory = null;
        ivjOperatingSystem = null;
        ivjVersion = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        initialize();
    }

    public AboutDlg(Dialog dialog)
    {
        super(dialog);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjClose = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjFreeMemory = null;
        ivjInfoPanel = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTotalMemory = null;
        ivjOperatingSystem = null;
        ivjVersion = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
    }

    public AboutDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjClose = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjFreeMemory = null;
        ivjInfoPanel = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTotalMemory = null;
        ivjOperatingSystem = null;
        ivjVersion = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
    }

    public AboutDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjClose = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjFreeMemory = null;
        ivjInfoPanel = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTotalMemory = null;
        ivjOperatingSystem = null;
        ivjVersion = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
    }

    public AboutDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjClose = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjFreeMemory = null;
        ivjInfoPanel = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTotalMemory = null;
        ivjOperatingSystem = null;
        ivjVersion = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
    }

    public AboutDlg(Frame frame)
    {
        super(frame);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjClose = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjFreeMemory = null;
        ivjInfoPanel = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTotalMemory = null;
        ivjOperatingSystem = null;
        ivjVersion = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
    }

    public AboutDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjClose = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjFreeMemory = null;
        ivjInfoPanel = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTotalMemory = null;
        ivjOperatingSystem = null;
        ivjVersion = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
    }

    public AboutDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjClose = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjFreeMemory = null;
        ivjInfoPanel = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTotalMemory = null;
        ivjOperatingSystem = null;
        ivjVersion = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
    }

    public AboutDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjClose = null;
        ivjEventHandler = new IvjEventHandler();
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjFreeMemory = null;
        ivjInfoPanel = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjTotalMemory = null;
        ivjOperatingSystem = null;
        ivjVersion = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
    }

    public void close_ActionEvents()
    {
        dispose();
    }

    private void connEtoC1()
    {
        try
        {
            close_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JButton getClose()
    {
        if(ivjClose == null)
            try
            {
                ivjClose = new JButton();
                ivjClose.setName("Close");
                ivjClose.setMnemonic('C');
                ivjClose.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClose;
    }

    private JTextField getFreeMemory()
    {
        if(ivjFreeMemory == null)
            try
            {
                ivjFreeMemory = new JTextField();
                ivjFreeMemory.setName("FreeMemory");
                ivjFreeMemory.setEditable(false);
                ivjFreeMemory.setText(Long.toString(Runtime.getRuntime().freeMemory() / 0x100000L) + " MBytes");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFreeMemory;
    }

    private JPanel getInfoPanel()
    {
        if(ivjInfoPanel == null)
            try
            {
                ivjInfoPanel = new JPanel();
                ivjInfoPanel.setName("InfoPanel");
                ivjInfoPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getInfoPanel().add(getJLabel2(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getInfoPanel().add(getJLabel3(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getInfoPanel().add(getTotalMemory(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getInfoPanel().add(getFreeMemory(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 1;
                gridbagconstraints4.gridy = 2;
                gridbagconstraints4.gridwidth = 2;
                gridbagconstraints4.fill = 2;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getInfoPanel().add(getVersion(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 3;
                gridbagconstraints5.gridwidth = 2;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getInfoPanel().add(getOperatingSystem(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 2;
                gridbagconstraints6.anchor = 17;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getInfoPanel().add(getJLabel4(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 0;
                gridbagconstraints7.gridy = 3;
                gridbagconstraints7.anchor = 17;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getInfoPanel().add(getJLabel5(), gridbagconstraints7);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInfoPanel;
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
                gridbagconstraints.gridx = 1;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 2;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.gridwidth = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.anchor = 11;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getInfoPanel(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.gridwidth = 6;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 0, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 3;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.gridwidth = 3;
                gridbagconstraints3.anchor = 13;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getClose(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 0;
                gridbagconstraints4.fill = 1;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.weighty = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints4);
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
                ivjJLabel1.setAlignmentX(0.0F);
                ivjJLabel1.setText("JLabel1");
                String s1 = "";
                BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(getClass().getResource("/misc/about.htm").openStream()));
                do
                {
                    String s = bufferedreader.readLine();
                    if(s == null)
                        break;
                    s1 = s1 + s;
                } while(true);
                bufferedreader.close();
                ivjJLabel1.setText(s1);
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
                ivjJLabel2.setText("Total Memory:");
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
                ivjJLabel3.setText("Free Memory:");
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
                ivjJLabel4.setText("VM Version:");
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
                ivjJLabel5.setText("Operating System:");
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
                ivjJPanel1.setLayout(null);
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

    private JLabel getOperatingSystem()
    {
        if(ivjOperatingSystem == null)
            try
            {
                ivjOperatingSystem = new JLabel();
                ivjOperatingSystem.setName("OperatingSystem");
                ivjOperatingSystem.setText("OperatingSystem");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOperatingSystem;
    }

    private JTextField getTotalMemory()
    {
        if(ivjTotalMemory == null)
            try
            {
                ivjTotalMemory = new JTextField();
                ivjTotalMemory.setName("TotalMemory");
                ivjTotalMemory.setEditable(false);
                ivjTotalMemory.setText(Long.toString(Runtime.getRuntime().totalMemory() / 0x100000L) + " MBytes");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTotalMemory;
    }

    private JLabel getVersion()
    {
        if(ivjVersion == null)
            try
            {
                ivjVersion = new JLabel();
                ivjVersion.setName("Version");
                ivjVersion.setText("Version");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjVersion;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getClose().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            getRootPane().setDefaultButton(getClose());
            Properties properties = System.getProperties();
            getVersion().setText(properties.getProperty("java.vendor") + " " + properties.getProperty("java.version"));
            getOperatingSystem().setText(properties.getProperty("os.name"));
            setName("AboutDlg");
            setDefaultCloseOperation(2);
            setTitle("About MQJExplorer");
            setSize(449, 169);
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
            AboutDlg aboutdlg = new AboutDlg();
            aboutdlg.setModal(true);
            aboutdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            aboutdlg.pack();
            aboutdlg.show();
            Insets insets = aboutdlg.getInsets();
            aboutdlg.setSize(aboutdlg.getWidth() + insets.left + insets.right, aboutdlg.getHeight() + insets.top + insets.bottom);
            aboutdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JButton ivjClose;
    IvjEventHandler ivjEventHandler;
    private JPanel ivjJPanel1;
    private JSeparator ivjJSeparator1;
    private JTextField ivjFreeMemory;
    private JPanel ivjInfoPanel;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JTextField ivjTotalMemory;
    private JLabel ivjOperatingSystem;
    private JLabel ivjVersion;
    public static String version = "1.0.1";
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;



}
