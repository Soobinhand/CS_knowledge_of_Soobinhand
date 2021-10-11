package DesignPattern.Strategy.Duck;

public class RubberDuck extends Duck implements Quackable{


    @Override
    void display() {
        System.out.println("RubberDuck");
    }


    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
