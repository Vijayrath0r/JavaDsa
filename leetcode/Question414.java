package leetcode;

// Third Maximum Number
import java.util.HashSet;
import java.util.Set;

public class Question414 {
    private static int thirdMax(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        Integer first = null, second = null, third = null;

        for (int num : nums) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
                if (first == null || num > first) {
                    third = second;
                    second = first;
                    first = num;
                } else if (second == null || num > second) {
                    third = second;
                    second = num;
                } else if (third == null || num > third) {
                    third = num;
                }
            }
        }
        return third == null ? first : third;
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 2, 1 };
        // int[] nums = { 1, 2 };
        // int[] nums = { 2, 2, 3, 1 };
        // int[] nums = { 5, 2, 2 };
        // int[] nums = { 1, 2, 2, 5, 3, 5 };
        // int[] nums = { 1, 2, -2147483648 };
        int[] nums = { 2, 2, 3, 1 };
        // int[] nums = { -2147483648, 1, 1 };
        // int[] nums = { 1, -2147483648, 2 };
        System.out.println(thirdMax(nums));
    }
}