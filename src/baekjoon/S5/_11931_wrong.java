package baekjoon.S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _11931_wrong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.reverse(list);
        for(int i:list){
            sb.append(i).append('\n');
        }
        System.out.println(sb);

    }
}
