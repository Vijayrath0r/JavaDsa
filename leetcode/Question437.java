package leetcode;

//  Path Sum III
public class Question437 {
    private int helper(TreeNode root, int sum) {
        if (root == null)
            return 0;
        if ((root.val > 0 && sum < Integer.MIN_VALUE + root.val)
                || (root.val < 0 && sum > Integer.MAX_VALUE + root.val)) {
            return (sum == root.val ? 1 : 0);
        } else {
            return (sum == root.val ? 1 : 0)
                    + helper(root.left, sum - root.val)
                    + helper(root.right, sum - root.val);
        }
    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return helper(root, sum)
                + pathSum(root.left, sum)
                + pathSum(root.right, sum);
    }

    public static void main(String[] args) {
        Question437 solution = new Question437();
        // Integer[] tree = { 10, 5, -3, 3, 2, null, 11, 3, -2, null, 1 };
        // int targetSum = 8;

        Integer[] tree = { 1000000000, 1000000000, null, 294967296, null, 1000000000,
                null, 1000000000, null,
                1000000000 };
        int targetSum = 0;

        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);

        System.out.println(solution.pathSum(root, targetSum));
    }
}
