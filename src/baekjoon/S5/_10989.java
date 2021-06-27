package baekjoon.S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[] b = new int[a];

        for(int i=0;i<a;i++){
            b[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(b);

        for(int i : b){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
