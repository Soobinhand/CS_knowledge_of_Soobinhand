package algo4.practice1_3;


import java.util.Stack;

public class _7 {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("son");
        stack.push("soo");
        stack.push("bin");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }


}

//peek 메소드는 스택의 가장 위의 있는 요소를 반환하는 메소드임.
//그래서 stack[top] 을 반환해주면 됨.
