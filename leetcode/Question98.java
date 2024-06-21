package leetcode;

// Validate Binary Search Tree
public class Question98 {
    private static boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }
        int val = node.val;
        if (upper != null && val >= upper) {
            return false;
        }
        if (lower != null && val <= lower) {
            return false;
        }
        if (!helper(node.right, val, upper)) {
            return false;
        }
        if (!helper(node.left, lower, val)) {
            return false;
        }
        return true;
    }

    private static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public static void main(String[] args) {
        // Integer[] tree = { 2, 1, 3 };
        // Integer[] tree = { 5, 1, 4, null, null, 3, 6 };
        Integer[] tree = { 5, 4, 6, null, null, 3, 7 };
        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);
        // TreeNode.inOrderTraversal(root);
        System.out.println(isValidBST(root));
    }
}
