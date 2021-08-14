package baekjoon.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S2_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] time = new int[a][2];

        for(int i=0;i<a;i++){
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }else
                    return o1[1] - o2[1];
            }
        });

        int count = 0;
        int prev_end_time = 0;

        for(int i=0;i<a;i++){
            if(prev_end_time <= time[i][0]){
                prev_end_time = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
