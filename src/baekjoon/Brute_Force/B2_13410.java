package baekjoon.Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class B2_13410 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;
        for (int i=0;i<b;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(a*(i+1));
            sb.reverse();
            if (Integer.parseInt(String.valueOf(sb))>max){
                max = Integer.parseInt(String.valueOf(sb));
            }

        }
        System.out.println(max);




    }
}
