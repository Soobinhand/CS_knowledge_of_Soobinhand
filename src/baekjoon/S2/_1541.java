package baekjoon.S2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = Integer.MAX_VALUE;
        StringTokenizer substract = new StringTokenizer(sc.nextLine(),"-");
        while (substract.hasMoreTokens()){
            int temp = 0;
            StringTokenizer add = new StringTokenizer(substract.nextToken(),"+");
            while (add.hasMoreTokens()){
                temp += Integer.parseInt(add.nextToken());
            }
            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else
                sum -= temp;
        }
        System.out.println(sum);
    }
}
