package leetcode;

// Sort the People
import java.util.Arrays;

public class Question2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length, l = 0;
        while (l < n) {
            int max = l, r = l + 1;
            while (r < n) {
                if (heights[max] < heights[r])
                    max = r;
                r++;
            }
            if (max != l) {
                int temp = heights[l];
                heights[l] = heights[max];
                heights[max] = temp;

                String tempstr = names[l];
                names[l] = names[max];
                names[max] = tempstr;
            }
            l++;
        }
        return names;
    }

    public static void main(String[] args) {
        Question2418 solution = new Question2418();
        // String[] names = { "Mary", "John", "Emma" };
        // int[] heights = { 180, 165, 170 };

        String[] names = { "Alice", "Bob", "Bob" };
        int[] heights = { 155, 185, 150 };

        String[] result = solution.sortPeople(names, heights);

        System.out.println(Arrays.toString(result));
    }
}
