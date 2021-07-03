package algo4.practice1_1;

public class _24 {
    public static int gcd(int p, int q){
        System.out.println(p+" "+q);
        if(q==0) return p;
        int r = p%q;
        return gcd(q,r);
    }

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(gcd(a,b));
    }
}

//최대 공약수를 구하는 메서드임.
//유클리드 알고리즘!
//명령줄 인수로 숫자를 받게 해서 구했음.
//1111111 1234567의 최대 공약수는 1임.
//105와 24의 최대 공약수는 3.