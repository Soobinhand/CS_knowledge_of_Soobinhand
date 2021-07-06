package algo4.practice1_2;

public class _7 {
    public static String mystery(String s){
        int N = s.length();
        if(N<=1) return s;
        String a = s.substring(0,N/2);
        String b = s.substring(N/2,N);
        return mystery(b)+mystery(a);
    }
    public static void main(String[] args){
        String a = "soobinhand";
        System.out.println(mystery(a));
    }
}

//mystery 는 문자열을 거꾸로 만들어주는 메소드임.