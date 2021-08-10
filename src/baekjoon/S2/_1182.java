package baekjoon.S2;

import java.util.Scanner;

public class _1182 {
    static int n,s,answer;
    static int[] nums;

    static void rec_func(int k, int value){
        if(k == n+1){
            if(value == s) answer++;
        }else{
            rec_func(k+1,value+nums[k]);
            rec_func(k+1,value);

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        nums = new int[n+1];
        for(int i=1;i<=n;i++){
            nums[i] = sc.nextInt();
        }
        rec_func(1,0);
        if(s==0){
            answer--;
        }
        System.out.println(answer);


    }

}
