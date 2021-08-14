package baekjoon.String;

import java.util.ArrayList;
import java.util.Scanner;

public class B1_10798 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] a = new char[5][15];
        for(int i=0;i<a.length;i++){
            String str = sc.nextLine();

            for(int j=0;j<str.length();j++){
                a[i][j] = str.charAt(j);
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(a[j][i]==' '|| a[j][i]=='\0')
                    continue;
                System.out.print(a[j][i]);
            }
        }



    }
}
