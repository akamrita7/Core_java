package New2026.StringEasy;

public class Min_deletion {
    public static void main(String[] args)
    {
        String str = "abefbac";

        System.out.println("Minimum element of deletions = " +
                min_ele_del(str));
    }
    public static int min(int x, int y)
    {
        return (x < y) ? x : y;
    }

    private static int min_ele_del(String str) {
        return utility_fun_for_del(str, 0,
                str.length() - 1);
    }

    private static int utility_fun_for_del(String str, int i, int j) {
        if (i >= j)
            return 0;

        // Condition to compare characters
        if (str.charAt(i) == str.charAt(j))
        {

            // Recursive function call
            return utility_fun_for_del(str,
                    i + 1, j - 1);//abefbac
        }

        // Return value, increamenting by 1
        return 1 + min(utility_fun_for_del(str, i + 1, j), utility_fun_for_del(str, i, j - 1));
    }
}
