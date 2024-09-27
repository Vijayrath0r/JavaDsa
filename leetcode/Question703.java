package leetcode;

import java.util.PriorityQueue;

/**
 * Question703 Kth Largest Element in a Stream
 */
public class Question703 {
    PriorityQueue<Integer> pd = new PriorityQueue<>();
    int limit = 0;

    public Question703(int k, int[] nums) {
        limit = k;
        for (int i = 0; i < nums.length; i++) {
            pd.add(nums[i]);
        }
        while (pd.size() > limit) {
            pd.poll();
        }
    }

    public int add(int val) {
        pd.add(val);
        while (pd.size() > limit) {
            pd.poll();
        }
        return (int) pd.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = { 4, 5, 8, 2 };

        Question703 obj = new Question703(k, nums);

        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
    }
}