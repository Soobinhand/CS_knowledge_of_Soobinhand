package baekjoon.String;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class S4_11656 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i<str.length();i++){
            list.add(str.substring(i));
        }
        Collections.sort(list);
        for (String s:list){
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
