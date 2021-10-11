package DesignPattern.Strategy.Duck;

public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    void display() {
        System.out.println("MallardDuck");
    }
}
