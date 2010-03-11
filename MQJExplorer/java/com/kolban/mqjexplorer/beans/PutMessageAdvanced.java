// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PutMessageAdvanced.java

package com.kolban.mqjexplorer.beans;

import com.ibm.mq.MQC;
import com.ibm.mq.MQException;
import com.ibm.mq.MQMD;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;
import com.kolban.mq.MQRFH2;
import com.kolban.mqjexplorer.MQJExplorer;
import com.kolban.mqjexplorer.QueueManagerModel;
import com.kolban.swing.NumericTextField;
import com.kolban.swing.SwingUtils;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

// Referenced classes of package com.kolban.mqjexplorer.beans:
//            Encoding

public class PutMessageAdvanced extends JFrame
    implements ActionListener
{
    class PutterThread
        implements Runnable
    {

        public void run()
        {
            System.out.println("In thread!");
            if(message == null)
            {
                System.out.println("Message not set for putting!!");
                return;
            }
            byte abyte0[] = ((MQMD) (message)).messageId;
            byte abyte1[] = ((MQMD) (message)).correlationId;
            long l = System.currentTimeMillis();
            try
            {
                for(actualPut = 0; !stopFlag && actualPut < count; actualPut++)
                {
                    message.messageId = abyte0;
                    message.correlationId = abyte1;
                    queue.put(message, pmo);
                    if(delay > 0)
                        Thread.sleep(delay);
                }

            }
            catch(MQException mqexception)
            {
                lastException = mqexception;
            }
            catch(Exception _ex) { }
            long l1 = System.currentTimeMillis();
            deltaTime = l1 - l;
            try
            {
                queue.close();
            }
            catch(MQException _ex) { }
            queue = null;
            SwingUtilities.invokeLater(new Runnable() {

                public void run()
                {
                    endPut();
                }

            }
);
        }

        public MQQueue queue;
        public MQMessage message;
        public MQPutMessageOptions pmo;
        public int count;
        public boolean stopFlag;
        public MQException lastException;
        public int delay;
        public int actualPut;
        public long deltaTime;

        PutterThread()
        {
            queue = null;
            message = null;
            pmo = null;
            count = 0;
            stopFlag = false;
            lastException = null;
            delay = 0;
            actualPut = 0;
            deltaTime = 0L;
        }
    }

    class IvjEventHandler
        implements ActionListener, ComponentListener, ItemListener, MouseListener, WindowListener, PropertyChangeListener, DocumentListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getBrowse())
                connEtoC1();
            if(actionevent.getSource() == getClose())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getPut())
                connEtoC3(actionevent);
            if(actionevent.getSource() == getCancelPut())
                connEtoC10();
            if(actionevent.getSource() == getJMenuItem1())
                connEtoM16(actionevent);
            if(actionevent.getSource() == getJMenuItem3())
                connEtoM18(actionevent);
            if(actionevent.getSource() == getJMenuItem6())
                connEtoM17(actionevent);
            if(actionevent.getSource() == getJMenuItem5())
                connEtoM19(actionevent);
            if(actionevent.getSource() == getJMenuItem4())
                connEtoM20(actionevent);
            if(actionevent.getSource() == getJMenuItem2())
                connEtoM21(actionevent);
            if(actionevent.getSource() == getJMenuItem7())
                connEtoM22(actionevent);
            if(actionevent.getSource() == getSelectSize())
                connEtoC7(actionevent);
            if(actionevent.getSource() == getSelectScreen())
                connEtoC8(actionevent);
            if(actionevent.getSource() == getSelectFile())
                connEtoC9(actionevent);
            if(actionevent.getSource() == getJMenuItem8())
                connEtoM7(actionevent);
            if(actionevent.getSource() == getJMenuItem9())
                connEtoM13(actionevent);
            if(actionevent.getSource() == getJMenuItem10())
                connEtoM14(actionevent);
        }

        public void changedUpdate(DocumentEvent documentevent)
        {
            if(documentevent.getDocument() == getdocument1())
                connEtoC4(documentevent);
            if(documentevent.getDocument() == getdocument2())
                connEtoC5(documentevent);
            if(documentevent.getDocument() == getdocument3())
                connEtoC6(documentevent);
        }

        public void componentHidden(ComponentEvent componentevent)
        {
        }

        public void componentMoved(ComponentEvent componentevent)
        {
        }

        public void componentResized(ComponentEvent componentevent)
        {
            if(componentevent.getSource() == PutMessageAdvanced.this)
                connEtoC13(componentevent);
        }

        public void componentShown(ComponentEvent componentevent)
        {
        }

        public void insertUpdate(DocumentEvent documentevent)
        {
            if(documentevent.getDocument() == getdocument1())
                connEtoC4(documentevent);
            if(documentevent.getDocument() == getdocument2())
                connEtoC5(documentevent);
            if(documentevent.getDocument() == getdocument3())
                connEtoC6(documentevent);
        }

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getSelectScreen())
                screenToTextAreaEnabled(itemevent);
            if(itemevent.getSource() == getSelectFile())
                connEtoM2(itemevent);
            if(itemevent.getSource() == getSelectFile())
                connEtoM3(itemevent);
            if(itemevent.getSource() == getSelectFile())
                connEtoM4(itemevent);
            if(itemevent.getSource() == getSelectScreen())
                connEtoM5(itemevent);
            if(itemevent.getSource() == getSelectSize())
                connEtoM6(itemevent);
            if(itemevent.getSource() == getSelectSize())
                connEtoM1(itemevent);
            if(itemevent.getSource() == getFMT_ENTRY())
                connEtoM8(itemevent);
            if(itemevent.getSource() == getExpiryTime())
                connEtoM9(itemevent);
            if(itemevent.getSource() == getMsgID_Entry())
                connEtoM10(itemevent);
            if(itemevent.getSource() == getCorrelID_Entry())
                connEtoM11(itemevent);
            if(itemevent.getSource() == getSelectScreen())
                connEtoM12(itemevent);
            if(itemevent.getSource() == getFMT_RFH2())
                connEtoM15(itemevent);
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
            if(mouseevent.getSource() == getNameValueData())
                connEtoC11(mouseevent);
            if(mouseevent.getSource() == getScreenTextArea())
                connEtoC15(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getNameValueData())
                connEtoC12(mouseevent);
            if(mouseevent.getSource() == getScreenTextArea())
                connEtoC16(mouseevent);
        }

        public void propertyChange(PropertyChangeEvent propertychangeevent)
        {
            if(propertychangeevent.getSource() == getFileName() && propertychangeevent.getPropertyName().equals("document"))
                connPtoP1SetTarget();
            if(propertychangeevent.getSource() == getCount() && propertychangeevent.getPropertyName().equals("document"))
                connPtoP2SetTarget();
            if(propertychangeevent.getSource() == getSizeField() && propertychangeevent.getPropertyName().equals("document"))
                connPtoP3SetTarget();
        }

        public void removeUpdate(DocumentEvent documentevent)
        {
            if(documentevent.getDocument() == getdocument1())
                connEtoC4(documentevent);
            if(documentevent.getDocument() == getdocument2())
                connEtoC5(documentevent);
            if(documentevent.getDocument() == getdocument3())
                connEtoC6(documentevent);
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
            if(windowevent.getSource() == PutMessageAdvanced.this)
                connEtoC14(windowevent);
        }

        public void windowDeactivated(WindowEvent windowevent)
        {
        }

        public void windowDeiconified(WindowEvent windowevent)
        {
        }

        public void windowIconified(WindowEvent windowevent)
        {
        }

        public void windowOpened(WindowEvent windowevent)
        {
        }

        IvjEventHandler()
        {
        }
    }


    public PutMessageAdvanced()
    {
        mqrfh2 = new MQRFH2();
        putterThread = null;
        ivjBrowse = null;
        ivjFileName = null;
        ivjJDialogContentPane = null;
        ivjEventHandler = new IvjEventHandler();
        ivjSelectFile = null;
        ivjSelectScreen = null;
        ivjClose = null;
        ivjFooterPanel = null;
        ivjPut = null;
        ivjGroup1 = null;
        ivjFileNameLabel = null;
        ivjScreenTextArea = null;
        ivjSourceSelectionPane = null;
        ivjJScrollPane2 = null;
        ivjScreenPane = null;
        ivjFilePane = null;
        ivjJLabel1 = null;
        ivjCount = null;
        ivjCountLabel = null;
        ivjCountPanel = null;
        ivjTextMessage = null;
        ivjSelectSize = null;
        ivjSizeField = null;
        ivjSizeLabel = null;
        ivjSizePane = null;
        ivjSizePaneFlowLayout = null;
        ivjSep1 = null;
        ivjGroup2 = null;
        ivjConnPtoP1Aligning = false;
        ivjdocument1 = null;
        ivjConnPtoP2Aligning = false;
        ivjConnPtoP3Aligning = false;
        ivjdocument2 = null;
        ivjdocument3 = null;
        ivjJLabel3 = null;
        profile = null;
        ivjJTabbedPane1 = null;
        ivjPageHeader = null;
        ivjPageHeaderFlowLayout = null;
        ivjMQMT_DATAGRAM = null;
        ivjMQMT_REPLY = null;
        ivjMQMT_REQUEST = null;
        ivjMsgType = null;
        ivjMQPER_NOT_PERSISTENT = null;
        ivjMQPER_PERSISTENCE_AS_Q_DEF = null;
        ivjMQPER_PERSISTENT = null;
        ivjPersistence = null;
        ivjMsgTypeButtonGroup = null;
        ivjPersitenceButtonGroup = null;
        ivjFMT_ENTRY = null;
        ivjFMT_NONE = null;
        ivjFMT_STRING = null;
        ivjFmtText = null;
        ivjFormat = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjMQMDMisc = null;
        ivjReplyToQ = null;
        ivjReplyToQMgr = null;
        ivjFormatButtonGroup = null;
        ivjExpiry = null;
        ivjExpiryInterval = null;
        ivjExpiryTime = null;
        ivjExpiryUnlimited = null;
        ivjDataTabPanel = null;
        ivjMQMDTabPanel = null;
        ivjExpiryButtonGroup = null;
        ivjFiller1 = null;
        ivjMsgID_Entry = null;
        ivjMsgID_NONE = null;
        ivjMsgID_Text = null;
        ivjMsgIDPanel = null;
        ivjCorrelID_Entry = null;
        ivjCorrelID_NONE = null;
        ivjCorrelID_Text = null;
        ivjCorrelIDPanel = null;
        ivjCorrelIDButtonGroup = null;
        ivjMsgIDButtonGroup = null;
        ivjCancelPut = null;
        running = false;
        ivjCCSID = null;
        ivjEncoding = null;
        ivjFlags = null;
        ivjFMT_RFH2 = null;
        ivjJLabel2 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJScrollPane1 = null;
        ivjNameValueCCSID = null;
        ivjNameValueData = null;
        ivjRFH2Format = null;
        ivjRFH2TabPanel = null;
        ivjNameValueDataPanel = null;
        ivjDataAssistPopup = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem3 = null;
        ivjJMenu1 = null;
        ivjJMenuItem2 = null;
        ivjJMenuItem4 = null;
        ivjJMenuItem5 = null;
        ivjJMenuItem6 = null;
        ivjJMenuItem7 = null;
        ivjProgress = null;
        progressTimer = null;
        ivjDataPopup = null;
        ivjJMenuItem10 = null;
        ivjJMenuItem8 = null;
        ivjJMenuItem9 = null;
        ivjDelay = null;
        ivjJLabel10 = null;
        ivjJPanel1 = null;
        initialize();
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        if(!getProgress().isVisible())
            return;
        if(putterThread != null)
            getProgress().setValue(putterThread.actualPut);
    }

    public void browse_ActionEvents()
    {
        JFileChooser jfilechooser = new JFileChooser(getFileName().getText());
        jfilechooser.setDialogTitle("Message source file selection");
        jfilechooser.setApproveButtonToolTipText("Select the file whose contents will be the message");
        if(jfilechooser.showDialog(MQJExplorer.mainFrame, "Select File") == 0)
        {
            File file = jfilechooser.getSelectedFile();
            getFileName().setText(file.getAbsolutePath());
        }
    }

    public void cancelPut_ActionEvents()
    {
        putterThread.stopFlag = true;
    }

    public void close()
    {
        profile.lastFileName = getFileName().getText();
        profile.lastRFH2Data = getNameValueData().getText();
        profile.windowSize = getSize();
        if(getSelectFile().isSelected())
            profile.selected = 1;
        else
        if(getSelectScreen().isSelected())
            profile.selected = 2;
        else
            profile.selected = 3;
        dispose();
        try
        {
            qMgr.disconnect();
        }
        catch(MQException _ex) { }
    }

    private void connEtoC1()
    {
        try
        {
            browse_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC10()
    {
        try
        {
            cancelPut_ActionEvents();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC11(MouseEvent mouseevent)
    {
        try
        {
            nameValueData_Mouse(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC12(MouseEvent mouseevent)
    {
        try
        {
            nameValueData_Mouse(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC13(ComponentEvent componentevent)
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

    private void connEtoC14(WindowEvent windowevent)
    {
        try
        {
            close();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC15(MouseEvent mouseevent)
    {
        try
        {
            maybeDataPopup(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC16(MouseEvent mouseevent)
    {
        try
        {
            maybeDataPopup(mouseevent);
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
            close();
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
            put();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(DocumentEvent documentevent)
    {
        try
        {
            enableButtons();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5(DocumentEvent documentevent)
    {
        try
        {
            enableButtons();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(DocumentEvent documentevent)
    {
        try
        {
            enableButtons();
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
            enableButtons();
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
            enableButtons();
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
            enableButtons();
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
            getSizeField().setEnabled(getSelectSize().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM10(ItemEvent itemevent)
    {
        try
        {
            getMsgID_Text().setEnabled(getMsgID_Entry().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM11(ItemEvent itemevent)
    {
        try
        {
            getCorrelID_Text().setEnabled(getCorrelID_Entry().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM12(ItemEvent itemevent)
    {
        try
        {
            getFMT_STRING().setSelected(getSelectScreen().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM13(ActionEvent actionevent)
    {
        try
        {
            getScreenTextArea().copy();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM14(ActionEvent actionevent)
    {
        try
        {
            getScreenTextArea().paste();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM15(ItemEvent itemevent)
    {
        try
        {
            getJTabbedPane1().setEnabledAt(2, getFMT_RFH2().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM16(ActionEvent actionevent)
    {
        try
        {
            getNameValueData().append("<mcd>\n<Msd></Msd>\n<Set></Set>\n<Type></Type>\n<Fmt></Fmt>\n</mcd>");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM17(ActionEvent actionevent)
    {
        try
        {
            getNameValueData().append("<psr>\n   <Command>Publish</Command>\n   <Topic></Topic>\n   <SubPoint></SubPoint>\n   <PubOpt></PubOpt>\n   <PubTime></PubTime>\n   <SeqNum></SeqNum>\n   <QMgrName></QMgrName>\n   <QName></QName>\n</psr>");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM18(ActionEvent actionevent)
    {
        try
        {
            getNameValueData().append("<usr></usr>");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM19(ActionEvent actionevent)
    {
        try
        {
            getNameValueData().append("<psr>\n   <Command>RegSub</Command>\n   <Topic></Topic>\n   <SubPoint></SubPoint>\n   <Filter></Filter>\n   <RegOpt></RegOpt>\n   <QMgrName></QMgrName>\n   <QName></QName>\n</psr>");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM2(ItemEvent itemevent)
    {
        try
        {
            getFileName().setEnabled(getSelectFile().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM20(ActionEvent actionevent)
    {
        try
        {
            getNameValueData().append("<psr>\n   <Command>DeregSub</Command>\n   <Topic></Topic>\n   <SubPoint></SubPoint>\n   <Filter></Filter>\n   <RegOpt></RegOpt>\n   <QMgrName></QMgrName>\n   <QName></QName>\n</psr>");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM21(ActionEvent actionevent)
    {
        try
        {
            getNameValueData().append("<psr>\n   <Command>DeletePub</Command>\n   <Topic></Topic>\n   <DelOpt></DelOpt>\n</psr>");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM22(ActionEvent actionevent)
    {
        try
        {
            getNameValueData().append("<psr>\n   <Command>ReqUpdate</Command>\n   <Topic></Topic>\n   <SubPoint></SubPoint>\n   <Filter></Filter>\n   <RegOpt></RegOpt>\n   <QMgrName></QMgrName>\n   <QName></QName>\n</psr>");
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
            getBrowse().setEnabled(getSelectFile().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM4(ItemEvent itemevent)
    {
        try
        {
            getFilePane().setBorder(highlightBorder(getSelectFile().isSelected(), "File Source"));
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private Border connEtoM4_Value()
    {
        return null;
    }

    private void connEtoM5(ItemEvent itemevent)
    {
        try
        {
            getScreenPane().setBorder(highlightBorder(getSelectScreen().isSelected(), "Screen Source"));
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM6(ItemEvent itemevent)
    {
        try
        {
            getSizePane().setBorder(highlightBorder(getSelectSize().isSelected(), "Size Source"));
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM7(ActionEvent actionevent)
    {
        try
        {
            getScreenTextArea().selectAll();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM8(ItemEvent itemevent)
    {
        try
        {
            getFmtText().setEnabled(getFMT_ENTRY().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM9(ItemEvent itemevent)
    {
        try
        {
            getExpiryInterval().setEnabled(getExpiryTime().isSelected());
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
                if(getdocument1() != null)
                    getFileName().setDocument(getdocument1());
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
                setdocument1(getFileName().getDocument());
                ivjConnPtoP1Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP1Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP2SetSource()
    {
        try
        {
            if(!ivjConnPtoP2Aligning)
            {
                ivjConnPtoP2Aligning = true;
                if(getdocument2() != null)
                    getCount().setDocument(getdocument2());
                ivjConnPtoP2Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP2Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP2SetTarget()
    {
        try
        {
            if(!ivjConnPtoP2Aligning)
            {
                ivjConnPtoP2Aligning = true;
                setdocument2(getCount().getDocument());
                ivjConnPtoP2Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP2Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP3SetSource()
    {
        try
        {
            if(!ivjConnPtoP3Aligning)
            {
                ivjConnPtoP3Aligning = true;
                if(getdocument3() != null)
                    getSizeField().setDocument(getdocument3());
                ivjConnPtoP3Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP3Aligning = false;
            handleException(throwable);
        }
    }

    private void connPtoP3SetTarget()
    {
        try
        {
            if(!ivjConnPtoP3Aligning)
            {
                ivjConnPtoP3Aligning = true;
                setdocument3(getSizeField().getDocument());
                ivjConnPtoP3Aligning = false;
            }
        }
        catch(Throwable throwable)
        {
            ivjConnPtoP3Aligning = false;
            handleException(throwable);
        }
    }

    private void enableButtons()
    {
        boolean flag = false;
        if(getSelectSize().isSelected() && getSizeField().getText().length() > 0)
            flag = true;
        else
        if(getSelectFile().isSelected())
        {
            if(getFileName().getText().length() > 0)
                flag = true;
        } else
        if(getSelectScreen().isSelected())
            flag = true;
        if(getCount().getText().length() == 0)
            flag = false;
        if(running)
            flag = false;
        getPut().setEnabled(flag);
        if(running)
        {
            getClose().setEnabled(false);
            getCancelPut().setEnabled(true);
        } else
        {
            getClose().setEnabled(true);
            getCancelPut().setEnabled(false);
        }
    }

    private void endPut()
    {
        running = false;
        if(putterThread != null)
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("H:mm:ss.S");
            String s = simpledateformat.format(new Date()) + "   ";
            if(putterThread.actualPut == 1)
                getTextMessage().setText(s + putterThread.actualPut + " message put to queue in " + putterThread.deltaTime + " msecs");
            else
                getTextMessage().setText(s + putterThread.actualPut + " messages put to queue in " + putterThread.deltaTime + " msecs");
            if(putterThread.lastException != null)
                QueueManagerModel.displayError(putterThread.lastException);
        }
        putterThread = null;
        progressTimer.stop();
        enableButtons();
        if(getProgress().isVisible())
        {
            getProgress().setVisible(false);
            getTextMessage().setVisible(true);
        }
    }

    private JButton getBrowse()
    {
        if(ivjBrowse == null)
            try
            {
                ivjBrowse = new JButton();
                ivjBrowse.setName("Browse");
                ivjBrowse.setMnemonic('B');
                ivjBrowse.setText("Browse ...");
                ivjBrowse.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjBrowse;
    }

    private JButton getCancelPut()
    {
        if(ivjCancelPut == null)
            try
            {
                ivjCancelPut = new JButton();
                ivjCancelPut.setName("CancelPut");
                ivjCancelPut.setText("Stop");
                ivjCancelPut.setEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCancelPut;
    }

    private NumericTextField getCCSID()
    {
        if(ivjCCSID == null)
            try
            {
                ivjCCSID = new NumericTextField();
                ivjCCSID.setName("CCSID");
                ivjCCSID.setMinimumSize(new Dimension(110, 20));
                ivjCCSID.setColumns(10);
                ivjCCSID.setIntValue(mqrfh2.codedCharSetId);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCCSID;
    }

    private JButton getClose()
    {
        if(ivjClose == null)
            try
            {
                ivjClose = new JButton();
                ivjClose.setName("Close");
                ivjClose.setMnemonic('C');
                ivjClose.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjClose;
    }

    private JRadioButton getCorrelID_Entry()
    {
        if(ivjCorrelID_Entry == null)
            try
            {
                ivjCorrelID_Entry = new JRadioButton();
                ivjCorrelID_Entry.setName("CorrelID_Entry");
                ivjCorrelID_Entry.setText("CorrelID:");
                getCorrelIDButtonGroup().add(ivjCorrelID_Entry);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCorrelID_Entry;
    }

    private JRadioButton getCorrelID_NONE()
    {
        if(ivjCorrelID_NONE == null)
            try
            {
                ivjCorrelID_NONE = new JRadioButton();
                ivjCorrelID_NONE.setName("CorrelID_NONE");
                ivjCorrelID_NONE.setSelected(true);
                ivjCorrelID_NONE.setText("None");
                getCorrelIDButtonGroup().add(ivjCorrelID_NONE);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCorrelID_NONE;
    }

    private JTextField getCorrelID_Text()
    {
        if(ivjCorrelID_Text == null)
            try
            {
                ivjCorrelID_Text = new JTextField();
                ivjCorrelID_Text.setName("CorrelID_Text");
                ivjCorrelID_Text.setPreferredSize(new Dimension(100, 20));
                ivjCorrelID_Text.setMinimumSize(new Dimension(100, 20));
                ivjCorrelID_Text.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCorrelID_Text;
    }

    private ButtonGroup getCorrelIDButtonGroup()
    {
        if(ivjCorrelIDButtonGroup == null)
            try
            {
                ivjCorrelIDButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCorrelIDButtonGroup;
    }

    private JPanel getCorrelIDPanel()
    {
        if(ivjCorrelIDPanel == null)
            try
            {
                ivjCorrelIDPanel = new JPanel();
                ivjCorrelIDPanel.setName("CorrelIDPanel");
                ivjCorrelIDPanel.setBorder(BorderFactory.createTitledBorder("CorrelID"));
                ivjCorrelIDPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getCorrelIDPanel().add(getCorrelID_Entry(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getCorrelIDPanel().add(getCorrelID_NONE(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(0, 4, 0, 4);
                getCorrelIDPanel().add(getCorrelID_Text(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCorrelIDPanel;
    }

    private com.kolban.mqjexplorer.mqattributes.NumericTextField getCount()
    {
        if(ivjCount == null)
            try
            {
                ivjCount = new com.kolban.mqjexplorer.mqattributes.NumericTextField();
                ivjCount.setName("Count");
                ivjCount.setToolTipText("Number of messages to put");
                ivjCount.setText("1");
                ivjCount.setColumns(5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCount;
    }

    private JLabel getCountLabel()
    {
        if(ivjCountLabel == null)
            try
            {
                ivjCountLabel = new JLabel();
                ivjCountLabel.setName("CountLabel");
                ivjCountLabel.setText("Count:");
                ivjCountLabel.setHorizontalAlignment(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCountLabel;
    }

    private JPanel getCountPanel()
    {
        if(ivjCountPanel == null)
            try
            {
                ivjCountPanel = new JPanel();
                ivjCountPanel.setName("CountPanel");
                ivjCountPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getCountPanel().add(getCountLabel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.anchor = 11;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getCountPanel().add(getCount(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getCountPanel().add(getJLabel10(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getCountPanel().add(getDelay(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 2;
                gridbagconstraints4.gridwidth = 2;
                gridbagconstraints4.fill = 1;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.weighty = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getCountPanel().add(getJPanel1(), gridbagconstraints4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCountPanel;
    }

    private JPopupMenu getDataAssistPopup()
    {
        if(ivjDataAssistPopup == null)
            try
            {
                ivjDataAssistPopup = new JPopupMenu();
                ivjDataAssistPopup.setName("DataAssistPopup");
                ivjDataAssistPopup.add(getJMenuItem1());
                ivjDataAssistPopup.add(getJMenu1());
                ivjDataAssistPopup.add(getJMenuItem3());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDataAssistPopup;
    }

    private JPopupMenu getDataPopup()
    {
        if(ivjDataPopup == null)
            try
            {
                ivjDataPopup = new JPopupMenu();
                ivjDataPopup.setName("DataPopup");
                ivjDataPopup.add(getJMenuItem8());
                ivjDataPopup.add(getJMenuItem9());
                ivjDataPopup.add(getJMenuItem10());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDataPopup;
    }

    private JPanel getDataTabPanel()
    {
        if(ivjDataTabPanel == null)
            try
            {
                ivjDataTabPanel = new JPanel();
                ivjDataTabPanel.setName("DataTabPanel");
                ivjDataTabPanel.setPreferredSize(new Dimension(800, 260));
                ivjDataTabPanel.setLayout(new GridBagLayout());
                ivjDataTabPanel.setMinimumSize(new Dimension(800, 139));
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.gridheight = 3;
                gridbagconstraints.fill = 1;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getDataTabPanel().add(getSourceSelectionPane(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getDataTabPanel().add(getFilePane(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getDataTabPanel().add(getScreenPane(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getDataTabPanel().add(getSizePane(), gridbagconstraints3);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDataTabPanel;
    }

    private NumericTextField getDelay()
    {
        if(ivjDelay == null)
            try
            {
                ivjDelay = new NumericTextField();
                ivjDelay.setName("Delay");
                ivjDelay.setToolTipText("Delay in milliseconds between puts");
                ivjDelay.setText("0");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDelay;
    }

    private Document getdocument1()
    {
        return ivjdocument1;
    }

    private Document getdocument2()
    {
        return ivjdocument2;
    }

    private Document getdocument3()
    {
        return ivjdocument3;
    }

    private Encoding getEncoding()
    {
        if(ivjEncoding == null)
            try
            {
                ivjEncoding = new Encoding();
                ivjEncoding.setName("Encoding");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjEncoding;
    }

    private JPanel getExpiry()
    {
        if(ivjExpiry == null)
            try
            {
                ivjExpiry = new JPanel();
                ivjExpiry.setName("Expiry");
                ivjExpiry.setBorder(BorderFactory.createTitledBorder("Expiry"));
                ivjExpiry.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getExpiry().add(getExpiryUnlimited(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getExpiry().add(getExpiryTime(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(0, 4, 0, 4);
                getExpiry().add(getExpiryInterval(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExpiry;
    }

    private ButtonGroup getExpiryButtonGroup()
    {
        if(ivjExpiryButtonGroup == null)
            try
            {
                ivjExpiryButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExpiryButtonGroup;
    }

    private com.kolban.mqjexplorer.mqattributes.NumericTextField getExpiryInterval()
    {
        if(ivjExpiryInterval == null)
            try
            {
                ivjExpiryInterval = new com.kolban.mqjexplorer.mqattributes.NumericTextField();
                ivjExpiryInterval.setName("ExpiryInterval");
                ivjExpiryInterval.setPreferredSize(new Dimension(100, 20));
                ivjExpiryInterval.setEnabled(false);
                ivjExpiryInterval.setMinimumSize(new Dimension(80, 20));
                ivjExpiryInterval.setColumns(5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExpiryInterval;
    }

    private JRadioButton getExpiryTime()
    {
        if(ivjExpiryTime == null)
            try
            {
                ivjExpiryTime = new JRadioButton();
                ivjExpiryTime.setName("ExpiryTime");
                ivjExpiryTime.setText("Time (1/10 secs):");
                getExpiryButtonGroup().add(ivjExpiryTime);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExpiryTime;
    }

    private JRadioButton getExpiryUnlimited()
    {
        if(ivjExpiryUnlimited == null)
            try
            {
                ivjExpiryUnlimited = new JRadioButton();
                ivjExpiryUnlimited.setName("ExpiryUnlimited");
                ivjExpiryUnlimited.setSelected(true);
                ivjExpiryUnlimited.setText("Unlimited");
                getExpiryButtonGroup().add(ivjExpiryUnlimited);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjExpiryUnlimited;
    }

    private JTextField getFileName()
    {
        if(ivjFileName == null)
            try
            {
                ivjFileName = new JTextField();
                ivjFileName.setName("FileName");
                ivjFileName.setEnabled(false);
                ivjFileName.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileName;
    }

    private JLabel getFileNameLabel()
    {
        if(ivjFileNameLabel == null)
            try
            {
                ivjFileNameLabel = new JLabel();
                ivjFileNameLabel.setName("FileNameLabel");
                ivjFileNameLabel.setText("File Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileNameLabel;
    }

    private JPanel getFilePane()
    {
        if(ivjFilePane == null)
            try
            {
                ivjFilePane = new JPanel();
                ivjFilePane.setName("FilePane");
                ivjFilePane.setBorder(BorderFactory.createTitledBorder("File Source"));
                ivjFilePane.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = -1;
                gridbagconstraints.gridy = -1;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getFilePane().add(getFileNameLabel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = -1;
                gridbagconstraints1.gridy = -1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getFilePane().add(getFileName(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = -1;
                gridbagconstraints2.gridy = -1;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getFilePane().add(getBrowse(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFilePane;
    }

    private JPanel getFiller1()
    {
        if(ivjFiller1 == null)
            try
            {
                ivjFiller1 = new JPanel();
                ivjFiller1.setName("Filler1");
                ivjFiller1.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFiller1;
    }

    private NumericTextField getFlags()
    {
        if(ivjFlags == null)
            try
            {
                ivjFlags = new NumericTextField();
                ivjFlags.setName("Flags");
                ivjFlags.setMinimumSize(new Dimension(110, 20));
                ivjFlags.setColumns(10);
                ivjFlags.setIntValue(mqrfh2.flags);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFlags;
    }

    private JRadioButton getFMT_ENTRY()
    {
        if(ivjFMT_ENTRY == null)
            try
            {
                ivjFMT_ENTRY = new JRadioButton();
                ivjFMT_ENTRY.setName("FMT_ENTRY");
                ivjFMT_ENTRY.setText("Format");
                getFormatButtonGroup().add(ivjFMT_ENTRY);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFMT_ENTRY;
    }

    private JRadioButton getFMT_NONE()
    {
        if(ivjFMT_NONE == null)
            try
            {
                ivjFMT_NONE = new JRadioButton();
                ivjFMT_NONE.setName("FMT_NONE");
                ivjFMT_NONE.setSelected(false);
                ivjFMT_NONE.setText("None");
                getFormatButtonGroup().add(ivjFMT_NONE);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFMT_NONE;
    }

    private JRadioButton getFMT_RFH2()
    {
        if(ivjFMT_RFH2 == null)
            try
            {
                ivjFMT_RFH2 = new JRadioButton();
                ivjFMT_RFH2.setName("FMT_RFH2");
                ivjFMT_RFH2.setText("RFH2");
                getFormatButtonGroup().add(ivjFMT_RFH2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFMT_RFH2;
    }

    private JRadioButton getFMT_STRING()
    {
        if(ivjFMT_STRING == null)
            try
            {
                ivjFMT_STRING = new JRadioButton();
                ivjFMT_STRING.setName("FMT_STRING");
                ivjFMT_STRING.setSelected(true);
                ivjFMT_STRING.setText("String");
                getFormatButtonGroup().add(ivjFMT_STRING);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFMT_STRING;
    }

    private JTextField getFmtText()
    {
        if(ivjFmtText == null)
            try
            {
                ivjFmtText = new JTextField();
                ivjFmtText.setName("FmtText");
                ivjFmtText.setEnabled(false);
                ivjFmtText.setColumns(8);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFmtText;
    }

    private JPanel getFooterPanel()
    {
        if(ivjFooterPanel == null)
            try
            {
                ivjFooterPanel = new JPanel();
                ivjFooterPanel.setName("FooterPanel");
                ivjFooterPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(10, 10, 10, 10);
                getFooterPanel().add(getTextMessage(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.anchor = 13;
                gridbagconstraints1.insets = new Insets(5, 3, 5, 2);
                getFooterPanel().add(getPut(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 3;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.anchor = 13;
                gridbagconstraints2.insets = new Insets(5, 3, 5, 5);
                getFooterPanel().add(getClose(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 2;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getFooterPanel().add(getCancelPut(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 0;
                gridbagconstraints4.fill = 2;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getFooterPanel().add(getProgress(), gridbagconstraints4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooterPanel;
    }

    private JPanel getFormat()
    {
        if(ivjFormat == null)
            try
            {
                ivjFormat = new JPanel();
                ivjFormat.setName("Format");
                ivjFormat.setBorder(BorderFactory.createTitledBorder("Format"));
                ivjFormat.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getFormat().add(getFMT_ENTRY(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getFormat().add(getFMT_STRING(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 3;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(0, 4, 0, 4);
                getFormat().add(getFMT_NONE(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(0, 4, 0, 4);
                getFormat().add(getFmtText(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 2;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(0, 4, 0, 4);
                getFormat().add(getFMT_RFH2(), gridbagconstraints4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFormat;
    }

    private ButtonGroup getFormatButtonGroup()
    {
        if(ivjFormatButtonGroup == null)
            try
            {
                ivjFormatButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFormatButtonGroup;
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

    private ButtonGroup getGroup2()
    {
        if(ivjGroup2 == null)
            try
            {
                ivjGroup2 = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjGroup2;
    }

    private JPanel getJDialogContentPane()
    {
        if(ivjJDialogContentPane == null)
            try
            {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setLayout(new GridBagLayout());
                ivjJDialogContentPane.setAlignmentY(1.0F);
                ivjJDialogContentPane.setMinimumSize(new Dimension(608, 389));
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 3;
                gridbagconstraints.gridwidth = 4;
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 13;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(0, 4, 4, 4);
                getJDialogContentPane().add(getFooterPanel(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 2;
                gridbagconstraints1.gridwidth = 4;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getJDialogContentPane().add(getSep1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.gridwidth = 2;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getPageHeader(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.fill = 1;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJTabbedPane1(), gridbagconstraints3);
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
                ivjJLabel1.setText("<html>Enter source for message data:</html>");
                ivjJLabel1.setMinimumSize(new Dimension(200, 76));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private JLabel getJLabel10()
    {
        if(ivjJLabel10 == null)
            try
            {
                ivjJLabel10 = new JLabel();
                ivjJLabel10.setName("JLabel10");
                ivjJLabel10.setText("Delay:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel10;
    }

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("Encoding:");
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
                ivjJLabel3.setIcon(new ImageIcon(this.getClass().getResource("/icons/PutAdvanced.jpg")));
                ivjJLabel3.setIconTextGap(0);
                ivjJLabel3.setText("");
                ivjJLabel3.setHorizontalTextPosition(2);
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
                ivjJLabel4.setText("ReplyToQ:");
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
                ivjJLabel5.setText("RepluyToQMgr:");
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
                ivjJLabel6.setText("CCSID:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel6;
    }

    private JLabel getJLabel7()
    {
        if(ivjJLabel7 == null)
            try
            {
                ivjJLabel7 = new JLabel();
                ivjJLabel7.setName("JLabel7");
                ivjJLabel7.setText("Format:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel7;
    }

    private JLabel getJLabel8()
    {
        if(ivjJLabel8 == null)
            try
            {
                ivjJLabel8 = new JLabel();
                ivjJLabel8.setName("JLabel8");
                ivjJLabel8.setText("Flags:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel8;
    }

    private JLabel getJLabel9()
    {
        if(ivjJLabel9 == null)
            try
            {
                ivjJLabel9 = new JLabel();
                ivjJLabel9.setName("JLabel9");
                ivjJLabel9.setText("Name/Value CCSID:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel9;
    }

    private JMenu getJMenu1()
    {
        if(ivjJMenu1 == null)
            try
            {
                ivjJMenu1 = new JMenu();
                ivjJMenu1.setName("JMenu1");
                ivjJMenu1.setText("Publish/Subscribe");
                ivjJMenu1.add(getJMenuItem6());
                ivjJMenu1.add(getJMenuItem5());
                ivjJMenu1.add(getJMenuItem4());
                ivjJMenu1.add(getJMenuItem2());
                ivjJMenu1.add(getJMenuItem7());
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
                ivjJMenuItem1.setText("Message Content Descriptor");
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
                ivjJMenuItem10.setText("Paste");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem10;
    }

    private JMenuItem getJMenuItem2()
    {
        if(ivjJMenuItem2 == null)
            try
            {
                ivjJMenuItem2 = new JMenuItem();
                ivjJMenuItem2.setName("JMenuItem2");
                ivjJMenuItem2.setText("Delete Publication");
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
                ivjJMenuItem3.setText("Application Defined");
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
                ivjJMenuItem4.setText("Deregister Subscription");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem4;
    }

    private JMenuItem getJMenuItem5()
    {
        if(ivjJMenuItem5 == null)
            try
            {
                ivjJMenuItem5 = new JMenuItem();
                ivjJMenuItem5.setName("JMenuItem5");
                ivjJMenuItem5.setText("Register Subscription");
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
                ivjJMenuItem6.setText("Publish");
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
                ivjJMenuItem7.setText("Request Update");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem7;
    }

    private JMenuItem getJMenuItem8()
    {
        if(ivjJMenuItem8 == null)
            try
            {
                ivjJMenuItem8 = new JMenuItem();
                ivjJMenuItem8.setName("JMenuItem8");
                ivjJMenuItem8.setText("Select All");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem8;
    }

    private JMenuItem getJMenuItem9()
    {
        if(ivjJMenuItem9 == null)
            try
            {
                ivjJMenuItem9 = new JMenuItem();
                ivjJMenuItem9.setName("JMenuItem9");
                ivjJMenuItem9.setText("Copy");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem9;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(null);
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
                getJScrollPane1().setViewportView(getNameValueData());
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
                getJScrollPane2().setViewportView(getScreenTextArea());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane2;
    }

    private JTabbedPane getJTabbedPane1()
    {
        if(ivjJTabbedPane1 == null)
            try
            {
                ivjJTabbedPane1 = new JTabbedPane();
                ivjJTabbedPane1.setName("JTabbedPane1");
                ivjJTabbedPane1.setPreferredSize(new Dimension(600, 286));
                ivjJTabbedPane1.setMinimumSize(new Dimension(600, 200));
                ivjJTabbedPane1.insertTab("Data", null, getDataTabPanel(), null, 0);
                ivjJTabbedPane1.insertTab("MQMD", null, getMQMDTabPanel(), null, 1);
                ivjJTabbedPane1.insertTab("RFH2", null, getRFH2TabPanel(), null, 2);
                ivjJTabbedPane1.setEnabledAt(2, false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTabbedPane1;
    }

    private JPanel getMQMDMisc()
    {
        if(ivjMQMDMisc == null)
            try
            {
                ivjMQMDMisc = new JPanel();
                ivjMQMDMisc.setName("MQMDMisc");
                ivjMQMDMisc.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 0, 4);
                getMQMDMisc().add(getJLabel4(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getMQMDMisc().add(getJLabel5(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 0, 4);
                getMQMDMisc().add(getReplyToQ(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getMQMDMisc().add(getReplyToQMgr(), gridbagconstraints3);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQMDMisc;
    }

    private JPanel getMQMDTabPanel()
    {
        if(ivjMQMDTabPanel == null)
            try
            {
                ivjMQMDTabPanel = new JPanel();
                ivjMQMDTabPanel.setName("MQMDTabPanel");
                ivjMQMDTabPanel.setPreferredSize(new Dimension(800, 174));
                ivjMQMDTabPanel.setLayout(new GridBagLayout());
                ivjMQMDTabPanel.setMinimumSize(new Dimension(800, 174));
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 18;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getMQMDTabPanel().add(getMsgType(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = -1;
                gridbagconstraints1.gridy = -1;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.anchor = 11;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getMQMDTabPanel().add(getPersistence(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = -1;
                gridbagconstraints2.gridy = -1;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.anchor = 11;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getMQMDTabPanel().add(getFormat(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.gridwidth = 3;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.anchor = 11;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getMQMDTabPanel().add(getMQMDMisc(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 1;
                gridbagconstraints4.fill = 2;
                gridbagconstraints4.anchor = 11;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.insets = new Insets(0, 4, 0, 4);
                getMQMDTabPanel().add(getExpiry(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 3;
                gridbagconstraints5.gridwidth = 3;
                gridbagconstraints5.fill = 1;
                gridbagconstraints5.weightx = 1.0D;
                gridbagconstraints5.weighty = 1.0D;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getMQMDTabPanel().add(getFiller1(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 1;
                gridbagconstraints6.gridy = 1;
                gridbagconstraints6.anchor = 11;
                gridbagconstraints6.insets = new Insets(0, 4, 0, 4);
                getMQMDTabPanel().add(getMsgIDPanel(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 2;
                gridbagconstraints7.gridy = 1;
                gridbagconstraints7.anchor = 11;
                gridbagconstraints7.insets = new Insets(0, 4, 0, 4);
                getMQMDTabPanel().add(getCorrelIDPanel(), gridbagconstraints7);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQMDTabPanel;
    }

    private JRadioButton getMQMT_DATAGRAM()
    {
        if(ivjMQMT_DATAGRAM == null)
            try
            {
                ivjMQMT_DATAGRAM = new JRadioButton();
                ivjMQMT_DATAGRAM.setName("MQMT_DATAGRAM");
                ivjMQMT_DATAGRAM.setSelected(true);
                ivjMQMT_DATAGRAM.setText("Datagram");
                getMsgTypeButtonGroup().add(ivjMQMT_DATAGRAM);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQMT_DATAGRAM;
    }

    private JRadioButton getMQMT_REPLY()
    {
        if(ivjMQMT_REPLY == null)
            try
            {
                ivjMQMT_REPLY = new JRadioButton();
                ivjMQMT_REPLY.setName("MQMT_REPLY");
                ivjMQMT_REPLY.setText("Reply");
                getMsgTypeButtonGroup().add(ivjMQMT_REPLY);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQMT_REPLY;
    }

    private JRadioButton getMQMT_REQUEST()
    {
        if(ivjMQMT_REQUEST == null)
            try
            {
                ivjMQMT_REQUEST = new JRadioButton();
                ivjMQMT_REQUEST.setName("MQMT_REQUEST");
                ivjMQMT_REQUEST.setText("Request");
                getMsgTypeButtonGroup().add(ivjMQMT_REQUEST);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQMT_REQUEST;
    }

    private JRadioButton getMQPER_NOT_PERSISTENT()
    {
        if(ivjMQPER_NOT_PERSISTENT == null)
            try
            {
                ivjMQPER_NOT_PERSISTENT = new JRadioButton();
                ivjMQPER_NOT_PERSISTENT.setName("MQPER_NOT_PERSISTENT");
                ivjMQPER_NOT_PERSISTENT.setSelected(true);
                ivjMQPER_NOT_PERSISTENT.setText("Not Persistent");
                getPersitenceButtonGroup().add(ivjMQPER_NOT_PERSISTENT);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQPER_NOT_PERSISTENT;
    }

    private JRadioButton getMQPER_PERSISTENCE_AS_Q_DEF()
    {
        if(ivjMQPER_PERSISTENCE_AS_Q_DEF == null)
            try
            {
                ivjMQPER_PERSISTENCE_AS_Q_DEF = new JRadioButton();
                ivjMQPER_PERSISTENCE_AS_Q_DEF.setName("MQPER_PERSISTENCE_AS_Q_DEF");
                ivjMQPER_PERSISTENCE_AS_Q_DEF.setText("Persistence as Queue");
                getPersitenceButtonGroup().add(ivjMQPER_PERSISTENCE_AS_Q_DEF);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQPER_PERSISTENCE_AS_Q_DEF;
    }

    private JRadioButton getMQPER_PERSISTENT()
    {
        if(ivjMQPER_PERSISTENT == null)
            try
            {
                ivjMQPER_PERSISTENT = new JRadioButton();
                ivjMQPER_PERSISTENT.setName("MQPER_PERSISTENT");
                ivjMQPER_PERSISTENT.setText("Persistent");
                getPersitenceButtonGroup().add(ivjMQPER_PERSISTENT);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQPER_PERSISTENT;
    }

    private JRadioButton getMsgID_Entry()
    {
        if(ivjMsgID_Entry == null)
            try
            {
                ivjMsgID_Entry = new JRadioButton();
                ivjMsgID_Entry.setName("MsgID_Entry");
                ivjMsgID_Entry.setText("MsgID:");
                getMsgIDButtonGroup().add(ivjMsgID_Entry);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgID_Entry;
    }

    private JRadioButton getMsgID_NONE()
    {
        if(ivjMsgID_NONE == null)
            try
            {
                ivjMsgID_NONE = new JRadioButton();
                ivjMsgID_NONE.setName("MsgID_NONE");
                ivjMsgID_NONE.setSelected(true);
                ivjMsgID_NONE.setText("None");
                getMsgIDButtonGroup().add(ivjMsgID_NONE);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgID_NONE;
    }

    private JTextField getMsgID_Text()
    {
        if(ivjMsgID_Text == null)
            try
            {
                ivjMsgID_Text = new JTextField();
                ivjMsgID_Text.setName("MsgID_Text");
                ivjMsgID_Text.setCursor(new Cursor(0));
                ivjMsgID_Text.setPreferredSize(new Dimension(100, 20));
                ivjMsgID_Text.setMinimumSize(new Dimension(100, 20));
                ivjMsgID_Text.setColumns(10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgID_Text;
    }

    private ButtonGroup getMsgIDButtonGroup()
    {
        if(ivjMsgIDButtonGroup == null)
            try
            {
                ivjMsgIDButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgIDButtonGroup;
    }

    private JPanel getMsgIDPanel()
    {
        if(ivjMsgIDPanel == null)
            try
            {
                ivjMsgIDPanel = new JPanel();
                ivjMsgIDPanel.setName("MsgIDPanel");
                ivjMsgIDPanel.setBorder(BorderFactory.createTitledBorder("MsgID"));
                ivjMsgIDPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getMsgIDPanel().add(getMsgID_NONE(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getMsgIDPanel().add(getMsgID_Text(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getMsgIDPanel().add(getMsgID_Entry(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgIDPanel;
    }

    private JPanel getMsgType()
    {
        if(ivjMsgType == null)
            try
            {
                ivjMsgType = new JPanel();
                ivjMsgType.setName("MsgType");
                ivjMsgType.setBorder(BorderFactory.createTitledBorder("MsgType"));
                ivjMsgType.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getMsgType().add(getMQMT_DATAGRAM(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getMsgType().add(getMQMT_REQUEST(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(0, 4, 0, 4);
                getMsgType().add(getMQMT_REPLY(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgType;
    }

    private ButtonGroup getMsgTypeButtonGroup()
    {
        if(ivjMsgTypeButtonGroup == null)
            try
            {
                ivjMsgTypeButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMsgTypeButtonGroup;
    }

    private NumericTextField getNameValueCCSID()
    {
        if(ivjNameValueCCSID == null)
            try
            {
                ivjNameValueCCSID = new NumericTextField();
                ivjNameValueCCSID.setName("NameValueCCSID");
                ivjNameValueCCSID.setMinimumSize(new Dimension(110, 20));
                ivjNameValueCCSID.setColumns(10);
                ivjNameValueCCSID.setIntValue(mqrfh2.nameValueCCSID);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNameValueCCSID;
    }

    private JTextArea getNameValueData()
    {
        if(ivjNameValueData == null)
            try
            {
                ivjNameValueData = new JTextArea();
                ivjNameValueData.setName("NameValueData");
                ivjNameValueData.setBounds(0, 0, 160, 120);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNameValueData;
    }

    private JPanel getNameValueDataPanel()
    {
        if(ivjNameValueDataPanel == null)
            try
            {
                ivjNameValueDataPanel = new JPanel();
                ivjNameValueDataPanel.setName("NameValueDataPanel");
                ivjNameValueDataPanel.setBorder(BorderFactory.createTitledBorder("RFH2 Folder Data"));
                ivjNameValueDataPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = -1;
                gridbagconstraints.gridy = -1;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getNameValueDataPanel().add(getJScrollPane1(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNameValueDataPanel;
    }

    private JPanel getPageHeader()
    {
        if(ivjPageHeader == null)
            try
            {
                ivjPageHeader = new JPanel();
                ivjPageHeader.setName("PageHeader");
                ivjPageHeader.setBorder(BorderFactory.createEtchedBorder());
                ivjPageHeader.setLayout(getPageHeaderFlowLayout());
                ivjPageHeader.setBackground(new Color(192, 192, 192));
                getPageHeader().add(getJLabel3(), getJLabel3().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPageHeader;
    }

    private FlowLayout getPageHeaderFlowLayout()
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

    private JPanel getPersistence()
    {
        if(ivjPersistence == null)
            try
            {
                ivjPersistence = new JPanel();
                ivjPersistence.setName("Persistence");
                ivjPersistence.setBorder(BorderFactory.createTitledBorder("Persistence"));
                ivjPersistence.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getPersistence().add(getMQPER_PERSISTENT(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getPersistence().add(getMQPER_NOT_PERSISTENT(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(0, 4, 0, 4);
                getPersistence().add(getMQPER_PERSISTENCE_AS_Q_DEF(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPersistence;
    }

    private ButtonGroup getPersitenceButtonGroup()
    {
        if(ivjPersitenceButtonGroup == null)
            try
            {
                ivjPersitenceButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPersitenceButtonGroup;
    }

    private JProgressBar getProgress()
    {
        if(ivjProgress == null)
            try
            {
                ivjProgress = new JProgressBar();
                ivjProgress.setName("Progress");
                ivjProgress.setVisible(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjProgress;
    }

    private JButton getPut()
    {
        if(ivjPut == null)
            try
            {
                ivjPut = new JButton();
                ivjPut.setName("Put");
                ivjPut.setMnemonic('P');
                ivjPut.setText("Put");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPut;
    }

    private JTextField getReplyToQ()
    {
        if(ivjReplyToQ == null)
            try
            {
                ivjReplyToQ = new JTextField();
                ivjReplyToQ.setName("ReplyToQ");
                ivjReplyToQ.setMinimumSize(new Dimension(200, 20));
                ivjReplyToQ.setColumns(48);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReplyToQ;
    }

    private JTextField getReplyToQMgr()
    {
        if(ivjReplyToQMgr == null)
            try
            {
                ivjReplyToQMgr = new JTextField();
                ivjReplyToQMgr.setName("ReplyToQMgr");
                ivjReplyToQMgr.setMinimumSize(new Dimension(200, 20));
                ivjReplyToQMgr.setColumns(48);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReplyToQMgr;
    }

    private JTextField getRFH2Format()
    {
        if(ivjRFH2Format == null)
            try
            {
                ivjRFH2Format = new JTextField();
                ivjRFH2Format.setName("RFH2Format");
                ivjRFH2Format.setMinimumSize(new Dimension(110, 20));
                ivjRFH2Format.setColumns(10);
                ivjRFH2Format.setText(mqrfh2.format);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRFH2Format;
    }

    private JPanel getRFH2TabPanel()
    {
        if(ivjRFH2TabPanel == null)
            try
            {
                ivjRFH2TabPanel = new JPanel();
                ivjRFH2TabPanel.setName("RFH2TabPanel");
                ivjRFH2TabPanel.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 3;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getCCSID(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getRFH2Format(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 3;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getFlags(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getNameValueCCSID(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 3;
                gridbagconstraints4.gridwidth = 4;
                gridbagconstraints4.fill = 1;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.weighty = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getNameValueDataPanel(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 0;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getJLabel2(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 2;
                gridbagconstraints6.gridy = 0;
                gridbagconstraints6.anchor = 17;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getJLabel6(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 0;
                gridbagconstraints7.gridy = 1;
                gridbagconstraints7.anchor = 17;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getJLabel7(), gridbagconstraints7);
                GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
                gridbagconstraints8.gridx = 2;
                gridbagconstraints8.gridy = 1;
                gridbagconstraints8.anchor = 17;
                gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getJLabel8(), gridbagconstraints8);
                GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
                gridbagconstraints9.gridx = 0;
                gridbagconstraints9.gridy = 2;
                gridbagconstraints9.anchor = 17;
                gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getJLabel9(), gridbagconstraints9);
                GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
                gridbagconstraints10.gridx = 1;
                gridbagconstraints10.gridy = 0;
                gridbagconstraints10.anchor = 17;
                gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
                getRFH2TabPanel().add(getEncoding(), gridbagconstraints10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRFH2TabPanel;
    }

    private JPanel getScreenPane()
    {
        if(ivjScreenPane == null)
            try
            {
                ivjScreenPane = new JPanel();
                ivjScreenPane.setName("ScreenPane");
                ivjScreenPane.setPreferredSize(new Dimension(400, 200));
                ivjScreenPane.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getScreenPane().add(getJScrollPane2(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjScreenPane;
    }

    private JTextArea getScreenTextArea()
    {
        if(ivjScreenTextArea == null)
            try
            {
                ivjScreenTextArea = new JTextArea();
                ivjScreenTextArea.setName("ScreenTextArea");
                ivjScreenTextArea.setFont(new Font("monospaced", 0, 12));
                ivjScreenTextArea.setRows(5);
                ivjScreenTextArea.setBounds(0, 0, 397, 192);
                ivjScreenTextArea.setMargin(new Insets(0, 0, 0, 0));
                ivjScreenTextArea.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjScreenTextArea;
    }

    private JRadioButton getSelectFile()
    {
        if(ivjSelectFile == null)
            try
            {
                ivjSelectFile = new JRadioButton();
                ivjSelectFile.setName("SelectFile");
                ivjSelectFile.setMnemonic('F');
                ivjSelectFile.setText("File");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelectFile;
    }

    private JRadioButton getSelectScreen()
    {
        if(ivjSelectScreen == null)
            try
            {
                ivjSelectScreen = new JRadioButton();
                ivjSelectScreen.setName("SelectScreen");
                ivjSelectScreen.setSelected(true);
                ivjSelectScreen.setMnemonic('n');
                ivjSelectScreen.setText("Screen");
                ivjSelectScreen.setMinimumSize(new Dimension(66, 22));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelectScreen;
    }

    private JRadioButton getSelectSize()
    {
        if(ivjSelectSize == null)
            try
            {
                ivjSelectSize = new JRadioButton();
                ivjSelectSize.setName("SelectSize");
                ivjSelectSize.setMnemonic('z');
                ivjSelectSize.setText("Size");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelectSize;
    }

    private JSeparator getSep1()
    {
        if(ivjSep1 == null)
            try
            {
                ivjSep1 = new JSeparator();
                ivjSep1.setName("Sep1");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSep1;
    }

    private com.kolban.mqjexplorer.mqattributes.NumericTextField getSizeField()
    {
        if(ivjSizeField == null)
            try
            {
                ivjSizeField = new com.kolban.mqjexplorer.mqattributes.NumericTextField();
                ivjSizeField.setName("SizeField");
                ivjSizeField.setText("100");
                ivjSizeField.setEnabled(false);
                ivjSizeField.setColumns(5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSizeField;
    }

    private JLabel getSizeLabel()
    {
        if(ivjSizeLabel == null)
            try
            {
                ivjSizeLabel = new JLabel();
                ivjSizeLabel.setName("SizeLabel");
                ivjSizeLabel.setText("Size:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSizeLabel;
    }

    private JPanel getSizePane()
    {
        if(ivjSizePane == null)
            try
            {
                ivjSizePane = new JPanel();
                ivjSizePane.setName("SizePane");
                ivjSizePane.setBorder(BorderFactory.createTitledBorder("Size Source"));
                ivjSizePane.setLayout(getSizePaneFlowLayout());
                getSizePane().add(getSizeLabel(), getSizeLabel().getName());
                getSizePane().add(getSizeField(), getSizeField().getName());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSizePane;
    }

    private FlowLayout getSizePaneFlowLayout()
    {
        FlowLayout flowlayout = null;
        try
        {
            flowlayout = new FlowLayout();
            flowlayout.setAlignment(0);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return flowlayout;
    }

    private JPanel getSourceSelectionPane()
    {
        if(ivjSourceSelectionPane == null)
            try
            {
                ivjSourceSelectionPane = new JPanel();
                ivjSourceSelectionPane.setName("SourceSelectionPane");
                ivjSourceSelectionPane.setBorder(BorderFactory.createTitledBorder("Data Source"));
                ivjSourceSelectionPane.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getSourceSelectionPane().add(getSelectFile(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 2;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.ipadx = 4;
                gridbagconstraints1.insets = new Insets(0, 4, 0, 4);
                getSourceSelectionPane().add(getSelectScreen(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 3;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(0, 4, 0, 4);
                getSourceSelectionPane().add(getSelectSize(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getSourceSelectionPane().add(getJLabel1(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.fill = 1;
                gridbagconstraints4.anchor = 11;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.weighty = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getSourceSelectionPane().add(getCountPanel(), gridbagconstraints4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSourceSelectionPane;
    }

    private JLabel getTextMessage()
    {
        if(ivjTextMessage == null)
            try
            {
                ivjTextMessage = new JLabel();
                ivjTextMessage.setName("TextMessage");
                ivjTextMessage.setText("");
                ivjTextMessage.setHorizontalAlignment(2);
                ivjTextMessage.setHorizontalTextPosition(2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjTextMessage;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void handleResized(ComponentEvent componentevent)
    {
        SwingUtils.constrainResize(componentevent);
    }

    private Border highlightBorder(boolean flag, String s)
    {
        if(flag)
            return BorderFactory.createTitledBorder(LineBorder.createBlackLineBorder(), s);
        else
            return BorderFactory.createTitledBorder(LineBorder.createGrayLineBorder(), s);
    }

    private void initConnections()
        throws Exception
    {
        getSelectScreen().addItemListener(ivjEventHandler);
        getSelectFile().addItemListener(ivjEventHandler);
        getBrowse().addActionListener(ivjEventHandler);
        getClose().addActionListener(ivjEventHandler);
        getPut().addActionListener(ivjEventHandler);
        getSelectSize().addItemListener(ivjEventHandler);
        getFileName().addPropertyChangeListener(ivjEventHandler);
        getCount().addPropertyChangeListener(ivjEventHandler);
        getSizeField().addPropertyChangeListener(ivjEventHandler);
        getFMT_ENTRY().addItemListener(ivjEventHandler);
        getExpiryTime().addItemListener(ivjEventHandler);
        getMsgID_Entry().addItemListener(ivjEventHandler);
        getCorrelID_Entry().addItemListener(ivjEventHandler);
        getCancelPut().addActionListener(ivjEventHandler);
        getFMT_RFH2().addItemListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        getNameValueData().addMouseListener(ivjEventHandler);
        getJMenuItem3().addActionListener(ivjEventHandler);
        getJMenuItem6().addActionListener(ivjEventHandler);
        getJMenuItem5().addActionListener(ivjEventHandler);
        getJMenuItem4().addActionListener(ivjEventHandler);
        getJMenuItem2().addActionListener(ivjEventHandler);
        getJMenuItem7().addActionListener(ivjEventHandler);
        addComponentListener(ivjEventHandler);
        getSelectSize().addActionListener(ivjEventHandler);
        getSelectScreen().addActionListener(ivjEventHandler);
        getSelectFile().addActionListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
        getJMenuItem8().addActionListener(ivjEventHandler);
        getJMenuItem9().addActionListener(ivjEventHandler);
        getJMenuItem10().addActionListener(ivjEventHandler);
        getScreenTextArea().addMouseListener(ivjEventHandler);
        connPtoP1SetTarget();
        connPtoP2SetTarget();
        connPtoP3SetTarget();
    }

    private void initialize()
    {
        try
        {
            ImageIcon imageicon = new ImageIcon(getClass().getResource("/icons/appIcon.gif"));
            setIconImage(imageicon.getImage());
            getGroup1().add(getSelectFile());
            getGroup1().add(getSelectScreen());
            getGroup1().add(getSelectSize());
            getRootPane().setDefaultButton(getPut());
            progressTimer = new Timer(1000, this);
            progressTimer.setRepeats(true);
            setName("PutMessageAdvanced");
            setDefaultCloseOperation(0);
            setResizable(true);
            setSize(596, 378);
            setTitle("Advanced Put Message");
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
            PutMessageAdvanced putmessageadvanced = new PutMessageAdvanced();
            putmessageadvanced.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            putmessageadvanced.pack();
            putmessageadvanced.show();
            Insets insets = putmessageadvanced.getInsets();
            putmessageadvanced.setSize(putmessageadvanced.getWidth() + insets.left + insets.right, putmessageadvanced.getHeight() + insets.top + insets.bottom);
            putmessageadvanced.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void maybeDataPopup(MouseEvent mouseevent)
    {
        if(!mouseevent.isPopupTrigger())
        {
            return;
        } else
        {
            getDataPopup().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    private void nameValueData_Mouse(MouseEvent mouseevent)
    {
        if(!mouseevent.isPopupTrigger())
        {
            return;
        } else
        {
            getDataAssistPopup().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
            return;
        }
    }

    private void put()
    {
        Object obj = null;
        if(running)
            return;
        int i;
        try
        {
            i = getCount().getIntValue();
            if(i <= 0)
                throw new Exception();
        }
        catch(Exception _ex)
        {
            JOptionPane.showMessageDialog(null, "Count field must be a numeric value greater than zero");
            getTextMessage().setText("Invalid count value");
            return;
        }
        int j;
        try
        {
            j = getDelay().getIntValue();
            if(j < 0)
                throw new Exception();
        }
        catch(Exception _ex)
        {
            JOptionPane.showMessageDialog(null, "Delay field must be a numeric value greater or equal to zero");
            getTextMessage().setText("Invalid Delay value");
            return;
        }
        try
        {
            MQMessage mqmessage = new MQMessage();
            if(getFMT_RFH2().isSelected())
            {
                mqrfh2.encoding = getEncoding().getIntValue();
                mqrfh2.flags = getFlags().getIntValue();
                mqrfh2.format = getRFH2Format().getText();
                mqrfh2.nameValueCCSID = getNameValueCCSID().getIntValue();
                mqrfh2.setData(getNameValueData().getText());
                mqmessage.write(mqrfh2.getHeader());
            }
            if(getSelectFile().isSelected())
            {
                File file = new File(getFileName().getText());
                byte abyte0[] = new byte[(int)file.length()];
                FileInputStream fileinputstream = new FileInputStream(file);
                fileinputstream.read(abyte0);
                fileinputstream.close();
                mqmessage.write(abyte0);
            } else
            if(getSelectScreen().isSelected())
            {
                mqmessage.writeString(getScreenTextArea().getText());
            } else
            {
                int k;
                try
                {
                    k = getSizeField().getIntValue();
                    if(k <= 0)
                        throw new Exception();
                }
                catch(Exception _ex)
                {
                    JOptionPane.showMessageDialog(null, "Size field must be a numeric value greater than zero");
                    getTextMessage().setText("Invalid size value");
                    return;
                }
                byte abyte1[] = new byte[k];
                for(int l = 0; l < abyte1.length; l++)
                    abyte1[l] = (byte)(l & 0xff);

                mqmessage.write(abyte1);
            }
            MQPutMessageOptions mqputmessageoptions = new MQPutMessageOptions();
            mqputmessageoptions.options = 8192;
            if(getMQPER_PERSISTENCE_AS_Q_DEF().isSelected())
                mqmessage.persistence = 2;
            else
            if(getMQPER_NOT_PERSISTENT().isSelected())
                mqmessage.persistence = 0;
            else
            if(getMQPER_PERSISTENT().isSelected())
                mqmessage.persistence = 1;
            if(getMQMT_DATAGRAM().isSelected())
                mqmessage.messageType = 8;
            else
            if(getMQMT_REPLY().isSelected())
                mqmessage.messageType = 2;
            else
            if(getMQMT_REQUEST().isSelected())
                mqmessage.messageType = 1;
            if(getFMT_ENTRY().isSelected())
                mqmessage.format = getFmtText().getText();
            else
            if(getFMT_NONE().isSelected())
                mqmessage.format = "        ";
            else
            if(getFMT_STRING().isSelected())
                mqmessage.format = "MQSTR   ";
            else
            if(getFMT_RFH2().isSelected())
                mqmessage.format = "MQHRF2  ";
            if(getExpiryUnlimited().isSelected())
                mqmessage.expiry = -1;
            else
            if(getExpiryTime().isSelected())
                mqmessage.expiry = getExpiryInterval().getIntValue();
            if(getMsgID_NONE().isSelected())
                mqmessage.messageId = MQC.MQMI_NONE;
            else
            if(getMsgID_Entry().isSelected())
                mqmessage.messageId = getMsgID_Text().getText().getBytes();
            if(getCorrelID_NONE().isSelected())
                mqmessage.correlationId = MQC.MQCI_NONE;
            else
            if(getCorrelID_Entry().isSelected())
                mqmessage.correlationId = getCorrelID_Text().getText().getBytes();
            mqmessage.replyToQueueName = getReplyToQ().getText();
            mqmessage.replyToQueueManagerName = getReplyToQMgr().getText();
            byte[] _tmp = ((MQMD) (mqmessage)).messageId;
            byte[] _tmp1 = ((MQMD) (mqmessage)).correlationId;
            System.currentTimeMillis();
            MQQueue mqqueue = qMgr.accessQueue(qName, 8208);
            putterThread = new PutterThread();
            putterThread.queue = mqqueue;
            putterThread.message = mqmessage;
            putterThread.pmo = mqputmessageoptions;
            putterThread.count = i;
            putterThread.delay = j;
            Thread thread = new Thread(putterThread);
            getCancelPut().setEnabled(true);
            running = true;
            enableButtons();
            if(i > 50)
            {
                getTextMessage().setVisible(false);
                getProgress().setVisible(true);
            }
            getProgress().setMaximum(i);
            getProgress().setValue(0);
            progressTimer.setInitialDelay(1000);
            progressTimer.start();
            thread.start();
        }
        catch(MQException mqexception)
        {
            QueueManagerModel.displayError(mqexception);
            endPut();
            getTextMessage().setText("Error");
        }
        catch(IOException ioexception)
        {
            JOptionPane.showMessageDialog(null, "Error: " + ioexception.toString());
        }
    }

    private void screenToTextAreaEnabled(ItemEvent itemevent)
    {
        try
        {
            getScreenTextArea().setEnabled(getSelectScreen().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void setdocument1(Document document)
    {
        if(ivjdocument1 != document)
            try
            {
                if(ivjdocument1 != null)
                    ivjdocument1.removeDocumentListener(ivjEventHandler);
                ivjdocument1 = document;
                if(ivjdocument1 != null)
                    ivjdocument1.addDocumentListener(ivjEventHandler);
                connPtoP1SetSource();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
    }

    private void setdocument2(Document document)
    {
        if(ivjdocument2 != document)
            try
            {
                if(ivjdocument2 != null)
                    ivjdocument2.removeDocumentListener(ivjEventHandler);
                ivjdocument2 = document;
                if(ivjdocument2 != null)
                    ivjdocument2.addDocumentListener(ivjEventHandler);
                connPtoP2SetSource();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
    }

    private void setdocument3(Document document)
    {
        if(ivjdocument3 != document)
            try
            {
                if(ivjdocument3 != null)
                    ivjdocument3.removeDocumentListener(ivjEventHandler);
                ivjdocument3 = document;
                if(ivjdocument3 != null)
                    ivjdocument3.addDocumentListener(ivjEventHandler);
                connPtoP3SetSource();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
    }

    public void setMQInfo(MQQueueManager mqqueuemanager, String s)
    {
        qMgr = mqqueuemanager;
        qName = s;
        setTitle("Advanced Put Message: " + s);
    }

    public void setProfile(com.kolban.mqjexplorer.Profile.AdvancedPutSettings advancedputsettings)
    {
        profile = advancedputsettings;
        getFileName().setText(profile.lastFileName);
        getNameValueData().setText(profile.lastRFH2Data);
        setSize(profile.windowSize);
        switch(profile.selected)
        {
        case 1: // '\001'
            getSelectFile().setSelected(true);
            break;

        case 2: // '\002'
            getSelectScreen().setSelected(true);
            break;

        case 3: // '\003'
            getSelectSize().setSelected(true);
            break;
        }
    }

    private MQRFH2 mqrfh2;
    private PutterThread putterThread;
    private JButton ivjBrowse;
    private JTextField ivjFileName;
    private JPanel ivjJDialogContentPane;
    IvjEventHandler ivjEventHandler;
    private JRadioButton ivjSelectFile;
    private JRadioButton ivjSelectScreen;
    private JButton ivjClose;
    private JPanel ivjFooterPanel;
    private JButton ivjPut;
    private ButtonGroup ivjGroup1;
    private JLabel ivjFileNameLabel;
    private JTextArea ivjScreenTextArea;
    private JPanel ivjSourceSelectionPane;
    private JScrollPane ivjJScrollPane2;
    private JPanel ivjScreenPane;
    private JPanel ivjFilePane;
    private MQQueueManager qMgr;
    private String qName;
    private JLabel ivjJLabel1;
    private com.kolban.mqjexplorer.mqattributes.NumericTextField ivjCount;
    private JLabel ivjCountLabel;
    private JPanel ivjCountPanel;
    private JLabel ivjTextMessage;
    private JRadioButton ivjSelectSize;
    private com.kolban.mqjexplorer.mqattributes.NumericTextField ivjSizeField;
    private JLabel ivjSizeLabel;
    private JPanel ivjSizePane;
    private FlowLayout ivjSizePaneFlowLayout;
    private JSeparator ivjSep1;
    private ButtonGroup ivjGroup2;
    private boolean ivjConnPtoP1Aligning;
    private Document ivjdocument1;
    private boolean ivjConnPtoP2Aligning;
    private boolean ivjConnPtoP3Aligning;
    private Document ivjdocument2;
    private Document ivjdocument3;
    private JLabel ivjJLabel3;
    private com.kolban.mqjexplorer.Profile.AdvancedPutSettings profile;
    private JTabbedPane ivjJTabbedPane1;
    private JPanel ivjPageHeader;
    private FlowLayout ivjPageHeaderFlowLayout;
    private JRadioButton ivjMQMT_DATAGRAM;
    private JRadioButton ivjMQMT_REPLY;
    private JRadioButton ivjMQMT_REQUEST;
    private JPanel ivjMsgType;
    private JRadioButton ivjMQPER_NOT_PERSISTENT;
    private JRadioButton ivjMQPER_PERSISTENCE_AS_Q_DEF;
    private JRadioButton ivjMQPER_PERSISTENT;
    private JPanel ivjPersistence;
    private ButtonGroup ivjMsgTypeButtonGroup;
    private ButtonGroup ivjPersitenceButtonGroup;
    private JRadioButton ivjFMT_ENTRY;
    private JRadioButton ivjFMT_NONE;
    private JRadioButton ivjFMT_STRING;
    private JTextField ivjFmtText;
    private JPanel ivjFormat;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JPanel ivjMQMDMisc;
    private JTextField ivjReplyToQ;
    private JTextField ivjReplyToQMgr;
    private ButtonGroup ivjFormatButtonGroup;
    private JPanel ivjExpiry;
    private com.kolban.mqjexplorer.mqattributes.NumericTextField ivjExpiryInterval;
    private JRadioButton ivjExpiryTime;
    private JRadioButton ivjExpiryUnlimited;
    private JPanel ivjDataTabPanel;
    private JPanel ivjMQMDTabPanel;
    private ButtonGroup ivjExpiryButtonGroup;
    private JPanel ivjFiller1;
    private JRadioButton ivjMsgID_Entry;
    private JRadioButton ivjMsgID_NONE;
    private JTextField ivjMsgID_Text;
    private JPanel ivjMsgIDPanel;
    private JRadioButton ivjCorrelID_Entry;
    private JRadioButton ivjCorrelID_NONE;
    private JTextField ivjCorrelID_Text;
    private JPanel ivjCorrelIDPanel;
    private ButtonGroup ivjCorrelIDButtonGroup;
    private ButtonGroup ivjMsgIDButtonGroup;
    private JButton ivjCancelPut;
    private boolean running;
    private NumericTextField ivjCCSID;
    private Encoding ivjEncoding;
    private NumericTextField ivjFlags;
    private JRadioButton ivjFMT_RFH2;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private JLabel ivjJLabel8;
    private JLabel ivjJLabel9;
    private JScrollPane ivjJScrollPane1;
    private NumericTextField ivjNameValueCCSID;
    private JTextArea ivjNameValueData;
    private JTextField ivjRFH2Format;
    private JPanel ivjRFH2TabPanel;
    private JPanel ivjNameValueDataPanel;
    private JPopupMenu ivjDataAssistPopup;
    private JMenuItem ivjJMenuItem1;
    private JMenuItem ivjJMenuItem3;
    private JMenu ivjJMenu1;
    private JMenuItem ivjJMenuItem2;
    private JMenuItem ivjJMenuItem4;
    private JMenuItem ivjJMenuItem5;
    private JMenuItem ivjJMenuItem6;
    private JMenuItem ivjJMenuItem7;
    private JProgressBar ivjProgress;
    private Timer progressTimer;
    private JPopupMenu ivjDataPopup;
    private JMenuItem ivjJMenuItem10;
    private JMenuItem ivjJMenuItem8;
    private JMenuItem ivjJMenuItem9;
    private NumericTextField ivjDelay;
    private JLabel ivjJLabel10;
    private JPanel ivjJPanel1;









































































}
