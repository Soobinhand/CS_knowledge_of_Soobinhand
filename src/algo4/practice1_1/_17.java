package algo4.practice1_1;

public class _17 {
    public static void main(String[] args){
        System.out.println(exR2(1));
    }

    public static String exR2(int n){
        String s = exR2(n-3) + n + exR2(n-2) + n;

        if(n<=0) return "";

        return s;
    }
}

//에러가 뜨는 이유는 if 문이 아래에 있기 때문임.
//그래서 n이 평생 들어감. 무한함.
//종료 조건에 도달할 수가 없음.