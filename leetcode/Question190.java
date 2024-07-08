package leetcode;

// Reverse Bits
public class Question190 {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = ans << 1 | n & 1;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Question190 solution = new Question190();
        int n = 43261596;

        System.out.println(solution.reverseBits(n));
    }
}
