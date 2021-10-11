package DesignPattern.Strategy.Duck;

public interface Flyable {
    default void fly(){
        System.out.println("flying");
    }

}
