package New2026.StringEasy;

/*Count Distinct Subsequences
        Examples:
        Input  : str = "gfg"
        Output : 7
        The seven distinct subsequences are "", "g", "f",
        "gf", "fg", "gg" and "gfg"
        Input  : str = "ggg"
        Output : 4
        The four distinct subsequences are "", "g", "gg"
        and "ggg"*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class count_distinct_subsequences {
    // Returns count of distinct
    // subsequences of str.
    public static int countSub(String s)
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // Iterate from 0 to s.length()
        for(int i = 0; i < s.length(); i++)
        {
            map.put(s.charAt(i), -1);
        }
        int allCount = 0;
        int levelCount = 0;
        // Iterate from 0 to s.length()
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            // Check if i equal to 0
            if(i==0) {
                allCount = 1;
                map.put(c,1);
                levelCount = 1;
                continue;
            }
            // Replace levelCount withe
            // allCount + 1
            levelCount = allCount + 1;
            // If map is less than 0
            if(map.get(c)<0)
            {
                allCount = allCount + levelCount;
            }
            else
            {
                allCount = allCount + levelCount - map.get(c);
            }
            map.put(c,levelCount);
        }
        // Return answer
        return allCount;
    }

    // Driver Code
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("abab","gfg");

        for(String s : list)
        {
            int cnt = countSub(s);
            int withEmptyString = cnt+1;
            System.out.println("With empty string count for " +
                    s +" is " + withEmptyString);
            System.out.println("Without empty string count for " +
                    s + " is " + cnt);
        }
    }
}
