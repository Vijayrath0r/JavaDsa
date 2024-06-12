package leetcode;

// Contains Duplicate II
import java.util.HashSet;
import java.util.Set;

public class Question219 {
    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if (len == 1 || k == 0) {
            return false;
        }
        int l = 0, r = 1;
        Set<Integer> set = new HashSet<>();
        set.add(nums[l]);
        while (r < len) {
            if (!set.add(nums[r])) {
                return true;
            }
            r++;
            if (r - l > k) {
                set.remove(nums[l]);
                l++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;

        // int[] nums = { 1,0,1,1};
        // int k = 1;

        // int[] nums = { 1, 2, 3, 1, 2, 3 };
        // int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
