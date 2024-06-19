package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question144 {
    private static void helper(TreeNode node, List<Integer> result) {
        if (node != null) {
            result.add(node.val);
            helper(node.left, result);
            helper(node.right, result);
        }
    }

    private static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public static void main(String[] args) {
        Integer[] tree = { 1, null, 2, 3 };
        TreeNode root = TreeNode.createTreeFromArray(tree);
        // TreeNode.printTree(root);

        System.out.println(preorderTraversal(root));
    }
}
