package DesignPattern.Midterm;

public abstract  class AbstractTopping extends AbstractPizza{

    AbstractPizza abstractPizza;

    String toppingName;

    public String getToppingName() {
        return toppingName;
    }

    @Override
    public String toString(){
        return getToppingName();
    };
}
