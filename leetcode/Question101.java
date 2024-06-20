package leetcode;

// Symmetric Tree
public class Question101 {
    private static boolean helper(TreeNode leftTree, TreeNode righTree) {
        if (leftTree == null && righTree == null) {
            return true;
        }
        if (leftTree == null || righTree == null || leftTree.val != righTree.val) {
            return false;
        }
        return helper(leftTree.left, righTree.right) && helper(leftTree.right, righTree.left);
    }

    private static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root.left, root.right);
    }

    public static void main(String[] args) {
        // Integer[] tree = { 1, 2, 2, 3, 4, 4, 3 };
        Integer[] tree = { 1, 2, 2, null, 3, null, 3 };
        TreeNode root = TreeNode.createTreeFromArray(tree);

        System.out.println(isSymmetric(root));
    }
}
