package DataStructure;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Graph {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        int u,v;
        int[][] node = new int[vertex][vertex];
        for (int i=0;i<edge;i++){
            u = sc.nextInt();
            v = sc.nextInt();
            node[u][v]  = 1;

        }
        for (int i=0;i<vertex;i++){
            for (int j=0;j<vertex;j++){
                if (node[i][j]==1){
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
