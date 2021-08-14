package baekjoon.Brute_Force;

import java.util.Scanner;

public class S4_1065 {
    public static int as(int num){
        int cnt = 0;
        if(num < 100){
            return num;
        }else{
            cnt = 99;
            if(num==1000){
                num = 999;
            }
            for(int i=100;i<=num;i++){
                int hundred = i / 100;
                int ten = (i/10)%10;
                int one = i%10;
                if((hundred-ten)==(ten-one)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(as(sc.nextInt()));
        sc.close();
    }
}
