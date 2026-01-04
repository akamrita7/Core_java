package StringDifficult.lps;

public class Lps {
    public static void constructLps(String pat, int[] lps) {
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < pat.length()){  // "aaba"; //ababcabab
            if(pat.charAt(i) == pat.charAt(len)){ // agar match hai to next se compare karega
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1]; //jab tak 0 nhi hoga compare karega
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

    }
}
