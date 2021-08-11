package baekjoon.S4;

import java.util.Arrays;
import java.util.Scanner;

public class _1015 {
    static int n;
    static int[] p;
    static Func[] b;
    static StringBuilder sb =  new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = new int[n];
        b = new Func[n];

        for(int i=0;i<n;i++){
            b[i] = new Func();
            b[i].num = sc.nextInt();
            b[i].idx = i;
        }
        pro();
    }

    static class Func implements Comparable<Func>{
        public int num, idx;

        @Override
        public int compareTo(Func f){
            return num - f.num;
        }
    }

    static void pro(){
        Arrays.sort(b);
        for (int i=0;i<n;i++){
            p[b[i].idx] = i;
        }
        for (int i=0;i<n;i++){
            sb.append(p[i]).append(' ');
        }
        System.out.println(sb.toString());
    }
}
