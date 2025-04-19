package leetcode;

import java.util.Stack;

public class Minimumadd2makeparenthesisValid {
    public static void main(String[] args) {
//        String s = "{])}";
        String s = "())";
        System.out.println(minimunAdd(s));
    }
    private static int minimunAdd(String s) {
        Stack<Character> bal = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                bal.push(s.charAt(i));
            }else {
                if(!bal.isEmpty() &&
                        ((bal.peek() == '(' && s.charAt(i) == ')')
                                ||( bal.peek() == '{'  && s.charAt(i) == '}')
                                || (bal.peek() == '['  && s.charAt(i) == ']'))){
                    bal.pop();
                }else if ((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                    count++;
                }
            }
        }
        return count + bal.size();
    }
}
