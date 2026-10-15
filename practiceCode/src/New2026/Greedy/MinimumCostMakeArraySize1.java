package New2026.Greedy;

public class MinimumCostMakeArraySize1 {
    static int cost(int []a, int n)
    {
        int min = a[0];
        for(int i = 1; i< a.length; i++)
        {
            if (a[i] < min)
                min = a[i];
        }
        return (n - 1) * min;
    }
    static public void main (String[] args)
    {
        int []a = { 4, 3, 2 };
        int n = a.length;
        System.out.println(cost(a, n)); //4
        System.out.println(cost(new int[]{3,4}, 2)); //3
    }

    private static int cost1(int[] a, int n) {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if(a[i] < min){
                min = a[i];
            }
        }
        return (n-1)*min;
    }

}
