package baekjoon.S4;

import java.io.*;
import java.util.*;

public class _10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        List<Integer> que =new ArrayList<>();
        while(n-->0) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            String temp =st.nextToken();
            switch(temp) {
                case "push":
                    que.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(!que.isEmpty()) {
                        System.out.println(que.get(0));
                        que.remove(0);
                    }
                    else {System.out.println(-1);}
                    break;
                case "size":
                    System.out.println(que.size());
                    break;
                case "empty":
                    if(que.isEmpty()) {System.out.println(1);}
                    else {System.out.println(0);}
                    break;
                case "front":
                    if(que.isEmpty()) {System.out.println(-1);}
                    else {
                        System.out.println(que.get(0));}
                    break;
                case "back":
                    if(que.isEmpty()) {System.out.println(-1);}
                    else {
                        System.out.println(que.get(que.size()-1));
                    }
            }
        }


    }
}


