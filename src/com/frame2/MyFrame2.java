package com.frame2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame implements ActionListener {
    private JButton btn;
    private JButton btn2;
    public MyFrame2() {
        super("Sales Invoice Generator");
        setLayout(new FlowLayout());

        btn = new JButton("Ok");
        add(btn);

       // MyListener L = new MyListener();
        btn.addActionListener(this);

        btn2 = new JButton("Close");
        add(btn2);

       // MyListener N = new MyListener();
        btn2.addActionListener(this);

        setSize( 800, 700);
        setLocation( 600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Welcome swing events", "INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
    }
}
