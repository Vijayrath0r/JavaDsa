package leetcode;

// Balanced Binary Tree
public class Question110 {
    private static int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = helper(node.left);
        int right = helper(node.right);
        if (left == -1 || right == -1 || Math.abs(right - left) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }

    private static boolean isBalanced(TreeNode root) {
        return helper(root) == -1 ? false : true;
    }

    public static void main(String[] args) {
        Integer[] tree = { 3, 9, 20, null, null, 15, 7 };
        // Integer[] tree = { 1, 2, 2, 3, 3, null, null, 4, 4 };
        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);

        System.out.println(isBalanced(root));
    }
}
