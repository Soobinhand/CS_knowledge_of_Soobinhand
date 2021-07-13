package baekjoon.S3;


import java.util.Scanner;

public class _4375 {

    public static int a(int n){
        int num = 0;
        for(int i=1;;i++){
            num = num*10+1;
            num%=n;
            if(num==0)
                return i;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println(a(n));
        }


    }
}
