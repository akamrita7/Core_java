package New2026.ArrayIDeserve;

import java.util.Arrays;
import java.util.Stack;

//https://www.geeksforgeeks.org/dsa/count-of-days-remaining-for-the-next-day-with-higher-temperature/
public class NextHighTemp {
    static void dailyTemperatures(int[] T)
    {
        int n = T.length;
        int[] daysOfWait = new int[n];
        Arrays.fill(daysOfWait, -1);
        Stack<Integer> s = new Stack<>();
        // Traverse all the temperatures
        for(int i = 0; i < n; i++) //{1, 1, 4, 2, 1, 1, -1, -1}
        {
            while (!s.isEmpty() && T[s.peek()] < T[i]) //{ 73, 74, 75, 71, 69, 72, 76, 73 };
            {
                daysOfWait[s.peek()] = i - s.peek();
                s.pop();
            }
            s.push(i);
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(daysOfWait[i] + " ");
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        int[] arr = { 73, 74, 75, 71, 69, 72, 76, 73 };
        dailyTemperatures(arr);
    }
}
