package baekjoon.S4;

import java.util.Arrays;
import java.util.Scanner;

public class _11652 {
    static int n;
    static long[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new long[n+1];
        for (int i=1;i<=n;i++){
            a[i] = sc.nextLong();
        }
        pro();
    }



    static void pro(){
        Arrays.sort(a,1,n+1);
        long mode = a[1];
        int modeCnt = 1, curCnt = 1;

        for (int i=2;i<=n;i++){
            if (a[i] == a[i-1]){
                curCnt++;
            }else{
                curCnt = 1;
            }
            if (modeCnt < curCnt){
                modeCnt = curCnt;
                mode = a[i];
            }
        }
        System.out.println(mode);
    }
}
