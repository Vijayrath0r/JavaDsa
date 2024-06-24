package leetcode;

//  Longest ZigZag Path in a Binary Tree
public class Question1372 {
    private static int maxZigZag = 0;

    private static void helper(TreeNode root, int count, boolean isLeft) {
        if (root == null) {
            return;
        }
        maxZigZag = Math.max(maxZigZag, count);

        if (isLeft) {
            helper(root.right, count + 1, false); // Continue the zigzag to the right
            helper(root.left, 1, true); // Start a new zigzag from the left child
        } else {
            helper(root.left, count + 1, true); // Continue the zigzag to the left
            helper(root.right, 1, false); // Start a new zigzag from the right child
        }
    }

    private static int longestZigZag(TreeNode root) {
        maxZigZag = 0;
        helper(root.left, 1, true);
        helper(root.right, 1, false);
        return maxZigZag;
    }

    public static void main(String[] args) {
        Integer[] tree = { 1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1 };
        // Integer[] tree = { 1, 1, 1, null, 1, null, null, 1, 1, null, 1 };
        // Integer[] tree = { 1 };
        // Integer[] tree = { 1, null, 1, 1, 1, null, null, null, 1 };

        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);

        System.out.println(longestZigZag(root));
    }
}
