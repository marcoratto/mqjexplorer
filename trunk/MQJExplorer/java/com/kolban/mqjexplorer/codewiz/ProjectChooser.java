// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProjectChooser.java

package com.kolban.mqjexplorer.codewiz;

import com.kolban.swing.Footer;
import com.kolban.swing.FooterListener;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// Referenced classes of package com.kolban.mqjexplorer.codewiz:
//            Project

public class ProjectChooser extends JDialog
{
    class ProjectCellRenderer extends JLabel
        implements ListCellRenderer
    {

        public Component getListCellRendererComponent(JList jlist, Object obj, int i, boolean flag, boolean flag1)
        {
            Project project = (Project)obj;
            setText(project.getName());
            setBackground(flag ? Color.blue : Color.white);
            setForeground(flag ? Color.white : Color.black);
            setIcon(project.getIcon());
            return this;
        }

        public ProjectCellRenderer()
        {
            setOpaque(true);
        }
    }

    class IvjEventHandler
        implements FooterListener, ActionListener, KeyListener, ListSelectionListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJButton1())
                connEtoC7(actionevent);
        }

        public void cancel(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC1(eventobject);
        }

        public void keyPressed(KeyEvent keyevent)
        {
            if(keyevent.getSource() == getDirectoryName())
                connEtoC3();
            if(keyevent.getSource() == getProjectName())
                connEtoC4();
        }

        public void keyReleased(KeyEvent keyevent)
        {
            if(keyevent.getSource() == getDirectoryName())
                connEtoC3();
            if(keyevent.getSource() == getProjectName())
                connEtoC4();
        }

        public void keyTyped(KeyEvent keyevent)
        {
            if(keyevent.getSource() == getDirectoryName())
                connEtoC3();
            if(keyevent.getSource() == getProjectName())
                connEtoC4();
        }

        public void ok(EventObject eventobject)
        {
            if(eventobject.getSource() == getFooter())
                connEtoC2(eventobject);
        }

        public void valueChanged(ListSelectionEvent listselectionevent)
        {
            if(listselectionevent.getSource() == getProjectList())
                connEtoC5();
            if(listselectionevent.getSource() == getProjectList())
                connEtoC6(listselectionevent);
        }

        IvjEventHandler()
        {
        }
    }


    public ProjectChooser()
    {
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjLongDescription = null;
        ivjJScrollPane1 = null;
        ivjProjectList = null;
        projectVector = null;
        ivjJButton1 = null;
        ivjJLabel1 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDirectoryName = null;
        ivjJLabel2 = null;
        ivjProjectName = null;
        ivjJSeparator1 = null;
        initialize();
    }

    public ProjectChooser(Dialog dialog)
    {
        super(dialog);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjLongDescription = null;
        ivjJScrollPane1 = null;
        ivjProjectList = null;
        projectVector = null;
        ivjJButton1 = null;
        ivjJLabel1 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDirectoryName = null;
        ivjJLabel2 = null;
        ivjProjectName = null;
        ivjJSeparator1 = null;
    }

    public ProjectChooser(Dialog dialog, String s)
    {
        super(dialog, s);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjLongDescription = null;
        ivjJScrollPane1 = null;
        ivjProjectList = null;
        projectVector = null;
        ivjJButton1 = null;
        ivjJLabel1 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDirectoryName = null;
        ivjJLabel2 = null;
        ivjProjectName = null;
        ivjJSeparator1 = null;
    }

    public ProjectChooser(Dialog dialog, String s, boolean flag)
    {
        super(dialog, s, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjLongDescription = null;
        ivjJScrollPane1 = null;
        ivjProjectList = null;
        projectVector = null;
        ivjJButton1 = null;
        ivjJLabel1 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDirectoryName = null;
        ivjJLabel2 = null;
        ivjProjectName = null;
        ivjJSeparator1 = null;
    }

    public ProjectChooser(Dialog dialog, boolean flag)
    {
        super(dialog, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjLongDescription = null;
        ivjJScrollPane1 = null;
        ivjProjectList = null;
        projectVector = null;
        ivjJButton1 = null;
        ivjJLabel1 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDirectoryName = null;
        ivjJLabel2 = null;
        ivjProjectName = null;
        ivjJSeparator1 = null;
    }

    public ProjectChooser(Frame frame)
    {
        super(frame);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjLongDescription = null;
        ivjJScrollPane1 = null;
        ivjProjectList = null;
        projectVector = null;
        ivjJButton1 = null;
        ivjJLabel1 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDirectoryName = null;
        ivjJLabel2 = null;
        ivjProjectName = null;
        ivjJSeparator1 = null;
    }

    public ProjectChooser(Frame frame, String s)
    {
        super(frame, s);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjLongDescription = null;
        ivjJScrollPane1 = null;
        ivjProjectList = null;
        projectVector = null;
        ivjJButton1 = null;
        ivjJLabel1 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDirectoryName = null;
        ivjJLabel2 = null;
        ivjProjectName = null;
        ivjJSeparator1 = null;
    }

    public ProjectChooser(Frame frame, String s, boolean flag)
    {
        super(frame, s, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjLongDescription = null;
        ivjJScrollPane1 = null;
        ivjProjectList = null;
        projectVector = null;
        ivjJButton1 = null;
        ivjJLabel1 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDirectoryName = null;
        ivjJLabel2 = null;
        ivjProjectName = null;
        ivjJSeparator1 = null;
    }

    public ProjectChooser(Frame frame, boolean flag)
    {
        super(frame, flag);
        ivjFooter = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjLongDescription = null;
        ivjJScrollPane1 = null;
        ivjProjectList = null;
        projectVector = null;
        ivjJButton1 = null;
        ivjJLabel1 = null;
        ivjJPanel2 = null;
        ivjJPanel3 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjDirectoryName = null;
        ivjJLabel2 = null;
        ivjProjectName = null;
        ivjJSeparator1 = null;
    }

    public void browse()
    {
        JFileChooser jfilechooser = new JFileChooser();
        jfilechooser.setFileSelectionMode(1);
        if(jfilechooser.showOpenDialog(this) == 0)
            getDirectoryName().setText(jfilechooser.getSelectedFile().getAbsolutePath());
    }

    public void cancel()
    {
        dispose();
    }

    private void connEtoC1(EventObject eventobject)
    {
        try
        {
            cancel();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC2(EventObject eventobject)
    {
        try
        {
            ok();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC3()
    {
        try
        {
            validateInput();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC4()
    {
        try
        {
            validateInput();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC5()
    {
        try
        {
            validateInput();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC6(ListSelectionEvent listselectionevent)
    {
        try
        {
            newSelection();
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
            browse();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private JTextField getDirectoryName()
    {
        if(ivjDirectoryName == null)
            try
            {
                ivjDirectoryName = new JTextField();
                ivjDirectoryName.setName("DirectoryName");
                ivjDirectoryName.setMinimumSize(new Dimension(220, 20));
                ivjDirectoryName.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjDirectoryName;
    }

    private Footer getFooter()
    {
        if(ivjFooter == null)
            try
            {
                ivjFooter = new Footer();
                ivjFooter.setName("Footer");
                ivjFooter.setOKEnabled(false);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFooter;
    }

    private JButton getJButton1()
    {
        if(ivjJButton1 == null)
            try
            {
                ivjJButton1 = new JButton();
                ivjJButton1.setName("JButton1");
                ivjJButton1.setText("Browse...");
                ivjJButton1.setMargin(new Insets(2, 10, 2, 10));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton1;
    }

    private JPanel getJDialogContentPane()
    {
        if(ivjJDialogContentPane == null)
            try
            {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.fill = 2;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.insets = new Insets(0, 4, 0, 4);
                getJDialogContentPane().add(getFooter(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJDialogContentPane;
    }

    private JLabel getJLabel1()
    {
        if(ivjJLabel1 == null)
            try
            {
                ivjJLabel1 = new JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Directory:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private JLabel getJLabel2()
    {
        if(ivjJLabel2 == null)
            try
            {
                ivjJLabel2 = new JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("Project Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel2;
    }

    private JPanel getJPanel1()
    {
        if(ivjJPanel1 == null)
            try
            {
                ivjJPanel1 = new JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 1;
                gridbagconstraints.gridwidth = 2;
                gridbagconstraints.fill = 2;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getLongDescription(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.fill = 1;
                gridbagconstraints1.weightx = 1.0D;
                gridbagconstraints1.weighty = 1.0D;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJScrollPane1(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 0;
                gridbagconstraints2.fill = 3;
                gridbagconstraints2.anchor = 11;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJPanel2(), gridbagconstraints2);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JPanel getJPanel2()
    {
        if(ivjJPanel2 == null)
            try
            {
                ivjJPanel2 = new JPanel();
                ivjJPanel2.setName("JPanel2");
                ivjJPanel2.setLayout(new GridBagLayout());
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 3;
                gridbagconstraints.anchor = 17;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getJLabel1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 0;
                gridbagconstraints1.gridy = 4;
                gridbagconstraints1.gridwidth = 2;
                gridbagconstraints1.anchor = 17;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getDirectoryName(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 1;
                gridbagconstraints2.gridy = 3;
                gridbagconstraints2.anchor = 17;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getJButton1(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 0;
                gridbagconstraints3.gridy = 5;
                gridbagconstraints3.gridwidth = 2;
                gridbagconstraints3.fill = 1;
                gridbagconstraints3.weightx = 1.0D;
                gridbagconstraints3.weighty = 1.0D;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getJPanel3(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 0;
                gridbagconstraints4.gridy = 0;
                gridbagconstraints4.anchor = 17;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getJLabel2(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 1;
                gridbagconstraints5.gridwidth = 2;
                gridbagconstraints5.anchor = 17;
                gridbagconstraints5.weightx = 1.0D;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel2().add(getProjectName(), gridbagconstraints5);
                GridBagConstraints gridbagconstraints6 = new GridBagConstraints();
                gridbagconstraints6.gridx = 0;
                gridbagconstraints6.gridy = 2;
                gridbagconstraints6.gridwidth = 2;
                gridbagconstraints6.fill = 2;
                gridbagconstraints6.insets = new Insets(4, 0, 4, 0);
                getJPanel2().add(getJSeparator1(), gridbagconstraints6);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel2;
    }

    private JPanel getJPanel3()
    {
        if(ivjJPanel3 == null)
            try
            {
                ivjJPanel3 = new JPanel();
                ivjJPanel3.setName("JPanel3");
                ivjJPanel3.setLayout(null);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel3;
    }

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                getJScrollPane1().setViewportView(getProjectList());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
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

    private JLabel getLongDescription()
    {
        if(ivjLongDescription == null)
            try
            {
                ivjLongDescription = new JLabel();
                ivjLongDescription.setName("LongDescription");
                ivjLongDescription.setText("Description");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjLongDescription;
    }

    private JList getProjectList()
    {
        if(ivjProjectList == null)
            try
            {
                ivjProjectList = new JList();
                ivjProjectList.setName("ProjectList");
                ivjProjectList.setBounds(0, 0, 160, 120);
                ivjProjectList.setSelectionMode(0);
                ivjProjectList.setCellRenderer(new ProjectCellRenderer());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjProjectList;
    }

    private JTextField getProjectName()
    {
        if(ivjProjectName == null)
            try
            {
                ivjProjectName = new JTextField();
                ivjProjectName.setName("ProjectName");
                ivjProjectName.setMinimumSize(new Dimension(220, 20));
                ivjProjectName.setColumns(20);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjProjectName;
    }

    private Project getSelectedProject()
    {
        Project project = (Project)getProjectList().getSelectedValue();
        return project;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getFooter().addFooterListener(ivjEventHandler);
        getProjectList().addListSelectionListener(ivjEventHandler);
        getDirectoryName().addKeyListener(ivjEventHandler);
        getProjectName().addKeyListener(ivjEventHandler);
        getJButton1().addActionListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            setName("ProjectChooser");
            setDefaultCloseOperation(2);
            setSize(584, 240);
            setModal(true);
            setTitle("Project Selection ...");
            setContentPane(getJDialogContentPane());
            initConnections();
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
            ProjectChooser projectchooser = new ProjectChooser();
            projectchooser.setModal(true);
            projectchooser.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            projectchooser.show();
            Insets insets = projectchooser.getInsets();
            projectchooser.setSize(projectchooser.getWidth() + insets.left + insets.right, projectchooser.getHeight() + insets.top + insets.bottom);
            projectchooser.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void newSelection()
    {
        Project project = getSelectedProject();
        if(project == null)
        {
            return;
        } else
        {
            getLongDescription().setText(project.getDescription());
            return;
        }
    }

    public void ok()
    {
        if(!(new File(getDirectoryName().getText())).isDirectory())
        {
            System.out.println("Not a directory ....!");
            return;
        }
        File file = new File(getDirectoryName().getText(), getProjectName().getText().trim());
        if(file.exists())
        {
            System.out.println("Already exists ...!");
            return;
        }
        if(!file.mkdir())
        {
            System.out.println("Failed to make directory!");
            return;
        } else
        {
            Project project = getSelectedProject();
            Hashtable hashtable = new Hashtable();
            hashtable.put("_TRUE", "TRUE");
            hashtable.put("PROJECT", getProjectName().getText().trim());
            hashtable.remove("_FALSE");
            project.buildProject(file, hashtable);
            dispose();
            return;
        }
    }

    public void setProjectVector(Vector vector)
    {
        DefaultListModel defaultlistmodel = new DefaultListModel();
        projectVector = vector;
        JList jlist = getProjectList();
        jlist.setModel(defaultlistmodel);
        Project project;
        for(Enumeration enumeration = projectVector.elements(); enumeration.hasMoreElements(); defaultlistmodel.addElement(project))
            project = (Project)enumeration.nextElement();

    }

    private void validateInput()
    {
        if(getProjectName().getText().trim().length() == 0 || getDirectoryName().getText().trim().length() == 0 || getProjectList().getSelectedIndex() == -1)
        {
            getFooter().setOKEnabled(false);
            return;
        } else
        {
            getFooter().setOKEnabled(true);
            return;
        }
    }

    private Footer ivjFooter;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private JLabel ivjLongDescription;
    private JScrollPane ivjJScrollPane1;
    private JList ivjProjectList;
    private Vector projectVector;
    private JButton ivjJButton1;
    private JLabel ivjJLabel1;
    private JPanel ivjJPanel2;
    private JPanel ivjJPanel3;
    IvjEventHandler ivjEventHandler;
    private JTextField ivjDirectoryName;
    private JLabel ivjJLabel2;
    private JTextField ivjProjectName;
    private JSeparator ivjJSeparator1;












}
