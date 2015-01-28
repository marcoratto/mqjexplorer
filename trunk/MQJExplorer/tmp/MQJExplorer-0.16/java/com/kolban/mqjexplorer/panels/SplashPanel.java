// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SplashPanel.java

package com.kolban.mqjexplorer.panels;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class SplashPanel extends JPanel
{

    public SplashPanel()
    {
        imageIcon = new ImageIcon(getClass().getResource("/icons/splashes/splash3.jpg"));
        initialize();
    }

    public SplashPanel(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        imageIcon = new ImageIcon(getClass().getResource("/icons/splashes/splash3.jpg"));
    }

    public SplashPanel(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        imageIcon = new ImageIcon(getClass().getResource("/icons/splashes/splash3.jpg"));
    }

    public SplashPanel(boolean flag)
    {
        super(flag);
        imageIcon = new ImageIcon(getClass().getResource("/icons/splashes/splash3.jpg"));
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("SplashPanel");
            setPreferredSize(new Dimension(360, 241));
            setLayout(null);
            setSize(320, 240);
            setMinimumSize(new Dimension(360, 241));
            setMaximumSize(new Dimension(360, 241));
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
            SplashPanel splashpanel = new SplashPanel();
            jframe.setContentPane(splashpanel);
            jframe.setSize(splashpanel.getSize());
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

    public void paintComponent(Graphics g)
    {
        java.awt.Image image = imageIcon.getImage();
        g.drawImage(image, 0, 0, this);
    }

    private final ImageIcon imageIcon;
}
