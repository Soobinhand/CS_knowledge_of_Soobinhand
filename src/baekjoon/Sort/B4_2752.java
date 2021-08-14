package baekjoon.Sort;

import java.util.*;

public class B4_2752 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] q = new int[3];
        q[0] = sc.nextInt();
        q[1] = sc.nextInt();
        q[2] = sc.nextInt();
        Arrays.sort(q);
        for(int i=0;i< q.length;i++){
            System.out.print(q[i]+" ");
        }


    }
}