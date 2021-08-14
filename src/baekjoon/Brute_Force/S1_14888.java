package baekjoon.Brute_Force;

import sun.nio.cs.ext.MacHebrew;

import java.util.Scanner;

public class S1_14888 {
    static int n,max, min;
    static int[] nums, operators, order;
    static StringBuilder sb = new StringBuilder();

    static int calc(){
        int value = nums[1];
        for(int i=1;i<=n;i++){
            if(order[i] == 1)
                value = value + nums[i+1];
            if(order[i] == 2)
                value = value - nums[i+1];
            if(order[i] == 3)
                value = value * nums[i+1];
            if(order[i] == 4)
                value = value / nums[i+1];
        }
        return value;
    }

    static void rec_func(int k){
        if(k == n){
            int value = calc();
            max = Math.max(max, value);
            min = Math.min(min,value);
        }else{
            for (int i = 1; i<=4;i++){
                if (operators[i] >= 1){
                    operators[i]--;
                    order[k] = i;
                    rec_func(k+1);
                    operators[i]++;
                    order[k] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nums = new int[n+1];
        operators = new int[5];
        order = new int[n+1];
        for(int i=1;i<=n;i++){
            nums[i] = sc.nextInt();
        }
        for(int i=1;i<=4;i++){
            operators[i] = sc.nextInt();
        }
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        rec_func(1);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }
}
