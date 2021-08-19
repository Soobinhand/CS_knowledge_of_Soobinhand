package baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1100 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[8][8];
        int cnt = 0;
        for (int i=0;i<arr.length;i++){
            String[] str = br.readLine().split("");
            for (int j=0;j<arr[0].length;j++){
                arr[i][j] = str[j];
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<4;j++){
                if (i%2==0){
                    if (arr[i][2*j].equals("F")){
                        cnt++;
                    }
                }else {
                    if (arr[i][2 * j + 1].equals("F")){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}
