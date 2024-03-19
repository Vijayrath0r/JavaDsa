package leetcode;

import java.util.HashMap;

public class Question13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        int sum = romanNumerals.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 1; i > 0; i--) {
            if (romanNumerals.get(s.charAt(i)) > romanNumerals.get(s.charAt(i - 1))) {
                sum -= romanNumerals.get(s.charAt(i - 1));
            } else {
                sum += romanNumerals.get(s.charAt(i - 1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // String roman = "III";
        // String roman = "LVIII";
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
    }
}