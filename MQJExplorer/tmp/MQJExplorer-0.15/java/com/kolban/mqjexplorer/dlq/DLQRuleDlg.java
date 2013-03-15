// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DLQRuleDlg.java

package com.kolban.mqjexplorer.dlq;

import com.kolban.swing.*;
import com.kolban.utils.ClassUtils;
import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer.dlq:
//            DLQRule

public class DLQRuleDlg extends JDialog
{
    class IvjEventHandler
        implements FooterListener, ActionListener, ItemListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getActionForward())
                connEtoC6();
        }

        public void cancel(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter2())
                connEtoC1(eventobject);
        }

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getFWDQNamed())
                connEtoM1(itemevent);
            if(itemevent.getSource() == getFWDQMNamed())
                connEtoM2(itemevent);
            if(itemevent.getSource() == getActionForward())
                connEtoC3(itemevent);
            if(itemevent.getSource() == getActionForward())
                connEtoC4(itemevent);
            if(itemevent.getSource() == getActionRetry())
                connEtoC5(itemevent);
        }

        public void ok(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter2())
                connEtoC2(eventobject);
        }

        IvjEventHandler()
        {
        }
    }


    public DLQRuleDlg()
    {
        ivjFooter2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjJPanel4 = null;
        ivjJPanel5 = null;
        ivjJPanel6 = null;
        ivjJPanel7 = null;
        ivjJPanel8 = null;
        ivjJTextField10 = null;
        ivjJTextField11 = null;
        ivjJTextField13 = null;
        ivjJTextField14 = null;
        ivjJTextField15 = null;
        ivjJTextField3 = null;
        ivjJTextField4 = null;
        ivjJTextField5 = null;
        ivjJTextField6 = null;
        ivjJTextField7 = null;
        ivjJTextField8 = null;
        ivjJTextField9 = null;
        ivjRetryCount = null;
        ivjActionDiscard = null;
        ivjActionForward = null;
        ivjActionIgnore = null;
        ivjActionRetry = null;
        ivjActionButtonGroup = null;
        ivjFWDQButtonGroup = null;
        ivjFWDQMButtonGroup = null;
        ivjFWDQDestQ = null;
        ivjFWDQNamed = null;
        ivjFWDQReplyQ = null;
        ivjFWDQNamedText = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFWDQMDestQM = null;
        ivjFWDQMLocalQM = null;
        ivjFWDQMNamed = null;
        ivjFWDQMReplyQM = null;
        ivjHeaderButtonGroup = null;
        ivjPutAutButtonGroup = null;
        ivjFWDQMNamedText = null;
        ivjHeaderNo = null;
        ivjHeaderYes = null;
        ivjPutAutCtx = null;
        ivjPutAutDef = null;
        ivjJPanel1 = null;
        ivjDescription = null;
        ivjJLabel19 = null;
        ivjJPanel9 = null;
        ivjReason = null;
        initialize();
    }

    public DLQRuleDlg(Dialog dialog)
    {
        super(dialog);
        ivjFooter2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjJPanel4 = null;
        ivjJPanel5 = null;
        ivjJPanel6 = null;
        ivjJPanel7 = null;
        ivjJPanel8 = null;
        ivjJTextField10 = null;
        ivjJTextField11 = null;
        ivjJTextField13 = null;
        ivjJTextField14 = null;
        ivjJTextField15 = null;
        ivjJTextField3 = null;
        ivjJTextField4 = null;
        ivjJTextField5 = null;
        ivjJTextField6 = null;
        ivjJTextField7 = null;
        ivjJTextField8 = null;
        ivjJTextField9 = null;
        ivjRetryCount = null;
        ivjActionDiscard = null;
        ivjActionForward = null;
        ivjActionIgnore = null;
        ivjActionRetry = null;
        ivjActionButtonGroup = null;
        ivjFWDQButtonGroup = null;
        ivjFWDQMButtonGroup = null;
        ivjFWDQDestQ = null;
        ivjFWDQNamed = null;
        ivjFWDQReplyQ = null;
        ivjFWDQNamedText = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFWDQMDestQM = null;
        ivjFWDQMLocalQM = null;
        ivjFWDQMNamed = null;
        ivjFWDQMReplyQM = null;
        ivjHeaderButtonGroup = null;
        ivjPutAutButtonGroup = null;
        ivjFWDQMNamedText = null;
        ivjHeaderNo = null;
        ivjHeaderYes = null;
        ivjPutAutCtx = null;
        ivjPutAutDef = null;
        ivjJPanel1 = null;
        ivjDescription = null;
        ivjJLabel19 = null;
        ivjJPanel9 = null;
        ivjReason = null;
    }

    public DLQRuleDlg(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjFooter2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjJPanel4 = null;
        ivjJPanel5 = null;
        ivjJPanel6 = null;
        ivjJPanel7 = null;
        ivjJPanel8 = null;
        ivjJTextField10 = null;
        ivjJTextField11 = null;
        ivjJTextField13 = null;
        ivjJTextField14 = null;
        ivjJTextField15 = null;
        ivjJTextField3 = null;
        ivjJTextField4 = null;
        ivjJTextField5 = null;
        ivjJTextField6 = null;
        ivjJTextField7 = null;
        ivjJTextField8 = null;
        ivjJTextField9 = null;
        ivjRetryCount = null;
        ivjActionDiscard = null;
        ivjActionForward = null;
        ivjActionIgnore = null;
        ivjActionRetry = null;
        ivjActionButtonGroup = null;
        ivjFWDQButtonGroup = null;
        ivjFWDQMButtonGroup = null;
        ivjFWDQDestQ = null;
        ivjFWDQNamed = null;
        ivjFWDQReplyQ = null;
        ivjFWDQNamedText = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFWDQMDestQM = null;
        ivjFWDQMLocalQM = null;
        ivjFWDQMNamed = null;
        ivjFWDQMReplyQM = null;
        ivjHeaderButtonGroup = null;
        ivjPutAutButtonGroup = null;
        ivjFWDQMNamedText = null;
        ivjHeaderNo = null;
        ivjHeaderYes = null;
        ivjPutAutCtx = null;
        ivjPutAutDef = null;
        ivjJPanel1 = null;
        ivjDescription = null;
        ivjJLabel19 = null;
        ivjJPanel9 = null;
        ivjReason = null;
    }

    public DLQRuleDlg(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjFooter2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjJPanel4 = null;
        ivjJPanel5 = null;
        ivjJPanel6 = null;
        ivjJPanel7 = null;
        ivjJPanel8 = null;
        ivjJTextField10 = null;
        ivjJTextField11 = null;
        ivjJTextField13 = null;
        ivjJTextField14 = null;
        ivjJTextField15 = null;
        ivjJTextField3 = null;
        ivjJTextField4 = null;
        ivjJTextField5 = null;
        ivjJTextField6 = null;
        ivjJTextField7 = null;
        ivjJTextField8 = null;
        ivjJTextField9 = null;
        ivjRetryCount = null;
        ivjActionDiscard = null;
        ivjActionForward = null;
        ivjActionIgnore = null;
        ivjActionRetry = null;
        ivjActionButtonGroup = null;
        ivjFWDQButtonGroup = null;
        ivjFWDQMButtonGroup = null;
        ivjFWDQDestQ = null;
        ivjFWDQNamed = null;
        ivjFWDQReplyQ = null;
        ivjFWDQNamedText = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFWDQMDestQM = null;
        ivjFWDQMLocalQM = null;
        ivjFWDQMNamed = null;
        ivjFWDQMReplyQM = null;
        ivjHeaderButtonGroup = null;
        ivjPutAutButtonGroup = null;
        ivjFWDQMNamedText = null;
        ivjHeaderNo = null;
        ivjHeaderYes = null;
        ivjPutAutCtx = null;
        ivjPutAutDef = null;
        ivjJPanel1 = null;
        ivjDescription = null;
        ivjJLabel19 = null;
        ivjJPanel9 = null;
        ivjReason = null;
    }

    public DLQRuleDlg(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjFooter2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjJPanel4 = null;
        ivjJPanel5 = null;
        ivjJPanel6 = null;
        ivjJPanel7 = null;
        ivjJPanel8 = null;
        ivjJTextField10 = null;
        ivjJTextField11 = null;
        ivjJTextField13 = null;
        ivjJTextField14 = null;
        ivjJTextField15 = null;
        ivjJTextField3 = null;
        ivjJTextField4 = null;
        ivjJTextField5 = null;
        ivjJTextField6 = null;
        ivjJTextField7 = null;
        ivjJTextField8 = null;
        ivjJTextField9 = null;
        ivjRetryCount = null;
        ivjActionDiscard = null;
        ivjActionForward = null;
        ivjActionIgnore = null;
        ivjActionRetry = null;
        ivjActionButtonGroup = null;
        ivjFWDQButtonGroup = null;
        ivjFWDQMButtonGroup = null;
        ivjFWDQDestQ = null;
        ivjFWDQNamed = null;
        ivjFWDQReplyQ = null;
        ivjFWDQNamedText = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFWDQMDestQM = null;
        ivjFWDQMLocalQM = null;
        ivjFWDQMNamed = null;
        ivjFWDQMReplyQM = null;
        ivjHeaderButtonGroup = null;
        ivjPutAutButtonGroup = null;
        ivjFWDQMNamedText = null;
        ivjHeaderNo = null;
        ivjHeaderYes = null;
        ivjPutAutCtx = null;
        ivjPutAutDef = null;
        ivjJPanel1 = null;
        ivjDescription = null;
        ivjJLabel19 = null;
        ivjJPanel9 = null;
        ivjReason = null;
    }

    public DLQRuleDlg(Frame frame)
    {
        super(frame);
        ivjFooter2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjJPanel4 = null;
        ivjJPanel5 = null;
        ivjJPanel6 = null;
        ivjJPanel7 = null;
        ivjJPanel8 = null;
        ivjJTextField10 = null;
        ivjJTextField11 = null;
        ivjJTextField13 = null;
        ivjJTextField14 = null;
        ivjJTextField15 = null;
        ivjJTextField3 = null;
        ivjJTextField4 = null;
        ivjJTextField5 = null;
        ivjJTextField6 = null;
        ivjJTextField7 = null;
        ivjJTextField8 = null;
        ivjJTextField9 = null;
        ivjRetryCount = null;
        ivjActionDiscard = null;
        ivjActionForward = null;
        ivjActionIgnore = null;
        ivjActionRetry = null;
        ivjActionButtonGroup = null;
        ivjFWDQButtonGroup = null;
        ivjFWDQMButtonGroup = null;
        ivjFWDQDestQ = null;
        ivjFWDQNamed = null;
        ivjFWDQReplyQ = null;
        ivjFWDQNamedText = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFWDQMDestQM = null;
        ivjFWDQMLocalQM = null;
        ivjFWDQMNamed = null;
        ivjFWDQMReplyQM = null;
        ivjHeaderButtonGroup = null;
        ivjPutAutButtonGroup = null;
        ivjFWDQMNamedText = null;
        ivjHeaderNo = null;
        ivjHeaderYes = null;
        ivjPutAutCtx = null;
        ivjPutAutDef = null;
        ivjJPanel1 = null;
        ivjDescription = null;
        ivjJLabel19 = null;
        ivjJPanel9 = null;
        ivjReason = null;
    }

    public DLQRuleDlg(Frame frame, String s)
    {
        super(frame, s);
        ivjFooter2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjJPanel4 = null;
        ivjJPanel5 = null;
        ivjJPanel6 = null;
        ivjJPanel7 = null;
        ivjJPanel8 = null;
        ivjJTextField10 = null;
        ivjJTextField11 = null;
        ivjJTextField13 = null;
        ivjJTextField14 = null;
        ivjJTextField15 = null;
        ivjJTextField3 = null;
        ivjJTextField4 = null;
        ivjJTextField5 = null;
        ivjJTextField6 = null;
        ivjJTextField7 = null;
        ivjJTextField8 = null;
        ivjJTextField9 = null;
        ivjRetryCount = null;
        ivjActionDiscard = null;
        ivjActionForward = null;
        ivjActionIgnore = null;
        ivjActionRetry = null;
        ivjActionButtonGroup = null;
        ivjFWDQButtonGroup = null;
        ivjFWDQMButtonGroup = null;
        ivjFWDQDestQ = null;
        ivjFWDQNamed = null;
        ivjFWDQReplyQ = null;
        ivjFWDQNamedText = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFWDQMDestQM = null;
        ivjFWDQMLocalQM = null;
        ivjFWDQMNamed = null;
        ivjFWDQMReplyQM = null;
        ivjHeaderButtonGroup = null;
        ivjPutAutButtonGroup = null;
        ivjFWDQMNamedText = null;
        ivjHeaderNo = null;
        ivjHeaderYes = null;
        ivjPutAutCtx = null;
        ivjPutAutDef = null;
        ivjJPanel1 = null;
        ivjDescription = null;
        ivjJLabel19 = null;
        ivjJPanel9 = null;
        ivjReason = null;
    }

    public DLQRuleDlg(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjFooter2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjJPanel4 = null;
        ivjJPanel5 = null;
        ivjJPanel6 = null;
        ivjJPanel7 = null;
        ivjJPanel8 = null;
        ivjJTextField10 = null;
        ivjJTextField11 = null;
        ivjJTextField13 = null;
        ivjJTextField14 = null;
        ivjJTextField15 = null;
        ivjJTextField3 = null;
        ivjJTextField4 = null;
        ivjJTextField5 = null;
        ivjJTextField6 = null;
        ivjJTextField7 = null;
        ivjJTextField8 = null;
        ivjJTextField9 = null;
        ivjRetryCount = null;
        ivjActionDiscard = null;
        ivjActionForward = null;
        ivjActionIgnore = null;
        ivjActionRetry = null;
        ivjActionButtonGroup = null;
        ivjFWDQButtonGroup = null;
        ivjFWDQMButtonGroup = null;
        ivjFWDQDestQ = null;
        ivjFWDQNamed = null;
        ivjFWDQReplyQ = null;
        ivjFWDQNamedText = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFWDQMDestQM = null;
        ivjFWDQMLocalQM = null;
        ivjFWDQMNamed = null;
        ivjFWDQMReplyQM = null;
        ivjHeaderButtonGroup = null;
        ivjPutAutButtonGroup = null;
        ivjFWDQMNamedText = null;
        ivjHeaderNo = null;
        ivjHeaderYes = null;
        ivjPutAutCtx = null;
        ivjPutAutDef = null;
        ivjJPanel1 = null;
        ivjDescription = null;
        ivjJLabel19 = null;
        ivjJPanel9 = null;
        ivjReason = null;
    }

    public DLQRuleDlg(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjFooter2 = null;
        ivjJDialogContentPane1 = null;
        ivjJLabel1 = null;
        ivjJLabel10 = null;
        ivjJLabel11 = null;
        ivjJLabel12 = null;
        ivjJLabel13 = null;
        ivjJLabel14 = null;
        ivjJLabel15 = null;
        ivjJLabel16 = null;
        ivjJLabel17 = null;
        ivjJLabel18 = null;
        ivjJLabel2 = null;
        ivjJLabel3 = null;
        ivjJLabel4 = null;
        ivjJLabel5 = null;
        ivjJLabel6 = null;
        ivjJLabel7 = null;
        ivjJLabel8 = null;
        ivjJLabel9 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjJPanel4 = null;
        ivjJPanel5 = null;
        ivjJPanel6 = null;
        ivjJPanel7 = null;
        ivjJPanel8 = null;
        ivjJTextField10 = null;
        ivjJTextField11 = null;
        ivjJTextField13 = null;
        ivjJTextField14 = null;
        ivjJTextField15 = null;
        ivjJTextField3 = null;
        ivjJTextField4 = null;
        ivjJTextField5 = null;
        ivjJTextField6 = null;
        ivjJTextField7 = null;
        ivjJTextField8 = null;
        ivjJTextField9 = null;
        ivjRetryCount = null;
        ivjActionDiscard = null;
        ivjActionForward = null;
        ivjActionIgnore = null;
        ivjActionRetry = null;
        ivjActionButtonGroup = null;
        ivjFWDQButtonGroup = null;
        ivjFWDQMButtonGroup = null;
        ivjFWDQDestQ = null;
        ivjFWDQNamed = null;
        ivjFWDQReplyQ = null;
        ivjFWDQNamedText = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFWDQMDestQM = null;
        ivjFWDQMLocalQM = null;
        ivjFWDQMNamed = null;
        ivjFWDQMReplyQM = null;
        ivjHeaderButtonGroup = null;
        ivjPutAutButtonGroup = null;
        ivjFWDQMNamedText = null;
        ivjHeaderNo = null;
        ivjHeaderYes = null;
        ivjPutAutCtx = null;
        ivjPutAutDef = null;
        ivjJPanel1 = null;
        ivjDescription = null;
        ivjJLabel19 = null;
        ivjJPanel9 = null;
        ivjReason = null;
    }

    public void cancel()
    {
    }

    private void connEtoC1(EventObject eventobject)
    {
        try
        {
            cancel();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(EventObject eventobject)
    {
        try
        {
            ok();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(ItemEvent itemevent)
    {
        try
        {
            enableAll(getJPanel5(), getActionForward().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(ItemEvent itemevent)
    {
        try
        {
            enableAll(getJPanel6(), getActionForward().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5(ItemEvent itemevent)
    {
        try
        {
            enableAll(getJPanel8(), getActionRetry().isSelected());
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
            enableAll(getJPanel8(), getActionForward().isSelected());
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
            getFWDQNamedText().setEnabled(getFWDQNamed().isSelected());
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
            getFWDQMNamedText().setEnabled(getFWDQMNamed().isSelected());
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public void enableAll(JPanel jpanel, boolean flag)
    {
        SwingUtils.enableAll(jpanel, flag);
    }

    private ButtonGroup getActionButtonGroup()
    {
        if(ivjActionButtonGroup == null)
            try
            {
                ivjActionButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjActionButtonGroup;
    }

    private JRadioButton getActionDiscard()
    {
        if(ivjActionDiscard == null)
            try
            {
                ivjActionDiscard = new JRadioButton();
                ivjActionDiscard.setName("ActionDiscard");
                ivjActionDiscard.setText("Discard");
                getActionButtonGroup().add(ivjActionDiscard);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjActionDiscard;
    }

    private JRadioButton getActionForward()
    {
        if(ivjActionForward == null)
            try
            {
                ivjActionForward = new JRadioButton();
                ivjActionForward.setName("ActionForward");
                ivjActionForward.setText("Forward");
                getActionButtonGroup().add(ivjActionForward);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjActionForward;
    }

    private JRadioButton getActionIgnore()
    {
        if(ivjActionIgnore == null)
            try
            {
                ivjActionIgnore = new JRadioButton();
                ivjActionIgnore.setName("ActionIgnore");
                ivjActionIgnore.setText("Ignore");
                getActionButtonGroup().add(ivjActionIgnore);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjActionIgnore;
    }

    private JRadioButton getActionRetry()
    {
        if(ivjActionRetry == null)
            try
            {
                ivjActionRetry = new JRadioButton();
                ivjActionRetry.setName("ActionRetry");
                ivjActionRetry.setText("Retry");
                getActionButtonGroup().add(ivjActionRetry);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjActionRetry;
    }

    private JTextField getDescription()
    {
        if(ivjDescription == null)
            try
            {
                ivjDescription = new JTextField();
                ivjDescription.setName("Description");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDescription;
    }

    public DLQRule getDLQRule()
    {
        DLQRule dlqrule = new DLQRule();
        dlqrule.setDescription(getDescription().getText());
        HookedListEntry hookedlistentry = (HookedListEntry)getReason().getSelectedItem();
        dlqrule.setReason(((Integer)hookedlistentry.getValue()).intValue());
        return dlqrule;
    }

    private Footer getFooter2()
    {
        if(ivjFooter2 == null)
            try
            {
                ivjFooter2 = new Footer();
                ivjFooter2.setName("Footer2");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter2;
    }

    private ButtonGroup getFWDQButtonGroup()
    {
        if(ivjFWDQButtonGroup == null)
            try
            {
                ivjFWDQButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQButtonGroup;
    }

    private JRadioButton getFWDQDestQ()
    {
        if(ivjFWDQDestQ == null)
            try
            {
                ivjFWDQDestQ = new JRadioButton();
                ivjFWDQDestQ.setName("FWDQDestQ");
                ivjFWDQDestQ.setText("DestQ");
                getFWDQButtonGroup().add(ivjFWDQDestQ);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQDestQ;
    }

    private ButtonGroup getFWDQMButtonGroup()
    {
        if(ivjFWDQMButtonGroup == null)
            try
            {
                ivjFWDQMButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQMButtonGroup;
    }

    private JRadioButton getFWDQMDestQM()
    {
        if(ivjFWDQMDestQM == null)
            try
            {
                ivjFWDQMDestQM = new JRadioButton();
                ivjFWDQMDestQM.setName("FWDQMDestQM");
                ivjFWDQMDestQM.setText("DestQM");
                getFWDQMButtonGroup().add(ivjFWDQMDestQM);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQMDestQM;
    }

    private JRadioButton getFWDQMLocalQM()
    {
        if(ivjFWDQMLocalQM == null)
            try
            {
                ivjFWDQMLocalQM = new JRadioButton();
                ivjFWDQMLocalQM.setName("FWDQMLocalQM");
                ivjFWDQMLocalQM.setText("LocalQM");
                getFWDQMButtonGroup().add(ivjFWDQMLocalQM);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQMLocalQM;
    }

    private JRadioButton getFWDQMNamed()
    {
        if(ivjFWDQMNamed == null)
            try
            {
                ivjFWDQMNamed = new JRadioButton();
                ivjFWDQMNamed.setName("FWDQMNamed");
                ivjFWDQMNamed.setText("");
                ivjFWDQMNamed.setMargin(new Insets(2, 2, 2, 0));
                getFWDQMButtonGroup().add(ivjFWDQMNamed);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQMNamed;
    }

    private JTextField getFWDQMNamedText()
    {
        if(ivjFWDQMNamedText == null)
            try
            {
                ivjFWDQMNamedText = new JTextField();
                ivjFWDQMNamedText.setName("FWDQMNamedText");
                ivjFWDQMNamedText.setMinimumSize(new Dimension(110, 20));
                ivjFWDQMNamedText.setColumns(10);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQMNamedText;
    }

    private JRadioButton getFWDQMReplyQM()
    {
        if(ivjFWDQMReplyQM == null)
            try
            {
                ivjFWDQMReplyQM = new JRadioButton();
                ivjFWDQMReplyQM.setName("FWDQMReplyQM");
                ivjFWDQMReplyQM.setText("ReplyQM");
                getFWDQMButtonGroup().add(ivjFWDQMReplyQM);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQMReplyQM;
    }

    private JRadioButton getFWDQNamed()
    {
        if(ivjFWDQNamed == null)
            try
            {
                ivjFWDQNamed = new JRadioButton();
                ivjFWDQNamed.setName("FWDQNamed");
                ivjFWDQNamed.setText("");
                ivjFWDQNamed.setMargin(new Insets(2, 2, 2, 0));
                getFWDQButtonGroup().add(ivjFWDQNamed);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQNamed;
    }

    private JTextField getFWDQNamedText()
    {
        if(ivjFWDQNamedText == null)
            try
            {
                ivjFWDQNamedText = new JTextField();
                ivjFWDQNamedText.setName("FWDQNamedText");
                ivjFWDQNamedText.setPreferredSize(new Dimension(110, 20));
                ivjFWDQNamedText.setMinimumSize(new Dimension(110, 20));
                ivjFWDQNamedText.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQNamedText;
    }

    private JRadioButton getFWDQReplyQ()
    {
        if(ivjFWDQReplyQ == null)
            try
            {
                ivjFWDQReplyQ = new JRadioButton();
                ivjFWDQReplyQ.setName("FWDQReplyQ");
                ivjFWDQReplyQ.setText("ReplyQ");
                getFWDQButtonGroup().add(ivjFWDQReplyQ);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFWDQReplyQ;
    }

    private ButtonGroup getHeaderButtonGroup()
    {
        if(ivjHeaderButtonGroup == null)
            try
            {
                ivjHeaderButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHeaderButtonGroup;
    }

    private JRadioButton getHeaderNo()
    {
        if(ivjHeaderNo == null)
            try
            {
                ivjHeaderNo = new JRadioButton();
                ivjHeaderNo.setName("HeaderNo");
                ivjHeaderNo.setText("No");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHeaderNo;
    }

    private JRadioButton getHeaderYes()
    {
        if(ivjHeaderYes == null)
            try
            {
                ivjHeaderYes = new JRadioButton();
                ivjHeaderYes.setName("HeaderYes");
                ivjHeaderYes.setSelected(true);
                ivjHeaderYes.setText("Yes");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHeaderYes;
    }

    private JPanel getJDialogContentPane1()
    {
        if(ivjJDialogContentPane1 == null)
            try
            {
                ivjJDialogContentPane1 = new JPanel();
                ivjJDialogContentPane1.setName("JDialogContentPane1");
                ivjJDialogContentPane1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 2;
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane1().add(getFooter2(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane1().add(getJPanel2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane1().add(getJPanel7(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.gridwidth = 2;
                gridbagconstraints3.fill = 1;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane1().add(getJPanel9(), gridbagconstraints3);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane1;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("FWDQ:");
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
                ivjJLabel10.setText("DestQM");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel10;
    }

    private JLabel getJLabel11()
    {
        if(ivjJLabel11 == null)
            try
            {
                ivjJLabel11 = new JLabel();
                ivjJLabel11.setName("JLabel11");
                ivjJLabel11.setText("Feedback");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel11;
    }

    private JLabel getJLabel12()
    {
        if(ivjJLabel12 == null)
            try
            {
                ivjJLabel12 = new JLabel();
                ivjJLabel12.setName("JLabel12");
                ivjJLabel12.setText("Format:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel12;
    }

    private JLabel getJLabel13()
    {
        if(ivjJLabel13 == null)
            try
            {
                ivjJLabel13 = new JLabel();
                ivjJLabel13.setName("JLabel13");
                ivjJLabel13.setText("MsgType:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel13;
    }

    private JLabel getJLabel14()
    {
        if(ivjJLabel14 == null)
            try
            {
                ivjJLabel14 = new JLabel();
                ivjJLabel14.setName("JLabel14");
                ivjJLabel14.setText("Persistence:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel14;
    }

    private JLabel getJLabel15()
    {
        if(ivjJLabel15 == null)
            try
            {
                ivjJLabel15 = new JLabel();
                ivjJLabel15.setName("JLabel15");
                ivjJLabel15.setText("Reason:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel15;
    }

    private JLabel getJLabel16()
    {
        if(ivjJLabel16 == null)
            try
            {
                ivjJLabel16 = new JLabel();
                ivjJLabel16.setName("JLabel16");
                ivjJLabel16.setText("ReplyToQ:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel16;
    }

    private JLabel getJLabel17()
    {
        if(ivjJLabel17 == null)
            try
            {
                ivjJLabel17 = new JLabel();
                ivjJLabel17.setName("JLabel17");
                ivjJLabel17.setText("ReplyToQM:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel17;
    }

    private JLabel getJLabel18()
    {
        if(ivjJLabel18 == null)
            try
            {
                ivjJLabel18 = new JLabel();
                ivjJLabel18.setName("JLabel18");
                ivjJLabel18.setText("Userid:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel18;
    }

    private JLabel getJLabel19()
    {
        if(ivjJLabel19 == null)
            try
            {
                ivjJLabel19 = new JLabel();
                ivjJLabel19.setName("JLabel19");
                ivjJLabel19.setText("Description:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel19;
    }

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("FWDQM:");
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
                ivjJLabel3.setText("Header:");
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
                ivjJLabel4.setText("PutAut:");
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
                ivjJLabel5.setText("Retry:");
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
                ivjJLabel6.setText("ApplIdentityData:");
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
                ivjJLabel7.setText("ApplName:");
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
                ivjJLabel8.setText("ApplType:");
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
                ivjJLabel9.setText("DestQ");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel9;
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

    private JPanel getJPanel2()
    {
        if(ivjJPanel2 == null)
            try
            {
                ivjJPanel2 = new JPanel();
                ivjJPanel2.setName("JPanel2");
                ivjJPanel2.setBorder(BorderFactory.createTitledBorder("Pattern"));
                ivjJPanel2.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getJPanel3(), gridbagconstraints);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
    }

    private JPanel getJPanel3()
    {
        if(ivjJPanel3 == null)
            try
            {
                ivjJPanel3 = new JPanel();
                ivjJPanel3.setName("JPanel3");
                ivjJPanel3.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel6(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel7(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel8(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel9(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 4;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel10(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 5;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel11(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 6;
                gridbagconstraints6.anchor = 17;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel12(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 0;
                gridbagconstraints7.gridy = 7;
                gridbagconstraints7.anchor = 17;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel13(), gridbagconstraints7);
                GridBagConstraints gridbagconstraints8 = new GridBagConstraints();
                gridbagconstraints8.gridx = 0;
                gridbagconstraints8.gridy = 8;
                gridbagconstraints8.anchor = 17;
                gridbagconstraints8.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel14(), gridbagconstraints8);
                GridBagConstraints gridbagconstraints9 = new GridBagConstraints();
                gridbagconstraints9.gridx = 0;
                gridbagconstraints9.gridy = 9;
                gridbagconstraints9.anchor = 17;
                gridbagconstraints9.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel15(), gridbagconstraints9);
                GridBagConstraints gridbagconstraints10 = new GridBagConstraints();
                gridbagconstraints10.gridx = 0;
                gridbagconstraints10.gridy = 10;
                gridbagconstraints10.anchor = 17;
                gridbagconstraints10.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel16(), gridbagconstraints10);
                GridBagConstraints gridbagconstraints11 = new GridBagConstraints();
                gridbagconstraints11.gridx = 0;
                gridbagconstraints11.gridy = 11;
                gridbagconstraints11.anchor = 17;
                gridbagconstraints11.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel17(), gridbagconstraints11);
                GridBagConstraints gridbagconstraints12 = new GridBagConstraints();
                gridbagconstraints12.gridx = 0;
                gridbagconstraints12.gridy = 12;
                gridbagconstraints12.anchor = 17;
                gridbagconstraints12.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJLabel18(), gridbagconstraints12);
                GridBagConstraints gridbagconstraints13 = new GridBagConstraints();
                gridbagconstraints13.gridx = 1;
                gridbagconstraints13.gridy = 0;
                gridbagconstraints13.fill = 2;
                gridbagconstraints13.weightx = 1.0D;
                gridbagconstraints13.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField3(), gridbagconstraints13);
                GridBagConstraints gridbagconstraints14 = new GridBagConstraints();
                gridbagconstraints14.gridx = 1;
                gridbagconstraints14.gridy = 1;
                gridbagconstraints14.fill = 2;
                gridbagconstraints14.weightx = 1.0D;
                gridbagconstraints14.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField4(), gridbagconstraints14);
                GridBagConstraints gridbagconstraints15 = new GridBagConstraints();
                gridbagconstraints15.gridx = 1;
                gridbagconstraints15.gridy = 2;
                gridbagconstraints15.fill = 2;
                gridbagconstraints15.weightx = 1.0D;
                gridbagconstraints15.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField5(), gridbagconstraints15);
                GridBagConstraints gridbagconstraints16 = new GridBagConstraints();
                gridbagconstraints16.gridx = 1;
                gridbagconstraints16.gridy = 3;
                gridbagconstraints16.fill = 2;
                gridbagconstraints16.weightx = 1.0D;
                gridbagconstraints16.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField6(), gridbagconstraints16);
                GridBagConstraints gridbagconstraints17 = new GridBagConstraints();
                gridbagconstraints17.gridx = 1;
                gridbagconstraints17.gridy = 4;
                gridbagconstraints17.fill = 2;
                gridbagconstraints17.weightx = 1.0D;
                gridbagconstraints17.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField7(), gridbagconstraints17);
                GridBagConstraints gridbagconstraints18 = new GridBagConstraints();
                gridbagconstraints18.gridx = 1;
                gridbagconstraints18.gridy = 5;
                gridbagconstraints18.fill = 2;
                gridbagconstraints18.weightx = 1.0D;
                gridbagconstraints18.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField8(), gridbagconstraints18);
                GridBagConstraints gridbagconstraints19 = new GridBagConstraints();
                gridbagconstraints19.gridx = 1;
                gridbagconstraints19.gridy = 6;
                gridbagconstraints19.fill = 2;
                gridbagconstraints19.weightx = 1.0D;
                gridbagconstraints19.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField9(), gridbagconstraints19);
                GridBagConstraints gridbagconstraints20 = new GridBagConstraints();
                gridbagconstraints20.gridx = 1;
                gridbagconstraints20.gridy = 7;
                gridbagconstraints20.fill = 2;
                gridbagconstraints20.weightx = 1.0D;
                gridbagconstraints20.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField10(), gridbagconstraints20);
                GridBagConstraints gridbagconstraints21 = new GridBagConstraints();
                gridbagconstraints21.gridx = 1;
                gridbagconstraints21.gridy = 8;
                gridbagconstraints21.fill = 2;
                gridbagconstraints21.weightx = 1.0D;
                gridbagconstraints21.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField11(), gridbagconstraints21);
                GridBagConstraints gridbagconstraints22 = new GridBagConstraints();
                gridbagconstraints22.gridx = 1;
                gridbagconstraints22.gridy = 10;
                gridbagconstraints22.fill = 2;
                gridbagconstraints22.weightx = 1.0D;
                gridbagconstraints22.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField13(), gridbagconstraints22);
                GridBagConstraints gridbagconstraints23 = new GridBagConstraints();
                gridbagconstraints23.gridx = 1;
                gridbagconstraints23.gridy = 11;
                gridbagconstraints23.fill = 2;
                gridbagconstraints23.weightx = 1.0D;
                gridbagconstraints23.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField14(), gridbagconstraints23);
                GridBagConstraints gridbagconstraints24 = new GridBagConstraints();
                gridbagconstraints24.gridx = 1;
                gridbagconstraints24.gridy = 12;
                gridbagconstraints24.fill = 2;
                gridbagconstraints24.weightx = 1.0D;
                gridbagconstraints24.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJTextField15(), gridbagconstraints24);
                GridBagConstraints gridbagconstraints25 = new GridBagConstraints();
                gridbagconstraints25.gridx = 0;
                gridbagconstraints25.gridy = 13;
                gridbagconstraints25.gridwidth = 2;
                gridbagconstraints25.fill = 1;
                gridbagconstraints25.weightx = 1.0D;
                gridbagconstraints25.weighty = 1.0D;
                gridbagconstraints25.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getJPanel1(), gridbagconstraints25);
                GridBagConstraints gridbagconstraints26 = new GridBagConstraints();
                gridbagconstraints26.gridx = 1;
                gridbagconstraints26.gridy = 9;
                gridbagconstraints26.fill = 2;
                gridbagconstraints26.weightx = 1.0D;
                gridbagconstraints26.insets = new Insets(4, 4, 4, 4);
                getJPanel3().add(getReason(), gridbagconstraints26);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel3;
    }

    private JPanel getJPanel4()
    {
        if(ivjJPanel4 == null)
            try
            {
                ivjJPanel4 = new JPanel();
                ivjJPanel4.setName("JPanel4");
                ivjJPanel4.setBorder(BorderFactory.createEtchedBorder());
                ivjJPanel4.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel4().add(getActionDiscard(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 1;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel4().add(getActionIgnore(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 2;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel4().add(getActionRetry(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 3;
                gridbagconstraints3.anchor = 11;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel4().add(getActionForward(), gridbagconstraints3);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel4;
    }

    private JPanel getJPanel5()
    {
        if(ivjJPanel5 == null)
            try
            {
                ivjJPanel5 = new JPanel();
                ivjJPanel5.setName("JPanel5");
                ivjJPanel5.setBorder(BorderFactory.createEtchedBorder());
                ivjJPanel5.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel5().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.anchor = 18;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 0);
                getJPanel5().add(getFWDQNamed(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.gridwidth = 2;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.anchor = 18;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel5().add(getFWDQDestQ(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.gridwidth = 2;
                gridbagconstraints3.anchor = 18;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel5().add(getFWDQReplyQ(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 2;
                gridbagconstraints4.gridy = 0;
                gridbagconstraints4.fill = 2;
                gridbagconstraints4.anchor = 18;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 0, 4, 4);
                getJPanel5().add(getFWDQNamedText(), gridbagconstraints4);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel5;
    }

    private JPanel getJPanel6()
    {
        if(ivjJPanel6 == null)
            try
            {
                ivjJPanel6 = new JPanel();
                ivjJPanel6.setName("JPanel6");
                ivjJPanel6.setBorder(BorderFactory.createEtchedBorder());
                ivjJPanel6.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel6().add(getJLabel2(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 0);
                getJPanel6().add(getFWDQMNamed(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.gridwidth = 2;
                gridbagconstraints2.fill = 2;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel6().add(getFWDQMDestQM(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 1;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.gridwidth = 2;
                gridbagconstraints3.fill = 2;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel6().add(getFWDQMReplyQM(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 1;
                gridbagconstraints4.gridy = 3;
                gridbagconstraints4.gridwidth = 2;
                gridbagconstraints4.fill = 2;
                gridbagconstraints4.anchor = 11;
                gridbagconstraints4.weighty = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel6().add(getFWDQMLocalQM(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 2;
                gridbagconstraints5.gridy = 0;
                gridbagconstraints5.fill = 2;
                gridbagconstraints5.weightx = 1.0D;
                gridbagconstraints5.insets = new Insets(4, 0, 4, 4);
                getJPanel6().add(getFWDQMNamedText(), gridbagconstraints5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel6;
    }

    private JPanel getJPanel7()
    {
        if(ivjJPanel7 == null)
            try
            {
                ivjJPanel7 = new JPanel();
                ivjJPanel7.setName("JPanel7");
                ivjJPanel7.setBorder(BorderFactory.createTitledBorder("Actions"));
                ivjJPanel7.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel7().add(getJPanel4(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel7().add(getJPanel5(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 2;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel7().add(getJPanel6(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 1;
                gridbagconstraints3.gridwidth = 3;
                gridbagconstraints3.fill = 1;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel7().add(getJPanel8(), gridbagconstraints3);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel7;
    }

    private JPanel getJPanel8()
    {
        if(ivjJPanel8 == null)
            try
            {
                ivjJPanel8 = new JPanel();
                ivjJPanel8.setName("JPanel8");
                ivjJPanel8.setBorder(BorderFactory.createEtchedBorder());
                ivjJPanel8.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel8().add(getJLabel3(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel8().add(getHeaderYes(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel8().add(getHeaderNo(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 2;
                gridbagconstraints3.anchor = 17;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel8().add(getJLabel4(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 1;
                gridbagconstraints4.gridy = 2;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel8().add(getPutAutDef(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 1;
                gridbagconstraints5.gridy = 3;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel8().add(getPutAutCtx(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 4;
                gridbagconstraints6.anchor = 18;
                gridbagconstraints6.insets = new Insets(4, 4, 4, 4);
                getJPanel8().add(getJLabel5(), gridbagconstraints6);
                GridBagConstraints gridbagconstraints7 = new GridBagConstraints();
                gridbagconstraints7.gridx = 1;
                gridbagconstraints7.gridy = 4;
                gridbagconstraints7.fill = 2;
                gridbagconstraints7.anchor = 18;
                gridbagconstraints7.weighty = 1.0D;
                gridbagconstraints7.insets = new Insets(4, 4, 4, 4);
                getJPanel8().add(getRetryCount(), gridbagconstraints7);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel8;
    }

    private JPanel getJPanel9()
    {
        if(ivjJPanel9 == null)
            try
            {
                ivjJPanel9 = new JPanel();
                ivjJPanel9.setName("JPanel9");
                ivjJPanel9.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel9().add(getJLabel19(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 1;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 2;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel9().add(getDescription(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel9;
    }

    private JTextField getJTextField10()
    {
        if(ivjJTextField10 == null)
            try
            {
                ivjJTextField10 = new JTextField();
                ivjJTextField10.setName("JTextField10");
                ivjJTextField10.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField10;
    }

    private JTextField getJTextField11()
    {
        if(ivjJTextField11 == null)
            try
            {
                ivjJTextField11 = new JTextField();
                ivjJTextField11.setName("JTextField11");
                ivjJTextField11.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField11;
    }

    private JTextField getJTextField13()
    {
        if(ivjJTextField13 == null)
            try
            {
                ivjJTextField13 = new JTextField();
                ivjJTextField13.setName("JTextField13");
                ivjJTextField13.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField13;
    }

    private JTextField getJTextField14()
    {
        if(ivjJTextField14 == null)
            try
            {
                ivjJTextField14 = new JTextField();
                ivjJTextField14.setName("JTextField14");
                ivjJTextField14.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField14;
    }

    private JTextField getJTextField15()
    {
        if(ivjJTextField15 == null)
            try
            {
                ivjJTextField15 = new JTextField();
                ivjJTextField15.setName("JTextField15");
                ivjJTextField15.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField15;
    }

    private JTextField getJTextField3()
    {
        if(ivjJTextField3 == null)
            try
            {
                ivjJTextField3 = new JTextField();
                ivjJTextField3.setName("JTextField3");
                ivjJTextField3.setText("*");
                ivjJTextField3.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField3;
    }

    private JTextField getJTextField4()
    {
        if(ivjJTextField4 == null)
            try
            {
                ivjJTextField4 = new JTextField();
                ivjJTextField4.setName("JTextField4");
                ivjJTextField4.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField4;
    }

    private JTextField getJTextField5()
    {
        if(ivjJTextField5 == null)
            try
            {
                ivjJTextField5 = new JTextField();
                ivjJTextField5.setName("JTextField5");
                ivjJTextField5.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField5;
    }

    private JTextField getJTextField6()
    {
        if(ivjJTextField6 == null)
            try
            {
                ivjJTextField6 = new JTextField();
                ivjJTextField6.setName("JTextField6");
                ivjJTextField6.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField6;
    }

    private JTextField getJTextField7()
    {
        if(ivjJTextField7 == null)
            try
            {
                ivjJTextField7 = new JTextField();
                ivjJTextField7.setName("JTextField7");
                ivjJTextField7.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField7;
    }

    private JTextField getJTextField8()
    {
        if(ivjJTextField8 == null)
            try
            {
                ivjJTextField8 = new JTextField();
                ivjJTextField8.setName("JTextField8");
                ivjJTextField8.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField8;
    }

    private JTextField getJTextField9()
    {
        if(ivjJTextField9 == null)
            try
            {
                ivjJTextField9 = new JTextField();
                ivjJTextField9.setName("JTextField9");
                ivjJTextField9.setText("*");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJTextField9;
    }

    private ButtonGroup getPutAutButtonGroup()
    {
        if(ivjPutAutButtonGroup == null)
            try
            {
                ivjPutAutButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutAutButtonGroup;
    }

    private JRadioButton getPutAutCtx()
    {
        if(ivjPutAutCtx == null)
            try
            {
                ivjPutAutCtx = new JRadioButton();
                ivjPutAutCtx.setName("PutAutCtx");
                ivjPutAutCtx.setText("Ctx");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutAutCtx;
    }

    private JRadioButton getPutAutDef()
    {
        if(ivjPutAutDef == null)
            try
            {
                ivjPutAutDef = new JRadioButton();
                ivjPutAutDef.setName("PutAutDef");
                ivjPutAutDef.setSelected(true);
                ivjPutAutDef.setText("Def");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPutAutDef;
    }

    private JComboBox getReason()
    {
        if(ivjReason == null)
            try
            {
                ivjReason = new JComboBox();
                ivjReason.setName("Reason");
                HookedListEntry ahookedlistentry[] = ClassUtils.getMatchingFields(com.ibm.mq.MQException.class, "MQRC_");
                DefaultComboBoxModel defaultcomboboxmodel = new DefaultComboBoxModel();
                defaultcomboboxmodel.addElement(new HookedListEntry("<ANY>", new Integer(-1)));
                for(int i = 0; i < ahookedlistentry.length; i++)
                    defaultcomboboxmodel.addElement(ahookedlistentry[i]);

                ivjReason.setModel(defaultcomboboxmodel);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjReason;
    }

    private NumericTextField getRetryCount()
    {
        if(ivjRetryCount == null)
            try
            {
                ivjRetryCount = new NumericTextField();
                ivjRetryCount.setName("RetryCount");
                ivjRetryCount.setText("1");
                ivjRetryCount.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjRetryCount;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getFWDQNamed().addItemListener(ivjEventHandler);
        getFooter2().addFooterListener(ivjEventHandler);
        getFWDQMNamed().addItemListener(ivjEventHandler);
        getActionForward().addItemListener(ivjEventHandler);
        getActionRetry().addItemListener(ivjEventHandler);
        getActionForward().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("X");
            setDefaultCloseOperation(2);
            setTitle("DLQ Processing Rule");
            setSize(860, 542);
            setModal(true);
            setResizable(false);
            setContentPane(getJDialogContentPane1());
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
            DLQRuleDlg dlqruledlg = new DLQRuleDlg();
            dlqruledlg.setModal(true);
            dlqruledlg.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            dlqruledlg.show();
            Insets insets = dlqruledlg.getInsets();
            dlqruledlg.setSize(dlqruledlg.getWidth() + insets.left + insets.right, dlqruledlg.getHeight() + insets.top + insets.bottom);
            dlqruledlg.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void ok()
    {
        hide();
    }

    public void setDLQRule(DLQRule dlqrule)
    {
        getDescription().setText(dlqrule.getDescription());
        HookedListEntry.setComboListByValue(new Integer(dlqrule.getReason()), getReason().getModel());
    }

    private Footer ivjFooter2;
    private JPanel ivjJDialogContentPane1;
    private JLabel ivjJLabel1;
    private JLabel ivjJLabel10;
    private JLabel ivjJLabel11;
    private JLabel ivjJLabel12;
    private JLabel ivjJLabel13;
    private JLabel ivjJLabel14;
    private JLabel ivjJLabel15;
    private JLabel ivjJLabel16;
    private JLabel ivjJLabel17;
    private JLabel ivjJLabel18;
    private JLabel ivjJLabel2;
    private JLabel ivjJLabel3;
    private JLabel ivjJLabel4;
    private JLabel ivjJLabel5;
    private JLabel ivjJLabel6;
    private JLabel ivjJLabel7;
    private JLabel ivjJLabel8;
    private JLabel ivjJLabel9;
    private JPanel ivjJPanel2;
    private JPanel ivjJPanel3;
    private JPanel ivjJPanel4;
    private JPanel ivjJPanel5;
    private JPanel ivjJPanel6;
    private JPanel ivjJPanel7;
    private JPanel ivjJPanel8;
    private JTextField ivjJTextField10;
    private JTextField ivjJTextField11;
    private JTextField ivjJTextField13;
    private JTextField ivjJTextField14;
    private JTextField ivjJTextField15;
    private JTextField ivjJTextField3;
    private JTextField ivjJTextField4;
    private JTextField ivjJTextField5;
    private JTextField ivjJTextField6;
    private JTextField ivjJTextField7;
    private JTextField ivjJTextField8;
    private JTextField ivjJTextField9;
    private NumericTextField ivjRetryCount;
    private JRadioButton ivjActionDiscard;
    private JRadioButton ivjActionForward;
    private JRadioButton ivjActionIgnore;
    private JRadioButton ivjActionRetry;
    private ButtonGroup ivjActionButtonGroup;
    private ButtonGroup ivjFWDQButtonGroup;
    private ButtonGroup ivjFWDQMButtonGroup;
    private JRadioButton ivjFWDQDestQ;
    private JRadioButton ivjFWDQNamed;
    private JRadioButton ivjFWDQReplyQ;
    private JTextField ivjFWDQNamedText;
    IvjEventHandler ivjEventHandler;
    private JRadioButton ivjFWDQMDestQM;
    private JRadioButton ivjFWDQMLocalQM;
    private JRadioButton ivjFWDQMNamed;
    private JRadioButton ivjFWDQMReplyQM;
    private ButtonGroup ivjHeaderButtonGroup;
    private ButtonGroup ivjPutAutButtonGroup;
    private JTextField ivjFWDQMNamedText;
    private JRadioButton ivjHeaderNo;
    private JRadioButton ivjHeaderYes;
    private JRadioButton ivjPutAutCtx;
    private JRadioButton ivjPutAutDef;
    private JPanel ivjJPanel1;
    private JTextField ivjDescription;
    private JLabel ivjJLabel19;
    private JPanel ivjJPanel9;
    private JComboBox ivjReason;













}
