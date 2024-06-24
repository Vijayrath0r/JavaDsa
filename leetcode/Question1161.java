package leetcode;

// Maximum Level Sum of a Binary Tree
import java.util.LinkedList;
import java.util.Queue;

public class Question1161 {
    private static int maxLevelSum(TreeNode root) {
        int maxSum = root.val, maxLevel = 0, level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                sum += current.val;
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            if (sum > maxSum) {
                maxLevel = level;
                maxSum = sum;
            }
        }
        return maxLevel;
    }

    public static void main(String[] args) {
        Integer[] tree = { 1, 7, 0, 7, -8, null, null };

        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);
        System.out.println(maxLevelSum(root));
    }
}
