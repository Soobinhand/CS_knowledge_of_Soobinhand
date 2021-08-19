package baekjoon.Brute_Force;

import java.util.Scanner;

public class B1_2702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a-->0){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int answer = gcd(b,c);
            int answer1 = b*c/answer;
            System.out.print(answer1+" ");
            System.out.println(answer);

        }
    }
    static int gcd(int p, int q){
        if (q==0) return p;
        return gcd(q,p%q);
    }
}
