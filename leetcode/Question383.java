package leetcode;

// Ransom Note
import java.util.HashMap;

public class Question383 {
    private static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
                if (hm.get(ch) == 0)
                    hm.remove(ch);
                if (hm.isEmpty())
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String ransomNote = "a", magazine = "b";
        // String ransomNote = "aa", magazine = "aab";
        String ransomNote = "fsdfsadfsdfs", magazine = "abcs";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
