package algo4;

import javax.jws.WebService;

class ListNode {
    private String data;
    public ListNode link;

    public ListNode(){
        this.data = null;
        this.link = null;
    }

    public ListNode(String data){
        this.data = data;
        this.link = null;
    }

    public ListNode(String data, ListNode link){
        this.data = data;
        this.link = link;
    }

    public String getData(){
        return this.data;
    }

}

public class LinkedList {
    private ListNode head;

    public LinkedList(){
        head = null;
    }

    public void insertNode(ListNode preNode,String data){
        ListNode newNode = new ListNode(data);

    }

}





//node  가 갖고 있는 데이터(손수빈)와 포인터(구의2동) -> 이게 하나의 노드다.;
//하나의 택배 주소라고 생각해도 될 것 같음.
//이러한 노드들이 `연결` 이 되어있다.
//연결 == 링크 *********중요하다.
//


//어레이 리스트는 배열기반 -> 종속적이죠. 배열 안에 있는 요소잖아. 무언가 배열에 관한
//어떤 게 있으면 그것에 영향을 받게되죠....
//링크드 리스트는 노드기반 -> 링크라는 선을 이용해서 배열이 아닌 각각의 데이터로
//저장한다는 점?
//Node -> Node JS


//arraylist 는 말이죠.
//가변적인 array(고정적이다.) == arraylist 301호 302호 303호
//{1995, 02, 08, 1999, 09, 10}
//1 -> 2 -> 3 -> 4 광장동의 철수 상연동의 영희 뭔가 큰 범위같아요.
