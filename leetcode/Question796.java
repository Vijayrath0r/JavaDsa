package leetcode;

// Rotate String
public class Question796 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String concatenated = s + s;
        return concatenated.contains(goal);
    }

    public static void main(String[] args) {
        Question796 solution = new Question796();
        String s = "abcde", goal = "cdeab";

        System.out.println(solution.rotateString(s, goal));
    }
}
