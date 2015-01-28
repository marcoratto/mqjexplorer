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
package com.kolban.mqjexplorer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash extends JWindow
    implements ActionListener
{

    public Splash()
    {
        imageIcon = new ImageIcon(this.getClass().getResource("/icons/splash.gif"));
        init();
    }

    public Splash(Frame frame)
    {
        super(frame);
        imageIcon = new ImageIcon(this.getClass().getResource("/icons/splash.gif"));
        init();
    }

    public Splash(Window window)
    {
        super(window);
        imageIcon = new ImageIcon(this.getClass().getResource("/icons/splash.gif"));
        init();
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        close();
    }

    private void close()
    {
        if(timer != null)
            timer.stop();
        dispose();
    }

    private void init()
    {
        setSize(322, 242);
        Dimension dimension = getToolkit().getScreenSize();
        setLocation(dimension.width / 2 - getWidth() / 2, dimension.height / 2 - getHeight() / 2);
        timer = new Timer(1000, this);
        timer.setRepeats(false);
        timer.start();
        JPanel jpanel = new JPanel() {

            public void paintComponent(Graphics g)
            {
                java.awt.Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, this);
            }

        }
;
        jpanel.setBorder(BorderFactory.createRaisedBevelBorder());
        setContentPane(jpanel);
        toFront();
        requestFocus();
        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent mouseevent)
            {
                close();
            }

        }
);
        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent keyevent)
            {
                if(keyevent.getKeyCode() == 27)
                    close();
            }

        }
);
    }

    private final ImageIcon imageIcon;
    private Timer timer;


}
