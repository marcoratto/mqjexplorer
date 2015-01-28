// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegistrationOptions.java

package com.kolban.mqjexplorer.pubsub;

import com.kolban.mq.MQRFH;
import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer.pubsub:
//            RegistrationOptionsListenerEventMulticaster, RegistrationOptionsListener

public class RegistrationOptions extends JPanel
{
    class IvjEventHandler
        implements ItemListener
    {

        public void itemStateChanged(ItemEvent itemevent)
        {
            if(itemevent.getSource() == getCorrelAsId())
                connEtoC1(itemevent);
        }

        IvjEventHandler()
        {
        }
    }


    public RegistrationOptions()
    {
        ivjAnon = null;
        ivjCorrelAsId = null;
        ivjInclStreamName = null;
        ivjInformIfRet = null;
        ivjLocal = null;
        ivjNewPubsOnly = null;
        ivjPubOnReqOnly = null;
        ivjRegistrationOptionsGridLayout = null;
        fieldRegistrationOptionsListenerEventMulticaster = null;
        ivjEventHandler = new IvjEventHandler();
        initialize();
    }

    public RegistrationOptions(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjAnon = null;
        ivjCorrelAsId = null;
        ivjInclStreamName = null;
        ivjInformIfRet = null;
        ivjLocal = null;
        ivjNewPubsOnly = null;
        ivjPubOnReqOnly = null;
        ivjRegistrationOptionsGridLayout = null;
        fieldRegistrationOptionsListenerEventMulticaster = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public RegistrationOptions(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjAnon = null;
        ivjCorrelAsId = null;
        ivjInclStreamName = null;
        ivjInformIfRet = null;
        ivjLocal = null;
        ivjNewPubsOnly = null;
        ivjPubOnReqOnly = null;
        ivjRegistrationOptionsGridLayout = null;
        fieldRegistrationOptionsListenerEventMulticaster = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public RegistrationOptions(boolean flag)
    {
        super(flag);
        ivjAnon = null;
        ivjCorrelAsId = null;
        ivjInclStreamName = null;
        ivjInformIfRet = null;
        ivjLocal = null;
        ivjNewPubsOnly = null;
        ivjPubOnReqOnly = null;
        ivjRegistrationOptionsGridLayout = null;
        fieldRegistrationOptionsListenerEventMulticaster = null;
        ivjEventHandler = new IvjEventHandler();
    }

    public void addRegistrationOptionsListener(RegistrationOptionsListener registrationoptionslistener)
    {
        fieldRegistrationOptionsListenerEventMulticaster = RegistrationOptionsListenerEventMulticaster.add(fieldRegistrationOptionsListenerEventMulticaster, registrationoptionslistener);
    }

    private void connEtoC1(ItemEvent itemevent)
    {
        try
        {
            fireCorrelAsIdItem_itemStateChanged(new EventObject(this));
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    protected void fireCorrelAsIdItem_itemStateChanged(EventObject eventobject)
    {
        if(fieldRegistrationOptionsListenerEventMulticaster == null)
        {
            return;
        } else
        {
            fieldRegistrationOptionsListenerEventMulticaster.correlAsIdItem_itemStateChanged(eventobject);
            return;
        }
    }

    private JCheckBox getAnon()
    {
        if(ivjAnon == null)
            try
            {
                ivjAnon = new JCheckBox();
                ivjAnon.setName("Anon");
                ivjAnon.setText("Anon");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjAnon;
    }

    private JCheckBox getCorrelAsId()
    {
        if(ivjCorrelAsId == null)
            try
            {
                ivjCorrelAsId = new JCheckBox();
                ivjCorrelAsId.setName("CorrelAsId");
                ivjCorrelAsId.setText("CorrelAsId");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjCorrelAsId;
    }

    public boolean getCorrelAsIdSelected()
    {
        return getCorrelAsId().isSelected();
    }

    private JCheckBox getInclStreamName()
    {
        if(ivjInclStreamName == null)
            try
            {
                ivjInclStreamName = new JCheckBox();
                ivjInclStreamName.setName("InclStreamName");
                ivjInclStreamName.setText("InclStreamName");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInclStreamName;
    }

    private JCheckBox getInformIfRet()
    {
        if(ivjInformIfRet == null)
            try
            {
                ivjInformIfRet = new JCheckBox();
                ivjInformIfRet.setName("InformIfRet");
                ivjInformIfRet.setText("InformIfRet");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjInformIfRet;
    }

    private JCheckBox getLocal()
    {
        if(ivjLocal == null)
            try
            {
                ivjLocal = new JCheckBox();
                ivjLocal.setName("Local");
                ivjLocal.setText("Local");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLocal;
    }

    private JCheckBox getNewPubsOnly()
    {
        if(ivjNewPubsOnly == null)
            try
            {
                ivjNewPubsOnly = new JCheckBox();
                ivjNewPubsOnly.setName("NewPubsOnly");
                ivjNewPubsOnly.setText("NewPubsOnly");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjNewPubsOnly;
    }

    private JCheckBox getPubOnReqOnly()
    {
        if(ivjPubOnReqOnly == null)
            try
            {
                ivjPubOnReqOnly = new JCheckBox();
                ivjPubOnReqOnly.setName("PubOnReqOnly");
                ivjPubOnReqOnly.setText("PubOnReqOnly");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjPubOnReqOnly;
    }

    private GridLayout getRegistrationOptionsGridLayout()
    {
        GridLayout gridlayout = null;
        try
        {
            gridlayout = new GridLayout(0, 2);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return gridlayout;
    }

    public void getRegOpts(MQRFH mqrfh)
    {
        if(getAnon().isSelected())
            mqrfh.addNameValue("MQPSRegOpts", "Anon");
        if(getLocal().isSelected())
            mqrfh.addNameValue("MQPSRegOpts", "Local");
        if(getNewPubsOnly().isSelected())
            mqrfh.addNameValue("MQPSRegOpts", "NewPubsOnly");
        if(getPubOnReqOnly().isSelected())
            mqrfh.addNameValue("MQPSRegOpts", "PubOnReqOnly");
        if(getCorrelAsId().isSelected())
            mqrfh.addNameValue("MQPSRegOpts", "CorrelAsId");
        if(getInclStreamName().isSelected())
            mqrfh.addNameValue("MQPSRegOpts", "InclStreamName");
        if(getInformIfRet().isSelected())
            mqrfh.addNameValue("MQPSRegOpts", "InformIfRet");
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getCorrelAsId().addItemListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("RegistrationOptions");
            setLayout(getRegistrationOptionsGridLayout());
            setSize(312, 312);
            setMaximumSize(new Dimension(240, 88));
            add(getAnon(), getAnon().getName());
            add(getLocal(), getLocal().getName());
            add(getNewPubsOnly(), getNewPubsOnly().getName());
            add(getPubOnReqOnly(), getPubOnReqOnly().getName());
            add(getCorrelAsId(), getCorrelAsId().getName());
            add(getInclStreamName(), getInclStreamName().getName());
            add(getInformIfRet(), getInformIfRet().getName());
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
            RegistrationOptions registrationoptions = new RegistrationOptions();
            jframe.setContentPane(registrationoptions);
            jframe.setSize(registrationoptions.getSize());
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

    public void removeRegistrationOptionsListener(RegistrationOptionsListener registrationoptionslistener)
    {
        fieldRegistrationOptionsListenerEventMulticaster = RegistrationOptionsListenerEventMulticaster.remove(fieldRegistrationOptionsListenerEventMulticaster, registrationoptionslistener);
    }

    public void setCorrelAsIdSelected(boolean flag)
    {
        getCorrelAsId().setSelected(flag);
    }

    private JCheckBox ivjAnon;
    private JCheckBox ivjCorrelAsId;
    private JCheckBox ivjInclStreamName;
    private JCheckBox ivjInformIfRet;
    private JCheckBox ivjLocal;
    private JCheckBox ivjNewPubsOnly;
    private JCheckBox ivjPubOnReqOnly;
    private GridLayout ivjRegistrationOptionsGridLayout;
    protected transient RegistrationOptionsListener fieldRegistrationOptionsListenerEventMulticaster;
    IvjEventHandler ivjEventHandler;


}
