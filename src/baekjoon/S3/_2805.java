package baekjoon.S3;

import java.util.Arrays;
import java.util.Scanner;

public class _2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = sc.nextInt();

        int[] arr = new int[a];

        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 1;
        int right = arr[a-1];
        long h;
        int mid;
        while(left<=right){
            h=0;
            mid = (left+right)/2;

            for(int i=0;i<a;i++){
                if (arr[i] >= mid){
                    h += (arr[i]-mid);
                }
            }
            if(h>=b){
                left = mid+1;
            }else if (h<b){
                right = mid-1;
            }
        }
        System.out.println(right);
    }
}
