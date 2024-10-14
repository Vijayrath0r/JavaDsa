package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Question257 Binary Tree Paths
 */
public class Question257 {

    private void helper(TreeNode node, StringBuilder s, List<String> result) {
        int len = s.length();
        if (len > 0) {
            s.append("->");
        }
        s = s.append(node.val);

        if (node.left == null && node.right == null) {
            result.add(s.toString());
        } else {
            if (node.left != null) {
                helper(node.left, s, result);
            }
            if (node.right != null) {
                helper(node.right, s, result);
            }
        }
        s.setLength(len);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        helper(root, new StringBuilder(), result);
        return result;
    }

    public static void main(String[] args) {
        Question257 solution = new Question257();
        Integer[] root = {1, 2, 3, null, 5};
        TreeNode tree = TreeNode.createTreeFromArray(root);

        System.out.println(solution.binaryTreePaths(tree));

    }
}
