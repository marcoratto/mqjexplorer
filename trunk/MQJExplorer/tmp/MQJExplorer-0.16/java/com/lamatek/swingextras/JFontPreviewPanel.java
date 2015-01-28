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

import java.awt.*;
import java.awt.font.FontRenderContext;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class JFontPreviewPanel extends JPanel
{

    public JFontPreviewPanel(Font font1)
    {
        setFont(font1);
        setBorder(new TitledBorder(new EtchedBorder(1), "Preview"));
    }

    public void setFont(Font font1)
    {
        font = font1;
        repaint();
    }

    public void update(Graphics g)
    {
        paintComponent(g);
        paintBorder(g);
    }

    public void paintComponent(Graphics g)
    {
        Image image = createImage(getSize().width, getSize().height);
        Graphics g1 = image.getGraphics();
        g1.setFont(font);
        java.awt.geom.Rectangle2D rectangle2d = font.getStringBounds(font.getFontName(), 0, font.getFontName().length(), new FontRenderContext(null, true, false));
        int i = (new Double(rectangle2d.getWidth())).intValue();
        int j = (new Double(rectangle2d.getHeight())).intValue();
        g1.drawString(font.getFontName(), 5, (getSize().height - j) / 2 + j);
        g.drawImage(image, 0, 0, this);
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(getSize().width, 75);
    }

    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }

    private Font font;
}
