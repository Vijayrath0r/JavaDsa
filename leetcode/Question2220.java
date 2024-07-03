package leetcode;

// Minimum Bit Flips to Convert Number
public class Question2220 {
    public int minBitFlips(int start, int goal) {
        int changedBits = start ^ goal;
        int count = 0;
        while (changedBits != 0) {
            count += changedBits & 1;
            changedBits = changedBits >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Question2220 solution = new Question2220();
        int start = 10, goal = 7;

        System.out.println(solution.minBitFlips(start, goal));
    }
}
