package baekjoon.Math;


import java.util.Arrays;
import java.util.Scanner;

public class S5_1037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int max = arr[cnt-1];
        int min = arr[0];
        System.out.println(max*min);
    }
}
