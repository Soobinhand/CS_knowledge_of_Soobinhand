package baekjoon.String;

import java.util.Scanner;

public class B3_2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.equals("A+")){
            System.out.println("4.3");
        }else if (str.equals("A0")){
            System.out.println("4.0");
        }else if (str.equals("A-")){
            System.out.println("3.7");
        }else if (str.equals("B+")){
            System.out.println("3.3");
        }else if (str.equals("B0")){
            System.out.println("3.0");
        }else if (str.equals("B-")){
            System.out.println("2.7");
        }else if (str.equals("C+")){
            System.out.println("2.3");
        }else if (str.equals("C0")){
            System.out.println("2.0");
        }else if (str.equals("C-")){
            System.out.println("1.7");
        }else if (str.equals("D+")){
            System.out.println("1.3");
        }else if (str.equals("D0")){
            System.out.println("1.0");
        }else if (str.equals("D-")){
            System.out.println("0.7");
        }else if (str.equals("F")){
            System.out.println("0.0");
        }
    }
}
