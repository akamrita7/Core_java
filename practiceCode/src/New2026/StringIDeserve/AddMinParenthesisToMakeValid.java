package New2026.StringIDeserve;

import static java.lang.Math.abs;

public class AddMinParenthesisToMakeValid {
    public static void main(String args[])
    {
        String p = "()))";
        // Function to print required answer
        System.out.println(minParentheses(p));

    }
    private static int minParentheses(String str) {
        int bal = 0;
        for (int i = 0; i < str.length(); ++i) {
            bal += str.charAt(i) == '(' ? 1 :-1;
        }
        return abs(bal);
    }
}
