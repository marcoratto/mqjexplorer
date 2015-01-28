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
