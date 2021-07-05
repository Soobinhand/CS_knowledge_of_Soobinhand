package algo4.practice1_2;

import edu.princeton.cs.algs4.StdOut;

import java.util.Locale;

public class _5 {
    public static void main(String[] args){
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6,11);
        StdOut.println(s);
    }
}

//toUpperCase 나 substring 같은 메소드들은
//저런식으로 쓰면 반영이 안됨. String 은 불변속성을 가지고 있어서.
//따라서 s = s.toUpperCase 이런 식으로 해줘야함.
