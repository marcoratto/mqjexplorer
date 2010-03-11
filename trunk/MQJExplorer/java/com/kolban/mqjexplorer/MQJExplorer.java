// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MQJExplorer.java

package com.kolban.mqjexplorer;

import com.ibm.mq.*;
import com.kolban.mqjexplorer.beans.AboutDlg;
import com.kolban.mqjexplorer.beans.ShowQueueManager;
import com.kolban.mqjexplorer.codewiz.CodeWizard;
import com.kolban.mqjexplorer.codewiz.ProjectChooser;
import com.kolban.mqjexplorer.guibeans.StatusBar;
import com.kolban.mqjexplorer.jms.JMSView;
import com.kolban.mqjexplorer.pubsub.PubSubView;
import com.kolban.swing.*;
import com.kolban.utils.TeeOutStreams;
import com.kolban.wmqi.XMLEntryAssist;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.PrintStream;

import javax.swing.*;

import org.apache.log4j.Logger;

// Referenced classes of package com.kolban.mqjexplorer:
//            MQSeriesTreeListener, MQJExplorerView, QueueView, ProcessView, 
//            Help, Profile, MQSeriesTree, ChannelView, 
//            NamelistView, SplashView, Splash, QueueManagerModel

public class MQJExplorer extends JFrame
    implements MQSeriesTreeListener
{
	
	private final static Logger logger = Logger.getLogger("com.kolban.mqjexplorer");
	
    class IvjEventHandler
        implements ActionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getJMenuItem2())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getJMenuItem4())
                connEtoC3(actionevent);
            if(actionevent.getSource() == getJMenuItem3())
                connEtoM1(actionevent);
            if(actionevent.getSource() == getJMenuItem6())
                connEtoC4(actionevent);
            if(actionevent.getSource() == getJMenuItem13())
                connEtoC5(actionevent);
            if(actionevent.getSource() == getJMenuItem5())
                connEtoC6(actionevent);
            if(actionevent.getSource() == getJMenuItem10())
                connEtoC7(actionevent);
            if(actionevent.getSource() == getJMenuItem11())
                connEtoC8(actionevent);
            if(actionevent.getSource() == getDefaultToolBarButton())
                connEtoC9(actionevent);
            if(actionevent.getSource() == getJToolBarButton2())
                connEtoC10(actionevent);
            if(actionevent.getSource() == getJToolBarButton1())
                connEtoC11(actionevent);
            if(actionevent.getSource() == getJMenuItem7())
                connEtoC12(actionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public MQJExplorer()
    {
    	logger.trace("MQJExplorer.MQJExplorer():start");
    	
        queueView = null;
        processView = null;
        channelView = null;
        nameListView = null;
        splashView = null;
        cardPanel = null;
        profile = null;
        ivjFileMenu = null;
        ivjJFrameContentPane = null;
        ivjJMenu2 = null;
        ivjJMenu3 = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem10 = null;
        ivjJMenuItem11 = null;
        ivjJMenuItem13 = null;
        ivjJMenuItem2 = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjJMenuItem5 = null;
        ivjJMenuItem6 = null;
        ivjJSeparator1 = null;
        ivjJSeparator2 = null;
        ivjJSeparator3 = null;
        ivjMQJExplorerJMenuBar = null;
        ivjEventHandler = new IvjEventHandler();
        ivjConsoleLog = null;
        ivjViewMenu = null;
        ivjHelpMenuItem = null;
        ivjDefaultToolBarButton = null;
        ivjJToolBarButton1 = null;
        ivjJToolBarButton2 = null;
        ivjToolBar = null;
        ivjJMenuItem7 = null;
        initialize();
        
        logger.trace("MQJExplorer.MQJExplorer():end");
    }

    public void about()
    {
        AboutDlg aboutdlg = new AboutDlg();
        aboutdlg.pack();
        SwingUtils.setCenter(this, aboutdlg);
        aboutdlg.setVisible(true);
    }

    public void buildToolbar()
    {
        JToolBar jtoolbar = getToolBar();
        Dimension dimension = new Dimension(24, 24);
        for(int i = jtoolbar.getComponentCount() - 1; i > 3; i--)
            jtoolbar.remove(i);

        if(currentView != null)
            currentView.addToolBarButtons(jtoolbar, dimension);
        jtoolbar.updateUI();
    }

    public void codeWizard()
    {
        CodeWizard codewizard = new CodeWizard();
        codewizard.initialize();
        ProjectChooser projectchooser = new ProjectChooser();
        projectchooser.setProjectVector(codewizard.projectVector);
        SwingUtils.setCenter(this, projectchooser);
        projectchooser.show();
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            showQueueManager();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC10(ActionEvent actionevent)
    {
        try
        {
            showHideColumns();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC11(ActionEvent actionevent)
    {
        try
        {
            refresh();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC12(ActionEvent actionevent)
    {
        try
        {
            codeWizard();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(ActionEvent actionevent)
    {
        try
        {
            save();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3(ActionEvent actionevent)
    {
        try
        {
            exit();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4(ActionEvent actionevent)
    {
        try
        {
            showQueueManager();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5(ActionEvent actionevent)
    {
        try
        {
            about();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(ActionEvent actionevent)
    {
        try
        {
            showHideColumns();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC7(ActionEvent actionevent)
    {
        try
        {
            wmqiEntryAssist();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC8(ActionEvent actionevent)
    {
        try
        {
            tailFile();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC9(ActionEvent actionevent)
    {
        try
        {
            save();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoM1(ActionEvent actionevent)
    {
        try
        {
            getConsoleLog().show();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    public void disconnectQueueManager(QueueManagerModel queuemanagermodel)
    {
        queueView.setModel(null);
        processView.setModel(null);
    }

    public void exit()
    {
        System.out.println("Program ending ...");
        MQEnvironment.removeConnectionPoolToken(mqPoolToken);
        System.exit(0);
    }

    private ConsoleLog getConsoleLog()
    {
        return ivjConsoleLog;
    }

    private JButton getDefaultToolBarButton()
    {
        if(ivjDefaultToolBarButton == null)
            try
            {
                ivjDefaultToolBarButton = new JButton();
                ivjDefaultToolBarButton.setName("DefaultToolBarButton");
                ivjDefaultToolBarButton.setText("");
                ivjDefaultToolBarButton.setMaximumSize(new Dimension(24, 24));
                ivjDefaultToolBarButton.setHorizontalTextPosition(0);
                ivjDefaultToolBarButton.setVerticalTextPosition(3);
                ivjDefaultToolBarButton.setIcon(new ImageIcon(getClass().getResource("/icons/Save16.gif")));
                ivjDefaultToolBarButton.setPreferredSize(new Dimension(24, 24));
                ivjDefaultToolBarButton.setMargin(new Insets(0, 0, 0, 0));
                ivjDefaultToolBarButton.setMinimumSize(new Dimension(24, 24));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDefaultToolBarButton;
    }

    private JMenu getFileMenu()
    {
        if(ivjFileMenu == null)
            try
            {
                ivjFileMenu = new JMenu();
                ivjFileMenu.setName("FileMenu");
                ivjFileMenu.setMnemonic('F');
                ivjFileMenu.setText("File");
                ivjFileMenu.add(getJMenuItem1());
                ivjFileMenu.add(getJMenuItem2());
                ivjFileMenu.add(getJMenuItem3());
                ivjFileMenu.add(getJSeparator1());
                ivjFileMenu.add(getJMenuItem4());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileMenu;
    }

    private JMenuItem getHelpMenuItem()
    {
        if(ivjHelpMenuItem == null)
            try
            {
                ivjHelpMenuItem = new JMenuItem();
                ivjHelpMenuItem.setName("HelpMenuItem");
                ivjHelpMenuItem.setMnemonic('e');
                ivjHelpMenuItem.setText("Help...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjHelpMenuItem;
    }

    private JPanel getJFrameContentPane()
    {
        if(ivjJFrameContentPane == null)
            try
            {
                ivjJFrameContentPane = new JPanel();
                ivjJFrameContentPane.setName("JFrameContentPane");
                ivjJFrameContentPane.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJFrameContentPane;
    }

    private JMenu getJMenu2()
    {
        if(ivjJMenu2 == null)
            try
            {
                ivjJMenu2 = new JMenu();
                ivjJMenu2.setName("JMenu2");
                ivjJMenu2.setMnemonic('T');
                ivjJMenu2.setText("Tools");
                ivjJMenu2.add(getJMenuItem7());
                ivjJMenu2.add(getJMenuItem11());
                ivjJMenu2.add(getJMenuItem10());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenu2;
    }

    private JMenu getJMenu3()
    {
        if(ivjJMenu3 == null)
            try
            {
                ivjJMenu3 = new JMenu();
                ivjJMenu3.setName("JMenu3");
                ivjJMenu3.setMnemonic('H');
                ivjJMenu3.setText("Help");
                ivjJMenu3.add(getHelpMenuItem());
                ivjJMenu3.add(getJSeparator3());
                ivjJMenu3.add(getJMenuItem13());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenu3;
    }

    private JMenuItem getJMenuItem1()
    {
        if(ivjJMenuItem1 == null)
            try
            {
                ivjJMenuItem1 = new JMenuItem();
                ivjJMenuItem1.setName("JMenuItem1");
                ivjJMenuItem1.setMnemonic('M');
                ivjJMenuItem1.setText("Show Queue Manager...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem1;
    }

    private JMenuItem getJMenuItem10()
    {
        if(ivjJMenuItem10 == null)
            try
            {
                ivjJMenuItem10 = new JMenuItem();
                ivjJMenuItem10.setName("JMenuItem10");
                ivjJMenuItem10.setMnemonic('X');
                ivjJMenuItem10.setText("XML Entry Assist...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem10;
    }

    private JMenuItem getJMenuItem11()
    {
        if(ivjJMenuItem11 == null)
            try
            {
                ivjJMenuItem11 = new JMenuItem();
                ivjJMenuItem11.setName("JMenuItem11");
                ivjJMenuItem11.setMnemonic('T');
                ivjJMenuItem11.setText("Tail File...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem11;
    }

    private JMenuItem getJMenuItem13()
    {
        if(ivjJMenuItem13 == null)
            try
            {
                ivjJMenuItem13 = new JMenuItem();
                ivjJMenuItem13.setName("JMenuItem13");
                ivjJMenuItem13.setMnemonic('A');
                ivjJMenuItem13.setText("About...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem13;
    }

    private JMenuItem getJMenuItem2()
    {
        if(ivjJMenuItem2 == null)
            try
            {
                ivjJMenuItem2 = new JMenuItem();
                ivjJMenuItem2.setName("JMenuItem2");
                ivjJMenuItem2.setMnemonic('S');
                ivjJMenuItem2.setText("Save Settings");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem2;
    }

    private JMenuItem getJMenuItem3()
    {
        if(ivjJMenuItem3 == null)
            try
            {
                ivjJMenuItem3 = new JMenuItem();
                ivjJMenuItem3.setName("JMenuItem3");
                ivjJMenuItem3.setMnemonic('V');
                ivjJMenuItem3.setText("View Log");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem3;
    }

    private JMenuItem getJMenuItem4()
    {
        if(ivjJMenuItem4 == null)
            try
            {
                ivjJMenuItem4 = new JMenuItem();
                ivjJMenuItem4.setName("JMenuItem4");
                ivjJMenuItem4.setMnemonic('x');
                ivjJMenuItem4.setText("Exit");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem4;
    }

    private JMenuItem getJMenuItem5()
    {
        if(ivjJMenuItem5 == null)
            try
            {
                ivjJMenuItem5 = new JMenuItem();
                ivjJMenuItem5.setName("JMenuItem5");
                ivjJMenuItem5.setMnemonic('H');
                ivjJMenuItem5.setText("Show/Hide columns...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem5;
    }

    private JMenuItem getJMenuItem6()
    {
        if(ivjJMenuItem6 == null)
            try
            {
                ivjJMenuItem6 = new JMenuItem();
                ivjJMenuItem6.setName("JMenuItem6");
                ivjJMenuItem6.setMnemonic('M');
                ivjJMenuItem6.setText("Show Queue Manager...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem6;
    }

    private JMenuItem getJMenuItem7()
    {
        if(ivjJMenuItem7 == null)
            try
            {
                ivjJMenuItem7 = new JMenuItem();
                ivjJMenuItem7.setName("JMenuItem7");
                ivjJMenuItem7.setMnemonic('C');
                ivjJMenuItem7.setText("Code Wizard...");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem7;
    }

    private JSeparator getJSeparator1()
    {
        if(ivjJSeparator1 == null)
            try
            {
                ivjJSeparator1 = new JSeparator();
                ivjJSeparator1.setName("JSeparator1");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSeparator1;
    }

    private JSeparator getJSeparator2()
    {
        if(ivjJSeparator2 == null)
            try
            {
                ivjJSeparator2 = new JSeparator();
                ivjJSeparator2.setName("JSeparator2");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSeparator2;
    }

    private JSeparator getJSeparator3()
    {
        if(ivjJSeparator3 == null)
            try
            {
                ivjJSeparator3 = new JSeparator();
                ivjJSeparator3.setName("JSeparator3");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJSeparator3;
    }

    private JButton getJToolBarButton1()
    {
        if(ivjJToolBarButton1 == null)
            try
            {
                ivjJToolBarButton1 = new JButton();
                ivjJToolBarButton1.setName("JToolBarButton1");
                ivjJToolBarButton1.setText("");
                ivjJToolBarButton1.setMaximumSize(new Dimension(24, 24));
                ivjJToolBarButton1.setHorizontalTextPosition(0);
                ivjJToolBarButton1.setVerticalTextPosition(3);
                ivjJToolBarButton1.setIcon(new ImageIcon(getClass().getResource("/icons/Refresh16.gif")));
                ivjJToolBarButton1.setPreferredSize(new Dimension(24, 24));
                ivjJToolBarButton1.setMargin(new Insets(0, 0, 0, 0));
                ivjJToolBarButton1.setMinimumSize(new Dimension(24, 24));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJToolBarButton1;
    }

    private JButton getJToolBarButton2()
    {
        if(ivjJToolBarButton2 == null)
            try
            {
                ivjJToolBarButton2 = new JButton();
                ivjJToolBarButton2.setName("JToolBarButton2");
                ivjJToolBarButton2.setText("");
                ivjJToolBarButton2.setMaximumSize(new Dimension(24, 24));
                ivjJToolBarButton2.setHorizontalTextPosition(0);
                ivjJToolBarButton2.setVerticalTextPosition(3);
                ivjJToolBarButton2.setIcon(new ImageIcon(getClass().getResource("/icons/selectColumns.gif")));
                ivjJToolBarButton2.setPreferredSize(new Dimension(24, 24));
                ivjJToolBarButton2.setMargin(new Insets(0, 0, 0, 0));
                ivjJToolBarButton2.setMinimumSize(new Dimension(24, 24));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJToolBarButton2;
    }

    private JMenuBar getMQJExplorerJMenuBar()
    {
        if(ivjMQJExplorerJMenuBar == null)
            try
            {
                ivjMQJExplorerJMenuBar = new JMenuBar();
                ivjMQJExplorerJMenuBar.setName("MQJExplorerJMenuBar");
                ivjMQJExplorerJMenuBar.add(getFileMenu());
                ivjMQJExplorerJMenuBar.add(getViewMenu());
                ivjMQJExplorerJMenuBar.add(getJMenu2());
                ivjMQJExplorerJMenuBar.add(getJMenu3());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjMQJExplorerJMenuBar;
    }

    private JToolBar getToolBar()
    {
        if(ivjToolBar == null)
            try
            {
                ivjToolBar = new JToolBar();
                ivjToolBar.setName("ToolBar");
                ivjToolBar.setBounds(632, 409, 160, 120);
                ivjToolBar.add(getDefaultToolBarButton());
                getToolBar().add(getJToolBarButton1(), getJToolBarButton1().getName());
                getToolBar().add(getJToolBarButton2(), getJToolBarButton2().getName());
                ivjToolBar.addSeparator();
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjToolBar;
    }

    private JMenu getViewMenu()
    {
        if(ivjViewMenu == null)
            try
            {
                ivjViewMenu = new JMenu();
                ivjViewMenu.setName("ViewMenu");
                ivjViewMenu.setMnemonic('V');
                ivjViewMenu.setText("View");
                ivjViewMenu.add(getJMenuItem5());
                ivjViewMenu.add(getJMenuItem6());
                ivjViewMenu.add(getJSeparator2());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjViewMenu;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getJMenuItem1().addActionListener(ivjEventHandler);
        getJMenuItem2().addActionListener(ivjEventHandler);
        getJMenuItem4().addActionListener(ivjEventHandler);
        getJMenuItem3().addActionListener(ivjEventHandler);
        getJMenuItem6().addActionListener(ivjEventHandler);
        getJMenuItem13().addActionListener(ivjEventHandler);
        getJMenuItem5().addActionListener(ivjEventHandler);
        getJMenuItem10().addActionListener(ivjEventHandler);
        getJMenuItem11().addActionListener(ivjEventHandler);
        getDefaultToolBarButton().addActionListener(ivjEventHandler);
        getJToolBarButton2().addActionListener(ivjEventHandler);
        getJToolBarButton1().addActionListener(ivjEventHandler);
        getJMenuItem7().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("MQJExplorer");
            setDefaultCloseOperation(2);
            setTitle("MQJExplorer");
            setIconImage((new ImageIcon(getClass().getResource("/icons/appIcon.gif"))).getImage());
            setSize(426, 240);
            setJMenuBar(getMQJExplorerJMenuBar());
            setContentPane(getJFrameContentPane());
            initConnections();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        TeeOutStreams teeoutstreams = new TeeOutStreams();
        consoleLog = new ConsoleLog();
        teeoutstreams.addStream(consoleLog.getOutputStream());
        teeoutstreams.addStream(System.out);
        System.setOut(new PrintStream(teeoutstreams));
        System.setErr(new PrintStream(teeoutstreams));
        consoleLog.pack();
        setConsoleLog(consoleLog);
        MQException.log = null;
        javax.swing.UIManager.LookAndFeelInfo alookandfeelinfo[] = UIManager.getInstalledLookAndFeels();
        for(int i = 0; i < alookandfeelinfo.length; i++)
        {
            JMenuItem jmenuitem = new JMenuItem(alookandfeelinfo[i].getName());
            jmenuitem.setActionCommand(alookandfeelinfo[i].getClassName());
            jmenuitem.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent actionevent)
                {
                    try
                    {
                        UIManager.setLookAndFeel(actionevent.getActionCommand());
                        SwingUtilities.updateComponentTreeUI(getRootPane());
                    }
                    catch(Exception _ex) { }
                }

            }
);
            getViewMenu().add(jmenuitem);
        }

        getHelpMenuItem().addActionListener(Help.getActionListener());
        JPanel jpanel = new JPanel();
        GridBagLayout gridbaglayout = new GridBagLayout();
        GridBagConstraints gridbagconstraints = new GridBagConstraints();
        jpanel.setLayout(gridbaglayout);
        gridbagconstraints.gridx = 0;
        gridbagconstraints.gridy = 0;
        
        profile = Profile.load(configFile);
        mqseriesTree = profile.getTree();
        javax.swing.JTree jtree = mqseriesTree.buildTree();
        mqseriesTree.addMQSeriesTreeListener(this);
        setSize(profile.commonSettings.windowSize);
        JScrollPane jscrollpane = new JScrollPane(jtree);
        cardPanel = new JPanel();
        cardPanel.setLayout(new CardLayout());
        queueView = new QueueView();
        queueView.setProfile(profile);
        processView = new ProcessView();
        channelView = new ChannelView();
        nameListView = new NamelistView();
        splashView = new SplashView();
        jmsView = new JMSView();
        pubSubView = new PubSubView();
        pubSubView.setProfile(profile);
        currentView = splashView;
        cardPanel.add(queueView, "Queues");
        cardPanel.add(processView, "Processes");
        cardPanel.add(channelView, "Channels");
        cardPanel.add(nameListView, "NameLists");
        cardPanel.add(splashView, "Splash");
                
        cardPanel.add(jmsView, "JMS");
        
        cardPanel.add(pubSubView, "PubSub");
        CardLayout cardlayout = (CardLayout)cardPanel.getLayout();
        cardlayout.show(cardPanel, "Splash");
        splitPane = new JSplitPane(1, jscrollpane, cardPanel);
        Dimension dimension = new Dimension(100, 50);
        jscrollpane.setMinimumSize(dimension);
        cardPanel.setMinimumSize(dimension);
        splitPane.validate();
        splitPane.setDividerSize(4);
        splitPane.setDividerLocation(profile.commonSettings.dividerPosition);
        buildToolbar();
        statusBar = new StatusBar();
        statusBar.setQueueView(queueView);
        BorderLayout borderlayout = new BorderLayout();
        jpanel.setLayout(borderlayout);
        jpanel.add(getToolBar(), "North");
        jpanel.add(splitPane);
        jpanel.add(statusBar, "South");
        setContentPane(jpanel);
        treeSelection(null, -1);
    }

    public static void main(String args[]) {
        logger.trace("MQJExplorer.main()");
        
        try {
        	        
	        try {
	            configDir.mkdirs();        	
	        } catch (Exception e) {        	
	        }
	        
	        Splash splash = new Splash();
	        splash.setVisible(true);
	        preStartup();
	        MQJExplorer mqjexplorer = new MQJExplorer();
	        mainFrame = mqjexplorer;
	        mqjexplorer.addWindowListener(new WindowAdapter() {
	
	            public void windowActivated(WindowEvent windowevent)
	            {
	                windowevent.getWindow().repaint();
	            }
	
	            public void windowClosing(WindowEvent windowevent)
	            {
	                MQJExplorer mqjexplorer1 = (MQJExplorer)windowevent.getWindow();
	                mqjexplorer1.exit();
	            }
	
	        }
	);
	        Dimension dimension = mqjexplorer.getToolkit().getScreenSize();
	        mqjexplorer.setLocation(dimension.width / 2 - mqjexplorer.getWidth() / 2, dimension.height / 2 - mqjexplorer.getHeight() / 2);
	        mqjexplorer.toBack();
	        mqjexplorer.setVisible(true);
	        splash.toFront();
	        mqjexplorer.postStartup();
        } catch(Throwable t)  {
        	logger.error(t);
        }
    }

    public void menuAction(ActionEvent actionevent)
    {
        String s = actionevent.getActionCommand();
        if(s.equals("refresh"))
        {
            currentView.refresh();
            return;
        }
        if(s.equals("showQueueManager"))
        {
            showQueueManager();
            return;
        } else
        {
            currentView.actionPerformed(actionevent);
            return;
        }
    }

    public void MQErrorDialog(MQException mqexception)
    {
        JOptionPane.showMessageDialog(this, "MQSeries error: " + mqexception.reasonCode, "MQSeries Error", 0);
    }

    public void postStartup()
    {
        if(mqseriesTree.getQueueManagerCount() == 0)
            showQueueManager();
    }

    private static void preStartup()
    {
        help = new Help();
        mqPoolToken = MQEnvironment.addConnectionPoolToken();
    }

    public void refresh()
    {
        currentView.refresh();
    }

    public void save()
    {
        profile.commonSettings.windowSize = getSize();
        profile.commonSettings.dividerPosition = splitPane.getDividerLocation();
        profile.save(configFile);
        statusBar.setMessageText("Settings saved on " + configFile.getAbsolutePath().toString());
    }

    private void setConsoleLog(ConsoleLog consolelog)
    {
        if(ivjConsoleLog != consolelog)
            try
            {
                ivjConsoleLog = consolelog;
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
    }

    public static void setMessage(String s)
    {
        statusBar.setMessageText(s);
    }

    public void showHideColumns()
    {
        currentView.showHideColumns();
    }

    public void showQueueManager()
    {
        ShowQueueManager showqueuemanager = new ShowQueueManager(mainFrame);
        showqueuemanager.pack();
        SwingUtils.setCenter(this, showqueuemanager);
        showqueuemanager.setVisible(true);
        if(showqueuemanager.getReturnCode() != 0)
            return;
        QueueManagerModel queuemanagermodel = new QueueManagerModel();
        if(showqueuemanager.isLocal())
        {
            queuemanagermodel.setQueueManagerName(showqueuemanager.getQueueManagerName());
        } else
        {
            queuemanagermodel.setChannel("SYSTEM.ADMIN.SVRCONN");
            queuemanagermodel.setQueueManagerName(showqueuemanager.getQueueManagerName());
            try
            {
                queuemanagermodel.parseConnectionString(showqueuemanager.getConnectionName());
            }
            catch(Exception exception)
            {
                System.out.println("Exception: " + exception.toString());
                return;
            }
        }
        if(queuemanagermodel.isLocal())
            try
            {
                queuemanagermodel.connect();
            }
            catch(MQException _ex) { }
        mqseriesTree.addQueueManager(queuemanagermodel);
    }

    public void tailFile()
    {
        FileTail filetail = new FileTail();
        filetail.settings(profile.tailFileSettings);
        SwingUtils.setCenter(mainFrame, filetail);
        filetail.show();
    }

    public void treeSelection(Object obj, int i)
    {
        System.out.println("New Queue Manager selection!");
        CardLayout cardlayout = (CardLayout)cardPanel.getLayout();
        switch(i)
        {
        case 1: // '\001'
            currentView = queueView;
            cardlayout.show(cardPanel, "Queues");
            break;

        case 7: // '\007'
            currentView = processView;
            cardlayout.show(cardPanel, "Processes");
            break;

        case 4: // '\004'
            currentView = channelView;
            cardlayout.show(cardPanel, "Channels");
            break;

        case 8: // '\b'
            currentView = nameListView;
            cardlayout.show(cardPanel, "NameLists");
            break;

        case 9: // '\t'
            currentView = splashView;
            cardlayout.show(cardPanel, "Splash");
            break;

        case 12: // '\f'
        case 13: // '\r'
            currentView = jmsView;
            cardlayout.show(cardPanel, "JMS");
            break;

        case 14: // '\016'
            currentView = pubSubView;
            cardlayout.show(cardPanel, "PubSub");
            break;

        case 2: // '\002'
        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 10: // '\n'
        case 11: // '\013'
        default:
            return;
        }
        currentView.setModel(obj);
        buildToolbar();
    }

    public void wmqiEntryAssist()
    {
        XMLEntryAssist xmlentryassist = new XMLEntryAssist(mainFrame);
        xmlentryassist.pack();
        SwingUtils.setCenter(mainFrame, xmlentryassist);
        xmlentryassist.show();
    }

    JPopupMenu popup;
    public MQSeriesTree mqseriesTree;
    JCheckBoxMenuItem showSystemCheckBox;
    private QueueView queueView;
    private MQJExplorerView currentView;
    private ProcessView processView;
    private ChannelView channelView;
    private NamelistView nameListView;
    private SplashView splashView;
    private JPanel cardPanel;
    public static MQJExplorer mainFrame;
    public static StatusBar statusBar;
    public static Help help;
    Profile profile;
    private ConsoleLog consoleLog;
    public static MQPoolToken mqPoolToken = null;
    private JMSView jmsView;
    private JMenu ivjFileMenu;
    private JPanel ivjJFrameContentPane;
    private JMenu ivjJMenu2;
    private JMenu ivjJMenu3;
    private JMenuItem ivjJMenuItem1;
    private JMenuItem ivjJMenuItem10;
    private JMenuItem ivjJMenuItem11;
    private JMenuItem ivjJMenuItem13;
    private JMenuItem ivjJMenuItem2;
    private JMenuItem ivjJMenuItem3;
    private JMenuItem ivjJMenuItem4;
    private JMenuItem ivjJMenuItem5;
    private JMenuItem ivjJMenuItem6;
    private JSeparator ivjJSeparator1;
    private JSeparator ivjJSeparator2;
    private JSeparator ivjJSeparator3;
    private JMenuBar ivjMQJExplorerJMenuBar;
    IvjEventHandler ivjEventHandler;
    private ConsoleLog ivjConsoleLog;
    private JMenu ivjViewMenu;
    private JMenuItem ivjHelpMenuItem;
    private JButton ivjDefaultToolBarButton;
    private JButton ivjJToolBarButton1;
    private JButton ivjJToolBarButton2;
    private JToolBar ivjToolBar;
    private JMenuItem ivjJMenuItem7;
    private PubSubView pubSubView;
    private JSplitPane splitPane;

    
    public final static File configDir = new File(System.getProperty("user.home"), ".MQJExplorer");

    public final static File configFile = new File(configDir, "config.dat");
    
}
