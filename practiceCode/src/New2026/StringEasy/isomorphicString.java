package New2026.StringEasy;
/*Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2. And all occurrences of every character in ‘str1’ map to same character in ‘str2’.
        Examples:
        Input:  str1 = "aab", str2 = "xxy"
        Output: True
        'a' is mapped to 'x' and 'b' is mapped to 'y'.
        Input:  str1 = "aab", str2 = "xyz"
        Output: False
        One occurrence of 'a' in str1 has 'x' in str2 and
        other occurrence of 'a' has 'y'.*/
public class isomorphicString {
    static final int CHAR = 256;
    public static void main(String[] args)
    {
        System.out.println(isoMorphic("aab", "xxy") ? 1 : 0);
        System.out.println(isoMorphic("aab", "xyz") ? 1 : 0);
    }

    private static boolean isoMorphic(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2){
            return false;
        }
        int[] countChar1 = new int[CHAR];
        int[] countChar2 = new int[CHAR];
        for(int i=0 ; i<len1 ; i++){
            countChar1[s1.charAt(i)]++;
            countChar2[s2.charAt(i)]++;
            if(countChar1[s1.charAt(i)] != countChar2[s2.charAt(i)]){
                return false;
            }
        }
        return true;
    }
}
