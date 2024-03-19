package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class Question20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> Parentheses = new HashMap<Character, Character>();
        Parentheses.put(')', '(');
        Parentheses.put('}', '{');
        Parentheses.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if (stack.pop() != Parentheses.get(currentChar)) {
                    return false;
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // String s = "()[]{}";
        // String s = "(]";
        // String s = "({{(";
        String s = "]";
        System.out.println(isValid(s));
    }
}
