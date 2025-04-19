package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BfsDisconnected {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(4)));
        adj.add(new ArrayList<>(Arrays.asList(3, 5)));
        adj.add(new ArrayList<>(Arrays.asList(4)));

        int src = 0;
        ArrayList<Integer> ans = bfsDisconnected(adj);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> bfsDisconnected(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                bfsOfGraph(adj, i, visited, res);
            }
        }
        return res;
    }

    private static void bfsOfGraph(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, ArrayList<Integer> res) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;
        while (!q.isEmpty()){
            int cur = q.poll();
            res.add(cur);
            for (int x : adj.get(cur)){
                if(!visited[x]){
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }
}
