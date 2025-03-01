package applyPrac;

import java.util.HashMap;
//https://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
public class OddOccurrence {
    public static void main(String[] args)
    {
        int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2,5,4};
        int n = arr.length;
        System.out.println(getOddOccurrence(arr, n));
    }

    private static int getOddOccurrence(int[] arr, int n){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            if(hmap.containsKey(arr[i]))
            {
                hmap.compute(arr[i], (k, val) -> val + 1);
            }
            else
                hmap.put(arr[i], 1);
        }
        for(Integer a:hmap.keySet())
        {
            if(hmap.get(a) % 2 != 0)
                return a;
        }
        return -1;
    }

}
