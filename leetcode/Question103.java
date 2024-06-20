package leetcode;

// Binary Tree Zigzag Level Order Traversal
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question103 {
    private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean fromStart = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> level = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if (fromStart) {
                    level.addLast(currentNode.val);
                } else {
                    level.addFirst(currentNode.val);
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(level);
            fromStart = !fromStart;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] tree = { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = TreeNode.createTreeFromArray(tree);

        System.out.println(zigzagLevelOrder(root));
    }
}
