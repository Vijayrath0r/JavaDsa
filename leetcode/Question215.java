package leetcode;

// Kth Largest Element in an Array
import java.util.PriorityQueue;
import java.util.Queue;

public class Question215 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        Question215 solution = new Question215();
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(solution.findKthLargest(nums, k));
    }
}
