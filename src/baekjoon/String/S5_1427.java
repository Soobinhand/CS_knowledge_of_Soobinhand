package baekjoon.String;
import java.util.*;
public class S5_1427 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        for(int i = arr.length-1;i>=0;i--)
            System.out.print(arr[i]);
    }
}
