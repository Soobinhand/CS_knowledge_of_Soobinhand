package baekjoon.DP;

import java.util.Scanner;

public class S1_15991 {
    static long[] dp = new long[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 2;
        dp[4] = 3;
        dp[5] = 3;
        dp[6] = 6;
        for (int i=7;i<100001;i++){
            dp[i] = (dp[i-2]+dp[i-4]+dp[i-6])%1000000009;
        }
        for (int i=0;i<a;i++){
            int b = sc.nextInt();
            System.out.println(dp[b]);
        }
    }
}
