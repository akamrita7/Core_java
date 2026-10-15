package prgram2026.StringEasy;

public class anagrams {
    public static void main(String[] args) {
        String s1 = "geekst";
        String s2 = "kseegt";

        if(areAnagrams(s1, s2) == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    private static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] counts = new int[26];
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            counts[s2.charAt(i) - 'a']--;
        }
        for ( int c : counts){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
