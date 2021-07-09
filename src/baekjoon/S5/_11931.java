package baekjoon.S5;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class _11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] a = new Integer[Integer.parseInt(br.readLine())];
        for(int i=0;i<a.length;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a, Collections.reverseOrder());
        for(int i:a){
            bw.write(i+"\n");
        }
        bw.flush();
    }
}
