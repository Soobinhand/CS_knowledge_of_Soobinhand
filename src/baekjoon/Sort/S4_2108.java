package baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S4_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] num = new double[N];
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(br.readLine());

        }
        double sum=0;
        for(double d:num)
            sum+=d;
        System.out.println((int)Math.round(sum/N));
        Arrays.sort(num);
        System.out.println((int)num[N/2]);

        int[] freq = new int[8001];
        for(double d:num)
            freq[(int)d+4000]++;
        int maxF = 0;
        int maxI = 0;
        for(int i=0;i<8001;i++){
            if(freq[i]>maxF){
                maxF=freq[i];
            }
        }
        boolean t = false;

        for(int i=0;i<8001;i++){
            if(freq[i]==maxF){
                if(t){
                    maxI=i-4000;
                    break;
                }
                maxI = i-4000;
                t=true;
            }
        }
        System.out.println(N==1?(int)num[0]:maxI);
        System.out.println((int)(num[N-1]-num[0]));


    }
}
