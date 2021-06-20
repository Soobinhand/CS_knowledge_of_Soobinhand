package algo4;

public class UF {
    private int[] id;
    private int count;

    public UF(int N){
        count = N;
        id = new int[N];
        for(int i = 0; i <N; i++)
            id[i] = i;
    }
}
