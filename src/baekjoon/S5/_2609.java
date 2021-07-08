package baekjoon.S5;

import java.util.Scanner;

public class _2609 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(a*b/gcd(a,b));

    }
    public static int gcd(int p,int q){
        if(q==0) return p;
        return gcd(q,p%q);
    }
}
