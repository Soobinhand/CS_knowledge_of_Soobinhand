package baekjoon.String;

import java.util.*;
public class B2_2744 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";
        for(int i=0;i<a.length();i++){
            int tmp = (int)(a.charAt(i));
            if((65<=tmp)&&(tmp<=90)){
                b+=(char)(tmp+32);
            }
            else if((97<=tmp)&&(tmp<=122)){
                b+=(char)(tmp-32);
            }
        }
        System.out.println(b);

    }
}