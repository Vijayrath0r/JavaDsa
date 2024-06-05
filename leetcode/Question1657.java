package leetcode;

// Determine if Two Strings Are Close
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1657 {
    private static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : word2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        List<Integer> freqs1 = new ArrayList<>(map1.values());
        List<Integer> freqs2 = new ArrayList<>(map2.values());

        Collections.sort(freqs1);
        Collections.sort(freqs2);
        return freqs1.equals(freqs2);
    }

    public static void main(String[] args) {
        // String word1 = "abc", word2 = "bca";
        // String word1 = "uau", word2 = "ssx";
        String word1 = "aaabbbbccddeeeeefffff", word2 = "aaaaabbcccdddeeeeffff";
        System.out.println(closeStrings(word1, word2));
    }
}
