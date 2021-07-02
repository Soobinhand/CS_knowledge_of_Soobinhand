package algo4.practice1_1;

import edu.princeton.cs.algs4.StdOut;

public class _19 {
    static long[] memo;
    public static long fi(int n){
        if(n<=1)
            return n;
        else if(memo[n]!=0){
            return memo[n];
        }
        else
            return memo[n] = fi(n-1)+fi(n-2);
    }
    public static long F(int N){
        if(N==0) return 0;
        if(N==1) return 1;
        return F(N-1)+F(N-2);
    }

    public static void main(String[] args){
        memo = new long[101];
        for(int N =0;N<90;N++)
            StdOut.println(N+" "+fi(N));
    }
}

//재귀용법을 사용한 피보나치 수열은 굉장히 시간이 오래걸림.
//1시간 이내에 구할 수 있는 최댓값은 안 해봄.
//동적계획법을 사용하여 훨씬 빨리함.
//fi는 동적 계획 법, F는 재귀적 용법.
