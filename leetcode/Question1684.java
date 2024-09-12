package leetcode;

/**
 * Question1684
 */
public class Question1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean alpha[] = new boolean[26];
        for (char ch : allowed.toCharArray()) {
            alpha[ch - 'a'] = true;
        }
        for (int i = 0; i < words.length; i++) {
            boolean isConsistent = true;
            for (char ch : words[i].toCharArray()) {
                if (!alpha[ch - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Question1684 solution = new Question1684();
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };

        System.out.println(solution.countConsistentStrings(allowed, words));
    }
}