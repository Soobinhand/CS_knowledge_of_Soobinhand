package baekjoon.S3;

import java.util.Scanner;

public class _15651 {
    static int N, M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    static void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M+1];
    }

    static void rec_func(int k){
        if(k == M+1){
            for (int i=1;i<=M;i++){
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');

        }else{
            for (int i=1;i<=N;i++){
                selected[k] = i;
                rec_func(k+1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(sb.toString());
    }
}
