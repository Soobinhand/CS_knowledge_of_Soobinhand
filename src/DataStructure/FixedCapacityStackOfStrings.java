package DataStructure;

public class FixedCapacityStackOfStrings {
    private String[] a; //스택 항목
    private int N; //크기
    
    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }
    
    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public boolean isFull(){
        return N==a.length;
    }
    
    public void push(String item){
        a[N++] = item;
    }
    
    public String pop(){
        return a[--N];
    }
}
