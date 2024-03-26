package leetcode;

public class Question12 {
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            if (num - 1000 >= 0) {
                result.append("M");
                num -= 1000;
            } else if (num - 900 >= 0) {
                result.append("CM");
                num -= 900;
            } else if (num - 500 >= 0) {
                result.append("D");
                num -= 500;
            } else if (num - 400 >= 0) {
                result.append("CD");
                num -= 400;
            } else if (num - 100 >= 0) {
                result.append("C");
                num -= 100;
            } else if (num - 90 >= 0) {
                result.append("XC");
                num -= 90;
            } else if (num - 50 >= 0) {
                result.append("L");
                num -= 50;
            } else if (num - 40 >= 0) {
                result.append("XL");
                num -= 40;
            } else if (num - 10 >= 0) {
                result.append("X");
                num -= 10;
            } else if (num - 9 >= 0) {
                result.append("IX");
                num -= 9;
            } else if (num - 5 >= 0) {
                result.append("V");
                num -= 5;
            } else if (num - 4 >= 0) {
                result.append("IV");
                num -= 4;
            } else if (num - 1 >= 0) {
                result.append("I");
                num -= 1;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // int num = 3; // III
        int num = 58; // LVIII
        // int num = 1994; // MCMXCIV
        System.out.println(intToRoman(num));
    }
}