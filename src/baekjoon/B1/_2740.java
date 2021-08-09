package baekjoon.B1;

import java.util.Scanner;

public class _2740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] aa = new int[a][b];
        for (int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                aa[i][j] = sc.nextInt();
            }
        }
        b = sc.nextInt();
        int d = sc.nextInt();
        int[][] cc = new int[b][d];
        for (int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                cc[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[a][d];
        for(int i=0;i<a;i++){
            for (int j=0;j<d;j++){
                for(int k=0;k<b;k++){
                    sum[i][j] += aa[i][k] * cc[k][j];
                }
            }
        }
        for(int i=0;i<a;i++){
            for (int j=0;j<d;j++){
                System.out.print(sum[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
