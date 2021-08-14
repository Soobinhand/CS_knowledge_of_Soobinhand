package baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class S3_7795 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] A = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).sorted().toArray();
            int[] B = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).sorted().toArray();
            int cnt = 0;
            for(int i:A){
                for(int j:B){
                    if(i<=j) break;
                    else cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
