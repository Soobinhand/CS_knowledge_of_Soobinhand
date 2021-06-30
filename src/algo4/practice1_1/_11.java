package algo4.practice1_1;

public class _11 {
    public static void main(String[] args){
        boolean[][] a = {
                {true,true},
                {false,true},
                {false,true}
        };

        int row = a.length;
        int col = a[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j])
                    System.out.println(i+"행"+j+"열: "+"*");
                else
                    System.out.println(i+"행"+j+"열: "+" ");
            }
        }
    }
}

//이차원 배열 정석.
//row 는 a.length 로
//col 은 a[0].length 로.
