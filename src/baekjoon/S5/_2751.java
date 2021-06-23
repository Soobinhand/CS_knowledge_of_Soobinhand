package baekjoon.S5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2751 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<a;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for(int q : list){
            sb.append(q).append("\n");
        }
        System.out.println(sb);
    }
}
