package leetcode;

// Number of 1 Bits
public class Question191 {
    private static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        // int n = 11;
        int n = 128;
        System.out.println(hammingWeight(n));
    }
}
