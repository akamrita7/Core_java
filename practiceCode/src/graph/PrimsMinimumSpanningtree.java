package graph;
import java.util.PriorityQueue;
import java.util.ArrayList;
//https://www.geeksforgeeks.org/dsa/prims-minimum-spanning-tree-mst-greedy-algo-5/
public class PrimsMinimumSpanningtree {
    public static void main(String[] args) {
        int V = 3;
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        adj.get(0).add(new int[]{1, 5});
        adj.get(1).add(new int[]{0, 5});
        adj.get(1).add(new int[]{2, 3});
        adj.get(2).add(new int[]{1, 3});
        adj.get(0).add(new int[]{2, 1});
        adj.get(2).add(new int[]{0, 1});
        System.out.println(spanningTree(V, adj));
    }

    private static int spanningTree(int V, ArrayList<ArrayList<int[]>> adj) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        boolean[] vis = new boolean[V];
        int res =0;
        pq.add(new int[]{0,0});
        while (!pq.isEmpty()){
            int[] p = pq.poll();
            int w = p[0];
            int u = p[1];
            if(vis[u])
                continue;
            res += w;
            vis[u] = true;
            for (int[] v : adj.get(u)){
                if(!vis[v[0]]){
                    pq.add(new int[]{v[1], v[0]});
                }
            }
        }
        return  res;
    }
}
