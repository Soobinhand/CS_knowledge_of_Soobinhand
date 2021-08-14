package baekjoon.Impl;

import java.util.Scanner;

public class B3_10824 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();
        String e = a+b;
        String f = c+d;
        long z = Long.parseLong(e);
        long y = Long.parseLong(f);
        long sum = z+y;
        System.out.println(sum);

    }
}
