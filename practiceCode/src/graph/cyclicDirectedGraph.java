package graph;

import java.util.ArrayList;
import java.util.List;

public class cyclicDirectedGraph {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // Add directed edges
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);
        System.out.println(isCyclic(adj) ? "true" : "false");
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }


    // Function to detect cycle in a directed graph
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        // Run DFS from every unvisited node
        for (int i = 0; i < V; i++) {
            if (!visited[i] && isCyclicUtil(adj, i, visited, recStack))
                return true;
        }
        return false;
    }

    // Utility DFS function to detect cycle in a directed graph
    static boolean isCyclicUtil(ArrayList<ArrayList<Integer>> adj,
                                int u, boolean[] visited, boolean[] recStack) {
        // Node already in recursion stack cycle found
        if (recStack[u]) return true;
        // Already processed no need to visit again
        if (visited[u]) return false;
        visited[u] = true;
        recStack[u] = true;
        // Recur for all adjacent nodes
        for (int v : adj.get(u)) {
            if (isCyclicUtil(adj, v, visited, recStack))
                return true;
        }
        // Remove from recursion stack before backtracking
        recStack[u] = false;
        return false;
    }
}
