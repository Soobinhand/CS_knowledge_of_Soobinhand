package algo4.practice1_1;



import java.util.Arrays;

public class _13 {
    public static void main(String[] args){

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = a.length;
        int col = a[0].length;
        int[][] tmp = new int[col][row];

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                tmp[i][j] = a[row-1-j][i];
                System.out.print(tmp[i][j]);

            }
            System.out.println();
        }
    }
}

//row-1-j가 90도 회전하는데에 큰 역할을 함.
