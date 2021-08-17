package baekjoon.Brute_Force;

import java.util.Scanner;

public class S5_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr =new int[a][2];

        for (int i=0;i<arr.length;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i=0;i<a;i++){
            int rank = 1;

            for (int j=0;j<a;j++){
                if (i==j){
                    continue;
                }
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }

    }
}
