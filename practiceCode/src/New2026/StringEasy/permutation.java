package New2026.StringEasy;

//https://www.geeksforgeeks.org/program-print-substrings-given-string/
public class permutation {
    public static void main(String[] args)
    {
        String str = "abcd";
        printSubStrings(str);
    }

    private static void printSubStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            String subStr = "";
            for (int j = i; j < str.length(); j++) {
               subStr += str.charAt(j);
               System.out.println(subStr);
            }
        }
    }
}
