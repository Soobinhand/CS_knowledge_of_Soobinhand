package baekjoon.DP;

import java.util.Scanner;

public class S3_1463 {
    static Integer[] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        dp = new Integer[a+1];
        dp[0] = dp[1] = 0;
        System.out.println(recur(a));



    }



    public static int recur(int a){
        if(dp[a]==null){
            if(a%6==0){
                dp[a] = Math.min(recur(a-1),Math.min(recur(a/3),recur(a/2)))+1;
            }
            else if(a%3==0){
                dp[a] = Math.min(recur(a/3),recur(a-1))+1;
            }
            else if(a%2==0){
                dp[a] = Math.min(recur(a/2),recur(a-1))+1;
            }
            else
                dp[a] = recur(a-1)+1;
        }
        return dp[a];
    }
}
