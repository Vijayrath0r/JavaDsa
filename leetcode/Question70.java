package leetcode;

// Climbing Stairs
public class Question70 {
    public static int helper(int currentPos, int target, int[] stairs) {
        if (currentPos > target || target < 1) {
            return 0;
        }
        if (currentPos == target) {
            return 1;
        }
        if (stairs[currentPos] != 0) {
            return stairs[currentPos];
        }
        int sum = helper(currentPos + 1, target, stairs) + helper(currentPos + 2, target, stairs);
        if (stairs[currentPos] == 0 || stairs[currentPos] < sum) {
            stairs[currentPos] = sum;
        }
        return sum;
    }

    public static int climbStairs(int n) {
        int[] stairs = new int[n];
        return helper(0, n, stairs);
    }

    public static void main(String[] args) {
        int n = 44;
        System.out.println(climbStairs(n));
    }
}
