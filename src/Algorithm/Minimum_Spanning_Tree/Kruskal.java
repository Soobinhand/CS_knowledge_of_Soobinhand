package Algorithm.Minimum_Spanning_Tree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Kruskal {
    HashMap<String,String> parent = new HashMap<>();
    HashMap<String,Integer> rank = new HashMap<>();

    public String find(String node){
        //path compression 기법
        if(parent.get(node)!= node){
            parent.put(node,find(parent.get(node)));
        }
        return parent.get(node);
    }
    public void union(String nodeV, String nodeU){
        String root1 = find(nodeV);
        String root2 = find(nodeU);
        
        //union-by-rank 기법
        if (rank.get(root1) > rank.get(root2)){
            parent.put(root2, root1);
        }else{
            parent.put(root1,root2);
            if(rank.get(root1)==rank.get(root2)){
                rank.put(root2,rank.get(root2)+1);
            }
        }
    }

    public void makeSet(String node){
        parent.put(node, node);
        rank.put(node,0);
    }


    public static class Edge implements Comparable<Edge>{
        public int weight;
        public String nodeV;
        public String nodeU;

        public Edge(int weight, String nodeV,String nodeU){
            this.weight = weight;
            this.nodeV = nodeV;
            this.nodeU = nodeU;
        }

        public String toString(){
            return "("+this.weight+","+this.nodeV+","+this.nodeU+")";
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }

    public ArrayList<Edge> kk(ArrayList<String> vertices, ArrayList<Edge> edges){
        ArrayList<Edge> mst = new ArrayList<>();
        Edge currentNode;

        //초기화하자
        for(int i=0;i<vertices.size();i++){
            makeSet(vertices.get(i));
        }
        //간선 weight 기반 정렬
        Collections.sort(edges);
        for(int i=0;i< edges.size();i++){
            currentNode = edges.get(i);
            if(find(currentNode.nodeV)!=find(currentNode.nodeU)){
                union(currentNode.nodeV, currentNode.nodeU);
                mst.add(currentNode);
            }
        }
        return mst;
    }

    public static void main(String[] args) {
        ArrayList<String> vertices = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G"));
        ArrayList<Edge> edges = new ArrayList<>();
        edges.add(new Edge(7, "A", "B"));
        edges.add(new Edge(5, "A", "D"));
        edges.add(new Edge(7, "B", "A"));
        edges.add(new Edge(8, "B", "C"));
        edges.add(new Edge(9, "B", "D"));
        edges.add(new Edge(7, "B", "E"));
        edges.add(new Edge(8, "C", "B"));
        edges.add(new Edge(5, "C", "E"));
        edges.add(new Edge(5, "D", "A"));
        edges.add(new Edge(9, "D", "B"));
        edges.add(new Edge(7, "D", "E"));
        edges.add(new Edge(6, "D", "F"));
        edges.add(new Edge(7, "E", "B"));
        edges.add(new Edge(5, "E", "C"));
        edges.add(new Edge(7, "E", "D"));
        edges.add(new Edge(8, "E", "F"));
        edges.add(new Edge(9, "E", "G"));
        edges.add(new Edge(6, "F", "D"));
        edges.add(new Edge(8, "F", "E"));
        edges.add(new Edge(11, "F", "G"));
        edges.add(new Edge(9, "G", "E"));
        edges.add(new Edge(11, "G", "F"));
        Kruskal kruskal = new Kruskal();
        kruskal.kk(vertices,edges);
        System.out.println(kruskal.kk(vertices,edges));
    }
}
