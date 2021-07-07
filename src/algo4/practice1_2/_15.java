package algo4.practice1_2;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class _15 {
    public static void main(String[] args){
            String name = "soobinhand";
            System.out.println(Arrays.toString(readAllInts(name)));
    }
    public static int[] readAllInts(String name){
        In in =new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for(int i=0;i< words.length;i++)
            ints[i] = Integer.parseInt(words[i]);
        return ints;
    }
}

//모르겠다.