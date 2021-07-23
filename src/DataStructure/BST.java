package DataStructure;

public class BST {
    Node head = null;

    public class Node{
        Node left;
        Node right;
        int value;
        Node (int data){
            this.value = data;
            this.left = null;
            this.right = null;
        }

    }

    public boolean insertNode(int data){
        if(this.head==null){//노드가 하나도 없을때
            this.head = new Node(data);
        }else{//노드가 하나이상 잇을때
            Node findNode = this.head;
            while(true){
                if(data<findNode.value){
                    if(findNode.left!=null){
                        findNode = findNode.left;
                    }else{
                        findNode.left = new Node(data);
                        break;
                    }
                }else{
                    if(findNode.right!=null){
                        findNode = findNode.right;
                    }else{
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;

    }
    
    public Node search(int data){
        if(this.head==null){
            return null;
        }else{
            Node findNode = this.head;
            while(findNode!=null){
                if(findNode.value==data){
                    return findNode;
                }else if(data < findNode.value){
                    findNode = findNode.left;

                }else{
                    findNode = findNode.right;

                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insertNode(2);
        bst.insertNode(3);
        bst.insertNode(4);
        bst.insertNode(6);

    }
}
