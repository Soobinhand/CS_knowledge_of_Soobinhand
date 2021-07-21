package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Rolls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        Random random = new Random();
        for(int i=0;i<T;i++){
            if(random.nextBoolean())
                one++;
            else if(random.nextBoolean())
                two++;
            else if(random.nextBoolean())
                three++;
            else if(random.nextBoolean())
                four++;
            else if(random.nextBoolean())
                five++;
            else
                six++;
        }
        System.out.println("1 : "+one);
        System.out.println("2 : "+two);
        System.out.println("3 : "+three);
        System.out.println("4 : "+four);
        System.out.println("5 : "+five);
        System.out.println("6 : "+six);


    }
}

//주사위 던지기. 무작위 확률