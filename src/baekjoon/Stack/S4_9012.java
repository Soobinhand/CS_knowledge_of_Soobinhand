package baekjoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int i;
        while(a-->0){
            boolean isVPS = true;
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            char c;
            for(i=0;i<input.length();i++){
                c = input.charAt(i);
                if(c=='('){
                    stack.push(c);
                }
                else if(c==')'){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                    else {
                        isVPS = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) isVPS=false;
            if(isVPS)
                System.out.println("YES");
            else
                System.out.println("NO");

        }


    }
}
