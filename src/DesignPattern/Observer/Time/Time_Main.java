package DesignPattern.Observer.Time;

import javafx.util.converter.LocalTimeStringConverter;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Time_Main implements Observer,Subject{
    JFrame frame;
    LocalTime localTime = LocalTime.now();
    List<Observer> observers = new ArrayList<>();

    public static void main(String[] args) {

        Time_Main time_main = new Time_Main();
        time_main.go();
    }

    public void go(){
        frame = new JFrame();
        JPanel p =new JPanel();
        p.add(new JLabel());
        frame.getContentPane().add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,300);
        frame.setVisible(true);
    }

    @Override
    public void update(LocalTime localTime) {
        this.localTime  = localTime;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

    }
}
