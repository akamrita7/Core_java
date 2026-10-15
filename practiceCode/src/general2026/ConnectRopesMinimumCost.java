package general2026;

import java.util.PriorityQueue;
//Connect n ropes with minimum cost Last Updated : 18 Oct, 2025 Given an array arr[] of rope lengths, connect all ropes into a single rope with the minimum total cost.
// The cost to connect two ropes is the sum of their lengths.
// Examples: Input: arr[] = [4, 3, 2, 6] Output: 29 Explanation:
// Minimum cost to connect all ropes into a single rope is Connect ropes 2 and 3 - [4, 5, 6], cost = 5 Connect ropes 4 and 5 - [9, 6], cost = 9 Connect ropes 9 and 6 - [15], cost = 15 Total cost = 5 + 9 + 15 = 29 corner cases for this problem
public class ConnectRopesMinimumCost {
    static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }
        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first + second;
            pq.add(first + second);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        System.out.println(minCost(arr));
    }
}
