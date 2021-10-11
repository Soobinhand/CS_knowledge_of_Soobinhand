package DesignPattern.Strategy.Ramen;

public class GeneralRamen implements Recipe{

    @Override
    public void cook() {
        System.out.println("일반 라면");
    }
}
