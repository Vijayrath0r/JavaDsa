package leetcode;

// Isomorphic Strings
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question205 {
    private static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hm = new HashMap<>();
        Set<Character> uniqueValues = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char currentSChar = s.charAt(i);
            char currentTChar = t.charAt(i);

            if (hm.containsKey(currentSChar)) {
                if (hm.get(currentSChar) != currentTChar) {
                    return false;
                }
            } else {
                if (!uniqueValues.add(currentTChar)) {
                    return false;
                }
                hm.put(currentSChar, currentTChar);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String s = "egg", t = "add";
        // String s = "foo", t = "bar";
        // String s = "paper", t = "title";
        String s = "ABCD", t = "EFGH";
        System.out.println(isIsomorphic(s, t));
    }
}
