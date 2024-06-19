package leetcode;

// Binary Tree Inorder Traversal
import java.util.ArrayList;
import java.util.List;

public class Question94 {
    private static void helper(TreeNode node, List<Integer> result) {
        if (node != null) {
            helper(node.left, result);
            result.add(node.val);
            helper(node.right, result);
        }
    }

    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public static void main(String[] args) {
        Integer[] tree = { 1, null, 2, 3 };
        TreeNode rootNew = TreeNode.createTreeFromArray(tree);

        // TreeNode.printTree(rootNew);

        System.out.println(inorderTraversal(rootNew));
    }
}
