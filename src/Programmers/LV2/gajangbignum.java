package Programmers.LV2;
import java.util.*;
public class gajangbignum {
    public String solution(int[] numbers){
        String[] result = new String[numbers.length];
        for(int i=0;i< numbers.length;i++){
            result[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2+o1).compareTo(o1+o2));
            }
        });

        if(result[0].equals("0"))
            return "0";
        String answer = "";
        for(String a : result)
            answer += a;
        return answer;
    }
}
