package baekjoon.B3;

import java.util.*;
public class _2446 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for(int i=0;i<2*a-1;i++){
            if(i<a){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<(a-i)*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for (int j=0; j<2*(a-1)-i; j++)
                    System.out.print(" ");
                for (int j=0; j<(i+1-a)*2+1; j++)
                    System.out.print("*");
                System.out.println();
            }


        }
    }
}
