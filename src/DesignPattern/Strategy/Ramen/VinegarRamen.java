package DesignPattern.Strategy.Ramen;

public class VinegarRamen implements Recipe{
    @Override
    public void cook() {
        System.out.println("식초 라면");
    }
}
