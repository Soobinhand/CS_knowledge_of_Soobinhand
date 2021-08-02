package Algorithm.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Breadth_First_Search {

    public ArrayList<String> bfs(HashMap<String, ArrayList<String>> graph, String startNode){
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisit = new ArrayList<>();

        needVisit.add(startNode);

        while (needVisit.size()>0){
            String node = needVisit.remove(0);
            if(!visited.contains(node)){
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<>();

        graph.put("A",new ArrayList<String>(Arrays.asList("B","C")));
        graph.put("B",new ArrayList<String>(Arrays.asList("A","D")));
        graph.put("C",new ArrayList<String>(Arrays.asList("A","G","H","I")));
        graph.put("D",new ArrayList<String>(Arrays.asList("B","E","F")));
        graph.put("E",new ArrayList<String>(Arrays.asList("D")));
        graph.put("F",new ArrayList<String>(Arrays.asList("D")));
        graph.put("G",new ArrayList<String>(Arrays.asList("C")));
        graph.put("H",new ArrayList<String>(Arrays.asList("C")));
        graph.put("I",new ArrayList<String>(Arrays.asList("C","J")));
        graph.put("J",new ArrayList<String>(Arrays.asList("I")));

        Breadth_First_Search breadth_first_search = new Breadth_First_Search();
        breadth_first_search.bfs(graph,"A");
        System.out.println(breadth_first_search.bfs(graph,"A"));
    }
}
