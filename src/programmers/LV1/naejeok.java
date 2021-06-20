package programmers.LV1;

public class naejeok {
    public int solution(int[] a, int[] b){
        int sum = 0;
        int answer = 0;
        for(int i=0;i<a.length;i++){
            answer = a[i]*b[i];
            sum+=answer;
        }
        return sum;
    }

}


