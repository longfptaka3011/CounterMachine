package view;

import controller.CounterListener;
import model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame  {
    private CounterModel counterModel;
    private JButton jbutton_up;
    private JButton jbutton_down;
    private JLabel  jLabel_value;
    // De xuat ra gia tri tren man hinh


    public CounterView(){
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    public  void init(){
        this.setTitle("Counter Machine");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new CounterListener(this);


        jbutton_down = new JButton("DOWN");
        jbutton_down.addActionListener(ac);

        jbutton_up = new JButton("UP");
        jbutton_up.addActionListener(ac);

        jLabel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);
        // Label chi nhan duoc text

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jbutton_up, BorderLayout.WEST);
        jPanel.add(jbutton_down, BorderLayout.EAST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);

    }
    public void up(){
        this.counterModel.up();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
    public void down(){
        this.counterModel.down();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }

}
