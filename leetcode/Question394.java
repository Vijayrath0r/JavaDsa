package leetcode;

// Decode String
import java.util.Stack;

public class Question394 {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int num = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(num);
                strStack.push(result.toString());
                result = new StringBuilder();
                num = 0;
            } else if (ch == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int repeatCount = numStack.pop();
                for (int j = 0; j < repeatCount; j++) {
                    temp.append(result);
                }
                result = temp;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Question394 solution = new Question394();
        // String s = "3[a]2[bc]";
        // String s = "3[a2[c]]";
        String s = "3[a2[c3[bd]]]";

        System.out.println(solution.decodeString(s));
        System.out.println("acbdbdbdcbdbdbdacbdbdbdcbdbdbdacbdbdbdcbdbdbd");

    }
}
