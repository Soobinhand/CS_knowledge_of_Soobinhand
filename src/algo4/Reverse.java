package algo4;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args){
        Stack<Integer> stack;
        stack = new Stack<>();
        while(!StdIn.isEmpty())
            stack.push(StdIn.readInt());

        for(int i : stack)
            StdOut.print(i);

    }
}
