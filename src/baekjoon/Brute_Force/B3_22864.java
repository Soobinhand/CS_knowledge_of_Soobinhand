package baekjoon.Brute_Force;

import java.util.Scanner;

public class B3_22864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int pirodo = 0;
        for (int i=1;i<=24;i++){

            if (pirodo + a <= m){
                pirodo += a;
                cnt += b;
            }else{
                pirodo -= c;
                if (pirodo<0) pirodo = 0;
            }


        }
        System.out.println(cnt);
    }
}
