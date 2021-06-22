package baekjoon.B3;
import java.util.*;
public class _2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=9;i++){
            System.out.printf("%d * %d = %d\n",a,i,a*i);
        }
    }
}
