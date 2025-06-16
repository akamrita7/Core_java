package MediumProblemsArray;

public class TwoRepeated {
    int[] twoRepeated(int arr[])
    {
        int size = arr.length;
        int i;
        int x = -1, y = -1;


        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val] > 0)
                arr[abs_val] = -arr[abs_val];
            else if (x == -1)
                x = abs_val;
            else
                y = abs_val;
        }
        return new int[] { x, y };
    }

    public static void main(String[] args)
    {
        TwoRepeated repeat = new TwoRepeated();
        int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
        int ans[] = repeat.twoRepeated(arr);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
