package New2026.StringEasy;
//https://www.geeksforgeeks.org/dsa/largest-substring-with-same-characters/

/*Given a string s of size N. The task is to find the largest substring which consists of the same characters
Examples:
Input : s = "abcdddddeff"
Output : 5
Substring is "ddddd"
Input : s = aabceebeee
Output : 3*/
public class largestSubstringWithSameCharacters {
    // Function to find largest sub
// string with same characters
    static int Substring(String s)
    {
        int ans = 1, temp = 1;
        // Traverse the string
        for (int i = 1; i < s.length(); i++)
        {
            // If character is same as
            // previous increment temp value
            if (s.charAt(i) == s.charAt(i - 1))
            {
                ++temp;
            }
            else
            {
                ans = Math.max(ans, temp);
                temp = 1;
            }
        }
        ans = Math.max(ans, temp);
        // Return the required answer
        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "abcdddddeff";
        // Function call
        System.out.println(Substring(s));
    }
}
