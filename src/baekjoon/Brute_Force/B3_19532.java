package baekjoon.Brute_Force;

import java.util.Scanner;

public class B3_19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int x = ((c*e)-(b*f))/((a*e)-(d*b));
        int y = ((c*d)-(a*f))/((b*d)-(a*e));
        System.out.println(x+" "+y);
    }
}
