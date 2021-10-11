package DesignPattern.Strategy.Ramen;

public class Ramen_Main {
    public static void main(String[] args) {
        Ramen ramen = new Ramen();
        ramen.setRecipe(new MilkRamen());
        ramen.performCook();
    }
}
