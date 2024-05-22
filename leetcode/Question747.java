package leetcode;

//  Largest Number At Least Twice of Others
public class Question747 {
    private static int dominantIndex(int[] nums) {
        Integer first = null, second = null;
        for (int i = 0; i < nums.length; i++) {
            if (first == null || nums[i] > nums[first]) {
                second = first;
                first = i;
            } else if (second == null || nums[second] < nums[i]) {
                second = i;
            }
        }
        return nums[second] * 2 <= nums[first] ? first : -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 1, 0 };
        // int[] nums = { 1, 2, 3, 4 };
        System.out.println(dominantIndex(nums));
    }
}
