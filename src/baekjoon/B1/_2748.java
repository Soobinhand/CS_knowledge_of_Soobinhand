package baekjoon.B1;

import java.util.Scanner;

public class _2748 {

    static long[] memo;

    public static void main(String[] args){
        memo = new long[101];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F(n));
    }

    public static long F(int n){
        if(n<=1)
            return n;
        else if(memo[n]!=0)
            return memo[n];
        else
            return memo[n] = F(n-1)+F(n-2);
    }
}