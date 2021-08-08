package Algorithm.Back_Tracking;

import java.util.ArrayList;

public class N_Queen {
    public boolean isAvailable(ArrayList<Integer> candidate,Integer currentCol){
        Integer currentRow = candidate.size();
        for(int i=0;i<currentRow;i++){
            if((candidate.get(i)==currentCol) || (Math.abs(candidate.get(i)-currentCol)==currentRow-i)){
                return false;
            }
        }
        return true;
    }

    public void dfs(Integer N, Integer currentRow, ArrayList<Integer> currentCandidate){
        if(currentRow==N){
            System.out.println(currentCandidate);
            return ;
        }

        for(int i=0;i<N;i++){
            if(this.isAvailable(currentCandidate, i)){
                currentCandidate.add(i);
                this.dfs(N,currentRow+1,currentCandidate);
                currentCandidate.remove(currentCandidate.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        N_Queen n_queen = new N_Queen();
        n_queen.dfs(4,0,new ArrayList<Integer>());
    }
}
