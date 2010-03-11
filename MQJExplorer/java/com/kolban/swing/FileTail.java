// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FileTail.java

package com.kolban.swing;

import com.lamatek.swingextras.JFontChooser;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class FileTail extends JFrame
    implements Runnable
{
    class IvjEventHandler
        implements ActionListener, WindowListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getSource() == getJButton1())
                connEtoC1(actionevent);
            if(actionevent.getSource() == getJButton2())
                connEtoC2(actionevent);
            if(actionevent.getSource() == getJMenuItem1())
                connEtoC3(actionevent);
            if(actionevent.getSource() == getJMenuItem4())
                connEtoC4(actionevent);
            if(actionevent.getSource() == getJMenuItem3())
                connEtoC6(actionevent);
            if(actionevent.getSource() == getFileName())
                connEtoC5(actionevent);
            if(actionevent.getSource() == getJMenuItem2())
                connEtoC7(actionevent);
        }

        public void windowActivated(WindowEvent windowevent)
        {
        }

        public void windowClosed(WindowEvent windowevent)
        {
        }

        public void windowClosing(WindowEvent windowevent)
        {
            if(windowevent.getSource() == FileTail.this)
                connEtoC8(windowevent);
        }

        public void windowDeactivated(WindowEvent windowevent)
        {
        }

        public void windowDeiconified(WindowEvent windowevent)
        {
        }

        public void windowIconified(WindowEvent windowevent)
        {
        }

        public void windowOpened(WindowEvent windowevent)
        {
        }

        IvjEventHandler()
        {
        }
    }


    public FileTail()
    {
        ivjJButton1 = null;
        ivjJButton2 = null;
        ivjJDialogContentPane = null;
        ivjJPanel1 = null;
        ivjJScrollPane1 = null;
        ivjEventHandler = new IvjEventHandler();
        ivjFileData = null;
        ivjFileName = null;
        thread = null;
        reader = null;
        ivjFollow = null;
        ivjFileTailJMenuBar = null;
        ivjJMenu1 = null;
        ivjJMenu2 = null;
        ivjJMenuItem1 = null;
        ivjJMenuItem2 = null;
        ivjJMenuItem3 = null;
        ivjJMenuItem4 = null;
        ivjJLabel1 = null;
        settings = null;
        initialize();
    }

    public void browse()
    {
        JFileChooser jfilechooser = new JFileChooser();
        int i = jfilechooser.showOpenDialog(this);
        if(i == 0)
            getFileName().setSelectedItem(jfilechooser.getSelectedFile().getPath());
    }

    public void cancel()
    {
        try
        {
            if(reader != null)
                reader.close();
            if(thread != null)
            {
                thread.interrupt();
                thread.join();
            }
        }
        catch(Exception exception)
        {
            System.out.println("Exception: " + exception.toString());
        }
        settings.font = getFileData().getFont();
        settings.fileNames.clear();
        for(int i = 0; i < 5 && i < getFileName().getItemCount(); i++)
            settings.fileNames.addElement(getFileName().getItemAt(i));

        dispose();
    }

    private void connEtoC1(ActionEvent actionevent)
    {
        try
        {
            reset();
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
            browse();
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
            cancel();
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
            copy();
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
            reset();
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
            selectAll();
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
            selectFont();
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
    }

    private void connEtoC8(WindowEvent windowevent)
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

    public void copy()
    {
        getFileData().copy();
    }

    private JTextArea getFileData()
    {
        if(ivjFileData == null)
            try
            {
                ivjFileData = new JTextArea();
                ivjFileData.setName("FileData");
                ivjFileData.setFont(new Font("monospaced", 0, 12));
                ivjFileData.setBounds(0, 0, 160, 120);
                ivjFileData.setEditable(false);
                ivjFileData.setMargin(new Insets(0, 4, 0, 4));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileData;
    }

    private JComboBox getFileName()
    {
        if(ivjFileName == null)
            try
            {
                ivjFileName = new JComboBox();
                ivjFileName.setName("FileName");
                ivjFileName.setEditable(true);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileName;
    }

    private JMenuBar getFileTailJMenuBar()
    {
        if(ivjFileTailJMenuBar == null)
            try
            {
                ivjFileTailJMenuBar = new JMenuBar();
                ivjFileTailJMenuBar.setName("FileTailJMenuBar");
                ivjFileTailJMenuBar.add(getJMenu1());
                ivjFileTailJMenuBar.add(getJMenu2());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFileTailJMenuBar;
    }

    private JRadioButton getFollow()
    {
        if(ivjFollow == null)
            try
            {
                ivjFollow = new JRadioButton();
                ivjFollow.setName("Follow");
                ivjFollow.setSelected(true);
                ivjFollow.setText("Follow");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjFollow;
    }

    private JButton getJButton1()
    {
        if(ivjJButton1 == null)
            try
            {
                ivjJButton1 = new JButton();
                ivjJButton1.setName("JButton1");
                ivjJButton1.setText("Reset");
                ivjJButton1.setMargin(new Insets(2, 8, 2, 8));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton1;
    }

    private JButton getJButton2()
    {
        if(ivjJButton2 == null)
            try
            {
                ivjJButton2 = new JButton();
                ivjJButton2.setName("JButton2");
                ivjJButton2.setText("Browse");
                ivjJButton2.setMargin(new Insets(2, 8, 2, 8));
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJButton2;
    }

    private JPanel getJDialogContentPane()
    {
        if(ivjJDialogContentPane == null)
            try
            {
                ivjJDialogContentPane = new JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setPreferredSize(new Dimension(250, 200));
                ivjJDialogContentPane.setLayout(new GridBagLayout());
                ivjJDialogContentPane.setMinimumSize(new Dimension(250, 200));
                GridBagConstraints gridbagconstraints = new GridBagConstraints();
                gridbagconstraints.gridx = 0;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.fill = 1;
                gridbagconstraints.weightx = 1.0D;
                gridbagconstraints.weighty = 1.0D;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJDialogContentPane().add(getJPanel1(), gridbagconstraints);
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
                ivjJLabel1.setText("File Name:");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJLabel1;
    }

    private JMenu getJMenu1()
    {
        if(ivjJMenu1 == null)
            try
            {
                ivjJMenu1 = new JMenu();
                ivjJMenu1.setName("JMenu1");
                ivjJMenu1.setMnemonic('F');
                ivjJMenu1.setText("File");
                ivjJMenu1.add(getJMenuItem1());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenu1;
    }

    private JMenu getJMenu2()
    {
        if(ivjJMenu2 == null)
            try
            {
                ivjJMenu2 = new JMenu();
                ivjJMenu2.setName("JMenu2");
                ivjJMenu2.setMnemonic('E');
                ivjJMenu2.setText("Edit");
                ivjJMenu2.add(getJMenuItem3());
                ivjJMenu2.add(getJMenuItem4());
                ivjJMenu2.add(getJMenuItem2());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenu2;
    }

    private JMenuItem getJMenuItem1()
    {
        if(ivjJMenuItem1 == null)
            try
            {
                ivjJMenuItem1 = new JMenuItem();
                ivjJMenuItem1.setName("JMenuItem1");
                ivjJMenuItem1.setMnemonic('C');
                ivjJMenuItem1.setText("Close");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem1;
    }

    private JMenuItem getJMenuItem2()
    {
        if(ivjJMenuItem2 == null)
            try
            {
                ivjJMenuItem2 = new JMenuItem();
                ivjJMenuItem2.setName("JMenuItem2");
                ivjJMenuItem2.setMnemonic('F');
                ivjJMenuItem2.setText("Font...");
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
                ivjJMenuItem3.setMnemonic('A');
                ivjJMenuItem3.setText("Select All");
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
                ivjJMenuItem4.setMnemonic('C');
                ivjJMenuItem4.setText("Copy");
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJMenuItem4;
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
                gridbagconstraints.gridx = 3;
                gridbagconstraints.gridy = 0;
                gridbagconstraints.anchor = 13;
                gridbagconstraints.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJButton1(), gridbagconstraints);
                GridBagConstraints gridbagconstraints1 = new GridBagConstraints();
                gridbagconstraints1.gridx = 2;
                gridbagconstraints1.gridy = 0;
                gridbagconstraints1.anchor = 13;
                gridbagconstraints1.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJButton2(), gridbagconstraints1);
                GridBagConstraints gridbagconstraints2 = new GridBagConstraints();
                gridbagconstraints2.gridx = 0;
                gridbagconstraints2.gridy = 1;
                gridbagconstraints2.gridwidth = 5;
                gridbagconstraints2.fill = 1;
                gridbagconstraints2.weightx = 1.0D;
                gridbagconstraints2.weighty = 1.0D;
                gridbagconstraints2.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJScrollPane1(), gridbagconstraints2);
                GridBagConstraints gridbagconstraints3 = new GridBagConstraints();
                gridbagconstraints3.gridx = 4;
                gridbagconstraints3.gridy = 0;
                gridbagconstraints3.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getFollow(), gridbagconstraints3);
                GridBagConstraints gridbagconstraints4 = new GridBagConstraints();
                gridbagconstraints4.gridx = 1;
                gridbagconstraints4.gridy = 0;
                gridbagconstraints4.fill = 2;
                gridbagconstraints4.weightx = 1.0D;
                gridbagconstraints4.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getFileName(), gridbagconstraints4);
                GridBagConstraints gridbagconstraints5 = new GridBagConstraints();
                gridbagconstraints5.gridx = 0;
                gridbagconstraints5.gridy = 0;
                gridbagconstraints5.insets = new Insets(4, 4, 4, 4);
                getJPanel1().add(getJLabel1(), gridbagconstraints5);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJPanel1;
    }

    private JScrollPane getJScrollPane1()
    {
        if(ivjJScrollPane1 == null)
            try
            {
                ivjJScrollPane1 = new JScrollPane();
                ivjJScrollPane1.setName("JScrollPane1");
                getJScrollPane1().setViewportView(getFileData());
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
            }
        return ivjJScrollPane1;
    }

    private void handleException(Throwable throwable)
    {
    }

    private void initConnections()
        throws Exception
    {
        getJButton1().addActionListener(ivjEventHandler);
        getJButton2().addActionListener(ivjEventHandler);
        getJMenuItem1().addActionListener(ivjEventHandler);
        getJMenuItem4().addActionListener(ivjEventHandler);
        getJMenuItem3().addActionListener(ivjEventHandler);
        getFileName().addActionListener(ivjEventHandler);
        getJMenuItem2().addActionListener(ivjEventHandler);
        addWindowListener(ivjEventHandler);
    }

    private void initialize()
    {
        try
        {
            ImageIcon imageicon = new ImageIcon(getClass().getResource("/icons/tail.gif"));
            setIconImage(imageicon.getImage());
            setName("FileTail");
            setDefaultCloseOperation(0);
            setJMenuBar(getFileTailJMenuBar());
            setSize(537, 390);
            setTitle("<None>");
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
            FileTail filetail = new FileTail();
            filetail.addWindowListener(new WindowAdapter() {

                public void windowClosing(WindowEvent windowevent)
                {
                    System.exit(0);
                }

            }
);
            filetail.show();
            Insets insets = filetail.getInsets();
            filetail.setSize(filetail.getWidth() + insets.left + insets.right, filetail.getHeight() + insets.top + insets.bottom);
            filetail.setVisible(true);
        }
        catch(Throwable throwable)
        {
            System.err.println("Exception occurred in main() of javax.swing.JDialog");
            throwable.printStackTrace(System.out);
        }
    }

    public void ok()
    {
        cancel();
    }

    public void reset()
    {
        if(reader != null)
            try
            {
                reader.close();
            }
            catch(IOException _ex) { }
        if(thread != null)
        {
            thread.interrupt();
            try
            {
                thread.join();
            }
            catch(InterruptedException _ex) { }
            thread = null;
        }
        thread = new Thread(this);
        String s = ((String)getFileName().getSelectedItem()).trim();
        thread.setName("File reader - " + s);
        try
        {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
        }
        catch(FileNotFoundException _ex)
        {
            System.out.println("File not found!!!");
            thread = null;
            reader = null;
            return;
        }
        getFileName().removeItem(s);
        getFileName().addItem(s);
        getFileName().setSelectedItem(s);
        setTitle(s);
        getFileData().setText("");
        thread.start();
    }

    public void run()
    {
        char ac[] = new char[256];
        boolean flag = false;
        try
        {
            Thread thread1 = Thread.currentThread();
            do
            {
                if(thread1.isInterrupted())
                    return;
                int i = reader.read(ac, 0, ac.length);
                if(i <= 0)
                {
                    try
                    {
                        if(flag && getFollow().isSelected())
                        {
                            getFileData().setCaretPosition(getFileData().getDocument().getLength());
                            flag = false;
                        }
                        Thread.sleep(500L);
                    }
                    catch(InterruptedException _ex)
                    {
                        return;
                    }
                } else
                {
                    getFileData().append(new String(ac, 0, i));
                    flag = true;
                }
            } while(true);
        }
        catch(IOException ioexception)
        {
            System.out.println("Exception: " + ioexception.toString());
        }
    }

    public void selectAll()
    {
        getFileData().selectAll();
    }

    public void selectFont()
    {
        JFontChooser jfontchooser = new JFontChooser(getFileData().getFont());
        if(jfontchooser.showDialog(this, "Select font ...") == 2)
            getFileData().setFont(jfontchooser.getSelectedFont());
    }

    public void settings(com.kolban.mqjexplorer.Profile.TailFileSettings tailfilesettings)
    {
        settings = tailfilesettings;
        if(tailfilesettings.font != null)
            getFileData().setFont(tailfilesettings.font);
        for(Enumeration enumeration = tailfilesettings.fileNames.elements(); enumeration.hasMoreElements(); getFileName().addItem(enumeration.nextElement()));
    }

    private JButton ivjJButton1;
    private JButton ivjJButton2;
    private JPanel ivjJDialogContentPane;
    private JPanel ivjJPanel1;
    private JScrollPane ivjJScrollPane1;
    IvjEventHandler ivjEventHandler;
    private JTextArea ivjFileData;
    private JComboBox ivjFileName;
    private Thread thread;
    private BufferedReader reader;
    private JRadioButton ivjFollow;
    private JMenuBar ivjFileTailJMenuBar;
    private JMenu ivjJMenu1;
    private JMenu ivjJMenu2;
    private JMenuItem ivjJMenuItem1;
    private JMenuItem ivjJMenuItem2;
    private JMenuItem ivjJMenuItem3;
    private JMenuItem ivjJMenuItem4;
    private JLabel ivjJLabel1;
    private com.kolban.mqjexplorer.Profile.TailFileSettings settings;
    private static final int FILE_NAME_COUNT = 5;















}
