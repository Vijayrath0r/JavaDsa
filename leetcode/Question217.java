package leetcode;

// Contains Duplicate
import java.util.HashSet;

public class Question217 {
    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true; // If add returns false, the element already exists in the set
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 1 };
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(nums)); // Output: false
    }
}
