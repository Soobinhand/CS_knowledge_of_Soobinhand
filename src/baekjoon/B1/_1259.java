package baekjoon.B1;


import java.util.Scanner;

public class _1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String n = sc.next();
            if(n.equals("0")) System.exit(0);

            String[] arr = new String[n.length()];
            String[] arr2 = new String[n.length()];
            for(int i=0;i<n.length();i++){
                arr[i] = n.substring(i,i+1);
            }//arr[1,2,1]

            for(int i=0;i<n.length();i++){
                arr2[i] = arr[n.length()-1-i];
            }

            int count = 0;
            for(int i=0;i<n.length();i++){
                if(arr[i].equals(arr2[i]))
                    count++;
            }

            if(count==n.length())
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
