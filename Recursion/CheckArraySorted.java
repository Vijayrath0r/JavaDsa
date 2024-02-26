package Recursion;

public class CheckArraySorted {
    public static boolean checkSorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return checkSorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 9 };
        System.out.println(checkSorted(nums, 0));
    }
}
