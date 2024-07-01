package leetcode;

/**
 * Question1539 - Kth Missing Positive Number
 */
public class Question1539 {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length;
        while (start < end) {
            int mid = (start + end) / 2;
            int missingCount = arr[mid] - (mid + 1);

            if (missingCount < k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start + k;
    }

    public static void main(String[] args) {
        Question1539 solution = new Question1539();
        // int[] arr = { 2, 3, 4, 7, 11 };
        // int k = 5;

        // int[] arr = { 1, 2, 3, 4 };
        // int k = 2;

        // int[] arr = { 8 };
        // int k = 4;

        int[] arr = { 1, 2 };
        int k = 1;

        System.out.println(solution.findKthPositive(arr, k));
    }

}