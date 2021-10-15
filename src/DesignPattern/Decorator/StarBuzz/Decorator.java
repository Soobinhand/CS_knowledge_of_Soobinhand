package DesignPattern.Decorator.StarBuzz;

public abstract class Decorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
}
