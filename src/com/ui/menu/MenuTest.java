package com.ui.menu;

import javax.swing.*;

public class MenuTest extends JFrame {
    private  JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem exitMenuItem;
    private JRadioButtonMenuItem radioMenuItem1;
    private JRadioButtonMenuItem radioMenuItem2;
    private JCheckBoxMenuItem checkMenuItem1;
    private JCheckBoxMenuItem checkMenuItem2;
    public MenuTest(){
        super("Menu demo");

        menuBar = new JMenuBar();
        openMenuItem = new JMenuItem("Load" , 'L');
        saveMenuItem = new JMenuItem("Save" ,'S');
        exitMenuItem = new JMenuItem("Exit");
        radioMenuItem1 = new JRadioButtonMenuItem("Radio Item1");
        radioMenuItem2 = new JRadioButtonMenuItem("Radio Item2");
        ButtonGroup group = new ButtonGroup();
        group.add(radioMenuItem1);
        group.add(radioMenuItem2);
        checkMenuItem1 = new JCheckBoxMenuItem("Check item1");
        checkMenuItem2 = new JCheckBoxMenuItem("Check item2");
        ButtonGroup pack = new ButtonGroup();
        pack.add(checkMenuItem1);
        pack.add(checkMenuItem2);


        fileMenu = new JMenu("File");
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        editMenu = new JMenu("Edit");
        editMenu.add(radioMenuItem1);
        editMenu.add(radioMenuItem2);
        editMenu.add(checkMenuItem1);
        editMenu.add(checkMenuItem2);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        setSize(400, 300);
        setLocation(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }
    public static void main (String[] args){
        new MenuTest().setVisible(true);
    }
}
