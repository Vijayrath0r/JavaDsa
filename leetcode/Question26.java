//26. Remove Duplicates from Sorted Array
package leetcode;

public class Question26 {
    public static int removeDuplicates(int[] nums) {
        int temp;
        int len = nums.length;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < len - 1; j++) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                len--;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7 };
        System.out.println(removeDuplicates(arr));
    }
}
/*
 * Runtime 7 ms
 * Beats 5.30% of users with Java
 * Memory 44.68 MB
 * Beats 60.30% of users with Java
 */