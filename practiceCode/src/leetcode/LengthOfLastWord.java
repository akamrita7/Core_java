package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Geeks For Geeks";
        System.out.println(lengthOfLastWord1(s));
        s = "Start Coding Here";
        System.out.println(lengthOfLastWord(s));
        s = "";
        System.out.println(lengthOfLastWord1(s));
    }

    private static int lengthOfLastWord1(String s) {
        s = s.trim();
        StringBuffer sb = new StringBuffer();
        char[] c = s.toCharArray();
        int len = c.length-1;
        int count = 0;
        while(len>0 && c[len] != ' ' ){
//            sb.append(c[len]);
            count++;
            len--;
        }
        return count;
//       return sb.length();
    }

    private static int lengthOfLastWord(String s) {
        Pattern p = Pattern.compile("[^ ]*$");
        Matcher matcher = p.matcher(s.trim());
        while (matcher.find()){
            String lastWord = matcher.group();
            return lastWord.length();
        }
        return 0;
    }
}
