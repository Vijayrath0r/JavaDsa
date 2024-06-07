package leetcode;

// Two Sum II - Input Array Is Sorted
import java.util.Arrays;

public class Question167 {
    private static int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        int[] result = new int[2];
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                result[0] = l + 1;
                result[1] = r + 1;
                break;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // int[] numbers = { 2, 7, 11, 15 };
        // int target = 9;

        // int[] numbers = { 2, 3, 4 };
        // int target = 6;

        // int[] numbers = { -1, 0 };
        // int target = -1;

        // int[] numbers = { 5, 25, 75 };
        // int target = 100;

        int[] numbers = { 3, 24, 50, 79, 88, 150, 345 };
        int target = 200;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
