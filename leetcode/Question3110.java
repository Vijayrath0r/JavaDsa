package leetcode;

/**
 * Question3110 Score of a String
 */
public class Question3110 {
    public int scoreOfString(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            result += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }
        return result;
    }
}