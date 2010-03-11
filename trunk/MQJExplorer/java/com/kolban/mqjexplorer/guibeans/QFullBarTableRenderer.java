// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QFullBarTableRenderer.java

package com.kolban.mqjexplorer.guibeans;

import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

// Referenced classes of package com.kolban.mqjexplorer.guibeans:
//            QFullBar

public class QFullBarTableRenderer extends JComponent
    implements TableCellRenderer
{

    public QFullBarTableRenderer()
    {
        qdepth = 1;
        maxQDepth = 1;
        if(font == null)
            font = new Font("Courier", 0, 10);
    }

    public int getMaxQDepth()
    {
        return maxQDepth;
    }

    public int getQdepth()
    {
        return qdepth;
    }

    public Component getTableCellRendererComponent(JTable jtable, Object obj, boolean flag, boolean flag1, int i, int j)
    {
        if(obj == null)
            return null;
        if(flag)
            setBackground(jtable.getSelectionBackground());
        else
            setBackground(jtable.getBackground());
        setOpaque(true);
        if(obj instanceof QFullBar)
        {
            QFullBar qfullbar = (QFullBar)obj;
            qdepth = qfullbar.qDepth;
            maxQDepth = qfullbar.maxQDepth;
        } else
        {
            maxQDepth = 0;
        }
        return this;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Dimension dimension = getSize();
        g.setColor(getBackground());
        g.fillRect(0, 0, dimension.width, dimension.height);
        g.setFont(font);
        if(maxQDepth == 0)
            return;
        float f = (float)qdepth / (float)maxQDepth;
        if(qdepth > 0)
        {
            int i = (int)((float)(dimension.width - 1) * f);
            int j = dimension.height - 1;
            g.setColor(Color.darkGray);
            g.drawRect(0, 0, i, j);
            if((double)f < 0.5D)
                g.setColor(Color.green);
            else
            if((double)f < 0.75D)
                g.setColor(Color.yellow);
            else
                g.setColor(Color.red);
            g.fillRect(1, 1, i - 1, j - 1);
        }
        g.setColor(Color.black);
        g.drawString(Integer.toString((int)(f * 100F)) + "%", 3, 11);
    }

    public void setMaxQDepth(int i)
    {
        maxQDepth = i;
    }

    public void setQdepth(int i)
    {
        qdepth = i;
    }

    private int qdepth;
    private int maxQDepth;
    private static Font font = null;

}
