package leetcode;

// Minimum Number of Changes to Make Binary String Beautiful
public class Question2914 {
    public int minChanges(String s) {
        int result = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(2 * i) != s.charAt(2 * i + 1)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Question2914 solution = new Question2914();
        String s = "1001";
        System.out.println(solution.minChanges(s));
    }
}
