package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static graph.BfsDisconnected.bfsDisconnected;

public class bfs {
    public static void main(String[] args) {

        // create the adjacency list
        // { {2, 3, 1}, {0}, {0, 4}, {0}, {2} }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(2)));

        int src = 0;
        ArrayList<Integer> ans = bfsOfGraph(adj, src); //0 1 2 3 4 5
//        ArrayList<Integer> ans = bfsDisconnected(adj); //0 1 2 3 4 5
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj, int src) {
        int V = adj.size();
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        visited[src] = true;
        q.add(src);
        while (!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);
            for (int x : adj.get(curr)){
                if(!visited[x]){
                   q.add(x);
                   visited[x]= true;
                }
            }
        }
        return res;
    }
}
