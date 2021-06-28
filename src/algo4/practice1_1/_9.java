package algo4.practice1_1;

import edu.princeton.cs.algs4.StdOut;

public class _9 {
    public static void main(String[] args){
        String s = "";
        int N = 100;
        for(int n = N;n>0;n/=2)
            s = (n%2) + s;
        StdOut.println(s);
    }
}

//2진수를 구하는 공식임. 그것을 문자열에 넣는 방법이고.
//2로 나누고, 그 나머지를 더하고....
