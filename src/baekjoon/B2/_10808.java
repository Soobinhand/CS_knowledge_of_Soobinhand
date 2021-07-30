package baekjoon.B2;

import java.util.Arrays;
import java.util.Scanner;

public class _10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] q = new int[26];
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            q[c-97]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<q.length;i++){
            sb.append(q[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
