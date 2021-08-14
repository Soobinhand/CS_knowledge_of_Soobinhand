package baekjoon.Brute_Force;

import java.util.Scanner;

public class G5_9663 {
    static int n, answer;
    static int[] col;

    static boolean attackable(int r1, int c1, int r2, int c2){
        if(c1 == c2) return true;
        if(r1 - c1 == r2 - c2) return true;
        if(r1 + c1 == r2 + c2) return true;
        return false;
    }




    static void rec_func(int row){
        if(row == n+1){
            answer++;
        }else{
            for (int i = 1;i<=n;i++){
                boolean possible = true;
                for(int j=1;j<=row-1;j++){
                    if (attackable(row, i, j, col[j])){
                        possible = false;
                        break;
                    }
                }
                if (possible) {


                    col[row] = i;
                    rec_func(row + 1);
                    col[row] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        col = new int[n+1];
        rec_func(1);
        System.out.println(answer);
    }
}
