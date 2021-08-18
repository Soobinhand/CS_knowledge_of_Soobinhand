package baekjoon.Brute_Force;

import java.util.Scanner;

public class B3_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i=1;i<=a;i++){
            if (a%i==0){
                cnt++;
                if (cnt==b){
                    System.out.println(i);
                }
            }
        }
        if (cnt<b)
            System.out.println(0);
    }
}
