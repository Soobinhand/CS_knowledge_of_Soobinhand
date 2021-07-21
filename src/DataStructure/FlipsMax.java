package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class FlipsMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int head = 0;
        int tail = 0;
        Random random = new Random();
        for(int i=0;i<T;i++){
            if(random.nextBoolean()){
                head++;
            }else
                tail++;
        }
        if(head > tail)
            System.out.println(head + " head wins");
        else if(head < tail)
            System.out.println(tail + " tail wins");
        else
            System.out.println("tie");



    }
}

//동전 던지기 중 더 큰 수만 출력하기.