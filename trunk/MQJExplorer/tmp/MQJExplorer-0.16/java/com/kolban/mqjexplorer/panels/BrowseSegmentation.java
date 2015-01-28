// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseSegmentation.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class BrowseSegmentation extends JPanel
{

    public BrowseSegmentation()
    {
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLogicalSequenceNumber = null;
        ivjMessageFlags = null;
        ivjOffset = null;
        ivjInGroup = null;
        ivjInLogical = null;
        ivjLastInGroup = null;
        ivjLastInLogical = null;
        ivjSegmentation = null;
        initialize();
    }

    public BrowseSegmentation(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLogicalSequenceNumber = null;
        ivjMessageFlags = null;
        ivjOffset = null;
        ivjInGroup = null;
        ivjInLogical = null;
        ivjLastInGroup = null;
        ivjLastInLogical = null;
        ivjSegmentation = null;
    }

    public BrowseSegmentation(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLogicalSequenceNumber = null;
        ivjMessageFlags = null;
        ivjOffset = null;
        ivjInGroup = null;
        ivjInLogical = null;
        ivjLastInGroup = null;
        ivjLastInLogical = null;
        ivjSegmentation = null;
    }

    public BrowseSegmentation(boolean flag)
    {
        super(flag);
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJPanel1 = null;
        ivjJPanel2 = null;
        ivjLogicalSequenceNumber = null;
        ivjMessageFlags = null;
        ivjOffset = null;
        ivjInGroup = null;
        ivjInLogical = null;
        ivjLastInGroup = null;
        ivjLastInLogical = null;
        ivjSegmentation = null;
    }

    private JLabel getInGroup()
    {
        if(ivjInGroup == null)
            try
            {
                ivjInGroup = new JLabel();
                ivjInGroup.setName("InGroup");
                ivjInGroup.setIcon(new ImageIcon(getClass().getResource("/icons/Cross16_1.gif")));
                ivjInGroup.setIconTextGap(8);
                ivjInGroup.setText("Message is a member of a group");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInGroup;
    }

    private JLabel getInLogical()
    {
        if(ivjInLogical == null)
            try
            {
                ivjInLogical = new JLabel();
                ivjInLogical.setName("InLogical");
                ivjInLogical.setIcon(new ImageIcon(getClass().getResource("/icons/Cross16_1.gif")));
                ivjInLogical.setIconTextGap(8);
                ivjInLogical.setText("Message is a segment of a logical message");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInLogical;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Logical Sequence Number:");
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
                ivjJLabel2.setText("Offset:");
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
                ivjJLabel3.setText("Message Flags:");
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
                ivjJPanel1.setBorder(BorderFactory.createTitledBorder("Message Flags"));
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel3(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getMessageFlags(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.gridwidth = 2;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 8, 4, 4);
                getJPanel1().add(getSegmentation(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.gridwidth = 2;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 8, 4, 4);
                getJPanel1().add(getInGroup(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 3;
                gridbagconstraints4.gridwidth = 2;
                gridbagconstraints4.fill = 2;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 8, 4, 4);
                getJPanel1().add(getLastInGroup(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 4;
                gridbagconstraints5.gridwidth = 2;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 8, 4, 4);
                getJPanel1().add(getInLogical(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 5;
                gridbagconstraints6.gridwidth = 2;
                gridbagconstraints6.fill = 2;
                gridbagconstraints6.anchor = 17;
                gridbagconstraints6.insets = new Insets(4, 8, 4, 4);
                getJPanel1().add(getLastInLogical(), gridbagconstraints6);
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
                ivjJPanel2.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
    }

    private JLabel getLastInGroup()
    {
        if(ivjLastInGroup == null)
            try
            {
                ivjLastInGroup = new JLabel();
                ivjLastInGroup.setName("LastInGroup");
                ivjLastInGroup.setIcon(new ImageIcon(getClass().getResource("/icons/Cross16_1.gif")));
                ivjLastInGroup.setIconTextGap(8);
                ivjLastInGroup.setText("Message is the last logical message in a group");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLastInGroup;
    }

    private JLabel getLastInLogical()
    {
        if(ivjLastInLogical == null)
            try
            {
                ivjLastInLogical = new JLabel();
                ivjLastInLogical.setName("LastInLogical");
                ivjLastInLogical.setIcon(new ImageIcon(getClass().getResource("/icons/Cross16_1.gif")));
                ivjLastInLogical.setIconTextGap(8);
                ivjLastInLogical.setText("Message is the last segment of a logical message");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLastInLogical;
    }

    private JTextField getLogicalSequenceNumber()
    {
        if(ivjLogicalSequenceNumber == null)
            try
            {
                ivjLogicalSequenceNumber = new JTextField();
                ivjLogicalSequenceNumber.setName("LogicalSequenceNumber");
                ivjLogicalSequenceNumber.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLogicalSequenceNumber;
    }

    private JTextField getMessageFlags()
    {
        if(ivjMessageFlags == null)
            try
            {
                ivjMessageFlags = new JTextField();
                ivjMessageFlags.setName("MessageFlags");
                ivjMessageFlags.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageFlags;
    }

    private JTextField getOffset()
    {
        if(ivjOffset == null)
            try
            {
                ivjOffset = new JTextField();
                ivjOffset.setName("Offset");
                ivjOffset.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOffset;
    }

    private JLabel getSegmentation()
    {
        if(ivjSegmentation == null)
            try
            {
                ivjSegmentation = new JLabel();
                ivjSegmentation.setName("Segmentation");
                ivjSegmentation.setIcon(new ImageIcon(getClass().getResource("/icons/Cross16_1.gif")));
                ivjSegmentation.setIconTextGap(8);
                ivjSegmentation.setText("Segmentation allowed");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSegmentation;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("BrowseSegmentation");
            setLayout(new GridBagLayout());
            setSize(290, 359);
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
            gridbagconstraints2.gridx = 1;
            gridbagconstraints2.gridy = 0;
            gridbagconstraints2.fill = 2;
            gridbagconstraints2.weightx = 1.0D;
            gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
            add(getLogicalSequenceNumber(), gridbagconstraints2);
            GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
            gridbagconstraints3.gridx = 1;
            gridbagconstraints3.gridy = 1;
            gridbagconstraints3.fill = 2;
            gridbagconstraints3.weightx = 1.0D;
            gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
            add(getOffset(), gridbagconstraints3);
            GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 2;
            gridbagconstraints4.gridwidth = 2;
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.anchor = 11;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.weighty = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJPanel1(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 3;
            gridbagconstraints5.gridwidth = 2;
            gridbagconstraints5.fill = 1;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.weighty = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getJPanel2(), gridbagconstraints5);
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
            BrowseSegmentation browsesegmentation = new BrowseSegmentation();
            jframe.setContentPane(browsesegmentation);
            jframe.setSize(browsesegmentation.getSize());
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
        getLogicalSequenceNumber().setText(Integer.toString(((MQMD) (mqmessage)).messageSequenceNumber));
        getMessageFlags().setText(Integer.toString(((MQMD) (mqmessage)).messageFlags));
        getOffset().setText(Integer.toString(((MQMD) (mqmessage)).offset));
        ImageIcon imageicon = new ImageIcon(getClass().getResource("/icons/Tick16_1.gif"));
        if((((MQMD) (mqmessage)).messageFlags & 1) != 0)
            getSegmentation().setIcon(imageicon);
        if((((MQMD) (mqmessage)).messageFlags & 8) != 0)
            getInGroup().setIcon(imageicon);
        if((((MQMD) (mqmessage)).messageFlags & 0x10) != 0)
            getLastInGroup().setIcon(imageicon);
        if((((MQMD) (mqmessage)).messageFlags & 2) != 0)
            getInLogical().setIcon(imageicon);
        if((((MQMD) (mqmessage)).messageFlags & 4) != 0)
            getLastInLogical().setIcon(imageicon);
    }

    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JPanel ivjJPanel1;
    private JPanel ivjJPanel2;
    private JTextField ivjLogicalSequenceNumber;
    private JTextField ivjMessageFlags;
    private JTextField ivjOffset;
    private JLabel ivjInGroup;
    private JLabel ivjInLogical;
    private JLabel ivjLastInGroup;
    private JLabel ivjLastInLogical;
    private JLabel ivjSegmentation;
}
