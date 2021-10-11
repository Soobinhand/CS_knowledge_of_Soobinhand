package DesignPattern.Strategy.Duck;

public class Duck_Main {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        MallardDuck d2 = new MallardDuck();
        RedheadDuck d3 = new RedheadDuck();
        RubberDuck d4 = new RubberDuck();
        d1.display();
        d2.display();
        d3.display();
        d4.display();
        //d1.quack();
        d2.quack();
        d3.quack();
        d4.quack();
        //d1.fly();
        d2.fly();
        d3.fly();
        //d4.fly();

    }
}
