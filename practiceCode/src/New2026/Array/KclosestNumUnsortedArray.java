package New2026.Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KclosestNumUnsortedArray {
    public static void main(String[] args)
    {
        int arr[] = { -10, -50, 20, 17, 80 };
        int x = 20, k = 2;
        int n = arr.length;

        printKclosest(arr, n, x, k);
    }

    private static void printKclosest(int[] arr, int n, int x, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p2.getValue().compareTo(p1.getValue());
            }
        });
        for(int i = 0; i < k; i++)
        {
            pq.offer(new Pair(arr[i],Math.abs(arr[i]-x)));
        }
        for(int i = k; i < n; i++)
        {
            int diff = Math.abs(arr[i]-x);
            if(diff>pq.peek().getValue())continue;
            pq.poll();
            pq.offer(new Pair(arr[i],diff ));
        }
        while(!pq.isEmpty())
        {
            System.out.print(pq.poll().getKey() + " ");
        }
    }

}
class Pair
{
    Integer Key;
    Integer value;

    public Pair(Integer key, Integer value) {
        Key = key;
        this.value = value;
    }

    public void setKey(Integer key) {
        Key = key;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getKey() {
        return Key;
    }

    public Integer getValue() {
        return value;
    }
}
