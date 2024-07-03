package leetcode;

// Power of Two
public class Question231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Question231 solution = new Question231();
        int n = 16;

        System.out.println(solution.isPowerOfTwo(n));
    }
}
