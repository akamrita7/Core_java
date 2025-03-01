package leetcode;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s = "{([])}";
        if (isBalanced(s))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean isBalanced(String s) {
        Stack<Character> bal = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                bal.push(s.charAt(i));
            }else {
                if(!bal.isEmpty() &&
                        ((bal.peek() == '(' && s.charAt(i) == ')')
                        ||( bal.peek() == '{'  && s.charAt(i) == '}')
                        || (bal.peek() == '['  && s.charAt(i) == ']'))){
                    bal.pop();
                }else{
                    return false;
                }
            }
        }
        return bal.empty();
    }
}
