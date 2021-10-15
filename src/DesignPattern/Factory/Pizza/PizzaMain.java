package DesignPattern.Factory.Pizza;

public class PizzaMain {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a "+pizza.getName()+"\n");
        System.out.println(pizza);


    }
}
