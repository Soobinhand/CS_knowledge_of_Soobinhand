package baekjoon.Queue;

import java.util.LinkedList;
import java.util.Scanner;

public class S4_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0;i<N;i++){
            list.add(i+1);

        }
       while(N-->1){
            list.poll();
            list.addLast(list.get(0));
            list.poll();
        }

        System.out.println(list.poll());
    }
}
