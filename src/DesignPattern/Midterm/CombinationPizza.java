package DesignPattern.Midterm;

public class CombinationPizza extends AbstractPizza{


    @Override
    public double weight() {
        return 300;
    }

    public CombinationPizza(){
        str = str + "CombinationPizza";
    }
}
