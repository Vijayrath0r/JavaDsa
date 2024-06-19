package leetcode;

// Binary Tree Right Side View
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question199 {
    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                // If it's the last node of the current level, add it to the result
                if (i == levelSize - 1) {
                    result.add(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Integer[] tree = { 1, 2, 3, null, 5, null, 4 };
        Integer[] tree = { 1, 2, 3, 4 };
        TreeNode root = TreeNode.createTreeFromArray(tree);

        System.out.println(rightSideView(root));
    }
}
