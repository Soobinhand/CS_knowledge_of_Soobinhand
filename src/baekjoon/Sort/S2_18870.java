package baekjoon.Sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S2_18870 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = Integer.parseInt((input[i]));
        }

        int[] sortarr = arr.clone();
        Arrays.sort(sortarr);

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int n:sortarr){
            if(!map.containsKey(n)){
                map.put(n,index++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int n:arr)
            sb.append(map.get(n)).append(' ');
        System.out.println(sb.toString());
    }
}
