package algo4.practice1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class _2 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        for(int i=0;i<a;i++){
            Interval1D p = new Interval1D(StdIn.readDouble(),StdIn.readDouble());
            Interval1D l = new Interval1D(StdIn.readDouble(),StdIn.readDouble());
            boolean q = p.intersects(l);
            if(q){
                StdOut.println("yes");
            }
            else
                StdOut.println("no");
        }
    }
}

//x 가 더 작아야함.
//교차하는지는 두 점을 비교해야함.
//p 선분과 l 선분이 겹치는지?
