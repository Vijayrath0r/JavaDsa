package leetcode;

//  Daily Temperatures
import java.util.Arrays;

public class Question739 {
    private static int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length, l = 0, count = 1;
        int[] result = new int[len];
        while (l < len - 1) {
            int r = l + 1;
            while (r < len) {
                if (temperatures[l] >= temperatures[r]) {
                    count++;
                } else {
                    result[l] = count;
                    count = 1;
                    break;
                }
                r++;
            }
            count = 1;
            l++;
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        // int[] temperatures = { 30, 40, 50, 60 };
        // int[] temperatures = { 30, 60, 90 };
        int[] temperatures = { 55, 38, 53, 81, 61, 93, 97, 32, 43, 78 };
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
