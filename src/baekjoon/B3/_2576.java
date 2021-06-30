package baekjoon.B3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2576 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
            if(a[i]%2==1){
                sum +=a[i];
                list.add(a[i]);
            }

        }
        Collections.sort(list);

        if(sum==0){
            System.out.println("-1");
        }
        else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }



    }
}
