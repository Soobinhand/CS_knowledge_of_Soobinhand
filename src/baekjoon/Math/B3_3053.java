package baekjoon.Math;

import java.util.Scanner;

import static java.lang.Math.PI;

public class B3_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double a = Math.pow(r,2)*PI;
        double b = Math.pow(r,2)*2;
        System.out.printf("%.6f\n",a);
        System.out.printf("%.6f",b);
    }
}
