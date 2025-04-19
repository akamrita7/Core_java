package graph;

import java.util.ArrayList;
import java.util.List;

import static graph.DFSDisconnected.DFSRec;

public class DFS {
    static void addEdge(List<List<Integer>> adj, int s, int t){
        adj.get(s).add(t);
        adj.get(t).add(s);
    }
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        int[][] edges = {
                { 1, 2 }, { 1, 0 }, { 2, 0 }, { 2, 3 }, { 2, 4 }
        };
        for (int[] edge : edges){
            addEdge(adj, edge[0], edge[1]);
        }
        int source = 1;
        System.out.println("DFS from source: " + source);
        dfsconnected(adj, source);
    }

    private static void dfsconnected(List<List<Integer>> adj, int s) {
        boolean[] visited = new boolean[adj.size()];
        DFSRec(adj, visited, s);
    }

}
