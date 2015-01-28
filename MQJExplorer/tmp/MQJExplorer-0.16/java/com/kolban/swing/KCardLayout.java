// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KCardLayout.java

package com.kolban.swing;

import java.awt.*;
import java.util.Vector;
import javax.swing.JButton;

public class KCardLayout extends CardLayout
{

    public KCardLayout()
    {
        nextButton = null;
        previousButton = null;
        ids = new Vector();
        current = 0;
    }

    public KCardLayout(int i, int j)
    {
        super(i, j);
        nextButton = null;
        previousButton = null;
        ids = new Vector();
        current = 0;
    }

    public void addLayoutComponent(Component component, Object obj)
    {
        super.addLayoutComponent(component, obj);
        ids.addElement(obj);
    }

    public String getCurrentCardName()
    {
        return (String)ids.elementAt(current);
    }

    private JButton getNextButton()
    {
        return nextButton;
    }

    private JButton getPreviousButton()
    {
        return previousButton;
    }

    public void next(Container container)
    {
        super.next(container);
        current++;
        setButtonsFromCard();
    }

    public void previous(Container container)
    {
        super.previous(container);
        current--;
        setButtonsFromCard();
    }

    private void setButtonsFromCard()
    {
        if(previousButton != null)
            if(current == 0)
                previousButton.setEnabled(false);
            else
                previousButton.setEnabled(true);
        if(nextButton != null)
            if(current == ids.size() - 1)
                nextButton.setEnabled(false);
            else
                nextButton.setEnabled(true);
    }

    public void setNextButton(JButton jbutton)
    {
        nextButton = jbutton;
        setButtonsFromCard();
    }

    public void setPreviousButton(JButton jbutton)
    {
        previousButton = jbutton;
        setButtonsFromCard();
    }

    public void show(Container container, String s)
    {
        super.show(container, s);
        int i = ids.indexOf(s);
        if(i < 0)
        {
            return;
        } else
        {
            current = i;
            setButtonsFromCard();
            return;
        }
    }

    private JButton nextButton;
    private JButton previousButton;
    private Vector ids;
    private int current;
}
