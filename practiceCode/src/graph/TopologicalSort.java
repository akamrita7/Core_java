package graph;

import java.util.ArrayList;
import java.util.Stack;
//https://www.geeksforgeeks.org/dsa/topological-sorting/
//https://www.geeksforgeeks.org/dsa/topological-sort-using-dfs/
public class TopologicalSort {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        addEdge(adj, 0, 1);
        addEdge(adj, 2, 1);
        addEdge(adj, 3, 2);
        addEdge(adj, 4, 2);
        ArrayList<Integer> res = topoSort(adj);
        for (int vertex : res) {
            System.out.print(vertex + " ");
        }
        System.out.println();
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }
    static void findTopoSort(int node, int[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
        vis[node] = 1;
        for (Integer it : adj.get(node)) {
            if (vis[it] == 0) {
                findTopoSort(it, vis, adj, st);
            }
        }
        st.push(node);
    }
    static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        Stack<Integer> st = new Stack<>();
        int[] vis = new int[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                findTopoSort(i, vis, adj, st);
            }
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while (!st.isEmpty()) {
            topo.add(st.pop());
        }
        return topo;
    }
}
