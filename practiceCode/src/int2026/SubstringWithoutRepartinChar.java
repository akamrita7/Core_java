package int2026;

/*Given a string s, find the substring of the  longest
length without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: abc
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: b
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: wke
Explanation: The answer is "wke", with the length of 3.*/
public class SubstringWithoutRepartinChar {
    public static void main(String[] args) {
        uniqueCharsubstring("abcabcbb");
        uniqueCharsubstring("bbbbb");
        uniqueCharsubstring("pwwkew");
    }

    private static void uniqueCharsubstring(String name) {
        boolean[] num = new boolean[26];
        int start = 0;
        int end = 0;
        int len = name.length();
        int res = 0;
        String res1 = String.valueOf(name.charAt(0));
        while(end < len){

            if(num[name.charAt(end) - 'a'] == true){
                while(num[name.charAt(start) - 'a'] == true){
                    num[name.charAt(start++) - 'a'] = false;
                }
            }else{

                num[name.charAt(end) - 'a'] = true;
                end++;
                res = Math.max(res , end - start);
                if(res == end - start){
                    res1 = name.substring(start,end);
                }
            }
        }
        System.out.println(res1);


    }
}
