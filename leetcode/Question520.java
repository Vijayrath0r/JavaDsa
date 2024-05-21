package leetcode;

// Detect Capital
public class Question520 {
    private static boolean isCapital(int val) {
        return (val >= 17 && val <= 42) ? true : false;
    }

    private static boolean detectCapitalUse(String word) {
        for (int i = 1; i < word.length(); i++) {
            int currentChar = word.charAt(i) - '0';
            int lastChar = word.charAt(i - 1) - '0';
            if ((isCapital(currentChar) && !isCapital(lastChar)
                    || (!isCapital(currentChar) && isCapital(lastChar) && i != 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String word = "USA";
        // String word = "FlaG";
        // String word = "leetcode";
        // String word = "Google";
        // String word = "googlE";
        // String word = "mL";
        String word = "FFFFFFFFFFFFFFFFFFFFf";
        System.out.println(detectCapitalUse(word));
        // System.out.println('A' - '0');
        // System.out.println('Z' - '0');
    }
}
