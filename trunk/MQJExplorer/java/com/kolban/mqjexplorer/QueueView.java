// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueView.java

package com.kolban.mqjexplorer;

import com.ibm.mq.*;
import com.ibm.mq.pcf.PCFMessage;
import com.kolban.mq.PCFUtils;
import com.kolban.mqjexplorer.beans.Consumer;
import com.kolban.mqjexplorer.beans.CopyQDlg;
import com.kolban.mqjexplorer.beans.DepleteQ;
import com.kolban.mqjexplorer.beans.FilterDlg;
import com.kolban.mqjexplorer.beans.MessageListDlg;
import com.kolban.mqjexplorer.beans.NewAliasQueue;
import com.kolban.mqjexplorer.beans.NewLocalQueue;
import com.kolban.mqjexplorer.beans.NewModelQueue;
import com.kolban.mqjexplorer.beans.NewRemoteQueue;
import com.kolban.mqjexplorer.beans.PropertiesAliasQueue;
import com.kolban.mqjexplorer.beans.PropertiesLocalQueue;
import com.kolban.mqjexplorer.beans.PropertiesModelQueue;
import com.kolban.mqjexplorer.beans.PropertiesRemoteQueue;
import com.kolban.mqjexplorer.beans.PutMessageAdvanced;
import com.kolban.mqjexplorer.beans.PutTestMessage;
import com.kolban.mqjexplorer.beans.QStatsDlg;
import com.kolban.mqjexplorer.beans.ReadMessagesFromFile;
import com.kolban.mqjexplorer.beans.WriteMessagesToFile;
import com.kolban.mqjexplorer.guibeans.QFullBarTableRenderer;
import com.kolban.mqjexplorer.utils.Filter;
import com.kolban.swing.*;
import com.kolban.swing.table.*;
import com.kolban.swing.table.TableSorter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

// Referenced classes of package com.kolban.mqjexplorer:
//            MQJExplorerView, QueueManagerModel, MQJExplorer, QueueListModel, 
//            TextIconRenderer, Profile, QueueListTableModel

public class QueueView extends JPanel
    implements MQJExplorerView, ActionListener, MouseListener
{
    public class SortedQueueListTableModel extends QueueListTableModel
        implements SortableTableModel
    {

        private void checkForChangedRows()
        {
            int i = getRowCount();
            if(indexes == null || i == indexes.length)
                return;
            int ai[] = new int[i];
            if(i > indexes.length)
            {
                System.arraycopy(indexes, 0, ai, 0, indexes.length);
                for(; i > indexes.length; i--)
                    ai[i - 1] = i - 1;

            } else
            {
                System.arraycopy(indexes, 0, ai, 0, i);
            }
            indexes = ai;
        }

        public int[] getIndexes()
        {
            int i = getRowCount();
            if(indexes != null && indexes.length == i)
                return indexes;
            indexes = new int[i];
            for(int j = 0; j < i; j++)
                indexes[j] = j;

            return indexes;
        }

        public Object getValueAt(int i, int j)
        {
            int k = i;
            checkForChangedRows();
            if(indexes != null)
                k = indexes[i];
            return super.getValueAt(k, j);
        }

        public void setValueAt(Object obj, int i, int j)
        {
            int k = i;
            checkForChangedRows();
            if(indexes != null)
                k = indexes[i];
            super.setValueAt(obj, k, j);
        }

        public void sortByColumn(int i, boolean flag)
        {
            checkForChangedRows();
            if(sorter == null)
                sorter = new TableSorter(this);
            sorter.sort(i, flag);
            fireTableDataChanged();
        }

        private int indexes[];
        private TableSorter sorter;

        public SortedQueueListTableModel()
        {
            super(null);
        }
    }

    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJMenuItem6())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getJMenuItem7())
                connEtoC3(actionevent);
            if(actionevent.getSource() == getJMenuItem10())
                connEtoC4(actionevent);
            if(actionevent.getSource() == getJMenuItem12())
                connEtoC5(actionevent);
            if(actionevent.getSource() == getJMenuItem2())
                connEtoC6(actionevent);
            if(actionevent.getSource() == getJMenuItem9())
                connEtoC7(actionevent);
            if(actionevent.getSource() == getJMenuItem5())
                connEtoC8(actionevent);
            if(actionevent.getSource() == getJMenuItem8())
                connEtoC9(actionevent);
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC10(actionevent);
            if(actionevent.getSource() == getJMenuItem4())
                connEtoC11(actionevent);
            if(actionevent.getSource() == getJMenuItem3())
                connEtoC12(actionevent);
            if(actionevent.getSource() == getJMenuItem81())
                connEtoC13(actionevent);
            if(actionevent.getSource() == getJMenuItem13())
                connEtoC14(actionevent);
            if(actionevent.getSource() == getJMenuItem41())
                connEtoC15(actionevent);
            if(actionevent.getSource() == getJMenuItem31())
                connEtoC16(actionevent);
            if(actionevent.getSource() == getJMenuItem71())
                connEtoC18(actionevent);
            if(actionevent.getSource() == getJMenuItem811())
                connEtoC19(actionevent);
            if(actionevent.getSource() == getJMenuItem131())
                connEtoC20(actionevent);
            if(actionevent.getSource() == getJMenuItem411())
                connEtoC21(actionevent);
            if(actionevent.getSource() == getJMenuItem311())
                connEtoC22(actionevent);
            if(actionevent.getSource() == getJMenuItem14())
                connEtoC23(actionevent);
            if(actionevent.getSource() == getEnableQueueMenuItem())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getDisableQueueMenuItem())
                connEtoC17(actionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public QueueView()
    {
        lastFilePath = null;
        profile = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem10 = null;
        ivjJMenuItem12 = null;
        ivjJMenuItem2 = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjJMenuItem5 = null;
        ivjJMenuItem6 = null;
        ivjJMenuItem7 = null;
        ivjJMenuItem8 = null;
        ivjJMenuItem9 = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjPopupMenu_QT_LOCAL = null;
        ivjJMenuItem13 = null;
        ivjJMenuItem31 = null;
        ivjJMenuItem41 = null;
        ivjJMenuItem81 = null;
        ivjJSeparator11 = null;
        ivjPopupMenu_QT_OTHER = null;
        ivjJMenuItem131 = null;
        ivjJMenuItem311 = null;
        ivjJMenuItem411 = null;
        ivjJMenuItem71 = null;
        ivjJMenuItem811 = null;
        ivjJSeparator111 = null;
        ivjPopupMenu_QT_REMOTE = null;
        ivjJMenuItem14 = null;
        sortButtonRenderer = new SortButtonRenderer();
        ivjDisableQueueMenuItem = null;
        ivjEnableQueueMenuItem = null;
        ivjJMenu1 = null;
        initialize();
    }

    public QueueView(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        lastFilePath = null;
        profile = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem10 = null;
        ivjJMenuItem12 = null;
        ivjJMenuItem2 = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjJMenuItem5 = null;
        ivjJMenuItem6 = null;
        ivjJMenuItem7 = null;
        ivjJMenuItem8 = null;
        ivjJMenuItem9 = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjPopupMenu_QT_LOCAL = null;
        ivjJMenuItem13 = null;
        ivjJMenuItem31 = null;
        ivjJMenuItem41 = null;
        ivjJMenuItem81 = null;
        ivjJSeparator11 = null;
        ivjPopupMenu_QT_OTHER = null;
        ivjJMenuItem131 = null;
        ivjJMenuItem311 = null;
        ivjJMenuItem411 = null;
        ivjJMenuItem71 = null;
        ivjJMenuItem811 = null;
        ivjJSeparator111 = null;
        ivjPopupMenu_QT_REMOTE = null;
        ivjJMenuItem14 = null;
        sortButtonRenderer = new SortButtonRenderer();
        ivjDisableQueueMenuItem = null;
        ivjEnableQueueMenuItem = null;
        ivjJMenu1 = null;
        init();
    }

    public QueueView(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        lastFilePath = null;
        profile = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem10 = null;
        ivjJMenuItem12 = null;
        ivjJMenuItem2 = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjJMenuItem5 = null;
        ivjJMenuItem6 = null;
        ivjJMenuItem7 = null;
        ivjJMenuItem8 = null;
        ivjJMenuItem9 = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjPopupMenu_QT_LOCAL = null;
        ivjJMenuItem13 = null;
        ivjJMenuItem31 = null;
        ivjJMenuItem41 = null;
        ivjJMenuItem81 = null;
        ivjJSeparator11 = null;
        ivjPopupMenu_QT_OTHER = null;
        ivjJMenuItem131 = null;
        ivjJMenuItem311 = null;
        ivjJMenuItem411 = null;
        ivjJMenuItem71 = null;
        ivjJMenuItem811 = null;
        ivjJSeparator111 = null;
        ivjPopupMenu_QT_REMOTE = null;
        ivjJMenuItem14 = null;
        sortButtonRenderer = new SortButtonRenderer();
        ivjDisableQueueMenuItem = null;
        ivjEnableQueueMenuItem = null;
        ivjJMenu1 = null;
        init();
    }

    public QueueView(boolean flag)
    {
        super(flag);
        lastFilePath = null;
        profile = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem10 = null;
        ivjJMenuItem12 = null;
        ivjJMenuItem2 = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjJMenuItem5 = null;
        ivjJMenuItem6 = null;
        ivjJMenuItem7 = null;
        ivjJMenuItem8 = null;
        ivjJMenuItem9 = null;
        ivjJSeparator1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjPopupMenu_QT_LOCAL = null;
        ivjJMenuItem13 = null;
        ivjJMenuItem31 = null;
        ivjJMenuItem41 = null;
        ivjJMenuItem81 = null;
        ivjJSeparator11 = null;
        ivjPopupMenu_QT_OTHER = null;
        ivjJMenuItem131 = null;
        ivjJMenuItem311 = null;
        ivjJMenuItem411 = null;
        ivjJMenuItem71 = null;
        ivjJMenuItem811 = null;
        ivjJSeparator111 = null;
        ivjPopupMenu_QT_REMOTE = null;
        ivjJMenuItem14 = null;
        sortButtonRenderer = new SortButtonRenderer();
        ivjDisableQueueMenuItem = null;
        ivjEnableQueueMenuItem = null;
        ivjJMenu1 = null;
        init();
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        String s = actionevent.getActionCommand();
        if(s.equals("refreshQueue"))
        {
            refreshSelectedQueue();
            return;
        }
        if(s.equals("putTest"))
        {
            putTest();
            return;
        }
        if(s.equals("putAdvanced"))
        {
            putAdvanced();
            return;
        }
        if(s.equals("writeMessages"))
        {
            writeMessagesToFile();
            return;
        }
        if(s.equals("readMessages"))
        {
            readMessagesFromFile();
            return;
        }
        if(s.equals("consumeMessages"))
        {
            consumeMessages();
            return;
        }
        if(s.equals("filterQueues"))
        {
            filterDlg();
            return;
        }
        if(s.equals("queueStats"))
        {
            qstatsDlg();
            return;
        }
        if(s.equals("delete"))
        {
            deleteSelectedQueue();
            return;
        }
        if(s.equals("properties"))
        {
            showSelectedProperties();
            return;
        }
        if(s.equals("browse"))
        {
            browse();
            return;
        }
        if(s.equals("refresh"))
        {
            refresh();
            return;
        }
        if(s.equals("createLocalQueue"))
        {
            createQueue(1);
            return;
        }
        if(s.equals("createAliasQueue"))
        {
            createQueue(3);
            return;
        }
        if(s.equals("createModelQueue"))
        {
            createQueue(2);
            return;
        }
        if(s.equals("createRemoteQueue"))
        {
            createQueue(6);
            return;
        }
        if(s.equals("showSystem"))
        {
            queueManagerModel.setShowSystemQueues(showSystemToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showTempQueues"))
        {
            queueManagerModel.setShowTempQueues(showTempQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showAliasQueues"))
        {
            queueManagerModel.setShowAliasQueues(showAliasQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showModelQueues"))
        {
            queueManagerModel.setShowModelQueues(showModelQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showRemoteQueues"))
        {
            queueManagerModel.setShowRemoteQueues(showRemoteQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showLocalQueues"))
        {
            queueManagerModel.setShowLocalQueues(showLocalQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("clearMessages"))
        {
            clearSelectedQueue();
            return;
        }
        if(s.equals("depleteMessages"))
        {
            depleteSelectedQueue();
            return;
        } else
        {
            System.out.println("** Uncaught command: " + s);
            return;
        }
    }

    public void addToolBarButtons(JToolBar jtoolbar, Dimension dimension)
    {
        showLocalQueuesToggleButton = new JToggleButton(new ImageIcon(getClass().getResource("/icons/localQueues.gif")));
        showLocalQueuesToggleButton.setToolTipText("Local Queues");
        showLocalQueuesToggleButton.setPreferredSize(dimension);
        showLocalQueuesToggleButton.setMaximumSize(dimension);
        showLocalQueuesToggleButton.setActionCommand("showLocalQueues");
        showLocalQueuesToggleButton.addActionListener(this);
        jtoolbar.add(showLocalQueuesToggleButton);
        showRemoteQueuesToggleButton = new JToggleButton(new ImageIcon(getClass().getResource("/icons/remoteQueues.gif")));
        showRemoteQueuesToggleButton.setToolTipText("Remote Queues");
        showRemoteQueuesToggleButton.setPreferredSize(dimension);
        showRemoteQueuesToggleButton.setMaximumSize(dimension);
        showRemoteQueuesToggleButton.setActionCommand("showRemoteQueues");
        showRemoteQueuesToggleButton.addActionListener(this);
        jtoolbar.add(showRemoteQueuesToggleButton);
        showModelQueuesToggleButton = new JToggleButton(new ImageIcon(getClass().getResource("/icons/modelQueues.gif")));
        showModelQueuesToggleButton.setToolTipText("Model Queues");
        showModelQueuesToggleButton.setPreferredSize(dimension);
        showModelQueuesToggleButton.setMaximumSize(dimension);
        showModelQueuesToggleButton.setActionCommand("showModelQueues");
        showModelQueuesToggleButton.addActionListener(this);
        jtoolbar.add(showModelQueuesToggleButton);
        showAliasQueuesToggleButton = new JToggleButton(new ImageIcon(getClass().getResource("/icons/aliasQueues.gif")));
        showAliasQueuesToggleButton.setToolTipText("Alias Queues");
        showAliasQueuesToggleButton.setPreferredSize(dimension);
        showAliasQueuesToggleButton.setMaximumSize(dimension);
        showAliasQueuesToggleButton.setActionCommand("showAliasQueues");
        showAliasQueuesToggleButton.addActionListener(this);
        jtoolbar.add(showAliasQueuesToggleButton);
        showTempQueuesToggleButton = new JToggleButton(new ImageIcon(getClass().getResource("/icons/tempQueues.gif")));
        showTempQueuesToggleButton.setToolTipText("Temporary Queues");
        showTempQueuesToggleButton.setPreferredSize(dimension);
        showTempQueuesToggleButton.setMaximumSize(dimension);
        showTempQueuesToggleButton.setActionCommand("showTempQueues");
        showTempQueuesToggleButton.addActionListener(this);
        jtoolbar.add(showTempQueuesToggleButton);
        showSystemToggleButton = new JToggleButton(new ImageIcon(getClass().getResource("/icons/systemObjects.gif")));
        showSystemToggleButton.setToolTipText("System Objects");
        showSystemToggleButton.setPreferredSize(dimension);
        showSystemToggleButton.setMaximumSize(dimension);
        showSystemToggleButton.setActionCommand("showSystem");
        showSystemToggleButton.addActionListener(this);
        jtoolbar.add(showSystemToggleButton);
        if(queueManagerModel == null)
        {
            showAliasQueuesToggleButton.setEnabled(false);
            showLocalQueuesToggleButton.setEnabled(false);
            showRemoteQueuesToggleButton.setEnabled(false);
            showTempQueuesToggleButton.setEnabled(false);
            showModelQueuesToggleButton.setEnabled(false);
            showSystemToggleButton.setEnabled(false);
        } else
        {
            showAliasQueuesToggleButton.setEnabled(true);
            showLocalQueuesToggleButton.setEnabled(true);
            showRemoteQueuesToggleButton.setEnabled(true);
            showTempQueuesToggleButton.setEnabled(true);
            showModelQueuesToggleButton.setEnabled(true);
            showSystemToggleButton.setEnabled(true);
            showAliasQueuesToggleButton.setSelected(queueManagerModel.isShowAliasQueues());
            showLocalQueuesToggleButton.setSelected(queueManagerModel.isShowLocalQueues());
            showModelQueuesToggleButton.setSelected(queueManagerModel.isShowModelQueues());
            showRemoteQueuesToggleButton.setSelected(queueManagerModel.isShowRemoteQueues());
            showTempQueuesToggleButton.setSelected(queueManagerModel.isShowTempQueues());
            showSystemToggleButton.setSelected(queueManagerModel.isShowSystemQueues());
        }
    }

    public void browse()
    {
        String s = getSelectedQueueName();
        if(s == null)
            return;
        System.out.println("Browsing queue: " + s);
        try
        {
            MessageListDlg messagelistdlg = new MessageListDlg(MQJExplorer.mainFrame, queueManagerModel.getQueueManager(), s);
            messagelistdlg.setProfile(profile);
            SwingUtils.setCenter(MQJExplorer.mainFrame, messagelistdlg);
            messagelistdlg.setVisible(true);
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public void clearSelectedQueue()
    {
        int i = table.getSelectedRow();
        if(i < 0)
            return;
        try
        {
            PCFUtils.clearQueue(queueManagerModel.getAgent(), getSelectedQueueName());
            refreshSelectedQueue();
            MQJExplorer.setMessage("Messages deleted");
        }
        catch(MQException mqexception)
        {
            QueueManagerModel.displayError(mqexception);
            MQJExplorer.setMessage("Failed to delete messages");
        }
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC10(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC11(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC12(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC13(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC14(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC15(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC16(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC17(ActionEvent actionevent)
    {
        try
        {
            enableQueue(1);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC18(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC19(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
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
            enableQueue(0);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC20(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC21(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC22(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC23(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
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
            handleMenuAction(actionevent);
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
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
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
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC8(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC9(ActionEvent actionevent)
    {
        try
        {
            handleMenuAction(actionevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public void consumeMessages()
    {
        try
        {
            Consumer consumer = new Consumer(MQJExplorer.mainFrame, queueManagerModel.getNewQueueManager(), getSelectedQueueName());
            SwingUtils.setCenter(MQJExplorer.mainFrame, consumer);
            consumer.pack();
            consumer.setVisible(true);
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
    }

    public void copyQueue()
    {
        CopyQDlg copyqdlg = new CopyQDlg(MQJExplorer.mainFrame);
        copyqdlg.setTemplateQueueName(getSelectedQueueName());
        copyqdlg.setTemplateQueueType(getSelectedQueueType());
        copyqdlg.setQueueManager(queueManagerModel);
        copyqdlg.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, copyqdlg);
        copyqdlg.show();
        if(copyqdlg.getResult() == 1)
        {
            try
            {
                queueManagerModel.getQueueListModel().refreshQueue(queueManagerModel.getAgent(), copyqdlg.getNewQueueName());
            }
            catch(Exception _ex) { }
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
        }
    }

    public void createQueue(int i)
    {
        try
        {
            String s = null;
            switch(i)
            {
            case 3: // '\003'
                NewAliasQueue newaliasqueue = new NewAliasQueue();
                newaliasqueue.doModal(MQJExplorer.mainFrame, queueManagerModel);
                s = newaliasqueue.getQueueName();
                break;

            case 1: // '\001'
                NewLocalQueue newlocalqueue = new NewLocalQueue();
                newlocalqueue.doModal(MQJExplorer.mainFrame, queueManagerModel);
                s = newlocalqueue.getQueueName();
                break;

            case 2: // '\002'
                NewModelQueue newmodelqueue = new NewModelQueue();
                newmodelqueue.doModal(MQJExplorer.mainFrame, queueManagerModel);
                s = newmodelqueue.getQueueName();
                break;

            case 6: // '\006'
                NewRemoteQueue newremotequeue = new NewRemoteQueue();
                newremotequeue.doModal(MQJExplorer.mainFrame, queueManagerModel);
                s = newremotequeue.getQueueName();
                break;

            case 4: // '\004'
            case 5: // '\005'
            default:
                System.out.println("Unexpected queue type: " + i);
                return;
            }
            queueManagerModel.getQueueListModel().refreshQueue(queueManagerModel.getAgent(), s);
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
        }
        catch(Exception _ex) { }
    }

    public void deleteQueue(String s, boolean flag)
        throws MQException
    {
        PCFUtils.deleteQueue(queueManagerModel.getAgent(), s, flag);
        queueManagerModel.getQueueListModel().deleteQueue(s);
    }

    public void deleteSelectedQueue()
    {
        System.out.println("Deleting queue");
        int i = table.getSelectedRow();
        if(i < 0)
            return;
        try
        {
            Object aobj[] = {
                "Yes - With purge", "Yes - No purge", "Cancel"
            };
            int j = JOptionPane.showOptionDialog(this, "Confirm deletion of this queue?", "Confirm deletion", 1, 3, null, aobj, aobj[2]);
            boolean flag = false;
            switch(j)
            {
            case 2: // '\002'
                return;

            case 0: // '\0'
                flag = true;
                break;

            case 1: // '\001'
                flag = false;
                break;
            }
            deleteQueue(getSelectedQueueName(), flag);
            MQJExplorer.setMessage("Queue deleted");
        }
        catch(MQException mqexception)
        {
            if(mqexception.reasonCode == 2055)
            {
                int k = JOptionPane.showConfirmDialog(this, "Queue contains messages, empty and delete?", "Empty and delete?", 0, 3);
                if(k == 0)
                    try
                    {
                        deleteQueue(getSelectedQueueName(), true);
                    }
                    catch(MQException _ex) { }
            }
        }
        ((AbstractTableModel)table.getModel()).fireTableDataChanged();
        if(i < table.getRowCount())
            table.setRowSelectionInterval(i, i);
    }

    public void depleteSelectedQueue()
    {
        int i = table.getSelectedRow();
        if(i < 0)
            return;
        DepleteQ depleteq = new DepleteQ();
        try
        {
            depleteq.setQueueManager(queueManagerModel.getNewQueueManager());
            depleteq.setQueueName(getSelectedQueueName());
            depleteq.execute();
        }
        catch(Exception _ex) { }
        refreshSelectedQueue();
        MQJExplorer.setMessage("Messages depleted");
    }

    public void enableQueue(int i)
    {
        String s = getSelectedQueueName();
        if(s == null)
            return;
        try
        {
            MQQueueManager mqqueuemanager = queueManagerModel.getQueueManager();
            MQQueue mqqueue = mqqueuemanager.accessQueue(s, 64);
            mqqueue.setInhibitGet(i);
            mqqueue.close();
        }
        catch(MQException mqexception)
        {
            System.out.println("Exception while enabling queue: " + mqexception.toString());
        }
        refreshSelectedQueue();
    }

    public void filterDlg()
    {
        FilterDlg filterdlg = new FilterDlg(MQJExplorer.mainFrame);
        Filter filter = queueManagerModel.getQueueListModel().getFilter();
        filterdlg.setData(filter);
        SwingUtils.setCenter(MQJExplorer.mainFrame, filterdlg);
        filterdlg.setVisible(true);
        if(filterdlg.getRetVal() == 1)
        {
            Filter filter1 = filterdlg.getData();
            queueManagerModel.getQueueListModel().setFilter(filter1);
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            MQJExplorer.statusBar.setFiltered(!filter1.allVisible());
        }
    }

    public PCFMessage findQueueByName(String s)
    {
        return queueManagerModel.getQueueListModel().findQueueByName(s);
    }

    private JMenuItem getDisableQueueMenuItem()
    {
        if(ivjDisableQueueMenuItem == null)
            try
            {
                ivjDisableQueueMenuItem = new JMenuItem();
                ivjDisableQueueMenuItem.setName("DisableQueueMenuItem");
                ivjDisableQueueMenuItem.setText("Disable Queue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDisableQueueMenuItem;
    }

    private JMenuItem getEnableQueueMenuItem()
    {
        if(ivjEnableQueueMenuItem == null)
            try
            {
                ivjEnableQueueMenuItem = new JMenuItem();
                ivjEnableQueueMenuItem.setName("EnableQueueMenuItem");
                ivjEnableQueueMenuItem.setText("Enable Queue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEnableQueueMenuItem;
    }

    private JMenu getJMenu1()
    {
        if(ivjJMenu1 == null)
            try
            {
                ivjJMenu1 = new JMenu();
                ivjJMenu1.setName("JMenu1");
                ivjJMenu1.setText("Quick Actions");
                ivjJMenu1.add(getEnableQueueMenuItem());
                ivjJMenu1.add(getDisableQueueMenuItem());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenu1;
    }

    private JMenuItem getJMenuItem1()
    {
        if(ivjJMenuItem1 == null)
            try
            {
                ivjJMenuItem1 = new JMenuItem();
                ivjJMenuItem1.setName("JMenuItem1");
                ivjJMenuItem1.setIcon(new ImageIcon(getClass().getResource("/icons/Delete16.gif")));
                ivjJMenuItem1.setText("Delete...");
                ivjJMenuItem1.setActionCommand("delete");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem1;
    }

    private JMenuItem getJMenuItem10()
    {
        if(ivjJMenuItem10 == null)
            try
            {
                ivjJMenuItem10 = new JMenuItem();
                ivjJMenuItem10.setName("JMenuItem10");
                ivjJMenuItem10.setIcon(new ImageIcon(getClass().getResource("/icons/Down16_1.gif")));
                ivjJMenuItem10.setText("Backup messages to a file...");
                ivjJMenuItem10.setActionCommand("writeMessages");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem10;
    }

    private JMenuItem getJMenuItem12()
    {
        if(ivjJMenuItem12 == null)
            try
            {
                ivjJMenuItem12 = new JMenuItem();
                ivjJMenuItem12.setName("JMenuItem12");
                ivjJMenuItem12.setIcon(new ImageIcon(getClass().getResource("/icons/Up16_1.gif")));
                ivjJMenuItem12.setText("Restore messages from a file...");
                ivjJMenuItem12.setActionCommand("readMessages");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem12;
    }

    private JMenuItem getJMenuItem13()
    {
        if(ivjJMenuItem13 == null)
            try
            {
                ivjJMenuItem13 = new JMenuItem();
                ivjJMenuItem13.setName("JMenuItem13");
                ivjJMenuItem13.setIcon(new ImageIcon(getClass().getResource("/icons/Delete16.gif")));
                ivjJMenuItem13.setText("Delete...");
                ivjJMenuItem13.setActionCommand("delete");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem13;
    }

    private JMenuItem getJMenuItem131()
    {
        if(ivjJMenuItem131 == null)
            try
            {
                ivjJMenuItem131 = new JMenuItem();
                ivjJMenuItem131.setName("JMenuItem131");
                ivjJMenuItem131.setIcon(new ImageIcon(getClass().getResource("/icons/Delete16.gif")));
                ivjJMenuItem131.setText("Delete...");
                ivjJMenuItem131.setActionCommand("delete");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem131;
    }

    private JMenuItem getJMenuItem14()
    {
        if(ivjJMenuItem14 == null)
            try
            {
                ivjJMenuItem14 = new JMenuItem();
                ivjJMenuItem14.setName("JMenuItem14");
                ivjJMenuItem14.setIcon(new ImageIcon(getClass().getResource("/icons/menuicons/Copy.gif")));
                ivjJMenuItem14.setText("Copy queue definition...");
                ivjJMenuItem14.setActionCommand("copyQueue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem14;
    }

    private JMenuItem getJMenuItem2()
    {
        if(ivjJMenuItem2 == null)
            try
            {
                ivjJMenuItem2 = new JMenuItem();
                ivjJMenuItem2.setName("JMenuItem2");
                ivjJMenuItem2.setIcon(new ImageIcon(getClass().getResource("/icons/menu_time.gif")));
                ivjJMenuItem2.setText("Consume messages...");
                ivjJMenuItem2.setActionCommand("consumeMessages");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem2;
    }

    private JMenuItem getJMenuItem3()
    {
        if(ivjJMenuItem3 == null)
            try
            {
                ivjJMenuItem3 = new JMenuItem();
                ivjJMenuItem3.setName("JMenuItem3");
                ivjJMenuItem3.setIcon(new ImageIcon(getClass().getResource("/icons/Refresh16.gif")));
                ivjJMenuItem3.setText("Refresh all");
                ivjJMenuItem3.setActionCommand("refresh");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem3;
    }

    private JMenuItem getJMenuItem31()
    {
        if(ivjJMenuItem31 == null)
            try
            {
                ivjJMenuItem31 = new JMenuItem();
                ivjJMenuItem31.setName("JMenuItem31");
                ivjJMenuItem31.setIcon(new ImageIcon(getClass().getResource("/icons/Refresh16.gif")));
                ivjJMenuItem31.setText("Refresh all");
                ivjJMenuItem31.setActionCommand("refresh");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem31;
    }

    private JMenuItem getJMenuItem311()
    {
        if(ivjJMenuItem311 == null)
            try
            {
                ivjJMenuItem311 = new JMenuItem();
                ivjJMenuItem311.setName("JMenuItem311");
                ivjJMenuItem311.setIcon(new ImageIcon(getClass().getResource("/icons/Refresh16.gif")));
                ivjJMenuItem311.setText("Refresh all");
                ivjJMenuItem311.setActionCommand("refresh");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem311;
    }

    private JMenuItem getJMenuItem4()
    {
        if(ivjJMenuItem4 == null)
            try
            {
                ivjJMenuItem4 = new JMenuItem();
                ivjJMenuItem4.setName("JMenuItem4");
                ivjJMenuItem4.setIcon(new ImageIcon(getClass().getResource("/icons/Refresh16.gif")));
                ivjJMenuItem4.setText("Refresh");
                ivjJMenuItem4.setActionCommand("refreshQueue");
                ivjJMenuItem4.setMnemonic(116);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem4;
    }

    private JMenuItem getJMenuItem41()
    {
        if(ivjJMenuItem41 == null)
            try
            {
                ivjJMenuItem41 = new JMenuItem();
                ivjJMenuItem41.setName("JMenuItem41");
                ivjJMenuItem41.setIcon(new ImageIcon(getClass().getResource("/icons/Refresh16.gif")));
                ivjJMenuItem41.setText("Refresh");
                ivjJMenuItem41.setActionCommand("refreshQueue");
                ivjJMenuItem41.setMnemonic(116);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem41;
    }

    private JMenuItem getJMenuItem411()
    {
        if(ivjJMenuItem411 == null)
            try
            {
                ivjJMenuItem411 = new JMenuItem();
                ivjJMenuItem411.setName("JMenuItem411");
                ivjJMenuItem411.setIcon(new ImageIcon(getClass().getResource("/icons/Refresh16.gif")));
                ivjJMenuItem411.setText("Refresh");
                ivjJMenuItem411.setActionCommand("refreshQueue");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem411;
    }

    private JMenuItem getJMenuItem5()
    {
        if(ivjJMenuItem5 == null)
            try
            {
                ivjJMenuItem5 = new JMenuItem();
                ivjJMenuItem5.setName("JMenuItem5");
                ivjJMenuItem5.setIcon(new ImageIcon(getClass().getResource("/icons/menuicons/qminus_blue.gif")));
                ivjJMenuItem5.setText("Deplete messages");
                ivjJMenuItem5.setActionCommand("depleteMessages");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem5;
    }

    private JMenuItem getJMenuItem6()
    {
        if(ivjJMenuItem6 == null)
            try
            {
                ivjJMenuItem6 = new JMenuItem();
                ivjJMenuItem6.setName("JMenuItem6");
                ivjJMenuItem6.setIcon(new ImageIcon(getClass().getResource("/icons/menuicons/Find16.gif")));
                ivjJMenuItem6.setText("Browse messages...");
                ivjJMenuItem6.setActionCommand("browse");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem6;
    }

    private JMenuItem getJMenuItem7()
    {
        if(ivjJMenuItem7 == null)
            try
            {
                ivjJMenuItem7 = new JMenuItem();
                ivjJMenuItem7.setName("JMenuItem7");
                ivjJMenuItem7.setIcon(new ImageIcon(getClass().getResource("/icons/menuicons/qplus_blue.gif")));
                ivjJMenuItem7.setText("Advanced put message...");
                ivjJMenuItem7.setActionCommand("putAdvanced");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem7;
    }

    private JMenuItem getJMenuItem71()
    {
        if(ivjJMenuItem71 == null)
            try
            {
                ivjJMenuItem71 = new JMenuItem();
                ivjJMenuItem71.setName("JMenuItem71");
                ivjJMenuItem71.setIcon(new ImageIcon(getClass().getResource("/icons/menuicons/qplus_blue.gif")));
                ivjJMenuItem71.setText("Advanced put message...");
                ivjJMenuItem71.setActionCommand("putAdvanced");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem71;
    }

    private JMenuItem getJMenuItem8()
    {
        if(ivjJMenuItem8 == null)
            try
            {
                ivjJMenuItem8 = new JMenuItem();
                ivjJMenuItem8.setName("JMenuItem8");
                ivjJMenuItem8.setIcon(new ImageIcon(getClass().getResource("/icons/Properties16.gif")));
                ivjJMenuItem8.setText("Properties...");
                ivjJMenuItem8.setActionCommand("properties");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem8;
    }

    private JMenuItem getJMenuItem81()
    {
        if(ivjJMenuItem81 == null)
            try
            {
                ivjJMenuItem81 = new JMenuItem();
                ivjJMenuItem81.setName("JMenuItem81");
                ivjJMenuItem81.setIcon(new ImageIcon(getClass().getResource("/icons/Properties16.gif")));
                ivjJMenuItem81.setText("Properties...");
                ivjJMenuItem81.setActionCommand("properties");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem81;
    }

    private JMenuItem getJMenuItem811()
    {
        if(ivjJMenuItem811 == null)
            try
            {
                ivjJMenuItem811 = new JMenuItem();
                ivjJMenuItem811.setName("JMenuItem811");
                ivjJMenuItem811.setIcon(new ImageIcon(getClass().getResource("/icons/Properties16.gif")));
                ivjJMenuItem811.setText("Properties...");
                ivjJMenuItem811.setActionCommand("properties");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem811;
    }

    private JMenuItem getJMenuItem9()
    {
        if(ivjJMenuItem9 == null)
            try
            {
                ivjJMenuItem9 = new JMenuItem();
                ivjJMenuItem9.setName("JMenuItem9");
                ivjJMenuItem9.setIcon(new ImageIcon(getClass().getResource("/icons/menuicons/qminus_blue.gif")));
                ivjJMenuItem9.setText("Clear messages");
                ivjJMenuItem9.setActionCommand("clearMessages");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem9;
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

    private JSeparator getJSeparator11()
    {
        if(ivjJSeparator11 == null)
            try
            {
                ivjJSeparator11 = new JSeparator();
                ivjJSeparator11.setName("JSeparator11");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSeparator11;
    }

    private JSeparator getJSeparator111()
    {
        if(ivjJSeparator111 == null)
            try
            {
                ivjJSeparator111 = new JSeparator();
                ivjJSeparator111.setName("JSeparator111");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSeparator111;
    }

    private JPopupMenu getPopupMenu_QT_LOCAL()
    {
        if(ivjPopupMenu_QT_LOCAL == null)
            try
            {
                ivjPopupMenu_QT_LOCAL = new JPopupMenu();
                ivjPopupMenu_QT_LOCAL.setName("PopupMenu_QT_LOCAL");
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem6());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem7());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem10());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem12());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem2());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem9());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem5());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem14());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem8());
                ivjPopupMenu_QT_LOCAL.add(getJMenu1());
                ivjPopupMenu_QT_LOCAL.add(getJSeparator1());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem1());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem4());
                ivjPopupMenu_QT_LOCAL.add(getJMenuItem3());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPopupMenu_QT_LOCAL;
    }

    private JPopupMenu getPopupMenu_QT_OTHER()
    {
        if(ivjPopupMenu_QT_OTHER == null)
            try
            {
                ivjPopupMenu_QT_OTHER = new JPopupMenu();
                ivjPopupMenu_QT_OTHER.setName("PopupMenu_QT_OTHER");
                ivjPopupMenu_QT_OTHER.add(getJMenuItem81());
                ivjPopupMenu_QT_OTHER.add(getJSeparator11());
                ivjPopupMenu_QT_OTHER.add(getJMenuItem13());
                ivjPopupMenu_QT_OTHER.add(getJMenuItem41());
                ivjPopupMenu_QT_OTHER.add(getJMenuItem31());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPopupMenu_QT_OTHER;
    }

    private JPopupMenu getPopupMenu_QT_REMOTE()
    {
        if(ivjPopupMenu_QT_REMOTE == null)
            try
            {
                ivjPopupMenu_QT_REMOTE = new JPopupMenu();
                ivjPopupMenu_QT_REMOTE.setName("PopupMenu_QT_REMOTE");
                ivjPopupMenu_QT_REMOTE.add(getJMenuItem71());
                ivjPopupMenu_QT_REMOTE.add(getJMenuItem811());
                ivjPopupMenu_QT_REMOTE.add(getJSeparator111());
                ivjPopupMenu_QT_REMOTE.add(getJMenuItem131());
                ivjPopupMenu_QT_REMOTE.add(getJMenuItem411());
                ivjPopupMenu_QT_REMOTE.add(getJMenuItem311());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPopupMenu_QT_REMOTE;
    }

    public String getSelectedQueueName()
    {
        int i = table.getSelectedRow();
        if(i < 0)
        {
            return null;
        } else
        {
            String s = queueManagerModel.getQueueListModel().getQueueName(translateSortedRow(i));
            return s;
        }
    }

    public int getSelectedQueueType()
    {
        int i = table.getSelectedRow();
        if(i < 0)
        {
            return -1;
        } else
        {
            int j = queueManagerModel.getQueueListModel().getQueueType(translateSortedRow(i));
            return j;
        }
    }

    private void handleException(Throwable throwable)
    {
    }

    public void handleMenuAction(ActionEvent actionevent)
    {
        String s = actionevent.getActionCommand();
        if(s.equals("refreshQueue"))
        {
            refreshSelectedQueue();
            return;
        }
        if(s.equals("copyQueue"))
        {
            copyQueue();
            return;
        }
        if(s.equals("putTest"))
        {
            putTest();
            return;
        }
        if(s.equals("putAdvanced"))
        {
            putAdvanced();
            return;
        }
        if(s.equals("writeMessages"))
        {
            writeMessagesToFile();
            return;
        }
        if(s.equals("readMessages"))
        {
            readMessagesFromFile();
            return;
        }
        if(s.equals("consumeMessages"))
        {
            consumeMessages();
            return;
        }
        if(s.equals("filterQueues"))
        {
            filterDlg();
            return;
        }
        if(s.equals("queueStats"))
        {
            qstatsDlg();
            return;
        }
        if(s.equals("delete"))
        {
            deleteSelectedQueue();
            return;
        }
        if(s.equals("properties"))
        {
            showSelectedProperties();
            return;
        }
        if(s.equals("browse"))
        {
            browse();
            return;
        }
        if(s.equals("refresh"))
        {
            refresh();
            return;
        }
        if(s.equals("createLocalQueue"))
        {
            createQueue(1);
            return;
        }
        if(s.equals("createAliasQueue"))
        {
            createQueue(3);
            return;
        }
        if(s.equals("createModelQueue"))
        {
            createQueue(2);
            return;
        }
        if(s.equals("createRemoteQueue"))
        {
            createQueue(6);
            return;
        }
        if(s.equals("showSystem"))
        {
            queueManagerModel.setShowSystemQueues(showSystemToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showTempQueues"))
        {
            queueManagerModel.setShowTempQueues(showTempQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showAliasQueues"))
        {
            queueManagerModel.setShowAliasQueues(showAliasQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showModelQueues"))
        {
            queueManagerModel.setShowModelQueues(showModelQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showRemoteQueues"))
        {
            queueManagerModel.setShowRemoteQueues(showRemoteQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("showLocalQueues"))
        {
            queueManagerModel.setShowLocalQueues(showLocalQueuesToggleButton.isSelected());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            return;
        }
        if(s.equals("clearMessages"))
        {
            clearSelectedQueue();
            return;
        }
        if(s.equals("depleteMessages"))
        {
            depleteSelectedQueue();
            return;
        } else
        {
            System.out.println("** Uncaught command: " + s);
            return;
        }
    }

    public void init()
    {
        GridBagLayout gridbaglayout = new GridBagLayout();
        GridBagConstraints gridbagconstraints = new GridBagConstraints();
        setLayout(gridbaglayout);
        table = new JTable(new SortedQueueListTableModel());
        TableColumnModel tablecolumnmodel = table.getColumnModel();
        for(int i = 0; i < table.getColumnCount(); i++)
            tablecolumnmodel.getColumn(i).setHeaderRenderer(sortButtonRenderer);

        javax.swing.table.JTableHeader jtableheader = table.getTableHeader();
        jtableheader.addMouseListener(new HeaderListener(jtableheader, sortButtonRenderer));
        table.setDefaultRenderer(com.kolban.mqjexplorer.TextIcon.class, new TextIconRenderer());
        table.setDefaultRenderer(com.kolban.mqjexplorer.guibeans.QFullBar.class, new QFullBarTableRenderer());
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
        table.setAutoResizeMode(0);
        table.setSelectionMode(0);
        table.setShowGrid(false);
        table.setPreferredScrollableViewportSize(new Dimension(500, 300));
        table.setBackground(Color.white);
        table.addMouseListener(this);
        JScrollPane jscrollpane = new JScrollPane(table);
        jscrollpane.getViewport().setBackground(Color.white);
        gridbagconstraints.gridx = 0;
        gridbagconstraints.gridy = 0;
        gridbagconstraints.fill = 1;
        gridbagconstraints.weightx = 1.0D;
        gridbagconstraints.weighty = 1.0D;
        add(jscrollpane, gridbagconstraints);
        table.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent keyevent)
            {
                if(keyevent.getKeyCode() == 116)
                    refreshSelectedQueue();
            }

        }
);
        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent mouseevent)
            {
                if(mouseevent.getClickCount() == 2)
                    actionPerformed(new ActionEvent(this, 0, "browse"));
            }

        }
);
    }

    private void initConnections()
        throws Exception
    {
        getJMenuItem6().addActionListener(ivjEventHandler);
        getJMenuItem7().addActionListener(ivjEventHandler);
        getJMenuItem10().addActionListener(ivjEventHandler);
        getJMenuItem12().addActionListener(ivjEventHandler);
        getJMenuItem2().addActionListener(ivjEventHandler);
        getJMenuItem9().addActionListener(ivjEventHandler);
        getJMenuItem5().addActionListener(ivjEventHandler);
        getJMenuItem8().addActionListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        getJMenuItem4().addActionListener(ivjEventHandler);
        getJMenuItem3().addActionListener(ivjEventHandler);
        getJMenuItem81().addActionListener(ivjEventHandler);
        getJMenuItem13().addActionListener(ivjEventHandler);
        getJMenuItem41().addActionListener(ivjEventHandler);
        getJMenuItem31().addActionListener(ivjEventHandler);
        getJMenuItem71().addActionListener(ivjEventHandler);
        getJMenuItem811().addActionListener(ivjEventHandler);
        getJMenuItem131().addActionListener(ivjEventHandler);
        getJMenuItem411().addActionListener(ivjEventHandler);
        getJMenuItem311().addActionListener(ivjEventHandler);
        getJMenuItem14().addActionListener(ivjEventHandler);
        getEnableQueueMenuItem().addActionListener(ivjEventHandler);
        getDisableQueueMenuItem().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("QueueView");
            setLayout(null);
            setSize(160, 120);
            initConnections();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        init();
    }

    public static void main(String args[])
    {
        try
        {
            JFrame jframe = new JFrame();
            QueueView queueview = new QueueView();
            jframe.setContentPane(queueview);
            jframe.setSize(queueview.getSize());
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

    public void maybePopup(MouseEvent mouseevent)
    {
        if(!mouseevent.isPopupTrigger())
            return;
        Point point = new Point(mouseevent.getX(), mouseevent.getY());
        int i = table.rowAtPoint(point);
        if(i < 0)
            return;
        QueueManagerModel _tmp = queueManagerModel;
        int j = queueManagerModel.getQueueListModel().getQueueType(translateSortedRow(i));
        JPopupMenu jpopupmenu;
        if(j == 1)
            jpopupmenu = getPopupMenu_QT_LOCAL();
        else
        if(j == 6)
            jpopupmenu = getPopupMenu_QT_REMOTE();
        else
            jpopupmenu = getPopupMenu_QT_OTHER();
        jpopupmenu.show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
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
        Point point = new Point(mouseevent.getX(), mouseevent.getY());
        int i = table.rowAtPoint(point);
        if(i >= 0)
            table.setRowSelectionInterval(i, i);
        maybePopup(mouseevent);
    }

    public void mouseReleased(MouseEvent mouseevent)
    {
        maybePopup(mouseevent);
    }

    public void putAdvanced()
    {
        PutMessageAdvanced putmessageadvanced = new PutMessageAdvanced();
        try
        {
            putmessageadvanced.setMQInfo(queueManagerModel.getNewQueueManager(), getSelectedQueueName());
            putmessageadvanced.pack();
            putmessageadvanced.setProfile(profile.advancedPutSettings);
            SwingUtils.setCenter(MQJExplorer.mainFrame, putmessageadvanced);
            putmessageadvanced.setVisible(true);
        }
        catch(MQException mqexception)
        {
            System.out.println("QueueView::putAdvanced " + mqexception.toString());
            QueueManagerModel.displayError(mqexception);
        }
    }

    public void putTest()
    {
        String s = getSelectedQueueName();
        if(s == null)
            return;
        PutTestMessage puttestmessage = new PutTestMessage();
        puttestmessage.setQueueManagerNameText(queueManagerModel.getQueueManagerName());
        puttestmessage.setQueueNameText(s);
        puttestmessage.pack();
        SwingUtils.setCenter(MQJExplorer.mainFrame, puttestmessage);
        puttestmessage.setVisible(true);
        String s1 = puttestmessage.getDataText();
        if(s1.length() == 0)
        {
            MQJExplorer.setMessage("No message put, no data entered");
            return;
        }
        try
        {
            queueManagerModel.putText(s, s1);
            refreshSelectedQueue();
            MQJExplorer.setMessage("Message put to queue");
        }
        catch(MQException mqexception)
        {
            if(mqexception.reasonCode == 2051)
                JOptionPane.showMessageDialog(MQJExplorer.mainFrame, "Queue is put inhibited. Can not put messages to this queue.", "MQJExplorer", 2);
            System.out.println("putTest: " + mqexception.toString());
        }
    }

    public void qstatsDlg()
    {
        queueManagerModel.getQueueListModel().getFilter();
        QStatsDlg qstatsdlg = new QStatsDlg(MQJExplorer.mainFrame);
        qstatsdlg.setQueueManager(queueManagerModel);
        qstatsdlg.pack();
        qstatsdlg.setQStatsSettings(profile.qStatsSettings);
        SwingUtils.setCenter(MQJExplorer.mainFrame, qstatsdlg);
        qstatsdlg.setVisible(true);
    }

    public void readMessagesFromFile()
    {
        try
        {
            ReadMessagesFromFile readmessagesfromfile = new ReadMessagesFromFile(MQJExplorer.mainFrame, getSelectedQueueName(), queueManagerModel.getQueueManager());
            readmessagesfromfile.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, readmessagesfromfile);
            readmessagesfromfile.setVisible(true);
            refreshSelectedQueue();
        }
        catch(Exception _ex) { }
    }

    public void refresh()
    {
        try
        {
            int i = table.getSelectedRow();
            queueManagerModel.getQueueListModel().refreshAll(queueManagerModel.getAgent());
            ((AbstractTableModel)table.getModel()).fireTableDataChanged();
            if(i >= 0)
                ((AbstractTableModel)table.getModel()).fireTableRowsUpdated(i, i);
            MQJExplorer.setMessage("All queues refreshed");
        }
        catch(MQException _ex) { }
    }

    public void refreshSelectedQueue()
    {
        String s = getSelectedQueueName();
        if(s == null)
            return;
        try
        {
            int i = table.getSelectedRow();
            queueManagerModel.getQueueListModel().refreshQueue(queueManagerModel.getAgent(), s);
            ((AbstractTableModel)table.getModel()).fireTableRowsUpdated(i, i);
            table.setRowSelectionInterval(i, i);
            MQJExplorer.setMessage("Queue " + s.trim() + " refreshed");
        }
        catch(MQException mqexception)
        {
            mqexception.printStackTrace();
        }
    }

    public void setModel(Object obj)
    {
        QueueManagerModel queuemanagermodel = (QueueManagerModel)obj;
        try
        {
            if(queueManagerModel == null || queuemanagermodel == null || !queueManagerModel.equals(queuemanagermodel))
            {
                queueManagerModel = queuemanagermodel;
                ((SortedQueueListTableModel)table.getModel()).setQueueManagerModel(queuemanagermodel);
                if(queueManagerModel != null)
                    queueManagerModel.getQueueListModel().refreshIfNeeded(queueManagerModel.getAgent());
                ((SortedQueueListTableModel)table.getModel()).fireTableDataChanged();
            }
        }
        catch(Exception exception)
        {
            System.out.println("setQueueManagerModel: " + exception.toString());
        }
    }

    public void setProfile(Profile profile1)
    {
        profile = profile1;
        TableColumnModel tablecolumnmodel = table.getColumnModel();
        for(int i = 0; i < table.getColumnCount(); i++)
            tablecolumnmodel.getColumn(i).setHeaderRenderer(sortButtonRenderer);

        profile1.getQueueViewTableMetaData().setTable(table);
        profile1.getQueueViewTableMetaData().synchronizeTable();
    }

    public void setSelectedQueueByName(String s)
    {
        int i = table.getRowCount();
        for(int j = 0; j < i; j++)
            if(queueManagerModel.getQueueListModel().getQueueName(translateSortedRow(j)).equals(s))
            {
                table.setRowSelectionInterval(j, j);
                return;
            }

        table.clearSelection();
    }

    public void showHideColumns()
    {
        ColumnSelector2 columnselector2 = new ColumnSelector2(MQJExplorer.mainFrame);
        columnselector2.setTitle("Show/hide columns for Queues");
        columnselector2.setTable(table, profile.getQueueViewTableMetaData());
        SwingUtils.setCenter(MQJExplorer.mainFrame, columnselector2);
        columnselector2.setVisible(true);
    }

    public void showSelectedProperties()
    {
        switch(getSelectedQueueType())
        {
        case 1: // '\001'
            PropertiesLocalQueue propertieslocalqueue = new PropertiesLocalQueue();
            propertieslocalqueue.doModal(MQJExplorer.mainFrame, getSelectedQueueName(), queueManagerModel);
            break;

        case 3: // '\003'
            PropertiesAliasQueue propertiesaliasqueue = new PropertiesAliasQueue();
            propertiesaliasqueue.doModal(MQJExplorer.mainFrame, getSelectedQueueName(), queueManagerModel);
            break;

        case 2: // '\002'
            PropertiesModelQueue propertiesmodelqueue = new PropertiesModelQueue();
            propertiesmodelqueue.doModal(MQJExplorer.mainFrame, getSelectedQueueName(), queueManagerModel);
            break;

        case 6: // '\006'
            PropertiesRemoteQueue propertiesremotequeue = new PropertiesRemoteQueue();
            propertiesremotequeue.doModal(MQJExplorer.mainFrame, getSelectedQueueName(), queueManagerModel);
            break;
        }
        refreshSelectedQueue();
    }

    private int translateSortedRow(int i)
    {
        return ((SortedQueueListTableModel)table.getModel()).getIndexes()[i];
    }

    public void writeMessagesToFile()
    {
        try
        {
            WriteMessagesToFile writemessagestofile = new WriteMessagesToFile(MQJExplorer.mainFrame, getSelectedQueueName(), queueManagerModel.getQueueManager());
            writemessagestofile.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, writemessagestofile);
            writemessagestofile.setVisible(true);
        }
        catch(Exception _ex) { }
    }

    private JTable table;
    private QueueManagerModel queueManagerModel;
    private JToggleButton showSystemToggleButton;
    private JToggleButton showTempQueuesToggleButton;
    private JToggleButton showLocalQueuesToggleButton;
    private JToggleButton showRemoteQueuesToggleButton;
    private JToggleButton showAliasQueuesToggleButton;
    private JToggleButton showModelQueuesToggleButton;
    private String lastFilePath;
    private transient Profile profile;
    private JMenuItem ivjJMenuItem1;
    private JMenuItem ivjJMenuItem10;
    private JMenuItem ivjJMenuItem12;
    private JMenuItem ivjJMenuItem2;
    private JMenuItem ivjJMenuItem3;
    private JMenuItem ivjJMenuItem4;
    private JMenuItem ivjJMenuItem5;
    private JMenuItem ivjJMenuItem6;
    private JMenuItem ivjJMenuItem7;
    private JMenuItem ivjJMenuItem8;
    private JMenuItem ivjJMenuItem9;
    private JSeparator ivjJSeparator1;
    IvjEventHandler ivjEventHandler;
    private JPopupMenu ivjPopupMenu_QT_LOCAL;
    private JMenuItem ivjJMenuItem13;
    private JMenuItem ivjJMenuItem31;
    private JMenuItem ivjJMenuItem41;
    private JMenuItem ivjJMenuItem81;
    private JSeparator ivjJSeparator11;
    private JPopupMenu ivjPopupMenu_QT_OTHER;
    private JMenuItem ivjJMenuItem131;
    private JMenuItem ivjJMenuItem311;
    private JMenuItem ivjJMenuItem411;
    private JMenuItem ivjJMenuItem71;
    private JMenuItem ivjJMenuItem811;
    private JSeparator ivjJSeparator111;
    private JPopupMenu ivjPopupMenu_QT_REMOTE;
    private JMenuItem ivjJMenuItem14;
    private SortButtonRenderer sortButtonRenderer;
    private JMenuItem ivjDisableQueueMenuItem;
    private JMenuItem ivjEnableQueueMenuItem;
    private JMenu ivjJMenu1;














































}
