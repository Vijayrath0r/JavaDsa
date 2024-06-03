package leetcode;

// Binary Gap
public class Question868 {
    private static int binaryGap(int n) {
        int start = -1, end = -1, idx = 0, result = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                if (start == -1 || start < end) {
                    start = idx;
                } else if (end <= start) {
                    end = idx;
                    result = Math.max(result, end - start);
                    start = end;
                }
            }
            n >>= 1;
            idx++;
        }
        return Math.max(result, end - start);
    }

    public static void main(String[] args) {
        // int n = 22; // 2
        // int n = 8; // 0
        int n = 5; // 2
        System.out.println(binaryGap(n));
    }
}
