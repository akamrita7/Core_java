package leetcode;

import java.util.Stack;
//https://www.geeksforgeeks.org/calculate-score-of-parentheses-from-a-given-string/

public class ScoreParenthesis {
    public static void main(String[] args)
    {
        System.out.println(10==scoreOfParentheses("(()(()()))"));
        System.out.println(6==scoreOfParentheses("(()(()))"));
        System.out.println(2==scoreOfParentheses("()()"));
    }
    static int scoreOfParentheses(String s)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(0);
            else {
                int tmp = stack.pop();
                int val = 0;
                if (tmp > 0)
                    val = tmp * 2;
                else
                    val = 1;
                stack.push(stack.pop() + val);
            }
        }
        return  stack.peek();
    }

}
