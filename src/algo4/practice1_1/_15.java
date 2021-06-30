package algo4.practice1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _15 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int[] a = new int[m];
        for(int i=0;i<m;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println((histogram(a, m)));

    }

    public static int histogram(int[] a, int M){
        int count = 0;
        for(int i=0;i<M;i++){
            if(a[i]==i){
                count++;
            }
        }

        return count;
    }
}

//정수 i 가 몇 번 등장했는지 그 횟수는 count 하면 됨.
//a[i] = i