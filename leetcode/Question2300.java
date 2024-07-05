package leetcode;

// Successful Pairs of Spells and Potions
import java.util.Arrays;

public class Question2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int len = potions.length;
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int val = spells[i];
            int start = 0, end = len - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                // Use division to avoid overflow
                if ((long) val * potions[mid] >= success) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            result[i] = len - start;
        }
        return result;
    }

    public static void main(String[] args) {
        Question2300 solution = new Question2300();
        int[] spells = { 5, 1, 3 }, potions = { 1, 2, 3, 4, 5 };
        int success = 7;

        int[] result = solution.successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(result));
    }
}
