package model;

import view.CounterView;

import javax.swing.*;

public class test {

    public static void main(String[] args) {
        CounterModel ct = new CounterModel();
        System.out.println(ct.getValue());
        CounterView ctv = new CounterView();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new CounterView();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    }

