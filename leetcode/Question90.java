package leetcode;

// Subsets II
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question90 {

    private static void generateSubsets(List<List<Integer>> result, List<Integer> temp, int idx, int[] nums) {
        result.add(new ArrayList<>(temp));
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1])
                continue; // Skip duplicates
            temp.add(nums[i]);
            generateSubsets(result, temp, i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }

    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(result, new ArrayList<>(), 0, nums);
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 2 };
        int[] nums = { 4, 4, 4, 1, 4 };
        System.out.println(subsetsWithDup(nums));
    }
}
