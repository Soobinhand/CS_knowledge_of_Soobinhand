package baekjoon.String;

import java.util.Scanner;

public class B2_4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str1 = sc.next();

        if (str.length()<str1.length()){
            System.out.println("no");
        }else
            System.out.println("go");
    }
}
