package algo4.practice1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class _10 {
    int n;
    int max;
    int value;
    int times;

    public _10(int n, int max){
        this.n = n;
        this.max = max;
    }

    public void increment(){
        if(value<=max&&times<=n){
            value++;
            times++;
        }
    }
    public void decrement(){
        if(Math.abs(value)<=max&&times<=n){
            value--;
            times--;
        }
    }
    public void vcDraw(){
        StdDraw.point(times,value);
    }
    public static void main(String[] args){
        _10 vc = new _10(100,30);
        StdDraw.setXscale(0,102);
        StdDraw.setYscale(-vc.max,vc.max);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.RED);
        for(int i=0;i<100;i++){
            if(StdRandom.bernoulli(0.5)){
                vc.increment();
            }
            else
                vc.decrement();
            StdDraw.point(vc.times,vc.value);
        }
    }
}
