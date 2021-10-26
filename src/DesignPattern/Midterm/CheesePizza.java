package DesignPattern.Midterm;

public class CheesePizza extends AbstractPizza{


    @Override
    public double weight() {
        return 280;
    }


    public CheesePizza() {
        str = str + "Cheese Pizza";
    }


}
