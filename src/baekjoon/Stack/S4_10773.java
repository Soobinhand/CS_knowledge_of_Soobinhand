package baekjoon.Stack;

import java.util.Scanner;
import java.util.Stack;

public class S4_10773 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<a;i++){
            int num = sc.nextInt();
            if(num==0){
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }
        for(int o:stack)
            sum +=o;

        System.out.println(sum);

    }
}
