package leetcode;

//  Word Pattern
import java.util.HashMap;
import java.util.Map;

public class Question290 {
    private static boolean wordPattern(String pattern, String s) {
        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        String[] sArr = s.split(" ");

        if (pattern.length() != sArr.length) {
            return false;
        }

        for (int i = 0; i < sArr.length; i++) {
            char pChar = pattern.charAt(i);
            String word = sArr[i];

            if (pMap.containsKey(pChar)) {
                if (!pMap.get(pChar).equals(word)) {
                    return false;
                }
            } else {
                if (sMap.containsKey(word)) {
                    if (sMap.get(word) != pChar) {
                        return false;
                    }
                }
                pMap.put(pChar, word);
                sMap.put(word, pChar);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String pattern = "abba", s = "dog cat cat dog";
        // String pattern = "abba", s = "dog cat cat fish";
        // String pattern = "aaaa", s = "dog cat cat dog";
        // String pattern = "abcd", s = "vijay rathor suraj rathor";
        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd",
                s = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        System.out.println(wordPattern(pattern, s));
    }
}
