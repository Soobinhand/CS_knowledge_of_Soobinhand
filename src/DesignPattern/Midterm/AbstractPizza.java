package DesignPattern.Midterm;

public abstract class AbstractPizza {


    String str = "Pizza Type: ";
    @Override
    public String toString() {
        return str;
    }

    public abstract double weight();
}
