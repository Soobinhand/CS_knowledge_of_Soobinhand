package DesignPattern.Strategy.Ramen;

public class CheeseRamen implements Recipe{
    @Override
    public void cook() {
        System.out.println("치즈 라면");
    }
}
