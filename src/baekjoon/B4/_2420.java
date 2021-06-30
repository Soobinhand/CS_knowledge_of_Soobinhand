package baekjoon.B4;

import java.util.Scanner;

public class _2420 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long z = Math.abs(a-b);
        System.out.println(z);
    }
}
