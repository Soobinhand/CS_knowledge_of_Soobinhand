package algo4.practice1_1;

import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(br.readLine());
        double y = Double.parseDouble(br.readLine());
        if(x>=0 && x<=1 && y>=0 && y<=1){
            StdOut.println("true");
        }
        else
            StdOut.println("false");


    }
}

//답은 위의 코드와 같음.
//readLine 을 작성하려면 throws IOException 을 작성해야함.