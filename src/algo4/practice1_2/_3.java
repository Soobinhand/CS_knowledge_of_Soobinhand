package algo4.practice1_2;

import edu.princeton.cs.algs4.*;

public class _3 {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double mid = Double.parseDouble(args[2]);
        double max = Double.parseDouble(args[3]);
        int  cnt = 0;
        for(int i=0;i<N;i++){
            double x = StdRandom.uniform(min,mid);
            double y = StdRandom.uniform(mid,max);
            double w = StdRandom.uniform(min,mid);
            double z = StdRandom.uniform(mid,max);
            Interval1D l = new Interval1D(x,y);
            Interval1D k = new Interval1D(w,z);
            Interval2D m = new Interval2D(l,k);
            Interval2D n = new Interval2D(l,k);
            if(m.intersects(n)){
                cnt++;
            }
            m.draw();
            StdOut.println(m);
        }
        StdOut.println(cnt);

    }
}

//이러한 함수들을 언젠가 쓸 날이 올거야.
