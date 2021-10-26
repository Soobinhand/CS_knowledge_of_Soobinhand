package DesignPattern.Midterm;

public class Main {
    public static void main(String[] args) {
        System.out.println("치즈 피자 생성. 중량: 280");
        AbstractPizza pizza1 = new CheesePizza();
        // 치즈 토핑 추가
        System.out.println("치즈 토핑 추가. 중량: 40 추가");
        pizza1 = new ExtraCheeseTopping(pizza1);
        System.out.println(pizza1);
        System.out.println("Weight: " + pizza1.weight());
        // 양파 토핑 추가
        System.out.println("양파 토핑 추가. 중량: 30 추가");
        pizza1 = new OnionTopping(pizza1);
        System.out.println(pizza1);
        System.out.println("Weight: " + pizza1.weight());
        // 파인애플 토핑 추가
        System.out.println("파인애플 토핑 추가. 중량: 45 추가");
        pizza1 = new PineappleTopping(pizza1);
        System.out.println(pizza1);
        System.out.println("Weight: " + pizza1.weight());

        System.out.println("\n콤비네이션 피자 생성. 중량: 300");
        AbstractPizza pizza2 = new CombinationPizza();

        System.out.println("치즈 토핑 추가. 중량: 40 추가");
        pizza2 = new ExtraCheeseTopping(pizza2);
        System.out.println(pizza2);
        System.out.println("Weight: " + pizza2.weight());

        System.out.println("양파 토핑 추가. 중량: 30 추가");
        pizza2 = new OnionTopping(pizza2);
        System.out.println(pizza2);
        System.out.println("Weight: " + pizza2.weight());

        System.out.println("양파 토핑 추가. 중량: 30 추가");
        pizza2 = new OnionTopping(pizza2);
        System.out.println(pizza2);
        System.out.println("Weight: " + pizza2.weight());

        System.out.println("페퍼로니 토핑 추가. 중량: 25 추가");
        pizza2 = new PepperoniTopping(pizza2);
        System.out.println(pizza2);
        System.out.println("Weight: " + pizza2.weight());
    }
}

