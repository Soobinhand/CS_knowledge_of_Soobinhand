package algo4.practice1_1;

public class _16 {
    public static void main(String[] args){
        System.out.print(exR1(6));
    }

    public static String exR1(int n){
        if(n<=0) return "";
        return exR1(n-3) + n + exR1(n-2)+ n;
    }
}

//문자열을 더하는 거라서 그냥 더하기랑은 조금 다름.
//숫자를 덧셈하는 게 아니라 이어 붙이는 거임.
//따라서 답은 311361142246
