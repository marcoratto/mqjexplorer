// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BrowseData.java

package com.kolban.mqjexplorer.panels;

import com.ibm.mq.*;
import com.kolban.mq.MQUtils;
import com.kolban.utils.StringUtils;
import com.kolban.xml.DOMTree;
import java.awt.*;
import java.awt.event.*;
import java.io.ByteArrayInputStream;
import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.xerces.parsers.DOMParser;
import org.xml.sax.InputSource;

public class BrowseData extends JPanel
{
    class XMLTreeCellRenderer extends DefaultTreeCellRenderer
    {

        public Component getTreeCellRendererComponent(JTree jtree, Object obj, boolean flag, boolean flag1, boolean flag2, int i, boolean flag3)
        {
            super.setBackgroundNonSelectionColor(jtree.getBackground());
            Component component = super.getTreeCellRendererComponent(jtree, obj, flag, flag1, flag2, i, flag3);
            return component;
        }

        XMLTreeCellRenderer()
        {
        }
    }

    class IvjEventHandler
        implements ActionListener, ItemListener, MouseListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getText())
                connEtoC1();
            if(actionevent.getSource() == getBinary())
                connEtoC2();
            if(actionevent.getSource() == getXMLData())
                connEtoC3();
            if(actionevent.getSource() == getAllDataButton())
                connEtoC4(actionevent);
            if(actionevent.getSource() == getBinary())
                connEtoC5(actionevent);
            if(actionevent.getSource() == getXMLData())
                connEtoC6();
            if(actionevent.getSource() == getEdit())
                connEtoC7(actionevent);
            if(actionevent.getSource() == getJMenuItem1())
                connEtoM2(actionevent);
            if(actionevent.getSource() == getJMenuItem2())
                connEtoM3(actionevent);
        }

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getText())
                connEtoM1(itemevent);
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
            if(mouseevent.getSource() == getXMLTree())
                connEtoC8(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getXMLTree())
                connEtoC9(mouseevent);
        }

        IvjEventHandler()
        {
        }
    }


    public BrowseData()
    {
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjMessageDataLength = null;
        ivjDataArea = null;
        ivjBinary = null;
        ivjText = null;
        ivjGroup1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCardPanel = null;
        ivjDataChoices = null;
        ivjTextScrollPane = null;
        ivjXMLData = null;
        ivjXMLScrollPane = null;
        ivjXMLTree = null;
        ivjAllDataButton = null;
        qMgr = null;
        qName = null;
        row = 0;
        ivjEdit = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjXMLPopupMenu = null;
        initialize();
    }

    public BrowseData(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjMessageDataLength = null;
        ivjDataArea = null;
        ivjBinary = null;
        ivjText = null;
        ivjGroup1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCardPanel = null;
        ivjDataChoices = null;
        ivjTextScrollPane = null;
        ivjXMLData = null;
        ivjXMLScrollPane = null;
        ivjXMLTree = null;
        ivjAllDataButton = null;
        qMgr = null;
        qName = null;
        row = 0;
        ivjEdit = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjXMLPopupMenu = null;
    }

    public BrowseData(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjMessageDataLength = null;
        ivjDataArea = null;
        ivjBinary = null;
        ivjText = null;
        ivjGroup1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCardPanel = null;
        ivjDataChoices = null;
        ivjTextScrollPane = null;
        ivjXMLData = null;
        ivjXMLScrollPane = null;
        ivjXMLTree = null;
        ivjAllDataButton = null;
        qMgr = null;
        qName = null;
        row = 0;
        ivjEdit = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjXMLPopupMenu = null;
    }

    public BrowseData(boolean flag)
    {
        super(flag);
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFormat = null;
        ivjJLabel1 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJPanel1 = null;
        ivjMessageDataLength = null;
        ivjDataArea = null;
        ivjBinary = null;
        ivjText = null;
        ivjGroup1 = null;
        message = null;
        ivjEventHandler = new IvjEventHandler();
        ivjCardPanel = null;
        ivjDataChoices = null;
        ivjTextScrollPane = null;
        ivjXMLData = null;
        ivjXMLScrollPane = null;
        ivjXMLTree = null;
        ivjAllDataButton = null;
        qMgr = null;
        qName = null;
        row = 0;
        ivjEdit = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjXMLPopupMenu = null;
    }

    public void binary_ActionEvents()
    {
        CardLayout cardlayout = (CardLayout)ivjCardPanel.getLayout();
        cardlayout.show(ivjCardPanel, "TEXT");
        setBinaryData(message);
    }

    private void connEtoC1()
    {
        try
        {
            text_ActionEvents();
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
            binary_ActionEvents();
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
            xmlData_ActionEvents();
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
            getAllData(actionevent);
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
            disableEdit();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6()
    {
        try
        {
            disableEdit();
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
            performEdit();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC8(MouseEvent mouseevent)
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

    private void connEtoC9(MouseEvent mouseevent)
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

    private void connEtoM1(ItemEvent itemevent)
    {
        try
        {
            getEdit().setEnabled(getText().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM2(ActionEvent actionevent)
    {
        try
        {
            getXMLTree().expandAll();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM3(ActionEvent actionevent)
    {
        try
        {
            getXMLTree().colapseAll();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void disableEdit()
    {
        getEdit().setEnabled(false);
    }

    private void getAllData(ActionEvent actionevent)
    {
        MQMessage mqmessage = MQUtils.getIndexedMessage(qMgr, qName, row);
        if(mqmessage != null)
            setFromMessage(mqmessage, qMgr, qName, row);
        else
            System.out.println("Failed to get message: " + row);
    }

    private JButton getAllDataButton()
    {
        if(ivjAllDataButton == null)
            try
            {
                ivjAllDataButton = new JButton();
                ivjAllDataButton.setName("AllDataButton");
                ivjAllDataButton.setText("Get all data");
                ivjAllDataButton.setVisible(true);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAllDataButton;
    }

    private JRadioButton getBinary()
    {
        if(ivjBinary == null)
            try
            {
                ivjBinary = new JRadioButton();
                ivjBinary.setName("Binary");
                ivjBinary.setSelected(true);
                ivjBinary.setText("Binary");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBinary;
    }

    private JPanel getCardPanel()
    {
        if(ivjCardPanel == null)
            try
            {
                ivjCardPanel = new JPanel();
                ivjCardPanel.setName("CardPanel");
                ivjCardPanel.setLayout(new CardLayout());
                ivjCardPanel.add(getTextScrollPane(), "TEXT");
                ivjCardPanel.add(getXMLScrollPane(), "XML");
                CardLayout cardlayout = (CardLayout)ivjCardPanel.getLayout();
                cardlayout.show(ivjCardPanel, "TEXT");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCardPanel;
    }

    private JTextField getCCSID()
    {
        if(ivjCCSID == null)
            try
            {
                ivjCCSID = new JTextField();
                ivjCCSID.setName("CCSID");
                ivjCCSID.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCCSID;
    }

    private JTextArea getDataArea()
    {
        if(ivjDataArea == null)
            try
            {
                ivjDataArea = new JTextArea();
                ivjDataArea.setName("DataArea");
                ivjDataArea.setColumns(70);
                ivjDataArea.setFont(new Font("monospaced", 0, 14));
                ivjDataArea.setRows(5);
                ivjDataArea.setBounds(0, 0, 376, 243);
                ivjDataArea.setEditable(false);
                ivjDataArea.setMargin(new Insets(5, 5, 5, 5));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDataArea;
    }

    private JPanel getDataChoices()
    {
        if(ivjDataChoices == null)
            try
            {
                ivjDataChoices = new JPanel();
                ivjDataChoices.setName("DataChoices");
                ivjDataChoices.setLayout(new FlowLayout());
                getDataChoices().add(getBinary(), getBinary().getName());
                getDataChoices().add(getText(), getText().getName());
                getDataChoices().add(getXMLData(), getXMLData().getName());
                getDataChoices().add(getAllDataButton(), getAllDataButton().getName());
                getDataChoices().add(getEdit(), getEdit().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDataChoices;
    }

    private JButton getEdit()
    {
        if(ivjEdit == null)
            try
            {
                ivjEdit = new JButton();
                ivjEdit.setName("Edit");
                ivjEdit.setText("Edit");
                ivjEdit.setEnabled(false);
                ivjEdit.setVisible(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEdit;
    }

    private JTextField getEncoding()
    {
        if(ivjEncoding == null)
            try
            {
                ivjEncoding = new JTextField();
                ivjEncoding.setName("Encoding");
                ivjEncoding.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEncoding;
    }

    private JTextField getFormat()
    {
        if(ivjFormat == null)
            try
            {
                ivjFormat = new JTextField();
                ivjFormat.setName("Format");
                ivjFormat.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFormat;
    }

    private ButtonGroup getGroup1()
    {
        if(ivjGroup1 == null)
            try
            {
                ivjGroup1 = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjGroup1;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Message Data Length:");
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
                ivjJLabel2.setText("Format:");
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
                ivjJLabel3.setText("Coded Character Set ID:");
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
                ivjJLabel4.setText("Encoding:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel4;
    }

    private JMenuItem getJMenuItem1()
    {
        if(ivjJMenuItem1 == null)
            try
            {
                ivjJMenuItem1 = new JMenuItem();
                ivjJMenuItem1.setName("JMenuItem1");
                ivjJMenuItem1.setText("Expand All");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem1;
    }

    private JMenuItem getJMenuItem2()
    {
        if(ivjJMenuItem2 == null)
            try
            {
                ivjJMenuItem2 = new JMenuItem();
                ivjJMenuItem2.setName("JMenuItem2");
                ivjJMenuItem2.setText("Collapse All");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem2;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setBorder(BorderFactory.createTitledBorder("Message Data"));
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 18;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getJPanel1().add(getDataChoices(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getCardPanel(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JTextField getMessageDataLength()
    {
        if(ivjMessageDataLength == null)
            try
            {
                ivjMessageDataLength = new JTextField();
                ivjMessageDataLength.setName("MessageDataLength");
                ivjMessageDataLength.setEditable(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageDataLength;
    }

    private JRadioButton getText()
    {
        if(ivjText == null)
            try
            {
                ivjText = new JRadioButton();
                ivjText.setName("Text");
                ivjText.setText("Text");
                ivjText.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjText;
    }

    private JScrollPane getTextScrollPane()
    {
        if(ivjTextScrollPane == null)
            try
            {
                ivjTextScrollPane = new JScrollPane();
                ivjTextScrollPane.setName("TextScrollPane");
                ivjTextScrollPane.setVerticalScrollBarPolicy(22);
                ivjTextScrollPane.setPreferredSize(new Dimension(290, 200));
                ivjTextScrollPane.setBounds(20, 406, 300, 200);
                getTextScrollPane().setViewportView(getDataArea());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTextScrollPane;
    }

    private JRadioButton getXMLData()
    {
        if(ivjXMLData == null)
            try
            {
                ivjXMLData = new JRadioButton();
                ivjXMLData.setName("XMLData");
                ivjXMLData.setText("XML");
                ivjXMLData.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjXMLData;
    }

    private JPopupMenu getXMLPopupMenu()
    {
        if(ivjXMLPopupMenu == null)
            try
            {
                ivjXMLPopupMenu = new JPopupMenu();
                ivjXMLPopupMenu.setName("XMLPopupMenu");
                ivjXMLPopupMenu.add(getJMenuItem1());
                ivjXMLPopupMenu.add(getJMenuItem2());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjXMLPopupMenu;
    }

    private JScrollPane getXMLScrollPane()
    {
        if(ivjXMLScrollPane == null)
            try
            {
                ivjXMLScrollPane = new JScrollPane();
                ivjXMLScrollPane.setName("XMLScrollPane");
                ivjXMLScrollPane.setPreferredSize(new Dimension(3, 200));
                ivjXMLScrollPane.setBounds(664, 471, 300, 200);
                getXMLScrollPane().setViewportView(getXMLTree());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjXMLScrollPane;
    }

    private DOMTree getXMLTree()
    {
        if(ivjXMLTree == null)
            try
            {
                ivjXMLTree = new DOMTree();
                ivjXMLTree.setName("XMLTree");
                ivjXMLTree.setBounds(0, 0, 297, 297);
                ivjXMLTree.setCellRenderer(new XMLTreeCellRenderer());
                ivjXMLTree.putClientProperty("JTree.lineStyle", "Angled");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjXMLTree;
    }

    private void handleException(Throwable throwable)
    {
        System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        throwable.printStackTrace(System.out);
    }

    private void initConnections()
        throws Exception
    {
        getText().addActionListener(ivjEventHandler);
        getBinary().addActionListener(ivjEventHandler);
        getXMLData().addActionListener(ivjEventHandler);
        getAllDataButton().addActionListener(ivjEventHandler);
        getText().addItemListener(ivjEventHandler);
        getEdit().addActionListener(ivjEventHandler);
        getXMLTree().addMouseListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        getJMenuItem2().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            getGroup1().add(getBinary());
            getGroup1().add(getText());
            getGroup1().add(getXMLData());
            setName("BrowseData");
            setLayout(new GridBagLayout());
            setSize(488, 371);
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
            gridbagconstraints4.fill = 2;
            gridbagconstraints4.weightx = 1.0D;
            gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
            add(getMessageDataLength(), gridbagconstraints4);
            GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
            gridbagconstraints5.gridx = 1;
            gridbagconstraints5.gridy = 2;
            gridbagconstraints5.fill = 2;
            gridbagconstraints5.weightx = 1.0D;
            gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
            add(getCCSID(), gridbagconstraints5);
            GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
            gridbagconstraints6.gridx = 1;
            gridbagconstraints6.gridy = 3;
            gridbagconstraints6.fill = 2;
            gridbagconstraints6.weightx = 1.0D;
            gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
            add(getEncoding(), gridbagconstraints6);
            GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
            gridbagconstraints7.gridx = 1;
            gridbagconstraints7.gridy = 1;
            gridbagconstraints7.fill = 2;
            gridbagconstraints7.weightx = 1.0D;
            gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
            add(getFormat(), gridbagconstraints7);
            GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
            gridbagconstraints8.gridx = 0;
            gridbagconstraints8.gridy = 4;
            gridbagconstraints8.gridwidth = 2;
            gridbagconstraints8.fill = 1;
            gridbagconstraints8.weightx = 1.0D;
            gridbagconstraints8.weighty = 1.0D;
            gridbagconstraints8.insets = new Insets(0, 4, 0, 4);
            add(getJPanel1(), gridbagconstraints8);
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
            BrowseData browsedata = new BrowseData();
            jframe.setContentPane(browsedata);
            jframe.setSize(browsedata.getSize());
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
        {
            return;
        } else
        {
            getXMLPopupMenu().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    public void performEdit()
    {
        getAllData(null);
        getDataArea().setEditable(true);
    }

    private void setBinaryData(MQMessage mqmessage)
    {
        byte abyte0[] = new byte[1];
        String s1 = "";
        String s2 = "";
        System.out.println("ScrollPane width: " + getTextScrollPane().getWidth());
        System.out.println("Text width: " + getDataArea().getWidth());
        try
        {
            FontMetrics fontmetrics = getDataArea().getFontMetrics(getDataArea().getFont());
            int j = fontmetrics.getMaxAdvance();
            int k = getTextScrollPane().getWidth();
            int l = k / j;
            byte byte1;
            if(l >= 60)
                byte1 = 16;
            else
                byte1 = 16;
            mqmessage.seek(0);
            getDataArea().setText("");
            int i;
            for(i = 0; i < mqmessage.getMessageLength(); i++)
            {
                if((i > 0) & (i % byte1 == 0))
                {
                    getDataArea().append(s1 + " " + s2 + "\n");
                    s1 = "";
                    s2 = "";
                }
                if(i % byte1 == byte1 / 2)
                    s1 = s1 + " ";
                byte byte0 = mqmessage.readByte();
                if(byte0 < 31 || byte0 > 127)
                {
                    s2 = s2 + '.';
                } else
                {
                    abyte0[0] = byte0;
                    s2 = s2 + new String(abyte0);
                }
                String s = Integer.toHexString(byte0 & 0xff).toUpperCase();
                if(s.length() < 2)
                    s = "0" + s;
                s1 = s1 + s + " ";
            }

            if(i % byte1 > 0)
                s1 = s1 + " ";
            for(; i % byte1 != 0; i++)
                s1 = s1 + "   ";

            getDataArea().append(s1 + " " + s2 + "\n");
            s1 = "";
            s2 = "";
        }
        catch(Exception _ex) { }
        getDataArea().setCaretPosition(0);
        System.out.println("Text width: " + getDataArea().getWidth());
    }

    private void setCharacterData(MQMessage mqmessage)
    {
        try
        {
            mqmessage.seek(0);
            String s = StringUtils.makePrintable(mqmessage.readString(mqmessage.getDataLength()));
            getDataArea().setText(s);
            getDataArea().setCaretPosition(0);
        }
        catch(Exception _ex) { }
    }

    public void setFromMessage(MQMessage mqmessage, MQQueueManager mqqueuemanager, String s, int i)
    {
        message = mqmessage;
        qMgr = mqqueuemanager;
        qName = s;
        row = i;
        if(((MQMD) (mqmessage)).format.equals("MQSTR   "))
        {
            getText().setEnabled(true);
            getXMLData().setEnabled(true);
        }
        setBinaryData(mqmessage);
        try
        {
            getMessageDataLength().setText(Integer.toString(mqmessage.getTotalMessageLength()));
        }
        catch(Exception _ex) { }
        getFormat().setText(((MQMD) (mqmessage)).format);
        getCCSID().setText(Integer.toString(((MQMD) (mqmessage)).characterSet));
        getEncoding().setText(Integer.toString(((MQMD) (mqmessage)).encoding));
        try
        {
            if(mqmessage.getMessageLength() < mqmessage.getTotalMessageLength())
                getAllDataButton().setVisible(true);
            else
                getAllDataButton().setVisible(false);
        }
        catch(Exception _ex) { }
    }

    public void text_ActionEvents()
    {
        CardLayout cardlayout = (CardLayout)ivjCardPanel.getLayout();
        cardlayout.show(ivjCardPanel, "TEXT");
        setCharacterData(message);
    }

    public void xmlData_ActionEvents()
    {
        CardLayout cardlayout = (CardLayout)ivjCardPanel.getLayout();
        cardlayout.show(ivjCardPanel, "XML");
        try
        {
            DOMParser domparser = new DOMParser();
            message.seek(0);
            byte abyte0[] = new byte[message.getDataLength()];
            message.readFully(abyte0);
            ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
            InputSource inputsource = new InputSource(bytearrayinputstream);
            domparser.parse(inputsource);
            getXMLTree().setDocument(domparser.getDocument());
            for(int i = 0; i < getXMLTree().getRowCount(); i++)
                getXMLTree().expandRow(i);

        }
        catch(Exception exception)
        {
            System.out.println("Exception: XML: ->  " + exception.toString());
        }
    }

    private JTextField ivjCCSID;
    private JTextField ivjEncoding;
    private JTextField ivjFormat;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JPanel ivjJPanel1;
    private JTextField ivjMessageDataLength;
    private JTextArea ivjDataArea;
    private JRadioButton ivjBinary;
    private JRadioButton ivjText;
    private ButtonGroup ivjGroup1;
    private MQMessage message;
    IvjEventHandler ivjEventHandler;
    private JPanel ivjCardPanel;
    private JPanel ivjDataChoices;
    private JScrollPane ivjTextScrollPane;
    private JRadioButton ivjXMLData;
    private JScrollPane ivjXMLScrollPane;
    private DOMTree ivjXMLTree;
    private JButton ivjAllDataButton;
    private MQQueueManager qMgr;
    private String qName;
    private int row;
    private JButton ivjEdit;
    private JMenuItem ivjJMenuItem1;
    private JMenuItem ivjJMenuItem2;
    private JPopupMenu ivjXMLPopupMenu;




















}
