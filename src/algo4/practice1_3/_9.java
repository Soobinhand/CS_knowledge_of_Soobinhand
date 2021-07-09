package algo4.practice1_3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class _9 {
    public static void main(String[] args) {
        Stack<String> number = new Stack<>();//Store the number in the formula
        Stack<String> operator = new Stack<>();//The operator in the storage formula

        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            System.out.println(item);
            if(Character.isDigit(item.charAt(0))){//If item is a number 0~9, push it into the number stack
                number.push(item);
            }else if("+".equals(item) || "-".equals(item) || "*".equals(item) || "/".equals(item)){
                //If item is an operator, push it onto the operator stack
                operator.push(item);
            }else if(")".equals(item) && number.size()>=2 && operator.size()>=1){//If item is')'
                String second = number.pop();
                String first = number.pop();
                String newBracket = "("+first+operator.pop()+second+")";
                number.push(newBracket);

                System.out.println(newBracket);

            }else{
                //The input data cannot be a complete bracket expression
                System.out.println("data error!!!");
            }

        }
        if(number.size()==1){
            System.out.print("result:"+number.pop());
        }

    }
}
