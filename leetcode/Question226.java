package leetcode;

// Invert Binary Tree
public class Question226 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tempRight = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(tempRight);
        return root;
    }

    public static void main(String[] args) {
        Integer[] tree = { 4, 2, 7, 1, 3, 6, 9 };
        TreeNode root = TreeNode.createTreeFromArray(tree);

        TreeNode result = invertTree(root);
        TreeNode.printTree(result);
    }
}
