package graph;

import java.util.ArrayList;

public class DetectCycleUndirectedGraph {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // Add edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);

        System.out.print(isCycle(adj) ? "true" : "false");
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int parent) {
        // Mark the current node as visited
        visited[v] = true;
        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adj.get(v)) {
            // If an adjacent vertex is not visited,
            // then recur for that adjacent
            if (!visited[neighbor]) {
                if (dfs(neighbor, adj, visited, v))
                    return true;
            }
            // If an adjacent vertex is visited and is not
            // parent of current vertex,
            // then there exists a cycle in the graph.
            else if (neighbor != parent)
                return true;
        }
        return false;
    }

    // Returns true if the graph contains a cycle, else false.
    static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        // Mark all the vertices as not visited
        boolean[] visited = new boolean[V];
        for (int u = 0; u < V; u++) {
            if (!visited[u]) {
                if (dfs(u, adj, visited, -1))
                    return true;
            }
        }
        return false;
    }
}
