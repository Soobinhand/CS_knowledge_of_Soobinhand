package DesignPattern.practice;

import java.util.Scanner;

public class Plus_Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        A a = new A(n);
        A b = new B(m);

        Plus o = new Plus();

        System.out.println(o.p(a.v(),b.v()));
    }


}
