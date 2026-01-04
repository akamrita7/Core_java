package StringDifficult.lps;

public class MinChar2Add2MakePalidrome {
    public static void main(String[] args) {
        System.out.println(minCharsToAddToMakePalindrome("abc"));
    }
    public static int minCharsToAddToMakePalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String concat = s + "$" + rev; //abc$cba , lps = [0, 0, 0, 0, 0, 0, 1]
        int len = concat.length();
        int[] lps = new int[len];
        Lps.constructLps(concat,lps);
        return s.length() - lps[concat.length() - 1]; // cbabc
    }
}
