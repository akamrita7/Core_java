package StringDifficult.lps;
//https://www.youtube.com/watch?v=ynv7bbcSLKE
import java.util.ArrayList;
import java.util.Arrays;

public class KmpAlgorithmPatternSearching {
    public static void main(String[] args) {
        String txt = "aabaacaadaabaaba";
        String pat ="aaba"; // "ababcabab";
        ArrayList<Integer> res = search(pat, txt);
        res.forEach(System.out::println);
    }

    private static ArrayList<Integer> search(String pat, String txt) {
        int n = txt.length();
        int m = pat.length();
        int[] lps = new int[m];
        ArrayList<Integer> res = new ArrayList<>();
        Lps.constructLps(pat, lps);
        int i = 0;
        int j = 0;
        Arrays.stream(lps).forEach(System.out::print);
        System.out.println();
        while (i < n) {
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
                if(j == m){
                    res.add(i-j);
                    j = lps[j-1];
                }
            }else {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return res;
    }
}
