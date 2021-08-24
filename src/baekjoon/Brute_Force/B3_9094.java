package baekjoon.Brute_Force;

import java.util.Scanner;

public class B3_9094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int cnt = 0;

            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int a=1;a<n-1;a++){
                for (int b=a+1;b<n;b++){
                    if (((a*a)+(b*b)+m)%(a*b)==0){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }


    }
}
