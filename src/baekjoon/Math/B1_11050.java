package baekjoon.Math;

import java.util.Scanner;

public class B1_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 1;
        int d = 1;
        for(int i=a;i>a-b;i--){
            c *=i;
        }
        for(int i=b;i>0;i--){
            d *= i;
        }
        int e = c/d;
        System.out.println(e);
    }
}
