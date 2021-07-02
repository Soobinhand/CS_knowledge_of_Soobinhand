package algo4.practice1_1;

public class _18 {
    public static void main(String[] args){
        System.out.println(mystery(2,10));
    }
    public static int mystery(int a, int b){
        if(b==0) return 1;
        if(b%2==0) return mystery(a*a,b/2);
        return mystery(a*a,b/2)*a;
    }
}

//mystery(2,25)의 값은 50
//mystery(3,11)의 값은 33임.
//a,b 가 양의 정수라면 mystery 메서드는 곱셈을 해주는 메서드가 됨.
//모든 + 를 * 로 변경하면 a 의 b 제곱의 형태로 만들어주는 메서드가 됨.

