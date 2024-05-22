package leetcode;

//Summary Ranges
import java.util.ArrayList;
import java.util.List;

public class Question228 {
    private static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if (nums.length == 0) {
            return result;
        }
        StringBuilder temp = new StringBuilder("");
        int len = nums.length;
        int start = 0, end = 0;

        while (end < len) {
            if (end + 1 < len && nums[end + 1] == nums[end] + 1) {
                end = end + 1;
            } else {
                if (nums[start] == nums[end]) {
                    temp.append(nums[start]);
                } else {
                    temp.append(nums[start]);
                    temp.append("->");
                    temp.append(nums[end]);
                }
                result.add(temp.toString());
                temp.setLength(0);
                start = ++end;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = { 0, 1, 2, 4, 5, 7 };
        int[] nums = { 0, 2, 3, 4, 6, 8, 9 };
        // int[] nums = { };
        // int[] nums = { 7 };
        // int[] nums = { 5, 7 };
        System.out.println(summaryRanges(nums));
    }
}
