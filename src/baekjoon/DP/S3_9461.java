package baekjoon.DP;

import java.util.Scanner;

public class S3_9461 {
    static long[] dp = new long[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for (int i=6;i<101;i++){
            dp[i] = dp[i-1]+dp[i-5];
        }

        for (int i=0;i<n;i++){
            int a = sc.nextInt();
            System.out.println(dp[a]);
        }
    }
}
