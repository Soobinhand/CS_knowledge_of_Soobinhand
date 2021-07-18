package algo4;

interface QQ{
    boolean isEmpty();
    boolean isFull();
    void enqueue(char item);
    char dequeue();
    char peek();
    void clear();
}


public class Queue implements QQ{
    public int front;
    public int rear;
    public int size = 20;
    public char[] arr = new char[size];

    @Override
    public boolean isEmpty() {
        if(front==rear){
            front = -1;
            rear = -1;
        }
        return (front==rear);
    }

    @Override
    public boolean isFull() {
        return (rear==size-1);
    }

    @Override
    public void enqueue(char item) {
        if(isFull()){
            System.out.println("큐가 꽉 찼습니다");
        }
        else{
            arr[++rear] = item;
            System.out.println(item + " 을(를) 큐에 삽입합니다.");
        }
    }

    @Override
    public char dequeue() {
        if(isEmpty()){
            System.out.println("큐에 아무것도 없어서 삭제가 불가능합니다.");
            return 0;

        }
        else{
            System.out.println(arr[front+1]+ " 를(을) 큐에서 삭제합니다.");
            front = (front + 1) % size; // 배열길이 넘어가서 에러뜨는 것을 방지함.
            return arr[front];
        }
    }

    @Override
    public char peek() {
        if(isEmpty()){
            System.out.println("큐가 비어있습니다.");
            return 0;
        }
        else{
            System.out.println(arr[front+1] + " 이(가) 큐의 첫 번째 요소입니다.");
            return arr[front+1];
        }

    }

    @Override
    public void clear() {
        if(isEmpty()){
            System.out.println("큐가 비어있습니다.");
        }
        else{
            front = -1;
            rear = -1;
            arr = new char[size];
            System.out.println("큐가 새로 만들어졌습니다.");
        }

    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("큐가 비어있습니다.");
        }
        else{
            System.out.print("큐 안에는 ");
            for(int i=front+1;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue('a');
        q.enqueue('b');
    }
}

