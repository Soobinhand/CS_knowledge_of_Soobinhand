package baekjoon.S4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer command;
        while(num-->0){
            command = new StringTokenizer(br.readLine()," ");
            switch (command.nextToken()){
                case "push":
                    list.offer(Integer.parseInt(command.nextToken()));
                    break;

                case "pop":
                    Integer item=list.poll();
                    if(item==null){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(item).append("\n");

                    }
                    break;

                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    if(list.isEmpty()){
                        sb.append(1).append('\n');
                    }else{
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    Integer ite = list.peek();
                    if(ite==null){
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(ite).append("\n");
                    }
                    break;

                case "back":
                    Integer it = list.peekLast();
                    if(it==null){
                        sb.append(-1).append('\n');
                    }else{
                        sb.append(it).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
