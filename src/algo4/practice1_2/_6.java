package algo4.practice1_2;

import edu.princeton.cs.algs4.StdOut;

public class _6 {
    public static boolean isc(String s, String t){
        return s.length()==t.length()&& (s + s).contains(t);
    }
    public static void main(String[] args){
        String s = "ACTGACG";
        String a = "TGACGAQ";
        StdOut.println(isc(s,a));

    }
}

//두번 돌리면 그 중에 원형은 있으니깐 저 식이 가능함.
