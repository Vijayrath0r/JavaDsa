package leetcode;

// Optimal Partition of String
public class Question2405 {
    public int partitionString(String s) {
        boolean[] alphabets = new boolean[26];
        int count = 1;
        for (char ch : s.toCharArray()) {
            if (alphabets[ch - 'a']) {
                alphabets = new boolean[26];
                count++;
            }
            alphabets[ch - 'a'] = true;
        }
        return count;
    }

    public static void main(String[] args) {
        Question2405 solution = new Question2405();

        String s = "abacaba";

        System.out.println(solution.partitionString(s));
    }
}
