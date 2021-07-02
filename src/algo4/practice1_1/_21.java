package algo4.practice1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        double d = (double)b/c;
        System.out.printf("%s\n%d\n%d\n%.3f",a,b,c,d);
    }
}

//소수점 셋째 자리를 나타내려면 .3f 이런식으로 해야한다.
