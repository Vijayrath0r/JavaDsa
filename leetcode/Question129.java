package leetcode;

// Sum Root to Leaf Numbers
public class Question129 {
    private static int helper(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        sum = sum * 10 + node.val;
        if (node.left == null && node.right == null) {
            return sum;
        }
        return helper(node.left, sum) + helper(node.right, sum);
    }

    private static int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public static void main(String[] args) {
        // Integer[] tree = { 1, 2, 3 };
        Integer[] tree = { 4, 9, 0, 5, 1 };
        TreeNode root = TreeNode.createTreeFromArray(tree);

        System.out.println(sumNumbers(root));
    }
}