package DesignPattern.Strategy.Duck;

public class Duck {
    private Flyable flyable;
    private Quackable quackable;
    void swim(){
        System.out.println("swimming");
    }
    void display(){
        System.out.println("Duck");
    }
    void setQuackable(Quackable quackable){
        this.quackable = quackable;
    }
}
