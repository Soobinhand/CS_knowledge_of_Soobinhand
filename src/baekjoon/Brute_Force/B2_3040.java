package baekjoon.Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class B2_3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        StringBuilder sbb = new StringBuilder();
        int sum = 0;
        for (int i=0;i< a.length;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                if(sum-a[i]-a[j]==100){
                    for(int k=0;k<9;k++){
                        if(i==k||j==k)
                            continue;
                        System.out.println(a[k]);
                    }
                    System.exit(0);
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
