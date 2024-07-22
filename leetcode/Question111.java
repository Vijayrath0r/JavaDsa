package leetcode;

// Minimum Depth of Binary Tree
public class Question111 {
    public int helper(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.min(helper(root.left), helper(root.right)) + 1;
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root);
    }

    public static void main(String[] args) {
        Question111 solution = new Question111();
        // Integer[] tree = { 3, 9, 20, null, null, 15, 7 };
        Integer[] tree = { 2, null, 3, null, 4, null, 5, null, 6 };

        TreeNode root = TreeNode.createTreeFromArray(tree);
        System.out.println(solution.minDepth(root));
    }
}
