package baekjoon.S5;

import java.util.Arrays;
import java.util.Scanner;

public class _11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] b = new int[a][2];
        for(int i=0;i<a;i++){
            b[i][1] = sc.nextInt();
            b[i][0] = sc.nextInt();
        }

        Arrays.sort(b, (e1,e2)->{
            if(e1[0]==e2[0]){
                return e1[1] - e2[1];
            }else{
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<a;i++){
            sb.append(b[i][1]+" "+b[i][0]).append('\n');
        }
        System.out.println(sb);
    }
}
