package algo4.practice1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(lg(N));


    }


    public static int lg(int a){
        a = (int) (Math.log(a)/Math.log(2));
        return a;
    }
}

//밑이 a인 로그 값을 계산하고 싶다면
//Math.log(10)/Math.log(a) 로 계산하면 됨.
//이건 근데 실수 형이라서 정수로 형변환 하던가 해야함. 그냥 실수형으로 만들어도 됨.
