package leetcode;

// Subsets
import java.util.ArrayList;
import java.util.List;

public class Question78 {

    private static void generateSubsets(List<List<Integer>> result, List<Integer> temp, int idx, int[] nums) {
        result.add(new ArrayList<>(temp));
        for (int i = idx; i < nums.length; i++) {
            temp.add(nums[i]);
            generateSubsets(result, temp, i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(result, new ArrayList<>(), 0, nums);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(subsets(nums));
    }
}
