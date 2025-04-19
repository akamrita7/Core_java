package graph;

import java.util.ArrayList;
import java.util.List;

public class cyclicDirectedGraph {
    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(3);
        if (isCyclic(adj))
            System.out.println("Contains cycle");
        else
            System.out.println("No Cycle");
    }


    private static boolean isCyclic(List<List<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i] && isCyclicUtil(adj, i, visited, recStack))
                return true;
        }
        return false;
    }

    private static boolean isCyclicUtil(List<List<Integer>> adj, int src, boolean[] visited, boolean[] recStack) {
        if (recStack[src])
            return true;
        recStack[src]= true;
        visited[src]=true;
        for (int next : adj.get(src)){
            if(!visited[next] && isCyclicUtil(adj,next,visited,recStack)){
                return true;
            }else if (recStack[next]){
                return true;
            }
        }
        return false;


    }
}
