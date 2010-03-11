// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TextIconRenderer.java

package com.kolban.mqjexplorer;

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;

// Referenced classes of package com.kolban.mqjexplorer:
//            TextIcon

public class TextIconRenderer extends JLabel
    implements TableCellRenderer
{

    public TextIconRenderer()
    {
    }

    public Component getTableCellRendererComponent(JTable jtable, Object obj, boolean flag, boolean flag1, int i, int j)
    {
        if(flag)
        {
            setBackground(jtable.getSelectionBackground());
            setForeground(jtable.getSelectionForeground());
        } else
        {
            setBackground(jtable.getBackground());
            setForeground(jtable.getForeground());
        }
        setOpaque(true);
        if(obj instanceof TextIcon)
        {
            setFont(jtable.getFont());
            TextIcon texticon = (TextIcon)obj;
            javax.swing.Icon icon = texticon.getIcon();
            if(icon != null)
                setIcon(texticon.getIcon());
            setText(texticon.getText());
        }
        return this;
    }
}
