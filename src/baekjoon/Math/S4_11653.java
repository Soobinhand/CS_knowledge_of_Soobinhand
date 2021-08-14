package baekjoon.Math;

import java.util.Scanner;

public class S4_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=2;i<=Math.sqrt(a);i++){
            while (a%i==0){
                System.out.println(i);
                a/=i;
            }
        }
        if(a!=1){
            System.out.println(a);
        }
    }
}
