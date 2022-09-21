package com.frame;

import  javax.swing.*;

public class MyFrame {
    public  static void main (String[] args){
        JFrame f = new JFrame("My First frame tittle");
        f.setSize( 800 , 700);
        f.setLocation( 600 , 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);



    }
}
