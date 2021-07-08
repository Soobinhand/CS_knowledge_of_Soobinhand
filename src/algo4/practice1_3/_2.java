package algo4.practice1_3;


import java.util.Stack;


public class _2 {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        String str = "";
        stack.push("it");
        stack.push("was");
        stack.pop();
        stack.push("the");
        stack.push("best");
        stack.pop();
        stack.push("of");
        stack.push("times");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push("it");
        stack.push(" ");
        stack.push("was");
        stack.pop();
        stack.push("the");
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}

//it it