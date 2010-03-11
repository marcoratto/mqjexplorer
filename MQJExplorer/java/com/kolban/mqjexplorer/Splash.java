// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Splash.java

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
        timer = new Timer(10000, this);
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
