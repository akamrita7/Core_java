package StringDifficult.lps;

public class LpsImplementation {
    public static void main(String[] args) {
//       System.out.println(longestPalindromicPrefix("abaac")); //aba
//       System.out.println(repeatedSubstringPattern("abcabcabc")); //Input: str = "abcabcabc" Output: true // Input: str = "abcdabc" Output: false
//         System.out.println(removeOccurrences("geeksforgeeks", "e")); //Input : s = "geeksforgeeks" c = 'e' Output : s = "gksforgks"
        System.out.println(shortestPalindrome("aacecaaaa")); //Input: s = "abc" Output: 2 // Input: s = "aacecaaaa Output: aaaacecaaaacecaaaa
    }
//    https://www.geeksforgeeks.org/dsa/print-the-longest-palindromic-prefix-of-a-given-string/
    public static String longestPalindromicPrefix(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String concat = s + "$" + rev;
        int len = concat.length(); // abaac$caaba
        int[] lps = new int[len];
        Lps.constructLps(concat,lps);  //[0, 0, 1, 1, 0, 0, 0, 1, 1, 2, 3]
        return s.substring(0, lps[concat.length() - 1]);
    }
    public static boolean repeatedSubstringPattern(String s) {
        //https://www.geeksforgeeks.org/dsa/find-given-string-can-represented-substring-iterating-substring-n-times/
        int n = s.length();
        int[] lps = new int[n];
        Lps.constructLps(s,lps);
        int len = lps[n - 1];
        return len > 0 && n % (n - len) == 0;
    }
    public static String removeOccurrences(String s, String pattern) {
        StringBuilder sb = new StringBuilder();
        int m = pattern.length();
        int[] lps = new int[m];
        Lps.constructLps(pattern,lps);
        int j = 0;
        for (char c : s.toCharArray()) {
            sb.append(c);
            if (sb.length() >= m && sb.substring(sb.length() - m).equals(pattern)) {
                sb.setLength(sb.length() - m);
            }
        }
        return sb.toString();
    }
    public static String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String concat = s + "$" + rev;
        int len = concat.length(); // abaac$caaba
        int[] lps = new int[len];
        String suffix = s.substring(lps[concat.length() - 1]);
        return new StringBuilder(suffix).reverse().toString() + s;
    }
}
