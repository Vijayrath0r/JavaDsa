package leetcode;

//  Binary Search
public class Question704 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Question704 solution = new Question704();
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;

        System.out.println(solution.search(nums, target));
    }
}
