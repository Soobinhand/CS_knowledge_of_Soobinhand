package programmers.LV1;
import java.util.*;
public class ihatesamenumber {
    public int[] solution(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int a = 100;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=a){
                list.add(arr[i]);
                a = arr[i];
            }
        }
        int answer[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
