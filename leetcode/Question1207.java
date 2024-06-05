package leetcode;

// Unique Number of Occurrences
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question1207 {
    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 2, 1, 1, 3 };
        // int[] arr = { 1, 2};
        int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        System.out.println(uniqueOccurrences(arr));
    }
}
