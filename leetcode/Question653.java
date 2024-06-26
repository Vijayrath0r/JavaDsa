package leetcode;

// Two Sum IV - Input is a BST
import java.util.HashSet;
import java.util.Set;

public class Question653 {
    private boolean helper(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        int val = root.val;
        if (set.contains(val)) {
            return true;
        }
        set.add(k - val);
        return helper(root.left, k, set) || helper(root.right, k, set);
    }

    private boolean findTarget(TreeNode root, int k) {
        return helper(root, k, new HashSet<>());
    }

    public static void main(String[] args) {
        Question653 solution = new Question653();
        // Integer[] tree = { 5, 3, 6, 2, 4, null, 7 };
        // int k = 9;
        // int k = 28;
        Integer[] tree = { 2, 1, 3 };
        int k = 1;

        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);

        System.out.println(solution.findTarget(root, k));
    }
}
