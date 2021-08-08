package baekjoon.S2;

import java.util.Scanner;

public class _1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] res = new boolean[n+1];
        for(int i=2;i<=n;i++){
            res[i] = true;//일단 다 소수라고 두는 것임.
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(res[i]){
                for(int j=2;i*j<=n;j++){
                    res[i*j] = false;
                }
            }
        }//이 식이 소수 구하는 식
        for(int i=m;i<=n;i++){
            if (res[i])
                System.out.println(i);
        }

    }
}
