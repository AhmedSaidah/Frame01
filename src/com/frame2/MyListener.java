package com.frame2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Welcome swing events", "INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);

    }
}
