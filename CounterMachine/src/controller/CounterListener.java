package controller;

import view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    private CounterView ctv;

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println("You clicked the button "+src);
        if(src.equals("UP")){
            this.ctv.up();
        }else if (src.equals("DOWN")){
            this.ctv.down();
        }

    }

    public CounterListener(CounterView ctv) {
        this.ctv = ctv;
    }

}
