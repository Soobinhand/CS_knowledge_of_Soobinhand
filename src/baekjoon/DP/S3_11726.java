package baekjoon.DP;

import java.util.Scanner;

public class S3_11726 {
    static int[] dp = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i=4;i<dp.length;i++){
            dp[i] = (dp[i-1]+dp[i-2])%10007;
        }
        System.out.println(dp[n]);
    }
}
