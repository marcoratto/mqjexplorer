// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseMQRFH1.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMessage;
import com.kolban.mq.MQRFH;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class BrowseMQRFH1 extends JPanel
{
    class RFH1TableModel extends AbstractTableModel
    {

        public int getColumnCount()
        {
            return 2;
        }

        public int getRowCount()
        {
            return rfh1.getEntryCount();
        }

        public Object getValueAt(int i, int j)
        {
            if(j == 0)
                return rfh1.getName(i);
            if(j == 1)
                return rfh1.getValue(i);
            else
                return null;
        }

        public String getColumnName(int i)
        {
            if(i == 0)
                return "Name";
            else
                return "Value";
        }

        public boolean isCellEditable(int i, int j)
        {
            return false;
        }

        public void setValueAt(Object obj, int i, int j)
        {
        }

        RFH1TableModel()
        {
        }
    }


    public BrowseMQRFH1()
    {
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFlags = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        rfh1 = null;
        ivjEntryTable = null;
        ivjJScrollPane1 = null;
        initialize();
    }

    public BrowseMQRFH1(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFlags = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        rfh1 = null;
        ivjEntryTable = null;
        ivjJScrollPane1 = null;
    }

    public BrowseMQRFH1(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFlags = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        rfh1 = null;
        ivjEntryTable = null;
        ivjJScrollPane1 = null;
    }

    public BrowseMQRFH1(boolean flag)
    {
        super(flag);
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFlags = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        rfh1 = null;
        ivjEntryTable = null;
        ivjJScrollPane1 = null;
    }

    private JLabel getCCSID()
    {
        if(ivjCCSID == null)
            try
            {
                ivjCCSID = new JLabel();
                ivjCCSID.setName("CCSID");
                ivjCCSID.setText("JLabel6");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCCSID;
    }

    private JLabel getEncoding()
    {
        if(ivjEncoding == null)
            try
            {
                ivjEncoding = new JLabel();
                ivjEncoding.setName("Encoding");
                ivjEncoding.setText("JLabel5");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEncoding;
    }

    private JTable getEntryTable()
    {
        if(ivjEntryTable == null)
            try
            {
                ivjEntryTable = new JTable();
                ivjEntryTable.setName("EntryTable");
                getJScrollPane1().setColumnHeaderView(ivjEntryTable.getTableHeader());
                getJScrollPane1().getViewport().setBackingStoreEnabled(true);
                ivjEntryTable.setBounds(0, 0, 200, 200);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEntryTable;
    }

    private JLabel getFlags()
    {
        if(ivjFlags == null)
            try
            {
                ivjFlags = new JLabel();
                ivjFlags.setName("Flags");
                ivjFlags.setText("JLabel8");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFlags;
    }

    private JLabel getFormat()
    {
        if(ivjFormat == null)
            try
            {
                ivjFormat = new JLabel();
                ivjFormat.setName("Format");
                ivjFormat.setText("JLabel7");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFormat;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Encoding:");
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
                ivjJLabel2.setText("CCSID:");
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
                ivjJLabel3.setText("Format:");
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
                ivjJLabel4.setText("Flags:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel4;
    }

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                ivjJScrollPane1.setVerticalScrollBarPolicy(20);
                ivjJScrollPane1.setHorizontalScrollBarPolicy(30);
                getJScrollPane1().setViewportView(getEntryTable());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            getEntryTable().setModel(new RFH1TableModel());
            setName("BrowseMQRFH1");
            setLayout(new GridBagLayout());
            setSize(397, 287);
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
            gridbagconstraints4.gridx = 1;
            gridbagconstraints4.gridy = 0;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getEncoding(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 1;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getCCSID(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 2;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getFormat(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 3;
            gridbagconstraints7.anchor = 17;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getFlags(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 4;
            gridbagconstraints8.gridwidth = 2;
            gridbagconstraints8.fill = 1;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.weighty = 1.0D;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getJScrollPane1(), gridbagconstraints8);
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
            BrowseMQRFH1 browsemqrfh1 = new BrowseMQRFH1();
            jframe.setContentPane(browsemqrfh1);
            jframe.setSize(browsemqrfh1.getSize());
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
        rfh1 = new MQRFH();
        rfh1.setFromMessage(mqmessage);
        getCCSID().setText(Integer.toString(rfh1.getCodedCharSetId()));
        getEncoding().setText(Integer.toString(rfh1.getEncoding()));
        getFlags().setText(Integer.toString(rfh1.getFlags()));
        getFormat().setText(rfh1.getFormat());
    }

    private JLabel ivjCCSID;
    private JLabel ivjEncoding;
    private JLabel ivjFlags;
    private JLabel ivjFormat;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private MQRFH rfh1;
    private JTable ivjEntryTable;
    private JScrollPane ivjJScrollPane1;

}
