package leetcode;

// Same Tree
public class Question100 {
    private static boolean helper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p != null && q == null) || (p == null && q != null) || (p.val != q.val)) {
            return false;
        }
        return helper(p.left, q.left) && helper(p.right, q.right);
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        return helper(p, q);
    }

    public static void main(String[] args) {
        // Integer[] tree1 = { 1, 2, 3 }, tree2 = { 1, 2, 3 };
        // Integer[] tree1 = { 1, 2 }, tree2 = { 1, null, 2 };
        Integer[] tree1 = { 1, 2, 1 }, tree2 = { 1, 1, 2 };
        TreeNode p = TreeNode.createTreeFromArray(tree1);
        TreeNode q = TreeNode.createTreeFromArray(tree2);

        System.out.println(isSameTree(p, q));
    }
}
