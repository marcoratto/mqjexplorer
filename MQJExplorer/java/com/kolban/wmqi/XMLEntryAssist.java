// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   XMLEntryAssist.java

package com.kolban.wmqi;

import com.kolban.swing.KCardLayout;
import com.kolban.swing.SwingUtils;
import com.kolban.utils.ExampleFileFilter;
import com.kolban.xml.XMLUtils;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.*;
import org.xml.sax.*;

public class XMLEntryAssist extends JDialog
{
    class EntryAssistErrorHandler
        implements ErrorHandler
    {

        public void error(SAXParseException saxparseexception)
        {
        }

        public void warning(SAXParseException saxparseexception)
        {
        }

        public void fatalError(SAXParseException saxparseexception)
            throws SAXException
        {
            System.out.println("<ErrorHandler>Fatal Error: " + saxparseexception.toString());
            System.out.println("<ErrorHandler>at " + saxparseexception.getColumnNumber() + "," + saxparseexception.getLineNumber());
            SwingUtils.setCaretPosition(saxparseexception.getLineNumber() - 1, saxparseexception.getColumnNumber(), getScreenData());
            getScreenData().requestFocus();
            getMessageArea().setVisible(true);
            getMessageArea().setText(saxparseexception.getMessage());
            throw saxparseexception;
        }

        EntryAssistErrorHandler()
        {
        }
    }

    class IvjEventHandler
        implements ActionListener, ComponentListener, ItemListener, MouseListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJButton1())
                connEtoC1();
            if(actionevent.getSource() == getNextButton())
                connEtoC2();
            if(actionevent.getSource() == getPreviousButton())
                connEtoC3();
            if(actionevent.getSource() == getSelectSetFromXML())
                connEtoC4(actionevent);
            if(actionevent.getSource() == getSelectToXML())
                connEtoC5(actionevent);
            if(actionevent.getSource() == getSelectCustom())
                connEtoC6(actionevent);
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC11(actionevent);
            if(actionevent.getSource() == getJMenuItem2())
                connEtoC12(actionevent);
            if(actionevent.getSource() == getBrowse())
                connEtoC13(actionevent);
            if(actionevent.getSource() == getRead())
                connEtoC14(actionevent);
            if(actionevent.getSource() == getJMenuItem3())
                connEtoC15(actionevent);
            if(actionevent.getSource() == getJMenuItem4())
                connEtoC17(actionevent);
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC16(actionevent);
        }

        public void componentHidden(ComponentEvent componentevent)
        {
        }

        public void componentMoved(ComponentEvent componentevent)
        {
        }

        public void componentResized(ComponentEvent componentevent)
        {
            if(componentevent.getSource() == XMLEntryAssist.this)
                connEtoC18(componentevent);
        }

        public void componentShown(ComponentEvent componentevent)
        {
        }

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getSelectCustom())
                connEtoM3(itemevent);
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
            if(mouseevent.getSource() == getResults())
                connEtoC7(mouseevent);
            if(mouseevent.getSource() == getScreenData())
                connEtoC9(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getResults())
                connEtoC8(mouseevent);
            if(mouseevent.getSource() == getScreenData())
                connEtoC10(mouseevent);
        }

        IvjEventHandler()
        {
        }
    }


    public XMLEntryAssist()
    {
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjResults = null;
        ivjEventHandler = new IvjEventHandler();
        document = null;
        ivjCardPanel = null;
        ivjFileName = null;
        ivjJLabel1 = null;
        ivjJScrollPane2 = null;
        ivjResultsPanel = null;
        ivjSourcePanel = null;
        ivjNextButton = null;
        ivjPreviousButton = null;
        ivjCustomFormat = null;
        ivjGroupButtonResultType = null;
        ivjJPanel1 = null;
        ivjSelectCustom = null;
        ivjSelectSetFromXML = null;
        ivjSelectToXML = null;
        ivjScreenData = null;
        ivjBrowse = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjRead = null;
        ivjTextAreaPopupMenu = null;
        menuSelectedTextArea = null;
        ivjMessageArea = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjHeader = null;
        ivjHeaderFlowLayout = null;
        ivjJLabel2 = null;
        initialize();
    }

    public XMLEntryAssist(Dialog dialog)
    {
        super(dialog);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjResults = null;
        ivjEventHandler = new IvjEventHandler();
        document = null;
        ivjCardPanel = null;
        ivjFileName = null;
        ivjJLabel1 = null;
        ivjJScrollPane2 = null;
        ivjResultsPanel = null;
        ivjSourcePanel = null;
        ivjNextButton = null;
        ivjPreviousButton = null;
        ivjCustomFormat = null;
        ivjGroupButtonResultType = null;
        ivjJPanel1 = null;
        ivjSelectCustom = null;
        ivjSelectSetFromXML = null;
        ivjSelectToXML = null;
        ivjScreenData = null;
        ivjBrowse = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjRead = null;
        ivjTextAreaPopupMenu = null;
        menuSelectedTextArea = null;
        ivjMessageArea = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjHeader = null;
        ivjHeaderFlowLayout = null;
        ivjJLabel2 = null;
    }

    public XMLEntryAssist(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjResults = null;
        ivjEventHandler = new IvjEventHandler();
        document = null;
        ivjCardPanel = null;
        ivjFileName = null;
        ivjJLabel1 = null;
        ivjJScrollPane2 = null;
        ivjResultsPanel = null;
        ivjSourcePanel = null;
        ivjNextButton = null;
        ivjPreviousButton = null;
        ivjCustomFormat = null;
        ivjGroupButtonResultType = null;
        ivjJPanel1 = null;
        ivjSelectCustom = null;
        ivjSelectSetFromXML = null;
        ivjSelectToXML = null;
        ivjScreenData = null;
        ivjBrowse = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjRead = null;
        ivjTextAreaPopupMenu = null;
        menuSelectedTextArea = null;
        ivjMessageArea = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjHeader = null;
        ivjHeaderFlowLayout = null;
        ivjJLabel2 = null;
    }

    public XMLEntryAssist(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjResults = null;
        ivjEventHandler = new IvjEventHandler();
        document = null;
        ivjCardPanel = null;
        ivjFileName = null;
        ivjJLabel1 = null;
        ivjJScrollPane2 = null;
        ivjResultsPanel = null;
        ivjSourcePanel = null;
        ivjNextButton = null;
        ivjPreviousButton = null;
        ivjCustomFormat = null;
        ivjGroupButtonResultType = null;
        ivjJPanel1 = null;
        ivjSelectCustom = null;
        ivjSelectSetFromXML = null;
        ivjSelectToXML = null;
        ivjScreenData = null;
        ivjBrowse = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjRead = null;
        ivjTextAreaPopupMenu = null;
        menuSelectedTextArea = null;
        ivjMessageArea = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjHeader = null;
        ivjHeaderFlowLayout = null;
        ivjJLabel2 = null;
    }

    public XMLEntryAssist(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjResults = null;
        ivjEventHandler = new IvjEventHandler();
        document = null;
        ivjCardPanel = null;
        ivjFileName = null;
        ivjJLabel1 = null;
        ivjJScrollPane2 = null;
        ivjResultsPanel = null;
        ivjSourcePanel = null;
        ivjNextButton = null;
        ivjPreviousButton = null;
        ivjCustomFormat = null;
        ivjGroupButtonResultType = null;
        ivjJPanel1 = null;
        ivjSelectCustom = null;
        ivjSelectSetFromXML = null;
        ivjSelectToXML = null;
        ivjScreenData = null;
        ivjBrowse = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjRead = null;
        ivjTextAreaPopupMenu = null;
        menuSelectedTextArea = null;
        ivjMessageArea = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjHeader = null;
        ivjHeaderFlowLayout = null;
        ivjJLabel2 = null;
    }

    public XMLEntryAssist(Frame frame)
    {
        super(frame);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjResults = null;
        ivjEventHandler = new IvjEventHandler();
        document = null;
        ivjCardPanel = null;
        ivjFileName = null;
        ivjJLabel1 = null;
        ivjJScrollPane2 = null;
        ivjResultsPanel = null;
        ivjSourcePanel = null;
        ivjNextButton = null;
        ivjPreviousButton = null;
        ivjCustomFormat = null;
        ivjGroupButtonResultType = null;
        ivjJPanel1 = null;
        ivjSelectCustom = null;
        ivjSelectSetFromXML = null;
        ivjSelectToXML = null;
        ivjScreenData = null;
        ivjBrowse = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjRead = null;
        ivjTextAreaPopupMenu = null;
        menuSelectedTextArea = null;
        ivjMessageArea = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjHeader = null;
        ivjHeaderFlowLayout = null;
        ivjJLabel2 = null;
        initialize();
    }

    public XMLEntryAssist(Frame frame, String s)
    {
        super(frame, s);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjResults = null;
        ivjEventHandler = new IvjEventHandler();
        document = null;
        ivjCardPanel = null;
        ivjFileName = null;
        ivjJLabel1 = null;
        ivjJScrollPane2 = null;
        ivjResultsPanel = null;
        ivjSourcePanel = null;
        ivjNextButton = null;
        ivjPreviousButton = null;
        ivjCustomFormat = null;
        ivjGroupButtonResultType = null;
        ivjJPanel1 = null;
        ivjSelectCustom = null;
        ivjSelectSetFromXML = null;
        ivjSelectToXML = null;
        ivjScreenData = null;
        ivjBrowse = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjRead = null;
        ivjTextAreaPopupMenu = null;
        menuSelectedTextArea = null;
        ivjMessageArea = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjHeader = null;
        ivjHeaderFlowLayout = null;
        ivjJLabel2 = null;
    }

    public XMLEntryAssist(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjResults = null;
        ivjEventHandler = new IvjEventHandler();
        document = null;
        ivjCardPanel = null;
        ivjFileName = null;
        ivjJLabel1 = null;
        ivjJScrollPane2 = null;
        ivjResultsPanel = null;
        ivjSourcePanel = null;
        ivjNextButton = null;
        ivjPreviousButton = null;
        ivjCustomFormat = null;
        ivjGroupButtonResultType = null;
        ivjJPanel1 = null;
        ivjSelectCustom = null;
        ivjSelectSetFromXML = null;
        ivjSelectToXML = null;
        ivjScreenData = null;
        ivjBrowse = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjRead = null;
        ivjTextAreaPopupMenu = null;
        menuSelectedTextArea = null;
        ivjMessageArea = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjHeader = null;
        ivjHeaderFlowLayout = null;
        ivjJLabel2 = null;
    }

    public XMLEntryAssist(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjFooter = null;
        ivjJButton1 = null;
        ivjJDialogContentPane = null;
        ivjJPanel2 = null;
        ivjJPanel2FlowLayout = null;
        ivjJScrollPane1 = null;
        ivjJSeparator1 = null;
        ivjResults = null;
        ivjEventHandler = new IvjEventHandler();
        document = null;
        ivjCardPanel = null;
        ivjFileName = null;
        ivjJLabel1 = null;
        ivjJScrollPane2 = null;
        ivjResultsPanel = null;
        ivjSourcePanel = null;
        ivjNextButton = null;
        ivjPreviousButton = null;
        ivjCustomFormat = null;
        ivjGroupButtonResultType = null;
        ivjJPanel1 = null;
        ivjSelectCustom = null;
        ivjSelectSetFromXML = null;
        ivjSelectToXML = null;
        ivjScreenData = null;
        ivjBrowse = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjRead = null;
        ivjTextAreaPopupMenu = null;
        menuSelectedTextArea = null;
        ivjMessageArea = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjHeader = null;
        ivjHeaderFlowLayout = null;
        ivjJLabel2 = null;
    }

    public void browseForFile()
    {
        JFileChooser jfilechooser = new JFileChooser();
        jfilechooser.setDialogTitle("File containing XML formatted data");
        ExampleFileFilter examplefilefilter = new ExampleFileFilter("xml", "XML Files");
        jfilechooser.setFileFilter(examplefilefilter);
        jfilechooser.setApproveButtonText("Select");
        jfilechooser.setApproveButtonMnemonic('S');
        int i = jfilechooser.showOpenDialog(this);
        if(i == 0)
            getFileName().setText(jfilechooser.getSelectedFile().getAbsolutePath());
    }

    private boolean buildResults()
    {
        DOMParser domparser = null;
        getResults().setText("");
        try
        {
            domparser = new DOMParser();
            domparser.setErrorHandler(new EntryAssistErrorHandler());
            domparser.setFeature("http://xml.org/sax/features/validation", false);
            domparser.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            String s = getScreenData().getText();
            InputSource inputsource = new InputSource();
            inputsource.setCharacterStream(new StringReader(s));
            domparser.parse(inputsource);
        }
        catch(Exception exception)
        {
            System.out.println("Exception from parse(): " + exception.toString());
            return false;
        }
        setDocument(domparser.getDocument());
        return true;
    }

    private void clearTextArea()
    {
        menuSelectedTextArea.setText("");
    }

    private void closeDialog()
    {
        dispose();
    }

    private void connEtoC1()
    {
        try
        {
            closeDialog();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC10(MouseEvent mouseevent)
    {
        try
        {
            maybePopup(mouseevent, getScreenData());
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
            clearTextArea();
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
            selectAllText();
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
            browseForFile();
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
            readFile();
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
            pasteTextArea();
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
            clearTextArea();
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
            copyTextArea();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC18(ComponentEvent componentevent)
    {
        try
        {
            handleResized(componentevent);
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
            next();
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
            previous();
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
            buildResults();
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
            buildResults();
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
            buildResults();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC7(MouseEvent mouseevent)
    {
        try
        {
            maybePopup(mouseevent, getResults());
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
            maybePopup(mouseevent, getResults());
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
            maybePopup(mouseevent, getScreenData());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM3(ItemEvent itemevent)
    {
        try
        {
            getCustomFormat().setEnabled(getSelectCustom().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void copyTextArea()
    {
        menuSelectedTextArea.copy();
    }

    private JButton getBrowse()
    {
        if(ivjBrowse == null)
            try
            {
                ivjBrowse = new JButton();
                ivjBrowse.setName("Browse");
                ivjBrowse.setMnemonic('B');
                ivjBrowse.setText("Browse");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrowse;
    }

    private JPanel getCardPanel()
    {
        if(ivjCardPanel == null)
            try
            {
                ivjCardPanel = new JPanel();
                ivjCardPanel.setName("CardPanel");
                ivjCardPanel.setLayout(new CardLayout());
                ivjCardPanel.setLayout(new KCardLayout());
                KCardLayout kcardlayout = (KCardLayout)ivjCardPanel.getLayout();
                kcardlayout.setNextButton(getNextButton());
                kcardlayout.setPreviousButton(getPreviousButton());
                ivjCardPanel.add(getSourcePanel(), getSourcePanel().getName());
                ivjCardPanel.add(getResultsPanel(), getResultsPanel().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCardPanel;
    }

    private JTextField getCustomFormat()
    {
        if(ivjCustomFormat == null)
            try
            {
                ivjCustomFormat = new JTextField();
                ivjCustomFormat.setName("CustomFormat");
                ivjCustomFormat.setText("%S");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCustomFormat;
    }

    private Document getDocument()
    {
        return document;
    }

    private JTextField getFileName()
    {
        if(ivjFileName == null)
            try
            {
                ivjFileName = new JTextField();
                ivjFileName.setName("FileName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileName;
    }

    private JPanel getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new JPanel();
                ivjFooter.setName("Footer");
                ivjFooter.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getFooter().add(getJSeparator1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getFooter().add(getJPanel2(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
    }

    private ButtonGroup getGroupButtonResultType()
    {
        if(ivjGroupButtonResultType == null)
            try
            {
                ivjGroupButtonResultType = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjGroupButtonResultType;
    }

    private JPanel getHeader()
    {
        if(ivjHeader == null)
            try
            {
                ivjHeader = new JPanel();
                ivjHeader.setName("Header");
                ivjHeader.setBorder(BorderFactory.createEtchedBorder());
                ivjHeader.setLayout(getHeaderFlowLayout());
                ivjHeader.setBackground(new Color(153, 153, 153));
                getHeader().add(getJLabel2(), getJLabel2().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHeader;
    }

    private FlowLayout getHeaderFlowLayout()
    {
        FlowLayout flowlayout = null;
        try
        {
            flowlayout = new FlowLayout();
            flowlayout.setAlignment(2);
            flowlayout.setVgap(0);
            flowlayout.setHgap(0);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return flowlayout;
    }

    private JButton getJButton1()
    {
        if(ivjJButton1 == null)
            try
            {
                ivjJButton1 = new JButton();
                ivjJButton1.setName("JButton1");
                ivjJButton1.setMnemonic('C');
                ivjJButton1.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton1;
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
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getCardPanel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 2;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 0, 4, 0);
                getJDialogContentPane().add(getHeader(), gridbagconstraints2);
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
                ivjJLabel1.setText("File Name:");
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
                ivjJLabel2.setIcon(new ImageIcon(getClass().getResource("/icons/banners/xml_2_esql.gif")));
                ivjJLabel2.setText("");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
    }

    private JMenuItem getJMenuItem1()
    {
        if(ivjJMenuItem1 == null)
            try
            {
                ivjJMenuItem1 = new JMenuItem();
                ivjJMenuItem1.setName("JMenuItem1");
                ivjJMenuItem1.setText("Clear");
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
                ivjJMenuItem2.setText("Select All");
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
                ivjJMenuItem3.setText("Paste");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem3;
    }

    private JMenuItem getJMenuItem4()
    {
        if(ivjJMenuItem4 == null)
            try
            {
                ivjJMenuItem4 = new JMenuItem();
                ivjJMenuItem4.setName("JMenuItem4");
                ivjJMenuItem4.setText("Copy");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem4;
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
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getJPanel1().add(getSelectSetFromXML(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getJPanel1().add(getSelectToXML(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(0, 4, 0, 4);
                getJPanel1().add(getSelectCustom(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(0, 4, 0, 4);
                getJPanel1().add(getCustomFormat(), gridbagconstraints3);
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
                ivjJPanel2.setLayout(getJPanel2FlowLayout());
                getJPanel2().add(getPreviousButton(), getPreviousButton().getName());
                getJPanel2().add(getNextButton(), getNextButton().getName());
                getJPanel2().add(getJButton1(), getJButton1().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
    }

    private FlowLayout getJPanel2FlowLayout()
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

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                getJScrollPane1().setViewportView(getResults());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
    }

    private JScrollPane getJScrollPane2()
    {
        if(ivjJScrollPane2 == null)
            try
            {
                ivjJScrollPane2 = new JScrollPane();
                ivjJScrollPane2.setName("JScrollPane2");
                getJScrollPane2().setViewportView(getScreenData());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane2;
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

    private JLabel getMessageArea()
    {
        if(ivjMessageArea == null)
            try
            {
                ivjMessageArea = new JLabel();
                ivjMessageArea.setName("MessageArea");
                ivjMessageArea.setText("MessageArea");
                ivjMessageArea.setVisible(true);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMessageArea;
    }

    private JButton getNextButton()
    {
        if(ivjNextButton == null)
            try
            {
                ivjNextButton = new JButton();
                ivjNextButton.setName("NextButton");
                ivjNextButton.setMnemonic('N');
                ivjNextButton.setText("Next");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNextButton;
    }

    private JButton getPreviousButton()
    {
        if(ivjPreviousButton == null)
            try
            {
                ivjPreviousButton = new JButton();
                ivjPreviousButton.setName("PreviousButton");
                ivjPreviousButton.setMnemonic('P');
                ivjPreviousButton.setText("Previous");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPreviousButton;
    }

    private JButton getRead()
    {
        if(ivjRead == null)
            try
            {
                ivjRead = new JButton();
                ivjRead.setName("Read");
                ivjRead.setMnemonic('R');
                ivjRead.setText("Read");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRead;
    }

    private JTextArea getResults()
    {
        if(ivjResults == null)
            try
            {
                ivjResults = new JTextArea();
                ivjResults.setName("Results");
                ivjResults.setRows(15);
                ivjResults.setBounds(0, 0, 160, 120);
                ivjResults.setColumns(40);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjResults;
    }

    private JPanel getResultsPanel()
    {
        if(ivjResultsPanel == null)
            try
            {
                ivjResultsPanel = new JPanel();
                ivjResultsPanel.setName("ResultsPanel");
                ivjResultsPanel.setBorder(BorderFactory.createTitledBorder("Results"));
                ivjResultsPanel.setLayout(new GridBagLayout());
                ivjResultsPanel.setBounds(60, 369, 346, 239);
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 1;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getResultsPanel().add(getJScrollPane1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 2;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getResultsPanel().add(getJPanel1(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjResultsPanel;
    }

    private JTextArea getScreenData()
    {
        if(ivjScreenData == null)
            try
            {
                ivjScreenData = new JTextArea();
                ivjScreenData.setName("ScreenData");
                ivjScreenData.setBounds(0, 0, 160, 120);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjScreenData;
    }

    private JRadioButton getSelectCustom()
    {
        if(ivjSelectCustom == null)
            try
            {
                ivjSelectCustom = new JRadioButton();
                ivjSelectCustom.setName("SelectCustom");
                ivjSelectCustom.setText("Custom");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelectCustom;
    }

    private JRadioButton getSelectSetFromXML()
    {
        if(ivjSelectSetFromXML == null)
            try
            {
                ivjSelectSetFromXML = new JRadioButton();
                ivjSelectSetFromXML.setName("SelectSetFromXML");
                ivjSelectSetFromXML.setToolTipText("SET *** = OutputRoot.%S");
                ivjSelectSetFromXML.setText("Set from XML");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelectSetFromXML;
    }

    private JRadioButton getSelectToXML()
    {
        if(ivjSelectToXML == null)
            try
            {
                ivjSelectToXML = new JRadioButton();
                ivjSelectToXML.setName("SelectToXML");
                ivjSelectToXML.setToolTipText("SET InputRoot.%S = ***");
                ivjSelectToXML.setText("Set to XML");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelectToXML;
    }

    private JPanel getSourcePanel()
    {
        if(ivjSourcePanel == null)
            try
            {
                ivjSourcePanel = new JPanel();
                ivjSourcePanel.setName("SourcePanel");
                ivjSourcePanel.setBorder(BorderFactory.createTitledBorder("XML Source"));
                ivjSourcePanel.setLayout(new GridBagLayout());
                ivjSourcePanel.setBounds(437, 358, 458, 324);
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getSourcePanel().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getSourcePanel().add(getFileName(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.gridwidth = 4;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getSourcePanel().add(getJScrollPane2(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 2;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getSourcePanel().add(getBrowse(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 3;
                gridbagconstraints4.gridy = 0;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getSourcePanel().add(getRead(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 2;
                gridbagconstraints5.gridwidth = 4;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getSourcePanel().add(getMessageArea(), gridbagconstraints5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSourcePanel;
    }

    private JPopupMenu getTextAreaPopupMenu()
    {
        if(ivjTextAreaPopupMenu == null)
            try
            {
                ivjTextAreaPopupMenu = new JPopupMenu();
                ivjTextAreaPopupMenu.setName("TextAreaPopupMenu");
                ivjTextAreaPopupMenu.add(getJMenuItem2());
                ivjTextAreaPopupMenu.add(getJMenuItem1());
                ivjTextAreaPopupMenu.add(getJMenuItem4());
                ivjTextAreaPopupMenu.add(getJMenuItem3());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTextAreaPopupMenu;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void handleResized(ComponentEvent componentevent)
    {
        SwingUtils.constrainResize(componentevent);
    }

    private void initConnections()
        throws Exception
    {
        getJButton1().addActionListener(ivjEventHandler);
        getNextButton().addActionListener(ivjEventHandler);
        getPreviousButton().addActionListener(ivjEventHandler);
        getSelectCustom().addItemListener(ivjEventHandler);
        getSelectSetFromXML().addActionListener(ivjEventHandler);
        getSelectToXML().addActionListener(ivjEventHandler);
        getSelectCustom().addActionListener(ivjEventHandler);
        getResults().addMouseListener(ivjEventHandler);
        getScreenData().addMouseListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        getJMenuItem2().addActionListener(ivjEventHandler);
        getBrowse().addActionListener(ivjEventHandler);
        getRead().addActionListener(ivjEventHandler);
        getJMenuItem3().addActionListener(ivjEventHandler);
        getJMenuItem4().addActionListener(ivjEventHandler);
        addComponentListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("XMLEntryAssist");
            setDefaultCloseOperation(2);
            setSize(426, 289);
            setModal(true);
            setTitle("WMQI XML Entry Assist");
            setContentPane(getJDialogContentPane());
            initConnections();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        getGroupButtonResultType().add(getSelectToXML());
        getGroupButtonResultType().add(getSelectSetFromXML());
        getGroupButtonResultType().add(getSelectCustom());
        getSelectCustom().setSelected(false);
        getSelectSetFromXML().setSelected(true);
        getSelectToXML().setSelected(false);
        getMessageArea().setVisible(false);
    }

    public static void main(String args[])
    {
        try
        {
            XMLEntryAssist xmlentryassist = new XMLEntryAssist();
            xmlentryassist.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            xmlentryassist.pack();
            xmlentryassist.setVisible(true);
            xmlentryassist.dispose();
            xmlentryassist = null;
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    private void maybePopup(MouseEvent mouseevent, JTextArea jtextarea)
    {
        if(!mouseevent.isPopupTrigger())
        {
            return;
        } else
        {
            menuSelectedTextArea = jtextarea;
            getTextAreaPopupMenu().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    private void next()
    {
        KCardLayout kcardlayout = (KCardLayout)getCardPanel().getLayout();
        if(kcardlayout.getCurrentCardName().equals(getSourcePanel().getName()))
        {
            getMessageArea().setVisible(false);
            System.out.println("Here are results");
            if(!buildResults())
                return;
        }
        kcardlayout.next(getCardPanel());
    }

    private void outputOneLine(String s, String s1)
    {
        String s2;
        if(s.startsWith("--"))
            s2 = "%S";
        else
        if(getSelectSetFromXML().isSelected())
            s2 = "SET *** = \"InputRoot\".%S;";
        else
        if(getSelectToXML().isSelected())
            s2 = "SET \"OutputRoot\".%S = '%V';";
        else
            s2 = getCustomFormat().getText();
        StringBuffer stringbuffer = new StringBuffer(s2);
        int i = stringbuffer.length() - 1;
        for(int j = 0; j < i; j++)
        {
            if(stringbuffer.charAt(j) != '%' || stringbuffer.charAt(j + 1) != 'S')
                continue;
            stringbuffer.replace(j, j + 2, s);
            break;
        }

        if(s1 == null)
            s1 = "***";
        i = stringbuffer.length() - 1;
        for(int k = 0; k < i; k++)
        {
            if(stringbuffer.charAt(k) != '%' || stringbuffer.charAt(k + 1) != 'V')
                continue;
            stringbuffer.replace(k, k + 2, s1);
            break;
        }

        getResults().append(stringbuffer.toString() + "\n");
    }

    private void pasteTextArea()
    {
        menuSelectedTextArea.paste();
    }

    private void previous()
    {
        KCardLayout kcardlayout = (KCardLayout)getCardPanel().getLayout();
        kcardlayout.previous(getCardPanel());
    }

    public void readFile()
    {
        File file = new File(getFileName().getText());
        long l = file.length();
        byte abyte0[] = new byte[(int)l];
        try
        {
            FileInputStream fileinputstream = new FileInputStream(file);
            fileinputstream.read(abyte0);
            fileinputstream.close();
            getScreenData().setText(new String(abyte0));
        }
        catch(Exception exception)
        {
            JOptionPane.showMessageDialog(this, exception.getMessage(), "File error", 0);
        }
    }

    private void selectAllText()
    {
        menuSelectedTextArea.selectAll();
    }

    public void setDocument(Document document1)
    {
        document = document1;
        Stack stack = new Stack();
        XMLUtils.logTree(document);
        stack.push(document);
        while(!stack.isEmpty()) 
        {
            Node node = (Node)stack.pop();
            switch(node.getNodeType())
            {
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            default:
                break;

            case 8: // '\b'
                String as[] = XMLUtils.getElementPath(node);
                Comment comment = (Comment)node;
                String s = "XML";
                for(int i = 0; i < as.length; i++)
                    s = s + "." + as[i];

                outputOneLine("-- " + s + ".(XML.Comment) = %V" + comment.getNodeValue(), node.getNodeValue());
                break;

            case 1: // '\001'
                String as1[] = XMLUtils.getElementPath(node);
                String s1 = "\"XML\"";
                for(int j = 0; j < as1.length; j++)
                    if(as1[j].endsWith("]"))
                    {
                        int k = as1[j].indexOf('[');
                        s1 = s1 + ".\"" + as1[j].substring(0, k - 1) + "\"" + as1[j].substring(k);
                    } else
                    {
                        s1 = s1 + ".\"" + as1[j] + "\"";
                    }

                if(!XMLUtils.isTagOnly(node))
                {
                    System.out.println(s1);
                    Node node2 = node.getFirstChild();
                    String s2;
                    for(s2 = null; node2 != null && s2 == null; node2 = node2.getNextSibling())
                        if(node2.getNodeType() == 3)
                            s2 = node2.getNodeValue();

                    outputOneLine(s1, s2);
                }
                NamedNodeMap namednodemap = node.getAttributes();
                int l = namednodemap.getLength();
                for(int i1 = 0; i1 < l; i1++)
                {
                    System.out.println(s1 + ".(XML.attr)" + namednodemap.item(i1).getNodeName());
                    outputOneLine(s1 + ".(XML.attr)" + namednodemap.item(i1).getNodeName(), namednodemap.item(i1).getNodeValue());
                }

                break;

            case 10: // '\n'
                DocumentType documenttype = (DocumentType)node;
                outputOneLine("-- (XML.DocTypeDecl).(XML.SystemId) = '" + documenttype.getSystemId() + "';", "");
                outputOneLine("-- DTDName = '" + documenttype.getName() + "';", "");
                break;

            case 9: // '\t'
                Document document2 = (Document)node;
                outputOneLine("-- (XML.XmlDecl).(XML.Version) = '" + document2.getXmlVersion() + "';", "");
                outputOneLine("-- (XML.XmlDecl).(XML.Encoding) = '" + document2.getXmlEncoding() + "';", "");
                outputOneLine("-- (XML.XmlDecl).(XML.Standalone) = '" + (document2.getXmlStandalone() ? "yes" : "no") + "';", "");
                break;
            }
            for(Node node1 = node.getLastChild(); node1 != null; node1 = node1.getPreviousSibling())
                stack.push(node1);

        }
        System.out.println("Done: " + stack.size() + "IsEmpty:" + stack.isEmpty());
    }

    private JPanel ivjFooter;
    private JButton ivjJButton1;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel2;
    private FlowLayout ivjJPanel2FlowLayout;
    private JScrollPane ivjJScrollPane1;
    private JSeparator ivjJSeparator1;
    private JTextArea ivjResults;
    IvjEventHandler ivjEventHandler;
    public Document document;
    private JPanel ivjCardPanel;
    private JTextField ivjFileName;
    private JLabel ivjJLabel1;
    private JScrollPane ivjJScrollPane2;
    private JPanel ivjResultsPanel;
    private JPanel ivjSourcePanel;
    private JButton ivjNextButton;
    private JButton ivjPreviousButton;
    private JTextField ivjCustomFormat;
    private ButtonGroup ivjGroupButtonResultType;
    private JPanel ivjJPanel1;
    private JRadioButton ivjSelectCustom;
    private JRadioButton ivjSelectSetFromXML;
    private JRadioButton ivjSelectToXML;
    private JTextArea ivjScreenData;
    private JButton ivjBrowse;
    private JMenuItem ivjJMenuItem1;
    private JMenuItem ivjJMenuItem2;
    private JButton ivjRead;
    private JPopupMenu ivjTextAreaPopupMenu;
    private JTextArea menuSelectedTextArea;
    private JLabel ivjMessageArea;
    private JMenuItem ivjJMenuItem3;
    private JMenuItem ivjJMenuItem4;
    private JPanel ivjHeader;
    private FlowLayout ivjHeaderFlowLayout;
    private JLabel ivjJLabel2;

	}
