package general2026;

import java.util.HashMap;
import java.util.Map;

public class RearrangeCharactersFormPalindromePossible {
    public static String getPalindrome(String str)
    {
        HashMap<Character, Integer> counting = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            counting.put(ch,counting.getOrDefault(ch,0)+1);
        }
        int oddCount = 0;
        char oddChar = 0;
        for(Map.Entry<Character, Integer> itr : counting.entrySet())
        {
            if (itr.getValue() % 2 != 0)
            {
                oddCount++;
                oddChar = itr.getKey();
                if (oddCount > 1 )
                {
                    return "NO PALINDROME";
                }
            }
        }

        String firstHalf = "", lastHalf = "";
        for(Map.Entry<Character, Integer> itr : counting.entrySet())
        {
            String ss = "";
            for(int i = 0; i < itr.getValue() / 2; i++)
            {
                ss += itr.getKey();
            }
            firstHalf = firstHalf + ss;
            lastHalf = ss + lastHalf;
        }
        return (firstHalf + oddChar + lastHalf);
//        return (oddCount == 1) ? (firstHalf + oddChar + lastHalf) : (firstHalf + lastHalf);
    }
    public static void main(String[] args)
    {
        String str = "mdaamdd"; //admdmda
        System.out.println(getPalindrome(str));
    }

}
