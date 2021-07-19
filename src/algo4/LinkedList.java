package algo4;


interface LL{
    boolean isEmpty();
    void insertFirst(String data);
    void insertLast(String data);
    Node searchNode(String data);
    void insertNode(Node prev, String data);
    void deleteNode(String data);
    void printList();
}

class Node {
    String data;
    Node link;
}

public class LinkedList implements LL{
    Node head;

    LinkedList(){
        head = null;
    }


    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public void insertFirst(String data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.link = head;
        head = newNode;

    }

    @Override
    public void insertLast(String data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.link = null;

        if(isEmpty()){
            head = newNode;
        }
        else{
            Node temp = head;

            while(temp.link != null)
                temp = temp.link;

            temp.link = newNode;
        }

    }

    @Override
    public Node searchNode(String data) {
        Node temp = head;

        while(temp != null) {
            if(temp.data.equals(data))
                return temp;
            else
                temp = temp.link;
        }

        return temp;
    }

    @Override
    public void insertNode(Node prev, String data) {
        Node newNode = new Node(); // 새로운 노드 생성
        newNode.data = data; // 새로운 노드에 데이터 입력
        newNode.link = prev.link; // 이전 노드의 링크정보를 newNode 링크정보에 입력
        prev.link = newNode;
    }

    @Override
    public void deleteNode(String data) {
        Node prev = head; // head 부터 시작
        Node temp = head.link; // 두번째 노드부터 시작

        if(head.data.equals(data)) { // head가 삭제 타겟이라면
            head = prev.link; // head를 head 다음 친구로 갱신
            prev.link = null; // 기존 head의 link를 null로 변경
        }
        else { // head가 삭제 타겟이 아니면
            while(temp != null) { // 연결리스트 끝까지 탐색
                if(temp.data.equals(data)) { // 타겟을 찾았을 경우
                    if(temp.link == null) // 타겟이 마지막 노드이면
                        prev.link = null; // 직전 노드에서 link를 끊어줌
                    else { // 타겟이 마지막 노드가 아니면
                        prev.link = temp.link; // 직전노드의 link를 타겟의 link로 변경
                        temp.link = null; // 타겟의 link를 null로 변경하여 연결 끊어줌
                    }
                    return; // 메소드 종료
                }
                // 타겟을 못찾았을 경우 prev와 temp를 다음으로 진행시킴
                prev = prev.link;
                temp = temp.link;
            }
        }
    }

    @Override
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList fruit = new LinkedList();
        fruit.insertFirst("apple");
        fruit.printList();

        fruit.insertFirst("banana");
        fruit.printList();

        fruit.insertFirst("apple");
        fruit.printList();

        fruit.insertLast("strawberry");
        fruit.printList();

        fruit.insertNode(fruit.searchNode("apple"),"orange" );
        fruit.printList();

        fruit.deleteNode("apple");
        fruit.printList();
    }
}





