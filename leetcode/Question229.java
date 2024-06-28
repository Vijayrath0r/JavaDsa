package leetcode;

// Majority Element II
import java.util.ArrayList;
import java.util.List;

public class Question229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int len = nums.length;

        int candidate1 = 0, candidate1Count = 0;
        int candidate2 = 0, candidate2Count = 0;

        for (int num : nums) {
            if (num == candidate1) {
                candidate1Count++;
            } else if (num == candidate2) {
                candidate2Count++;
            } else if (candidate1Count == 0) {
                candidate1 = num;
                candidate1Count = 1;
            } else if (candidate2Count == 0) {
                candidate2 = num;
                candidate2Count = 1;
            } else {
                candidate1Count--;
                candidate2Count--;
            }
        }

        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > len / 3) {
            result.add(candidate1);
        }
        if (count2 > len / 3) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
        Question229 solution = new Question229();
        int[] nums = { 3, 2, 3 };

        System.out.println(solution.majorityElement(nums));
    }

}
