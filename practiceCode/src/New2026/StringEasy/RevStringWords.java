package New2026.StringEasy;

/*Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

        Input: s = “geeks quiz practice code”
Output: s = “code practice quiz geeks”

Input: s = “getting good at coding needs a lot of practice”
Output: s = “practice of lot a needs coding at good getting”
*/
public class RevStringWords {
    public static void main(String[] args) {
        String s = "getting good at coding needs a lot of practice";
        String s1 = "practice of lot a needs coding at good getting";
        String[] words = s.split("\\s");
//        words = reverseString(words, words.length);
        s = String.join(" ", words);
        System.out.println(s);
        System.out.println(reverseString1(words));
    }

    private static String reverseString1(String[] arr) {
        int start = 0 ; int end = arr.length-1;
        while (start<end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.join(" " , arr);
    }

    private static String[] reverseString(String[] s, int l) {
        int j = l/2;
        if(l%2 == 0) j= j-1;
        while(j<=l-1){
            String temp;
            temp = s[l-j];
            s[l-j] = s[j];
            s[j] = temp;
            j++;
        }
        return s;
    }
    private static String reverseString2(String[] s) {
        String ans = "";
        for (int i= s.length-1 ;i>=0;i--)
        {
            ans+=s[i]+ " ";
        }
        return ans;
    }
}
