package leetcode;

// Count Good Nodes in Binary Tree
public class Question1448 {
    public int helper(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        max = Math.max(max, node.val);
        return (node.val >= max ? 1 : 0) + helper(node.left, max) + helper(node.right, max);
    }

    public int goodNodes(TreeNode root) {
        return helper(root, Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        Question1448 solution = new Question1448();
        // Integer[] tree = { 3, 1, 4, 3, null, 1, 5 };
        // Integer[] tree = { 3, 3, null, 4, 2 };
        // Integer[] tree = { 3 };
        // Integer[] tree = { 3, 3, null, 4, 2, 10, 25, 66, 487, 5, 2, 36, 4, 8, 4 };
        Integer[] tree = { 30, 4, 2, 10, 25, 66, 487, 5, 2, 36, 4, 8, 4 };
        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);

        System.out.println(solution.goodNodes(root));
    }
}
