package leetcode;

// Remove Outermost Parentheses
public class Question1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    result.append(ch);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Question1021 solution = new Question1021();
        // String s = "(()())(())";
        String s = "((()())(()()))";

        System.out.println(solution.removeOuterParentheses(s));
    }
}
