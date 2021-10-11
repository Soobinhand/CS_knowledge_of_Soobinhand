package DesignPattern.Strategy.Ramen;

public class MilkRamen implements Recipe{
    @Override
    public void cook() {
        System.out.println("우유 라면");
    }
}
