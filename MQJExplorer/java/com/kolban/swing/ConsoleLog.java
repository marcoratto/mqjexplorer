// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConsoleLog.java

package com.kolban.swing;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class ConsoleLog extends JFrame
{
    class IvjEventHandler
        implements ActionListener, MouseListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getClear())
                connEtoM1(actionevent);
            if(actionevent.getSource() == getClose())
                connEtoC3();
            if(actionevent.getSource() == getSave())
                connEtoC4(actionevent);
        }

        public void mouseClicked(MouseEvent mouseevent)
        {
        }

        public void mouseEntered(MouseEvent mouseevent)
        {
        }

        public void mouseExited(MouseEvent mouseevent)
        {
        }

        public void mousePressed(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getOutputText())
                connEtoC1(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getOutputText())
                connEtoC2(mouseevent);
        }

        IvjEventHandler()
        {
        }
    }


    public ConsoleLog()
    {
        ivjClose = null;
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJPanel1FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjOutput = null;
        ivjOutputText = null;
        ivjClear = null;
        ivjEventHandler = new IvjEventHandler();
        ivjSave = null;
        ivjPopup = null;
        initialize();
    }

    private void closeDlg()
    {
        hide();
    }

    private void connEtoC1(MouseEvent mouseevent)
    {
        try
        {
            handlePopup(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(MouseEvent mouseevent)
    {
        try
        {
            handlePopup(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3()
    {
        try
        {
            closeDlg();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(ActionEvent actionevent)
    {
        try
        {
            save();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM1(ActionEvent actionevent)
    {
        try
        {
            getOutputText().setText("--- cleared ---\n");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JMenuItem getClear()
    {
        if(ivjClear == null)
            try
            {
                ivjClear = new JMenuItem();
                ivjClear.setName("Clear");
                ivjClear.setText("Clear");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClear;
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
                ivjFooter.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getFooter().add(getJSeparator1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 2;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getFooter().add(getJPanel1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getFooter().add(getOutput(), gridbagconstraints2);
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
                gridbagconstraints.gridx = 1;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(getJPanel1FlowLayout());
                getJPanel1().add(getClose(), getClose().getName());
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

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                getJScrollPane1().setViewportView(getOutputText());
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

    private JPanel getOutput()
    {
        if(ivjOutput == null)
            try
            {
                ivjOutput = new JPanel();
                ivjOutput.setName("Output");
                ivjOutput.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getOutput().add(getJScrollPane1(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOutput;
    }

    public OutputStream getOutputStream()
    {
        return new OutputStream() {

            public void write(int i)
            {
            }

            public void write(byte abyte0[])
            {
                write(abyte0, 0, abyte0.length);
            }

            public void write(byte abyte0[], int i, int j)
            {
                getOutputText().append(new String(abyte0, i, j));
                getOutputText().setCaretPosition(getOutputText().getDocument().getLength());
            }

        }
;
    }

    private JTextArea getOutputText()
    {
        if(ivjOutputText == null)
            try
            {
                ivjOutputText = new JTextArea();
                ivjOutputText.setName("OutputText");
                ivjOutputText.setRows(20);
                ivjOutputText.setBounds(0, 0, 160, 120);
                ivjOutputText.setEditable(false);
                ivjOutputText.setColumns(40);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOutputText;
    }

    private JPopupMenu getPopup()
    {
        if(ivjPopup == null)
            try
            {
                ivjPopup = new JPopupMenu();
                ivjPopup.setName("Popup");
                ivjPopup.add(getClear());
                ivjPopup.add(getSave());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPopup;
    }

    private JMenuItem getSave()
    {
        if(ivjSave == null)
            try
            {
                ivjSave = new JMenuItem();
                ivjSave.setName("Save");
                ivjSave.setText("Save");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSave;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void handlePopup(MouseEvent mouseevent)
    {
        if(!mouseevent.isPopupTrigger())
            getPopup().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
    }

    private void initConnections()
        throws Exception
    {
        getOutputText().addMouseListener(ivjEventHandler);
        getClear().addActionListener(ivjEventHandler);
        getClose().addActionListener(ivjEventHandler);
        getSave().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            getRootPane().setDefaultButton(getClose());
            setName("ConsoleLog");
            setDefaultCloseOperation(1);
            setSize(426, 407);
            setTitle("Output Log");
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
            ConsoleLog consolelog = new ConsoleLog();
            consolelog.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            consolelog.show();
            Insets insets = consolelog.getInsets();
            consolelog.setSize(consolelog.getWidth() + insets.left + insets.right, consolelog.getHeight() + insets.top + insets.bottom);
            consolelog.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void save()
    {
        JFileChooser jfilechooser = new JFileChooser();
        int i = jfilechooser.showSaveDialog(this);
        if(i == 0)
            try
            {
                java.io.File file = jfilechooser.getSelectedFile();
                FileWriter filewriter = new FileWriter(file);
                filewriter.write(getOutputText().getText());
                filewriter.close();
            }
            catch(Exception exception)
            {
                System.out.println("Exception::save:: " + exception.toString());
            }
    }

    private JButton ivjClose;
    private JPanel ivjFooter;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private FlowLayout ivjJPanel1FlowLayout;
    private JScrollPane ivjJScrollPane1;
    private JSeparator ivjJSeparator1;
    private JPanel ivjOutput;
    private JTextArea ivjOutputText;
    private JMenuItem ivjClear;
    IvjEventHandler ivjEventHandler;
    private JMenuItem ivjSave;
    private JPopupMenu ivjPopup;









}
