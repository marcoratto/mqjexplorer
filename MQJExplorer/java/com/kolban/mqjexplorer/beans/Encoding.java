// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Encoding.java

package com.kolban.mqjexplorer.beans;

import com.kolban.swing.NumericTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Encoding extends JPanel
{
    class IvjEventHandler
        implements ActionListener, MouseListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getIntegerUndefined())
                connEtoC3(actionevent);
            if(actionevent.getSource() == getIntegerNormal())
                connEtoC4(actionevent);
            if(actionevent.getSource() == getIntegerReversed())
                connEtoC5(actionevent);
            if(actionevent.getSource() == getDecimalUndefined())
                connEtoC6(actionevent);
            if(actionevent.getSource() == getDecimalNormal())
                connEtoC7(actionevent);
            if(actionevent.getSource() == getDecimalReversed())
                connEtoC8(actionevent);
            if(actionevent.getSource() == getFloatUndefined())
                connEtoC9(actionevent);
            if(actionevent.getSource() == getFloatNormal())
                connEtoC10(actionevent);
            if(actionevent.getSource() == getFloatReversed())
                connEtoC11(actionevent);
            if(actionevent.getSource() == getFloatS390())
                connEtoC12(actionevent);
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
            if(mouseevent.getSource() == getSelect())
                connEtoC1(mouseevent);
            if(mouseevent.getSource() == getValue())
                connEtoC13(mouseevent);
        }

        public void mouseReleased(MouseEvent mouseevent)
        {
            if(mouseevent.getSource() == getSelect())
                connEtoC2(mouseevent);
            if(mouseevent.getSource() == getValue())
                connEtoC14(mouseevent);
        }

        IvjEventHandler()
        {
        }
    }


    public Encoding()
    {
        ivjDecimalButtonGroup = null;
        ivjDecimalNormal = null;
        ivjDecimalReversed = null;
        ivjDecimalUndefined = null;
        ivjFloatingButtonGroup = null;
        ivjFloatNormal = null;
        ivjFloatReversed = null;
        ivjFloatS390 = null;
        ivjFloatUndefined = null;
        ivjIntegerButtonGroup = null;
        ivjIntegerNormal = null;
        ivjIntegerReversed = null;
        ivjIntegerUndefined = null;
        ivjJMenu1 = null;
        ivjJMenu2 = null;
        ivjJMenu3 = null;
        ivjSelect = null;
        ivjEventHandler = new IvjEventHandler();
        ivjSelectPopup = null;
        ivjValue = null;
        initialize();
    }

    public Encoding(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjDecimalButtonGroup = null;
        ivjDecimalNormal = null;
        ivjDecimalReversed = null;
        ivjDecimalUndefined = null;
        ivjFloatingButtonGroup = null;
        ivjFloatNormal = null;
        ivjFloatReversed = null;
        ivjFloatS390 = null;
        ivjFloatUndefined = null;
        ivjIntegerButtonGroup = null;
        ivjIntegerNormal = null;
        ivjIntegerReversed = null;
        ivjIntegerUndefined = null;
        ivjJMenu1 = null;
        ivjJMenu2 = null;
        ivjJMenu3 = null;
        ivjSelect = null;
        ivjEventHandler = new IvjEventHandler();
        ivjSelectPopup = null;
        ivjValue = null;
    }

    public Encoding(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjDecimalButtonGroup = null;
        ivjDecimalNormal = null;
        ivjDecimalReversed = null;
        ivjDecimalUndefined = null;
        ivjFloatingButtonGroup = null;
        ivjFloatNormal = null;
        ivjFloatReversed = null;
        ivjFloatS390 = null;
        ivjFloatUndefined = null;
        ivjIntegerButtonGroup = null;
        ivjIntegerNormal = null;
        ivjIntegerReversed = null;
        ivjIntegerUndefined = null;
        ivjJMenu1 = null;
        ivjJMenu2 = null;
        ivjJMenu3 = null;
        ivjSelect = null;
        ivjEventHandler = new IvjEventHandler();
        ivjSelectPopup = null;
        ivjValue = null;
    }

    public Encoding(boolean flag)
    {
        super(flag);
        ivjDecimalButtonGroup = null;
        ivjDecimalNormal = null;
        ivjDecimalReversed = null;
        ivjDecimalUndefined = null;
        ivjFloatingButtonGroup = null;
        ivjFloatNormal = null;
        ivjFloatReversed = null;
        ivjFloatS390 = null;
        ivjFloatUndefined = null;
        ivjIntegerButtonGroup = null;
        ivjIntegerNormal = null;
        ivjIntegerReversed = null;
        ivjIntegerUndefined = null;
        ivjJMenu1 = null;
        ivjJMenu2 = null;
        ivjJMenu3 = null;
        ivjSelect = null;
        ivjEventHandler = new IvjEventHandler();
        ivjSelectPopup = null;
        ivjValue = null;
    }

    private void connEtoC1(MouseEvent mouseevent)
    {
        try
        {
            select_Mouse(mouseevent);
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
            setFromMenu();
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
            setFromMenu();
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
            setFromMenu();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC13(MouseEvent mouseevent)
    {
        try
        {
            select_Mouse(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC14(MouseEvent mouseevent)
    {
        try
        {
            select_Mouse(mouseevent);
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(MouseEvent mouseevent)
    {
        try
        {
            select_Mouse(mouseevent);
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
            setFromMenu();
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
            setFromMenu();
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
            setFromMenu();
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
            setFromMenu();
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
            setFromMenu();
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
            setFromMenu();
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
            setFromMenu();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private ButtonGroup getDecimalButtonGroup()
    {
        if(ivjDecimalButtonGroup == null)
            try
            {
                ivjDecimalButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDecimalButtonGroup;
    }

    private JRadioButtonMenuItem getDecimalNormal()
    {
        if(ivjDecimalNormal == null)
            try
            {
                ivjDecimalNormal = new JRadioButtonMenuItem();
                ivjDecimalNormal.setName("DecimalNormal");
                ivjDecimalNormal.setText("Normal");
                getDecimalButtonGroup().add(ivjDecimalNormal);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDecimalNormal;
    }

    private JRadioButtonMenuItem getDecimalReversed()
    {
        if(ivjDecimalReversed == null)
            try
            {
                ivjDecimalReversed = new JRadioButtonMenuItem();
                ivjDecimalReversed.setName("DecimalReversed");
                ivjDecimalReversed.setText("Reversed");
                getDecimalButtonGroup().add(ivjDecimalReversed);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDecimalReversed;
    }

    private JRadioButtonMenuItem getDecimalUndefined()
    {
        if(ivjDecimalUndefined == null)
            try
            {
                ivjDecimalUndefined = new JRadioButtonMenuItem();
                ivjDecimalUndefined.setName("DecimalUndefined");
                ivjDecimalUndefined.setText("Undefined");
                getDecimalButtonGroup().add(ivjDecimalUndefined);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDecimalUndefined;
    }

    private ButtonGroup getFloatingButtonGroup()
    {
        if(ivjFloatingButtonGroup == null)
            try
            {
                ivjFloatingButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFloatingButtonGroup;
    }

    private JRadioButtonMenuItem getFloatNormal()
    {
        if(ivjFloatNormal == null)
            try
            {
                ivjFloatNormal = new JRadioButtonMenuItem();
                ivjFloatNormal.setName("FloatNormal");
                ivjFloatNormal.setText("Normal");
                getFloatingButtonGroup().add(ivjFloatNormal);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFloatNormal;
    }

    private JRadioButtonMenuItem getFloatReversed()
    {
        if(ivjFloatReversed == null)
            try
            {
                ivjFloatReversed = new JRadioButtonMenuItem();
                ivjFloatReversed.setName("FloatReversed");
                ivjFloatReversed.setText("Reversed");
                getFloatingButtonGroup().add(ivjFloatReversed);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFloatReversed;
    }

    private JRadioButtonMenuItem getFloatS390()
    {
        if(ivjFloatS390 == null)
            try
            {
                ivjFloatS390 = new JRadioButtonMenuItem();
                ivjFloatS390.setName("FloatS390");
                ivjFloatS390.setText("S/390");
                getFloatingButtonGroup().add(ivjFloatS390);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFloatS390;
    }

    private JRadioButtonMenuItem getFloatUndefined()
    {
        if(ivjFloatUndefined == null)
            try
            {
                ivjFloatUndefined = new JRadioButtonMenuItem();
                ivjFloatUndefined.setName("FloatUndefined");
                ivjFloatUndefined.setText("Undefined");
                getFloatingButtonGroup().add(ivjFloatUndefined);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFloatUndefined;
    }

    private ButtonGroup getIntegerButtonGroup()
    {
        if(ivjIntegerButtonGroup == null)
            try
            {
                ivjIntegerButtonGroup = new ButtonGroup();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjIntegerButtonGroup;
    }

    private JRadioButtonMenuItem getIntegerNormal()
    {
        if(ivjIntegerNormal == null)
            try
            {
                ivjIntegerNormal = new JRadioButtonMenuItem();
                ivjIntegerNormal.setName("IntegerNormal");
                ivjIntegerNormal.setText("Normal");
                getIntegerButtonGroup().add(ivjIntegerNormal);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjIntegerNormal;
    }

    private JRadioButtonMenuItem getIntegerReversed()
    {
        if(ivjIntegerReversed == null)
            try
            {
                ivjIntegerReversed = new JRadioButtonMenuItem();
                ivjIntegerReversed.setName("IntegerReversed");
                ivjIntegerReversed.setText("Reversed");
                getIntegerButtonGroup().add(ivjIntegerReversed);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjIntegerReversed;
    }

    private JRadioButtonMenuItem getIntegerUndefined()
    {
        if(ivjIntegerUndefined == null)
            try
            {
                ivjIntegerUndefined = new JRadioButtonMenuItem();
                ivjIntegerUndefined.setName("IntegerUndefined");
                ivjIntegerUndefined.setText("Undefined");
                getIntegerButtonGroup().add(ivjIntegerUndefined);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjIntegerUndefined;
    }

    public int getIntValue()
    {
        return getValue().getIntValue();
    }

    private JMenu getJMenu1()
    {
        if(ivjJMenu1 == null)
            try
            {
                ivjJMenu1 = new JMenu();
                ivjJMenu1.setName("JMenu1");
                ivjJMenu1.setText("Floating point");
                ivjJMenu1.add(getFloatUndefined());
                ivjJMenu1.add(getFloatNormal());
                ivjJMenu1.add(getFloatReversed());
                ivjJMenu1.add(getFloatS390());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenu1;
    }

    private JMenu getJMenu2()
    {
        if(ivjJMenu2 == null)
            try
            {
                ivjJMenu2 = new JMenu();
                ivjJMenu2.setName("JMenu2");
                ivjJMenu2.setText("Decimal");
                ivjJMenu2.add(getDecimalUndefined());
                ivjJMenu2.add(getDecimalNormal());
                ivjJMenu2.add(getDecimalReversed());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenu2;
    }

    private JMenu getJMenu3()
    {
        if(ivjJMenu3 == null)
            try
            {
                ivjJMenu3 = new JMenu();
                ivjJMenu3.setName("JMenu3");
                ivjJMenu3.setText("Integer");
                ivjJMenu3.add(getIntegerUndefined());
                ivjJMenu3.add(getIntegerNormal());
                ivjJMenu3.add(getIntegerReversed());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenu3;
    }

    private JLabel getSelect()
    {
        if(ivjSelect == null)
            try
            {
                ivjSelect = new JLabel();
                ivjSelect.setName("Select");
                ivjSelect.setIcon(new ImageIcon(this.getClass().getResource("/icons/mouser.gif")));
                ivjSelect.setText("");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelect;
    }

    private JPopupMenu getSelectPopup()
    {
        if(ivjSelectPopup == null)
            try
            {
                ivjSelectPopup = new JPopupMenu();
                ivjSelectPopup.setName("SelectPopup");
                ivjSelectPopup.add(getJMenu3());
                ivjSelectPopup.add(getJMenu2());
                ivjSelectPopup.add(getJMenu1());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSelectPopup;
    }

    private NumericTextField getValue()
    {
        if(ivjValue == null)
            try
            {
                ivjValue = new NumericTextField();
                ivjValue.setName("Value");
                ivjValue.setColumns(5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjValue;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getSelect().addMouseListener(ivjEventHandler);
        getIntegerUndefined().addActionListener(ivjEventHandler);
        getIntegerNormal().addActionListener(ivjEventHandler);
        getIntegerReversed().addActionListener(ivjEventHandler);
        getDecimalUndefined().addActionListener(ivjEventHandler);
        getDecimalNormal().addActionListener(ivjEventHandler);
        getDecimalReversed().addActionListener(ivjEventHandler);
        getFloatUndefined().addActionListener(ivjEventHandler);
        getFloatNormal().addActionListener(ivjEventHandler);
        getFloatReversed().addActionListener(ivjEventHandler);
        getFloatS390().addActionListener(ivjEventHandler);
        getValue().addMouseListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("Encoding");
            setLayout(new GridBagLayout());
            setSize(160, 120);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 1;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.insets = new Insets(0, 4, 0, 0);
            add(getSelect(), gridbagconstraints);
            GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
            gridbagconstraints1.gridx = 0;
            gridbagconstraints1.gridy = 0;
            gridbagconstraints1.insets = new Insets(0, 0, 0, 4);
            add(getValue(), gridbagconstraints1);
            initConnections();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        getValue().setIntValue(273);
    }

    public static void main(String args[])
    {
        try
        {
            JFrame jframe = new JFrame();
            Encoding encoding = new Encoding();
            jframe.setContentPane(encoding);
            jframe.setSize(encoding.getSize());
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

    private void select_Mouse(MouseEvent mouseevent)
    {
        if(!mouseevent.isPopupTrigger())
            return;
        switch(getValue().getIntValue() & 0xf)
        {
        case 1: // '\001'
            getIntegerNormal().setSelected(true);
            break;

        case 2: // '\002'
            getIntegerReversed().setSelected(true);
            break;

        case 0: // '\0'
            getIntegerUndefined().setSelected(true);
            break;
        }
        switch(getValue().getIntValue() & 0xf0)
        {
        case 16: // '\020'
            getDecimalNormal().setSelected(true);
            break;

        case 32: // ' '
            getDecimalReversed().setSelected(true);
            break;

        case 0: // '\0'
            getDecimalUndefined().setSelected(true);
            break;
        }
        switch(getValue().getIntValue() & 0xf00)
        {
        case 256: 
            getFloatNormal().setSelected(true);
            break;

        case 768: 
            getFloatS390().setSelected(true);
            break;

        case 0: // '\0'
            getFloatUndefined().setSelected(true);
            break;

        case 512: 
            getFloatReversed().setSelected(true);
            break;
        }
        getSelectPopup().show(mouseevent.getComponent(), mouseevent.getX(), mouseevent.getY());
    }

    private void setFromMenu()
    {
        int i = 0;
        if(getIntegerNormal().isSelected())
            i |= 1;
        if(getIntegerReversed().isSelected())
            i |= 2;
        if(getIntegerUndefined().isSelected())
            i |= 0;
        if(getDecimalNormal().isSelected())
            i |= 0x10;
        if(getDecimalReversed().isSelected())
            i |= 0x20;
        if(getDecimalUndefined().isSelected())
            i |= 0;
        if(getFloatNormal().isSelected())
            i |= 0x100;
        if(getFloatReversed().isSelected())
            i |= 0x200;
        if(getFloatS390().isSelected())
            i |= 0x300;
        if(getFloatUndefined().isSelected())
            i |= 0;
        getValue().setIntValue(i);
    }

    public void setIntValue(int i)
    {
        getValue().setIntValue(i);
    }

    private ButtonGroup ivjDecimalButtonGroup;
    private JRadioButtonMenuItem ivjDecimalNormal;
    private JRadioButtonMenuItem ivjDecimalReversed;
    private JRadioButtonMenuItem ivjDecimalUndefined;
    private ButtonGroup ivjFloatingButtonGroup;
    private JRadioButtonMenuItem ivjFloatNormal;
    private JRadioButtonMenuItem ivjFloatReversed;
    private JRadioButtonMenuItem ivjFloatS390;
    private JRadioButtonMenuItem ivjFloatUndefined;
    private ButtonGroup ivjIntegerButtonGroup;
    private JRadioButtonMenuItem ivjIntegerNormal;
    private JRadioButtonMenuItem ivjIntegerReversed;
    private JRadioButtonMenuItem ivjIntegerUndefined;
    private JMenu ivjJMenu1;
    private JMenu ivjJMenu2;
    private JMenu ivjJMenu3;
    private JLabel ivjSelect;
    IvjEventHandler ivjEventHandler;
    private JPopupMenu ivjSelectPopup;
    private NumericTextField ivjValue;


























}
