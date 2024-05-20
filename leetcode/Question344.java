package leetcode;

//Reverse String
import java.util.Arrays;

public class Question344 {
    private static void reverseString(char[] s) {
        int n = s.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        // char[] s = { 'h', 'e', 'l', 'l', 'o' };
        char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString(s);
    }
}
