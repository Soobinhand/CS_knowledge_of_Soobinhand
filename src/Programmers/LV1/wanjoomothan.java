package Programmers.LV1;

import java.util.Arrays;

public class wanjoomothan {
    public String solution(String[] participant, String[] completion){
        String answer = "";
        String temp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        while(i<completion.length){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }
            else{
                i++;
            }
        }
        if(!temp.equals("")){
            answer = temp;
        }
        else{
            answer = participant[participant.length-1];
        }
        return answer;


    }
}
