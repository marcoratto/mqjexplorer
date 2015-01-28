// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StatusBar.java

package com.kolban.mqjexplorer.guibeans;

import com.kolban.mqjexplorer.QueueView;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StatusBar extends JPanel
{
    class IvjEventHandler
        implements MouseListener
    {

        public void mouseClicked(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getFilteredIcon())
                connEtoC1(mouseevent);
        }

        public void mouseEntered(MouseEvent mouseevent)
        {
        }

        public void mouseExited(MouseEvent mouseevent)
        {
        }

        public void mousePressed(MouseEvent mouseevent)
        {
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
        }

        IvjEventHandler()
        {
        }
    }


    public StatusBar()
    {
        ivjMessageTextArea = null;
        fieldMessageText = new String();
        ivjIcons = null;
        ivjFilteredIcon = null;
        ivjEventHandler = new IvjEventHandler();
        queueView = null;
        initialize();
    }

    public StatusBar(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjMessageTextArea = null;
        fieldMessageText = new String();
        ivjIcons = null;
        ivjFilteredIcon = null;
        ivjEventHandler = new IvjEventHandler();
        queueView = null;
    }

    public StatusBar(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjMessageTextArea = null;
        fieldMessageText = new String();
        ivjIcons = null;
        ivjFilteredIcon = null;
        ivjEventHandler = new IvjEventHandler();
        queueView = null;
    }

    public StatusBar(boolean flag)
    {
        super(flag);
        ivjMessageTextArea = null;
        fieldMessageText = new String();
        ivjIcons = null;
        ivjFilteredIcon = null;
        ivjEventHandler = new IvjEventHandler();
        queueView = null;
    }

    private void connEtoC1(MouseEvent mouseevent)
    {
        try
        {
            filteredIconClicked(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public void filteredIconClicked(MouseEvent mouseevent)
    {
        if(queueView != null)
            queueView.filterDlg();
    }

    private JLabel getFilteredIcon()
    {
        if(ivjFilteredIcon == null)
            try
            {
                ivjFilteredIcon = new JLabel();
                ivjFilteredIcon.setName("FilteredIcon");
                ivjFilteredIcon.setText("");
                ivjFilteredIcon.setIcon(new ImageIcon(getClass().getResource("/icons/F_Green.gif")));
                ivjFilteredIcon.setPreferredSize(new Dimension(16, 16));
                ivjFilteredIcon.setMinimumSize(new Dimension(16, 16));
                ivjFilteredIcon.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFilteredIcon;
    }

    private JPanel getIcons()
    {
        if(ivjIcons == null)
            try
            {
                ivjIcons = new JPanel();
                ivjIcons.setName("Icons");
                ivjIcons.setPreferredSize(new Dimension(20, 20));
                ivjIcons.setLayout(new GridBagLayout());
                ivjIcons.setMinimumSize(new Dimension(20, 20));
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 1;
                gridbagconstraints.gridy = 1;
                getIcons().add(getFilteredIcon(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjIcons;
    }

    private JLabel getMessageTextArea()
    {
        if(ivjMessageTextArea == null)
            try
            {
                ivjMessageTextArea = new JLabel();
                ivjMessageTextArea.setName("MessageTextArea");
                ivjMessageTextArea.setBorder(BorderFactory.createLoweredBevelBorder());
                ivjMessageTextArea.setText("");
                ivjMessageTextArea.setBorder(BorderFactory.createCompoundBorder(ivjMessageTextArea.getBorder(), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageTextArea;
    }

    private QueueView getQueueView()
    {
        return queueView;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getFilteredIcon().addMouseListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("StatusBar");
            setLayout(new GridBagLayout());
            setComponentOrientation(ComponentOrientation.UNKNOWN);
            setSize(598, 55);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.fill = 1;
            gridbagconstraints.weightx = 1.0D;
            gridbagconstraints.insets = new Insets(4, 0, 4, 0);
            add(getMessageTextArea(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 1;
            gridbagconstraints1.gridy = 0;
            gridbagconstraints1.anchor = 13;
            gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
            add(getIcons(), gridbagconstraints1);
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
            StatusBar statusbar = new StatusBar();
            jframe.setContentPane(statusbar);
            jframe.setSize(statusbar.getSize());
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

    public void setFiltered(boolean flag)
    {
        getFilteredIcon().setEnabled(flag);
        getFilteredIcon().repaint();
        if(flag)
            getFilteredIcon().setToolTipText("Filtering is on");
        else
            getFilteredIcon().setToolTipText("No filtering");
    }

    public void setMessageText(String s)
    {
        fieldMessageText = s;
        getMessageTextArea().setText(fieldMessageText);
    }

    public void setQueueView(QueueView queueview)
    {
        queueView = queueview;
    }

    private JLabel ivjMessageTextArea;
    private String fieldMessageText;
    private JPanel ivjIcons;
    private JLabel ivjFilteredIcon;
    IvjEventHandler ivjEventHandler;
    private QueueView queueView;


}
