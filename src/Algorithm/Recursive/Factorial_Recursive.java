package Algorithm.Recursive;

public class Factorial_Recursive {


    //////////////////////////////////
    public int fac(int n){
        if(n>1){
            return n*fac(n-1);
        }else
            return 1;
    }
    //////////////////////////////////


    public static void main(String[] args) {
        Factorial_Recursive f = new Factorial_Recursive();
        f.fac(4);
        System.out.println(f.fac(5));
    }
}
