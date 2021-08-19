package baekjoon.String;

import java.util.Scanner;

public class B2_2902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        char[] carr = str.toCharArray();
        sb.append(carr[0]);
        for (int i=0;i<str.length();i++){
            if (carr[i]=='-'){
                sb.append(carr[i+1]);
            }
        }
        System.out.println(sb);
    }
}
