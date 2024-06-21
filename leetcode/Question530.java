package leetcode;

// Minimum Absolute Difference in BST
public class Question530 {
    private static int helper(TreeNode root, Integer lower, Integer upper) {
        int min = Integer.MAX_VALUE;
        if (root == null) {
            return min;
        }
        int val = root.val;
        if (lower != null) {
            min = Math.min(min, val - lower);
        }
        if (upper != null) {
            min = Math.min(min, upper - val);
        }
        min = Math.min(min, helper(root.left, lower, val));
        min = Math.min(min, helper(root.right, val, upper));
        return min;
    }

    private static int getMinimumDifference(TreeNode root) {
        return helper(root, null, null);
    }

    public static void main(String[] args) {
        // Integer[] tree = { 4, 2, 6, 1, 3 };
        // Integer[] tree = { 1,0,48,null,null,12,49};
        Integer[] tree = { 236, 104, 701, null, 227, null, 911 };
        TreeNode root = TreeNode.createTreeFromArray(tree);
        System.out.println(getMinimumDifference(root));
    }
}
