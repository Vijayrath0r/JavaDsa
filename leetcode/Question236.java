package leetcode;

// Lowest Common Ancestor of a Binary Tree
public class Question236 {
    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }

    public static void main(String[] args) {
        Integer[] tree = { 3, 5, 1, 6, 2, 0, 8, null, null, 7, 4 };

        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode p = root.left;
        TreeNode q = root.right.left.left;

        TreeNode result = lowestCommonAncestor(root, p, q);
        TreeNode.printTree(result);
    }
}
