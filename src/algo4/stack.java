package algo4;

public class stack {
    public int top = -1;
    public int size = 10;
    public char[] arr = new char[size];

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return top == this.size-1;
    }

    public void push(char item){
        if(isFull())
            System.out.println("스택이 꽉 찼습니다.");
        else{
            arr[++top] = item;
            System.out.println(item + "를(을) push 합니다");
        }
    }

    public char pop(){
        if(isEmpty()) {
            System.out.println("스택에 이미 아무것도 없습니다.");
            return 0;
        }
        else{
            System.out.println(arr[top] + " 을(를) 삭제합니다.");
            return arr[top--];
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("스택이 비었습니다.");
        }
        else{
            System.out.println(arr[top] + " 이(가) 마지막으로 들어온 것입니다.");
        }
    }

    public void clear(){
        if(isEmpty())
            System.out.println("스택에 이미 아무것도 없습니다.");
        else{
            top = -1;
            arr = new char[size];
            System.out.println("새로운 스택이 생성되었습니다.");
        }
    }

    public void printstack(){
        if(isEmpty()){
            System.out.println("스택에 아무것도 없습니다.");
        }else{
            System.out.print("스택엔 ");
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("이(가) 있습니다.");
        }
    }

    public static void main(String[] args) {
        stack stack = new stack();
        stack.printstack();
    }
}
