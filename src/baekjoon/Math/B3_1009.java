package baekjoon.Math;

import java.util.Arrays;
import java.util.Scanner;

public class B3_1009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a,b,r;
        for(int i=0;i<T;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            r = 1;

            for(int j=0;j<b;j++)
                r=(r*a)%10;
            if(r==0) r=10;
            System.out.println(r);
        }

    }
}
