package New2026.Greedy;
//https://www.geeksforgeeks.org/dsa/fitting-shelves-problem/
public class FittingDhelvesProblem {
    static void minSpacePreferLarge(int wall, int m, int n)
    {
        int num_m = 0, num_n = 0, min_empty = wall;
        int p = wall/m; int q = 0 ; int rem = wall%m;
        num_m = p;
        num_n = q;
        min_empty = rem ;
        while (wall>=n){
            q++;
            wall = wall - n ;
            p = wall/m;
            rem = wall%m;
            if(rem <= min_empty){
                num_m = p;
                num_n = q;
                min_empty = rem ;
            }
        }
        System.out.println(num_m + " " + num_n + " " + min_empty);
    }

    // Driver Code
    public static void main(String[] args)
    {
        int wall = 24, m = 3, n = 5;
        minSpacePreferLarge(wall, m, n); //330
        wall = 24;
        m = 4;
        n = 7;
        minSpacePreferLarge(wall, m, n); // 600
        minSpacePreferLarge(29, 3, 9);//0 3 2

    }
}
