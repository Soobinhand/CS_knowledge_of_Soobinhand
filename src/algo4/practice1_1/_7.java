package algo4.practice1_1;

import edu.princeton.cs.algs4.StdOut;


public class _7 {
    public static void main(String[] args){
        //a
        double t = 9.0;
        while(Math.abs(t-9.0/t)>.001)
            t = (9.0/t+t) / 2.0;
        StdOut.printf("%.5f\n",t);

        //b
        int sum = 0;
        for(int i=1;i<1000;i++){
            for(int j=0;j<i;j++){
                sum++;
            }
        }
        StdOut.println(sum);

        //c
        int sum1 =0;
        for(int i=1;i<1000;i*=2){
            for(int j=0;j<1000;j++)
                sum1++;
        }
        StdOut.println(sum1);
    }
}

//a는 3.00009
//b는 499500 (1부터 999까지의 합)
//c는 10000 (2의 0제곱부터 2의 9제곱까지)
