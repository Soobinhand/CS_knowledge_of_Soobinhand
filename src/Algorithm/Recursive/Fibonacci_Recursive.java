package Algorithm.Recursive;

public class Fibonacci_Recursive {

    public int f(int n){
        if(n==0)
            return 0;
        else if (n==1){
            return 1;
        }
        else{
            return f(n-1) + f(n-2);
        }
    }

    public static void main(String[] args) {
        Fibonacci_Recursive ff = new Fibonacci_Recursive();
        System.out.println(ff.f(8));
    }
}
