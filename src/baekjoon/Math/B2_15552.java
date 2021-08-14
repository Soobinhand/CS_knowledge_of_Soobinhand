package baekjoon.Math;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class B2_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bf.readLine()); // 입력 개수
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
            bw.flush();
        }
        bw.flush();
        bw.close();
    }
}