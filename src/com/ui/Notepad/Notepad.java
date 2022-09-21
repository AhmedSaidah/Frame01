package com.ui.Notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Notepad extends JFrame implements ActionListener {
    private JTextArea ta;
    private JMenuBar mb;
    private JMenu fileMenu;
    private JMenuItem loadItem;
    private JMenuItem SaveItem;
    private JMenuItem exitItem;
    String clipText = new String( "");

    public Notepad(String title) {
        super (title);
        ta = new JTextArea();
        mb = new JMenuBar();
        fileMenu = new JMenu("File");
        loadItem = new JMenuItem("Load", 'l');
        loadItem.setAccelerator(KeyStroke.getKeyStroke('l', KeyEvent.CTRL_DOWN_MASK));
        loadItem.addActionListener( this);
        loadItem.setActionCommand("L");
        SaveItem = new JMenuItem("Save", 'S');
        SaveItem.setAccelerator(KeyStroke.getKeyStroke('S', KeyEvent.CTRL_DOWN_MASK));
        SaveItem.addActionListener( this);
        SaveItem.setActionCommand("S");
        exitItem = new JMenuItem("Exit", 'x');
        exitItem.setAccelerator(KeyStroke.getKeyStroke('x', KeyEvent.CTRL_DOWN_MASK));
        exitItem.addActionListener( this);
        exitItem.setActionCommand("E");
        setJMenuBar(mb);
        mb.add(fileMenu);
        fileMenu.add(loadItem);
        fileMenu.add(SaveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        add(new JScrollPane(ta));

        setSize(300, 300);
        setLocation( 800, 700);



        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String[] args){
        new Notepad("Note Pad demo").setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "L" :
                loadFile();
                break;

            case "S" :
                saveContent();
                break;

            case "E" :
                System.exit( 0);
                break;


        }

    }
    private void loadFile(){
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog( this);
        if (result == JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getPath();
            FileInputStream fis = null;
            try {
                 fis = new FileInputStream(path);
                int size = fis.available();
                byte[] b = new byte[size];
                fis.read(b);
                ta.setText(new String(b));
            } catch (FileNotFoundException e){

            } catch (IOException e){

            }finally {
                try{fis.close();} catch (IOException e){}
            }

        }

    }
    private void saveContent(){
        JFileChooser fc = new JFileChooser();
        int result = fc.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().getPath();
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(path);
                byte[] b = ta.getText().getBytes();
                fos.write(b);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                fos.close();
            } catch (IOException e) {

                }
            }
        }

    }
}
