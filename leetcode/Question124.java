package leetcode;

// Binary Tree Maximum Path Sum
public class Question124 {
    private int maxPath = 0;

    public int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftVal = Math.max(0, helper(node.left));
        int rightVal = Math.max(0, helper(node.right));

        int currentPathSum = node.val + leftVal + rightVal;
        maxPath = Math.max(maxPath, currentPathSum);

        return node.val + Math.max(leftVal, rightVal);
    }

    public int maxPathSum(TreeNode root) {
        maxPath = Integer.MIN_VALUE;
        helper(root);
        return maxPath;
    }

    public static void main(String[] args) {
        Question124 solution = new Question124();
        // Integer[] list = { 1, 2, 3 };
        // Integer[] list = { -10, 9, 20, null, null, 15, 7 };
        Integer[] list = { 1, -2, 3 };
        TreeNode root = TreeNode.createTreeFromArray(list);
        TreeNode.printTree(root);

        System.out.println(solution.maxPathSum(root));
    }
}
