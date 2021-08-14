package baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_15829 {
    static int r = 31;
    static int MOD = 1234567891;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        long sum = 0;
        String str = br.readLine();
        for(int i=0;i<x;i++){
            sum += (str.charAt(i)-'1'+1)*pow(r,i);
        }
        System.out.println(sum%MOD);
    }
    static long pow(int a, int b){
        return b==0?1:a*pow(a,b-1)%MOD;
    }
}
