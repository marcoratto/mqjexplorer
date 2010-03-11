// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TextFieldEnabler.java

package com.kolban.swing;

import javax.swing.JComponent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextFieldEnabler
    implements DocumentListener
{

    public TextFieldEnabler(JComponent jcomponent)
    {
        enabledComponent = jcomponent;
    }

    public void changedUpdate(DocumentEvent documentevent)
    {
    }

    public void insertUpdate(DocumentEvent documentevent)
    {
        enabledComponent.setEnabled(documentevent.getDocument().getLength() > 0);
    }

    public void removeUpdate(DocumentEvent documentevent)
    {
        enabledComponent.setEnabled(documentevent.getDocument().getLength() > 0);
    }

    private JComponent enabledComponent;
}
