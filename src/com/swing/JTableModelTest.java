package com.swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class JTableModelTest implements ActionListener {

    JFrame f;
    JLabel text;
    JTable table;
    Vector<String> title;
    Vector<Vector> out;
    DefaultTableModel model;
    JTextField

    public JTableModelTest(){

        f.setSize(500,500);
        f.setVisible(true);
    }


    public static void main(String[] args){

        new JTableModelTest();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Vector<String> in = new Vector<>();
        in.add(tnum.getText());
        in.add(tname.getText());
        in.add(taddress.getText());

        model.addRow(in);

        tnum.setText("");
        tname.setText("");
        taddress.setText("");
    }
}
