package Programmers.LV1;

import java.util.HashMap;
import java.util.Map;

public class StringandWord {
    public int solution(String s){
        int answer = 0;

        String[] arr = {"zero","one","two","three","four","five","six"
        ,"seven","eight","nine"};
        Map<String, Integer> map = new HashMap<>();
        int i=0;
        for(String a:arr){
            map.put(a,i++);
        }
        for(String a:arr){
            s = s.replace(a,map.get(a).toString());
        }
        answer = Integer.parseInt(s);
        return answer;
    }


}
