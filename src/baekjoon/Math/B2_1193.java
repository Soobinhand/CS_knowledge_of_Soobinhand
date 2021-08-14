package baekjoon.Math;

import java.util.Scanner;

public class B2_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        int n = 0;
        while(true){
            n++;
            cnt += n;
            if(cnt >= a){
                if(n%2==0){
                    System.out.println(a-cnt+n+"/"+(cnt-a+1));
                }else {
                    System.out.println((cnt-a+1)+"/"+(a-cnt+n));
                }
                break;
            }
        }

    }
}
