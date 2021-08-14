package baekjoon.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S3_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int sum = 0;
        for(int i=list.size()-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                sum+=list.get(j);
            }
        }
        System.out.println(sum);
    }
}
