package leetcode;

// Maximal Score After Applying K Operations
import java.util.Collections;
import java.util.PriorityQueue;

public class Question2530 {
    public long maxKelements(int[] nums, int k) {
        long result = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            heap.add(num);
        }
        for (int i = 0; i < k; ++i) {
            final int num = heap.poll();
            result += num;
            heap.offer((num + 2) / 3);
        }
        return result;
    }

    public static void main(String[] args) {
        Question2530 solution = new Question2530();
        // int[] nums = { 10, 10, 10, 10, 11 };
        // int k = 5;

        int[] nums = { 1, 10, 3, 3, 3 };
        int k = 3;

        System.out.println(solution.maxKelements(nums, k));
    }
}
