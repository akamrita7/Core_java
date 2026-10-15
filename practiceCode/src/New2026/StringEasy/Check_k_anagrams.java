package New2026.StringEasy;

/*https://www.geeksforgeeks.org/check-two-strings-k-anagrams-not/
        Given two strings of lowercase alphabets and a value k, the task is to find if two strings are K-anagrams of each other or not.
        Two strings are called k-anagrams if following two conditions are true.
        Both have same number of characters.
        Two strings can become anagram by changing at most k characters in a string.
        Examples :
        Input:  str1 = "anagram  " , str2 = "grammar" , k = 3
        Output:  Yes
        Explanation: We can update maximum 3 values and
        it can be done in changing only 'r' to 'n'
        and 'm' to 'a' in str2.
        Input:  str1 = "geeks", str2 = "eggkf", k = 1
        Output:  No
        Explanation: We can update or modify only 1
        value but there is a need of modifying 2 characters.
        i.e. g and f in str 2.*/

public class Check_k_anagrams {
    static final int MAX_CHAR = 26;
    public static void main(String args[])
    {
        String str1 = "anagram";
        String str2 = "grammar";
        int k = 2;
        if (areKAnagrams(str1, str2, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean arekAnagrams(String str1, String str2, int k) {
        int len = str1.length();
        if(len != str2.length()) {
            return false;
        }
        int[] countStr1 = new int[MAX_CHAR];
        int[] countStr2 = new int[MAX_CHAR];
        int count = 0;
        for(int i =0; i<len ; i++){
            countStr1[str1.charAt(i) - 'a']++;
            countStr2[str2.charAt(i) - 'a']++;
        }
        for(int i=0 ; i < MAX_CHAR ; i++){
            if(countStr1[i]<countStr2[i])
                count = count + Math.abs(countStr1[i] -countStr2[i]);
        }
        return (k>=count);
    }
    static boolean areKAnagrams(String str1, String str2, int k) {
        int n = str1.length();
        if (str2.length() != n)
            return false;
        int[] hash_str1 = new int[MAX_CHAR];
        for (int i = 0; i < n ; i++)
            hash_str1[str1.charAt(i)-'a']++;
        int count = 0;
        for (int i = 0; i < n ; i++)
        {
            if (hash_str1[str2.charAt(i)-'a'] > 0)
                hash_str1[str2.charAt(i)-'a']--;
            else
                count++;
            if (count > k)
                return false;
        }
        return true;
    }

}
    /*Both have same number of characters.
        Two strings can become anagram by changing at most k characters in a string.
        Examples :

        Input:  str1 = "anagram" , str2 = "grammar" , k = 3
        Output:  Yes
        Explanation: We can update maximum 3 values and
        it can be done in changing only 'r' to 'n'
        and 'm' to 'a' in str2.

        Input:  str1 = "geeks", str2 = "eggkf", k = 1
        Output:  No
        Explanation: We can update or modify only 1
        value but there is a need of modifying 2 characters.
        i.e. g and f in str 2.*/