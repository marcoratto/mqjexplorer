// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EscapeDlg.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQException;
import com.kolban.mq.PCFUtils;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.swing.SwingUtils;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class EscapeDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener, ComponentListener, MouseListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJButton3())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getJButton2())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getPreviousCommands())
                connEtoM1(actionevent);
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC7(actionevent);
        }

        public void componentHidden(ComponentEvent componentevent)
        {
        }

        public void componentMoved(ComponentEvent componentevent)
        {
        }

        public void componentResized(ComponentEvent componentevent)
        {
            if(componentevent.getSource() == EscapeDlg.this)
                connEtoC8(componentevent);
        }

        public void componentShown(ComponentEvent componentevent)
        {
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
            if(mouseevent.getSource() == getResponse())
                connEtoC3(mouseevent);
            if(mouseevent.getSource() == getCommand())
                connEtoC4(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getCommand())
                connEtoC5(mouseevent);
            if(mouseevent.getSource() == getResponse())
                connEtoC6(mouseevent);
        }

        IvjEventHandler()
        {
        }
    }


    public EscapeDlg()
    {
        ivjCommand = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJSplitPane1 = null;
        ivjResponse = null;
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjPreviousCommands = null;
        ivjJMenuItem1 = null;
        ivjTextAreaPopupMenu = null;
        targetTextArea = null;
        initialize();
    }

    public EscapeDlg(Dialog dialog)
    {
        super(dialog);
        ivjCommand = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJSplitPane1 = null;
        ivjResponse = null;
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjPreviousCommands = null;
        ivjJMenuItem1 = null;
        ivjTextAreaPopupMenu = null;
        targetTextArea = null;
    }

    public EscapeDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjCommand = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJSplitPane1 = null;
        ivjResponse = null;
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjPreviousCommands = null;
        ivjJMenuItem1 = null;
        ivjTextAreaPopupMenu = null;
        targetTextArea = null;
    }

    public EscapeDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjCommand = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJSplitPane1 = null;
        ivjResponse = null;
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjPreviousCommands = null;
        ivjJMenuItem1 = null;
        ivjTextAreaPopupMenu = null;
        targetTextArea = null;
    }

    public EscapeDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjCommand = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJSplitPane1 = null;
        ivjResponse = null;
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjPreviousCommands = null;
        ivjJMenuItem1 = null;
        ivjTextAreaPopupMenu = null;
        targetTextArea = null;
    }

    public EscapeDlg(Frame frame)
    {
        super(frame);
        ivjCommand = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJSplitPane1 = null;
        ivjResponse = null;
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjPreviousCommands = null;
        ivjJMenuItem1 = null;
        ivjTextAreaPopupMenu = null;
        targetTextArea = null;
        initialize();
    }

    public EscapeDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjCommand = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJSplitPane1 = null;
        ivjResponse = null;
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjPreviousCommands = null;
        ivjJMenuItem1 = null;
        ivjTextAreaPopupMenu = null;
        targetTextArea = null;
    }

    public EscapeDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjCommand = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJSplitPane1 = null;
        ivjResponse = null;
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjPreviousCommands = null;
        ivjJMenuItem1 = null;
        ivjTextAreaPopupMenu = null;
        targetTextArea = null;
    }

    public EscapeDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjCommand = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFooter = null;
        ivjFooterFlowLayout = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJSeparator1 = null;
        ivjJSplitPane1 = null;
        ivjResponse = null;
        queueManagerModel = null;
        ivjJScrollPane1 = null;
        ivjJScrollPane2 = null;
        ivjPreviousCommands = null;
        ivjJMenuItem1 = null;
        ivjTextAreaPopupMenu = null;
        targetTextArea = null;
    }

    public String buildCommand(String s)
    {
        StringReader stringreader = new StringReader(s);
        BufferedReader bufferedreader = new BufferedReader(stringreader);
        String s1 = "";
        String s2 = null;
        try
        {
            s2 = bufferedreader.readLine();
        }
        catch(Exception _ex) { }
        while(s2 != null) 
        {
            s2 = s2.trim();
            if(s2.endsWith("-") || s2.endsWith("+"))
                s2 = s2.substring(0, s2.length() - 1);
            s1 = s1 + s2;
            try
            {
                s2 = bufferedreader.readLine();
            }
            catch(Exception _ex) { }
        }
        return s1;
    }

    public void clearText()
    {
        targetTextArea.setText("");
    }

    public void close()
    {
        dispose();
    }

    private void connEtoC1(ActionEvent actionevent)
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

    private void connEtoC2(ActionEvent actionevent)
    {
        try
        {
            send();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(MouseEvent mouseevent)
    {
        try
        {
            maybePopup(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(MouseEvent mouseevent)
    {
        try
        {
            maybePopup(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5(MouseEvent mouseevent)
    {
        try
        {
            maybePopup(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(MouseEvent mouseevent)
    {
        try
        {
            maybePopup(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC7(ActionEvent actionevent)
    {
        try
        {
            clearText();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC8(ComponentEvent componentevent)
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

    private void connEtoM1(ActionEvent actionevent)
    {
        try
        {
            getCommand().setText((String)getPreviousCommands().getSelectedItem());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JTextArea getCommand()
    {
        if(ivjCommand == null)
            try
            {
                ivjCommand = new JTextArea();
                ivjCommand.setName("Command");
                ivjCommand.setRows(5);
                ivjCommand.setBounds(0, 0, 160, 120);
                ivjCommand.setColumns(50);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCommand;
    }

    private JPanel getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new JPanel();
                ivjFooter.setName("Footer");
                ivjFooter.setLayout(getFooterFlowLayout());
                getFooter().add(getJButton2(), getJButton2().getName());
                getFooter().add(getJButton3(), getJButton3().getName());
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

    private JButton getJButton2()
    {
        if(ivjJButton2 == null)
            try
            {
                ivjJButton2 = new JButton();
                ivjJButton2.setName("JButton2");
                ivjJButton2.setMnemonic('E');
                ivjJButton2.setText("Execute");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton2;
    }

    private JButton getJButton3()
    {
        if(ivjJButton3 == null)
            try
            {
                ivjJButton3 = new JButton();
                ivjJButton3.setName("JButton3");
                ivjJButton3.setMnemonic('C');
                ivjJButton3.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton3;
    }

    private JPanel getJDialogContentPane()
    {
        if(ivjJDialogContentPane == null)
            try
            {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setLayout(new GridBagLayout());
                ivjJDialogContentPane.setMinimumSize(new Dimension(563, 275));
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 3;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 2;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSplitPane1(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getPreviousCommands(), gridbagconstraints3);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JMenuItem getJMenuItem1()
    {
        if(ivjJMenuItem1 == null)
            try
            {
                ivjJMenuItem1 = new JMenuItem();
                ivjJMenuItem1.setName("JMenuItem1");
                ivjJMenuItem1.setText("Clear");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem1;
    }

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                getJScrollPane1().setViewportView(getResponse());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
    }

    private JScrollPane getJScrollPane2()
    {
        if(ivjJScrollPane2 == null)
            try
            {
                ivjJScrollPane2 = new JScrollPane();
                ivjJScrollPane2.setName("JScrollPane2");
                getJScrollPane2().setViewportView(getCommand());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane2;
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

    private JSplitPane getJSplitPane1()
    {
        if(ivjJSplitPane1 == null)
            try
            {
                ivjJSplitPane1 = new JSplitPane(0);
                ivjJSplitPane1.setName("JSplitPane1");
                ivjJSplitPane1.setDividerLocation(100);
                getJSplitPane1().add(getJScrollPane1(), "bottom");
                getJSplitPane1().add(getJScrollPane2(), "top");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSplitPane1;
    }

    private JComboBox getPreviousCommands()
    {
        if(ivjPreviousCommands == null)
            try
            {
                ivjPreviousCommands = new JComboBox();
                ivjPreviousCommands.setName("PreviousCommands");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPreviousCommands;
    }

    private JTextArea getResponse()
    {
        if(ivjResponse == null)
            try
            {
                ivjResponse = new JTextArea();
                ivjResponse.setName("Response");
                ivjResponse.setRows(5);
                ivjResponse.setFont(new Font("monospaced", 0, 12));
                ivjResponse.setBounds(0, 0, 160, 120);
                ivjResponse.setEditable(false);
                ivjResponse.setColumns(50);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjResponse;
    }

    private JPopupMenu getTextAreaPopupMenu()
    {
        if(ivjTextAreaPopupMenu == null)
            try
            {
                ivjTextAreaPopupMenu = new JPopupMenu();
                ivjTextAreaPopupMenu.setName("TextAreaPopupMenu");
                ivjTextAreaPopupMenu.add(getJMenuItem1());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTextAreaPopupMenu;
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
        getJButton3().addActionListener(ivjEventHandler);
        getJButton2().addActionListener(ivjEventHandler);
        getPreviousCommands().addActionListener(ivjEventHandler);
        getResponse().addMouseListener(ivjEventHandler);
        getCommand().addMouseListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        addComponentListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("EscapeDlg");
            setDefaultCloseOperation(2);
            setSize(569, 384);
            setModal(true);
            setTitle("MQSC Command");
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
            EscapeDlg escapedlg = new EscapeDlg();
            escapedlg.setModal(true);
            escapedlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            escapedlg.show();
            Insets insets = escapedlg.getInsets();
            escapedlg.setSize(escapedlg.getWidth() + insets.left + insets.right, escapedlg.getHeight() + insets.top + insets.bottom);
            escapedlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void maybePopup(MouseEvent mouseevent)
    {
        if(!mouseevent.isPopupTrigger())
        {
            return;
        } else
        {
            targetTextArea = (JTextArea)mouseevent.getComponent();
            getTextAreaPopupMenu().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    void newMethod()
    {
    }

    public void send()
    {
        try
        {
            String s = buildCommand(getCommand().getText());
            JComboBox jcombobox = getPreviousCommands();
            jcombobox.removeItem(s);
            jcombobox.addItem(s);
            jcombobox.setSelectedIndex(jcombobox.getItemCount() - 1);
            String s1 = PCFUtils.escape(queueManagerModel.getAgent(), s);
            getResponse().append(">> " + s + "\n" + s1 + "\n");
        }
        catch(MQException mqexception)
        {
            QueueManagerModel.displayError(mqexception);
        }
    }

    public void setQueueManagerModel(QueueManagerModel queuemanagermodel)
    {
        queueManagerModel = queuemanagermodel;
    }

    private JTextArea ivjCommand;
    IvjEventHandler ivjEventHandler;
    private JPanel ivjFooter;
    private FlowLayout ivjFooterFlowLayout;
    private JButton ivjJButton2;
    private JButton ivjJButton3;
    private JPanel ivjJDialogContentPane;
    private JSeparator ivjJSeparator1;
    private JSplitPane ivjJSplitPane1;
    private JTextArea ivjResponse;
    private QueueManagerModel queueManagerModel;
    private JScrollPane ivjJScrollPane1;
    private JScrollPane ivjJScrollPane2;
    private JComboBox ivjPreviousCommands;
    private JMenuItem ivjJMenuItem1;
    private JPopupMenu ivjTextAreaPopupMenu;
    private JTextArea targetTextArea;















}
