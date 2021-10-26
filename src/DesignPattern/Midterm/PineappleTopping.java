package DesignPattern.Midterm;

public class PineappleTopping extends AbstractTopping {

    public PineappleTopping(AbstractPizza abstractPizza) {

        this.abstractPizza = abstractPizza;
    }

    @Override
    public double weight() {
        return abstractPizza.weight() + 45;
    }

    @Override
    public String toString() {
        return abstractPizza.toString() + ", PineappleTopping";
    }
}
