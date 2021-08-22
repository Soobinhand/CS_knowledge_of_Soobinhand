package baekjoon.String;

import java.util.*;

public class S4_1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            String s = sc.next();
            set.add(s);
        }
        for (int i=0;i<m;i++){
            String s = sc.next();
            if (set.contains(s)){
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (String s:list){
            System.out.println(s);
        }
    }
}
