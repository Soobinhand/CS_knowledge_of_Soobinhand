package algo4.practice1_2;


import edu.princeton.cs.algs4.StdRandom;

import java.awt.geom.Point2D;

public class _1 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        double mini = 1.0;
        for(int i=0;i<a;i++){
            double x = StdRandom.uniform(0.0,1.0);
            double y = StdRandom.uniform(0.0,1.0);
            Point2D p = new Point2D.Double(x,y);
            mini = Math.min(mini,Math.abs(x-y));
            System.out.println(p);
            System.out.println(mini);


        }
        System.out.println(mini);
    }
}

//랜덤 좌표 프로그램임.
//두 점 사이의 거리는 abs 와 min 으로 처리함.
//확인하기 위해서 for 문 안에도 최솟값 출력을 함.