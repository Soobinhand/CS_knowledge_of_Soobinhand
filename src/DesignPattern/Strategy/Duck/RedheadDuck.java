package DesignPattern.Strategy.Duck;

public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    void display() {
        System.out.println("RedheadDuck");
    }
}
