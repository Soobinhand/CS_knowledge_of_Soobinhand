package baekjoon.Deque;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S4_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());//15
        ArrayList<Integer> list = new ArrayList<>();
        while(num-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String temp =st.nextToken();
            switch (temp) {

                case "push_front":
                    list.add(0,Integer.parseInt(st.nextToken()));
                    break;

                case "push_back":
                    list.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    if(list.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(list.get(0));
                        list.remove(0);
                    }
                    break;
                case "pop_back":
                    if(list.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(list.get(list.size()-1));
                        list.remove(list.size()-1);
                    }
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    if(list.isEmpty()){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                    break;
                case "front":
                    if(list.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(list.get(0));
                    }
                    break;

                case "back":
                    if(list.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(list.get(list.size()-1));
                    }
                    break;
            }
        }


    }
}
