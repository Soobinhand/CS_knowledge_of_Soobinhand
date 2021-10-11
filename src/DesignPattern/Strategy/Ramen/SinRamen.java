package DesignPattern.Strategy.Ramen;

public class SinRamen implements Recipe{
    @Override
    public void cook() {
        System.out.println("신라면");
    }
}
