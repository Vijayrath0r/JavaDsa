package leetcode;

// Flatten Binary Tree to Linked List
public class Question114 {

    private static void flatten(TreeNode root) {
        if (root == null)
            return;

        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left; // flattened left
        TreeNode right = root.right; // flattened right

        root.left = null;
        root.right = left;

        // Connect the original right subtree to the end of the new right subtree.
        TreeNode rightmost = root;
        while (rightmost.right != null)
            rightmost = rightmost.right;
        rightmost.right = right;
    }

    public static void main(String[] args) {
        Integer[] tree = { 1, 2, 5, 3, 4, null, 6 }; //
        // Integer[] tree = { 1, 2, 3, 4, 5, 6, 7 }; //
        TreeNode root = TreeNode.createTreeFromArray(tree);
        // TreeNode.printTree(root);
        flatten(root);

        TreeNode.printTree(root);
    }
}
