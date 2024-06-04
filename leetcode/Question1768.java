package leetcode;

// Merge Strings Alternately
public class Question1768 {
    private static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length(), idx1 = 0, idx2 = 0;
        StringBuilder str = new StringBuilder();
        while (idx1 < len1 || idx2 < len2) {
            if (idx1 < len1) {
                str.append(word1.charAt(idx1));
                idx1++;
            }
            if (idx2 < len2) {
                str.append(word2.charAt(idx2));
                idx2++;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        // String word1 = "abc", word2 = "pqr";
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
}
