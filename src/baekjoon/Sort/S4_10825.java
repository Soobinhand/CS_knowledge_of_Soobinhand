package baekjoon.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class S4_10825 {
    static int n;
    static Func[] a;
    static StringBuilder sb = new StringBuilder();
    static class Func implements Comparable<Func>{
        public String name;
        public int korean, english, math;

        @Override
        public int compareTo(Func f){
            if(korean != f.korean) return f.korean - korean;
            if(english != f.english) return english - f.english;
            if(math != f.math) return f.math - math;
            return name.compareTo(f.name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new Func[n];
        for (int i=0;i<n;i++){
            a[i] = new Func();
            a[i].name = sc.next();
            a[i].korean = sc.nextInt();
            a[i].english = sc.nextInt();
            a[i].math = sc.nextInt();

        }
        pro();
    }
    static void pro(){
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            sb.append(a[i].name).append('\n');
        }
        System.out.println(sb.toString());
    }

}
