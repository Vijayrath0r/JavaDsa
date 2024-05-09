package leetcode;

//Plus One
import java.util.Arrays;

public class Question66 {
    private static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        if (digits[n] < 9) {
            digits[n] = digits[n] + 1;
            return digits;
        }
        for (int i = n; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigit = new int[n + 2];
        Arrays.fill(newDigit, 0);
        newDigit[0] = 1;
        return newDigit;
    }

    public static void main(String[] args) {
        // int[] digits = { 1, 2, 3 };
        // int[] digits = { 4, 3, 2, 1 };
        // int[] digits = { 9 };
        int[] digits = { 8, 9 };
        // int[] digits = { 9, 9, 9 };
        // int[] digits = { 0 };
        System.out.println(Arrays.toString(plusOne(digits)));

    }
}
