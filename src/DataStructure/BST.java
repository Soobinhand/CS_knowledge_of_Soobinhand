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

    public boolean delete(int value){
        boolean searched = false;
        Node currParentNode = this.head;
        Node currNode = this.head;

        if(this.head==null){
            return false;
        }else{
            if(this.head.value==value&&this.head.left==null&&this.head.right==null){
                this.head = null;
                return true;
            }

            while(currNode!=null){
                if(currNode.value==value){
                    searched = true;
                    break;
                }else if(value < currNode.value){
                    currParentNode = currNode;
                    currNode = currNode.left;
                }else{
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }
            if(searched==false){
                return false;
            }
        }
        if(currNode.left==null&&currNode.right==null){
            if(value<currParentNode.value){
                currParentNode.left = null;
                currNode = null;
            }else{
                currParentNode.right = null;
                currNode = null;
            }
            return true;
        }else if(currNode.left!=null&&currNode.right==null){
            if(value < currParentNode.value){
                currParentNode.left = currNode.left;
                currNode = null;
            }else{
                currParentNode.right = currNode.left;
                currNode= null;
            }
            return true;
        }else if(currNode.left==null&&currNode.right!=null){
            if(value<currParentNode.value){
                currParentNode.left = currNode.right;
                currNode = null;
            }else{
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
        }else{
            if(value < currParentNode.value){
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;

                while(changeNode.left != null){
                    changeParentNode = changeNode;
                    changeNode= changeNode.left;
                }
                if(changeNode.right != null){
                    changeParentNode.left = changeNode.right;
                }else{
                    changeParentNode.left = null;
                }

                currParentNode.left = changeNode;

                changeNode.right = currNode.right;
                changeNode.left = currNode.left;

                currNode = null;
            }else{
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;
                while(changeNode.left != null){
                    changeParentNode = changeNode;
                    changeNode= changeNode.left;
                }

                if(changeNode.right!=null){
                    changeParentNode.left = changeNode.right;
                }else{
                    changeParentNode.left = null;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insertNode(2);
        bst.insertNode(3);
        bst.insertNode(4);
        bst.insertNode(6);

    }
}
