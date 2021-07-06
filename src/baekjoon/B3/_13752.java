package baekjoon.B3;

import java.util.Scanner;

public class _13752 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b[i];j++){
                System.out.print("=");
            }
            System.out.println();
        }

    }
}
