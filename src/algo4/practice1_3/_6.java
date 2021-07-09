package algo4.practice1_3;

import edu.princeton.cs.algs4.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class _6 {
    public static void main(String[] args){
        Queue<String> q = new Queue<>();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.enqueue("d");

        for (String s : q)
            System.out.print(s + " ");
        System.out.println();

        Stack<String> stack = new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.dequeue());
        }
        while(!stack.isEmpty()){
            q.enqueue(stack.pop());
        }

        for (String s : q)
            System.out.print(s + " ");
        System.out.println();

    }
}

//거꾸로 출력해주는 메소드임.
