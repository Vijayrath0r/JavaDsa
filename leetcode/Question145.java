package leetcode;

// Binary Tree Postorder Traversal
import java.util.ArrayList;
import java.util.List;

public class Question145 {
    private static void helper(TreeNode node, List<Integer> result) {
        if (node != null) {
            helper(node.left, result);
            helper(node.right, result);
            result.add(node.val);
        }
    }

    private static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public static void main(String[] args) {
        Integer[] tree = { 1, null, 2, 3 };
        TreeNode root = TreeNode.createTreeFromArray(tree);
        // TreeNode.printTree(root);

        System.out.println(postorderTraversal(root));
    }
}
