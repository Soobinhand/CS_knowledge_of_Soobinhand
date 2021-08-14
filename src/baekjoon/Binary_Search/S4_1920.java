package baekjoon.Binary_Search;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class S4_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int num = sc.nextInt();
            int left = 0;
            int right = a.length - 1;
            boolean flag = false;
            while(left <= right){
                int midIndex = (left+right)/2;
                int midVal = a[midIndex];
                if(midVal > num){
                    right = midIndex - 1;
                }else if(midVal < num){
                    left = midIndex+1;
                }else{
                    flag = true;
                    System.out.println(1);
                    break;
                }
            }
            if(!flag)
                System.out.println(0);
        }

    }
}
