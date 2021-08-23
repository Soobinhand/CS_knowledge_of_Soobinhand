package baekjoon.Brute_Force;

import java.util.Scanner;

public class B1_2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=0;i<10;i++){
            int tmp = sum;
            sum = min(sum,sum+sc.nextInt());
            if (tmp==sum) break;
        }
        System.out.println(sum);


    }
    static int min(int sum, int nextsum){
        return Math.abs(100-sum) < Math.abs(100-nextsum) ? sum:nextsum;
    }
}
