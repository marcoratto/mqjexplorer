// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowsePCF.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.MQMessage;
import com.ibm.mq.pcf.PCFMessage;
import com.ibm.mq.pcf.PCFParameter;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class BrowsePCF extends JPanel
{
    class PCFTableModel extends AbstractTableModel
    {

        public int getColumnCount()
        {
            return 2;
        }

        public int getRowCount()
        {
            return pcfTypes.size();
        }

        public Object getValueAt(int i, int j)
        {
            if(j == 0)
                return pcfTypes.elementAt(i);
            if(j == 1)
                return pcfValues.elementAt(i);
            else
                return null;
        }

        public String getColumnName(int i)
        {
            if(i == 0)
                return "Type";
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

        PCFTableModel()
        {
        }
    }


    public BrowsePCF()
    {
        ivjCommand = null;
        ivjCompCode = null;
        ivjControl = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjReason = null;
        ivjSeqNumber = null;
        ivjType = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        pcfTypes = null;
        pcfValues = null;
        initialize();
    }

    public BrowsePCF(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjCommand = null;
        ivjCompCode = null;
        ivjControl = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjReason = null;
        ivjSeqNumber = null;
        ivjType = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        pcfTypes = null;
        pcfValues = null;
    }

    public BrowsePCF(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjCommand = null;
        ivjCompCode = null;
        ivjControl = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjReason = null;
        ivjSeqNumber = null;
        ivjType = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        pcfTypes = null;
        pcfValues = null;
    }

    public BrowsePCF(boolean flag)
    {
        super(flag);
        ivjCommand = null;
        ivjCompCode = null;
        ivjControl = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjReason = null;
        ivjSeqNumber = null;
        ivjType = null;
        ivjJScrollPane1 = null;
        ivjTable = null;
        pcfTypes = null;
        pcfValues = null;
    }

    private JLabel getCommand()
    {
        if(ivjCommand == null)
            try
            {
                ivjCommand = new JLabel();
                ivjCommand.setName("Command");
                ivjCommand.setText("JLabel8");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCommand;
    }

    private JLabel getCompCode()
    {
        if(ivjCompCode == null)
            try
            {
                ivjCompCode = new JLabel();
                ivjCompCode.setName("CompCode");
                ivjCompCode.setText("JLabel11");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCompCode;
    }

    private JLabel getControl()
    {
        if(ivjControl == null)
            try
            {
                ivjControl = new JLabel();
                ivjControl.setName("Control");
                ivjControl.setText("JLabel10");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjControl;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Type:");
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
                ivjJLabel2.setText("Command:");
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
                ivjJLabel3.setText("Sequence Number:");
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
                ivjJLabel4.setText("Control:");
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
                ivjJLabel5.setText("Comp Code:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel5;
    }

    private JLabel getJLabel6()
    {
        if(ivjJLabel6 == null)
            try
            {
                ivjJLabel6 = new JLabel();
                ivjJLabel6.setName("JLabel6");
                ivjJLabel6.setText("Reason:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel6;
    }

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                ivjJScrollPane1.setVerticalScrollBarPolicy(22);
                ivjJScrollPane1.setHorizontalScrollBarPolicy(32);
                getJScrollPane1().setViewportView(getTable());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
    }

    private JLabel getReason()
    {
        if(ivjReason == null)
            try
            {
                ivjReason = new JLabel();
                ivjReason.setName("Reason");
                ivjReason.setText("JLabel12");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReason;
    }

    private JLabel getSeqNumber()
    {
        if(ivjSeqNumber == null)
            try
            {
                ivjSeqNumber = new JLabel();
                ivjSeqNumber.setName("SeqNumber");
                ivjSeqNumber.setText("JLabel9");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSeqNumber;
    }

    private JTable getTable()
    {
        if(ivjTable == null)
            try
            {
                ivjTable = new JTable();
                ivjTable.setName("Table");
                getJScrollPane1().setColumnHeaderView(ivjTable.getTableHeader());
                getJScrollPane1().getViewport().setBackingStoreEnabled(true);
                ivjTable.setBounds(0, 0, 200, 200);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTable;
    }

    private JLabel getType()
    {
        if(ivjType == null)
            try
            {
                ivjType = new JLabel();
                ivjType.setName("Type");
                ivjType.setText("JLabel7");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjType;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            getTable().setModel(new PCFTableModel());
            setName("BrowsePCF");
            setLayout(new GridBagLayout());
            setSize(395, 314);
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
            gridbagconstraints4.gridx = 0;
            gridbagconstraints4.gridy = 4;
            gridbagconstraints4.anchor = 17;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getJLabel5(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 0;
            gridbagconstraints5.gridy = 5;
            gridbagconstraints5.anchor = 17;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getJLabel6(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 0;
            gridbagconstraints6.anchor = 17;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getType(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 1;
            gridbagconstraints7.anchor = 17;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getCommand(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 1;
            gridbagconstraints8.gridy = 2;
            gridbagconstraints8.anchor = 17;
            gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
            add(getSeqNumber(), gridbagconstraints8);
            GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
            gridbagconstraints9.gridx = 1;
            gridbagconstraints9.gridy = 3;
            gridbagconstraints9.anchor = 17;
            gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
            add(getControl(), gridbagconstraints9);
            GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
            gridbagconstraints10.gridx = 1;
            gridbagconstraints10.gridy = 4;
            gridbagconstraints10.anchor = 17;
            gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
            add(getCompCode(), gridbagconstraints10);
            GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
            gridbagconstraints11.gridx = 1;
            gridbagconstraints11.gridy = 5;
            gridbagconstraints11.anchor = 17;
            gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
            add(getReason(), gridbagconstraints11);
            GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
            gridbagconstraints12.gridx = 0;
            gridbagconstraints12.gridy = 6;
            gridbagconstraints12.gridwidth = 2;
            gridbagconstraints12.fill = 1;
            gridbagconstraints12.weightx = 1.0D;
            gridbagconstraints12.weighty = 1.0D;
            gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
            add(getJScrollPane1(), gridbagconstraints12);
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
            BrowsePCF browsepcf = new BrowsePCF();
            jframe.setContentPane(browsepcf);
            jframe.setSize(browsepcf.getSize());
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
        try
        {
            PCFMessage pcfmessage = new PCFMessage(mqmessage);
            getCommand().setText(Integer.toString(pcfmessage.getCommand()));
            getCompCode().setText(Integer.toString(pcfmessage.getCompCode()));
            getControl().setText(pcfmessage.getControl() != 1 ? "Not Last" : "Last");
            getReason().setText(Integer.toString(pcfmessage.getReason()));
            getSeqNumber().setText(Integer.toString(pcfmessage.getMsgSeqNumber()));
            pcfmessage.getParameterCount();
            pcfTypes = new Vector();
            pcfValues = new Vector();
            PCFParameter pcfparameter;
            for(Enumeration enumeration = pcfmessage.getParameters(); enumeration.hasMoreElements(); pcfTypes.addElement(new Integer(pcfparameter.getParameter())))
            {
                pcfparameter = (PCFParameter)enumeration.nextElement();
                pcfValues.addElement(pcfparameter.getStringValue());
            }

        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    private JLabel ivjCommand;
    private JLabel ivjCompCode;
    private JLabel ivjControl;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjReason;
    private JLabel ivjSeqNumber;
    private JLabel ivjType;
    private JScrollPane ivjJScrollPane1;
    private JTable ivjTable;
    private Vector pcfTypes;
    private Vector pcfValues;


}
