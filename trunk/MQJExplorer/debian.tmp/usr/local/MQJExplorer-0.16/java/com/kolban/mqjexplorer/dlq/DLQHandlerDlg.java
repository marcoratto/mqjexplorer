// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DLQHandlerDlg.java

package com.kolban.mqjexplorer.dlq;

import com.kolban.swing.Footer;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

// Referenced classes of package com.kolban.mqjexplorer.dlq:
//            DLQRuleDlg, DLQRule

public class DLQHandlerDlg extends JDialog
{
    class DLQTableModel extends AbstractTableModel
    {

        public Object getValueAt(int i, int j)
        {
            if(rules == null)
                return null;
            String s = getColumnName(j);
            DLQRule dlqrule = (DLQRule)rules.elementAt(i);
            if(s.equals("Description"))
                return dlqrule.getDescription();
            if(s.equals("Enabled"))
                return new Boolean(dlqrule.isEnabled());
            else
                return null;
        }

        public void setValueAt(Object obj, int i, int j)
        {
            DLQRule dlqrule = (DLQRule)rules.elementAt(i);
            dlqrule.setEnabled(((Boolean)obj).booleanValue());
        }

        public Class getColumnClass(int i)
        {
            switch(i)
            {
            case 0: // '\0'
                return java.lang.Boolean.class;

            case 1: // '\001'
                return java.lang.String.class;
            }
            return java.lang.String.class;
        }

        public int getRowCount()
        {
            if(rules == null)
                return 0;
            else
                return rules.size();
        }

        public String getColumnName(int i)
        {
            return columnNames[i];
        }

        public int getColumnCount()
        {
            return columnNames.length;
        }

        public boolean isCellEditable(int i, int j)
        {
            return j == 0;
        }

        private final String columnNames[] = {
            "Enabled", "Description"
        };

        DLQTableModel()
        {
        }
    }

    class IvjEventHandler
        implements ActionListener, PropertyChangeListener, ListSelectionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJButton1())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getJButton2())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getJButton3())
                connEtoC3(actionevent);
        }

        public void propertyChange(PropertyChangeEvent propertychangeevent)
        {
            if(propertychangeevent.getSource() == getRulesTable() && propertychangeevent.getPropertyName().equals("selectionModel"))
                connPtoP1SetTarget();
        }

        public void valueChanged(ListSelectionEvent listselectionevent)
        {
            if(listselectionevent.getSource() == getTableSelectionModel())
                connEtoM1(listselectionevent);
            if(listselectionevent.getSource() == getTableSelectionModel())
                connEtoM2(listselectionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public DLQHandlerDlg()
    {
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        rules = new Vector();
        ivjRulesTable = null;
        ivjConnPtoP1Aligning = false;
        ivjTableSelectionModel = null;
        ivjJButton4 = null;
        ivjJButton5 = null;
        ivjJButton6 = null;
        ivjJSeparator1 = null;
        initialize();
    }

    public DLQHandlerDlg(Dialog dialog)
    {
        super(dialog);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        rules = new Vector();
        ivjRulesTable = null;
        ivjConnPtoP1Aligning = false;
        ivjTableSelectionModel = null;
        ivjJButton4 = null;
        ivjJButton5 = null;
        ivjJButton6 = null;
        ivjJSeparator1 = null;
    }

    public DLQHandlerDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        rules = new Vector();
        ivjRulesTable = null;
        ivjConnPtoP1Aligning = false;
        ivjTableSelectionModel = null;
        ivjJButton4 = null;
        ivjJButton5 = null;
        ivjJButton6 = null;
        ivjJSeparator1 = null;
    }

    public DLQHandlerDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        rules = new Vector();
        ivjRulesTable = null;
        ivjConnPtoP1Aligning = false;
        ivjTableSelectionModel = null;
        ivjJButton4 = null;
        ivjJButton5 = null;
        ivjJButton6 = null;
        ivjJSeparator1 = null;
    }

    public DLQHandlerDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        rules = new Vector();
        ivjRulesTable = null;
        ivjConnPtoP1Aligning = false;
        ivjTableSelectionModel = null;
        ivjJButton4 = null;
        ivjJButton5 = null;
        ivjJButton6 = null;
        ivjJSeparator1 = null;
    }

    public DLQHandlerDlg(Frame frame)
    {
        super(frame);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        rules = new Vector();
        ivjRulesTable = null;
        ivjConnPtoP1Aligning = false;
        ivjTableSelectionModel = null;
        ivjJButton4 = null;
        ivjJButton5 = null;
        ivjJButton6 = null;
        ivjJSeparator1 = null;
    }

    public DLQHandlerDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        rules = new Vector();
        ivjRulesTable = null;
        ivjConnPtoP1Aligning = false;
        ivjTableSelectionModel = null;
        ivjJButton4 = null;
        ivjJButton5 = null;
        ivjJButton6 = null;
        ivjJSeparator1 = null;
    }

    public DLQHandlerDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        rules = new Vector();
        ivjRulesTable = null;
        ivjConnPtoP1Aligning = false;
        ivjTableSelectionModel = null;
        ivjJButton4 = null;
        ivjJButton5 = null;
        ivjJButton6 = null;
        ivjJSeparator1 = null;
    }

    public DLQHandlerDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJButton3 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        rules = new Vector();
        ivjRulesTable = null;
        ivjConnPtoP1Aligning = false;
        ivjTableSelectionModel = null;
        ivjJButton4 = null;
        ivjJButton5 = null;
        ivjJButton6 = null;
        ivjJSeparator1 = null;
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            doAdd();
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
            doDelete();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(ActionEvent actionevent)
    {
        try
        {
            doModify();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM1(ListSelectionEvent listselectionevent)
    {
        try
        {
            getJButton2().setEnabled(tableItemSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM2(ListSelectionEvent listselectionevent)
    {
        try
        {
            getJButton3().setEnabled(tableItemSelected());
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
                if(getTableSelectionModel() != null)
                    getRulesTable().setSelectionModel(getTableSelectionModel());
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
                setTableSelectionModel(getRulesTable().getSelectionModel());
                ivjConnPtoP1Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP1Aligning = false;
            handleException(throwable);
        }
    }

    public void doAdd()
    {
        DLQRuleDlg dlqruledlg = new DLQRuleDlg();
        dlqruledlg.pack();
        dlqruledlg.show();
        rules.addElement(dlqruledlg.getDLQRule());
        int i = rules.size() - 1;
        ((AbstractTableModel)getRulesTable().getModel()).fireTableRowsInserted(i, i);
    }

    public void doDelete()
    {
        int i = getRulesTable().getSelectedRow();
        if(i < 0)
        {
            return;
        } else
        {
            rules.removeElementAt(i);
            ((AbstractTableModel)getRulesTable().getModel()).fireTableRowsDeleted(i, i);
            getTableSelectionModel().removeSelectionInterval(i, i);
            return;
        }
    }

    public void doModify()
    {
        int i = getRulesTable().getSelectedRow();
        if(i < 0)
        {
            return;
        } else
        {
            DLQRuleDlg dlqruledlg = new DLQRuleDlg();
            dlqruledlg.setDLQRule((DLQRule)rules.elementAt(i));
            dlqruledlg.pack();
            dlqruledlg.show();
            rules.setElementAt(dlqruledlg.getDLQRule(), i);
            ((AbstractTableModel)getRulesTable().getModel()).fireTableRowsUpdated(i, i);
            return;
        }
    }

    private Footer getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new Footer();
                ivjFooter.setName("Footer");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
    }

    private JButton getJButton1()
    {
        if(ivjJButton1 == null)
            try
            {
                ivjJButton1 = new JButton();
                ivjJButton1.setName("JButton1");
                ivjJButton1.setText("Add...");
                ivjJButton1.setHorizontalAlignment(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton1;
    }

    private JButton getJButton2()
    {
        if(ivjJButton2 == null)
            try
            {
                ivjJButton2 = new JButton();
                ivjJButton2.setName("JButton2");
                ivjJButton2.setText("Delete...");
                ivjJButton2.setEnabled(false);
                ivjJButton2.setHorizontalAlignment(2);
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
                ivjJButton3.setText("Modify...");
                ivjJButton3.setEnabled(false);
                ivjJButton3.setHorizontalAlignment(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton3;
    }

    private JButton getJButton4()
    {
        if(ivjJButton4 == null)
            try
            {
                ivjJButton4 = new JButton();
                ivjJButton4.setName("JButton4");
                ivjJButton4.setText("JButton4");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton4;
    }

    private JButton getJButton5()
    {
        if(ivjJButton5 == null)
            try
            {
                ivjJButton5 = new JButton();
                ivjJButton5.setName("JButton5");
                ivjJButton5.setText("Start");
                ivjJButton5.setHorizontalAlignment(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton5;
    }

    private JButton getJButton6()
    {
        if(ivjJButton6 == null)
            try
            {
                ivjJButton6 = new JButton();
                ivjJButton6.setName("JButton6");
                ivjJButton6.setText("Stop");
                ivjJButton6.setEnabled(false);
                ivjJButton6.setHorizontalAlignment(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton6;
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
                gridbagconstraints.gridy = 1;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints1);
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
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 1;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 11;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJButton1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.anchor = 11;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJButton2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.anchor = 11;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJButton3(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.gridheight = 6;
                gridbagconstraints3.fill = 1;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJScrollPane1(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 1;
                gridbagconstraints4.gridy = 2;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJButton4(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 3;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJSeparator1(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 1;
                gridbagconstraints6.gridy = 4;
                gridbagconstraints6.fill = 2;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJButton5(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 1;
                gridbagconstraints7.gridy = 5;
                gridbagconstraints7.fill = 2;
                gridbagconstraints7.anchor = 11;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJButton6(), gridbagconstraints7);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
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
                getJScrollPane1().setViewportView(getRulesTable());
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

    private JTable getRulesTable()
    {
        if(ivjRulesTable == null)
            try
            {
                ivjRulesTable = new JTable();
                ivjRulesTable.setName("RulesTable");
                getJScrollPane1().setColumnHeaderView(ivjRulesTable.getTableHeader());
                getJScrollPane1().getViewport().setBackingStoreEnabled(true);
                ivjRulesTable.setBounds(0, 0, 200, 200);
                ivjRulesTable.setModel(new DLQTableModel());
                ivjRulesTable.setDefaultEditor(java.lang.Boolean.class, new DefaultCellEditor(new JCheckBox()));
                ivjRulesTable.getSelectionModel().setSelectionMode(0);
                ivjRulesTable.getColumnModel().getColumn(0).setMaxWidth(100);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRulesTable;
    }

    private ListSelectionModel getTableSelectionModel()
    {
        return ivjTableSelectionModel;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getJButton1().addActionListener(ivjEventHandler);
        getJButton2().addActionListener(ivjEventHandler);
        getJButton3().addActionListener(ivjEventHandler);
        getRulesTable().addPropertyChangeListener(ivjEventHandler);
        connPtoP1SetTarget();
    }

    private void initialize()
    {
        try
        {
            setName("DLQHandlerDlg");
            setDefaultCloseOperation(2);
            setSize(649, 380);
            setTitle("DLQ Processing Rules");
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
            DLQHandlerDlg dlqhandlerdlg = new DLQHandlerDlg();
            dlqhandlerdlg.setModal(true);
            dlqhandlerdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            dlqhandlerdlg.show();
            Insets insets = dlqhandlerdlg.getInsets();
            dlqhandlerdlg.setSize(dlqhandlerdlg.getWidth() + insets.left + insets.right, dlqhandlerdlg.getHeight() + insets.top + insets.bottom);
            dlqhandlerdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void setTableSelectionModel(ListSelectionModel listselectionmodel)
    {
        if(ivjTableSelectionModel != listselectionmodel)
            try
            {
                if(ivjTableSelectionModel != null)
                    ivjTableSelectionModel.removeListSelectionListener(ivjEventHandler);
                ivjTableSelectionModel = listselectionmodel;
                if(ivjTableSelectionModel != null)
                    ivjTableSelectionModel.addListSelectionListener(ivjEventHandler);
                connPtoP1SetSource();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
    }

    public boolean tableItemSelected()
    {
        return !getTableSelectionModel().isSelectionEmpty();
    }

    private Footer ivjFooter;
    private JButton ivjJButton1;
    private JButton ivjJButton2;
    private JButton ivjJButton3;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private JScrollPane ivjJScrollPane1;
    IvjEventHandler ivjEventHandler;
    private Vector rules;
    private JTable ivjRulesTable;
    private boolean ivjConnPtoP1Aligning;
    private ListSelectionModel ivjTableSelectionModel;
    private JButton ivjJButton4;
    private JButton ivjJButton5;
    private JButton ivjJButton6;
    private JSeparator ivjJSeparator1;












}
