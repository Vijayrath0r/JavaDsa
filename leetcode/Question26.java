//26. Remove Duplicates from Sorted Array
package leetcode;

public class Question26 {
    public static int removeDuplicates(int[] nums) {
        int temp;
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < len - 1; j++) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                i--;
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
Runtime 458 ms
Beats 5.30% of users with Java
Memory 44.84 MB
Beats 25.97% of users with Java
*/