package leetcode;

public class Question70 {
    public static int helper(int currentPos, int target) {
        if (currentPos > target || target < 1) {
            return 0;
        }
        if (currentPos == target) {
            return 1;
        }
        int stepOne = helper(currentPos + 1, target);
        int stepTwo = helper(currentPos + 2, target);
        return stepOne + stepTwo;
    }

    public static int climbStairs(int n) {
        return helper(0, n);
    }

    public static void main(String[] args) {
        int n = 44;
        System.out.println(climbStairs(n));
    }
}
