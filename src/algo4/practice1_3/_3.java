package algo4.practice1_3;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;

public class _3 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        int n = 8;
        Queue<Integer>[] a = (Queue<Integer>[]) new Queue[n];
        int i =0;
        for(int j=0;j<n;j++){
            a[j] = new Queue<Integer>();
        }

        for(;i<n;i++){
            for(int j=0;j<10;j++){
                if(!StdIn.isEmpty()){
                    int item = StdIn.readInt();

                    a[i].enqueue(item);
                }else{
                    System.out.println("The input data is wrong!!");
                    System.exit(0);
                }
            }
        }

        for(int j=0;j<n;j++){
            //First print the stacking sequence of integers in the question
            for(int num : a[j]){
                System.out.print(num+"  ");
            }

            boolean bigFlag = true;
            //Judgment
            while(!a[j].isEmpty()){
                Queue<Integer> temp = new Queue<Integer>();
                int number = a[j].dequeue();//Take a number number from the stack
                for(int num: a[j]){//Push (copy) all numbers in the stack smaller than number to the temp stack
                    if(number > num){
                        temp.enqueue(num);
                    }
                }
                //Determine whether a number smaller than number is in reverse order
                boolean flag = true;
                while(!temp.isEmpty()){
                    int t = temp.dequeue();
                    if(number<t){
                        flag = false;
                        break;
                    }
                    number = t;
                }
                if(flag==false){
                    bigFlag = false;
                    System.out.println(bigFlag);
                    break;
                }
            }

            if(bigFlag==true){
                System.out.println(bigFlag);
            }
        }

    }
}

