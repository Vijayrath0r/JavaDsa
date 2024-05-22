package leetcode;

// Complement of Base 10 Integer
public class Question1009 {
    private static int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            str.append((n % 2) ^ 1);
            n = n / 2;
        }
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                result = result + (int) Math.pow(2, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int n = 5;
        int n = 7;
        // int n = 13;
        // int n = 0;
        System.out.println(bitwiseComplement(n));
        System.out.println();
    }
}
