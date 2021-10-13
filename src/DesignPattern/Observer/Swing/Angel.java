package DesignPattern.Observer.Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Angel implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("후회한다 너");
    }
}
