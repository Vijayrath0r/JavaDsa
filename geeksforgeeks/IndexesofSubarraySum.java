package geeksforgeeks;
// Indexes of Subarray Sum

import java.util.ArrayList;

public class IndexesofSubarraySum {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, right = 0;
        int prefixSum = arr[left];

        while (left < n) {
            if (prefixSum == s) {
                result.add(left + 1);
                result.add(right + 1);
                break;
            } else if ((prefixSum < s || left == right) && right < n - 1) {
                prefixSum += arr[++right];
            } else {
                prefixSum -= arr[left++];
            }
        }
        if (result.size() == 0) {
            result.add(-1);
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 7, 5 };
        // int n = 5, s = 12;

        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int n = 10, s = 15;

        // int[] arr = { 7, 2, 1 };
        // int n = 3, s = 2;

        // int[] arr = { 7, 2, 1 };
        // int n = 3, s = 2;

        // int[] arr = { 0 };
        // int n = 1, s = 1;

        // int[] arr = { 1, 2, 3, 4 };
        // int n = 4, s = 0;

        int[] arr = { 5, 4, 2 };
        int n = 3, s = 4;

        System.out.println(subarraySum(arr, n, s));
    }
}
