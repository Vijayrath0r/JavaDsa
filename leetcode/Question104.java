package leetcode;

// Maximum Depth of Binary Tree
public class Question104 {
    private static int helper(TreeNode node, int count) {
        if (node != null) {
            return Math.max(helper(node.left, count + 1), helper(node.right, count + 1));
        }
        return count;
    }

    private static int maxDepth(TreeNode root) {
        return helper(root, 0);
    }

    public static void main(String[] args) {
        Integer[] tree = { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = TreeNode.createTreeFromArray(tree);

        System.out.println(maxDepth(root));
    }
}
