package algo4.practice1_3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class _4 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        System.out.println("Input:");
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            System.out.print(item+" ");
            if(item.equals("(") || item.equals("[") || item.equals("{")){
                s.push(item);
            }else if(!s.isEmpty() && item.equals(")")){
                if(s.isEmpty()){
                    System.out.println("\nResult:"+false);
                    System.exit(0);
                }
                String str = s.pop();
                if(!"(".equals(str)){
                    System.out.println("\nResult:"+false);
                    System.exit(0);
                }
            }else if(!s.isEmpty() && item.equals("]")){
                String str = s.pop();
                if(!"[".equals(str)){//]
                    System.out.println("\nResult:"+false);
                    System.exit(0);
                }
            }else if(!s.isEmpty() && item.equals("}")){
                String str = s.pop();
                if(!"{".equals(str)){
                    System.out.println("\nResult:"+false);
                    System.exit(0);
                }
            }else{//Standard input contains other characters
                System.out.println("\nResult:"+false);
                System.exit(0);
            }

        }
        //The program is executed here, indicating that all brackets are paired completely
        System.out.println("\nResult:"+true);
    }
}
