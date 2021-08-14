package baekjoon.Math;

import java.util.Scanner;

public class S2_1929 {
    public static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        prime = new boolean[n+1];
        get_prime();
        for(int i=m;i<=n;i++)
            if (!prime[i])
                System.out.println(i);


    }

    //소수구하는 에라토스테네스의 체
   public static void get_prime(){
        prime[0] = prime[1] = true;
        for(int i = 2;i<Math.sqrt(prime.length);i++){
            if(prime[i]) continue;
            for(int j=i*i;j<prime.length;j+=i){
                prime[j] = true;
            }
        }
    }
}
