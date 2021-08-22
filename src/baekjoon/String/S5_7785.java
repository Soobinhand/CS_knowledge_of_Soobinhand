package baekjoon.String;

import java.util.*;

public class S5_7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();

        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            String name = sc.next();
            String log = sc.next();

            if (log.equals("enter")){
                set.add(name);
            }
            else set.remove(name);
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        ListIterator<String> i = list.listIterator(list.size());
        while (i.hasPrevious()){
            System.out.println(i.previous());
        }

    }
}
