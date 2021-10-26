package DesignPattern.Midterm;

public class OnionTopping extends AbstractTopping {

    public OnionTopping(AbstractPizza abstractPizza) {
        this.abstractPizza = abstractPizza;
    }

    @Override
    public double weight() {
        return abstractPizza.weight() + 30;
    }

    @Override
    public String toString() {
        return abstractPizza.toString() + ", onion topping";
    }
}
