package baekjoon.Impl;

import java.util.Scanner;

public class B2_2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        if(a==1&&b==2&&c==3&&d==4&&e==5&&f==6&&g==7&h==8){
            System.out.println("ascending");
        }
        else if(h==1&&g==2&&f==3&&e==4&&d==5&&c==6&&b==7&a==8){
            System.out.println("descending");
        }
        else
            System.out.println("mixed");

    }
}
