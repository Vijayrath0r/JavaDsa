package leetcode;

// Removing Stars From a String
import java.util.Stack;

public class Question2390 {
    private static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(currentChar);
            }
        }

        StringBuilder str = new StringBuilder();
        for (char c : stack) {
            str.append(c);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        // String s = "leet**cod*e";
        // String s = "erase*****";
        String s = "*e";
        System.out.println(removeStars(s));
    }
}
