package New2026.StringEasy;

/*Given a string S consisting of N, lower case English alphabet, it is also given that a string is encrypted by first replacing every substring of the string consisting of the same character with the concatenation of that character and the hexadecimal representation of the size of the substring and then revering the whole string, the task is to find the encrypted string.
        Note: All Hexadecimal letters should be converted to Lowercase letters.
        Examples:
        Input: S = “aaaaaaaaaaa”
        Output: ba
        Explanation:
        First convert the given string to “a11” i.e. write, character along with its frequency.
        Then, change “a11” to “ab” because 11 is b in hexadecimal.
        Then, finally reverse the string i.e “ba”.
        Input: S = “abc”
        Output: 1c1b1a*/

public class EncryptString {
    public static void main(String[] args)
    {
        // Given Input
        String S = "aaaaaaaaaaa";
        int N = S.length();
        // Function Call
        System.out.println(encryptString(S, N));
    }

    private static String encryptString(String s, int n) {
        StringBuffer ans = new StringBuffer();
        for(int i = 0 ; i < n ; i++){
            int count = 0;
            String hex;
            char ch = s.charAt(i);
            while(i < n && s.charAt(i) == ch){
                count++;
                i++;
            }
            i--;
            hex = convertToHex(count);
            ans.append(ch).append(hex);
        }
        ans.reverse();
        return ans.toString();

    }

    private static String convertToHex(int num) {
        StringBuffer temp = new StringBuffer();
        while(num != 0){
            int rem = num %16;
            char c;
            if(rem < 10){
                c = (char)(rem+48);
            }else{
                c = (char)(rem+78);
            }
            temp.append(c);
            num = num/16;
        }
        return temp.toString();
    }
}
