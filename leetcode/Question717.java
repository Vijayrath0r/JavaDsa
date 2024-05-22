package leetcode;

// 1-bit and 2-bit Characters
public class Question717 {
    private static boolean isOneBitCharacter(int[] bits) {
        int idx = 0;
        int len = bits.length;
        while (idx < len) {
            if (bits[idx] == 0) {
                if (idx == len - 1) {
                    return true;
                }
                idx++;
            }
            if (idx + 1 < len && bits[idx] == 1) {
                idx += 2;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] bits = { 1, 0, 0 };
        int[] bits = { 1, 1, 1, 0 };
        System.out.println(isOneBitCharacter(bits));
    }
}
