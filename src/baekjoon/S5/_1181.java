package baekjoon.S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class _1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();//어레이리스트를 한번에 안쓴 이유 : 중복제거용이라.set이
        for(int i=0;i<a;i++){
            set.add(br.readLine());
        }
        ArrayList<String> list= new ArrayList<>(set);
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }
                else if(o1.length()<o2.length()){
                    return -1;
                }
                else{
                    return o1.compareTo(o2);
                }
            }
        });
        for(String s : list){
            System.out.println(s);
        }
    }
}
