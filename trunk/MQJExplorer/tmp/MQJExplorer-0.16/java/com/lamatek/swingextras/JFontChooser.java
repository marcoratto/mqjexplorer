/*
 * Copyright (C) 2012 Marco Ratto
 *
 * This file is part of the project MQJExplorer.
 *
 * MQJExplorer is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * any later version.
 *
 * MQJExplorer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MQJExplorer; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.lamatek.swingextras;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// Referenced classes of package com.lamatek.swingextras:
//            JFontPreviewPanel

public class JFontChooser extends JComponent
    implements ActionListener, ListSelectionListener
{

    public JFontChooser(Font font1)
    {
        font = font1;
        setup();
    }

    private void setup()
    {
        setLayout(new BorderLayout());
        Font afont[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        Vector vector = new Vector(1, 1);
        Vector vector1 = new Vector(1, 1);
        for(int i = 0; i < afont.length; i++)
        {
            String s = afont[i].getFamily();
            if(!vector1.contains(s))
            {
                vector1.addElement(s);
                vector.addElement(afont[i]);
            }
        }

        availableFonts = new Font[vector.size()];
        for(int j = 0; j < vector.size(); j++)
            availableFonts[j] = (Font)vector.elementAt(j);

        fontNames = new JList(vector1);
        JScrollPane jscrollpane = new JScrollPane(fontNames);
        fontNames.addListSelectionListener(this);
        Object aobj[] = {
            "Regular", "Bold", "Italic", "BoldItalic"
        };
        fontStyles = new JList(aobj);
        JScrollPane jscrollpane1 = new JScrollPane(fontStyles);
        fontStyles.setSelectedIndex(0);
        fontStyles.addListSelectionListener(this);
        String as[] = new String[69];
        for(int k = 3; k < 72; k++)
            as[k - 3] = (new Integer(k + 1)).toString();

        fontSizes = new JList(as);
        JScrollPane jscrollpane2 = new JScrollPane(fontSizes);
        fontSizes.addListSelectionListener(this);
        currentSize = new JTextField(5);
        currentSize.setText((new Integer(font.getSize())).toString());
        currentSize.addActionListener(this);
        GridBagLayout gridbaglayout = new GridBagLayout();
        GridBagConstraints gridbagconstraints = new GridBagConstraints();
        JPanel jpanel = new JPanel(gridbaglayout);
        gridbagconstraints.gridx = 0;
        gridbagconstraints.gridy = 0;
        gridbagconstraints.insets = new Insets(2, 5, 2, 5);
        gridbagconstraints.anchor = 17;
        jpanel.add(currentSize);
        gridbaglayout.setConstraints(currentSize, gridbagconstraints);
        jpanel.add(jscrollpane2);
        gridbagconstraints.gridy++;
        gridbagconstraints.fill = 2;
        gridbaglayout.setConstraints(jscrollpane2, gridbagconstraints);
        preview = new JFontPreviewPanel(font);
        okay = new JButton("Okay");
        okay.addActionListener(this);
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        GridBagLayout gridbaglayout1 = new GridBagLayout();
        GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
        JPanel jpanel1 = new JPanel(gridbaglayout1);
        gridbagconstraints1.anchor = 17;
        gridbagconstraints1.fill = 3;
        gridbagconstraints1.insets = new Insets(2, 5, 2, 5);
        gridbagconstraints1.gridx = 0;
        gridbagconstraints1.gridy = 0;
        jpanel1.add(jscrollpane);
        gridbaglayout1.setConstraints(jscrollpane, gridbagconstraints1);
        gridbagconstraints1.gridx++;
        jpanel1.add(jscrollpane1);
        gridbaglayout1.setConstraints(jscrollpane1, gridbagconstraints1);
        gridbagconstraints1.gridx++;
        jpanel1.add(jpanel);
        gridbaglayout1.setConstraints(jpanel, gridbagconstraints1);
        add("North", jpanel1);
        add("Center", preview);
        JPanel jpanel2 = new JPanel(new FlowLayout(2));
        jpanel2.add(okay);
        jpanel2.add(cancel);
        add("South", jpanel2);
        fontSizes.setSelectedValue((new Integer(font.getSize())).toString(), true);
        fontNames.setSelectedValue(font.getFamily(), true);
        if(font.getStyle() == 0)
            fontStyles.setSelectedValue("Regular", false);
        else
        if(font.getStyle() == 2)
            fontStyles.setSelectedValue("Italic", false);
        else
        if(font.getStyle() == 1)
            fontStyles.setSelectedValue("Bold", false);
        else
        if(font.getStyle() == 3)
            fontStyles.setSelectedValue("BoldItalic", false);
    }

    private void updateFont(Font font1)
    {
        font = font1;
        preview.setFont(font);
    }

    private void updateFontSize(int i)
    {
        updateFont(font.deriveFont((new Integer(i)).floatValue()));
    }

    private void updateFontStyle(int i)
    {
        updateFont(font.deriveFont(i));
    }

    public Font getSelectedFont()
    {
        return font;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        if(actionevent.getSource() == okay)
        {
            returnValue = 2;
            if(dialog != null)
                dialog.setVisible(false);
            acceptSelection();
        }
        if(actionevent.getSource() == cancel)
        {
            returnValue = 4;
            if(dialog != null)
                dialog.setVisible(false);
            cancelSelection();
        }
        if(actionevent.getSource() == currentSize)
            fontSizes.setSelectedValue(currentSize.getText(), true);
    }

    public void valueChanged(ListSelectionEvent listselectionevent)
    {
        if(listselectionevent.getSource() == fontNames)
        {
            Font font1 = availableFonts[fontNames.getSelectedIndex()];
            font1 = new Font(font1.getFontName(), font.getStyle(), font.getSize());
            updateFont(font1);
        }
        if(listselectionevent.getSource() == fontSizes)
        {
            currentSize.setText((String)fontSizes.getSelectedValue());
            updateFontSize((new Integer(currentSize.getText())).intValue());
        }
        if(listselectionevent.getSource() == fontStyles)
        {
            byte byte0 = 0;
            String s = (String)fontStyles.getSelectedValue();
            if(s.equals("Regular"))
                byte0 = 0;
            if(s.equals("Bold"))
                byte0 = 1;
            if(s.equals("Italic"))
                byte0 = 2;
            if(s.equals("BoldItalic"))
                byte0 = 3;
            updateFontStyle(byte0);
        }
    }

    public int showDialog(Component component, String s)
    {
        returnValue = 0;
        Frame frame = (component instanceof Frame) ? (Frame)component : (Frame)SwingUtilities.getAncestorOfClass(java.awt.Frame.class, component);
        dialog = new JDialog(frame, s, true);
        dialog.getContentPane().add("Center", this);
        dialog.pack();
        dialog.setLocationRelativeTo(component);
        dialog.show();
        return returnValue;
    }

    public void acceptSelection()
    {
    }

    public void cancelSelection()
    {
    }

    private Font font;
    private JList fontNames;
    private JList fontSizes;
    private JList fontStyles;
    private JTextField currentSize;
    private JButton okay;
    private JButton cancel;
    private Font availableFonts[];
    private JFontPreviewPanel preview;
    private JDialog dialog;
    private int returnValue;
    public static final int ERROR_OPTION = 0;
    public static final int ACCEPT_OPTION = 2;
    public static final int CANCEL_OPTION = 4;
}
