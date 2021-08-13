
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int f(int a){
        if (a==0) return 0;
        if (a==1) return 1;
        else{
            return f(a-1)+f(a-2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(f(sc.nextInt())%10009);


    }
}