package leetcode;

public class Question11 {
    public static int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int maxWater = 0;
        while (start < end) {
            int tempMax = (height[start] >= height[end] ? height[end] : height[start]) * (end - start);
            if (tempMax > maxWater) {
                maxWater = tempMax;
            }
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        // int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 }; // 49
        // int[] height = { 1, 1 }; // 1
        int[] height = { 2, 3, 4, 5, 18, 17, 6 }; // 17
        System.out.println(maxArea(height));
    }
}
