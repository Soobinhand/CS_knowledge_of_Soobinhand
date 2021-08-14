package baekjoon.Impl;

import java.util.Scanner;

public class B3_2443 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =a;i>0;i--){
            for(int j=0;j<a-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
