package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class cyclicDirectedGraph1 {
    // Function to add an edge to the adjacency list
    public static void addEdge(List<List<Integer>> adj,
                               int u, int v) {
        adj.get(u).add(v);
    }

    // Function to detect cycle in a directed graph
    public static boolean isCyclic(List<List<Integer>> adj) {

        int V = adj.size();

        // Stores in-degree of each vertex
        int[] inDegree = new int[V];

        // Queue to store vertices with 0 in-degree
        Queue<Integer> q = new LinkedList<>();
        int visited = 0; // Count of visited vertices

        // Calculate in-degree of each vertex
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                inDegree[v]++;
            }
        }

        // Enqueue vertices with 0 in-degree
        for (int u = 0; u < V; u++) {
            if (inDegree[u] == 0) {
                q.offer(u);
            }
        }

        // BFS traversal
        while (!q.isEmpty()) {
            int u = q.poll();
            visited++;

            // Reduce in-degree of adjacent vertices
            for (int v : adj.get(u)) {
                inDegree[v]--;
                // If in-degree becomes 0, enqueue it
                if (inDegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        // If not all vertices are visited, cycle
        return visited != V;
    }

    // Driver function
    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges to the graph
       /* addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 4, 1);
        addEdge(adj, 4, 5);
        addEdge(adj, 5, 3);*/
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(3);

        // Function call to check for cycles
        if (isCyclic(adj)) {
            System.out.println("Contains cycle");
        } else {
            System.out.println("No Cycle");
        }
    }
}
