package algo4.practice1_2;

import java.util.Arrays;

public class _8 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] t = a;
        a = b;
        b = t;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(t));
    }
}

//이 메서드는 두 변수를 서로 바꿔주는 메소드이다.
//이 이상으로 효율적으로 될 수는 없다고 한다.