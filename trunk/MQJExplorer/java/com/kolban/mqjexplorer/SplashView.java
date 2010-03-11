// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SplashView.java

package com.kolban.mqjexplorer;

import com.kolban.mqjexplorer.panels.SplashPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Referenced classes of package com.kolban.mqjexplorer:
//            MQJExplorerView, Profile

public class SplashView extends JPanel
    implements MQJExplorerView
{

    public SplashView()
    {
        ivjSplashP = null;
        initialize();
    }

    public SplashView(LayoutManager layoutmanager)
    {
        super(layoutmanager);
        ivjSplashP = null;
    }

    public SplashView(LayoutManager layoutmanager, boolean flag)
    {
        super(layoutmanager, flag);
        ivjSplashP = null;
    }

    public SplashView(boolean flag)
    {
        super(flag);
        ivjSplashP = null;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
    }

    public void addToolBarButtons(JToolBar jtoolbar, Dimension dimension)
    {
    }

    private SplashPanel getSplashP()
    {
        if(ivjSplashP == null)
            try
            {
                ivjSplashP = new SplashPanel();
                ivjSplashP.setName("SplashP");
                ivjSplashP.setMaximumSize(new Dimension(360, 241));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjSplashP;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initialize()
    {
        try
        {
            setName("SplashView");
            setLayout(new GridBagLayout());
            setBackground(Color.white);
            setSize(599, 461);
            GridBagConstraints gridbagconstraints = new GridBagConstraints();
            gridbagconstraints.gridx = 0;
            gridbagconstraints.gridy = 0;
            gridbagconstraints.weightx = 1.0D;
            gridbagconstraints.weighty = 1.0D;
            add(getSplashP(), gridbagconstraints);
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
            SplashView splashview = new SplashView();
            jframe.setContentPane(splashview);
            jframe.setSize(splashview.getSize());
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

    public void refresh()
    {
    }

    public void setModel(Object obj)
    {
    }

    public void setProfile(Profile profile)
    {
    }

    public void showHideColumns()
    {
    }

    private SplashPanel ivjSplashP;
}
