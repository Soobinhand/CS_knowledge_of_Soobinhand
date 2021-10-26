package DesignPattern.Midterm;

public class ExtraCheeseTopping extends AbstractTopping {

    public ExtraCheeseTopping(AbstractPizza abstractPizza) {
        this.abstractPizza = abstractPizza;
    }

    @Override
    public double weight() {
        return abstractPizza.weight() + 40;
    }

    @Override
    public String toString() {
        return abstractPizza.toString() + ", extra pizza topping";
    }
}
