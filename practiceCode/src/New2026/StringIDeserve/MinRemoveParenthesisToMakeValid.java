package New2026.StringIDeserve;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class MinRemoveParenthesisToMakeValid {
    static boolean isParenthesis(char c)
    {
        return ((c == '(') || (c == ')'));
    }
    static boolean isValidString(String str)
    {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(')
                cnt++;
            else if (str.charAt(i) == ')')
                cnt--;
            if (cnt < 0)
                return false;
        }
        return (cnt == 0);
    }
    public static void removeInvalidParenthesis(String str) {
        String temp;
        List<String> ans = new LinkedList();
        if (str.isEmpty())
            return;
        // visit set to ignore already visited string
        HashSet<String> visit = new HashSet<String>();
        int cnt =0;
        for(int i=0 ; i < str.length() ; i++){
            if(isParenthesis(str.charAt(i))){
                if (str.charAt(i) == '(')
                    cnt++;
                else if (str.charAt(i) == ')')
                    cnt--;
            }
        }
        if(cnt == -1){
            for(int i=0 ; i < str.length() ; i++){
                 if ((str.charAt(i) == ')')){
                     temp = str.substring(0, i) + str.substring(i + 1);
                     if(isValidString(temp)){
                         if(!ans.contains(temp)) {
                             ans.add(temp);
                             System.out.println(temp);
                         }
                     }
                }
            }
        }else{
            for(int i=0 ; i < str.length() ; i++){
                if ((str.charAt(i) == '(')){
                    temp = str.substring(0, i) + str.substring(i + 1);
                    if(isValidString(temp)){
                        ans.add(temp);
                        System.out.println(temp);
                    }
                }
            }
        }

    }
    public static void main(String[] args)
    {
        String expression = "()())()";
        removeInvalidParenthesis(expression);


        expression = "()v)";
        //removeInvalidParenthesis(expression);
    }
}
