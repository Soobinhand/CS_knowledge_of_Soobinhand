package algo4.practice1_3;

import algo4.FixedCapacityStackOfStrings;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class _1 {
    public static void main(String[] args){
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-"))
                s.push(item);
            else if(!s.isEmpty())
                StdOut.print(s.pop()+" ");
        }
        StdOut.println("("+s.size()+" left on stack)");
    }
}

//FixedCapacityStackOfStrings 에 구현하였음.
//크기와 그 스택의 고정 크기와 같아지면 full 임
