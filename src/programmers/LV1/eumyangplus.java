package programmers.LV1;

public class eumyangplus {
    public int solution(int[] absolutes, boolean[] signs){
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            if(signs[i]==false){
                absolutes[i] = (-1*absolutes[i]);
            }
            answer += absolutes[i];
        }
        return answer;

    }
}
