package DataStructure;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Flips {
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
        int diff = Math.abs(head - tail);
        System.out.println("head : " + head);
        System.out.println("tail : " + tail);
        System.out.println("diff : " + diff);


    }
}

//동전 던지기. 무작위 확률.
