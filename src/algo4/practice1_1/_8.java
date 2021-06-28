package algo4.practice1_1;

import edu.princeton.cs.algs4.StdOut;


public class _8 {
    public static void main(String[] args){
        //a
        System.out.println('b');

        //b
        System.out.println('b'+'c');

        //c
        System.out.println((char)('a'+4));


    }
}

//a는 b (하나의 문자이므로 그냥 그거 출력함)
//b는 197 (이건 연산자가 끼어있어서, 해당 문자의 아스키 코드, 즉 b는 98 c는 99 라서 두개 합하면 197임.
//c는 e (일단 char 로 형변환을 함. 안 한다면 101이 나옴.)
//즉 그냥 문자끼리 더하거나 하면 숫자가 나오고 그 앞에 char 로 형 변환을 해주면 문자로 나옴.
