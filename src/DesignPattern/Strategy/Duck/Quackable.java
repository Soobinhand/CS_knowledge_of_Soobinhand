package DesignPattern.Strategy.Duck;

public interface Quackable {
    default void quack(){
        System.out.println("quack");
    }
}
