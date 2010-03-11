// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQJExplorerView.java

package com.kolban.mqjexplorer;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;

// Referenced classes of package com.kolban.mqjexplorer:
//            Profile

public interface MQJExplorerView
{

    public abstract void actionPerformed(ActionEvent actionevent);

    public abstract void addToolBarButtons(JToolBar jtoolbar, Dimension dimension);

    public abstract void refresh();

    public abstract void showHideColumns();

    public abstract void setProfile(Profile profile);

    public abstract void setModel(Object obj);
}
