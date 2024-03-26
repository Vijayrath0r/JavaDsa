package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question22 {
    public static List<String> result = new ArrayList<>();

    private static void helper(int n, int idx, int closings, String str) {
        if (idx == n) {
            if (closings > 0) {
                for (int i = 0; i < closings; i++) {
                    str += ")";
                }
            }
            if (!result.contains(str.toString())) {
                result.add(str.toString());
            }
            return;
        }
        if (closings > 0) {
            helper(n, idx, closings - 1, str + ")");
        }
        helper(n, idx + 1, closings + 1, str + "(");
        helper(n, idx + 1, closings, str + "()");
    }

    public static List<String> generateParenthesis(int n) {
        result.clear();
        helper(n, 0, 0, "");
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}
