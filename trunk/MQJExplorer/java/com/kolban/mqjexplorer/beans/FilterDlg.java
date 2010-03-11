// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FilterDlg.java

package com.kolban.mqjexplorer.beans;

import com.kolban.mqjexplorer.utils.Filter;
import com.kolban.swing.TableSorter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer.beans:
//            FilterTableModel

public class FilterDlg extends JDialog
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getClearAll())
                connEtoC1();
            if(actionevent.getSource() == getSelectAll())
                connEtoC2();
            if(actionevent.getSource() == getOk())
                connEtoC3();
            if(actionevent.getSource() == getCancel())
                connEtoC4();
        }

        IvjEventHandler()
        {
        }
    }


    public FilterDlg()
    {
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjJPanel1 = null;
        ivjCancel = null;
        ivjOk = null;
        ivjClearAll = null;
        ivjSelectAll = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFilterTable = null;
        filterTableModel = null;
        retVal = 2;
        initialize();
    }

    public FilterDlg(Dialog dialog)
    {
        super(dialog);
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjJPanel1 = null;
        ivjCancel = null;
        ivjOk = null;
        ivjClearAll = null;
        ivjSelectAll = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFilterTable = null;
        filterTableModel = null;
        retVal = 2;
    }

    public FilterDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjJPanel1 = null;
        ivjCancel = null;
        ivjOk = null;
        ivjClearAll = null;
        ivjSelectAll = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFilterTable = null;
        filterTableModel = null;
        retVal = 2;
    }

    public FilterDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjJPanel1 = null;
        ivjCancel = null;
        ivjOk = null;
        ivjClearAll = null;
        ivjSelectAll = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFilterTable = null;
        filterTableModel = null;
        retVal = 2;
    }

    public FilterDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjJPanel1 = null;
        ivjCancel = null;
        ivjOk = null;
        ivjClearAll = null;
        ivjSelectAll = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFilterTable = null;
        filterTableModel = null;
        retVal = 2;
    }

    public FilterDlg(Frame frame)
    {
        super(frame);
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjJPanel1 = null;
        ivjCancel = null;
        ivjOk = null;
        ivjClearAll = null;
        ivjSelectAll = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFilterTable = null;
        filterTableModel = null;
        retVal = 2;
        initialize();
    }

    public FilterDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjJPanel1 = null;
        ivjCancel = null;
        ivjOk = null;
        ivjClearAll = null;
        ivjSelectAll = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFilterTable = null;
        filterTableModel = null;
        retVal = 2;
    }

    public FilterDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjJPanel1 = null;
        ivjCancel = null;
        ivjOk = null;
        ivjClearAll = null;
        ivjSelectAll = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFilterTable = null;
        filterTableModel = null;
        retVal = 2;
    }

    public FilterDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjJDialogContentPane = null;
        ivjJScrollPane1 = null;
        ivjJPanel1 = null;
        ivjCancel = null;
        ivjOk = null;
        ivjClearAll = null;
        ivjSelectAll = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFilterTable = null;
        filterTableModel = null;
        retVal = 2;
    }

    public void cancel_ActionEvents()
    {
        retVal = 2;
        dispose();
    }

    public void clearAll_ActionEvents()
    {
        filterTableModel.clearAll();
    }

    private void connEtoC1()
    {
        try
        {
            clearAll_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2()
    {
        try
        {
            selectAll_ActionEvents();
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
            ok_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4()
    {
        try
        {
            cancel_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JButton getCancel()
    {
        if(ivjCancel == null)
            try
            {
                ivjCancel = new JButton();
                ivjCancel.setName("Cancel");
                ivjCancel.setText("Cancel");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCancel;
    }

    private JButton getClearAll()
    {
        if(ivjClearAll == null)
            try
            {
                ivjClearAll = new JButton();
                ivjClearAll.setName("ClearAll");
                ivjClearAll.setText("Clear All");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClearAll;
    }

    public Filter getData()
    {
        return filterTableModel.getData();
    }

    private JTable getFilterTable()
    {
        if(ivjFilterTable == null)
            try
            {
                ivjFilterTable = new JTable();
                ivjFilterTable.setName("FilterTable");
                getJScrollPane1().setColumnHeaderView(ivjFilterTable.getTableHeader());
                getJScrollPane1().getViewport().setBackingStoreEnabled(true);
                ivjFilterTable.setBounds(0, 0, 200, 200);
                ivjFilterTable.setRowSelectionAllowed(false);
                ivjFilterTable.setShowVerticalLines(false);
                filterTableModel = new FilterTableModel();
                TableSorter tablesorter = new TableSorter(filterTableModel);
                ivjFilterTable.setModel(tablesorter);
                tablesorter.addMouseListenerToHeaderInTable(ivjFilterTable);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFilterTable;
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
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                getJDialogContentPane().add(getJScrollPane1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
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
                ivjJPanel1.setLayout(new FlowLayout());
                getJPanel1().add(getSelectAll(), getSelectAll().getName());
                getJPanel1().add(getClearAll(), getClearAll().getName());
                getJPanel1().add(getOk(), getOk().getName());
                getJPanel1().add(getCancel(), getCancel().getName());
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
                ivjJScrollPane1.setVerticalScrollBarPolicy(22);
                ivjJScrollPane1.setHorizontalScrollBarPolicy(32);
                getJScrollPane1().setViewportView(getFilterTable());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
    }

    private JButton getOk()
    {
        if(ivjOk == null)
            try
            {
                ivjOk = new JButton();
                ivjOk.setName("Ok");
                ivjOk.setText("OK");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOk;
    }

    public int getRetVal()
    {
        return retVal;
    }

    private JButton getSelectAll()
    {
        if(ivjSelectAll == null)
            try
            {
                ivjSelectAll = new JButton();
                ivjSelectAll.setName("SelectAll");
                ivjSelectAll.setText("Select All");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelectAll;
    }

    private void handleException(Throwable throwable)
    {
        System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        throwable.printStackTrace(System.out);
    }

    private void initConnections()
        throws Exception
    {
        getClearAll().addActionListener(ivjEventHandler);
        getSelectAll().addActionListener(ivjEventHandler);
        getOk().addActionListener(ivjEventHandler);
        getCancel().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("FilterDlg");
            setDefaultCloseOperation(2);
            setSize(529, 397);
            setModal(true);
            setTitle("Filter Entries");
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
            Filter filter = new Filter();
            filter.add("A", true);
            filter.add("B", false);
            FilterDlg filterdlg = new FilterDlg();
            filterdlg.setData(filter);
            filterdlg.setModal(true);
            filterdlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            filterdlg.show();
            Insets insets = filterdlg.getInsets();
            filterdlg.setSize(filterdlg.getWidth() + insets.left + insets.right, filterdlg.getHeight() + insets.top + insets.bottom);
            filterdlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void ok_ActionEvents()
    {
        dispose();
        retVal = 1;
    }

    public void selectAll_ActionEvents()
    {
        filterTableModel.setAll();
    }

    public void setData(Filter filter)
    {
        filterTableModel.setData(filter);
    }

    private JPanel ivjJDialogContentPane;
    private JScrollPane ivjJScrollPane1;
    private JPanel ivjJPanel1;
    private JButton ivjCancel;
    private JButton ivjOk;
    private JButton ivjClearAll;
    private JButton ivjSelectAll;
    IvjEventHandler ivjEventHandler;
    private JTable ivjFilterTable;
    private FilterTableModel filterTableModel;
    public static final int OK = 1;
    public static final int CANCEL = 2;
    private int retVal;








}
