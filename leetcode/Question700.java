package leetcode;

// Search in a Binary Search Tree
public class Question700 {
    private static TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } else if (root.val > val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Integer[] tree = { 4, 2, 7, 1, 3 };
        TreeNode root = TreeNode.createTreeFromArray(tree);
        int val = 2;

        TreeNode result = searchBST(root, val);
        TreeNode.printTree(result);
    }
}
