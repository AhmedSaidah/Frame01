package com.ui.table;

import javax.swing.*;

public class TableFrame extends JFrame {
    private  JTable table;
    private String[] cols = {"No.", "Date", "Customer","Total"};
    private String [][] data = {
            {"2", "Ali", "Excellent","120"},
            {"3", " Ibrahim", "Good", "150"},
            {"4","Maher","Very Good", "160"}


    };
    public TableFrame(){
        super (" Sales Invoice Generator");

         table = new JTable(data, cols);
         add(new JScrollPane(table));


        setSize( 400 , 500);
        setLocation( 200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String[] args){
        new TableFrame().setVisible(true);
    }
}
