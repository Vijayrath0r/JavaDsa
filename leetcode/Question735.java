package leetcode;

// Asteroid Collision
import java.util.Arrays;
import java.util.Stack;

public class Question735 {
    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids) {
            boolean destroyed = false;
            while (!stack.empty() && ast < 0 && stack.peek() > 0) {
                int top = stack.pop();
                if (top == -ast) {
                    destroyed = true;
                    break;
                } else if (top > -ast) {
                    stack.push(top);
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stack.push(ast);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] asteroids = { 5, 10, -5 };
        // int[] asteroids = { 8, -8 };
        // int[] asteroids = { 10, 2, -5 };
        // int[] asteroids = { -2, -1, 1, 2 };
        // int[] asteroids = { -2, -2, 1, -1 };
        // int[] asteroids = { -2, -2, 1, -2 };
        // int[] asteroids = { -2, 1, 1, -1 };
        int[] asteroids = { 1, -2, -2, -2 };
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}
