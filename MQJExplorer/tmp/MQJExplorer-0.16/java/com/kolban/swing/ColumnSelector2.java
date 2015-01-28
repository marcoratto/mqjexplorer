// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ColumnSelector2.java

package com.kolban.swing;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

// Referenced classes of package com.kolban.swing:
//            TableMetaData

public class ColumnSelector2 extends JDialog
{
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getOk())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getMoveDown())
                connEtoC2();
            if(actionevent.getSource() == getMoveUp())
                connEtoC3();
            if(actionevent.getSource() == getHide())
                connEtoC4();
            if(actionevent.getSource() == getShow())
                connEtoC5();
        }

        IvjEventHandler()
        {
        }
    }


    public ColumnSelector2()
    {
        ivjEventHandler = new IvjEventHandler();
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjHide = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjMoveDown = null;
        ivjMoveUp = null;
        ivjOk = null;
        ivjShow = null;
        ivjHiddenList = null;
        ivjVisibleList = null;
        ivjHiddenScrollPane = null;
        ivjVisibleScrollPane = null;
        initialize();
    }

    public ColumnSelector2(Dialog dialog)
    {
        super(dialog);
        ivjEventHandler = new IvjEventHandler();
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjHide = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjMoveDown = null;
        ivjMoveUp = null;
        ivjOk = null;
        ivjShow = null;
        ivjHiddenList = null;
        ivjVisibleList = null;
        ivjHiddenScrollPane = null;
        ivjVisibleScrollPane = null;
        initialize();
    }

    public ColumnSelector2(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjEventHandler = new IvjEventHandler();
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjHide = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjMoveDown = null;
        ivjMoveUp = null;
        ivjOk = null;
        ivjShow = null;
        ivjHiddenList = null;
        ivjVisibleList = null;
        ivjHiddenScrollPane = null;
        ivjVisibleScrollPane = null;
    }

    public ColumnSelector2(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjEventHandler = new IvjEventHandler();
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjHide = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjMoveDown = null;
        ivjMoveUp = null;
        ivjOk = null;
        ivjShow = null;
        ivjHiddenList = null;
        ivjVisibleList = null;
        ivjHiddenScrollPane = null;
        ivjVisibleScrollPane = null;
    }

    public ColumnSelector2(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjEventHandler = new IvjEventHandler();
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjHide = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjMoveDown = null;
        ivjMoveUp = null;
        ivjOk = null;
        ivjShow = null;
        ivjHiddenList = null;
        ivjVisibleList = null;
        ivjHiddenScrollPane = null;
        ivjVisibleScrollPane = null;
    }

    public ColumnSelector2(Frame frame)
    {
        super(frame);
        ivjEventHandler = new IvjEventHandler();
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjHide = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjMoveDown = null;
        ivjMoveUp = null;
        ivjOk = null;
        ivjShow = null;
        ivjHiddenList = null;
        ivjVisibleList = null;
        ivjHiddenScrollPane = null;
        ivjVisibleScrollPane = null;
        initialize();
    }

    public ColumnSelector2(Frame frame, String s)
    {
        super(frame, s);
        ivjEventHandler = new IvjEventHandler();
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjHide = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjMoveDown = null;
        ivjMoveUp = null;
        ivjOk = null;
        ivjShow = null;
        ivjHiddenList = null;
        ivjVisibleList = null;
        ivjHiddenScrollPane = null;
        ivjVisibleScrollPane = null;
    }

    public ColumnSelector2(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjEventHandler = new IvjEventHandler();
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjHide = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjMoveDown = null;
        ivjMoveUp = null;
        ivjOk = null;
        ivjShow = null;
        ivjHiddenList = null;
        ivjVisibleList = null;
        ivjHiddenScrollPane = null;
        ivjVisibleScrollPane = null;
    }

    public ColumnSelector2(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjEventHandler = new IvjEventHandler();
        ivjFooterPanel = null;
        ivjFooterPanelFlowLayout = null;
        ivjHide = null;
        ivjJDialogContentPane = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJPanel1 = null;
        ivjJSeparator1 = null;
        ivjMoveDown = null;
        ivjMoveUp = null;
        ivjOk = null;
        ivjShow = null;
        ivjHiddenList = null;
        ivjVisibleList = null;
        ivjHiddenScrollPane = null;
        ivjVisibleScrollPane = null;
    }

    private void connEtoC1()
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

    private void connEtoC1(ActionEvent actionevent)
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

    private void connEtoC2()
    {
        try
        {
            moveDown_ActionEvents();
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
            moveUp_ActionEvents();
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
            hide_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5()
    {
        try
        {
            show_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JPanel getFooterPanel()
    {
        if(ivjFooterPanel == null)
            try
            {
                ivjFooterPanel = new JPanel();
                ivjFooterPanel.setName("FooterPanel");
                ivjFooterPanel.setLayout(getFooterPanelFlowLayout());
                getFooterPanel().add(getMoveUp(), getMoveUp().getName());
                getFooterPanel().add(getMoveDown(), getMoveDown().getName());
                getFooterPanel().add(getOk(), getOk().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooterPanel;
    }

    private FlowLayout getFooterPanelFlowLayout()
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

    private JList getHiddenList()
    {
        if(ivjHiddenList == null)
            try
            {
                ivjHiddenList = new JList();
                ivjHiddenList.setName("HiddenList");
                ivjHiddenList.setBounds(0, 0, 121, 167);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHiddenList;
    }

    private JScrollPane getHiddenScrollPane()
    {
        if(ivjHiddenScrollPane == null)
            try
            {
                ivjHiddenScrollPane = new JScrollPane();
                ivjHiddenScrollPane.setName("HiddenScrollPane");
                ivjHiddenScrollPane.setVerticalScrollBarPolicy(22);
                ivjHiddenScrollPane.setHorizontalScrollBarPolicy(30);
                getHiddenScrollPane().setViewportView(getHiddenList());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHiddenScrollPane;
    }

    private JButton getHide()
    {
        if(ivjHide == null)
            try
            {
                ivjHide = new JButton();
                ivjHide.setName("Hide");
                ivjHide.setIcon(new ImageIcon(getClass().getResource("/icons/Back16.gif")));
                ivjHide.setMnemonic('H');
                ivjHide.setText("Hide");
                ivjHide.setHorizontalAlignment(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHide;
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
                gridbagconstraints.gridy = 3;
                gridbagconstraints.gridwidth = 3;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooterPanel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJLabel1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 2;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJLabel2(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.fill = 1;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getHiddenScrollPane(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 2;
                gridbagconstraints4.gridy = 1;
                gridbagconstraints4.fill = 1;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.weighty = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getVisibleScrollPane(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 1;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 2;
                gridbagconstraints6.gridwidth = 3;
                gridbagconstraints6.fill = 2;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJSeparator1(), gridbagconstraints6);
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
                ivjJLabel1.setText("Available Columns");
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
                ivjJLabel2.setText("Visible Columns");
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
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 2;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getShow(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getHide(), gridbagconstraints1);
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

    private JButton getMoveDown()
    {
        if(ivjMoveDown == null)
            try
            {
                ivjMoveDown = new JButton();
                ivjMoveDown.setName("MoveDown");
                ivjMoveDown.setIcon(new ImageIcon(getClass().getResource("/icons/Down16.gif")));
                ivjMoveDown.setMnemonic('D');
                ivjMoveDown.setText("Move Down");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMoveDown;
    }

    private JButton getMoveUp()
    {
        if(ivjMoveUp == null)
            try
            {
                ivjMoveUp = new JButton();
                ivjMoveUp.setName("MoveUp");
                ivjMoveUp.setIcon(new ImageIcon(getClass().getResource("/icons/Up16.gif")));
                ivjMoveUp.setMnemonic('U');
                ivjMoveUp.setText("Move Up");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMoveUp;
    }

    private JButton getOk()
    {
        if(ivjOk == null)
            try
            {
                ivjOk = new JButton();
                ivjOk.setName("Ok");
                ivjOk.setMnemonic('O');
                ivjOk.setText("OK");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjOk;
    }

    private JButton getShow()
    {
        if(ivjShow == null)
            try
            {
                ivjShow = new JButton();
                ivjShow.setName("Show");
                ivjShow.setIcon(new ImageIcon(getClass().getResource("/icons/Forward16.gif")));
                ivjShow.setMnemonic('S');
                ivjShow.setText("Show");
                ivjShow.setHorizontalAlignment(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjShow;
    }

    private JList getVisibleList()
    {
        if(ivjVisibleList == null)
            try
            {
                ivjVisibleList = new JList();
                ivjVisibleList.setName("VisibleList");
                ivjVisibleList.setBounds(0, 0, 121, 167);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjVisibleList;
    }

    private JScrollPane getVisibleScrollPane()
    {
        if(ivjVisibleScrollPane == null)
            try
            {
                ivjVisibleScrollPane = new JScrollPane();
                ivjVisibleScrollPane.setName("VisibleScrollPane");
                ivjVisibleScrollPane.setVerticalScrollBarPolicy(22);
                getVisibleScrollPane().setViewportView(getVisibleList());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjVisibleScrollPane;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void hide_ActionEvents()
    {
        int i = getVisibleList().getSelectedIndex();
        if(i < 0)
            return;
        DefaultListModel defaultlistmodel = (DefaultListModel)getHiddenList().getModel();
        DefaultListModel defaultlistmodel1 = (DefaultListModel)getVisibleList().getModel();
        String s = (String)defaultlistmodel1.getElementAt(i);
        defaultlistmodel1.remove(i);
        getHiddenList().getSelectedIndex();
        i = getHiddenList().getSelectedIndex();
        if(i < 0)
            defaultlistmodel.addElement(s);
        else
            defaultlistmodel.add(i + 1, s);
        getHiddenList().setSelectedValue(s, true);
    }

    private void initConnections()
        throws Exception
    {
        getOk().addActionListener(ivjEventHandler);
        getMoveDown().addActionListener(ivjEventHandler);
        getMoveUp().addActionListener(ivjEventHandler);
        getHide().addActionListener(ivjEventHandler);
        getShow().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("ColumnSelector2");
            setDefaultCloseOperation(2);
            setSize(596, 272);
            setModal(true);
            setTitle("Show/Hide Columns");
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
            ColumnSelector2 columnselector2 = new ColumnSelector2();
            columnselector2.setModal(true);
            columnselector2.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            columnselector2.show();
            Insets insets = columnselector2.getInsets();
            columnselector2.setSize(columnselector2.getWidth() + insets.left + insets.right, columnselector2.getHeight() + insets.top + insets.bottom);
            columnselector2.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void moveDown_ActionEvents()
    {
        DefaultListModel defaultlistmodel = (DefaultListModel)getVisibleList().getModel();
        int i = getVisibleList().getSelectedIndex();
        if(i < 0 || i > defaultlistmodel.getSize() - 2)
        {
            return;
        } else
        {
            Object obj = defaultlistmodel.getElementAt(i);
            Object obj1 = defaultlistmodel.getElementAt(i + 1);
            defaultlistmodel.setElementAt(obj1, i);
            defaultlistmodel.setElementAt(obj, i + 1);
            getVisibleList().setSelectedIndex(i + 1);
            getVisibleList().ensureIndexIsVisible(i + 1);
            return;
        }
    }

    private void moveUp_ActionEvents()
    {
        DefaultListModel defaultlistmodel = (DefaultListModel)getVisibleList().getModel();
        int i = getVisibleList().getSelectedIndex();
        if(i < 1)
        {
            return;
        } else
        {
            Object obj = defaultlistmodel.getElementAt(i);
            Object obj1 = defaultlistmodel.getElementAt(i - 1);
            defaultlistmodel.setElementAt(obj1, i);
            defaultlistmodel.setElementAt(obj, i - 1);
            getVisibleList().setSelectedIndex(i - 1);
            getVisibleList().ensureIndexIsVisible(i - 1);
            return;
        }
    }

    private void ok_ActionEvents()
    {
        ListModel listmodel = getVisibleList().getModel();
        AbstractTableModel abstracttablemodel = (AbstractTableModel)table.getModel();
        tableMetaData.setVisibleFromTable();
        tableMetaData.hideAll();
        for(int i = 0; i < listmodel.getSize(); i++)
        {
            String s = (String)listmodel.getElementAt(i);
            int j = abstracttablemodel.findColumn(s);
            tableMetaData.setVisible(j);
        }

        tableMetaData.synchronizeTable();
        dispose();
    }

    public void setTable(JTable jtable, TableMetaData tablemetadata)
    {
        table = jtable;
        tableMetaData = tablemetadata;
        DefaultListModel defaultlistmodel = new DefaultListModel();
        DefaultListModel defaultlistmodel1 = new DefaultListModel();
        TableModel tablemodel = jtable.getModel();
        tablemetadata.setVisibleFromTable();
        tablemetadata.setWidthsFromTable();
        jtable.getColumnModel();
        String s1;
        for(Enumeration enumeration = tablemetadata.getVisibleElements(); enumeration.hasMoreElements(); defaultlistmodel.addElement(s1))
        {
            int j = ((Integer)enumeration.nextElement()).intValue();
            s1 = tablemodel.getColumnName(j);
        }

        getVisibleList().setModel(defaultlistmodel);
        for(int i = 0; i < tablemodel.getColumnCount(); i++)
            if(!tablemetadata.isVisible(i))
            {
                String s = tablemodel.getColumnName(i);
                defaultlistmodel1.addElement(s);
            }

        getHiddenList().setModel(defaultlistmodel1);
    }

    private void show_ActionEvents()
    {
        int i = getHiddenList().getSelectedIndex();
        if(i < 0)
            return;
        DefaultListModel defaultlistmodel = (DefaultListModel)getHiddenList().getModel();
        DefaultListModel defaultlistmodel1 = (DefaultListModel)getVisibleList().getModel();
        String s = (String)defaultlistmodel.getElementAt(i);
        defaultlistmodel.remove(i);
        i = getVisibleList().getSelectedIndex();
        if(i < 0)
            defaultlistmodel1.addElement(s);
        else
            defaultlistmodel1.add(i + 1, s);
        getVisibleList().setSelectedValue(s, true);
    }

    IvjEventHandler ivjEventHandler;
    private JPanel ivjFooterPanel;
    private FlowLayout ivjFooterPanelFlowLayout;
    private JButton ivjHide;
    private JPanel ivjJDialogContentPane;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JPanel ivjJPanel1;
    private JSeparator ivjJSeparator1;
    private JButton ivjMoveDown;
    private JButton ivjMoveUp;
    private JButton ivjOk;
    private JButton ivjShow;
    private JTable table;
    private TableMetaData tableMetaData;
    private JList ivjHiddenList;
    private JList ivjVisibleList;
    private JScrollPane ivjHiddenScrollPane;
    private JScrollPane ivjVisibleScrollPane;










}
