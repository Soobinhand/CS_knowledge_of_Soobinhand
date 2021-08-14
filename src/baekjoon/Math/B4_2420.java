package baekjoon.Math;

import java.util.Scanner;

public class B4_2420 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long z = Math.abs(a-b);
        System.out.println(z);
    }
}
