package DataStructure;

import java.util.ArrayList;

interface DQ{

}

public class Deque {

    ArrayList<Integer> list = new ArrayList<>();


    public void offerFront(int o){
        if(list.isEmpty()){
            System.out.println("덱이 비었습니다.");
        }else{
            list.add(0,o);
            System.out.println(o+" 를 맨 앞에 넣습니다.");
        }

    }

    public void offerLast(int o){
        if(list.isEmpty()){
            System.out.println("덱이 비었습니다.");
        }else{
            list.add(o);
            System.out.println(o+" 를 맨 뒤에 넣습니다.");
        }


    }

    public int pollFront(){
        if(list.isEmpty()){
            System.out.println("덱이 비었습니다.");
            return 0;
        }else {
            int a = list.remove(0);
            System.out.println(a + "를 맨 앞에서 삭제합니다.");
            return a;
        }
    }
    public int pollLast(){
        if(list.isEmpty()){
            System.out.println("덱이 비었습니다.");
            return 0;
        }
        int a = list.remove(list.size()-1);
        System.out.println(a+"를 맨 뒤에서 삭제합니다.");
        return a;
    }

    public void printAll(){
        if(list.isEmpty()){
            System.out.println("스택에 아무것도 없습니다.");
        }else{
            System.out.print("덱엔 ");
            System.out.print(list);
            System.out.println("이(가) 있습니다.");
        }
    }
    public int peekFirst(){
        if(list.isEmpty()){
            System.out.println("스택이 비었습니다.");
            return 0;
        }
        else{
            System.out.println(list.get(0) + " 이(가) 맨 앞에 있는 것입니다.");
            return list.get(0);
        }
    }

    public int peekLast(){
        if(list.isEmpty()){
            System.out.println("스택이 비었습니다.");
            return 0;
        }
        else{
            System.out.println(list.get(list.size()-1) + " 이(가) 맨 뒤에 있는 것입니다.");
            return list.get(list.size()-1);
        }
    }


    public static void main(String[] args) {
        Deque d = new Deque();
        d.offerFront(123);
        d.offerFront(456);
        d.printAll();
        System.out.println();
        d.offerFront(188);
        d.printAll();
        d.offerLast(999);
        d.printAll();
        d.pollFront();
        d.printAll();
        d.pollLast();
        d.printAll();
        d.peekFirst();
        d.peekLast();

    }

}
