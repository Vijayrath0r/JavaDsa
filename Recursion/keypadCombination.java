package Recursion;

public class keypadCombination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pdrs", "tu", "vwx", "yz" };

    public static void printCombination(String str, int idx, String combinationString) {
        if (idx == str.length()) {
            System.out.println(combinationString);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx + 1, combinationString + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printCombination(str, 0, "");
    }
}
