package algo4.practice1_2;

import edu.princeton.cs.algs4.StdOut;

public class _4 {
    public static void main(String[] args){
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
}

//world
//hello
//이렇게 출력이 됨.
