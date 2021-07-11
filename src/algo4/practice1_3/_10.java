package algo4.practice1_3;

import java.util.Scanner;
import java.util.Stack;

public class _10 {
    private static void infixTopostfix(String exp){
        String[] params = exp.split(" ");
        Stack<String> stack = new Stack<>();
        for(int i=0;i< params.length;i++){
            if(isOperator(params[i])){
                stack.push(params[i]);
            }
            else if(params[i].equals("(")){
                continue;
            }
            else if(params[i].equals(")")){
                System.out.print(stack.pop()+" ");
            }
            else{
                System.out.print(params[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            infixTopostfix(sc.nextLine());
        }
    }

    private static boolean isOperator(String s){
        return (s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"));
    }
}
