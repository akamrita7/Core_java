package leetcode;

public class ZigZagString {
    // Function that Prints concatenation of
    // all rows of str's Zig-Zag fashion
    static void printZigZagConcat(String str, int n)
    {
        if (n == 1) {
            System.out.print(str + "\n");
        }
        String res = "";
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = "";
        boolean down = false;
        int row = 0; // helps in building individual blocks
        // of Strings

        for (int i = 0; i < str.length(); i++) {
            if (row >= 0)
                arr[row] += (str.charAt(i));
            if (row == n - 1) {
                down = false;
            }
            if (row == 0) {
                down = true;
            }
            if (!down)
                row--;
            else
                row++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args)
    {
        // Driver Code
        String str = "PAYPALISHIRING";
        int N = 3;
        printZigZagConcat(str, N);
    }
}
