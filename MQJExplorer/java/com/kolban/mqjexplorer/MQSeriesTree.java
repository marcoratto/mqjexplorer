// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQSeriesTree.java

package com.kolban.mqjexplorer;

import com.ibm.mq.*;
import com.kolban.mqjexplorer.beans.EscapeDlg;
import com.kolban.mqjexplorer.beans.EventDlg;
import com.kolban.mqjexplorer.beans.ShowQueueManager;
import com.kolban.mqjexplorer.commands.StopDialog;
import com.kolban.mqjexplorer.jms.JNDINameSpace;
import com.kolban.mqjexplorer.jms.NewSubContext;
import com.kolban.mqjexplorer.jms.SelectNameSpaceDlg;
import com.kolban.swing.SwingUtils;
import com.kolban.wmqi.XMLEntryAssist;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;
import javax.naming.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

// Referenced classes of package com.kolban.mqjexplorer:
//            MQJExplorer, QueueManagerModel, MQSeriesTreeListener

public class MQSeriesTree
    implements TreeSelectionListener, MouseListener, ActionListener, Serializable
{
    class MQTreeModel extends DefaultTreeModel
    {

        public int getChildCount(Object obj)
        {
            MQJExplorerNode mqjexplorernode = (MQJExplorerNode)obj;
            if(!mqjexplorernode.visited)
            {
                mqjexplorernode.visited = true;
                addChildren(mqjexplorernode);
            }
            int i = super.getChildCount(obj);
            DefaultMutableTreeNode _tmp = (DefaultMutableTreeNode)obj;
            System.out.println(obj.toString() + " Child Count: " + i);
            return i;
        }

        public boolean isLeaf(Object obj)
        {
            MQJExplorerNode mqjexplorernode = (MQJExplorerNode)obj;
            MQJExplorerNode mqjexplorernode1 = (MQJExplorerNode)obj;
            if(mqjexplorernode1.getType() != 13 && mqjexplorernode1.getType() != 12)
            {
                boolean flag = super.isLeaf(obj);
                return flag;
            } else
            {
                boolean flag1 = mqjexplorernode1.getJNDINameSpace().getSubContextCount() == 0;
                System.out.println(mqjexplorernode.toString() + "->IsLeaf (JMS): " + flag1);
                return flag1;
            }
        }

        public MQTreeModel(TreeNode treenode)
        {
            super(treenode);
        }
    }

    class MQTreeExpansionListener
        implements TreeExpansionListener
    {

        public void treeExpanded(TreeExpansionEvent treeexpansionevent)
        {
            System.out.println("Path: " + treeexpansionevent.getPath().toString());
            addChildren((MQJExplorerNode)treeexpansionevent.getPath().getLastPathComponent());
        }

        public void treeCollapsed(TreeExpansionEvent treeexpansionevent)
        {
        }

        MQTreeExpansionListener()
        {
        }
    }

    class MQCellRenderer extends DefaultTreeCellRenderer
    {

        public Component getTreeCellRendererComponent(JTree jtree, Object obj, boolean flag, boolean flag1, boolean flag2, int i, boolean flag3)
        {
            super.setBackgroundNonSelectionColor(jtree.getBackground());
            ImageIcon imageicon = new ImageIcon(getClass().getResource("/icons/folder.gif"));
            if(obj instanceof MQJExplorerNode)
            {
                imageicon = new ImageIcon(getClass().getResource("/icons/folder.gif"));
                MQJExplorerNode mqjexplorernode = (MQJExplorerNode)obj;
                if(mqjexplorernode.getType() == 2)
                    if(mqjexplorernode.queueManagerModel.isConnected())
                        imageicon = new ImageIcon(getClass().getResource("/icons/queueManagerConnected.gif"));
                    else
                        imageicon = new ImageIcon(getClass().getResource("/icons/queueManager.gif"));
                if(mqjexplorernode.getType() == 12)
                    if(mqjexplorernode.getJNDINameSpace().isConnected())
                        imageicon = new ImageIcon(getClass().getResource("/icons/treeicons/HomeConnected.gif"));
                    else
                        imageicon = new ImageIcon(getClass().getResource("/icons/treeicons/HomeDisconnected.gif"));
                if(mqjexplorernode.getType() == 14 && mqjexplorernode.getFlags() == 0)
                    imageicon = new ImageIcon(getClass().getResource("/icons/treeicons/closedFolder.gif"));
            }
            setOpenIcon(imageicon);
            setLeafIcon(imageicon);
            setClosedIcon(imageicon);
            return super.getTreeCellRendererComponent(jtree, obj, flag, flag1, flag2, i, flag3);
        }

        public MQCellRenderer()
        {
        }
    }

    class MQJExplorerNode extends DefaultMutableTreeNode
    {

        public int getType()
        {
            return type;
        }

        public int getFlags()
        {
            return flags;
        }

        public void setFlags(int i)
        {
            flags = i;
        }

        public QueueManagerModel getQueueManagerModel()
        {
            return queueManagerModel;
        }

        public JNDINameSpace getJNDINameSpace()
        {
            return nameSpace;
        }

        public void setVisited(boolean flag)
        {
            visited = flag;
        }

        public boolean getVisited()
        {
            return visited;
        }

        private String text;
        private int type;
        private int flags;
        private QueueManagerModel queueManagerModel;
        private JNDINameSpace nameSpace;
        private boolean visited;




        public MQJExplorerNode(String s, QueueManagerModel queuemanagermodel, int i)
        {
            super(s);
            queueManagerModel = null;
            nameSpace = null;
            visited = false;
            text = s;
            queueManagerModel = queuemanagermodel;
            type = i;
            flags = 0;
        }

        public MQJExplorerNode(QueueManagerModel queuemanagermodel, int i)
        {
            super(queuemanagermodel);
            queueManagerModel = null;
            nameSpace = null;
            visited = false;
            text = queuemanagermodel.toString();
            queueManagerModel = queuemanagermodel;
            type = i;
            flags = 0;
        }

        public MQJExplorerNode(String s, int i)
        {
            super(s);
            queueManagerModel = null;
            nameSpace = null;
            visited = false;
            text = s;
            queueManagerModel = null;
            type = i;
            flags = 0;
        }

        public MQJExplorerNode(JNDINameSpace jndinamespace, int i)
        {
            super(jndinamespace);
            queueManagerModel = null;
            nameSpace = null;
            visited = false;
            text = jndinamespace.toString();
            queueManagerModel = null;
            nameSpace = jndinamespace;
            type = i;
        }
    }


    public MQSeriesTree()
    {
        treeListeners = new Vector();
        lastQueueManagerModel = null;
        queueManagerCount = 0;
        queueManagerVector = new Vector();
        jmsJNDINameSpaceVector = new Vector();
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        String s = actionevent.getActionCommand();
        if(s.equals("wmqiEntryAssist"))
        {
            XMLEntryAssist xmlentryassist = new XMLEntryAssist(MQJExplorer.mainFrame);
            xmlentryassist.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, xmlentryassist);
            xmlentryassist.show();
            return;
        }
        if(s.equals("eventMonitor"))
        {
            TreePath treepath = tree.getSelectionPath();
            if(treepath == null)
                return;
            EventDlg eventdlg = new EventDlg();
            MQJExplorerNode mqjexplorernode2 = (MQJExplorerNode)treepath.getLastPathComponent();
            QueueManagerModel queuemanagermodel1 = mqjexplorernode2.getQueueManagerModel();
            try
            {
                eventdlg.setQueueManager(queuemanagermodel1.getNewQueueManager());
                eventdlg.pack();
                SwingUtils.setCenter(MQJExplorer.mainFrame, eventdlg);
                eventdlg.show();
            }
            catch(MQException mqexception)
            {
                QueueManagerModel.displayError(mqexception);
            }
            return;
        }
        if(s.equals("mqscCommand"))
        {
            TreePath treepath1 = tree.getSelectionPath();
            if(treepath1 == null)
            {
                return;
            } else
            {
                EscapeDlg escapedlg = new EscapeDlg(MQJExplorer.mainFrame);
                MQJExplorerNode mqjexplorernode3 = (MQJExplorerNode)treepath1.getLastPathComponent();
                escapedlg.setQueueManagerModel(mqjexplorernode3.getQueueManagerModel());
                escapedlg.pack();
                SwingUtils.setCenter(MQJExplorer.mainFrame, escapedlg);
                escapedlg.show();
                return;
            }
        }
        if(s.equals("remove"))
        {
            removeSelectedQueueManager();
            return;
        }
        if(s.equals("removeJMSNameSpace"))
        {
            removeSelectedJMSNameSpace();
            return;
        }
        if(s.equals("connectJMSNameSpace"))
        {
            connectSelected();
            return;
        }
        if(s.equals("connect"))
        {
            connectSelected();
            return;
        }
        if(s.equals("disconnectJMSNameSpace"))
        {
            disconnectSelected();
            return;
        }
        if(s.equals("disconnect"))
        {
            disconnectSelected();
            return;
        }
        if(s.equals("qmgrProperties"))
        {
            TreePath treepath2 = tree.getSelectionPath();
            if(treepath2 == null)
            {
                return;
            } else
            {
                MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath2.getLastPathComponent();
                mqjexplorernode.getQueueManagerModel().changeProperties();
                return;
            }
        }
        if(s.equals("qmgrStop"))
        {
            TreePath treepath3 = tree.getSelectionPath();
            if(treepath3 == null)
            {
                return;
            } else
            {
                MQJExplorerNode mqjexplorernode1 = (MQJExplorerNode)treepath3.getLastPathComponent();
                QueueManagerModel queuemanagermodel = mqjexplorernode1.getQueueManagerModel();
                queuemanagermodel.disconnect();
                StopDialog stopdialog = new StopDialog();
                stopdialog.setQueueManagerName(queuemanagermodel.getQueueManagerName());
                stopdialog.pack();
                stopdialog.setVisible(true);
                return;
            }
        }
        if(s.equals("selectJNDINamespace"))
        {
            addJNDINameSpace();
            return;
        }
        if(s.equals("createJMSContext"))
        {
            createSubContext();
            return;
        }
        if(s.equals("deleteJMSContext"))
        {
            deleteSubContext();
            return;
        }
        if(s.equals("modifyQmgr"))
        {
            modifySelectedQmgr();
            return;
        } else
        {
            forwardMenuAction(actionevent);
            return;
        }
    }

    private void addChildren(MQJExplorerNode mqjexplorernode)
    {
        for(Enumeration enumeration = mqjexplorernode.children(); enumeration.hasMoreElements();)
        {
            MQJExplorerNode mqjexplorernode1 = (MQJExplorerNode)enumeration.nextElement();
            if((mqjexplorernode1.getType() == 13 || mqjexplorernode1.getType() == 12) & (!mqjexplorernode1.getVisited()))
            {
                JNDINameSpace jndinamespace = mqjexplorernode1.getJNDINameSpace();
                if(jndinamespace.isConnected())
                {
                    mqjexplorernode1.setVisited(true);
                    int i = jndinamespace.getSubContextCount();
                    for(int j = 0; j < i; j++)
                    {
                        Binding binding = jndinamespace.getSubContextBinding(j);
                        Context context = (Context)binding.getObject();
                        String s = binding.getName();
                        JNDINameSpace jndinamespace1 = new JNDINameSpace();
                        jndinamespace1.setContext(context);
                        jndinamespace1.setProviderURL(s);
                        jndinamespace1.refresh();
                        MQJExplorerNode mqjexplorernode2 = new MQJExplorerNode(jndinamespace1, 13);
                        treeModel.insertNodeInto(mqjexplorernode2, mqjexplorernode1, mqjexplorernode1.getChildCount());
                    }

                }
            }
        }

    }

    public void addJNDINameSpace()
    {
        addJNDINameSpace(null);
    }

    public void addJNDINameSpace(JNDINameSpace jndinamespace)
    {
        if(jndinamespace == null)
        {
            SelectNameSpaceDlg selectnamespacedlg = new SelectNameSpaceDlg();
            selectnamespacedlg.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, selectnamespacedlg);
            selectnamespacedlg.show();
            if(selectnamespacedlg.getReturnValue() != 1)
                return;
            jndinamespace = new JNDINameSpace();
            jndinamespace.setInitialContext(selectnamespacedlg.getInitialContextFactory());
            jndinamespace.setProviderURL(selectnamespacedlg.getProviderURL());
        }
        jmsJNDINameSpaceVector.add(jndinamespace);
        MQJExplorerNode mqjexplorernode = new MQJExplorerNode(jndinamespace, 12);
        treeModel.insertNodeInto(mqjexplorernode, jmsRootNode, jmsRootNode.getChildCount());
    }

    public void addMQSeriesTreeListener(MQSeriesTreeListener mqseriestreelistener)
    {
        if(treeListeners == null)
            treeListeners = new Vector();
        treeListeners.add(mqseriestreelistener);
    }

    public void addQueueManager(QueueManagerModel queuemanagermodel)
    {
        MQJExplorerNode mqjexplorernode;
        mqjexplorernode = mqjexplorernode = new MQJExplorerNode(queuemanagermodel, 2);
        treeModel.insertNodeInto(mqjexplorernode, queueManagersNode, queueManagersNode.getChildCount());
        refreshConnected(queuemanagermodel);
        queueManagerCount++;
        if(queueManagerVector == null)
            queueManagerVector = new Vector();
        queueManagerVector.add(queuemanagermodel);
    }

    public JTree buildTree()
    {
        MQJExplorerNode mqjexplorernode = new MQJExplorerNode("IBM MQSeries", null, 9);
        queueManagersNode = new MQJExplorerNode("Queue Managers", null, 5);
        jmsRootNode = new MQJExplorerNode("JMS", null, 10);
        treeModel = new DefaultTreeModel(mqjexplorernode);
        treeModel.insertNodeInto(queueManagersNode, mqjexplorernode, 0);
        treeModel.insertNodeInto(jmsRootNode, mqjexplorernode, 1);
        tree = new JTree(treeModel);
        tree.addMouseListener(this);
        tree.addTreeSelectionListener(this);
        tree.addTreeExpansionListener(new MQTreeExpansionListener());
        tree.putClientProperty("JTree.lineStyle", "Angled");
        tree.setCellRenderer(new MQCellRenderer());
        Vector vector = queueManagerVector;
        queueManagerVector = new Vector();
        QueueManagerModel queuemanagermodel;
        for(Enumeration enumeration = vector.elements(); enumeration.hasMoreElements(); addQueueManager(queuemanagermodel))
            queuemanagermodel = (QueueManagerModel)enumeration.nextElement();

        vector = jmsJNDINameSpaceVector;
        jmsJNDINameSpaceVector = new Vector();
        JNDINameSpace jndinamespace;
        for(Enumeration enumeration1 = vector.elements(); enumeration1.hasMoreElements(); addJNDINameSpace(jndinamespace))
            jndinamespace = (JNDINameSpace)enumeration1.nextElement();

        return tree;
    }

    public void connectSelected()
    {
        TreePath treepath = tree.getSelectionPath();
        if(treepath == null)
            return;
        MQJExplorer.mainFrame.setCursor(new Cursor(3));
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath.getLastPathComponent();
        if(mqjexplorernode.getType() == 2)
            try
            {
                mqjexplorernode.getQueueManagerModel().connect();
                refreshConnected(mqjexplorernode.getQueueManagerModel());
            }
            catch(MQException mqexception)
            {
                System.out.println("connectSelected: " + mqexception.toString());
                QueueManagerModel.displayError(mqexception);
            }
        else
        if(mqjexplorernode.getType() == 12)
        {
            mqjexplorernode.getJNDINameSpace().connect();
            addChildren((MQJExplorerNode)mqjexplorernode.getParent());
            tree.collapsePath(treepath);
            tree.fireTreeCollapsed(treepath);
        }
        MQJExplorer.mainFrame.setCursor(new Cursor(0));
    }

    private void createSubContext()
    {
        TreePath treepath = tree.getSelectionPath();
        if(treepath == null)
            return;
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath.getLastPathComponent();
        if(mqjexplorernode.getType() == 13 || mqjexplorernode.getType() == 12)
        {
            NewSubContext newsubcontext = new NewSubContext();
            newsubcontext.pack();
            SwingUtils.setCenter(MQJExplorer.mainFrame, newsubcontext);
            newsubcontext.show();
            if(newsubcontext.getRc() == 1)
            {
                JNDINameSpace jndinamespace = mqjexplorernode.getJNDINameSpace();
                try
                {
                    JNDINameSpace jndinamespace1 = jndinamespace.newSubContext(newsubcontext.getSubContextName());
                    jndinamespace.refresh();
                    MQJExplorerNode mqjexplorernode1 = new MQJExplorerNode(jndinamespace1, 13);
                    mqjexplorernode1.setVisited(true);
                    treeModel.insertNodeInto(mqjexplorernode1, mqjexplorernode, mqjexplorernode.getChildCount());
                }
                catch(NameAlreadyBoundException _ex)
                {
                    JOptionPane.showMessageDialog(null, "Name already bound", "Create Error", 0);
                }
                catch(Exception exception)
                {
                    JOptionPane.showMessageDialog(null, exception.toString(), "Create Error", 0);
                    System.out.println("Failed to create context" + exception.toString());
                }
            }
        }
    }

    private void deleteSubContext()
    {
        TreePath treepath = tree.getSelectionPath();
        if(treepath == null)
            return;
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath.getLastPathComponent();
        if(mqjexplorernode.getType() == 13)
        {
            MQJExplorerNode mqjexplorernode1 = (MQJExplorerNode)mqjexplorernode.getParent();
            JNDINameSpace jndinamespace = mqjexplorernode1.getJNDINameSpace();
            try
            {
                jndinamespace.deleteSubContext(mqjexplorernode.getJNDINameSpace().getProviderURL());
                jndinamespace.refresh();
                treeModel.removeNodeFromParent(mqjexplorernode);
            }
            catch(ContextNotEmptyException _ex)
            {
                JOptionPane.showMessageDialog(null, "Context not empty!", "Delete Error", 0);
            }
            catch(NamingException namingexception)
            {
                JOptionPane.showMessageDialog(null, namingexception.toString(), "Delete Error", 0);
            }
        }
    }

    public void disconnectSelected()
    {
        TreePath treepath = tree.getSelectionPath();
        if(treepath == null)
            return;
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath.getLastPathComponent();
        if(mqjexplorernode.getType() == 2)
            mqjexplorernode.getQueueManagerModel().disconnect();
        else
        if(mqjexplorernode.getType() == 13 || mqjexplorernode.getType() == 12)
        {
            mqjexplorernode.getJNDINameSpace().disconnect();
            mqjexplorernode.setVisited(false);
        }
        DefaultTreeModel defaulttreemodel = (DefaultTreeModel)tree.getModel();
        defaulttreemodel.nodeChanged(mqjexplorernode);
        do
            try
            {
                DefaultMutableTreeNode defaultmutabletreenode = (DefaultMutableTreeNode)mqjexplorernode.getFirstChild();
                defaulttreemodel.removeNodeFromParent(defaultmutabletreenode);
            }
            catch(Exception _ex)
            {
                return;
            }
        while(true);
    }

    private DefaultMutableTreeNode findQueueManager(QueueManagerModel queuemanagermodel)
    {
        for(Enumeration enumeration = queueManagersNode.children(); enumeration.hasMoreElements();)
        {
            DefaultMutableTreeNode defaultmutabletreenode = (DefaultMutableTreeNode)enumeration.nextElement();
            if(defaultmutabletreenode.getUserObject() == queuemanagermodel)
                return defaultmutabletreenode;
        }

        return null;
    }

    public void forwardMenuAction(ActionEvent actionevent)
    {
        MQSeriesTreeListener mqseriestreelistener;
        for(Enumeration enumeration = treeListeners.elements(); enumeration.hasMoreElements(); mqseriestreelistener.menuAction(actionevent))
            mqseriestreelistener = (MQSeriesTreeListener)enumeration.nextElement();

    }

    public int getQueueManagerCount()
    {
        return queueManagerCount;
    }

    public void load(String s)
    {
        FileInputStream fileinputstream = null;
        ObjectInputStream objectinputstream = null;
        try
        {
            fileinputstream = new FileInputStream(s);
            objectinputstream = new ObjectInputStream(fileinputstream);
            do
            {
                QueueManagerModel queuemanagermodel = (QueueManagerModel)objectinputstream.readObject();
                addQueueManager(queuemanagermodel);
            } while(true);
        }
        catch(EOFException _ex) { }
        catch(Exception exception)
        {
            System.out.println("Exception " + exception.toString());
        }
        try
        {
            objectinputstream.close();
            fileinputstream.close();
        }
        catch(Exception _ex) { }
    }

    public void maybePopup(MouseEvent mouseevent)
    {
        if(!mouseevent.isPopupTrigger())
            return;
        TreePath treepath = tree.getPathForLocation(mouseevent.getX(), mouseevent.getY());
        if(treepath == null)
            return;
        System.out.println("Path: " + treepath.toString());
        tree.setSelectionPath(treepath);
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath.getLastPathComponent();
        JPopupMenu jpopupmenu = new JPopupMenu();
        switch(mqjexplorernode.getType())
        {
        case 2: // '\002'
            JMenuItem jmenuitem;
            if(!mqjexplorernode.queueManagerModel.isConnected())
            {
                jmenuitem = new JMenuItem("Connect");
                jmenuitem.setActionCommand("connect");
                jmenuitem.addActionListener(this);
            } else
            {
                jmenuitem = new JMenuItem("Disconnect");
                jmenuitem.setActionCommand("disconnect");
                jmenuitem.addActionListener(this);
            }
            jpopupmenu.add(jmenuitem);
            jmenuitem = new JMenuItem("Properties...");
            jmenuitem.setActionCommand("qmgrProperties");
            jmenuitem.addActionListener(this);
            if(!mqjexplorernode.getQueueManagerModel().isConnected())
                jmenuitem.setEnabled(false);
            jpopupmenu.add(jmenuitem);
            jmenuitem = new JMenuItem("Event Monitor...");
            jmenuitem.setActionCommand("eventMonitor");
            jmenuitem.addActionListener(this);
            if(!mqjexplorernode.getQueueManagerModel().isConnected())
                jmenuitem.setEnabled(false);
            jpopupmenu.add(jmenuitem);
            jmenuitem = new JMenuItem("Run MQSC Command...");
            jmenuitem.setActionCommand("mqscCommand");
            jmenuitem.addActionListener(this);
            if(!mqjexplorernode.getQueueManagerModel().isConnected())
                jmenuitem.setEnabled(false);
            jpopupmenu.add(jmenuitem);
            if(mqjexplorernode.queueManagerModel.isLocal())
            {
                jmenuitem = new JMenuItem("Stop...");
                jmenuitem.setActionCommand("qmgrStop");
                jmenuitem.addActionListener(this);
                jpopupmenu.add(jmenuitem);
            }
            jmenuitem = new JMenuItem("Modify...");
            jmenuitem.setActionCommand("modifyQmgr");
            jmenuitem.addActionListener(this);
            jpopupmenu.add(jmenuitem);
            jpopupmenu.addSeparator();
            jmenuitem = new JMenuItem("Remove");
            jmenuitem.setActionCommand("remove");
            jmenuitem.addActionListener(this);
            jpopupmenu.add(jmenuitem);
            break;

        case 1: // '\001'
            JMenuItem jmenuitem1 = new JMenuItem("New Local Queue...");
            jmenuitem1.setActionCommand("createLocalQueue");
            jmenuitem1.addActionListener(this);
            jpopupmenu.add(jmenuitem1);
            jmenuitem1 = new JMenuItem("New Alias Queue...");
            jmenuitem1.setActionCommand("createAliasQueue");
            jmenuitem1.addActionListener(this);
            jpopupmenu.add(jmenuitem1);
            jmenuitem1 = new JMenuItem("New Model Queue...");
            jmenuitem1.setActionCommand("createModelQueue");
            jmenuitem1.addActionListener(this);
            jpopupmenu.add(jmenuitem1);
            jmenuitem1 = new JMenuItem("New Remote Queue...");
            jmenuitem1.setActionCommand("createRemoteQueue");
            jmenuitem1.addActionListener(this);
            jpopupmenu.add(jmenuitem1);
            jpopupmenu.addSeparator();
            jmenuitem1 = new JMenuItem("Add queue filter...");
            jmenuitem1.setActionCommand("filterQueues");
            jmenuitem1.addActionListener(this);
            jpopupmenu.add(jmenuitem1);
            jmenuitem1 = new JMenuItem("Display queue stats...");
            jmenuitem1.setActionCommand("queueStats");
            jmenuitem1.addActionListener(this);
            jpopupmenu.add(jmenuitem1);
            jpopupmenu.addSeparator();
            jmenuitem1 = new JMenuItem("Refresh");
            jmenuitem1.setActionCommand("refresh");
            jmenuitem1.addActionListener(this);
            jpopupmenu.add(jmenuitem1);
            break;

        case 5: // '\005'
            JMenuItem jmenuitem2 = new JMenuItem("Show Queue Manager");
            jmenuitem2.setActionCommand("showQueueManager");
            jmenuitem2.addActionListener(this);
            jpopupmenu.add(jmenuitem2);
            break;

        case 10: // '\n'
            JMenuItem jmenuitem3 = new JMenuItem("Select JNDI Namespace");
            jmenuitem3.setActionCommand("selectJNDINamespace");
            jmenuitem3.addActionListener(this);
            jpopupmenu.add(jmenuitem3);
            break;

        case 12: // '\f'
        case 13: // '\r'
            boolean flag = mqjexplorernode.getJNDINameSpace().isConnected();
            if(mqjexplorernode.getType() == 12)
                if(!flag)
                {
                    JMenuItem jmenuitem4 = new JMenuItem("Connect");
                    jmenuitem4.setActionCommand("connectJMSNameSpace");
                    jmenuitem4.addActionListener(this);
                    jpopupmenu.add(jmenuitem4);
                } else
                {
                    JMenuItem jmenuitem5 = new JMenuItem("Disconnect");
                    jmenuitem5.setActionCommand("disconnectJMSNameSpace");
                    jmenuitem5.addActionListener(this);
                    jpopupmenu.add(jmenuitem5);
                }
            JMenuItem jmenuitem6 = new JMenuItem("Create Queue...");
            jmenuitem6.setActionCommand("createJMSQueue");
            jmenuitem6.addActionListener(this);
            jmenuitem6.setEnabled(flag);
            jpopupmenu.add(jmenuitem6);
            jmenuitem6 = new JMenuItem("Create Topic...");
            jmenuitem6.setActionCommand("createJMSTopic");
            jmenuitem6.setEnabled(flag);
            jmenuitem6.addActionListener(this);
            jpopupmenu.add(jmenuitem6);
            jmenuitem6 = new JMenuItem("Create Queue Connection Factory...");
            jmenuitem6.setActionCommand("createJMSQueueConnectionFactory");
            jmenuitem6.setEnabled(flag);
            jmenuitem6.addActionListener(this);
            jpopupmenu.add(jmenuitem6);
            jmenuitem6 = new JMenuItem("Create Topic Connection Factory...");
            jmenuitem6.setActionCommand("createJMSTopicConnectionFactory");
            jmenuitem6.setEnabled(flag);
            jmenuitem6.addActionListener(this);
            jpopupmenu.add(jmenuitem6);
            jmenuitem6 = new JMenuItem("Create XA Queue Connection Factory...");
            jmenuitem6.setActionCommand("createJMSXAQueueConnectionFactory");
            jmenuitem6.setEnabled(flag);
            jmenuitem6.addActionListener(this);
            jpopupmenu.add(jmenuitem6);
            jmenuitem6 = new JMenuItem("Create XA Topic Connection Factory...");
            jmenuitem6.setActionCommand("createJMSXATopicConnectionFactory");
            jmenuitem6.setEnabled(flag);
            jmenuitem6.addActionListener(this);
            jpopupmenu.add(jmenuitem6);
            jmenuitem6 = new JMenuItem("Create WAS Queue Connection Factory...");
            jmenuitem6.setActionCommand("createWASQueueConnectionFactory");
            jmenuitem6.setEnabled(flag);
            jmenuitem6.addActionListener(this);
            jpopupmenu.add(jmenuitem6);
            jmenuitem6 = new JMenuItem("Create WAS Topic Connection Factory...");
            jmenuitem6.setActionCommand("createWASTopicConnectionFactory");
            jmenuitem6.setEnabled(flag);
            jmenuitem6.addActionListener(this);
            jpopupmenu.add(jmenuitem6);
            jpopupmenu.add(new JSeparator());
            jmenuitem6 = new JMenuItem("Create Context...");
            jmenuitem6.setActionCommand("createJMSContext");
            jmenuitem6.addActionListener(this);
            jmenuitem6.setEnabled(flag);
            jpopupmenu.add(jmenuitem6);
            jmenuitem6 = new JMenuItem("Delete Context");
            jmenuitem6.setActionCommand("deleteJMSContext");
            jmenuitem6.addActionListener(this);
            jmenuitem6.setEnabled(mqjexplorernode.getType() != 12);
            jpopupmenu.add(jmenuitem6);
            jpopupmenu.add(new JSeparator());
            jmenuitem6 = new JMenuItem("Remove");
            jmenuitem6.setActionCommand("removeJMSNameSpace");
            jmenuitem6.addActionListener(this);
            jmenuitem6.setEnabled(mqjexplorernode.getType() == 12);
            jpopupmenu.add(jmenuitem6);
            break;

        case 4: // '\004'
            String as[][] = {
                {
                    "New Sender Channel", "createSenderChannel"
                }, {
                    "New Server Channel", "createServerChannel"
                }, {
                    "New Receiver Channel", "createReceiverChannel"
                }, {
                    "New Requester Channel", "createRequesterChannel"
                }, {
                    "New Server Connection Channel", "createServerConnectionChannel"
                }, {
                    "New Cluster Sender Channel", "createClusterSenderChannel"
                }, {
                    "New Cluster Receiver Channel", "createClusterReceiverChannel"
                }
            };
            for(int i = 0; i < as.length; i++)
            {
                JMenuItem jmenuitem7 = new JMenuItem(as[i][0]);
                jmenuitem7.setActionCommand(as[i][1]);
                jmenuitem7.addActionListener(this);
                jpopupmenu.add(jmenuitem7);
            }

            jpopupmenu.addSeparator();
            JMenuItem jmenuitem8 = new JMenuItem("Refresh");
            jmenuitem8.setActionCommand("refresh");
            jmenuitem8.addActionListener(this);
            jpopupmenu.add(jmenuitem8);
            break;

        case 7: // '\007'
            String as1[][] = {
                {
                    "New Process Definition", "createProcess"
                }, {
                    "sep", ""
                }, {
                    "Refresh", "refresh"
                }
            };
            for(int j = 0; j < as1.length; j++)
                if(as1[j][0] != "sep")
                {
                    JMenuItem jmenuitem9 = new JMenuItem(as1[j][0]);
                    jmenuitem9.setActionCommand(as1[j][1]);
                    jmenuitem9.addActionListener(this);
                    jpopupmenu.add(jmenuitem9);
                } else
                {
                    jpopupmenu.addSeparator();
                }

            break;

        case 8: // '\b'
            String as2[][] = {
                {
                    "New NameList Definition", "createNameList"
                }, {
                    "sep", ""
                }, {
                    "Refresh", "refresh"
                }
            };
            for(int k = 0; k < as2.length; k++)
                if(as2[k][0] != "sep")
                {
                    JMenuItem jmenuitem10 = new JMenuItem(as2[k][0]);
                    jmenuitem10.setActionCommand(as2[k][1]);
                    jmenuitem10.addActionListener(this);
                    jpopupmenu.add(jmenuitem10);
                } else
                {
                    jpopupmenu.addSeparator();
                }

            break;

        case 9: // '\t'
            JMenuItem jmenuitem11 = new JMenuItem("WMQI XML Entry Assist");
            jmenuitem11.setActionCommand("wmqiEntryAssist");
            jmenuitem11.addActionListener(this);
            jpopupmenu.add(jmenuitem11);
            break;

        case 14: // '\016'
            JMenuItem jmenuitem12 = new JMenuItem("Register Subscriber...");
            jmenuitem12.setActionCommand("pubSubRegSub");
            jmenuitem12.addActionListener(this);
            jpopupmenu.add(jmenuitem12);
            break;

        case 3: // '\003'
        case 6: // '\006'
        case 11: // '\013'
        default:
            return;
        }
        jpopupmenu.show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
    }

    public void modifySelectedQmgr()
    {
        TreePath treepath = tree.getSelectionPath();
        if(treepath == null)
            return;
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath.getLastPathComponent();
        if(mqjexplorernode.getType() != 2)
            return;
        boolean flag = selectQueueManager(mqjexplorernode.getQueueManagerModel().isLocal(), mqjexplorernode.getQueueManagerModel().getQueueManagerName(), mqjexplorernode.getQueueManagerModel().getHostName() + "(" + mqjexplorernode.getQueueManagerModel().getPort() + ")");
        if(flag)
            removeSelectedQueueManager();
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
        TreePath treepath = tree.getPathForLocation(mouseevent.getX(), mouseevent.getY());
        if(treepath == null)
        {
            return;
        } else
        {
            tree.setSelectionPath(treepath);
            maybePopup(mouseevent);
            return;
        }
    }

    public void mouseReleased(MouseEvent mouseevent)
    {
        maybePopup(mouseevent);
    }

    public void refreshConnected(QueueManagerModel queuemanagermodel)
    {
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)findQueueManager(queuemanagermodel);
        if(mqjexplorernode == null)
            return;
        if(!mqjexplorernode.queueManagerModel.isConnected())
            return;
        MQJExplorerNode mqjexplorernode1 = new MQJExplorerNode("Queues", queuemanagermodel, 1);
        treeModel.insertNodeInto(mqjexplorernode1, mqjexplorernode, mqjexplorernode.getChildCount());
        mqjexplorernode1 = new MQJExplorerNode("Advanced", queuemanagermodel, 3);
        treeModel.insertNodeInto(mqjexplorernode1, mqjexplorernode, mqjexplorernode.getChildCount());
        mqjexplorernode = mqjexplorernode1;
        mqjexplorernode1 = new MQJExplorerNode("Channels", queuemanagermodel, 4);
        treeModel.insertNodeInto(mqjexplorernode1, mqjexplorernode, mqjexplorernode.getChildCount());
        mqjexplorernode1 = new MQJExplorerNode("Client Connections", queuemanagermodel, 6);
        treeModel.insertNodeInto(mqjexplorernode1, mqjexplorernode, mqjexplorernode.getChildCount());
        mqjexplorernode1 = new MQJExplorerNode("Process Definitions", queuemanagermodel, 7);
        treeModel.insertNodeInto(mqjexplorernode1, mqjexplorernode, mqjexplorernode.getChildCount());
        mqjexplorernode1 = new MQJExplorerNode("Namelists", queuemanagermodel, 8);
        treeModel.insertNodeInto(mqjexplorernode1, mqjexplorernode, mqjexplorernode.getChildCount());
        if(mqjexplorernode.queueManagerModel.hasPubSub())
        {
            MQJExplorerNode mqjexplorernode2 = new MQJExplorerNode("Pub/Sub", queuemanagermodel, 14);
            mqjexplorernode2.setFlags(1);
            treeModel.insertNodeInto(mqjexplorernode2, mqjexplorernode, mqjexplorernode.getChildCount());
        }
    }

    public void removeSelectedJMSNameSpace()
    {
        TreePath treepath = tree.getSelectionPath();
        if(treepath == null)
            return;
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath.getLastPathComponent();
        if(mqjexplorernode.getType() != 12)
        {
            return;
        } else
        {
            mqjexplorernode.getJNDINameSpace().disconnect();
            jmsJNDINameSpaceVector.remove(mqjexplorernode.getJNDINameSpace());
            treeModel.removeNodeFromParent(mqjexplorernode);
            return;
        }
    }

    public void removeSelectedQueueManager()
    {
        TreePath treepath = tree.getSelectionPath();
        if(treepath == null)
            return;
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath.getLastPathComponent();
        if(mqjexplorernode.getType() != 2)
            return;
        MQSeriesTreeListener mqseriestreelistener;
        for(Enumeration enumeration = treeListeners.elements(); enumeration.hasMoreElements(); mqseriestreelistener.disconnectQueueManager(mqjexplorernode.getQueueManagerModel()))
            mqseriestreelistener = (MQSeriesTreeListener)enumeration.nextElement();

        try
        {
            try
            {
                mqjexplorernode.getQueueManagerModel().getQueueManager().disconnect();
            }
            catch(Exception _ex) { }
            queueManagerVector.remove(mqjexplorernode.getQueueManagerModel());
            queueManagerCount--;
        }
        catch(Exception _ex) { }
        treeModel.removeNodeFromParent(mqjexplorernode);
    }

    public void save(String s)
    {
        try
        {
            FileOutputStream fileoutputstream = new FileOutputStream(s);
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);
            QueueManagerModel queuemanagermodel;
            for(Enumeration enumeration = queueManagersNode.children(); enumeration.hasMoreElements(); objectoutputstream.writeObject(queuemanagermodel))
                queuemanagermodel = (QueueManagerModel)((DefaultMutableTreeNode)enumeration.nextElement()).getUserObject();

            objectoutputstream.flush();
            fileoutputstream.close();
        }
        catch(Exception exception)
        {
            System.out.println("Exception " + exception.toString());
        }
    }

    public boolean selectQueueManager(boolean flag, String s, String s1)
    {
        ShowQueueManager showqueuemanager = new ShowQueueManager(MQJExplorer.mainFrame);
        showqueuemanager.pack();
        if(s != null)
        {
            showqueuemanager.setLocal(flag);
            showqueuemanager.setQueueManagerName(s);
            showqueuemanager.setConnectionName(s1);
        }
        SwingUtils.setCenter(MQJExplorer.mainFrame, showqueuemanager);
        showqueuemanager.setVisible(true);
        if(showqueuemanager.getReturnCode() != 0)
            return false;
        QueueManagerModel queuemanagermodel = new QueueManagerModel();
        if(showqueuemanager.isLocal())
        {
            queuemanagermodel.setQueueManagerName(showqueuemanager.getQueueManagerName());
        } else
        {
            queuemanagermodel.setChannel("SYSTEM.ADMIN.SVRCONN");
            queuemanagermodel.setQueueManagerName(showqueuemanager.getQueueManagerName());
            try
            {
                queuemanagermodel.parseConnectionString(showqueuemanager.getConnectionName());
            }
            catch(Exception exception)
            {
                System.out.println("Exception: " + exception.toString());
                return false;
            }
        }
        if(queuemanagermodel.isLocal())
            try
            {
                queuemanagermodel.connect();
            }
            catch(MQException _ex) { }
        addQueueManager(queuemanagermodel);
        return true;
    }

    public void valueChanged(TreeSelectionEvent treeselectionevent)
    {
        TreePath treepath = treeselectionevent.getPath();
        if(treepath == null)
            return;
        MQJExplorerNode mqjexplorernode = (MQJExplorerNode)treepath.getLastPathComponent();
        Object obj;
        if(mqjexplorernode.getType() == 13 || mqjexplorernode.getType() == 12)
        {
            obj = mqjexplorernode.getJNDINameSpace();
        } else
        {
            QueueManagerModel queuemanagermodel = mqjexplorernode.getQueueManagerModel();
            lastQueueManagerModel = queuemanagermodel;
            obj = queuemanagermodel;
        }
        if(mqjexplorernode.getType() == 14)
            try
            {
                MQQueue mqqueue = mqjexplorernode.getQueueManagerModel().getQueueManager().accessQueue("SYSTEM.BROKER.CONTROL.QUEUE", 32);
                int j = mqqueue.getOpenInputCount();
                mqqueue.close();
                if(j == 0)
                {
                    System.out.println("Queue open count wrong!");
                    mqjexplorernode.setFlags(0);
                    return;
                }
                mqjexplorernode.setFlags(1);
            }
            catch(Exception _ex) { }
        int i = mqjexplorernode.getType();
        MQSeriesTreeListener mqseriestreelistener;
        for(Enumeration enumeration = treeListeners.elements(); enumeration.hasMoreElements(); mqseriestreelistener.treeSelection(obj, i))
            mqseriestreelistener = (MQSeriesTreeListener)enumeration.nextElement();

    }

    private transient JTree tree;
    private transient MQJExplorerNode queueManagersNode;
    private transient MQJExplorerNode jmsRootNode;
    private transient DefaultTreeModel treeModel;
    private transient Vector treeListeners;
    private transient QueueManagerModel lastQueueManagerModel;
    public static final int TYPE_QUEUE = 1;
    public static final int TYPE_QUEUE_MANAGER = 2;
    public static final int TYPE_ADVANCED = 3;
    public static final int TYPE_CHANNEL = 4;
    public static final int TYPE_ALL_QUEUE_MANAGERS = 5;
    public static final int TYPE_CLIENT_CONNECTION = 6;
    public static final int TYPE_PROCESS = 7;
    public static final int TYPE_NAMELIST = 8;
    public static final int TYPE_ROOT = 9;
    public static final int TYPE_ALL_JMS = 10;
    public static final int TYPE_JMS_QUEUE = 11;
    public static final int TYPE_JMS_NAMESPACE_ROOT = 12;
    public static final int TYPE_JMS_NAMESPACE = 13;
    private transient int queueManagerCount;
    private Vector queueManagerVector;
    private Vector jmsJNDINameSpaceVector;
    public static final int TYPE_PUBSUB = 14;

}
