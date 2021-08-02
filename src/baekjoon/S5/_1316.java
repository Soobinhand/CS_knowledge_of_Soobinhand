package baekjoon.S5;

import java.util.Scanner;

public class _1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer = a;
        for(int i = 0;i<a;i++){
            String word = sc.next();
            boolean[] check = new boolean[26];

            for(int j=1;j<word.length();j++){
                if(word.charAt(j-1) != word.charAt(j)){
                    if(check[word.charAt(j) - 97]){
                        answer--;
                        break;
                    }
                    check[word.charAt(j-1)-97]=true;
                }
            }
        }
        System.out.println(answer);
    }
}
