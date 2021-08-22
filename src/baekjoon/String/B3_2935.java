package baekjoon.String;

import java.math.BigInteger;
import java.util.Scanner;

public class B3_2935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        String str = sc.next();
        BigInteger b = new BigInteger(sc.next());

        if (str.equals("+")){
            System.out.println(a.add(b));
        }
        else if (str.equals("*")){
            System.out.println(a.multiply(b));
        }
    }
}
