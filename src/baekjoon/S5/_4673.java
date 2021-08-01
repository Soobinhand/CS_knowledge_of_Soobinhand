package baekjoon.S5;

public class _4673 {
    public static int self(int n){
        int sum = n;
        while (n != 0){
            sum = sum + (n%10);
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for(int i=1;i<10001;i++){
            int n = self(i);
            if(n<10001){
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<10001;i++){
            if(!check[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
