package DesignPattern.Decorator.StarBuzz;

public class Decaf extends Beverage{

    public Decaf(){
        description = "Decar Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
