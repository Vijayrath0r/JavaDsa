package leetcode;

// Path Sum
public class Question112 {
    private static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum -= root.val;
        if (targetSum == 0 && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }

    public static void main(String[] args) {
        Integer[] tree = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };
        int targetSum = 22;

        // Integer[] tree = { 1, 2 };
        // int targetSum = 1;

        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);
        System.out.println(hasPathSum(root, targetSum));
    }
}
