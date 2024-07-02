package leetcode;

// Maximum Nesting Depth of the Parentheses
public class Question1614 {
    public int maxDepth(String s) {
        int depth = 0, max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
                max = Math.max(max, depth);
            } else if (ch == ')') {
                depth--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Question1614 solution = new Question1614();
        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(solution.maxDepth(s));
    }
}
