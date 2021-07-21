package DataStructure;

public class DoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;
    public class Node<T>{
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(this.head == null){
            this.head = new Node<T>(data);
            this.tail = this.head;
        }else{
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll(){
        if(this.head!=null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next!=null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData){
        if(this.head==null){
            return null;
        }
        else{
            Node<T> node = this.head;
            while(node!=null){
                if(node.data==isData){
                    return node.data;
                } else{
                    node = node.next;
                }
            }
            return null;
        }
    }
    public T searchFromTail(T isData){
        if(this.head==null){
            return null;
        }
        else{
            Node<T> node = this.tail;
            while(node!=null){
                if(node.data==isData){
                    return node.data;
                }else{
                    node = node.prev;
                }
            }
            return null;
        }

    }

    public boolean insertToFront(T existedData, T addData){
        if(this.head==null){
            this.head=new Node<T>(addData);
            this.tail= this.head;
            return true;
        }else if(this.head.data==existedData){
            Node<T> newHead = new Node<T>(addData);
            newHead.next = this.head;
            this.head=newHead;
            return true;
        }else{
            Node<T> node = this.head;
            while(node!=null){
                if(node.data==existedData){
                    Node<T> nodePrev = node.prev;
                    node.prev.next = new Node<T>(addData);
                    nodePrev.next.next = node;
                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;
                    return true;
                }else{
                    node = node.next;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> DLL = new DoubleLinkedList<>();
        DLL.addNode(1);
        DLL.addNode(2);
        DLL.addNode(3);
        DLL.addNode(4);
        DLL.addNode(5);
        DLL.printAll();
        System.out.println("-----------");
        DLL.insertToFront(3,2);
        DLL.printAll();
    }
}
