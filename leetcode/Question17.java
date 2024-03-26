package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question17 {
    static List<String> result = new ArrayList<String>();
    static String[] keyPad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void helper(String digit, int idx, String mystr) {
        if (idx == digit.length()) {
            if (mystr != "") {
                result.add(mystr);
            }
            return;
        }
        char currentChar = digit.charAt(idx);
        String keyPadStr = keyPad[currentChar - '0'];
        for (int i = 0; i < keyPadStr.length(); i++) {
            helper(digit, idx + 1, mystr + keyPadStr.charAt(i));
        }
    }

    public static List<String> letterCombinations(String digits) {
        result.clear();
        helper(digits, 0, "");
        return result;
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
