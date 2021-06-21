package baekjoon.S4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            switch (type){
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if(stack.isEmpty()){
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(stack.pop()).append("\n");
                    break;

                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.isEmpty()?1:0).append("\n");
                    break;

                case "top":
                    if(stack.isEmpty()){
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(stack.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);




    }
}
