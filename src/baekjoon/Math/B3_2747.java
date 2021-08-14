package baekjoon.Math;

import java.util.Scanner;

public class B3_2747 {
    static int[] memo;
    public static int f(int n){
        if(n<=1) return n;
        else if(memo[n]!=0) return memo[n];
        return memo[n] = f(n-1)+f(n-2);
    }
    public static void main(String[] args){
        memo = new int[101];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}
