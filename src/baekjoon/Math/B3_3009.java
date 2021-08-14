package baekjoon.Math;

import java.util.ArrayList;
import java.util.Scanner;

public class B3_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int x = x1;
        int y = y1;

        if(x1==x2){
            x = x3;
        }
        if(x1==x3){
            x = x2;
        }
        if(y1==y2){
            y=y3;
        }
        if(y1==y3){
            y=y2;
        }
        System.out.println(x+" "+y);
    }
}
