package Algorithm.Minimum_Spanning_Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Prim {
    public static class Edge implements Comparable<Edge>{
        public int weight;
        public String node1;
        public String node2;

        public Edge(int weight, String node1, String node2){
            this.node1 = node1;
            this.node2 = node2;
            this.weight = weight;
        }

        public String toString(){
            return "("+this.weight+","+this.node1+","+this.node2+")";
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight-o.weight;
        }
    }

    public ArrayList<Edge> primFunc(String startNode, ArrayList<Edge> edges){
        Edge currentEdge, poppedEdge, adjacentEdgeNode;
        ArrayList<Edge> currentEdgeList;
        ArrayList<Edge> candidateEdgeList, adjacentEdgeNodes;
        PriorityQueue<Edge> priorityQueue;
        ArrayList<String> connectedNodes = new ArrayList<>();
        ArrayList<Edge> mst = new ArrayList<>();
        HashMap<String, ArrayList<Edge>> adjacentEdges = new HashMap<>();

        for(int i=0;i<edges.size();i++){
            currentEdge = edges.get(i);
            if(!adjacentEdges.containsKey(currentEdge.node1)){
                adjacentEdges.put(currentEdge.node1, new ArrayList<Edge>());
            }
            if(!adjacentEdges.containsKey(currentEdge.node2)){
                adjacentEdges.put(currentEdge.node2, new ArrayList<Edge>());
            }
        }

        for(int i=0;i< edges.size();i++){
            currentEdge = edges.get(i);
            currentEdgeList = adjacentEdges.get(currentEdge.node1);
            currentEdgeList.add(new Edge(currentEdge.weight, currentEdge.node1,currentEdge.node2));
            currentEdgeList = adjacentEdges.get(currentEdge.node2);
            currentEdgeList.add(new Edge(currentEdge.weight, currentEdge.node2,currentEdge.node1));
        }
        connectedNodes.add(startNode);
        candidateEdgeList = adjacentEdges.getOrDefault(startNode, new ArrayList<Edge>());
        priorityQueue = new PriorityQueue<>();
        for(int i=0;i< candidateEdgeList.size();i++){
            priorityQueue.add(candidateEdgeList.get(i));
        }
        while (priorityQueue.size() > 0){
            poppedEdge = priorityQueue.poll();
            if(!connectedNodes.contains(poppedEdge.node2)){
                connectedNodes.add(poppedEdge.node2);
                mst.add(new Edge(poppedEdge.weight, poppedEdge.node1, poppedEdge.node2));

                adjacentEdgeNodes = adjacentEdges.getOrDefault(poppedEdge.node2,new ArrayList<>());
                for(int i=0;i<adjacentEdgeNodes.size();i++){
                    adjacentEdgeNode = adjacentEdgeNodes.get(i);
                    if(!connectedNodes.contains(adjacentEdgeNode.node2)){
                        priorityQueue.add(adjacentEdgeNode);
                    }
                }
            }

        }
        return mst;

    }



    public static void main(String[] args) {
        ArrayList<Edge> myedges = new ArrayList<>();
        myedges.add(new Edge(7, "A", "B"));
        myedges.add(new Edge(5, "A", "D"));
        myedges.add(new Edge(8, "B", "C"));
        myedges.add(new Edge(9, "B", "D"));
        myedges.add(new Edge(7, "D", "E"));
        myedges.add(new Edge(5, "C", "E"));
        myedges.add(new Edge(7, "B", "E"));
        myedges.add(new Edge(6, "D", "F"));
        myedges.add(new Edge(8, "E", "F"));
        myedges.add(new Edge(9, "E", "G"));
        myedges.add(new Edge(11, "F", "G"));
        Prim prim = new Prim();
        System.out.println(prim.primFunc("A",myedges));
    }
}
