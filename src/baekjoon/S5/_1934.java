package baekjoon.S5;

import java.util.Scanner;

public class _1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = gcd(b,c);

            sb.append(b*c/d).append("\n");
        }
        System.out.println(sb);
    }
    public static int gcd(int p, int q){
        if(q==0) return p;
        return gcd(q,p%q);
    }
}
