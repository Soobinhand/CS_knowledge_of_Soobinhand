package DesignPattern.Midterm;

public class PepperoniTopping extends AbstractTopping {

    public PepperoniTopping(AbstractPizza abstractPizza) {
        toppingName = ", PepperoniTopping";

        this.abstractPizza = abstractPizza;
    }

    @Override
    public double weight() {
        return abstractPizza.weight() + 25;
    }

    @Override
    public String toString() {
        return abstractPizza.toString() + ", PepperoniTopping";
    }
}
