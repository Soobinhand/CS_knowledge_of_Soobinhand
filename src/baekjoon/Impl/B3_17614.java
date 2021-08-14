package baekjoon.Impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B3_17614 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = "";
        int count = 0;
        char n;

        for(int i=1;i<=a;i++){
            s = Integer.toString(i);

            for(int j=0;j<s.length();j++){
                n = s.charAt(j);
                if(n =='3'||n=='6'||n=='9'){
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(s);

    }
}
