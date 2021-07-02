package algo4.practice1_1;

public class _20 {
    public static void main(String[] args){
        int a = 4;
        System.out.println(Math.log(fact(a)));
    }

    public static int fact(int n){
        if(n<=1)
            return n;
        else
            return fact(n-1)*n;

    }

}

//작성 완료.
//팩토리얼은 똑같고 로그 함수를 사용해주면 됨.