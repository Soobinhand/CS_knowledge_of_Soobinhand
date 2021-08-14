package baekjoon.Stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class G4_9935 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String pok = br.readLine();

        String ans = solution(str,pok);
        System.out.println((ans.length()==0) ? "FRULA" : ans);
    }

    private static String solution(String str, String pok){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));

            if(stack.size() >= pok.length()){
                boolean flag = true;
                for(int j=0;j<pok.length();j++){
                    if(stack.get(stack.size()-pok.length()+j)!=pok.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    for(int j=0;j<pok.length();j++){
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character character:stack){
            sb.append(character);
        }
        return sb.toString();
    }
}
