package com.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ui extends JFrame implements ActionListener {
    private JTextField userNameTF;
    private JPasswordField passwordTF;
    private JTextArea addressTA;

    private JButton btn;



    public ui(){
        super("UI Components");
        setLayout(new FlowLayout());
        userNameTF = new JTextField( 15);
       // JLabel userNameLbl = new JLabel("User Name:");
        add(new JLabel("User Name:"));
        add(userNameTF);
        userNameTF.setText("Welcome");

        passwordTF = new JPasswordField(15);
        add(new JLabel("Password"));
        add(passwordTF);

        addressTA = new JTextArea( 5, 15);
        add(new JLabel("Address"));
        add(addressTA);

        btn = new JButton("Ok");
        btn.addActionListener(this);
        add(btn);


        setSize( 300, 200);
        setLocation( 200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main (String[] args){
        new ui().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = userNameTF.getText();
        char[] passwordChars = passwordTF.getPassword();
        String password = new String(passwordChars);
        String address = addressTA.getText();
        String msg = "User Name: " + userName + " \nPassword: " + password +
                "\nAddress: " + address;
        JOptionPane.showMessageDialog( this ,msg, "Info" , JOptionPane.INFORMATION_MESSAGE);
    }
}
