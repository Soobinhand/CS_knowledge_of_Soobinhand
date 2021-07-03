package algo4.practice1_1;

public class _25 {
    public static int gcd(int p, int q){
        if(q==0) return p;
        int r = p%q;
        return gcd(q,r);
    }
    public static void main(String[] args){
        System.out.println(gcd(3,12));
    }
}

//유클리드 알고리즘을 수학적 귀납법을 이용해 증명하라!
//모르겠다.
