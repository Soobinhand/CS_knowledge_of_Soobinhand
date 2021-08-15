package baekjoon.Math;

import java.util.Scanner;

public class B4_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[2];
        int amin = 2001;
        int bmin = 2001;

        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
            amin = Math.min(a[i],amin);
        }
        for (int i=0;i<b.length;i++){
            b[i] = sc.nextInt();
            bmin = Math.min(b[i],bmin);
        }

        int c = amin+bmin -50;
        System.out.println(c);




    }
}
