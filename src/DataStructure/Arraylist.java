package DataStructure;


import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(2,12);
        list.set(2,2);
        System.out.println(list);
        System.out.println("size : "+list.size());
        System.out.println("Is it true? : "+list.contains(3));
        System.out.println("Is it empty? : "+list.isEmpty());
        System.out.println("Where is 100? : "+list.indexOf(100));
        System.out.println("What is index 1? : "+list.get(1));
    }

}