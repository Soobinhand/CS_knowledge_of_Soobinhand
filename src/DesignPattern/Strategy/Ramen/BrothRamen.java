package DesignPattern.Strategy.Ramen;

public class BrothRamen implements Recipe{
    @Override
    public void cook() {
        System.out.println("볶음 라면");
        System.out.println("맛있음");
    }
}
