package leetcode;

// Diameter of Binary Tree
public class Question543 {
    private static int maxDiagonal = 0;

    private static int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int LeftDepth = helper(node.left);
        int rightDepth = helper(node.right);
        maxDiagonal = Math.max(maxDiagonal, LeftDepth + rightDepth);
        return Math.max(LeftDepth, rightDepth) + 1;
    }

    private static int diameterOfBinaryTree(TreeNode root) {
        maxDiagonal = 0;
        helper(root);
        return maxDiagonal;
    }

    public static void main(String[] args) {
        // Integer[] tree = { 1, 2, 3, 4, 5 };
        // Integer[] tree = { 1, 2, 3, null, null, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
        // };
        Integer[] tree = { 1, 2 };
        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);

        System.out.println(diameterOfBinaryTree(root));
    }
}
