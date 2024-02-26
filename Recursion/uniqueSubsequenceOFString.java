package Recursion;

import java.util.HashSet;

public class uniqueSubsequenceOFString {
    public static void printUniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char currentChar = str.charAt(idx);
        // to be
        printUniqueSubsequence(str, idx + 1, newString + currentChar, set);
        // not to be
        printUniqueSubsequence(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "AAA";
        HashSet<String> set = new HashSet<>();
        printUniqueSubsequence(str, 0, "", set);
    }
}
